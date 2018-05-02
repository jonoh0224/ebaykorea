package examples.boot.myboard.controller.api;


import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
@Order(1)
@RestController
public class GlobalRestControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){return e.getMessage();}

}
