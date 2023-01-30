package org.mycompany.myproduct;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mycompany.myproduct.Models.Entity.MVP;
import org.mycompany.myproduct.Models.Repository.MvpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

@DataJpaTest
public class TestController {

    @Autowired
    private MvpRepository mvpRepository;

    private MVP mvp;

    @DisplayName("Test para guardar un mvp")
    @Test
    void testGuardarMvp(){
        //given - dado o condición previa o configuración
        MVP emp1 = MVP.builder()
                .idMvp("test")
                .location("test")
                .nameProject("test")
                .startDate(null)
                .endDate(null)
                .costCenter("test")
                .bubget("test")
                .stakeHolder("Test")
                .productOwner("test")
                .build();

        //when - acción o el comportamiento que vamos a probar
            MVP mvpGuardado = mvpRepository.save(emp1);

        //then - verificar la salida
        assertThat(mvpGuardado).isNotNull();
        assertThat(mvpGuardado.getId()).isGreaterThan(0);
    }

}
