package ua.jvlab.smlnk;

import java.math.BigInteger;

public class CalculateFactor implements Runnable {
    private int numb;

    public CalculateFactor(int numb) {
        super();
        this.numb = numb;
    }

    public CalculateFactor() {
        super();

    }

    public BigInteger fact (int n){
        BigInteger fc = new BigInteger("1");
        for (int i = 2; i <=n; i++) {
            fc=fc.multiply(new BigInteger(""+i));
        }
        return fc;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 0; i <=this.numb; i++) {
            System.out.println(th.getName()+" "+i+" != "+fact(i));

        }
    }
}

