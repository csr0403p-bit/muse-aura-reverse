package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;

/* renamed from: X.Atu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1931Atu {
    public static final ATF<C1931Atu> A05 = new AuK();
    public final TransformedTextFieldState A00;
    public final C1822Arm A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NonMeasureInputs(textFieldState=");
        sbA0x.append(this.A00);
        sbA0x.append(", textStyle=");
        sbA0x.append(this.A01);
        sbA0x.append(", singleLine=");
        sbA0x.append(this.A03);
        sbA0x.append(", softWrap=");
        sbA0x.append(this.A04);
        sbA0x.append(", isKeyboardTypePhone=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1931Atu(TransformedTextFieldState transformedTextFieldState, C1822Arm c1822Arm, boolean z, boolean z2, boolean z3) {
        this.A00 = transformedTextFieldState;
        this.A01 = c1822Arm;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }
}
