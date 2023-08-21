package br.com.fran.descomplica.filmeflix.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO<T> {

    private String mensagem;
    private T data;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    @Builder.Default
    private LocalDateTime dataHora = LocalDateTime.now();

    public ResponseDTO(String mensagem, T data) {
        this.mensagem = mensagem;
        this.data = data;
        this.dataHora = LocalDateTime.now();
    }

}
