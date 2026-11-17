package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public abstract class EUZ {
    public static final Thread A03;
    public static final EUb A01 = new EUb();
    public static final ReferenceQueue A02 = new ReferenceQueue();
    public static final EUa A00 = new EUa();

    static {
        EUY euy = new EUY();
        A03 = euy;
        euy.start();
    }
}
