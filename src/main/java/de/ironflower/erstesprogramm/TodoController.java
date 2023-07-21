package de.ironflower.erstesprogramm;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TodoController {
    @GetMapping("/greet")
    public ResponseEntity<String> hello(@RequestParam(value = "name") String name){
        return new ResponseEntity<String>("Hallo "+ name, HttpStatus.OK);
    }
}
