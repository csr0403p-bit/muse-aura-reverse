package X;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class APc {
    public boolean A00;
    public final APZ A01;
    public final APd A02 = new APd(this);
    public final AT5<AWx, ARY> A03;
    public final MutableState A04;
    public final MutableState A05;
    public final Object A06;
    public final Function0<AWx> A07;
    public final Function0<Unit> A08;

    public final void A01() {
        Integer num;
        List listA1C = C8j3.A1C(this.A04);
        ArrayList arrayListA0h = C3cG.A0h();
        int size = listA1C.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            APh aPh = (APh) listA1C.get(i);
            if (aPh.A03()) {
                arrayListA0h.add(aPh);
                if (((C1008AOz) aPh.A04.getValue()).A03()) {
                    z = true;
                }
            }
        }
        this.A05.Af8(arrayListA0h);
        APd aPd = this.A02;
        APc aPc = aPd.A04;
        if (C8j3.A1C(aPc.A05).size() <= 1 || !z) {
            if (!aPc.A01.APC()) {
                aPd.A03 = C79.A00;
                aPd.A00 = aPd.A05.AGd();
                aPd.A07.Af8(C1018AQb.A00);
            } else if (!z) {
                num = C79.A0C;
            }
            aPd.A00();
        }
        num = C79.A01;
        aPd.A03 = num;
        aPd.A05.AdX(aPd.A00 + 1);
        aPd.A00();
    }

    public final boolean A02() {
        APd aPd = this.A02;
        MutableState mutableState = aPd.A07;
        return ((AbstractC1010APl) mutableState.getValue()).A04() || ((AbstractC1010APl) mutableState.getValue()).A01() || aPd.A03 == C79.A01;
    }

    public final boolean A03() {
        List listA1C = C8j3.A1C(this.A05);
        int size = listA1C.size();
        for (int i = 0; i < size; i++) {
            AOP aop = ((C1008AOz) ((APh) listA1C.get(i)).A04.getValue()).A01;
            while (aop.A01 != null) {
                aop = aop.A01;
                C7384Etj.A0X(aop);
            }
            if (!C7384Etj.areEqual(aop.A02.A09(), aop.A07.getValue())) {
                return true;
            }
        }
        return false;
    }

    public APc(APZ apz, Object obj) {
        this.A06 = obj;
        this.A01 = apz;
        C0881AGi c0881AGi = C0881AGi.A00;
        AGE age = AGE.A00;
        this.A04 = C3cG.A08(age, c0881AGi);
        this.A05 = C3cG.A08(age, c0881AGi);
        this.A03 = new AT5<>(AVd.A06, AWx.A0B(0L), null);
        this.A07 = C2328BUc.A00(this, 0);
        this.A08 = C2328BUc.A00(this, 1);
    }

    public static AbstractC1010APl A00(MutableState mutableState) {
        return (AbstractC1010APl) ((APc) mutableState.getValue()).A02.A07.getValue();
    }
}
