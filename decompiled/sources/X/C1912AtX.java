package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;

/* renamed from: X.AtX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1912AtX implements InterfaceC2076Axr {
    public Au3 A00;
    public boolean A01 = true;
    public final /* synthetic */ TextFieldSelectionManager A02;

    @Override // X.InterfaceC2076Axr
    public final boolean ASe(Ay9 ay9, long j) {
        C1897AtH c1897AtH;
        TextFieldSelectionManager textFieldSelectionManager = this.A02;
        if (MutableState.A0A(textFieldSelectionManager.A0Q)) {
            MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
            if (MutableState.A04((MutableState) mutableState).length() != 0 && (c1897AtH = textFieldSelectionManager.A03) != null && c1897AtH.A0E.getValue() != null) {
                A00(ay9, C8j4.A0d(mutableState), j, false);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ATE(long j) {
        TextFieldSelectionManager textFieldSelectionManager = this.A02;
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH == null || c1897AtH.A0E.getValue() == null || !MutableState.A0A(textFieldSelectionManager.A0Q)) {
            return false;
        }
        textFieldSelectionManager.A00 = -1;
        C1518AkS c1518AkS = textFieldSelectionManager.A06;
        if (c1518AkS != null) {
            C1518AkS.A00(c1518AkS);
        }
        A00(C2025Awe.A02, C8j4.A0d(textFieldSelectionManager.A0S), j, false);
        return true;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean ATF(long j) {
        C1897AtH c1897AtH;
        TextFieldSelectionManager textFieldSelectionManager = this.A02;
        if (MutableState.A0A(textFieldSelectionManager.A0Q)) {
            MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
            if (MutableState.A04((MutableState) mutableState).length() != 0 && (c1897AtH = textFieldSelectionManager.A03) != null && c1897AtH.A0E.getValue() != null) {
                A00(C2025Awe.A02, C8j4.A0d(mutableState), j, false);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC2076Axr
    public final boolean AW8(Ay9 ay9, int i, long j) {
        C1897AtH c1897AtH;
        TextFieldSelectionManager textFieldSelectionManager = this.A02;
        if (MutableState.A0A(textFieldSelectionManager.A0Q)) {
            MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
            if (MutableState.A04((MutableState) mutableState).length() != 0 && (c1897AtH = textFieldSelectionManager.A03) != null && c1897AtH.A0E.getValue() != null) {
                C1518AkS c1518AkS = textFieldSelectionManager.A06;
                if (c1518AkS != null) {
                    C1518AkS.A00(c1518AkS);
                }
                textFieldSelectionManager.A01 = j;
                textFieldSelectionManager.A00 = -1;
                textFieldSelectionManager.A0D(true);
                long jA00 = A00(ay9, C8j4.A0d(mutableState), textFieldSelectionManager.A01, true);
                if (i >= 2) {
                    this.A01 = true;
                    this.A00 = C8j3.A0j(jA00);
                }
                return true;
            }
        }
        return false;
    }

    public C1912AtX(TextFieldSelectionManager textFieldSelectionManager) {
        this.A02 = textFieldSelectionManager;
    }

    private final long A00(Ay9 ay9, C1805ArO c1805ArO, long j, boolean z) {
        TextFieldSelectionManager textFieldSelectionManager = this.A02;
        long jA00 = TextFieldSelectionManager.A00(ay9, textFieldSelectionManager, null, c1805ArO, j, z, false, false);
        Au3 au3 = this.A00;
        if (au3 == null || jA00 != au3.A00) {
            this.A01 = false;
        }
        TextFieldSelectionManager.A02(Au3.A04(jA00) ? Au8.A02 : Au8.A04, textFieldSelectionManager);
        return jA00;
    }

    @Override // X.InterfaceC2076Axr
    public final void ASg() {
        if (this.A01) {
            TextFieldSelectionManager.A04(this.A02, this.A00);
        }
    }
}
