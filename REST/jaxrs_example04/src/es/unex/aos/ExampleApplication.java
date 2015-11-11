package es.unex.aos;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


@ApplicationPath("example")
public class ExampleApplication extends Application{

@Override
public Set<Class<?>> getClasses() {

Set<Class<?>> classes = new HashSet<Class<?>>();

classes.add(Hello.class);

return classes;

}

 

}
