package org.opendevup.dao;

import org.opendevup.entities.Societe;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long> {
    
}