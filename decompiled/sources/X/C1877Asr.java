package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* renamed from: X.Asr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1877Asr extends Ab8<C1875Asp> {
    public final C1897AtH A00;
    public final TextFieldSelectionManager A01;
    public final C1518AkS A02;
    public final AuI A03;
    public final InterfaceC2128Ayu A04;
    public final C1805ArO A05;
    public final C1YX A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1877Asr) {
                C1877Asr c1877Asr = (C1877Asr) obj;
                if (!C7384Etj.areEqual(this.A06, c1877Asr.A06) || !C7384Etj.areEqual(this.A05, c1877Asr.A05) || !C7384Etj.areEqual(this.A00, c1877Asr.A00) || this.A09 != c1877Asr.A09 || this.A07 != c1877Asr.A07 || this.A08 != c1877Asr.A08 || !C7384Etj.areEqual(this.A04, c1877Asr.A04) || !C7384Etj.areEqual(this.A01, c1877Asr.A01) || !C7384Etj.areEqual(this.A03, c1877Asr.A03) || !C7384Etj.areEqual(this.A02, c1877Asr.A02)) {
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
        C1YX c1yx = this.A06;
        C1805ArO c1805ArO = this.A05;
        C1897AtH c1897AtH = this.A00;
        boolean z = this.A09;
        boolean z2 = this.A07;
        boolean z3 = this.A08;
        InterfaceC2128Ayu interfaceC2128Ayu = this.A04;
        TextFieldSelectionManager textFieldSelectionManager = this.A01;
        AuI auI = this.A03;
        C1518AkS c1518AkS = this.A02;
        C1875Asp c1875Asp = new C1875Asp();
        c1875Asp.A06 = c1yx;
        c1875Asp.A05 = c1805ArO;
        c1875Asp.A00 = c1897AtH;
        c1875Asp.A09 = z;
        c1875Asp.A07 = z2;
        c1875Asp.A08 = z3;
        c1875Asp.A04 = interfaceC2128Ayu;
        c1875Asp.A01 = textFieldSelectionManager;
        c1875Asp.A03 = auI;
        c1875Asp.A02 = c1518AkS;
        textFieldSelectionManager.A0F = C2298BSy.A00(c1875Asp, 21);
        return c1875Asp;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A04, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0E(this.A06))), this.A09), this.A07), this.A08)))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CoreTextFieldSemanticsModifier(transformedText=");
        sbA0x.append(this.A06);
        sbA0x.append(", value=");
        sbA0x.append(this.A05);
        sbA0x.append(", state=");
        sbA0x.append(this.A00);
        sbA0x.append(", readOnly=");
        sbA0x.append(this.A09);
        sbA0x.append(", enabled=");
        sbA0x.append(this.A07);
        sbA0x.append(", isPassword=");
        sbA0x.append(this.A08);
        sbA0x.append(", offsetMapping=");
        sbA0x.append(this.A04);
        sbA0x.append(", manager=");
        sbA0x.append(this.A01);
        sbA0x.append(", imeOptions=");
        sbA0x.append(this.A03);
        sbA0x.append(", focusRequester=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @Override // X.Ab8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void update(X.AbstractC1439Aj8 r17) {
        /*
            r16 = this;
            r14 = r17
            X.Asp r14 = (X.C1875Asp) r14
            r1 = r16
            X.1YX r0 = r1.A06
            r17 = r0
            X.ArO r13 = r1.A05
            X.AtH r0 = r1.A00
            r16 = r0
            boolean r15 = r1.A09
            boolean r12 = r1.A07
            boolean r11 = r1.A08
            X.Ayu r10 = r1.A04
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r9 = r1.A01
            X.AuI r8 = r1.A03
            X.AkS r7 = r1.A02
            boolean r6 = r14.A07
            r5 = 1
            if (r6 == 0) goto L28
            boolean r0 = r14.A09
            r4 = 1
            if (r0 == 0) goto L29
        L28:
            r4 = 0
        L29:
            boolean r3 = r14.A08
            X.AuI r2 = r14.A03
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r14.A01
            if (r12 == 0) goto L6f
            if (r15 != 0) goto L6f
        L33:
            r0 = r17
            r14.A06 = r0
            r14.A05 = r13
            r0 = r16
            r14.A00 = r0
            r14.A09 = r15
            r14.A07 = r12
            r14.A04 = r10
            r14.A01 = r9
            r14.A03 = r8
            r14.A02 = r7
            if (r12 != r6) goto L5d
            if (r5 != r4) goto L5d
            boolean r0 = X.C7384Etj.areEqual(r8, r2)
            if (r0 == 0) goto L5d
            if (r11 != r3) goto L5d
            long r2 = r13.A00
            boolean r0 = X.Au3.A04(r2)
            if (r0 != 0) goto L60
        L5d:
            X.AaW.A00(r14)
        L60:
            boolean r0 = X.C7384Etj.areEqual(r9, r1)
            if (r0 != 0) goto L6e
            r0 = 17
            X.BSy r0 = X.C2298BSy.A00(r14, r0)
            r9.A0F = r0
        L6e:
            return
        L6f:
            r5 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1877Asr.update(X.Aj8):void");
    }

    public C1877Asr(C1897AtH c1897AtH, TextFieldSelectionManager textFieldSelectionManager, C1518AkS c1518AkS, AuI auI, InterfaceC2128Ayu interfaceC2128Ayu, C1805ArO c1805ArO, C1YX c1yx, boolean z, boolean z2, boolean z3) {
        this.A06 = c1yx;
        this.A05 = c1805ArO;
        this.A00 = c1897AtH;
        this.A09 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A04 = interfaceC2128Ayu;
        this.A01 = textFieldSelectionManager;
        this.A03 = auI;
        this.A02 = c1518AkS;
    }
}
