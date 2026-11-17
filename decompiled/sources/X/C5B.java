package X;

/* loaded from: classes5.dex */
public final class C5B implements InterfaceC3236C4t {
    public final /* synthetic */ C3232C4p A00;
    public final /* synthetic */ C5C A01;
    public final /* synthetic */ C5E A02;
    public final /* synthetic */ C3241C4y A03;

    public C5B(C3232C4p c3232C4p, C5C c5c, C5E c5e, C3241C4y c3241C4y) {
        this.A02 = c5e;
        this.A03 = c3241C4y;
        this.A00 = c3232C4p;
        this.A01 = c5c;
    }

    @Override // X.InterfaceC3236C4t
    public final void AUN(EnumC3223C4g enumC3223C4g, InterfaceC3235C4s interfaceC3235C4s) {
        InterfaceC3231C4o interfaceC3231C4o = (InterfaceC3231C4o) this.A02.create2(this.A03);
        if (interfaceC3231C4o != null) {
            C3232C4p c3232C4p = this.A00;
            interfaceC3235C4s.getClass();
            c3232C4p.A04(interfaceC3231C4o, EnumC3223C4g.LARGE_REPORT, interfaceC3235C4s);
        }
    }
}
