package com.abctreinamento.servidorpublico.service;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
public interface ServidorPublicoService {

    List<ServidorPublico> listAll() throws IOException;

    Optional<ServidorPublico> listByMatriculaServidorPublico(String id) throws IOException;

    ServidorPublico save(ServidorPublico servidorPublico);
    void update(ServidorPublico servidorPublico);
    void delete(ServidorPublico servidorPublico);

}
