package X;

import java.util.Iterator;

/* renamed from: X.Dot, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5758Dot implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$25";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ C5919Ds4 A01;

    public RunnableC5758Dot(C5631DmF c5631DmF, C5919Ds4 c5919Ds4) {
        this.A01 = c5919Ds4;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ASi(this.A01);
        }
    }
}
