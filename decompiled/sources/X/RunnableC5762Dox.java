package X;

import java.util.Iterator;

/* renamed from: X.Dox, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5762Dox implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$37";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public RunnableC5762Dox(C5631DmF c5631DmF, String str, byte[] bArr, long j) {
        this.A03 = bArr;
        this.A02 = str;
        this.A00 = j;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).onImfEventEmsgReceived(this.A03, this.A02, this.A00);
        }
    }
}
