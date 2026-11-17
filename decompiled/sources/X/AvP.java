package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AvP extends AbstractC1439Aj8 implements InterfaceC1476Ajj {
    public EnumC1108AYu A00;
    public InterfaceC2046AxI A01;
    public Function0<? extends InterfaceC1129Abd> A02;
    public boolean A03;
    public boolean A04;
    public Ao7 A05;
    public G0U<? super Integer, Boolean> A06;
    public final G0U<Object, Integer> A07 = C2295BSv.A00(this, 38);

    public static final void A00(AvP avP) {
        avP.A05 = new Ao7(avP.A03, C2292BSs.A00(avP, 32), C2292BSs.A00(avP, 33));
        avP.A06 = avP.A04 ? C2295BSv.A00(avP, 39) : null;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+LX/Abd;>;LX/AxI;LX/AYu;ZZ)V */
    public AvP(EnumC1108AYu enumC1108AYu, InterfaceC2046AxI interfaceC2046AxI, Function0 function0, boolean z, boolean z2) {
        this.A02 = function0;
        this.A01 = interfaceC2046AxI;
        this.A00 = enumC1108AYu;
        this.A04 = z;
        this.A03 = z2;
        A00(this);
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        C0920AHw<Ao7> c0920AHw;
        AbstractC1564Ale.A05(interfaceC0857A6e);
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0E, this.A07);
        boolean zA1Z = AnonymousClass002.A1Z(this.A00, EnumC1108AYu.A03);
        Ao7 ao7 = this.A05;
        if (zA1Z) {
            if (ao7 == null) {
                C7384Etj.A0b("scrollAxisRange");
                throw F60.createAndThrow();
            }
            c0920AHw = AbstractC1671Anw.A0i;
        } else {
            if (ao7 == null) {
                C7384Etj.A0b("scrollAxisRange");
                throw F60.createAndThrow();
            }
            c0920AHw = AbstractC1671Anw.A0C;
        }
        interfaceC0857A6e.Aca(c0920AHw, ao7);
        G0U<? super Integer, Boolean> g0u = this.A06;
        if (g0u != null) {
            InterfaceC0857A6e.A00(AbstractC1578Alt.A0N, interfaceC0857A6e, null, g0u);
        }
        InterfaceC0857A6e.A00(AbstractC1578Alt.A07, interfaceC0857A6e, null, new C2326BUa(C2292BSs.A00(this, 34), 2));
        interfaceC0857A6e.Aca(AbstractC1671Anw.A00, this.A01.A6X());
    }
}
