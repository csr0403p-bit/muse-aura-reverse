package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes5.dex */
public abstract class CWU {
    public static final Thread A03;
    public static final CWV A01 = new CWV();
    public static final ReferenceQueue A02 = new ReferenceQueue();
    public static final CWW A00 = new CWW();

    static {
        CWT cwt = new CWT();
        A03 = cwt;
        cwt.start();
    }
}
