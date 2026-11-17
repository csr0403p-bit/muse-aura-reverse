package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C15z;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.vds.compose.header.AuraPageHeaderKt;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchHeaderKt {

    /* renamed from: com.facebook.aura.header.view.HatchHeaderKt$HatchTitleBar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$content = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchHeaderKt.HatchTitleBar(this.$content, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchTitleBar(G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(771179116);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraPageHeaderKt.AuraPageHeader(C15z.A00(bfm, bRg), null, null, HeaderButtonKt.HatchHeaderConfig, false, g0v, null, bfm, AnonymousClass001.A08(iA0T << 15, (AuraToolbarAgent.Config.$stable << 9) | RuntimeInternals.IOPRIO_BACKGROUND), 70);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(g0v, bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* renamed from: HatchHeaderContent-yBXNGS4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m993HatchHeaderContentyBXNGS4(final com.facebook.aura.header.view.HatchHeaderTitleAlignment r26, X.BRg r27, float r28, X.C1AC r29, kotlin.jvm.functions.Function0<java.lang.Boolean> r30, boolean r31, boolean r32, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r33, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r34, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchHeaderKt.m993HatchHeaderContentyBXNGS4(com.facebook.aura.header.view.HatchHeaderTitleAlignment, X.BRg, float, X.1AC, kotlin.jvm.functions.Function0, boolean, boolean, X.G0V, X.G0V, X.G0V, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* renamed from: HatchPageHeader-OT94q8g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m994HatchPageHeaderOT94q8g(java.lang.String r52, java.lang.String r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, X.BRg r55, com.facebook.aura.header.view.HatchHeaderTitleAlignment r56, boolean r57, int r58, java.lang.String r59, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r60, boolean r61, X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r62, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r63, X.AHD<com.facebook.aura.header.api.HeaderAction> r64, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r65, long r66, long r68, X.C1822Arm r70, X.BRg r71, int r72, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r73, com.facebook.aura.header.view.HatchBackClickAnalytics r74, boolean r75, X.BFM r76, int r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchHeaderKt.m994HatchPageHeaderOT94q8g(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.header.view.HatchHeaderTitleAlignment, boolean, int, java.lang.String, X.G0V, boolean, X.AHD, X.G0U, X.AHD, X.G0V, long, long, X.Arm, X.BRg, int, X.G0V, com.facebook.aura.header.view.HatchBackClickAnalytics, boolean, X.BFM, int, int, int, int):void");
    }
}
