package at.feiertag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;


@Path("/api/uptime")
public class UptimeController {

    @GET
    @Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUptime(@PathParam("uptime") double uptime) {
        double minutesOfMonth = 60 * 24 * 30;
        double definedUptimeInPercent = uptime / 100;
        double uptimeInMinutes = minutesOfMonth * definedUptimeInPercent;
        return String.format("%.2f", uptimeInMinutes);
    }
    //default - falls kein Input
    @GET
    public String calculateUptime() {
        return this.calculateUptime(99.95);
    }
}