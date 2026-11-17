package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Asz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1884Asz implements InterfaceC2076Axr {
    public int A00 = -1;
    public long A01 = 9205357640488583168L;
    public boolean A02 = true;
    public final Function0<Unit> A03;
    public final /* synthetic */ TextFieldSelectionState A04;

    @Override // X.InterfaceC2076Axr
    public final boolean ASe(Ay9 ay9, long j) {
        TextFieldSelectionState textFieldSelectionState = this.A04;
        C1958Aux c1958AuxA01 = C1881Asv.A01(textFieldSelectionState.A0F);
        if (textFieldSelectionState.A0A && c1958AuxA01 != null) {
            TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.A0G;
            if (At0.A00(transformedTextFieldState) != 0) {
                if (At0.A01(transformedTextFieldState) == A00(ay9, c1958AuxA01, j, false)) {
                    return true;
                }
                this.A02 = false;
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ATE(long j) {
        TextFieldSelectionState textFieldSelectionState = this.A04;
        C1958Aux c1958AuxA01 = C1881Asv.A01(textFieldSelectionState.A0F);
        if (!textFieldSelectionState.A0A || c1958AuxA01 == null || At0.A00(textFieldSelectionState.A0G) == 0) {
            return false;
        }
        this.A02 = false;
        this.A03.invoke();
        A00(C2025Awe.A02, c1958AuxA01, j, false);
        return true;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ATF(long j) {
        return true;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean AW8(Ay9 ay9, int i, long j) {
        TextFieldSelectionState textFieldSelectionState = this.A04;
        C1958Aux c1958AuxA01 = C1881Asv.A01(textFieldSelectionState.A0F);
        if (!textFieldSelectionState.A0A || c1958AuxA01 == null || At0.A00(textFieldSelectionState.A0G) == 0) {
            return false;
        }
        this.A02 = i >= 2;
        textFieldSelectionState.A0I.Af8(EnumC1314Agz.A02);
        this.A03.invoke();
        textFieldSelectionState.A00 = -1;
        this.A00 = -1;
        this.A01 = j;
        this.A00 = C8j3.A0G(A00(ay9, c1958AuxA01, j, true));
        return true;
    }

    public C1884Asz(TextFieldSelectionState textFieldSelectionState, Function0<Unit> function0) {
        this.A04 = textFieldSelectionState;
        this.A03 = function0;
    }

    @Override // X.InterfaceC2076Axr
    public final void ASg() {
        TextFieldSelectionState textFieldSelectionState = this.A04;
        textFieldSelectionState.A0I.Af8(EnumC1314Agz.A03);
        if (this.A02) {
            textFieldSelectionState.A0J();
        }
    }

    private final long A00(Ay9 ay9, C1958Aux c1958Aux, long j, boolean z) {
        int iA00 = C1870Ask.A00(c1958Aux);
        int iA02 = this.A00;
        if (iA02 < 0 || iA02 > iA00) {
            iA02 = this.A04.A0F.A02(this.A01, false);
        }
        TextFieldSelectionState textFieldSelectionState = this.A04;
        int iA022 = textFieldSelectionState.A0F.A02(j, false);
        TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.A0G;
        long jA0A = textFieldSelectionState.A0A(transformedTextFieldState.A07(), ay9, null, iA02, iA022, false, z);
        if (this.A00 == -1 && !Au3.A04(jA0A)) {
            this.A00 = C8j3.A0G(jA0A);
        }
        if (Au3.A05(jA0A)) {
            jA0A = AbstractC1815ArZ.A00(AnonymousClass002.A09(jA0A), C8j3.A0G(jA0A));
        }
        TransformedTextFieldState.A02(transformedTextFieldState, jA0A);
        textFieldSelectionState.A0P.Af8(BG8.A04);
        return jA0A;
    }
}
