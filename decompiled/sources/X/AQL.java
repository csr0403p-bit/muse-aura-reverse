package X;

import androidx.compose.runtime.MutableState;
import java.util.List;

/* loaded from: classes4.dex */
public final class AQL extends AbstractC1010APl {
    public APe A00;
    public final MutableState A01 = AbstractC1798ArH.A06(null);

    public AQL(APe aPe) {
        this.A00 = aPe;
    }

    public static final AaC A00(APe aPe, APc aPc) {
        if (aPe == null) {
            return null;
        }
        List listA1C = C8j3.A1C(aPc.A04);
        int size = listA1C.size();
        for (int i = 0; i < size; i++) {
            if (C7384Etj.areEqual(((APh) listA1C.get(i)).A00, aPe)) {
                AQM aqm = (AQM) aPe;
                if (!aqm.isAttached) {
                    return null;
                }
                if (!aqm.A02) {
                    return aqm.A01;
                }
                InterfaceC1497Ak4 interfaceC1497Ak4 = APh.A00(aqm).A01.A01;
                if (interfaceC1497Ak4 != null) {
                    return C2J7.A00(interfaceC1497Ak4.APn(AbstractC1414Aij.A05(aqm), 0L, true), AQY.A01(((AZE) AbstractC1414Aij.A05(aqm)).A03));
                }
                throw C60O.A0i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            }
        }
        return null;
    }

    @Override // X.AbstractC1010APl
    public final AaC A02() {
        return (AaC) this.A01.getValue();
    }

    @Override // X.AbstractC1010APl
    public final boolean A04() {
        return true;
    }

    @Override // X.AbstractC1010APl
    public final AaC A03(APc aPc) {
        Object obj;
        AaC aaCA02 = A02();
        if (aaCA02 != null) {
            return aaCA02;
        }
        if (A02() == null) {
            APe aPe = this.A00;
            if (aPe == null) {
                List listA1C = C8j3.A1C(aPc.A04);
                int size = listA1C.size();
                int i = 0;
                while (true) {
                    aPe = null;
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listA1C.get(i);
                    if (C8j3.A1C(aPc.A05).contains(obj)) {
                        break;
                    }
                    i++;
                }
                APh aPh = (APh) obj;
                if (aPh != null) {
                    aPe = aPh.A00;
                }
            }
            AaC aaCA00 = A00(aPe, aPc);
            if (aaCA00 != null) {
                this.A01.Af8(aaCA00);
            }
        }
        return A02();
    }
}
