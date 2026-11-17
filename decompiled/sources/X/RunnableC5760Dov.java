package X;

import java.util.Iterator;

/* renamed from: X.Dov, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5760Dov implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$31";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ byte[] A02;

    public RunnableC5760Dov(C5631DmF c5631DmF, byte[] bArr, long j) {
        this.A02 = bArr;
        this.A00 = j;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AUI(this.A02, this.A00);
        }
    }
}
