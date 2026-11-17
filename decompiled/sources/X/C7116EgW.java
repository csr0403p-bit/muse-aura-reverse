package X;

/* renamed from: X.EgW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7116EgW implements InterfaceC7005EeA {
    public final C7096Eg2 A00;
    public final C7096Eg2 A01;
    public final Eh7 A02;
    public final C7095Eg1 A03;
    public final InterfaceC7147EhG A04;
    public final C7114EgU A05;
    public final F0C A06;

    public C7116EgW(C7095Eg1 c7095Eg1, C7110EgO c7110EgO) {
        C7114EgU c7114EgU = c7110EgO.A0I;
        InterfaceC7147EhG interfaceC7147EhG = c7110EgO.A0D;
        Eh7 eh7 = c7110EgO.A0B;
        C7096Eg2 c7096Eg2 = c7110EgO.A01;
        C7096Eg2 c7096Eg22 = c7110EgO.A02;
        AnonymousClass005.A11(c7114EgU, interfaceC7147EhG, eh7, 1);
        AnonymousClass003.A0z(c7096Eg2, c7096Eg22);
        this.A03 = c7095Eg1;
        this.A05 = c7114EgU;
        this.A04 = interfaceC7147EhG;
        this.A02 = eh7;
        this.A00 = c7096Eg2;
        this.A01 = c7096Eg22;
        this.A06 = AbstractC5321DgF.A02(C79.A00, new EWq(this, 12));
    }

    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A06.getValue();
    }
}
