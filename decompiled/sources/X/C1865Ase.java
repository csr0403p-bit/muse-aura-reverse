package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;

/* renamed from: X.Ase, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1865Ase extends Ab8<C1864Asd> {
    public final C1110AYw A00;
    public final EnumC1108AYu A01;
    public final C1085AXt A02;
    public final C1881Asv A03;
    public final TransformedTextFieldState A04;
    public final TextFieldSelectionState A05;
    public final InterfaceC2026Awf A06;
    public final C1EQ A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1865Ase) {
                C1865Ase c1865Ase = (C1865Ase) obj;
                if (this.A09 != c1865Ase.A09 || this.A08 != c1865Ase.A08 || !C7384Etj.areEqual(this.A03, c1865Ase.A03) || !C7384Etj.areEqual(this.A04, c1865Ase.A04) || !C7384Etj.areEqual(this.A05, c1865Ase.A05) || !C7384Etj.areEqual(this.A07, c1865Ase.A07) || this.A0A != c1865Ase.A0A || !C7384Etj.areEqual(this.A00, c1865Ase.A00) || this.A01 != c1865Ase.A01 || !C7384Etj.areEqual(this.A02, c1865Ase.A02) || !C7384Etj.areEqual(this.A06, c1865Ase.A06)) {
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
        boolean z = this.A09;
        boolean z2 = this.A08;
        return new C1864Asd(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05, this.A06, this.A07, z, z2, this.A0A);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A00, C0KA.A01(AnonymousClass005.A0F(this.A07, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0F(this.A03, C0KA.A01(C0KA.A02(this.A09), this.A08))))), this.A0A)))) + AnonymousClass006.A0D(this.A06);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextFieldCoreModifier(isFocused=");
        sbA0x.append(this.A09);
        sbA0x.append(", isDragHovered=");
        sbA0x.append(this.A08);
        sbA0x.append(", textLayoutState=");
        sbA0x.append(this.A03);
        sbA0x.append(", textFieldState=");
        sbA0x.append(this.A04);
        sbA0x.append(", textFieldSelectionState=");
        sbA0x.append(this.A05);
        sbA0x.append(", cursorBrush=");
        sbA0x.append(this.A07);
        sbA0x.append(", writeable=");
        sbA0x.append(this.A0A);
        sbA0x.append(", scrollState=");
        sbA0x.append(this.A00);
        sbA0x.append(", orientation=");
        sbA0x.append(this.A01);
        sbA0x.append(", toolbarRequester=");
        sbA0x.append(this.A02);
        sbA0x.append(", platformSelectionBehaviors=");
        return AnonymousClass007.A0Z(this.A06, sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0049  */
    @Override // X.Ab8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void update(X.AbstractC1439Aj8 r17) {
        /*
            r16 = this;
            r14 = r17
            X.Asd r14 = (X.C1864Asd) r14
            r0 = r16
            boolean r13 = r0.A09
            boolean r12 = r0.A08
            X.Asv r11 = r0.A03
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r10 = r0.A04
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r9 = r0.A05
            X.1EQ r8 = r0.A07
            boolean r7 = r0.A0A
            X.AYw r6 = r0.A00
            X.AYu r5 = r0.A01
            X.AXt r4 = r0.A02
            X.Awf r3 = r0.A06
            boolean r17 = X.C1864Asd.A02(r14)
            boolean r0 = r14.A0E
            r16 = r0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r15 = r14.A07
            X.Asv r2 = r14.A06
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = r14.A08
            X.AYw r0 = r14.A02
            r14.A0E = r13
            r14.A0D = r12
            r14.A06 = r11
            r14.A07 = r10
            r14.A08 = r9
            r14.A0A = r8
            r14.A0F = r7
            r14.A02 = r6
            r14.A03 = r5
            r14.A04 = r4
            r14.A09 = r3
            X.AbE r5 = r14.A0I
            if (r13 != 0) goto L49
            r7 = 0
            if (r12 == 0) goto L4a
        L49:
            r7 = 1
        L4a:
            X.AVg r5 = (X.AVg) r5
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r3 = r5.A01
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r13 = r5.A02
            X.Asv r12 = r5.A00
            boolean r8 = r5.A03
            r5.A01 = r10
            r5.A02 = r9
            r5.A00 = r11
            r5.A03 = r7
            boolean r3 = X.C7384Etj.areEqual(r10, r3)
            if (r3 == 0) goto L70
            boolean r3 = X.C7384Etj.areEqual(r9, r13)
            if (r3 == 0) goto L70
            boolean r3 = X.C7384Etj.areEqual(r11, r12)
            if (r3 == 0) goto L70
            if (r7 == r8) goto L73
        L70:
            X.AVg.A00(r5)
        L73:
            X.AXs r7 = r14.A0H
            X.AXt r3 = r7.A00
            r5 = 0
            r3.A00 = r5
            r7.A00 = r4
            r4.A00 = r7
            boolean r3 = r7.isAttached
            if (r3 == 0) goto Lc8
            java.lang.Integer r3 = X.C79.A0C
        L84:
            r4.A01 = r3
            boolean r3 = X.C1864Asd.A02(r14)
            if (r3 != 0) goto Lba
            X.HoC r3 = r14.A0C
            if (r3 == 0) goto L93
            r3.A5w(r5)
        L93:
            r14.A0C = r5
            X.BPp r3 = r14.A05
            if (r3 == 0) goto L9e
            java.util.concurrent.atomic.AtomicReference<X.HoC> r3 = r3.A00
            X.C8j5.A0r(r3)
        L9e:
            boolean r3 = X.C7384Etj.areEqual(r15, r10)
            if (r3 == 0) goto Lb6
            boolean r2 = X.C7384Etj.areEqual(r2, r11)
            if (r2 == 0) goto Lb6
            boolean r1 = X.C7384Etj.areEqual(r1, r9)
            if (r1 == 0) goto Lb6
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 != 0) goto Lb9
        Lb6:
            X.AbstractC1339AhQ.A00(r14)
        Lb9:
            return
        Lba:
            if (r16 == 0) goto Lc4
            boolean r3 = X.C7384Etj.areEqual(r15, r10)
            if (r3 == 0) goto Lc4
            if (r17 != 0) goto L9e
        Lc4:
            X.C1864Asd.A00(r14)
            goto L9e
        Lc8:
            java.lang.Integer r3 = X.C79.A01
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1865Ase.update(X.Aj8):void");
    }

    public C1865Ase(C1110AYw c1110AYw, EnumC1108AYu enumC1108AYu, C1085AXt c1085AXt, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, InterfaceC2026Awf interfaceC2026Awf, C1EQ c1eq, boolean z, boolean z2, boolean z3) {
        this.A09 = z;
        this.A08 = z2;
        this.A03 = c1881Asv;
        this.A04 = transformedTextFieldState;
        this.A05 = textFieldSelectionState;
        this.A07 = c1eq;
        this.A0A = z3;
        this.A00 = c1110AYw;
        this.A01 = enumC1108AYu;
        this.A02 = c1085AXt;
        this.A06 = interfaceC2026Awf;
    }
}
