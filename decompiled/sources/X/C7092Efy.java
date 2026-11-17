package X;

/* renamed from: X.Efy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7092Efy {
    public boolean A02;
    public long A01 = -1;
    public long A00 = -1;

    public final synchronized long A00() {
        return this.A01;
    }

    public final synchronized void A01(long j, long j2) {
        if (this.A02) {
            this.A01 += j;
            this.A00 += j2;
        }
    }
}
