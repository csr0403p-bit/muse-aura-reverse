package X;

import java.util.Observable;

/* loaded from: classes5.dex */
public final class EVh extends C3016Bs3 {
    public AbstractC5306Dfp<VMResult> A00;
    public InterfaceC6696EVt A01;
    public final /* synthetic */ EVi A02;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0D(AbstractC5306Dfp abstractC5306Dfp, Integer num) {
        Bs2 bs2;
        C6693EVo c6693EVo = new C6693EVo(num, null, null);
        Object obj = this.A00;
        if (obj != null && (bs2 = (Bs2) ((C3016Bs3) this).A00.A01(obj)) != null) {
            bs2.A01.A07(bs2);
        }
        this.A00 = abstractC5306Dfp;
        if (abstractC5306Dfp != null) {
            A0B(abstractC5306Dfp, new EVg(this, c6693EVo));
        }
    }

    public EVh(EVi eVi) {
        this.A02 = eVi;
    }

    public final void A0C() {
        InterfaceC6696EVt interfaceC6696EVt = this.A01;
        if (interfaceC6696EVt != null) {
            Observable observable = ((C6694EVp) interfaceC6696EVt).A00;
            EVj eVj = new EVj();
            eVj.A00 = this;
            observable.deleteObserver(eVj);
        }
    }

    @Override // X.C3016Bs3, X.AbstractC5306Dfp
    public final void A03() {
        super.A03();
        InterfaceC6696EVt interfaceC6696EVt = this.A01;
        if (interfaceC6696EVt != null) {
            Observable observable = ((C6694EVp) interfaceC6696EVt).A00;
            EVj eVj = new EVj();
            eVj.A00 = this;
            observable.addObserver(eVj);
        }
    }

    @Override // X.C3016Bs3, X.AbstractC5306Dfp
    public final void A04() {
        super.A04();
        A0C();
    }
}
