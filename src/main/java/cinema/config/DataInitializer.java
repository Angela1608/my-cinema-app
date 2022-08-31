package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        roleService.save(new Role(Role.RoleName.ADMIN));
        roleService.save(new Role(Role.RoleName.USER));
        List<Role> roles = roleService.findAll();

        User bob = new User();
        bob.setEmail("bob");
        bob.setPassword("123");
        bob.setRoles(new HashSet<>(roles));
        userService.add(bob);

        User alice = new User();
        alice.setEmail("alice");
        alice.setPassword("12345");
        alice.setRoles(Set.of(roles.get(0)));
        userService.add(alice);
    }
}
