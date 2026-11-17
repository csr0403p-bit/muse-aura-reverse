package X;

import java.util.Iterator;

/* renamed from: X.Dom, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5751Dom implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$16";
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C5631DmF A03;

    public RunnableC5751Dom(C5631DmF c5631DmF, float f, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
        this.A03 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A03);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AXG(this.A02, this.A01, this.A00);
        }
    }
}
