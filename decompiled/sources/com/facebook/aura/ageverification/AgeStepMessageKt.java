package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AgeStepMessageKt {

    /* renamed from: com.facebook.aura.ageverification.AgeStepMessageKt$AgeStepErrorCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOtherMethods;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$onOtherMethods = function0;
            this.$modifier = bRg;
            this.$onRetry = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeStepMessageKt.AgeStepErrorCard(this.$onOtherMethods, this.$modifier, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgeStepErrorCard(Function0<Unit> function0, BRg bRg, Function0<Unit> function02, BFM bfm, int i, int i2) {
        Function0<Unit> function03 = function02;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-1188590122);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function03 = null;
            }
            m208AgeStepMessageFItCLgY(bRg2, Integer.valueOf(R.string._name_removed__res_0x7f12006f), Integer.valueOf(R.string._name_removed__res_0x7f12006e), false, function03 != null ? new AgeStepAction(R.string._name_removed__res_0x7f120234, function03) : null, false, new AgeStepAction(R.string._name_removed__res_0x7f120077, function0), Integer.valueOf(R.drawable.exclamation_triangle_outline_svg), 0L, null, bfm, (iA0T >> 3) & 14, 808);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, function03, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* renamed from: AgeStepText-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m209AgeStepTextFHprtrg(java.lang.String r33, java.lang.String r34, X.BRg r35, java.lang.Integer r36, long r37, X.C1822Arm r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeStepMessageKt.m209AgeStepTextFHprtrg(java.lang.String, java.lang.String, X.BRg, java.lang.Integer, long, X.Arm, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.facebook.aura.vds.compose.button.AuraButtonStyles] */
    /* JADX WARN: Type inference failed for: r28v1, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r28v2, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.facebook.aura.vds.compose.button.AuraLabelButtonStyle] */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.facebook.aura.vds.compose.button.AuraButtonSize] */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.facebook.aura.vds.compose.button.AuraButtonSize] */
    /* JADX WARN: Type inference failed for: r32v1, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r32v2, types: [X.G0W] */
    /* JADX WARN: Type inference failed for: r38v0, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r38v1, types: [X.AWd] */
    /* JADX WARN: Type inference failed for: r39v0, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r39v1, types: [X.1Yg] */
    /* JADX WARN: Type inference failed for: r42v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r42v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r43v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r43v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r44v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r44v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r45v0, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r45v1, types: [X.G0V] */
    /* JADX WARN: Type inference failed for: r46v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r46v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r47v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r47v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r48v0, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.facebook.aura.vds.compose.button.AuraButtonAccessibility] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r63v0, types: [X.BFM] */
    /* JADX WARN: Type inference failed for: r6v28, types: [com.facebook.aura.vds.compose.button.AuraButtonCorner] */
    /* renamed from: AgeStepMessage-FItCLgY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m208AgeStepMessageFItCLgY(X.BRg r52, java.lang.Integer r53, java.lang.Integer r54, boolean r55, com.facebook.aura.ageverification.AgeStepAction r56, boolean r57, com.facebook.aura.ageverification.AgeStepAction r58, java.lang.Integer r59, long r60, java.lang.String r62, X.BFM r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.AgeStepMessageKt.m208AgeStepMessageFItCLgY(X.BRg, java.lang.Integer, java.lang.Integer, boolean, com.facebook.aura.ageverification.AgeStepAction, boolean, com.facebook.aura.ageverification.AgeStepAction, java.lang.Integer, long, java.lang.String, X.BFM, int, int):void");
    }
}
