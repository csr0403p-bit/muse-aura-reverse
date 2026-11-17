package X;

/* renamed from: X.Bs0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3015Bs0 extends Brz {
    public long A00;
    public boolean A01;
    public final long A02;
    public final long A03;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    public C3015Bs0(long j, long j2, long j3) {
        this.A03 = j3;
        this.A02 = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.A01 = z;
        this.A00 = z ? j : j2;
    }
}
