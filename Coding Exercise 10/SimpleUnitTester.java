import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class SimpleUnitTester {
    
    public int execute(Class clazz) throws Exception {
        int failedCount = 0;
        // first find the correct constructor needed to invoke the methods
        Constructor<Reflection> reflectionConstructor = clazz.getDeclaredConstructor();
        //@SuppressWarnings("unchecked")
        // then create the instance
        Reflection reflection = reflectionConstructor.newInstance();
        
        // now get the particular method by passing its name and its arguments too
        Method m = clazz.getDeclaredMethod("testA");
        // now invoke the method by passing the values in the correct position
        Object result = m.invoke(reflection);
        if(((Boolean)result).booleanValue()==false)
            failedCount++;

        m = clazz.getDeclaredMethod("testB");
        result = m.invoke(reflection);
        if(((Boolean)result).booleanValue()==false)
            failedCount++;

        m = clazz.getDeclaredMethod("testC");
        result = m.invoke(reflection);
        if(((Boolean)result).booleanValue()==false)
            failedCount++;

        m = clazz.getDeclaredMethod("testD");
        result = m.invoke(reflection);
        if(((Boolean)result).booleanValue()==false)
            failedCount++;

        m = clazz.getDeclaredMethod("testE");
        result = m.invoke(reflection);
        if(((Boolean)result).booleanValue()==false)
            failedCount++;

        return failedCount;
    }
    
}