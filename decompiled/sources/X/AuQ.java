package X;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;

/* loaded from: classes4.dex */
public final class AuQ {
    public HoC A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC2147AzZ A05;
    public final C3UX A06;
    public final C1881Asv A09;
    public final TransformedTextFieldState A0A;
    public final CursorAnchorInfo.Builder A08 = new CursorAnchorInfo.Builder();
    public final float[] A0B = C1392AiN.A06();
    public final Matrix A07 = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.inputmethod.CursorAnchorInfo A00(X.AuQ r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AuQ.A00(X.AuQ):android.view.inputmethod.CursorAnchorInfo");
    }

    public final void A01(int i) {
        boolean zA1L;
        boolean zA1L2;
        boolean zA1L3;
        CursorAnchorInfo cursorAnchorInfoA00;
        boolean z = false;
        boolean zA1L4 = AnonymousClass002.A1L(i & 1);
        boolean zA1L5 = AnonymousClass002.A1L(i & 2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            zA1L = AnonymousClass002.A1L(i & 16);
            zA1L2 = AnonymousClass002.A1L(i & 8);
            zA1L3 = AnonymousClass002.A1L(i & 4);
            if (i2 >= 34 && (i & 32) != 0) {
                z = true;
            }
            if (!zA1L && !zA1L2 && !zA1L3 && !z) {
                z = false;
                zA1L = true;
                zA1L2 = true;
                zA1L3 = true;
                if (i2 >= 34) {
                    z = true;
                }
            }
        } else {
            zA1L = true;
            zA1L2 = true;
            zA1L3 = false;
        }
        this.A03 = zA1L;
        this.A01 = zA1L2;
        this.A02 = zA1L3;
        this.A04 = z;
        if (zA1L4 && (cursorAnchorInfoA00 = A00(this)) != null) {
            AbstractC2034Awo abstractC2034Awo = (AbstractC2034Awo) this.A05;
            abstractC2034Awo.A00().updateCursorAnchorInfo(abstractC2034Awo.A01, cursorAnchorInfoA00);
        }
        HoC hoC = this.A00;
        if (!zA1L5) {
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.A00 = null;
        } else if (hoC == null || !hoC.isActive()) {
            this.A00 = GAo.A02(C79.A0K, C6ys.A00, BU2.A0O(this, null, 33), this.A06);
        }
    }

    public AuQ(InterfaceC2147AzZ interfaceC2147AzZ, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, C3UX c3ux) {
        this.A0A = transformedTextFieldState;
        this.A09 = c1881Asv;
        this.A05 = interfaceC2147AzZ;
        this.A06 = c3ux;
    }
}
