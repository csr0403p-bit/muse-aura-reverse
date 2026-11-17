package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class B33 implements C18j {
    public final C5WW A00;
    public final MutableState A01;
    public final MutableState A02;
    public final MutableState A03;
    public final MutableState A04;
    public final MutableState A05;
    public final MutableState A06;
    public final MutableState A07;
    public final MutableState A08;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final C1BO A0C;
    public final C1BO A0D;
    public final C1BO A0E;

    public static final void A00(B33 b33, float f) {
        C6837Eap c6837Eap;
        b33.A08.Af8(Float.valueOf(f));
        if (MutableState.A0A(b33.A0B) && (c6837Eap = (C6837Eap) b33.A02.getValue()) != null) {
            f -= f % (1.0f / c6837Eap.A01);
        }
        b33.A07.Af8(Float.valueOf(f));
    }

    @Override // X.C3VB
    public final float getProgress() {
        return C8j3.A06(this.A07);
    }

    @Override // X.C1BO
    public final /* bridge */ /* synthetic */ Float getValue() {
        return Float.valueOf(C8j3.A06(this.A07));
    }

    public B33() {
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE age = AGE.A00;
        this.A03 = C3cG.A08(age, boolA0h);
        this.A04 = C3cG.A08(age, 1);
        this.A05 = C3cG.A08(age, 1);
        this.A09 = C3cG.A08(age, boolA0h);
        this.A01 = C3cG.A08(age, null);
        this.A0A = C3cG.A08(age, C8j3.A0t());
        this.A0B = C3cG.A08(age, boolA0h);
        this.A0D = new BBP(null, C2328BUc.A00(this, 45));
        this.A02 = C3cG.A08(age, null);
        Float fA0a = AnonymousClass005.A0a();
        this.A08 = C3cG.A08(age, fA0a);
        this.A07 = C3cG.A08(age, fA0a);
        this.A06 = C3cG.A08(age, Long.MIN_VALUE);
        this.A0C = AbstractC1798ArH.A02(this, 44);
        this.A0E = AbstractC1798ArH.A02(this, 46);
        this.A00 = new C5WW();
    }
}
