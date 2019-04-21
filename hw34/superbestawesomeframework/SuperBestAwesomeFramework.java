package com.company.superbestawesomeframework;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SuperBestAwesomeFramework{
    static <T> List<T> getMany(Class<T> c, int count){
        List<T> l = new ArrayList<>();
        try{
            for(int i = 0; i < count; i++){
                T o = c.newInstance();
                l.add(o);
            }
        } catch(InstantiationException | IllegalAccessException e){
            throw new IllegalStateException(e);
        }
        return l;
    }

    static <T> List<T> getManyWithCons(Class<T> c, int count, Object... params){
        List<T> result = new ArrayList<>();
        List<Constructor<?>> constructors = Arrays.stream(c.getConstructors()).collect(Collectors.toList());
        List<String> paramss = Arrays.stream(params).map(Object::getClass).map(Class::getName).collect(Collectors.toList());
        int j = -1;
        for(int i = 0; i < constructors.size(); i++){
            Constructor<?> C = constructors.get(i);
            List<Class<?>> cons = Arrays.stream(C.getParameterTypes()).collect(Collectors.toList());
            if(paramss.size() == cons.size()){
                List<String> classNames = cons.stream().map(param->{
                    if(param.isPrimitive()){
                        String s = param.getTypeName();
                        switch(s){
                            case "int":
                                return "java.lang.Integer";
                            case "double":
                                return "java.lang.Double";
                            case "boolean":
                                return "java.lang.Boolean";
                            case "short":
                                return "java.lang.Short";
                            case "long":
                                return "java.lang.Long";
                            case "byte":
                                return "java.lang.Byte";
                            case "float":
                                return "java.lang.Float";
                            case "char":
                                return "java.lang.Character";
                        }
                    } else{
                        return param.getName();
                    }
                    return null;
                }).collect(Collectors.toList());
                System.out.println(classNames);
                if(classNames.equals(paramss)) j = i;
            }
        }
        if(j == -1)
            throw new IllegalStateException("not find constructor with such parameters");
        try{
            for(int i = 0; i < count; i++){
                T temp = (T)constructors.get(j).newInstance(params);
                result.add(temp);
            }
        } catch(Exception e){
            throw new IllegalStateException(e);
        }
        return result;
    }
}
