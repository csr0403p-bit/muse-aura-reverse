package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FRX {
    public Boolean A00;
    public CharSequence A01;
    public Function0<Boolean> A04;
    public boolean A05;
    public final Function0<Boolean> A07;
    public Function0<Boolean> A02 = C8472Feb.A00(5);
    public Function0<? extends CharSequence> A03 = C8472Feb.A00(6);
    public final C8050FRd A06 = new C8050FRd(FZO.A02(this, 13));

    public static final CharSequence A00(FRX frx) {
        Boolean boolInvoke = frx.A00;
        if (boolInvoke == null) {
            if (frx.A04 == null) {
                return null;
            }
            boolInvoke = frx.A02.invoke();
            frx.A00 = boolInvoke;
        }
        if (!boolInvoke.booleanValue()) {
            return null;
        }
        if (!frx.A05) {
            frx.A01 = frx.A03.invoke();
            frx.A05 = true;
        }
        return frx.A01;
    }

    public final boolean A01() {
        Function0<Boolean> function0;
        if (this.A04 == null || !AnonymousClass003.A1Y(this.A07)) {
            return false;
        }
        Boolean boolInvoke = this.A00;
        if (boolInvoke == null) {
            if (this.A04 == null) {
                return false;
            }
            boolInvoke = this.A02.invoke();
            this.A00 = boolInvoke;
        }
        return boolInvoke.booleanValue() && (function0 = this.A04) != null && AnonymousClass003.A1Y(function0);
    }

    public FRX(Function0<Boolean> function0) {
        this.A07 = function0;
    }
}
