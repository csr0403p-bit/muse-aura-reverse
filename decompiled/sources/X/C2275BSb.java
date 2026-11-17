package X;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;

/* renamed from: X.BSb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2275BSb implements InterfaceC2267BNn {
    public final int $t;
    public final Object A00;

    public C2275BSb(TextFieldSelectionState textFieldSelectionState, int i) {
        this.$t = i;
        this.A00 = textFieldSelectionState;
    }

    @Override // X.InterfaceC2267BNn
    public final long AYd() {
        C1878Ass c1878AssA0B;
        int i = this.$t;
        TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.A00;
        switch (i) {
            case 0:
                c1878AssA0B = textFieldSelectionState.A0B(true);
                break;
            case 1:
                c1878AssA0B = textFieldSelectionState.A0C(true, true);
                break;
            default:
                c1878AssA0B = textFieldSelectionState.A0C(false, true);
                break;
        }
        return c1878AssA0B.A01;
    }
}
