package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class BAs implements B3D {
    public final MutableState A00;
    public final MutableState A01;
    public final C1BO A02;
    public final C1BO A03;
    public final InterfaceC10560Hsz<C6837Eap> A04 = new GAt(null);
    public final C1BO A05;
    public final C1BO A06;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Eap, java.lang.Object] */
    @Override // X.C1BO
    public final /* bridge */ /* synthetic */ C6837Eap getValue() {
        return this.A01.getValue();
    }

    public BAs() {
        AGE age = AGE.A00;
        this.A01 = C3cG.A08(age, null);
        this.A00 = C3cG.A08(age, null);
        this.A06 = AbstractC1798ArH.A02(this, 49);
        this.A02 = AbstractC1798ArH.A02(this, 47);
        this.A05 = AbstractC1798ArH.A02(this, 48);
        this.A03 = new BBP(null, new C2327BUb(this, 0));
    }
}
