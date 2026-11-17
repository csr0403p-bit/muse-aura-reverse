package X;

/* loaded from: classes4.dex */
public final class Aeo extends AbstractC1437Aj6 implements InterfaceC1451AjK, C1Z2 {
    public InterfaceC1211Aem A00;
    public final C1506AkD A01;

    public Aeo() {
        C1506AkD c1506AkD = new C1506AkD(true, new BUQ(this, 2), 1);
        A0G(c1506AkD);
        this.A01 = c1506AkD;
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        AbstractC1441AjA.A00(this, new C2335BUj(13, c10543HqvA0z, this));
        InterfaceC1210Ael interfaceC1210Ael = (InterfaceC1210Ael) c10543HqvA0z.element;
        if (this.A01.A03().AOS()) {
            InterfaceC1211Aem interfaceC1211Aem = this.A00;
            if (interfaceC1211Aem != null) {
                interfaceC1211Aem.release();
            }
            this.A00 = interfaceC1210Ael != null ? interfaceC1210Ael.AXt() : null;
        }
    }
}
