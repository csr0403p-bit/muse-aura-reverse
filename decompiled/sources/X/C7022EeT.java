package X;

/* renamed from: X.EeT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7022EeT extends AbstractC7024EeV<C6988Edo, C6988Edo> {
    public boolean A00;
    public final C7051Eex A01;
    public final InterfaceC7029Eea A02;
    public final InterfaceC7006EeD A03;
    public final boolean A04;
    public final /* synthetic */ C7023EeU A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7022EeT(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ2, InterfaceC7029Eea interfaceC7029Eea, boolean z, InterfaceC7006EeD interfaceC7006EeD) {
        super(interfaceC7028EeZ);
        this.A05 = interfaceC7029Eea;
        this.A00 = false;
        this.A02 = interfaceC7028EeZ2;
        Boolean bool = ((C7185Ehv) interfaceC7028EeZ2).A07.A0G;
        this.A04 = bool != null ? bool.booleanValue() : interfaceC7006EeD;
        this.A03 = z;
        this.A01 = new C7051Eex(new C7020EeR(this), interfaceC7029Eea.A01);
        InterfaceC7029Eea.A00(interfaceC7028EeZ2, interfaceC7028EeZ, this, 6);
    }
}
