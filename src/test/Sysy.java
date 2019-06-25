package test;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Sysy {
    private Map<String, String> i;
    private AtomicInteger j;
    private Integer aaaa;

    public Map<String, String> getI() {
        return i;
    }

    public void setI(Map<String, String> i) {
        this.i = i;
    }

    public AtomicInteger getJ() {
        return j;
    }

    public void setJ(AtomicInteger j) {
        this.j = j;
    }

    public Integer getAaaa() {
        return aaaa;
    }

    public void setAaaa(Integer aaaa) {
        this.aaaa = aaaa;
    }

    @Override
    public String toString() {
        return "Sysy [i=" + i.toString() + "]";
    }

    
}
