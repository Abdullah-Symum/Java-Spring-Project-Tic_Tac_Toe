package com.springsymum.tictactoe.Controller.DTO;

import com.springsymum.tictactoe.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
