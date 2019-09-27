package org.zurowski.echo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class EchoRestController {

    @DeleteMapping
    @GetMapping
    @PatchMapping
    @PostMapping
    @PutMapping
    @RequestMapping("/echo/request/headers")
    public ResponseEntity<Map<String, List<String>>> echoHeaders(@RequestHeader MultiValueMap<String, String> requestHeaders) {
        return ResponseEntity.ok(requestHeaders);
    }

    @DeleteMapping
    @GetMapping
    @PatchMapping
    @PostMapping
    @PutMapping
    @RequestMapping(value = "/echo/request/cookies")
    public ResponseEntity<Cookie[]> echoRequest(HttpServletRequest request) {
        return ResponseEntity.ok(request.getCookies());
    }

    @DeleteMapping
    @GetMapping
    @PatchMapping
    @PostMapping
    @PutMapping
    @RequestMapping(value = "/echo/request/body", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> echoRequestBody(@RequestBody String body) {
        return ResponseEntity.ok(body);
    }

}
