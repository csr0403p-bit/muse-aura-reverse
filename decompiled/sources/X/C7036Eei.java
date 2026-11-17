package X;

/* renamed from: X.Eei, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7036Eei<T> implements InterfaceC7015EeM<T> {
    public final InterfaceC7015EeM<T> A00;
    public final C7037Eej A01;

    public C7036Eei(InterfaceC7015EeM interfaceC7015EeM, C7037Eej c7037Eej) {
        this.A00 = interfaceC7015EeM;
        this.A01 = c7037Eej;
    }

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<T> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        C7110EgO c7110EgOAGL;
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        C7267Ejs.A00();
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        InterfaceC7027EeY interfaceC7027EeY = c7185Ehv.A05;
        if (interfaceC7029Eea instanceof C7185Ehv) {
            c7110EgOAGL = c7185Ehv.A04;
        } else {
            try {
                c7110EgOAGL = interfaceC7029Eea.AGL();
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (c7110EgOAGL != null && (!AnonymousClass003.A1Y(c7110EgOAGL.A0E.A04))) {
            interfaceC7027EeY.AV6(interfaceC7029Eea, "BackgroundThreadHandoffProducer");
            interfaceC7027EeY.AV4(interfaceC7029Eea, "BackgroundThreadHandoffProducer", null);
            this.A00.AYc(interfaceC7028EeZ, interfaceC7029Eea);
            return;
        }
        C7035Eeh c7035Eeh = new C7035Eeh(interfaceC7028EeZ, interfaceC7029Eea, interfaceC7027EeY, this);
        InterfaceC7029Eea.A00(interfaceC7029Eea, this, c7035Eeh, 7);
        C7037Eej c7037Eej = this.A01;
        synchronized (c7037Eej) {
            c7037Eej.A01.execute(c7035Eeh);
        }
    }
}
