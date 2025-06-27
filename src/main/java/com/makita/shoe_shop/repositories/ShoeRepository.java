package com.makita.shoe_shop.repositories;


import com.makita.shoe_shop.model.ShoeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ShoeRepository extends JpaRepository<ShoeEntity, UUID> {
}
