package X;

/* renamed from: X.FRb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8049FRb extends AbstractC8051FRe {
    public FRa A00;
    public final CharSequence A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8049FRb(C8053FRg c8053FRg, CharSequence charSequence) {
        super(c8053FRg);
        C7384Etj.A0Y(charSequence, 1);
        this.A01 = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (((X.HiO) r1).A00 == r2) goto L13;
     */
    @Override // X.AbstractC8051FRe, X.C8053FRg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.FRa getAccessibilityNodeProvider(android.view.View r5) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.FRa r0 = super.getAccessibilityNodeProvider(r5)
            r3 = 0
            if (r0 == 0) goto L27
            java.lang.Object r2 = r0.A00
        Ld:
            boolean r0 = r2 instanceof android.view.accessibility.AccessibilityNodeProvider
            if (r0 == 0) goto L26
            android.view.accessibility.AccessibilityNodeProvider r2 = (android.view.accessibility.AccessibilityNodeProvider) r2
            if (r2 == 0) goto L26
            X.FRa r3 = r4.A00
            if (r3 == 0) goto L29
            java.lang.Object r1 = r3.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.foa.cds.picker.CDSDateTimePickerUtils.DayCellNodeProvider"
            X.C7384Etj.A0Z(r1, r0)
            X.HiO r1 = (X.HiO) r1
            android.view.accessibility.AccessibilityNodeProvider r0 = r1.A00
            if (r0 != r2) goto L29
        L26:
            return r3
        L27:
            r2 = r3
            goto Ld
        L29:
            java.lang.CharSequence r1 = r4.A01
            X.HiO r0 = new X.HiO
            r0.<init>(r2, r1)
            X.FRa r3 = new X.FRa
            r3.<init>(r0)
            r4.A00 = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8049FRb.getAccessibilityNodeProvider(android.view.View):X.FRa");
    }
}
