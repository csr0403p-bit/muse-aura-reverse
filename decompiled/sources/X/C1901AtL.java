package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;

/* renamed from: X.AtL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1901AtL implements InterfaceC2045AxD {
    public final /* synthetic */ TextFieldSelectionManager A00;

    public C1901AtL(TextFieldSelectionManager textFieldSelectionManager) {
        this.A00 = textFieldSelectionManager;
    }

    @Override // X.InterfaceC2045AxD
    public final void ASa() {
    }

    @Override // X.InterfaceC2045AxD
    public final void ASf(long j) {
        C1924Atl c1924AtlA00;
        C0dx c0dx;
        TextFieldSelectionManager textFieldSelectionManager = this.A00;
        textFieldSelectionManager.A02 = AWx.A05(textFieldSelectionManager.A02, j);
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH == null || (c1924AtlA00 = C1897AtH.A00(c1897AtH)) == null) {
            return;
        }
        AWx aWxA0B = AWx.A0B(AWx.A05(textFieldSelectionManager.A01, textFieldSelectionManager.A02));
        MutableState mutableState = textFieldSelectionManager.A0N;
        mutableState.Af8(aWxA0B);
        int iTransformedToOriginal = textFieldSelectionManager.A0C.transformedToOriginal(c1924AtlA00.A01(AWx.A06(mutableState), true));
        long jA00 = AbstractC1815ArZ.A00(iTransformedToOriginal, iTransformedToOriginal);
        MutableState<C1805ArO> mutableState2 = textFieldSelectionManager.A0S;
        if (jA00 != C8j4.A0O(mutableState2)) {
            C1897AtH c1897AtH2 = textFieldSelectionManager.A03;
            if ((c1897AtH2 == null || MutableState.A0A(c1897AtH2.A0C)) && (c0dx = textFieldSelectionManager.A07) != null) {
                c0dx.AXr(9);
            }
            textFieldSelectionManager.A0G.invoke(C8j4.A0e(C8j4.A0d(mutableState2).A01, jA00));
            textFieldSelectionManager.A0B = C8j3.A0j(jA00);
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AW7(Ay9 ay9, long j) {
        C1924Atl c1924AtlA00;
        InterfaceC1497Ak4 interfaceC1497Ak4;
        TextFieldSelectionManager textFieldSelectionManager = this.A00;
        long jA00 = AWu.A00(textFieldSelectionManager.A06(true));
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH == null || (c1924AtlA00 = C1897AtH.A00(c1897AtH)) == null) {
            return;
        }
        InterfaceC1497Ak4 interfaceC1497Ak42 = c1924AtlA00.A01;
        if (interfaceC1497Ak42 != null && interfaceC1497Ak42.isAttached() && (interfaceC1497Ak4 = c1924AtlA00.A00) != null && interfaceC1497Ak4.isAttached()) {
            jA00 = interfaceC1497Ak4.APm(interfaceC1497Ak42, jA00);
        }
        AWx.A0F(textFieldSelectionManager, jA00);
        textFieldSelectionManager.A0O.Af8(AWv.A02);
        TextFieldSelectionManager.A05(textFieldSelectionManager, false);
    }

    @Override // X.InterfaceC2045AxD
    public final void AWF() {
        TextFieldSelectionManager.A03(this.A00);
    }

    @Override // X.InterfaceC2045AxD
    public final void AWw() {
        TextFieldSelectionManager.A03(this.A00);
    }

    @Override // X.InterfaceC2045AxD
    public final void onCancel() {
    }
}
