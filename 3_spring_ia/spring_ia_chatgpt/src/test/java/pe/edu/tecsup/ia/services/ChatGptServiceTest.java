package pe.edu.tecsup.ia.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ChatGptServiceTest {

    @Autowired
    ChatGptService chatGptService;

    @Test
    void askQuestion() {

        log.info("Start test");

        String question = "Cuentame un chiste";

        String response = this.chatGptService.askQuestion(question);

        log.info(response);
    }
}