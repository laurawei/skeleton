package controllers;

import api.ReceiptResponse;
import generated.tables.records.ReceiptsRecord;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

import static java.util.stream.Collectors.toList;
@Path("/netid")
public class
NetidController {
    @GET
    public String getID() {
        return "lw567";

    }
}

