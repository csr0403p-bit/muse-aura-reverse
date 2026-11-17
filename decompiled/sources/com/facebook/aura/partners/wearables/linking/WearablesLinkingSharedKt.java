package com.facebook.aura.partners.wearables.linking;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
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
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C1822Arm;
import X.C1er;
import X.C31u;
import X.C3U4;
import X.C3cH;
import X.C7384Etj;
import X.C7462Ewq;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.partners.wearables.linking.MC;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class WearablesLinkingSharedKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(WearablesLinkingSharedKt.class, "learnMoreUrl", "<v#0>", 1), new C7462Ewq(WearablesLinkingSharedKt.class, "learnMoreUrl", "<v#1>", 1)};

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt$CommsConsentDisclaimer$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $appName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$appName = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingSharedKt.CommsConsentDisclaimer(this.$appName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt$UnavailableFeaturesGrid$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $features;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<String> ahd, BRg bRg, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$features = ahd;
            this.$modifier = bRg;
            this.$textStyle = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingSharedKt.UnavailableFeaturesGrid(this.$features, this.$modifier, this.$textStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt$WearablesFailureHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C133882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1822Arm $titleStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133882(BRg bRg, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$titleStyle = c1822Arm;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingSharedKt.WearablesFailureHeader(this.$modifier, this.$titleStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt$WearablesLinkingViewEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C133892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onLinked;
        public final /* synthetic */ WearablesLinkingViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133892(WearablesLinkingViewModel wearablesLinkingViewModel, Function0<Unit> function0, int i) {
            super(2);
            this.$viewModel = wearablesLinkingViewModel;
            this.$onLinked = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingSharedKt.WearablesLinkingViewEffects(this.$viewModel, this.$onLinked, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void CommsConsentDisclaimer(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-845095816);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120bfc);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    /* renamed from: FullScreenWearablesConsentDisclosures-3IgeMak, reason: not valid java name */
    public static final void m1832FullScreenWearablesConsentDisclosures3IgeMak(String str, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-551633650);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraTypography typography = AuraTheme.INSTANCE.getTypography(bfm, 6);
            C31u<Object, String> c31uAuraMobileConfigString = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.android_lobster_wearables_v2.linking_learn_more_url);
            boolean zA1M = AnonymousClass003.A1M(bfm, c31uAuraMobileConfigString, contextA0H);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingSharedKt$FullScreenWearablesConsentDisclosures$onLearnMoreClick$1$1(contextA0H, c31uAuraMobileConfigString);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            C1822Arm c1822Arm = typography.subheadlineRegular;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c17);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingXsmall;
            BRg bRgA0B = C3U4.A0B(bs0, 0.0f, f);
            C1822Arm c1822Arm2 = typography.bodyMedium;
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c13);
            String strA0t2 = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c12);
            int i4 = ((iA0d << 9) & 57344) | 196608;
            m1831BulletSectionFc49KdA(R.drawable.hatch_logo, strA0t2, bRgA0B, strA0t, j, 24.0f, c1822Arm2, c1822Arm, strA01, function0, null, bfm, i4, 0, 1024);
            m1831BulletSectionFc49KdA(R.drawable.meta_brand_design_system_icons_vector_meta_ai_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c14), C3U4.A0B(bs0, 0.0f, f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c15), j, 24.0f, typography.bodyMedium, c1822Arm, null, null, null, bfm, i4, 0, 1792);
            m1831BulletSectionFc49KdA(R.drawable.aura_switch_toggles_outline_24, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c16), C3U4.A0B(bs0, 0.0f, f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c03), j, 24.0f, typography.bodyMedium, c1822Arm, null, null, null, bfm, i4, 0, 1792);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WearablesLinkingSharedKt$FullScreenWearablesConsentDisclosures$2(str, j, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void UnavailableFeaturesGrid(X.AHD<java.lang.String> r40, X.BRg r41, X.C1822Arm r42, X.BFM r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt.UnavailableFeaturesGrid(X.AHD, X.BRg, X.Arm, X.BFM, int, int):void");
    }

    /* renamed from: WearablesConsentDisclosures-N8B1yIo, reason: not valid java name */
    public static final void m1833WearablesConsentDisclosuresN8B1yIo(String str, long j, BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1410912207);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 12.0f;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            C31u<Object, String> c31uAuraMobileConfigString = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.android_lobster_wearables_v2.linking_learn_more_url);
            boolean zA1M = AnonymousClass003.A1M(bfm, c31uAuraMobileConfigString, contextA0H);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingSharedKt$WearablesConsentDisclosures$onLearnMoreClick$1$1(contextA0H, c31uAuraMobileConfigString);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            int i5 = (iA0d << 9) & 57344;
            m1831BulletSectionFc49KdA(R.drawable.meta_brand_design_system_icons_vector_b_circle_outline_24, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c00), null, null, j, 0.0f, null, null, null, null, ComposableSingletons$WearablesLinkingSharedKt.lambda$492369416, bfm, i5, 6, 1004);
            m1831BulletSectionFc49KdA(R.drawable.meta_brand_design_system_icons_vector_dropper_outline_20, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c01), null, null, j, 0.0f, null, null, null, null, null, bfm, i5, 0, 2028);
            m1831BulletSectionFc49KdA(R.drawable.meta_brand_design_system_icons_vector_gear_outline_20, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c02), null, null, j, 0.0f, null, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c17), function0, null, bfm, i5, 0, 1260);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WearablesLinkingSharedKt$WearablesConsentDisclosures$2(str, j, bRg2, f2, i, i2);
        }
    }

    public static final String WearablesConsentDisclosures_N8B1yIo$lambda$0(C31u<Object, String> c31u) {
        return (String) C31u.A00(c31u, $$delegatedProperties);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WearablesFailureHeader(X.BRg r25, X.C1822Arm r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt.WearablesFailureHeader(X.BRg, X.Arm, X.BFM, int, int):void");
    }

    public static final void WearablesLinkingViewEffects(WearablesLinkingViewModel wearablesLinkingViewModel, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass003.A0u(wearablesLinkingViewModel, function0);
        bfm.AgG(-1308124861);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(wearablesLinkingViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(wearablesLinkingViewModel))) {
                z = true;
            }
            boolean zA65 = bfm.A65(mutableStateA00) | z;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingSharedKt$WearablesLinkingViewEffects$1$1(wearablesLinkingViewModel, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, wearablesLinkingViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C133892(wearablesLinkingViewModel, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137  */
    /* renamed from: BulletSection-Fc49KdA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1831BulletSectionFc49KdA(int r56, java.lang.String r57, X.BRg r58, java.lang.String r59, long r60, float r62, X.C1822Arm r63, X.C1822Arm r64, java.lang.String r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r67, X.BFM r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(int, java.lang.String, X.BRg, java.lang.String, long, float, X.Arm, X.Arm, java.lang.String, kotlin.jvm.functions.Function0, X.G0V, X.BFM, int, int, int):void");
    }
}
