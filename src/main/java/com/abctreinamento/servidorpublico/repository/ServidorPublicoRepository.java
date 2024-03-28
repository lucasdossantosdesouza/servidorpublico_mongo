package com.abctreinamento.servidorpublico.repository;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorPublicoRepository extends MongoRepository<ServidorPublico, String> {
}
