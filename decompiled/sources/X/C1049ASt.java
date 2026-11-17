package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.ASt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1049ASt {
    public long A00;
    public final MutableState A01;
    public final MutableState A02;
    public final C0910AHm<C1050ASu<?, ?>> A03 = C0910AHm.A02(new C1050ASu[16], 0);

    public C1049ASt() {
        AGE age = AGE.A00;
        this.A02 = C3cG.A08(age, false);
        this.A00 = Long.MIN_VALUE;
        this.A01 = C3cG.A08(age, AnonymousClass001.A0i());
    }

    public final void A00(BFM bfm, int i) {
        bfm.AgG(-318043801);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, this) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A07(null, bfm);
            }
            if (MutableState.A0A(this.A01) || MutableState.A0A(this.A02)) {
                boolean zA1Z = AnonymousClass001.A1Z(this, bfm, -144841960);
                Object objAaT2 = bfm.AaT();
                if (zA1Z || objAaT2 == obj) {
                    objAaT2 = new BUF(this, objAaT, null, 1);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A18(bfm, objAaT2, this);
            } else {
                bfm.AgE(-143455237);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(this, i, 0);
        }
    }
}
