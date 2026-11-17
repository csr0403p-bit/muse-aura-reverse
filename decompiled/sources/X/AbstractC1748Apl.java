package X;

/* renamed from: X.Apl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1748Apl extends AbstractC1439Aj8 implements InterfaceC1237AfR {
    public C1Ny A00;
    public C1Ny A01;

    public C1Ny A00(C1Ny c1Ny) {
        return c1Ny;
    }

    public void A01() {
        this.A01 = A00(this.A00);
        AbstractC1235AfP.A02(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", C2295BSv.A00(this, 22));
    }

    @Override // X.InterfaceC1237AfR
    public final Object AM2() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // X.AbstractC1439Aj8
    public void onAttach() {
        AbstractC1235AfP.A01(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", C2295BSv.A00(this, 23));
        A01();
    }

    @Override // X.AbstractC1439Aj8
    public void onDetach() {
        this.A01 = this.A00;
        AbstractC1235AfP.A02(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", C2295BSv.A00(this, 22));
    }

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        this.A00 = C8lv.A00;
    }

    public AbstractC1748Apl() {
        C1DK c1dk = C8lv.A00;
        this.A00 = c1dk;
        this.A01 = c1dk;
    }
}
