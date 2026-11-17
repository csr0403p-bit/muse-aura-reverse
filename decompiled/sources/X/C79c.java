package X;

import java.util.Map;

/* renamed from: X.79c, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79c implements InterfaceC9730Gej {
    public long A00;
    public int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    @Override // X.InterfaceC9730Gej
    public final boolean A7B() {
        return this.A00 <= this.A02;
    }

    @Override // X.InterfaceC9730Gej
    public final InterfaceC9730Gej A7L() {
        return new C79c(this.A04, this.A03, this.A02);
    }

    @Override // X.InterfaceC9730Gej
    public final long AFQ() {
        return this.A00;
    }

    @Override // X.InterfaceC9730Gej
    public final Map<String, String> AHE() {
        int i = this.A01;
        return C3cH.A0m("billing_client_retry_delay", String.valueOf(i == 1 ? 0L : this.A00), C3cG.A0r("billing_client_retry_type", "backoff"), C3cG.A0r("billing_client_attempts", String.valueOf(i)));
    }

    @Override // X.InterfaceC9730Gej
    public final void AZk() {
        this.A00 *= this.A03;
        this.A01++;
    }

    public C79c(long j, long j2, long j3) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A00 = j;
        this.A01 = 1;
    }

    public C79c() {
        this(1000L, 4L, 16000L);
    }
}
