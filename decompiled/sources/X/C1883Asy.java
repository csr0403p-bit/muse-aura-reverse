package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Asy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1883Asy implements InterfaceC2045AxD {
    public final Function0<Unit> A06;
    public final /* synthetic */ TextFieldSelectionState A07;
    public int A00 = -1;
    public long A01 = 9205357640488583168L;
    public long A02 = 0;
    public AWv A03 = AWv.A03;
    public boolean A05 = true;
    public Ay9 A04 = C2025Awe.A02;

    public C1883Asy(TextFieldSelectionState textFieldSelectionState, Function0<Unit> function0) {
        this.A07 = textFieldSelectionState;
        this.A06 = function0;
    }

    private final void A00() {
        if ((this.A01 & 9223372034707292159L) != 9205357640488583168L) {
            TextFieldSelectionState textFieldSelectionState = this.A07;
            textFieldSelectionState.A0I();
            this.A00 = -1;
            this.A01 = 9205357640488583168L;
            this.A02 = 0L;
            textFieldSelectionState.A00 = -1;
            this.A04 = C2025Awe.A02;
            textFieldSelectionState.A0I.Af8(EnumC1314Agz.A03);
            this.A06.invoke();
            if (this.A05) {
                textFieldSelectionState.A0J();
            }
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void ASa() {
    }

    @Override // X.InterfaceC2045AxD
    public final void ASf(long j) {
        int iA02;
        int iA022;
        Ay9 ay9;
        ApQ apQ;
        TextFieldSelectionState textFieldSelectionState = this.A07;
        if (textFieldSelectionState.A0A) {
            C1881Asv c1881Asv = textFieldSelectionState.A0F;
            C1892AtB c1892AtB = c1881Asv.A03;
            if (c1892AtB.getValue() != null) {
                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.A0G;
                if (At0.A00(transformedTextFieldState) != 0) {
                    long jA05 = AWx.A05(this.A02, j);
                    this.A02 = jA05;
                    long jA052 = AWx.A05(this.A01, jA05);
                    if (this.A00 >= 0 || c1881Asv.A04(jA052)) {
                        C1958Aux c1958Aux = (C1958Aux) c1892AtB.getValue();
                        int length = (c1958Aux == null || (apQ = c1958Aux.A04.A03) == null) ? 0 : apQ.length();
                        iA02 = this.A00;
                        if (iA02 < 0 || iA02 > length) {
                            iA02 = c1881Asv.A02(this.A01, false);
                        }
                        iA022 = c1881Asv.A02(jA052, false);
                        if (this.A00 < 0 && iA02 == iA022) {
                            return;
                        }
                        ay9 = this.A04;
                        textFieldSelectionState.A0P.Af8(BG8.A04);
                    } else {
                        iA02 = c1881Asv.A02(this.A01, true);
                        iA022 = c1881Asv.A02(jA052, true);
                        ay9 = iA02 == iA022 ? C2025Awe.A02 : this.A04;
                    }
                    long jA01 = At0.A01(transformedTextFieldState);
                    long jA0A = textFieldSelectionState.A0A(transformedTextFieldState.A07(), ay9, new C2135Az3(9), iA02, iA022, false, false);
                    if (this.A00 == -1 && !Au3.A04(jA0A)) {
                        this.A00 = C8j3.A0G(jA0A);
                    }
                    if (Au3.A05(jA0A)) {
                        jA0A = AbstractC1815ArZ.A00(AnonymousClass002.A09(jA0A), C8j3.A0G(jA0A));
                    }
                    if (jA0A != jA01) {
                        int i = (int) (jA0A >> 32);
                        int i2 = (int) (jA01 >> 32);
                        this.A03 = ((i == i2 || AnonymousClass002.A09(jA0A) != AnonymousClass002.A09(jA01)) && ((i == i2 && AnonymousClass002.A09(jA0A) != AnonymousClass002.A09(jA01)) || ((float) (i + AnonymousClass002.A09(jA0A))) / 2.0f > ((float) (i2 + AnonymousClass002.A09(jA01))) / 2.0f)) ? AWv.A03 : AWv.A04;
                        this.A05 = false;
                    }
                    if (Au3.A04(jA01) || !Au3.A04(jA0A)) {
                        TransformedTextFieldState.A02(transformedTextFieldState, jA0A);
                    }
                    textFieldSelectionState.A0L(this.A03, jA052);
                }
            }
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AW7(Ay9 ay9, long j) {
        TextFieldSelectionState textFieldSelectionState = this.A07;
        if (textFieldSelectionState.A0A) {
            textFieldSelectionState.A0L(this.A03, j);
            MutableState mutableState = textFieldSelectionState.A0M;
            MutableState.A09(false, mutableState);
            textFieldSelectionState.A0I.Af8(EnumC1314Agz.A04);
            this.A01 = j;
            this.A02 = 0L;
            textFieldSelectionState.A00 = -1;
            this.A05 = true;
            this.A04 = ay9;
            C1881Asv c1881Asv = textFieldSelectionState.A0F;
            if (c1881Asv.A03.getValue() != null) {
                if (c1881Asv.A04(j)) {
                    TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.A0G;
                    if (At0.A00(transformedTextFieldState) != 0) {
                        int iA02 = c1881Asv.A02(j, true);
                        long jA0A = textFieldSelectionState.A0A(new At0(null, transformedTextFieldState.A07(), null, null, Au3.A01), this.A04, new C2135Az3(0), iA02, iA02, false, false);
                        TransformedTextFieldState.A02(transformedTextFieldState, jA0A);
                        textFieldSelectionState.A0P.Af8(BG8.A04);
                        this.A00 = C8j3.A0G(jA0A);
                        return;
                    }
                    return;
                }
                int iA022 = c1881Asv.A02(j, true);
                C0dx c0dx = textFieldSelectionState.A05;
                if (c0dx != null) {
                    c0dx.AXr(0);
                }
                TransformedTextFieldState.A02(textFieldSelectionState.A0G, AbstractC1815ArZ.A00(iA022, iA022));
                MutableState.A09(true, mutableState);
                this.A05 = false;
                textFieldSelectionState.A0P.Af8(BG8.A02);
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
