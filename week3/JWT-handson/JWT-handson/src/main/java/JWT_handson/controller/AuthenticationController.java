package JWT_handson.controller;

import JWT_handson.model.AuthenticationRequest;
import JWT_handson.model.AuthenticationResponse;
import JWT_handson.service.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request) {

        String token = jwtUtil.generateToken(request.getUsername());

        return new AuthenticationResponse(token);

    }
}