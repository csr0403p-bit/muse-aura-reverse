package X;

/* renamed from: X.DrG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5880DrG {
    public long A01;
    public final long A03;
    public long A00 = -1;
    public long A02 = -1;

    public C5880DrG(long j) {
        this.A03 = j;
        if (j <= 0) {
            throw C60O.A0i("timeoutMs must be positive");
        }
    }
}
