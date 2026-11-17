package X;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AOz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1008AOz {
    public AOe<AaC> A00;
    public final AOP<Boolean> A01;
    public final MutableState A02;
    public final MutableState A03;
    public final MutableState A04;
    public final AP1 A05;
    public final Function0<AWx> A06;

    public static boolean A00(APh aPh) {
        return ((C1008AOz) aPh.A04.getValue()).A03();
    }

    public final AaC A01() {
        C1BO c1bo;
        AaC aaC;
        if (!this.A05.APC() || (c1bo = (C1BO) this.A03.getValue()) == null || (aaC = (AaC) c1bo.getValue()) == null) {
            return null;
        }
        long j = this.A06.invoke().A00;
        return j != 0 ? aaC.A03(j) : aaC;
    }

    public final void A02(AP0 ap0, AaC aaC, AaC aaC2) {
        if (this.A05.APC()) {
            MutableState mutableState = this.A03;
            if (mutableState.getValue() == null) {
                if (ap0 == null) {
                    ap0 = (AP0) this.A04.getValue();
                }
                this.A00 = ap0.createAnimationSpec(aaC, aaC2);
            }
            mutableState.Af8(((AOS) this.A02.getValue()).A00(BUX.A00(this, 1), new C2339BUn(aaC2, aaC, this, 1)));
        }
    }

    public final boolean A03() {
        return ((Boolean) this.A01.A07.getValue()).booleanValue();
    }

    /* JADX WARN: Incorrect inner types in method signature: (LX/AP1;LX/AOP<Ljava/lang/Boolean;>;LX/AOP<Ljava/lang/Boolean;>.DeferredAnimation<LX/AaC;LX/AT9;>;LX/AP0;Lkotlin/jvm/functions/Function0<LX/AWx;>;)V */
    public C1008AOz(AP0 ap0, AP1 ap1, AOS aos, AOP aop, Function0 function0) {
        this.A05 = ap1;
        this.A01 = aop;
        this.A06 = function0;
        AGE age = AGE.A00;
        this.A02 = C3cG.A08(age, aos);
        this.A04 = C3cG.A08(age, ap0);
        this.A00 = AbstractC1006AOx.A00;
        this.A03 = C3cG.A08(age, null);
    }
}
