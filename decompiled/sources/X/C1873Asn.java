package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Unit;

/* renamed from: X.Asn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1873Asn extends Ab8<C1871Asl> {
    public final InterfaceC1072AWd A00;
    public final AuJ A01;
    public final InterfaceC2143AzF A02;
    public final C1881Asv A03;
    public final TransformedTextFieldState A04;
    public final TextFieldSelectionState A05;
    public final C3Em<Unit> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1873Asn) {
                C1873Asn c1873Asn = (C1873Asn) obj;
                if (!C7384Etj.areEqual(this.A04, c1873Asn.A04) || !C7384Etj.areEqual(this.A03, c1873Asn.A03) || !C7384Etj.areEqual(this.A05, c1873Asn.A05) || !C7384Etj.areEqual(this.A02, c1873Asn.A02) || this.A07 != c1873Asn.A07 || this.A09 != c1873Asn.A09 || !C7384Etj.areEqual(this.A01, c1873Asn.A01) || this.A0A != c1873Asn.A0A || !C7384Etj.areEqual(this.A00, c1873Asn.A00) || this.A08 != c1873Asn.A08 || !C7384Etj.areEqual(this.A06, c1873Asn.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        TransformedTextFieldState transformedTextFieldState = this.A04;
        C1881Asv c1881Asv = this.A03;
        TextFieldSelectionState textFieldSelectionState = this.A05;
        InterfaceC2143AzF interfaceC2143AzF = this.A02;
        boolean z = this.A07;
        boolean z2 = this.A09;
        AuJ auJ = this.A01;
        boolean z3 = this.A0A;
        return new C1871Asl(this.A00, auJ, interfaceC2143AzF, c1881Asv, transformedTextFieldState, textFieldSelectionState, this.A06, z, z2, z3, this.A08);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A01(AnonymousClass005.A0F(this.A00, C0KA.A01(AnonymousClass005.A0F(this.A01, C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A04))) + AnonymousClass006.A0D(this.A02)) * 31, this.A07), this.A09)) * 31, this.A0A)), this.A08) + C3cH.A02(this.A06);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextFieldDecoratorModifier(textFieldState=");
        sbA0x.append(this.A04);
        sbA0x.append(", textLayoutState=");
        sbA0x.append(this.A03);
        sbA0x.append(", textFieldSelectionState=");
        sbA0x.append(this.A05);
        sbA0x.append(", filter=");
        sbA0x.append(this.A02);
        sbA0x.append(", enabled=");
        sbA0x.append(this.A07);
        sbA0x.append(", readOnly=");
        sbA0x.append(this.A09);
        sbA0x.append(", keyboardOptions=");
        sbA0x.append(this.A01);
        C8j4.A1R(sbA0x, ", keyboardActionHandler=");
        sbA0x.append(", singleLine=");
        sbA0x.append(this.A0A);
        sbA0x.append(", interactionSource=");
        sbA0x.append(this.A00);
        sbA0x.append(", isPassword=");
        sbA0x.append(this.A08);
        sbA0x.append(", stylusHandwritingTrigger=");
        return AnonymousClass007.A0Z(this.A06, sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    @Override // X.Ab8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void update(X.AbstractC1439Aj8 r22) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1873Asn.update(X.Aj8):void");
    }

    public C1873Asn(InterfaceC1072AWd interfaceC1072AWd, AuJ auJ, InterfaceC2143AzF interfaceC2143AzF, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, C3Em c3Em, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = transformedTextFieldState;
        this.A03 = c1881Asv;
        this.A05 = textFieldSelectionState;
        this.A02 = interfaceC2143AzF;
        this.A07 = z;
        this.A09 = z2;
        this.A01 = auJ;
        this.A0A = z3;
        this.A00 = interfaceC1072AWd;
        this.A08 = z4;
        this.A06 = c3Em;
    }
}
