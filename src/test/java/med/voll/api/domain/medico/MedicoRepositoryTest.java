//package med.voll.api.domain.medico;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.time.DayOfWeek;
//import java.time.LocalDateTime;
//import java.time.temporal.TemporalAdjusters;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@ActiveProfiles("test")
//class MedicoRepositoryTest {
//
//    @Autowired
//    private MedicoRepository medicoRepository;
//
//    @Test
//    @DisplayName("Deveria devolver null quando unico medico cadastrado nao esta disponivel na data")
//    void escolherMedicoAleatorioLivreNaDataCenario1() {
//        var proximaSegundaAs10 = LocalDateTime.now()
//                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
//                .withHour(10)
//                .withMinute(0);
//
//
//        var medicoLivre = medicoRepository.escolherMedicoAleatorioLivreNaData(Especialidade.CARDIOLOGIA, proximaSegundaAs10);
//        assertThat(medicoLivre).isNull();
//    }
//}