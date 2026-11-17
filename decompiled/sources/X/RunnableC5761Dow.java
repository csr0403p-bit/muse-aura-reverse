package X;

import java.util.Iterator;

/* renamed from: X.Dow, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5761Dow implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$36";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5631DmF A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public RunnableC5761Dow(C5631DmF c5631DmF, String str, byte[] bArr, long j, long j2) {
        this.A04 = bArr;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A02);
        while (itA00.hasNext()) {
            ((InterfaceC5756Dor) itA00.next()).ATq(this.A04, this.A03, this.A00, this.A01);
        }
    }
}
