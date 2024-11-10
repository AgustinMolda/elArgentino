package ar.com.El_Argentino.repository;

import ar.com.El_Argentino.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
    public Users findByName(String name);
}
