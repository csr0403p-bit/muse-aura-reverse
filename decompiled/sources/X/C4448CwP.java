package X;

/* renamed from: X.CwP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4448CwP {
    public final InterfaceC7539F0o A00;
    public final DK9 A01;

    public final long A00(EuR euR) {
        long jNow = this.A00.now();
        long jNow2 = this.A01.now();
        long elapsedRealtimeNanos = euR.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos != 0) {
            return (((jNow2 * 1000000) - elapsedRealtimeNanos) + 500000) / 1000000;
        }
        if (euR.A01() != null) {
            return jNow - euR.A01().longValue();
        }
        return Long.MIN_VALUE;
    }

    public C4448CwP(InterfaceC7539F0o interfaceC7539F0o, DK9 dk9) {
        this.A00 = interfaceC7539F0o;
        this.A01 = dk9;
    }
}
