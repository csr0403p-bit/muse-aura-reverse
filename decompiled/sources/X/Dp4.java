package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dp4 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$12";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Dp4(C5631DmF c5631DmF, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AX8(this.A02, this.A01);
        }
    }
}
