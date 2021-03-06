package examples.boot.myboard.security;

import examples.boot.myboard.domain.User;
import examples.boot.myboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleBoardUserDetailsService implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByEmail(username);

        if(user == null){
            throw new UsernameNotFoundException(username + " not found");
        }

        List<GrantedAuthority> list = new ArrayList<>();
        user.getRoles().forEach(role -> list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName())));

        LoginUserInfo userDetails = new LoginUserInfo(user.getEmail(), user.getPassword(), list);
        userDetails.setId(user.getId());
        userDetails.setName(user.getName());
        return userDetails;
    }
}
