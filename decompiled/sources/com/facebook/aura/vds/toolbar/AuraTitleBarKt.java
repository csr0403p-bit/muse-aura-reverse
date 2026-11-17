package com.facebook.aura.vds.toolbar;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C2VU;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraTitleBarKt {
    public static final float ICON_BADGE_CUTOUT_BORDER_SIZE_DP = 2.0f;

    /* renamed from: com.facebook.aura.vds.toolbar.AuraTitleBarKt$AuraTitleBar$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerLogoContent;
        public final /* synthetic */ AuraToolbarAgent.Config $config;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $focusOnTitle;
        public final /* synthetic */ AuraToolbarAgent.NavIconType $leftIconType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $navIconContentDescription;
        public final /* synthetic */ Function0<Unit> $onLeftIconClick;
        public final /* synthetic */ boolean $shouldShowNavIcon;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BRg bRg, boolean z, Function0<Unit> function0, boolean z2, AuraToolbarAgent.Config config, String str, String str2, AuraToolbarAgent.NavIconType navIconType, String str3, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$shouldShowNavIcon = z;
            this.$onLeftIconClick = function0;
            this.$focusOnTitle = z2;
            this.$config = config;
            this.$title = str;
            this.$subtitle = str2;
            this.$leftIconType = navIconType;
            this.$navIconContentDescription = str3;
            this.$content = g0v;
            this.$centerLogoContent = g0v2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTitleBarKt.AuraTitleBar(this.$modifier, this.$shouldShowNavIcon, this.$onLeftIconClick, this.$focusOnTitle, this.$config, this.$title, this.$subtitle, this.$leftIconType, this.$navIconContentDescription, this.$content, this.$centerLogoContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.toolbar.AuraTitleBarKt$Content$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTitleBarKt.Content(this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraTitleBar(X.BRg r42, boolean r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, boolean r45, com.facebook.aura.vds.toolbar.AuraToolbarAgent.Config r46, java.lang.String r47, java.lang.String r48, com.facebook.aura.vds.toolbar.AuraToolbarAgent.NavIconType r49, java.lang.String r50, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r51, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r52, X.BFM r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toolbar.AuraTitleBarKt.AuraTitleBar(X.BRg, boolean, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.vds.toolbar.AuraToolbarAgent$Config, java.lang.String, java.lang.String, com.facebook.aura.vds.toolbar.AuraToolbarAgent$NavIconType, java.lang.String, X.G0V, X.G0V, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* renamed from: TitleBarIcon-lHeK6k0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3120TitleBarIconlHeK6k0(kotlin.jvm.functions.Function0<kotlin.Unit> r40, int r41, X.BRg r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, java.lang.String r44, boolean r45, com.facebook.aura.vds.toolbar.IconBadgeLocation r46, X.B6A r47, long r48, boolean r50, boolean r51, com.facebook.aura.vds.compose.icons.AuraIconButtonStyle r52, boolean r53, X.BFM r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toolbar.AuraTitleBarKt.m3120TitleBarIconlHeK6k0(kotlin.jvm.functions.Function0, int, X.BRg, kotlin.jvm.functions.Function0, java.lang.String, boolean, com.facebook.aura.vds.toolbar.IconBadgeLocation, X.B6A, long, boolean, boolean, com.facebook.aura.vds.compose.icons.AuraIconButtonStyle, boolean, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* renamed from: TitleBarIcon-zILrveg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3121TitleBarIconzILrveg(kotlin.jvm.functions.Function0<kotlin.Unit> r50, int r51, X.BRg r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, java.lang.String r54, boolean r55, com.facebook.aura.vds.toolbar.IconBadgeLocation r56, kotlin.jvm.functions.Function0<X.B6A> r57, long r58, boolean r60, boolean r61, com.facebook.aura.vds.compose.icons.AuraIconButtonStyle r62, boolean r63, X.BFM r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toolbar.AuraTitleBarKt.m3121TitleBarIconzILrveg(kotlin.jvm.functions.Function0, int, X.BRg, kotlin.jvm.functions.Function0, java.lang.String, boolean, com.facebook.aura.vds.toolbar.IconBadgeLocation, kotlin.jvm.functions.Function0, long, boolean, boolean, com.facebook.aura.vds.compose.icons.AuraIconButtonStyle, boolean, X.BFM, int, int, int):void");
    }

    public static final C1822Arm titleStyle(AuraTypography auraTypography, AuraContainer auraContainer, boolean z, String str) {
        return str == null ? (z || (auraContainer instanceof AuraContainer.AuraBottomSheet)) ? auraTypography.bodyMedium : auraTypography.title3Regular : auraTypography.subheadlineMedium;
    }

    public static final void Content(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(-404752026);
        int i3 = i2 & 1;
        int iA0T = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            if (i3 != 0) {
                g0v = ComposableSingletons$AuraTitleBarKt.lambda$1057878867;
            }
            BRg bRgA01 = C10G.A01(C2VU.A04, BRg.A00, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0T);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(g0v, i, i2);
        }
    }
}
