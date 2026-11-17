package com.facebook.aura.settings;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1DG;
import X.C1OR;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchHelpSupportSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$FeedbackCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ int $titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$titleRes = i;
            this.$onClick = function0;
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
            HatchHelpSupportSettingsScreenKt.FeedbackCard(this.$titleRes, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onContactSupport;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;
        public final /* synthetic */ Function0<Unit> $onSubmitReport;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<Unit> function0, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function02) {
            super(4);
            this.$onSubmitReport = function0;
            this.$onOpenHelpCenter = g0v;
            this.$onContactSupport = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1952invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1952invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            boolean z;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            boolean z2 = true;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = C06G.A0O(bfm, AnonymousClass006.A0M(bfm));
            Function0<Unit> function0 = this.$onSubmitReport;
            G0V<String, String, Unit> g0v = this.$onOpenHelpCenter;
            Function0<Unit> function02 = this.$onContactSupport;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0O);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            int i2 = R.string._name_removed__res_0x7f120c1e;
            if (function0 == null) {
                z2 = false;
                i2 = R.string._name_removed__res_0x7f120c1f;
            }
            boolean zA1W = AnonymousClass004.A1W(bfm, function02, z2, bfm.A65(g0v));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$1$1(g0v, z2, function02);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            String metaHomeLinkSupportUrl = HatchUtil.INSTANCE.getMetaHomeLinkSupportUrl();
            if (metaHomeLinkSupportUrl != null) {
                bfm.AgE(474743965);
                if (function0 != null) {
                    boolean zA1Y = AnonymousClass001.A1Y(function0, bfm, 474772051);
                    Object objAaT2 = bfm.AaT();
                    if (zA1Y || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$2$1(function0);
                        bfm.Ai0(objAaT2);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, true, null, 0L, (G0U) objAaT2, bfm, 54, 6);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(474906591);
                    BBI.A0R(bbi, false);
                }
                HatchHelpSupportSettingsScreenKt.MetaHomeLinkSupportText(metaHomeLinkSupportUrl, g0v, null, bfm, 0, 4);
                boolean zA63 = bfm.A63(i2);
                Object objAaT3 = bfm.AaT();
                if (zA63 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$3$1(i2);
                    bfm.Ai0(objAaT3);
                }
                z = true;
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, true, null, 0L, (G0U) objAaT3, bfm, 54, 6);
            } else {
                boolean zA1a = AnonymousClass001.A1a(AnonymousClass001.A1Y(function0, bfm, 475190086), bfm, i2);
                Object objAaT4 = bfm.AaT();
                if (zA1a || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$1$1$4$1(function0, i2);
                    bfm.Ai0(objAaT4);
                }
                z = true;
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, true, null, 0L, (G0U) objAaT4, bfm, 54, 6);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2, z);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HatchHelpSupportSettingsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C135362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onContactSupport;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;
        public final /* synthetic */ Function0<Unit> $onSubmitReport;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135362(Function0<Unit> function0, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function02, BRg bRg, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onOpenHelpCenter = g0v;
            this.$onContactSupport = function02;
            this.$modifier = bRg;
            this.$onSubmitReport = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchHelpSupportSettingsScreenKt.HatchHelpSupportSettingsScreen(this.$onBack, this.$onOpenHelpCenter, this.$onContactSupport, this.$modifier, this.$onSubmitReport, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$HelpCenterCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135372(G0V<? super String, ? super String, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$onOpenHelpCenter = g0v;
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
            HatchHelpSupportSettingsScreenKt.HelpCenterCard(this.$onOpenHelpCenter, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$MetaHomeLinkSupportText$2, reason: invalid class name and case insensitive filesystem */
    public final class C135382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenHelpCenter;
        public final /* synthetic */ String $supportUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135382(String str, G0V<? super String, ? super String, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$supportUrl = str;
            this.$onOpenHelpCenter = g0v;
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
            HatchHelpSupportSettingsScreenKt.MetaHomeLinkSupportText(this.$supportUrl, this.$onOpenHelpCenter, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$ReportAnIssueCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135392 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135392(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            HatchHelpSupportSettingsScreenKt.ReportAnIssueCard(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchHelpSupportSettingsScreenKt$ShakeToReportCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135402(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$titleRes = i;
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
            HatchHelpSupportSettingsScreenKt.ShakeToReportCard(this.$titleRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void FeedbackCard(int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1284826933);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, i), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i5, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
            boolean zA1O = AnonymousClass001.A1O(iA0D);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchHelpSupportSettingsScreenKt$FeedbackCard$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, function0, bRg2, i2, i3);
        }
    }

    public static final void HatchHelpSupportSettingsScreen(Function0<Unit> function0, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function02, BRg bRg, Function0<Unit> function03, BFM bfm, int i, int i2) {
        Function0<Unit> function04 = function03;
        BRg bRg2 = bRg;
        AnonymousClass005.A10(function0, g0v, function02);
        bfm.AgG(756191144);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function04);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function04 = null;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120701), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.HELP_SUPPORT), false, B1V.A00(bfm, new AnonymousClass1(function04, g0v, function02), -2026272531), bfm, AnonymousClass007.A03(iA0T >> 6, iA0T), 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135362(function0, g0v, function02, bRg2, function04, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HelpCenterCard(G0V<? super String, ? super String, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-102959995);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120c1b);
            AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(strA0v), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
            boolean zA65 = bfm.A65(strA0v) | AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchHelpSupportSettingsScreenKt$HelpCenterCard$1$1(g0v, strA0v);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135372(g0v, bRg2, i, i2);
        }
    }

    public static final void MetaHomeLinkSupportText(String str, G0V<? super String, ? super String, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1189493142);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c1d);
            String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f120c1c);
            long jA07 = C06G.A07(bfm);
            boolean zA1T = AnonymousClass002.A1T(bfm, jA07, AnonymousClass003.A1B(iA0d), AnonymousClass003.A1K(bfm, strA0t, strA01));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0t);
                int iA09 = AnonymousClass007.A09(strA0t, strA01);
                if (iA09 >= 0) {
                    long j = C1809ArT.A01;
                    C1824Aro c1824Aro = new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA07, j, j, B6A.A07);
                    int length = strA01.length() + iA09;
                    c1731ApSA0X.A0A(c1824Aro, iA09, length);
                    c1731ApSA0X.A0B(new C1OR(str), iA09, length);
                }
                objAaT = c1731ApSA0X.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            long jA08 = C06G.A08(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f, f, f, 0.0f);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA01, bfm.A65(apQ), (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new HatchHelpSupportSettingsScreenKt$MetaHomeLinkSupportText$1$1(apQ, g0v, strA01);
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, bRgA0C, (G0U) objAaT2, null, null, null, false, jA08, c1822ArmA0Y, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 1048184);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135382(str, g0v, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ReportAnIssueCard(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1122540343);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120c21), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i4, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
            boolean zA1M = AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchHelpSupportSettingsScreenKt$ReportAnIssueCard$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135392(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ShakeToReportCard(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(552279997);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = contextA0H.getSharedPreferences(AuraRageShakeManager.PREFS_NAME, 0);
                bfm.Ai0(objAaT);
            }
            SharedPreferences sharedPreferences = (SharedPreferences) objAaT;
            Object objAaT2 = bfm.AaT();
            BO6 bo6 = null;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            Object[] objArr13 = 0;
            Object[] objArr14 = 0;
            Object[] objArr15 = 0;
            Object[] objArr16 = 0;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0S(bfm, sharedPreferences.getBoolean(AuraRageShakeManager.PREF_KEY_ENABLED, true));
            }
            MutableState mutableState = (MutableState) objAaT2;
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, i), AuraIconAndHeadlineStyle.BODY_REGULAR, bo6, (B6A) (objArr16 == true ? 1 : 0), (ApQ) (objArr15 == true ? 1 : 0), (G0U) (objArr14 == true ? 1 : 0), (AuraIconAndBodyStyle) (objArr13 == true ? 1 : 0), (B6A) (objArr12 == true ? 1 : 0), (String) (objArr11 == true ? 1 : 0), (C1822Arm) (objArr10 == true ? 1 : 0), i5, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (objArr9 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (objArr8 == true ? 1 : 0), (C1822Arm) (objArr7 == true ? 1 : 0), j, j, (C1YL) (objArr6 == true ? 1 : 0), 2097148, (C06H) (objArr5 == true ? 1 : 0));
            Boolean boolValueOf = Boolean.valueOf(MutableState.A0A(mutableState));
            boolean zA67 = bfm.A67(sharedPreferences);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchHelpSupportSettingsScreenKt$ShakeToReportCard$1$1(sharedPreferences, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, boolValueOf, (G0U) objAaT3, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 261744);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135402(i, bRg2, i2, i3);
        }
    }

    public static final void logHelpSupportClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.HELP_SUPPORT, HatchScreen.HELP_SUPPORT, hatchComponent, null, null, null);
    }
}
