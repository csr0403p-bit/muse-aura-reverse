package com.facebook.aura.devices.link.ordering;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.checkout.ui.HatchFormSheetKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchLinkOrderInfoSheetKt {

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderInfoSheetKt$GetItFooter$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isLoading = z;
            this.$onContinue = function0;
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
            HatchLinkOrderInfoSheetKt.GetItFooter(this.$isLoading, this.$onContinue, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderInfoSheetKt$HatchLinkOrderInfoSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $offersPlans;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, Function0<Unit> function0) {
            super(2);
            this.$offersPlans = z;
            this.$isLoading = z2;
            this.$onContinue = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (this.$offersPlans) {
                    bfm.AgE(1027648163);
                    HatchLinkOrderInfoSheetKt.SeePlansFooter(null, bfm, 0, 1);
                } else {
                    bfm.AgE(1027693144);
                    HatchLinkOrderInfoSheetKt.GetItFooter(this.$isLoading, this.$onContinue, null, bfm, 0, 4);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderInfoSheetKt$HatchLinkOrderInfoSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $offersPlans;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z) {
            super(3);
            this.$offersPlans = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(C3U4.A0B(C10G.A02, 24.0f, 16.0f), HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.HOME_LINK_ORDER_INFO, HatchComponent.SETTINGS_SCREEN_VIEW, null, null, null, 500L, 0.0f, null, null, null);
                C3TH c3th = C2VU.A00;
                boolean z = this.$offersPlans;
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                HomeLinkProductImageKt.HomeLinkProductImage(null, bfm, 0, 1);
                int iA00 = C01N.A00(bfm, bs0, 24.0f);
                String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120b49);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchLinkOrderInfoSheetKt$HatchLinkOrderInfoSheet$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bs0, objAaT, false), C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A08(bfm, bs0, 32.0f);
                InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 32.0f, iA00);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                HatchLinkOrderInfoSheetKt.HomeLinkInfoRow(R.drawable.meta_icons_2_0_vector_signalfanhi_outline_24_wght400, AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120b44), null, bfm, 0, 4);
                int i3 = R.string._name_removed__res_0x7f120b47;
                if (z) {
                    i3 = R.string._name_removed__res_0x7f120b48;
                }
                HatchLinkOrderInfoSheetKt.HomeLinkInfoRow(R.drawable.cubeshipping_outline_24_wght400, AnonymousClass001.A0t(bfm, HatchAppName.value, i3), null, bfm, 0, 4);
                BBI.A0R(bbi, true);
                if (z) {
                    bfm.AgE(-1106167239);
                    C01N.A08(bfm, bs0, 32.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120b45), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                } else {
                    bfm.AgE(-1105857797);
                }
                BBI.A0R(bbi, false);
                C01N.A04(bfm, bbi, bs0, 24.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderInfoSheetKt$HatchLinkOrderInfoSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C115773 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $offersPlans;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115773(boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$offersPlans = z;
            this.$onContinue = function0;
            this.$onBack = function02;
            this.$isLoading = z2;
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
            HatchLinkOrderInfoSheetKt.HatchLinkOrderInfoSheet(this.$offersPlans, this.$onContinue, this.$onBack, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderInfoSheetKt$HomeLinkInfoRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C115782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115782(int i, String str, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkOrderInfoSheetKt.HomeLinkInfoRow(this.$iconRes, this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderInfoSheetKt$SeePlansFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C115792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115792(BRg bRg, int i, int i2) {
            super(2);
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
            HatchLinkOrderInfoSheetKt.SeePlansFooter(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SeePlansFooter(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1977902529);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b46);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderInfoSheetKt$SeePlansFooter$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchFormSheetKt.m347HatchFormFooteryZUFuyM(strA01, true, (Function0) objAaT, bRg2, null, null, false, bfm, ((iA0d << 9) & 7168) | 48, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115792(bRg2, i, i2);
        }
    }

    public static final void GetItFooter(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2021465641);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b43);
            boolean z2 = !z;
            boolean zA1B = AnonymousClass003.A1B(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new HatchLinkOrderInfoSheetKt$GetItFooter$1$1(z);
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRg2, (G0U) objAaT, false);
            boolean zA1O = AnonymousClass001.A1O(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == C78N.A00) {
                objAaT2 = new HatchLinkOrderInfoSheetKt$GetItFooter$2$1(function0);
                bfm.Ai0(objAaT2);
            }
            HatchFormSheetKt.m347HatchFormFooteryZUFuyM(strA01, z2, (Function0) objAaT2, bRgA01, null, null, z, bfm, (iA0n << 18) & 3670016, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, function0, bRg2, i, i2);
        }
    }

    public static final void HatchLinkOrderInfoSheet(boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(function0, 1, function02);
        bfm.AgG(-547259904);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            B81.A00(false, function02, bfm, (iA0n >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 1);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, new AuraBottomSheetHeaderConfig("", null, AuraBottomSheetHeaderConfig.AccessoryButton.Companion.back(function02), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass1(z, z2, function0), 458494969), null, function02, false, false, true, null, B1V.A00(bfm, new AnonymousClass2(z), -1173083203), bfm, ((iA0n << 12) & 3670016) | ((iA0n >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 817913862, 48, 1316);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115773(z, function0, function02, z2, bRg2, i, i2);
        }
    }

    public static final void HomeLinkInfoRow(int i, String str, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-223176178);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A00(16.0f), bfm, C2VU.A05);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.MEDIUM, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(BRg.A00, 1.0f, true), C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115782(i, str, bRg2, i2, i3);
        }
    }
}
