package cl.mosqueteros.movilidad.Vehiculos;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {


    private final List<TipoTransporte> inventario = new ArrayList<>();

    public VehiculoController() {
        inventario.add(new TipoTransporte(
            "STGO-AUTO-01", 
            "Auto Sedán Toyota Yaris", 
            "disponible", 
            "Av. Libertador Bernardo O'Higgins 1300, Santiago Centro"
        ));

        inventario.add(new TipoTransporte(
            "PROVI-SCOOT-55", 
            "Scooter Eléctrico Xiaomi", 
            "en uso", 
            "Av. Providencia 2000 (cerca de Metro Pedro de Valdivia)"
        ));

        inventario.add(new TipoTransporte(
            "COND-BICI-99", 
            "Bicicleta Eléctrica Ciudad", 
            "disponible", 
            "Av. Apoquindo 4800 (cerca de Escuela Militar)"
        ));

        inventario.add(new TipoTransporte(
            "MAIPU-SUV-12", 
            "SUV Familiar Hyundai Tucson", 
            "mantenimiento", 
            "Av. Pajaritos 1200, Plaza de Maipú"
        ));
    }
    @GetMapping
    public List<TipoTransporte> listarVehiculos() {
        return inventario;
    }

    @PostMapping
    public TipoTransporte agregarVehiculo(@RequestBody TipoTransporte nuevoTransporte) {
        inventario.add(nuevoTransporte);
        return nuevoTransporte;
    }
}