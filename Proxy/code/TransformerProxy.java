package code;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransformerProxy {
  private Robot YellowBee = new Transform();

  public Robot getProxy() {
    return (Robot) Proxy.newProxyInstance(TransformerProxy.class.getClassLoader(), YellowBee.getClass().getInterfaces(),
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // TODO Auto-generated method stub
            if (method.getName().equals("fire")) {
              System.out.println("let hime load first");
              return method.invoke(YellowBee, args);
            }
            if (method.getName().equals("move")) {
              System.out.println("engine start!");
              return method.invoke(YellowBee, args);
            }
            return null;
          }
        });
  }
}
