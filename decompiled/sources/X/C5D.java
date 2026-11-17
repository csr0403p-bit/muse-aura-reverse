package X;

/* loaded from: classes5.dex */
public final class C5D implements InterfaceC3236C4t {
    public boolean A00;
    public final InterfaceC3236C4t A01;

    @Override // X.InterfaceC3236C4t
    public final void AUN(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        this.A01.AUN(enumC3223C4g, interfaceC3235C4s);
    }

    public C5D(InterfaceC3236C4t interfaceC3236C4t) {
        this.A01 = interfaceC3236C4t;
    }
}
