package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;

/* renamed from: X.Asq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1876Asq {
    public static final long A00(C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, long j) {
        int iOrdinal;
        int iA0G;
        InterfaceC1497Ak4 interfaceC1497Ak4;
        long jA09 = textFieldSelectionState.A09();
        if ((9223372034707292159L & jA09) != 9205357640488583168L && At0.A00(transformedTextFieldState) != 0) {
            long jA01 = At0.A01(transformedTextFieldState);
            AWv aWv = (AWv) textFieldSelectionState.A0J.getValue();
            if (aWv != null && (iOrdinal = aWv.ordinal()) != -1) {
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iA0G = C8j3.A0G(jA01);
                } else {
                    if (iOrdinal != 2) {
                        throw C3cG.A0q();
                    }
                    iA0G = AnonymousClass002.A09(jA01);
                }
                C1958Aux c1958AuxA01 = C1881Asv.A01(c1881Asv);
                if (c1958AuxA01 != null) {
                    float fA00 = AnonymousClass001.A00(jA09);
                    C1956Auv c1956Auv = c1958AuxA01.A03;
                    int iA09 = c1956Auv.A09(iA0G);
                    float fA002 = c1958AuxA01.A00(iA09);
                    float fA01 = c1958AuxA01.A01(iA09);
                    float fA03 = ATD.A03(fA00, Math.min(fA002, fA01), Math.max(fA002, fA01));
                    if (j == 0 || C8j3.A01(fA00, fA03) <= ((int) (j >> 32)) / 2) {
                        float fA07 = c1956Auv.A07(iA09);
                        long jA0B = AnonymousClass007.A0B(fA03, C8j3.A00(c1956Auv.A06(iA09), fA07) + fA07);
                        MutableState mutableState = c1881Asv.A07;
                        InterfaceC1497Ak4 interfaceC1497Ak42 = (InterfaceC1497Ak4) mutableState.getValue();
                        if (interfaceC1497Ak42 != null && interfaceC1497Ak42.isAttached()) {
                            jA0B = AbstractC1882Asw.A01(AbstractC1703Aoi.A00(interfaceC1497Ak42), jA0B);
                        }
                        InterfaceC1497Ak4 interfaceC1497Ak43 = (InterfaceC1497Ak4) mutableState.getValue();
                        return (interfaceC1497Ak43 == null || !interfaceC1497Ak43.isAttached() || (interfaceC1497Ak4 = (InterfaceC1497Ak4) c1881Asv.A04.getValue()) == null || !interfaceC1497Ak4.isAttached()) ? jA0B : interfaceC1497Ak4.APm(interfaceC1497Ak43, jA0B);
                    }
                }
            }
        }
        return 9205357640488583168L;
    }
}
