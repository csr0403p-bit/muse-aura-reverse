package X;

import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;

/* loaded from: classes6.dex */
public final class FMd implements FHL {
    public static final EnumC7951FMh A0Q;
    public static final EnumC7952FMi A0R;
    public static final EnumC7950FMg A0S;
    public static final EnumC7949FMf A0T;
    public static final EnumC7948FMe A0U;
    public static final String A0V;
    public HiG A00;
    public HiG A01;
    public CdsOpenScreenCallerDismissCallback A02;
    public EnumC7949FMf A03;
    public G0U<?, Boolean> A04;
    public final int A05;
    public final CcvBloksHelperKt.AnonymousClass5 A06;
    public final ColorData A07;
    public final ColorData A08;
    public final CdsBottomSheetDimmingBehaviour A09;
    public final EnumC7951FMh A0A;
    public final CdsOpenScreenConfig$BottomSheetMargins A0B;
    public final EnumC7952FMi A0C;
    public final EnumC7950FMg A0D;
    public final EnumC7949FMf A0E;
    public final EnumC7948FMe A0F;
    public final EnumC7946FMb A0G;
    public final Integer A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final Integer A0O;
    public final boolean A0P;

    static {
        String strA01 = C0861A6i.A01(FMd.class);
        C7384Etj.A0Z(strA01, "null cannot be cast to non-null type kotlin.String");
        A0V = strA01;
        A0T = EnumC7949FMf.A03;
        A0U = EnumC7948FMe.A04;
        A0Q = EnumC7951FMh.A06;
        A0R = EnumC7952FMi.A03;
        A0S = EnumC7950FMg.A03;
    }

    public static final FMd A00(EnumC7948FMe enumC7948FMe, int i) {
        Integer num = C79.A0C;
        EnumC7949FMf enumC7949FMf = A0T;
        EnumC7951FMh enumC7951FMh = A0Q;
        EnumC7950FMg enumC7950FMg = A0S;
        EnumC7952FMi enumC7952FMi = A0R;
        if (FP4.A00.supportXMDSThreeBackground()) {
            enumC7952FMi = EnumC7952FMi.A04;
        }
        return new FMd(null, null, null, null, null, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC7951FMh, null, enumC7952FMi, enumC7950FMg, enumC7949FMf, null, enumC7948FMe, null, num, null, null, i, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.FOY A01() {
        /*
            r54 = this;
            r0 = r54
            X.FMe r2 = r0.A0F
            boolean r1 = r0.A0N
            X.FPN r11 = X.AbstractC7989FOg.A00(r2, r1)
            boolean r1 = r0.A0P
            if (r1 == 0) goto Lab
            X.FMj r24 = X.EnumC7953FMj.A04
        L10:
            X.FMb r10 = r0.A0G
            if (r10 != 0) goto L26
            java.lang.Integer r1 = r0.A0H
            if (r1 == 0) goto La7
            int r2 = r1.intValue()
            r1 = 16
            if (r2 == r1) goto La4
            r1 = 32
            if (r2 == r1) goto La7
            X.FMb r10 = X.EnumC7946FMb.A05
        L26:
            java.lang.Integer r1 = r0.A0O
            r21 = r1
            X.FMf r1 = r0.A03
            r20 = r1
            X.FMh r1 = r0.A0A
            r19 = r1
            X.FMg r1 = r0.A0D
            r18 = r1
            X.HiG r1 = r0.A00
            r17 = r1
            X.HiG r15 = r0.A01
            boolean r14 = r0.A0K
            boolean r13 = r0.A0J
            com.facebook.dsp.core.ColorData r12 = r0.A08
            com.facebook.dsp.core.ColorData r9 = r0.A07
            com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins r8 = r0.A0B
            X.FMi r7 = r0.A0C
            r22 = 0
            com.meta.foa.cds.CdsOpenScreenCallerDismissCallback r6 = r0.A02
            com.facebook.aura.ccv.CcvBloksHelperKt$openAccountLinkingUpsellBloksScreen$5 r5 = r0.A06
            r44 = 0
            boolean r4 = r0.A0M
            boolean r3 = r0.A0L
            com.meta.foa.cds.CdsBottomSheetDimmingBehaviour r2 = r0.A09
            boolean r1 = r0.A0I
            X.G0U<?, java.lang.Boolean> r0 = r0.A04
            X.FOY r16 = new X.FOY
            r23 = r22
            r26 = r22
            r32 = r20
            r33 = r11
            r34 = r10
            r35 = r22
            r36 = r22
            r37 = r22
            r38 = r22
            r39 = r21
            r40 = r22
            r41 = r0
            r42 = r14
            r43 = r13
            r45 = r44
            r46 = r44
            r47 = r4
            r48 = r44
            r49 = r3
            r50 = r1
            r51 = r44
            r52 = r44
            r53 = r44
            r54 = r44
            r25 = r2
            r27 = r6
            r28 = r19
            r29 = r8
            r30 = r7
            r31 = r18
            r18 = r15
            r19 = r5
            r20 = r12
            r21 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return r16
        La4:
            X.FMb r10 = X.EnumC7946FMb.A04
            goto L26
        La7:
            X.FMb r10 = X.EnumC7946FMb.A02
            goto L26
        Lab:
            boolean r2 = r0.A0M
            r1 = 0
            X.C7384Etj.A0Y(r11, r1)
            boolean r1 = r11.AFw()
            if (r1 == 0) goto Lbb
            X.FMj r24 = X.EnumC7953FMj.A05
            goto L10
        Lbb:
            if (r2 != 0) goto Lc1
            X.FMj r24 = X.EnumC7953FMj.A02
            goto L10
        Lc1:
            X.FMj r24 = X.EnumC7953FMj.A03
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FMd.A01():X.FOY");
    }

    @Override // X.FHL
    public final Integer AIw() {
        return Integer.valueOf(this.A05);
    }

    @Override // X.FHL
    public final int AK5() {
        return this.A05;
    }

    public FMd(HiG hiG, HiG hiG2, CcvBloksHelperKt.AnonymousClass5 anonymousClass5, ColorData colorData, ColorData colorData2, CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback, EnumC7951FMh enumC7951FMh, CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins, EnumC7952FMi enumC7952FMi, EnumC7950FMg enumC7950FMg, EnumC7949FMf enumC7949FMf, EnumC7949FMf enumC7949FMf2, EnumC7948FMe enumC7948FMe, EnumC7946FMb enumC7946FMb, Integer num, Integer num2, G0U g0u, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A05 = i;
        this.A0O = num;
        this.A03 = enumC7949FMf;
        this.A0F = enumC7948FMe;
        this.A0A = enumC7951FMh;
        this.A0D = enumC7950FMg;
        this.A0H = num2;
        this.A00 = hiG;
        this.A01 = hiG2;
        this.A0K = z;
        this.A0J = z2;
        this.A08 = colorData;
        this.A07 = colorData2;
        this.A0B = cdsOpenScreenConfig$BottomSheetMargins;
        this.A0C = enumC7952FMi;
        this.A02 = cdsOpenScreenCallerDismissCallback;
        this.A06 = anonymousClass5;
        this.A0M = z3;
        this.A0L = z4;
        this.A09 = cdsBottomSheetDimmingBehaviour;
        this.A0G = enumC7946FMb;
        this.A0P = z5;
        this.A0I = z6;
        this.A0N = z7;
        this.A04 = g0u;
        this.A0E = enumC7949FMf2;
    }
}
