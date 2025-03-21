package io.github.ferclager.httpi.controller;

import io.github.ferclager.httpi.client.JokeClient;
import io.github.ferclager.httpi.model.JokeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {
    private JokeClient client;

    public JokeController(final JokeClient client) {
        this.client = client;
    }

    @GetMapping("/joke")
    String getJoke() {
        JokeResponse joke = client.getJoke();
        return joke.id() + ": " + joke.value();
    }
}
