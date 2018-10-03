package com.drtran.humanreview.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import com.drtran.apicurio.api.UserApi;
import com.drtran.humanreview.repository.UserRepository;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-03T05:12:02.173-04:00[America/New_York]")

@Controller
@RequestMapping("${openapi.humanReview.base-path:/api/v1}")
public class UserApiController implements UserApi {

	private final NativeWebRequest request;

	@Autowired
	private UserRepository user;

	@org.springframework.beans.factory.annotation.Autowired
	public UserApiController(NativeWebRequest request) {
		this.request = request;
	}

	@Override
	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Override
	public ResponseEntity<String> userPut(
			@ApiParam(value = "", defaultValue = "null") @RequestParam(value = "username", required = false) String username,
			@ApiParam(value = "", defaultValue = "null") @RequestParam(value = "password", required = false) String password) {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type", "text/plain");
		String token = "token:" + user.authenticateUser(username, password);
		return ResponseEntity.accepted().headers(headers).body(token);
	}
}
