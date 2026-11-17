package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AuZ extends AbstractC1439Aj8 implements InterfaceC1487Aju, InterfaceC1766AqJ, C1Z2, InterfaceC1738Apb {
    public C1897AtH A00;
    public AuP A01;
    public TextFieldSelectionManager A02;
    public final MutableState A03 = AbstractC1798ArH.A03();

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A03.Af8(interfaceC1497Ak4);
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AuP auP = this.A01;
        if (auP.A00 != null) {
            throw C3cG.A0Q("Expected textInputModifierNode to be null");
        }
        auP.A00 = this;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A01.A02(this);
    }

    public AuZ(C1897AtH c1897AtH, AuP auP, TextFieldSelectionManager textFieldSelectionManager) {
        this.A01 = auP;
        this.A00 = c1897AtH;
        this.A02 = textFieldSelectionManager;
    }
}
