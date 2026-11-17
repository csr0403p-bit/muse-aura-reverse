package X;

import android.view.ActionMode;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class BSM implements C78g {
    public final int $t;
    public final Object A00;

    public BSM(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.C78g
    public final void dispose() {
        AbstractC1718Ap2 abstractC1718Ap2;
        switch (this.$t) {
            case 0:
                ((SeekableTransitionState) ((AOH) this.A00)).A0D(null);
                return;
            case 1:
            case 2:
            default:
                AOP aop = (AOP) this.A00;
                aop.A05();
                Object obj = aop.A02;
                if (obj instanceof AOI) {
                    return;
                }
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
                seekableTransitionState.A04 = null;
                BBO bbo = seekableTransitionState.A05;
                if (bbo != null) {
                    bbo.A02(seekableTransitionState);
                    return;
                }
                return;
            case 3:
                ((C1132Abg) this.A00).A01 = null;
                return;
            case 4:
                C1229Af7 c1229Af7 = (C1229Af7) this.A00;
                C1227Af5 c1227Af5 = c1229Af7.A03;
                if (c1227Af5 != null) {
                    c1227Af5.A00 = false;
                }
                c1229Af7.A03 = null;
                return;
            case 5:
                ((C1209Aek) this.A00).A03 = true;
                return;
            case 6:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.A00;
                textFieldSelectionState.A0E.A00();
                textFieldSelectionState.A05 = null;
                return;
            case 7:
                ((TextFieldSelectionManager) this.A00).A04.A00();
                return;
            case 8:
                Ar6 ar6 = (Ar6) this.A00;
                BBO bbo2 = ar6.A04;
                AOY aoy = bbo2.A00;
                if (aoy != null) {
                    aoy.dispose();
                }
                bbo2.A01();
                ActionMode actionMode = ar6.A00;
                if (actionMode != null) {
                    actionMode.finish();
                }
                ar6.A00 = null;
                return;
            case 9:
                Ar5 ar5 = (Ar5) ((Ar4) this.A00).A00.getValue();
                if (ar5 != null) {
                    ar5.close();
                    return;
                }
                return;
            case 10:
                C1943Aug c1943Aug = (C1943Aug) this.A00;
                c1943Aug.A0B();
                MutableState.A09(false, c1943Aug.A0L);
                return;
            case 11:
                BA1 ba1 = (BA1) this.A00;
                ba1.dismiss();
                abstractC1718Ap2 = ba1.A03;
                break;
            case 12:
                ((AFy) this.A00).A00.invoke();
                return;
            case 13:
                BA0 ba0 = (BA0) this.A00;
                ba0.dismiss();
                abstractC1718Ap2 = ba0.A04;
                break;
            case 14:
                C1711Aou c1711Aou = (C1711Aou) this.A00;
                c1711Aou.A0C();
                AbstractC1720Ap8.A01(c1711Aou, null);
                c1711Aou.A0B.removeViewImmediate(c1711Aou);
                return;
        }
        abstractC1718Ap2.A0C();
    }
}
