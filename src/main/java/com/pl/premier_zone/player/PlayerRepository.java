package com.pl.premier_zone.player;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

	void deleteByName(String playerName);

	Optional<Player> findByName(String name);

}
