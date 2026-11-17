package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dp0 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$43";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ byte[] A01;

    public Dp0(C5631DmF c5631DmF, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AUK(this.A01);
        }
    }
}
