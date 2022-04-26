package aine.example.jokes.Controllers;

import aine.example.jokes.Services.ChuckNorrisJokes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisJokes chuckNorrisJokes;

    public JokesController(ChuckNorrisJokes chuckNorrisJokes) {
        this.chuckNorrisJokes = chuckNorrisJokes;
    }

    @RequestMapping("/")
    public String getJoke() {
        return chuckNorrisJokes.getJoke();
    }
}
