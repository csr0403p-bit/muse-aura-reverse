package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class Aen extends AbstractC1437Aj6 implements InterfaceC1476Ajj, InterfaceC1237AfR, InterfaceC1487Aju, InterfaceC1451AjK, C1Z2 {
    public static final C1215Aet A06 = new C1215Aet();
    public C04891Xs A00;
    public InterfaceC1072AWd A01;
    public InterfaceC1497Ak4 A02;
    public InterfaceC1211Aem A03;
    public final InterfaceC1214Aes A04;
    public final G0U<Boolean, Unit> A05;

    public static final void A00(Aen aen, InterfaceC04911Xu interfaceC04911Xu, InterfaceC1072AWd interfaceC1072AWd) {
        if (!aen.isAttached) {
            C8j3.A1J(interfaceC1072AWd, interfaceC04911Xu);
            return;
        }
        HoC hoC = (HoC) aen.getCoroutineScope().AEA().get(HoC.A00);
        AnonymousClass001.A1J(new BUC(interfaceC1072AWd, interfaceC04911Xu, hoC != null ? hoC.AO5(BTA.A01(interfaceC04911Xu, interfaceC1072AWd, 15)) : null, (AMS<AMN>) null, (HtJ<? super BUC>) 4), aen.getCoroutineScope());
    }

    public final void A0I(InterfaceC1072AWd interfaceC1072AWd) {
        C04891Xs c04891Xs;
        if (C7384Etj.areEqual(this.A01, interfaceC1072AWd)) {
            return;
        }
        InterfaceC1072AWd interfaceC1072AWd2 = this.A01;
        if (interfaceC1072AWd2 != null && (c04891Xs = this.A00) != null) {
            C8j3.A1J(interfaceC1072AWd2, new C1wG(c04891Xs));
        }
        this.A00 = null;
        this.A01 = interfaceC1072AWd;
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        InterfaceC0857A6e.A01(AbstractC1671Anw.A09, interfaceC0857A6e, ((C1506AkD) this.A04).A03().AOS());
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0K, interfaceC0857A6e, null, new BUO(this, 0));
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1237AfR
    public final Object AM2() {
        return A06;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        InterfaceC1497Ak4 interfaceC1497Ak42;
        this.A02 = interfaceC1497Ak4;
        if (((C1506AkD) this.A04).A03().AOS()) {
            if ((!interfaceC1497Ak4.isAttached() || ((interfaceC1497Ak42 = this.A02) != null && interfaceC1497Ak42.isAttached())) && this.isAttached) {
                AbstractC1235AfP.A00(this, AbstractC1213Aer.A00);
            }
        }
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        InterfaceC1211Aem interfaceC1211Aem = this.A03;
        if (interfaceC1211Aem != null) {
            interfaceC1211Aem.release();
        }
        this.A03 = null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AWd;ILX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;)V */
    public Aen(InterfaceC1072AWd interfaceC1072AWd, G0U g0u, int i) {
        this.A01 = interfaceC1072AWd;
        this.A05 = g0u;
        C1506AkD c1506AkD = new C1506AkD(false, new BUQ(this, 0), i);
        A0G(c1506AkD);
        this.A04 = c1506AkD;
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        AbstractC1441AjA.A00(this, new BTB(3, c10543HqvA0z, this));
        InterfaceC1210Ael interfaceC1210Ael = (InterfaceC1210Ael) c10543HqvA0z.element;
        if (((C1506AkD) this.A04).A03().AOS()) {
            InterfaceC1211Aem interfaceC1211Aem = this.A03;
            if (interfaceC1211Aem != null) {
                interfaceC1211Aem.release();
            }
            this.A03 = interfaceC1210Ael != null ? interfaceC1210Ael.AXt() : null;
        }
    }
}
