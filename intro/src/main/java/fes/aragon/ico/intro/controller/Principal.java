package fes.aragon.ico.intro.controller;

import fes.aragon.ico.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;

@Controller
public class Principal {
    @GetMapping("/inicio")
    public String getInicio(Model model) {
        Empleado emp = new Empleado("Juan Perez", 1, "$25000", "Programador", "Desarrollo de Software", "09/10/2002");
        Empleado emp1 = new Empleado("John Doe", 2, "$50000", "Gerente de ventas", "Ventas", "20/08/2000");
        Empleado emp2 = new Empleado("Jane Smith", 3, "$40000", "Analista de datos", "Tecnología", "05/2/1998");
        Empleado emp3 = new Empleado("Mike Johnson", 4, "$60000", "Gerente de operaciones", "Operaciones", "07/12/1995");


        model.addAttribute("empleado", emp);
        model.addAttribute("empleado1", emp1);
        model.addAttribute("empleado2", emp2);
        model.addAttribute("empleado3", emp3);
        return "index";
    }
}
