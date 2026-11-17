package com.facebook.aura.rentalcars;

import X.AKQ;
import X.ARD;
import X.AXN;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BOD;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5wL;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchHeaderScrimKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.ScrimConfig;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.rentalcars.RentalCarLoadState;
import com.facebook.aura.rentalcars.RentalCarResultsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.LocalDate;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class RentalCarResultsScreenKt {

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsScreenKt$RentalCarListRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageSharedKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ RentalCarRate $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RentalCarRate rentalCarRate, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$rate = rentalCarRate;
            this.$imageSharedKey = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsScreenKt.RentalCarListRow(this.$rate, this.$imageSharedKey, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsScreenKt$RentalCarResultsHeading$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $dates;
        public final /* synthetic */ String $location;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$location = str2;
            this.$dates = str3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsScreenKt.RentalCarResultsHeading(this.$title, this.$location, this.$dates, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsScreenKt$RentalCarResultsHeadingDetail$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsScreenKt.RentalCarResultsHeadingDetail(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsScreenKt$RentalCarResultsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C134643 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $dates;
        public final /* synthetic */ RentalCarResultsHeader $header;
        public final /* synthetic */ C00r $headingHeightPx$delegate;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134643(String str, RentalCarResultsHeader rentalCarResultsHeader, String str2, C00r c00r) {
            super(2);
            this.$title = str;
            this.$header = rentalCarResultsHeader;
            this.$dates = str2;
            this.$headingHeightPx$delegate = c00r;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String str = this.$title;
            RentalCarResultsHeader rentalCarResultsHeader = this.$header;
            String str2 = rentalCarResultsHeader != null ? rentalCarResultsHeader.locationName : null;
            String str3 = this.$dates;
            BS0 bs0 = BRg.A00;
            C00r c00r = this.$headingHeightPx$delegate;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new RentalCarResultsScreenKt$RentalCarResultsScreen$3$1$1(c00r);
                bfm.Ai0(objAaT);
            }
            RentalCarResultsScreenKt.RentalCarResultsHeading(str, str2, str3, BIj.A00(bs0, (G0U) objAaT), bfm, 3072, 0);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsScreenKt$RentalCarResultsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ RentalCarResultsScreenKey $key;
        public final /* synthetic */ C1BO<RentalCarLoadState<RentalCarResultsUiState>> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(RentalCarResultsScreenKey rentalCarResultsScreenKey, C1BO<? extends RentalCarLoadState<RentalCarResultsUiState>> c1bo) {
            super(4);
            this.$key = rentalCarResultsScreenKey;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1887invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1887invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            RentalCarLoadState<RentalCarResultsUiState> value = this.$state$delegate.getValue();
            if (C7384Etj.areEqual(value, RentalCarLoadState.Loading.INSTANCE)) {
                bfm.AgE(1414520769);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C3U4.A04(C10G.A01, f), bfm, 0, 0);
            } else if (C7384Etj.areEqual(value, RentalCarLoadState.Unavailable.INSTANCE)) {
                bfm.AgE(1414524972);
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205ae), null, C3U4.A04(C10G.A01, f), null, null, null, null, bfm, 0, 122);
            } else {
                if (!(value instanceof RentalCarLoadState.Loaded)) {
                    throw AnonymousClass005.A0k(bfm, 1414518915);
                }
                bfm.AgE(1414532425);
                RentalCarResultsScreenKt.m1884RentalCarResultsListvz2T9sI(((RentalCarResultsUiState) ((RentalCarLoadState.Loaded) value).value).results, this.$key, f, f2, null, bfm, (iA04 << 6) & 8064, 16);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsScreenKt$RentalCarResultsScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RentalCarResultsScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RentalCarResultsScreenKey rentalCarResultsScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = rentalCarResultsScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsScreenKt.RentalCarResultsScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void RentalCarListRow(RentalCarRate rentalCarRate, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(512770833);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarRate) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA05 = C0v5.A05(AnonymousClass001.A0R(bRg2), null, function0, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = RentalCarResultsScreenKt$RentalCarListRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0Y(bRgA05, objAaT, true), AuraDimensKt.SpacingMedium, 5.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            String str2 = rentalCarRate.car.imageUrl;
            BS0 bs0 = BRg.A00;
            RentalCarImageKt.m1882RentalCarImage6PoWaU8(str2, str, C10G.A07(bs0, 80.0f), 0.0f, 0.0f, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 24);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            float f = AuraDimensKt.SpacingNano;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str3 = rentalCarRate.car.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            int i4 = iA0d & 14;
            AuraTextKt.m2639AuraTextUY9GdpU(RentalCarFormattingKt.rentalCarSupplierLine(rentalCarRate, bfm, i4), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            String strRentalCarSpecsLine = RentalCarFormattingKt.rentalCarSpecsLine(rentalCarRate, bfm, i4);
            if (strRentalCarSpecsLine == null) {
                bfm.AgE(1845104318);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strRentalCarSpecsLine, null, C3cH.A05(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1845104319).subheadlineRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, 9.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, C2VU.A01, f, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(RentalCarFormattingKt.formatted(rentalCarRate.total, C60Q.A0w(), true), null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a9), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(rentalCarRate, str, function0, bRg2, i, i2);
        }
    }

    public static final void RentalCarResultsHeading(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1596292885);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(bRg2, AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = RentalCarResultsScreenKt$RentalCarResultsHeading$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bs0, (G0U) objAaT, false), jA06, c1822ArmA0D, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            if (str2 == null) {
                bfm.AgE(-347619438);
            } else {
                bfm.AgE(-347619437);
                RentalCarResultsHeadingDetail(str2, null, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            if (str3 == null) {
                bfm.AgE(-347559918);
            } else {
                bfm.AgE(-347559917);
                RentalCarResultsHeadingDetail(str3, null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, bRg2, i, i2);
        }
    }

    public static final void RentalCarResultsHeadingDetail(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1152700324);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14768);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    /* renamed from: RentalCarResultsList-vz2T9sI, reason: not valid java name */
    public static final void m1884RentalCarResultsListvz2T9sI(RentalCarResults rentalCarResults, RentalCarResultsScreenKey rentalCarResultsScreenKey, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(422986631);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarResults) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, rentalCarResultsScreenKey);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRg2, C10G.A01);
            float f3 = AuraDimensKt.SpacingMedium;
            BRg bRgA07 = C3U4.A07(bRgA0H, f3);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                BS0 bs0 = BRg.A00;
                C01N.A08(bfm, bs0, f);
                String strA0I = C3cJ.A0I(bfm, rentalCarResults.rates, R.plurals._name_removed__res_0x7f100012, rentalCarResults.rates.size());
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0I, C3U4.A0B(bs0, f3, AuraDimensKt.SpacingXsmall), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BRg bRgA012 = C1b8.A01(C11U.A03(C10G.A02, auraTheme.getShapes(bfm, 6).card), auraTheme.getColors(bfm, 6).elevated);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA012);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                bfm.AgE(-1878751264);
                int i4 = 0;
                for (Object obj : rentalCarResults.rates) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        RentalCarRate rentalCarRate = (RentalCarRate) obj;
                        bfm.Ag8(-455440825, bfm.APR(Integer.valueOf(i4), rentalCarRate.rateId));
                        String strRentalCarImageSharedKey = RentalCarImageKt.rentalCarImageSharedKey(rentalCarResultsScreenKey.hostMessageId, rentalCarResultsScreenKey.presentationId, i4, true);
                        boolean zA1W = AnonymousClass002.A1W(bfm, rentalCarRate, AnonymousClass003.A1M(bfm, auraNavigatorA0b, rentalCarResultsScreenKey), bfm.A63(i4));
                        Object objAaT = bfm.AaT();
                        if (zA1W || objAaT == C78N.A00) {
                            objAaT = new RentalCarResultsScreenKt$RentalCarResultsList$1$1$1$1$1(auraNavigatorA0b, rentalCarResultsScreenKey, i4, rentalCarRate);
                            bfm.Ai0(objAaT);
                        }
                        RentalCarListRow(rentalCarRate, strRentalCarImageSharedKey, (Function0) objAaT, null, bfm, 0, 8);
                        BBI.A0R(bbi, false);
                        i4 = i5;
                    }
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                C01N.A04(bfm, bbi, bs0, f2 + f3, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new RentalCarResultsScreenKt$RentalCarResultsList$2(rentalCarResults, rentalCarResultsScreenKey, f, f2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void RentalCarResultsScreen(RentalCarResultsScreenKey rentalCarResultsScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        RentalCarLoadState.Loaded loaded;
        RentalCarResultsUiState rentalCarResultsUiState;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(rentalCarResultsScreenKey, 0);
        bfm.AgG(864222639);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, rentalCarResultsScreenKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String string = rentalCarResultsScreenKey.toString();
            RentalCarResultsViewModel.Factory factory = new RentalCarResultsViewModel.Factory(rentalCarResultsScreenKey, AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((RentalCarResultsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), RentalCarResultsViewModel.class, string)).uiState);
            Object objA6v = bfm.A6v(AuraNavigatorKt.LocalNavigator);
            RentalCarLoadState rentalCarLoadState = (RentalCarLoadState) c1boA02.getValue();
            String rentalDateRange = null;
            RentalCarResultsHeader rentalCarResultsHeader = (!(rentalCarLoadState instanceof RentalCarLoadState.Loaded) || (loaded = (RentalCarLoadState.Loaded) rentalCarLoadState) == null || (rentalCarResultsUiState = (RentalCarResultsUiState) loaded.value) == null) ? null : rentalCarResultsUiState.header;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a2);
            if (rentalCarResultsHeader != null) {
                LocalDate localDate = rentalCarResultsHeader.pickupDate;
                LocalDate localDate2 = rentalCarResultsHeader.dropoffDate;
                Locale localeA0w = C60Q.A0w();
                LocalDate localDateNow = LocalDate.now();
                C7384Etj.A0U(localDateNow);
                rentalDateRange = RentalCarFormattingKt.formatRentalDateRange(localDate, localDate2, localeA0w, localDateNow);
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT;
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AuraContentRole auraContentRole = AuraContentRole.Collection;
            ScrimConfig scrimConfigM996rememberSolidScrimek8zF_U = HatchHeaderScrimKt.m996rememberSolidScrimek8zF_U(C60O.A01(bfm, AuraTheme.INSTANCE), bfm, 0);
            boolean zA67 = bfm.A67(objA6v);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new RentalCarResultsScreenKt$RentalCarResultsScreen$1$1(objA6v);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            C1DG c1dg = new C1DG(axnA0Y.Agy(c00r.AGd()) - 72.0f);
            C1DG c1dg2 = new C1DG(0.0f);
            if (c1dg.compareTo(c1dg2) < 0) {
                c1dg = c1dg2;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRg2, auraContentRole, 0L, strA01, null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, c1dg.A00, scrimConfigM996rememberSolidScrimek8zF_U, null, null, 0, B1V.A00(bfm, new C134643(strA01, rentalCarResultsHeader, rentalDateRange, c00r), 1761681946), null, null, false, B1V.A00(bfm, new AnonymousClass4(rentalCarResultsScreenKey, c1boA02), 1364598900), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 0, 805502976, 500170664);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(rentalCarResultsScreenKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ RentalCarLoadState access$RentalCarResultsScreen$lambda$0(C1BO c1bo) {
        return (RentalCarLoadState) c1bo.getValue();
    }
}
