package br.com.raloliver.ralmeet;

import br.com.raloliver.ralmeet.api.facade.RoomsApi;
import br.com.raloliver.ralmeet.api.model.Room;
import java.util.concurrent.CompletableFuture;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController implements RoomsApi {

  @Override
  public CompletableFuture<ResponseEntity<Room>> listRooms(@Valid Long id) {
    Room room = new Room().id(1L).name("Room #0");

    return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(room));
  }
}
