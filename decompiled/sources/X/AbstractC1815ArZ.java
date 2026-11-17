package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* renamed from: X.ArZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1815ArZ {
    public static final long A01(long j, int i) {
        int iA0G = C8j3.A0G(j);
        int i2 = iA0G;
        if (iA0G < 0) {
            i2 = 0;
        }
        if (i2 > i) {
            i2 = i;
        }
        int iA09 = AnonymousClass002.A09(j);
        int i3 = iA09 >= 0 ? iA09 : 0;
        if (i3 <= i) {
            i = i3;
        }
        return (i2 == iA0G && i == iA09) ? j : A00(i2, i);
    }

    public static final long A00(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw C60O.A0i(FGI.A0Q("start and end cannot be negative. [start: ", ", end: ", ']', i, i2));
        }
        return C8j3.A0T(i, i2);
    }

    public static long A02(InterfaceC2128Ayu interfaceC2128Ayu, long j) {
        return A00(interfaceC2128Ayu.originalToTransformed((int) (j >> 32)), interfaceC2128Ayu.originalToTransformed(Au3.A00(j)));
    }

    public static void A03(C1872Asm c1872Asm, int i) {
        c1872Asm.A00 = A00(i, i);
    }

    public static void A04(TextFieldSelectionManager textFieldSelectionManager, ApQ apQ, int i) {
        textFieldSelectionManager.A0G.invoke(new C1805ArO(apQ, null, A00(i, i)));
        TextFieldSelectionManager.A02(Au8.A03, textFieldSelectionManager);
    }
}
