package br.com.raloliver.ralmeet;

import br.com.raloliver.ralmeet.api.facade.RoomsApi;
import br.com.raloliver.ralmeet.api.model.Room;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

@RestController
public class RoomController implements RoomsApi {
    @Override
    public CompletableFuture<ResponseEntity<Room>> listRooms(@Valid Long id) {
        Room room = new Room().id(1L).name("Room #0");

        return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(room));
    }
}
