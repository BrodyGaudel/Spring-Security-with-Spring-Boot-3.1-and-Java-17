package com.brody.security.services;

import com.brody.security.models.AuthenticationRequest;
import com.brody.security.models.AuthenticationResponse;
import com.brody.security.models.RegisterRequest;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);

}
