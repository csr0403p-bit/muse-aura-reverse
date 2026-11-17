package X;

/* renamed from: X.Eis, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7228Eis implements Ejq {
    public Ejq A00;
    public G0U<? super Ejq, ? extends InterfaceC7005EeA<InterfaceC7236Ej0<EfF<InterfaceC7064EfB>>>> A01;
    public final C7234Eiy<EfF<InterfaceC7064EfB>> A02;

    public static final void A00(C7228Eis c7228Eis, Ejq ejq, boolean z) {
        C7384Etj.A0Y(ejq, 0);
        if (z || !c7228Eis.A00.equals(ejq)) {
            c7228Eis.A00 = ejq;
            G0U<? super Ejq, ? extends InterfaceC7005EeA<InterfaceC7236Ej0<EfF<InterfaceC7064EfB>>>> g0u = c7228Eis.A01;
            if (g0u != null) {
                C7234Eiy<EfF<InterfaceC7064EfB>> c7234Eiy = c7228Eis.A02;
                InterfaceC7005EeA<InterfaceC7236Ej0<T>> interfaceC7005EeA = (InterfaceC7005EeA) g0u.invoke(ejq);
                c7234Eiy.A00 = interfaceC7005EeA;
                for (C7229Eit c7229Eit : c7234Eiy.A01) {
                    if (!c7229Eit.A05()) {
                        c7229Eit.A08(interfaceC7005EeA);
                    }
                }
            }
        }
    }

    public /* synthetic */ C7228Eis(Ejq ejq) {
        C7234Eiy<EfF<InterfaceC7064EfB>> c7234Eiy = new C7234Eiy<>();
        C7384Etj.A0Y(ejq, 0);
        this.A00 = ejq;
        this.A02 = c7234Eiy;
    }

    @Override // X.Ejq
    public final String ADg() {
        return "RetainingImageSource";
    }

    public C7228Eis() {
        B1C b1c = B15.A01;
        C7234Eiy<EfF<InterfaceC7064EfB>> c7234Eiy = new C7234Eiy<>();
        this.A00 = b1c;
        this.A02 = c7234Eiy;
    }
}
