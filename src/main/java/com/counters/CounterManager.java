package com.counters;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Root resource (exposed at "countermanager" path)
 */
@Path("countermanager")
public class CounterManager {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello from counter manager!";
    }



    @GET
    @Path("/incrementcountervalue/{counterName}")
    @Produces(MediaType.TEXT_PLAIN)
    public String incrementCounterValue(@PathParam("counterName") String counterName) {
        /*try {
            // First search this counter name into counters json object
            // if it is already there then increment its value by 1
            if (jsonCounters.has(counterName)) {
                jsonCounters.increment(counterName);
            } else {
                jsonCounters.put(counterName, new Long(1));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }*/

        return counterName;        
    }

    @GET
    @Path("/getcountervalue/{counterName}")
    @Produces(MediaType.TEXT_PLAIN)
    public int getCounterValue(@PathParam("counterName") String counterName) { 
        /*try {
            // return the counter value 
            return jsonCounters.getInt(counterName);
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }*/

        return 1;
    }


    @GET @Path("/getallcounters")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCounters() {
        //return jsonCounters.toString();

        return "getAllCounters";
    }
}
