package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;

/* renamed from: X.AtG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1896AtG implements InterfaceC2045AxD {
    public Au3 A01;
    public final /* synthetic */ TextFieldSelectionManager A03;
    public boolean A02 = true;
    public Ay9 A00 = C2025Awe.A02;

    @Override // X.InterfaceC2045AxD
    public final void ASf(long j) {
        C1924Atl c1924AtlA00;
        C1805ArO c1805ArOA0d;
        long jA06;
        Ay9 ay9;
        TextFieldSelectionManager textFieldSelectionManager = this.A03;
        if (MutableState.A0A(textFieldSelectionManager.A0Q)) {
            MutableState<C1805ArO> mutableState = textFieldSelectionManager.A0S;
            if (MutableState.A04((MutableState) mutableState).length() != 0) {
                textFieldSelectionManager.A02 = AWx.A05(textFieldSelectionManager.A02, j);
                C1897AtH c1897AtH = textFieldSelectionManager.A03;
                if (c1897AtH != null && (c1924AtlA00 = C1897AtH.A00(c1897AtH)) != null) {
                    AWx aWxA0B = AWx.A0B(AWx.A05(textFieldSelectionManager.A01, textFieldSelectionManager.A02));
                    MutableState mutableState2 = textFieldSelectionManager.A0N;
                    mutableState2.Af8(aWxA0B);
                    if (textFieldSelectionManager.A0A != null || c1924AtlA00.A03(AWx.A06(mutableState2))) {
                        Au3 au3 = textFieldSelectionManager.A0A;
                        int iA0G = au3 != null ? C8j3.A0G(au3.A00) : c1924AtlA00.A01(textFieldSelectionManager.A01, false);
                        int iA01 = c1924AtlA00.A01(AWx.A06(mutableState2), false);
                        if (textFieldSelectionManager.A0A == null && iA0G == iA01) {
                            return;
                        }
                        c1805ArOA0d = C8j4.A0d(mutableState);
                        jA06 = AWx.A06(mutableState2);
                        ay9 = this.A00;
                    } else {
                        ay9 = textFieldSelectionManager.A0C.transformedToOriginal(c1924AtlA00.A01(textFieldSelectionManager.A01, true)) == textFieldSelectionManager.A0C.transformedToOriginal(c1924AtlA00.A01(AWx.A06(mutableState2), true)) ? C2025Awe.A02 : C2025Awe.A04;
                        c1805ArOA0d = C8j4.A0d(mutableState);
                        jA06 = AWx.A06(mutableState2);
                    }
                    long jA00 = TextFieldSelectionManager.A00(ay9, textFieldSelectionManager, new C2135Az3(9), c1805ArOA0d, jA06, false, false, true);
                    this.A01 = C8j3.A0j(jA00);
                    Au3 au32 = textFieldSelectionManager.A0A;
                    if (au32 == null || jA00 != au32.A00) {
                        this.A02 = false;
                    }
                }
                TextFieldSelectionManager.A05(textFieldSelectionManager, false);
            }
        }
    }

    public C1896AtG(TextFieldSelectionManager textFieldSelectionManager) {
        this.A03 = textFieldSelectionManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r7 = this;
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r4 = r7.A03
            r3 = 0
            androidx.compose.runtime.MutableState r0 = r4.A0O
            r0.Af8(r3)
            androidx.compose.runtime.MutableState r0 = r4.A0N
            r0.Af8(r3)
            X.Ay9 r0 = X.C2025Awe.A02
            r7.A00 = r0
            r5 = 1
            androidx.compose.foundation.text.selection.TextFieldSelectionManager.A05(r4, r5)
            X.Au3 r0 = r7.A01
            if (r0 == 0) goto L6f
            long r0 = r0.A00
        L1b:
            boolean r6 = X.Au3.A04(r0)
            if (r6 == 0) goto L6c
            X.Au8 r0 = X.Au8.A02
        L23:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager.A02(r0, r4)
            X.AtH r2 = r4.A03
            if (r2 == 0) goto L39
            if (r6 != 0) goto L33
            boolean r0 = X.AbstractC1902AtN.A01(r4, r5)
            r1 = 1
            if (r0 != 0) goto L34
        L33:
            r1 = 0
        L34:
            androidx.compose.runtime.MutableState r0 = r2.A0K
            androidx.compose.runtime.MutableState.A09(r1, r0)
        L39:
            X.AtH r2 = r4.A03
            if (r2 == 0) goto L4d
            if (r6 != 0) goto L47
            r0 = 0
            boolean r0 = X.AbstractC1902AtN.A01(r4, r0)
            r1 = 1
            if (r0 != 0) goto L48
        L47:
            r1 = 0
        L48:
            androidx.compose.runtime.MutableState r0 = r2.A0J
            androidx.compose.runtime.MutableState.A09(r1, r0)
        L4d:
            X.AtH r1 = r4.A03
            if (r1 == 0) goto L5e
            if (r6 == 0) goto L6a
            boolean r0 = X.AbstractC1902AtN.A01(r4, r5)
            if (r0 == 0) goto L6a
        L59:
            androidx.compose.runtime.MutableState r0 = r1.A0H
            androidx.compose.runtime.MutableState.A09(r5, r0)
        L5e:
            boolean r0 = r7.A02
            if (r0 == 0) goto L67
            X.Au3 r0 = r4.A0A
            androidx.compose.foundation.text.selection.TextFieldSelectionManager.A04(r4, r0)
        L67:
            r4.A0A = r3
            return
        L6a:
            r5 = 0
            goto L59
        L6c:
            X.Au8 r0 = X.Au8.A04
            goto L23
        L6f:
            androidx.compose.runtime.MutableState<X.ArO> r0 = r4.A0S
            long r0 = X.C8j4.A0O(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1896AtG.A00():void");
    }

    @Override // X.InterfaceC2045AxD
    public final void ASa() {
    }

    @Override // X.InterfaceC2045AxD
    public final void AW7(Ay9 ay9, long j) {
        C1924Atl c1924AtlA00;
        C1924Atl c1924AtlA002;
        TextFieldSelectionManager textFieldSelectionManager = this.A03;
        if (MutableState.A0A(textFieldSelectionManager.A0Q)) {
            MutableState mutableState = textFieldSelectionManager.A0O;
            if (mutableState.getValue() == null) {
                mutableState.Af8(AWv.A03);
                textFieldSelectionManager.A00 = -1;
                this.A02 = true;
                this.A00 = ay9;
                textFieldSelectionManager.A04.A00();
                C1897AtH c1897AtH = textFieldSelectionManager.A03;
                if (c1897AtH == null || (c1924AtlA002 = C1897AtH.A00(c1897AtH)) == null || !c1924AtlA002.A03(j)) {
                    C1897AtH c1897AtH2 = textFieldSelectionManager.A03;
                    if (c1897AtH2 != null && (c1924AtlA00 = C1897AtH.A00(c1897AtH2)) != null) {
                        int iTransformedToOriginal = textFieldSelectionManager.A0C.transformedToOriginal(c1924AtlA00.A01(j, true));
                        C1805ArO c1805ArOA0e = C8j4.A0e(C8j4.A0d(textFieldSelectionManager.A0S).A01, AbstractC1815ArZ.A00(iTransformedToOriginal, iTransformedToOriginal));
                        textFieldSelectionManager.A0D(false);
                        C0dx c0dx = textFieldSelectionManager.A07;
                        if (c0dx != null) {
                            c0dx.AXr(0);
                        }
                        textFieldSelectionManager.A0G.invoke(c1805ArOA0e);
                        textFieldSelectionManager.A0B = C8j3.A0j(c1805ArOA0e.A00);
                    }
                    this.A02 = false;
                } else {
                    MutableState<C1805ArO> mutableState2 = textFieldSelectionManager.A0S;
                    if (MutableState.A04((MutableState) mutableState2).length() == 0) {
                        return;
                    }
                    textFieldSelectionManager.A0D(false);
                    C1805ArO c1805ArOA0d = C8j4.A0d(mutableState2);
                    long jA00 = TextFieldSelectionManager.A00(this.A00, textFieldSelectionManager, new C2135Az3(0), new C1805ArO(c1805ArOA0d.A01, c1805ArOA0d.A02, Au3.A01), j, true, false, true);
                    textFieldSelectionManager.A0A = C8j3.A0j(jA00);
                    this.A01 = C8j3.A0j(jA00);
                }
                TextFieldSelectionManager.A02(Au8.A03, textFieldSelectionManager);
                AWx.A0F(textFieldSelectionManager, j);
            }
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AWw() {
    }

    @Override // X.InterfaceC2045AxD
    public final void AWF() {
        A00();
    }

    @Override // X.InterfaceC2045AxD
    public final void onCancel() {
        A00();
    }
}
