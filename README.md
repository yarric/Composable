# Composable
Interface for implementing hierarchically composable objects in Java

## Usage
Download the JAR from /dist and use it like

```Java
  import Composable.Composable;
  
  Owner p_m = new Owner();
  Composable p_s = new Owned();
        
  p_s.setPossessor(p_m);
        
  System.out.println(p_s.<Owner>getPossessor().id);  // prints "TheOwner"

```
Where the `Owned` and the `Owner` classes are defined as follows

```Java 


public class Owner {
    public final String id = "TheOwner";
    
    private Composable myPossession;
}

public class Owned implements Composable {
    public final String id = "Possession";
    
    private Object myPossessor;

    @Override
    public <T> void setPossessor(T possessor) {
        this.myPossessor = possessor;
    }

    @Override
    public <T> T getPossessor() {
        return (T)this.myPossessor;
    }
    
}

```
