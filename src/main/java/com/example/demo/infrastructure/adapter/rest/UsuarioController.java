package com.example.demo.infrastructure.adapter.rest;

import com.example.demo.application.port.in.UsuarioUseCase;
import com.example.demo.domain.model.LoginRequest;
import com.example.demo.domain.model.Usuario;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lm-carlos
 */
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioUseCase usuarioUseCase;

    public UsuarioController(UsuarioUseCase usuarioUseCase) {
        this.usuarioUseCase = usuarioUseCase;
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioUseCase.listarTodos();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioUseCase.buscarPorId(id);
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioUseCase.guardar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioUseCase.eliminar(id);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(
            @PathVariable Long id,
            @RequestBody Usuario usuario) {

        usuario.setId(id);

        return usuarioUseCase.guardar(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(
            @RequestBody LoginRequest login) {

        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());

        Map<String, String> respuesta = new HashMap<>();

        Optional<Usuario> usuario
                = usuarioUseCase.login(
                        login.getUsername(),
                        login.getPassword());

        if (usuario.isPresent()) {

            respuesta.put(
                    "mensaje",
                    "Login exitoso");

            respuesta.put(
                    "usuario",
                    usuario.get().getNombre());

            return ResponseEntity.ok(respuesta);
        }

        respuesta.put(
                "mensaje",
                "Usuario o contraseña incorrectos");

        return ResponseEntity.status(401)
                .body(respuesta);
    }

}
