package cinema.dao;

import cinema.model.Role;
import java.util.List;
import java.util.Optional;

public interface RoleDao {
    Role save(Role role);

    Optional<Role> getRoleByName(String roleName);

    List<Role> findAll();
}
