package play.bingo.game.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import play.bingo.game.GameApplication;
import play.bingo.game.model.Player;

@AutoConfigureMockMvc
@SpringBootTest( 
    webEnvironment = SpringBootTest.WebEnvironment.MOCK ,
    classes = {GameApplication.class})
//@ActiveProfiles({"test", "integration-test"})
public class PlayerIntegrationTest {

    @Autowired
    PlayerRepository playerRepository;

    @Test
    void TestPlayer(){
        Player player = new Player("Ketleen");
        playerRepository.save(player);
        assertThat(playerRepository).isNotNull();
    }


}
