package com.abctreinamento.servidorpublico.service.impl;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import com.abctreinamento.servidorpublico.repository.ServidorPublicoRepository;
import com.abctreinamento.servidorpublico.service.ServidorPublicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ServidorPublicoServiceImpl implements ServidorPublicoService {

    @Autowired
    private ServidorPublicoRepository servidorPublicoRepository;
    @Override
    public List<ServidorPublico> listAll() throws IOException {
        return servidorPublicoRepository.findAll();
    }

    @Override
    public Optional<ServidorPublico> listByMatriculaServidorPublico(String id) throws IOException {
        return servidorPublicoRepository.findById(id);
    }

    @Override
    public ServidorPublico save(ServidorPublico servidorPublico) {
        return servidorPublicoRepository.save(servidorPublico);
    }

    @Override
    public void update(ServidorPublico servidorPublico) {
        servidorPublicoRepository.save(servidorPublico);
    }

    @Override
    public void delete(ServidorPublico servidorPublico) {
        servidorPublicoRepository.delete(servidorPublico);
    }
}
