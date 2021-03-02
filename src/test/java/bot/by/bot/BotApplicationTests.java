package bot.by.bot;

import bot.by.bot.config.Mapper;
import bot.by.bot.service.MessageService;
import bot.by.bot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class BotApplicationTests {

	@Test
	void contextLoads() {
	}

}
