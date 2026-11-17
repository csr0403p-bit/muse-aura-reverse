package X;

import java.util.concurrent.Executor;

/* renamed from: X.EeU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7023EeU implements InterfaceC7015EeM<C6988Edo> {
    public final C7011EeI A00;
    public final Executor A01;
    public final InterfaceC7015EeM<C6988Edo> A02;
    public final InterfaceC7006EeD A03;
    public final boolean A04;

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        this.A02.AYc(new C7022EeT(interfaceC7028EeZ, interfaceC7029Eea, this, this.A03, this.A04), interfaceC7029Eea);
    }

    public C7023EeU(C7011EeI c7011EeI, InterfaceC7015EeM interfaceC7015EeM, InterfaceC7006EeD interfaceC7006EeD, Executor executor, boolean z) {
        this.A01 = executor;
        this.A00 = c7011EeI;
        this.A02 = interfaceC7015EeM;
        this.A03 = interfaceC7006EeD;
        this.A04 = z;
    }
}
