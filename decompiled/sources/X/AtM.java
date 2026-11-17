package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* loaded from: classes4.dex */
public final class AtM {
    public static final AtM A00 = new AtM();

    public static final int A00(InterfaceC1497Ak4 interfaceC1497Ak4, InterfaceC1079AXi interfaceC1079AXi, C1956Auv c1956Auv, long j) {
        long jAcE;
        int iA01;
        if (interfaceC1497Ak4 == null || (iA01 = A01(interfaceC1079AXi, c1956Auv, (jAcE = interfaceC1497Ak4.AcE(j)))) == -1) {
            return -1;
        }
        return c1956Auv.A0B(AnonymousClass007.A0A(AnonymousClass003.A03(jAcE), (c1956Auv.A07(iA01) + c1956Auv.A06(iA01)) / 2.0f));
    }

    public static final long A07(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!Character.isWhitespace(iCodePointBefore) && iCodePointBefore != 160) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (!Character.isWhitespace(iCodePointAt) && iCodePointAt != 160) {
                break;
            }
            i += Character.charCount(iCodePointAt);
        }
        return AbstractC1815ArZ.A00(iCharCount, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (A0G(r0, r1) == true) goto L47;
     */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;LX/Asv;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/AXi;)I */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0I(android.view.inputmethod.HandwritingGesture r14, X.C1881Asv r15, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r16, X.InterfaceC1079AXi r17, kotlin.jvm.functions.Function0 r18) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AtM.A0I(android.view.inputmethod.HandwritingGesture, X.Asv, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, X.AXi, kotlin.jvm.functions.Function0):int");
    }

    public static final int A01(InterfaceC1079AXi interfaceC1079AXi, C1956Auv c1956Auv, long j) {
        float fAG3 = interfaceC1079AXi != null ? interfaceC1079AXi.AG3() : 0.0f;
        float fA03 = C8j5.A03(j);
        int iA08 = c1956Auv.A08(fA03);
        if (fA03 >= c1956Auv.A07(iA08) - fAG3 && fA03 <= c1956Auv.A06(iA08) + fAG3) {
            float fA032 = AnonymousClass003.A03(j);
            if (fA032 >= (-fAG3) && fA032 <= c1956Auv.A01 + fAG3) {
                return iA08;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r7 == (-1)) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A06(X.InterfaceC1497Ak4 r3, X.InterfaceC1079AXi r4, X.C1958Aux r5, long r6, long r8) {
        /*
            if (r5 == 0) goto L1b
            if (r3 == 0) goto L1b
            long r0 = r3.AcE(r6)
            long r2 = r3.AcE(r8)
            X.Auv r5 = r5.A03
            int r6 = A01(r4, r5, r0)
            int r7 = A01(r4, r5, r2)
            r4 = -1
            if (r6 != r4) goto L1e
            if (r7 != r4) goto L25
        L1b:
            long r0 = X.Au3.A01
            return r0
        L1e:
            if (r7 == r4) goto L24
            int r6 = java.lang.Math.min(r6, r7)
        L24:
            r7 = r6
        L25:
            float r6 = r5.A07(r7)
            float r4 = r5.A06(r7)
            float r6 = r6 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r4
            float r4 = X.AnonymousClass001.A00(r0)
            float r0 = X.AnonymousClass001.A00(r2)
            float r3 = java.lang.Math.min(r4, r0)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r6 - r2
            float r0 = java.lang.Math.max(r4, r0)
            float r6 = r6 + r2
            X.AaC r2 = X.C8j3.A0f(r3, r1, r0, r6)
            r1 = 0
            X.Aye r0 = X.C2097AyM.A00
            long r0 = r5.A0C(r2, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AtM.A06(X.Ak4, X.AXi, X.Aux, long, long):long");
    }

    public static final String A09(F1E f1e, F1E f1e2, C1Lu c1Lu) {
        if (f1e.element == -1) {
            f1e.element = c1Lu.AJM().A00;
        }
        f1e2.element = c1Lu.AJM().A01 + 1;
        return "";
    }

    public static final String A0A(F1E f1e, F1E f1e2, C1Lu c1Lu) {
        if (f1e.element == -1) {
            f1e.element = c1Lu.AJM().A00;
        }
        f1e2.element = c1Lu.AJM().A01 + 1;
        return "";
    }

    public static final void A0B(TransformedTextFieldState transformedTextFieldState) {
        C1890At8 c1890At8 = transformedTextFieldState.A01;
        InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState.A00;
        Integer num = C79.A00;
        C0910AHm.A06(c1890At8);
        C1891AtA c1891AtA = c1890At8.A00;
        c1891AtA.A03 = null;
        TransformedTextFieldState.A01(c1891AtA, transformedTextFieldState);
        C1890At8.A01(interfaceC2143AzF, c1890At8, num);
    }

    public static final void A0D(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            C1897AtH c1897AtH = textFieldSelectionManager.A03;
            if (c1897AtH != null) {
                C8j4.A1H(c1897AtH.A09, Au3.A01);
            }
            C1897AtH c1897AtH2 = textFieldSelectionManager.A03;
            if (c1897AtH2 != null) {
                C8j4.A1H(c1897AtH2.A0G, Au3.A01);
            }
        }
    }

    public static final boolean A0G(C1958Aux c1958Aux, int i) {
        Integer numA09;
        C1956Auv c1956Auv = c1958Aux.A03;
        int iA09 = c1956Auv.A09(i);
        if (i == c1958Aux.A03(iA09) || i == c1956Auv.A0A(iA09, false)) {
            numA09 = c1958Aux.A09(i);
        } else {
            numA09 = c1958Aux.A08(i);
            i--;
        }
        return numA09 != c1958Aux.A08(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        if (A0G(r0.A02, r1) == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        if (A0G(r0.A02, r2) == true) goto L61;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AtH;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;LX/AXi;LX/G0U<-LX/AzK;Lkotlin/Unit;>;)I */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v11, types: [android.view.inputmethod.SelectGesture] */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.view.inputmethod.InsertGesture] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.inputmethod.JoinOrSplitGesture] */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.view.inputmethod.DeleteRangeGesture] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.view.inputmethod.SelectRangeGesture] */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.view.inputmethod.DeleteGesture] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0H(android.view.inputmethod.HandwritingGesture r13, X.C1897AtH r14, androidx.compose.foundation.text.selection.TextFieldSelectionManager r15, X.InterfaceC1079AXi r16, X.G0U r17) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AtM.A0H(android.view.inputmethod.HandwritingGesture, X.AtH, androidx.compose.foundation.text.selection.TextFieldSelectionManager, X.AXi, X.G0U):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0J(android.os.CancellationSignal r6, android.view.inputmethod.PreviewableHandwritingGesture r7, X.C1897AtH r8, final androidx.compose.foundation.text.selection.TextFieldSelectionManager r9) {
        /*
            r5 = this;
            X.ApQ r1 = r8.A03
            r4 = 0
            if (r1 == 0) goto L62
            X.Atl r0 = X.C1897AtH.A00(r8)
            if (r0 == 0) goto Le2
            X.Aux r0 = r0.A02
            X.Ask r0 = r0.A04
            X.ApQ r0 = r0.A03
        L11:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L62
            boolean r0 = r7 instanceof android.view.inputmethod.SelectGesture
            if (r0 == 0) goto L63
            android.view.inputmethod.SelectGesture r7 = (android.view.inputmethod.SelectGesture) r7
            if (r9 == 0) goto L57
            android.graphics.RectF r0 = r7.getSelectionArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r7.getGranularity()
            boolean r1 = X.C8j4.A1U(r0)
            X.Aye r0 = X.C2097AyM.A01
            long r2 = A03(r8, r2, r0, r1)
        L35:
            X.AtH r0 = r9.A03
            if (r0 == 0) goto L3e
            androidx.compose.runtime.MutableState r0 = r0.A0G
            X.C8j4.A1H(r0, r2)
        L3e:
            X.AtH r5 = r9.A03
            if (r5 == 0) goto L49
            long r0 = X.Au3.A01
            androidx.compose.runtime.MutableState r5 = r5.A09
        L46:
            X.C8j4.A1H(r5, r0)
        L49:
            boolean r0 = X.Au3.A04(r2)
            if (r0 != 0) goto L57
            androidx.compose.foundation.text.selection.TextFieldSelectionManager.A05(r9, r4)
            X.Au8 r0 = X.Au8.A03
            androidx.compose.foundation.text.selection.TextFieldSelectionManager.A02(r0, r9)
        L57:
            if (r6 == 0) goto L61
            X.Axv r0 = new X.Axv
            r0.<init>()
            r6.setOnCancelListener(r0)
        L61:
            r4 = 1
        L62:
            return r4
        L63:
            boolean r0 = r7 instanceof android.view.inputmethod.DeleteGesture
            if (r0 == 0) goto L93
            android.view.inputmethod.DeleteGesture r7 = (android.view.inputmethod.DeleteGesture) r7
            if (r9 == 0) goto L57
            android.graphics.RectF r0 = r7.getDeletionArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r7.getGranularity()
            boolean r1 = X.C8j4.A1U(r0)
            X.Aye r0 = X.C2097AyM.A01
            long r2 = A03(r8, r2, r0, r1)
        L81:
            X.AtH r0 = r9.A03
            if (r0 == 0) goto L8a
            androidx.compose.runtime.MutableState r0 = r0.A09
            X.C8j4.A1H(r0, r2)
        L8a:
            X.AtH r5 = r9.A03
            if (r5 == 0) goto L49
            long r0 = X.Au3.A01
            androidx.compose.runtime.MutableState r5 = r5.A0G
            goto L46
        L93:
            boolean r0 = r7 instanceof android.view.inputmethod.SelectRangeGesture
            if (r0 == 0) goto Lbb
            android.view.inputmethod.SelectRangeGesture r7 = (android.view.inputmethod.SelectRangeGesture) r7
            if (r9 == 0) goto L57
            android.graphics.RectF r0 = r7.getSelectionStartArea()
            X.AaC r3 = X.AbstractC1709Aos.A02(r0)
            android.graphics.RectF r0 = r7.getSelectionEndArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r7.getGranularity()
            boolean r1 = X.C8j4.A1U(r0)
            X.Aye r0 = X.C2097AyM.A01
            long r2 = A02(r8, r3, r2, r0, r1)
            goto L35
        Lbb:
            boolean r0 = r7 instanceof android.view.inputmethod.DeleteRangeGesture
            if (r0 == 0) goto L62
            android.view.inputmethod.DeleteRangeGesture r7 = (android.view.inputmethod.DeleteRangeGesture) r7
            if (r9 == 0) goto L57
            android.graphics.RectF r0 = r7.getDeletionStartArea()
            X.AaC r3 = X.AbstractC1709Aos.A02(r0)
            android.graphics.RectF r0 = r7.getDeletionEndArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r7.getGranularity()
            boolean r1 = X.C8j4.A1U(r0)
            X.Aye r0 = X.C2097AyM.A01
            long r2 = A02(r8, r3, r2, r0, r1)
            goto L81
        Le2:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AtM.A0J(android.os.CancellationSignal, android.view.inputmethod.PreviewableHandwritingGesture, X.AtH, androidx.compose.foundation.text.selection.TextFieldSelectionManager):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0K(android.os.CancellationSignal r5, android.view.inputmethod.PreviewableHandwritingGesture r6, X.C1881Asv r7, final androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof android.view.inputmethod.SelectGesture
            if (r0 == 0) goto L2c
            android.view.inputmethod.SelectGesture r6 = (android.view.inputmethod.SelectGesture) r6
            android.graphics.RectF r0 = r6.getSelectionArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r6.getGranularity()
            boolean r1 = X.C8j4.A1U(r0)
            X.Aye r0 = X.C2097AyM.A01
            long r1 = A05(r7, r2, r0, r1)
        L1c:
            r0 = 0
            A0C(r8, r0, r1)
        L20:
            if (r5 == 0) goto L2a
            X.Axw r0 = new X.Axw
            r0.<init>()
            r5.setOnCancelListener(r0)
        L2a:
            r0 = 1
            return r0
        L2c:
            boolean r0 = r6 instanceof android.view.inputmethod.DeleteGesture
            if (r0 == 0) goto L4d
            android.view.inputmethod.DeleteGesture r6 = (android.view.inputmethod.DeleteGesture) r6
            android.graphics.RectF r0 = r6.getDeletionArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r6.getGranularity()
            r4 = 1
            r1 = 1
            if (r0 == r4) goto L43
            r1 = 0
        L43:
            X.Aye r0 = X.C2097AyM.A01
            long r0 = A05(r7, r2, r0, r1)
        L49:
            A0C(r8, r4, r0)
            goto L20
        L4d:
            boolean r0 = r6 instanceof android.view.inputmethod.SelectRangeGesture
            if (r0 == 0) goto L72
            android.view.inputmethod.SelectRangeGesture r6 = (android.view.inputmethod.SelectRangeGesture) r6
            android.graphics.RectF r0 = r6.getSelectionStartArea()
            X.AaC r3 = X.AbstractC1709Aos.A02(r0)
            android.graphics.RectF r0 = r6.getSelectionEndArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r6.getGranularity()
            boolean r1 = X.C8j4.A1U(r0)
            X.Aye r0 = X.C2097AyM.A01
            long r1 = A04(r7, r3, r2, r0, r1)
            goto L1c
        L72:
            boolean r0 = r6 instanceof android.view.inputmethod.DeleteRangeGesture
            if (r0 == 0) goto L98
            android.view.inputmethod.DeleteRangeGesture r6 = (android.view.inputmethod.DeleteRangeGesture) r6
            android.graphics.RectF r0 = r6.getDeletionStartArea()
            X.AaC r3 = X.AbstractC1709Aos.A02(r0)
            android.graphics.RectF r0 = r6.getDeletionEndArea()
            X.AaC r2 = X.AbstractC1709Aos.A02(r0)
            int r0 = r6.getGranularity()
            r4 = 1
            r1 = 1
            if (r0 == r4) goto L91
            r1 = 0
        L91:
            X.Aye r0 = X.C2097AyM.A01
            long r0 = A04(r7, r3, r2, r0, r1)
            goto L49
        L98:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AtM.A0K(android.os.CancellationSignal, android.view.inputmethod.PreviewableHandwritingGesture, X.Asv, androidx.compose.foundation.text.input.internal.TransformedTextFieldState):boolean");
    }

    public static final long A02(C1897AtH c1897AtH, AaC aaC, AaC aaC2, InterfaceC2114Aye interfaceC2114Aye, int i) {
        long jA03 = A03(c1897AtH, aaC, interfaceC2114Aye, i);
        if (!Au3.A04(jA03)) {
            long jA032 = A03(c1897AtH, aaC2, interfaceC2114Aye, i);
            if (!Au3.A04(jA032)) {
                int iA0G = C8j3.A0G(jA03);
                int iMin = Math.min(iA0G, iA0G);
                int iA09 = AnonymousClass002.A09(jA032);
                return AbstractC1815ArZ.A00(iMin, Math.max(iA09, iA09));
            }
        }
        return Au3.A01;
    }

    public static final long A03(C1897AtH c1897AtH, AaC aaC, InterfaceC2114Aye interfaceC2114Aye, int i) {
        C1924Atl c1924AtlA00 = C1897AtH.A00(c1897AtH);
        C1956Auv c1956Auv = c1924AtlA00 != null ? c1924AtlA00.A02.A03 : null;
        InterfaceC1497Ak4 interfaceC1497Ak4A01 = c1897AtH.A01();
        return (c1956Auv == null || interfaceC1497Ak4A01 == null) ? Au3.A01 : c1956Auv.A0C(aaC.A03(interfaceC1497Ak4A01.AcE(0L)), interfaceC2114Aye, i);
    }

    public static final long A04(C1881Asv c1881Asv, AaC aaC, AaC aaC2, InterfaceC2114Aye interfaceC2114Aye, int i) {
        long jA05 = A05(c1881Asv, aaC, interfaceC2114Aye, i);
        if (!Au3.A04(jA05)) {
            long jA052 = A05(c1881Asv, aaC2, interfaceC2114Aye, i);
            if (!Au3.A04(jA052)) {
                int iA0G = C8j3.A0G(jA05);
                int iMin = Math.min(iA0G, iA0G);
                int iA09 = AnonymousClass002.A09(jA052);
                return AbstractC1815ArZ.A00(iMin, Math.max(iA09, iA09));
            }
        }
        return Au3.A01;
    }

    public static final long A05(C1881Asv c1881Asv, AaC aaC, InterfaceC2114Aye interfaceC2114Aye, int i) {
        C1958Aux c1958AuxA01 = C1881Asv.A01(c1881Asv);
        C1956Auv c1956Auv = c1958AuxA01 != null ? c1958AuxA01.A03 : null;
        InterfaceC1497Ak4 interfaceC1497Ak4A00 = C1881Asv.A00(c1881Asv);
        return (c1956Auv == null || interfaceC1497Ak4A00 == null) ? Au3.A01 : c1956Auv.A0C(aaC.A03(interfaceC1497Ak4A00.AcE(0L)), interfaceC2114Aye, i);
    }

    public static final long A08(CharSequence charSequence, long j) {
        int iA0G = C8j3.A0G(j);
        int iA09 = AnonymousClass002.A09(j);
        int iCodePointBefore = iA0G > 0 ? Character.codePointBefore(charSequence, iA0G) : 10;
        int iCodePointAt = iA09 < charSequence.length() ? Character.codePointAt(charSequence, iA09) : 10;
        if (A0F(iCodePointBefore) && (Character.isWhitespace(iCodePointAt) || iCodePointAt == 160 || A0E(iCodePointAt))) {
            do {
                iA0G -= Character.charCount(iCodePointBefore);
                if (iA0G == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iA0G);
            } while (A0F(iCodePointBefore));
        } else {
            if (!A0F(iCodePointAt)) {
                return j;
            }
            if (!Character.isWhitespace(iCodePointBefore) && iCodePointBefore != 160 && !A0E(iCodePointBefore)) {
                return j;
            }
            do {
                iA09 += Character.charCount(iCodePointAt);
                if (iA09 == charSequence.length()) {
                    break;
                }
                iCodePointAt = Character.codePointAt(charSequence, iA09);
            } while (A0F(iCodePointAt));
        }
        return AbstractC1815ArZ.A00(iA0G, iA09);
    }

    public static final void A0C(TransformedTextFieldState transformedTextFieldState, int i, long j) {
        if (Au3.A04(j)) {
            C1890At8 c1890At8 = transformedTextFieldState.A01;
            InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState.A00;
            Integer num = C79.A00;
            C0910AHm.A06(c1890At8);
            C1891AtA c1891AtA = c1890At8.A00;
            c1891AtA.A03 = null;
            TransformedTextFieldState.A01(c1891AtA, transformedTextFieldState);
            C1890At8.A01(interfaceC2143AzF, c1890At8, num);
            return;
        }
        long jA05 = transformedTextFieldState.A05(j);
        C1890At8 c1890At82 = transformedTextFieldState.A01;
        InterfaceC2143AzF interfaceC2143AzF2 = transformedTextFieldState.A00;
        Integer num2 = C79.A00;
        C0910AHm.A06(c1890At82);
        C1891AtA c1891AtA2 = c1890At82.A00;
        int iA0G = C8j3.A0G(jA05);
        int iA09 = AnonymousClass002.A09(jA05);
        if (iA0G >= iA09) {
            throw C8j3.A0v("Do not set reversed or empty range: ", " > ", iA0G, iA09);
        }
        C1919Atg c1919Atg = c1891AtA2.A05;
        c1891AtA2.A03 = C3cG.A0r(new C1867Ash(i), C8j3.A0j(AbstractC1815ArZ.A00(ATD.A04(iA0G, 0, c1919Atg.length()), ATD.A04(iA09, 0, c1919Atg.length()))));
        C1890At8.A01(interfaceC2143AzF2, c1890At82, num2);
    }

    public static final boolean A0E(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean A0F(int i) {
        int type;
        return ((!Character.isWhitespace(i) && i != 160) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}
