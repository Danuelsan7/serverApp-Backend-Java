package io.getarrays.server.repo;

import io.getarrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {

    //se interpreta por nombre de método y el parámetro debe exisitir en la BD
    Server findByIpAddress(String ipAddress);

}
