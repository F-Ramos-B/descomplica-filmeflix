package br.com.fran.descomplica.filmeflix.util;

import java.time.LocalDate;
import java.time.Period;

public interface IIdade {
    
    LocalDate getDataNascimento();
    
    default int getIdade() {
        return Period.between(getDataNascimento(), LocalDate.now()).getYears();
    }
    
}
