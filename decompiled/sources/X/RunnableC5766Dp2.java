package X;

import java.util.Iterator;

/* renamed from: X.Dp2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5766Dp2 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$4";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ C5623Dm6 A01;
    public final /* synthetic */ String A02;

    public RunnableC5766Dp2(C5631DmF c5631DmF, C5623Dm6 c5623Dm6, String str) {
        this.A01 = c5623Dm6;
        this.A02 = str;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AUw(this.A01, this.A02);
        }
    }
}
