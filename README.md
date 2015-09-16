# countersHandlerRESTService
This is a Maven projects which consists of a simple Jersey REST service. This REST service manages different counter values.

This projects has been deployed on heruko,
http://counters-webapp.herokuapp.com/countermanager/

It exposes three REST APIs,
1. incrementcountervalue: Increments a given counter value. It expects counter name as input parameter. 
  If that counter is already present in the list of counters at server side, it increments its value by 1, otherwise
  it add one new (provided) counter in the list of counters and initializes its value with 1.
  
  The URL for this API is
  http://counters-webapp.herokuapp.com/countermanager/incrementcountervalue/{counter-name}
  eg. http://counters-webapp.herokuapp.com/countermanager/incrementcountervalue/alpha
  
2. getcountervalue: Returns the value of input counter value
  The URL for this API is,
  http://counters-webapp.herokuapp.com/countermanager/getcountervalue/{counter-name}
  eg. http://counters-webapp.herokuapp.com/countermanager/getcountervalue/alpha
  
3. getallcounters: Return list of all counters and their respective value as a JSON object.
  The URL for this API is,
  http://counters-webapp.herokuapp.com/countermanager/getallcounters
