package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public abstract class Bs6 {
    public static final ExecutorService A00;
    public static final ThreadFactory A01;

    static {
        Bs5 bs5 = Bs5.A00;
        A01 = bs5;
        A00 = Executors.newCachedThreadPool(bs5);
    }
}
