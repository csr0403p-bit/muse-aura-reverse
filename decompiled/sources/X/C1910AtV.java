package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import kotlin.Unit;

/* renamed from: X.AtV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1910AtV implements InterfaceC2036Awq {
    public int A00;
    public C1891AtA A01;
    public final TransformedTextFieldState A02;
    public final C0910AHm<G0U<C1891AtA, Unit>> A03 = C0910AHm.A01(new G0U[16]);

    @Override // X.InterfaceC2036Awq
    public final int ALz() {
        C1891AtA c1891AtA = this.A01;
        return c1891AtA != null ? c1891AtA.A05.length() : At0.A00(this.A02);
    }

    @Override // X.InterfaceC2036Awq
    public final long AQ5(long j) {
        TransformedTextFieldState transformedTextFieldState = this.A02;
        return transformedTextFieldState.A02 != null ? transformedTextFieldState.A05(j) : j;
    }

    @Override // X.InterfaceC2036Awq
    public final long AQ6(long j) {
        TransformedTextFieldState transformedTextFieldState = this.A02;
        return transformedTextFieldState.A02 != null ? transformedTextFieldState.A06(j) : j;
    }

    @Override // X.InterfaceC2036Awq
    public final boolean beginBatchEdit() {
        this.A00++;
        return true;
    }

    @Override // X.InterfaceC2036Awq
    public final boolean endBatchEdit() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            C0910AHm<G0U<C1891AtA, Unit>> c0910AHm = this.A03;
            if (c0910AHm.A00 != 0) {
                TransformedTextFieldState transformedTextFieldState = this.A02;
                C1890At8 c1890At8 = transformedTextFieldState.A01;
                InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState.A00;
                Integer num = C79.A00;
                C0910AHm.A06(c1890At8);
                C1891AtA c1891AtA = c1890At8.A00;
                if (transformedTextFieldState.A02 == null) {
                    this.A01 = c1891AtA;
                }
                G0U<C1891AtA, Unit>[] g0uArr = c0910AHm.A01;
                int i2 = c0910AHm.A00;
                for (int i3 = 0; i3 < i2; i3++) {
                    g0uArr[i3].invoke(c1891AtA);
                }
                TransformedTextFieldState.A01(c1891AtA, transformedTextFieldState);
                C1890At8.A02(interfaceC2143AzF, c1890At8, num, false);
                C1890At8.A06(c1890At8, true);
                c0910AHm.A09();
            }
        }
        return this.A00 > 0;
    }

    public C1910AtV(TransformedTextFieldState transformedTextFieldState) {
        this.A02 = transformedTextFieldState;
    }

    @Override // X.InterfaceC2036Awq
    public final void A9r(G0U<? super C1891AtA, Unit> g0u) {
        beginBatchEdit();
        this.A03.A0G(g0u);
        endBatchEdit();
    }
}
