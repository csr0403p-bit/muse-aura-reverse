package X;

import java.util.Map;

/* renamed from: X.79d, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79d implements InterfaceC9730Gej {
    public int A00;
    public final int A01;

    @Override // X.InterfaceC9730Gej
    public final boolean A7B() {
        return AnonymousClass002.A1N(this.A00);
    }

    @Override // X.InterfaceC9730Gej
    public final InterfaceC9730Gej A7L() {
        return new C79d(this.A01);
    }

    @Override // X.InterfaceC9730Gej
    public final long AFQ() {
        return 0L;
    }

    @Override // X.InterfaceC9730Gej
    public final Map<String, String> AHE() {
        return AnonymousClass007.A0d("billing_client_attempts", String.valueOf((this.A01 - this.A00) + 1), C3cG.A0r("billing_client_retry_type", "simple"));
    }

    @Override // X.InterfaceC9730Gej
    public final void AZk() {
        this.A00--;
    }

    public C79d(int i) {
        this.A01 = i;
        this.A00 = i;
    }

    public C79d() {
        this(3);
    }
}
