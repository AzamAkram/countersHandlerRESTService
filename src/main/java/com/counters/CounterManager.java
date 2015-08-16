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

    /*
    * A JSONObject is an unordered collection of name/value pairs.
    * http://www.json.org/javadoc/org/json/JSONObject.html
    */

    private static JSONObject jsonCounters = new JSONObject();

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
    public void incrementCounterValue(@PathParam("counterName") String counterName) throws JSONException {
        /*
        * First search this counter name into counters json object,
        *  if it is already there then increment its value by 1
        * has() returns true if the key exists in the JSONObject.
        */
        if (jsonCounters.has(counterName)) {
            jsonCounters.increment(counterName);
        } else {
            // If not present in the list, add it and starts its value form 1
            jsonCounters.put(counterName, new Long(1));
        }
    }

    @GET
    @Path("/getcountervalue/{counterName}")
    @Produces(MediaType.TEXT_PLAIN)
    public int getCounterValue(@PathParam("counterName") String counterName) throws JSONException {
        // throws exception if the key is not found or if the value cannot be converted to an integer.
        return jsonCounters.getInt(counterName);
    }

    @GET @Path("/getallcounters")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllCounters() {
        return jsonCounters.toString();
    }
}
