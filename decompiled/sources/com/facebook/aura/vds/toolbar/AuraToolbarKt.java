package com.facebook.aura.vds.toolbar;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C10G;
import X.C1335AhM;
import X.C1515AkP;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.ext.ModifierExtKt;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraToolbarKt {
    public static final long LEFT_ICON_CLICK_DEBOUNCE = 1000;

    /* renamed from: com.facebook.aura.vds.toolbar.AuraToolbarKt$AuraToolbar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerLogoContent;
        public final /* synthetic */ AuraToolbarAgent.Config $config;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraToolbarAgent.Config config, BRg bRg, String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2) {
            super(2);
            this.$config = config;
            this.$modifier = bRg;
            this.$title = str;
            this.$subtitle = str2;
            this.$content = g0v;
            this.$centerLogoContent = g0v2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            BRg bRgA01;
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                B6A b6a = new B6A(ColorExtKt.resolveColorAttribute(R.attr._name_removed__res_0x7f0405ea, bfm, 0) << 32);
                long j = B6A.A06;
                C1335AhM c1335AhMA01 = C1EQ.A01(AnonymousClass004.A17(b6a, j), 0.0f, Float.POSITIVE_INFINITY);
                boolean z = this.$config.addGradient;
                BS0 bs0 = BRg.A00;
                if (z) {
                    bRgA01 = C1b8.A02(bs0, c1335AhMA01, C1OM.A00);
                } else {
                    bRgA01 = C1b8.A01(bs0, j);
                }
                BRg bRgThen = C10G.A02(C2VU.A09, bs0, false).then(bRgA01);
                AuraToolbarAgent.Config config = this.$config;
                BRg bRg = this.$modifier;
                String str = this.$title;
                String str2 = this.$subtitle;
                G0V<BFM, Integer, Unit> g0v = this.$content;
                G0V<BFM, Integer, Unit> g0v2 = this.$centerLogoContent;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgThen);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0D);
                boolean z2 = config.shouldShowNavIcon;
                boolean zA67 = bfm.A67(config);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraToolbarKt$AuraToolbar$1$1$1$1(config);
                    bfm.Ai0(objAaT);
                }
                AuraTitleBarKt.AuraTitleBar(bRg, z2, ModifierExtKt.withDebounce(1000L, (Function0) objAaT, bfm, 6, 0), config.focusOnTitle, config, str, str2, config.navIconType, config.navIconContentDescription, g0v, g0v2, bfm, (AuraToolbarAgent.Config.$stable << 12) | (AuraToolbarAgent.NavIconType.$stable << 21), 0, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.toolbar.AuraToolbarKt$AuraToolbar$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerLogoContent;
        public final /* synthetic */ AuraToolbarAgent.Config $config;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, String str, String str2, AuraToolbarAgent.Config config, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$title = str;
            this.$subtitle = str2;
            this.$config = config;
            this.$content = g0v;
            this.$centerLogoContent = g0v2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraToolbarKt.AuraToolbar(this.$modifier, this.$title, this.$subtitle, this.$config, this.$content, this.$centerLogoContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraToolbar(X.BRg r25, java.lang.String r26, java.lang.String r27, com.facebook.aura.vds.toolbar.AuraToolbarAgent.Config r28, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r29, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r30, X.BFM r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toolbar.AuraToolbarKt.AuraToolbar(X.BRg, java.lang.String, java.lang.String, com.facebook.aura.vds.toolbar.AuraToolbarAgent$Config, X.G0V, X.G0V, X.BFM, int, int):void");
    }
}
