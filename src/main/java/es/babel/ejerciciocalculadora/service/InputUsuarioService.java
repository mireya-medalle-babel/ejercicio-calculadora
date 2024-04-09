package es.babel.ejerciciocalculadora.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class InputUsuarioService implements IInputUsuarioService {
    public int operacionEscogida(Scanner sc) {
        return sc.nextInt();
    }

    public int introducirNumero(Scanner sc) {
        return sc.nextInt();
    }
}
