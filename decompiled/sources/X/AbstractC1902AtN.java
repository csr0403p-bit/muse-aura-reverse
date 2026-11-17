package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: X.AtN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1902AtN {
    public static final boolean A01(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        InterfaceC1497Ak4 interfaceC1497Ak4A01;
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH == null || (interfaceC1497Ak4A01 = c1897AtH.A01()) == null) {
            return false;
        }
        return AbstractC1703Aoi.A01(AbstractC1703Aoi.A00(interfaceC1497Ak4A01), textFieldSelectionManager.A06(z));
    }

    public static final void A00(TextFieldSelectionManager textFieldSelectionManager, BFM bfm, Integer num, int i, boolean z) {
        C1924Atl c1924AtlA00;
        bfm.AgG(-1344558920);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0E(bfm, num.intValue());
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, textFieldSelectionManager);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            int i2 = iA0n & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, textFieldSelectionManager, AnonymousClass002.A1Q(i2, 4));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new BSI(textFieldSelectionManager, 1, z);
                bfm.Ai0(objAaT);
            }
            boolean zA67 = bfm.A67(textFieldSelectionManager) | (i2 == 4);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new C2102AyS(textFieldSelectionManager, z);
                bfm.Ai0(objAaT2);
            }
            InterfaceC2267BNn interfaceC2267BNn = (InterfaceC2267BNn) objAaT2;
            MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
            boolean zA05 = Au3.A05(C8j4.A0O(mutableState));
            long jA0O = C8j4.A0O(mutableState);
            int iA0G = z ? C8j3.A0G(jA0O) : AnonymousClass002.A09(jA0O);
            C1897AtH c1897AtH = textFieldSelectionManager.A03;
            float fA00 = (c1897AtH == null || (c1924AtlA00 = C1897AtH.A00(c1897AtH)) == null) ? 0.0f : Av2.A00(c1924AtlA00.A02, iA0G);
            BS0 bs0 = BRg.A00;
            boolean zA672 = bfm.A67(objAaT);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new BSJ(objAaT, 11);
                bfm.Ai0(objAaT3);
            }
            AWB.A02(interfaceC2267BNn, bfm, AaM.A00(bs0, (PointerInputEventHandler) objAaT3, objAaT), num, fA00, (iA0n << 3) & 1008, 16, 0L, z, zA05);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTK(num, textFieldSelectionManager, i, 3, z);
        }
    }
}
