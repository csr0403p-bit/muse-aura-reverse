package com.facebook.aura.rentalcars;

import X.AEk;
import X.AKQ;
import X.AXN;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
import X.C06I;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.rentalcars.RentalCarDetailsViewModel;
import com.facebook.aura.rentalcars.RentalCarLoadState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class RentalCarDetailsScreenKt {
    public static final float FOOTER_FADE_HEIGHT = 44.0f;

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsScreenKt$RentalCarDetailsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ RentalCarDetailsScreenKey $key;
        public final /* synthetic */ RentalCarDetailsViewModel $model;
        public final /* synthetic */ C1BO<RentalCarLoadState<RentalCarRate>> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, RentalCarDetailsViewModel rentalCarDetailsViewModel, C1BO<? extends RentalCarLoadState<RentalCarRate>> c1bo) {
            super(4);
            this.$key = rentalCarDetailsScreenKey;
            this.$model = rentalCarDetailsViewModel;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1881invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1881invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            RentalCarDetailsScreenKey rentalCarDetailsScreenKey = this.$key;
            String strRentalCarImageSharedKey = RentalCarImageKt.rentalCarImageSharedKey(rentalCarDetailsScreenKey.hostMessageId, rentalCarDetailsScreenKey.presentationId, rentalCarDetailsScreenKey.rateIndex, rentalCarDetailsScreenKey.openedFromList);
            RentalCarLoadState<RentalCarRate> value = this.$state$delegate.getValue();
            if (C7384Etj.areEqual(value, RentalCarLoadState.Loading.INSTANCE)) {
                bfm.AgE(-541541306);
                C1062ATq c1062ATq = C10G.A01;
                RentalCarDetailsScreenKey rentalCarDetailsScreenKey2 = this.$key;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                RentalCarDetailsSectionsKt.RentalCarHeroImage(rentalCarDetailsScreenKey2.imageUrl, strRentalCarImageSharedKey, null, bfm, 0, 4);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(c90l.AiP(C10G.A02, 1.0f, true), bfm, 0, 0);
                BBI.A0R(bbi, true);
            } else if (C7384Etj.areEqual(value, RentalCarLoadState.Unavailable.INSTANCE)) {
                bfm.AgE(-541532608);
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205ae), null, C3U4.A04(C10G.A01, f), null, null, null, null, bfm, 0, 122);
            } else {
                if (!(value instanceof RentalCarLoadState.Loaded)) {
                    throw AnonymousClass005.A0k(bfm, -541543149);
                }
                bfm.AgE(-541525144);
                RentalCarRate rentalCarRate = (RentalCarRate) ((RentalCarLoadState.Loaded) value).value;
                RentalCarDetailsViewModel rentalCarDetailsViewModel = this.$model;
                boolean zA67 = bfm.A67(rentalCarDetailsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new RentalCarDetailsScreenKt$RentalCarDetailsScreen$3$2$1(rentalCarDetailsViewModel);
                    bfm.Ai0(objAaT);
                }
                RentalCarDetailsScreenKt.m1877RentalCarDetailsLoadedhGBTI10(rentalCarRate, strRentalCarImageSharedKey, (Function0) ((InterfaceC7353EnQ) objAaT), f2, null, bfm, (iA04 << 6) & 7168, 16);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsScreenKt$RentalCarDetailsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RentalCarDetailsScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = rentalCarDetailsScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsScreenKt.RentalCarDetailsScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: RentalCarBookFooter-uFdPcIQ, reason: not valid java name */
    public static final void m1876RentalCarBookFooteruFdPcIQ(Function0<Unit> function0, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2003665184);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long j = C3cH.A0W(bfm).background;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a8);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new RentalCarDetailsScreenKt$RentalCarBookFooter$1$1(j);
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = C1b8.A01(AEk.A01(bRgA0R, (G0U) objAaT), j);
            float f2 = AuraDimensKt.SpacingMedium;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C3U4.A0C(bRgA01, f2, 0.0f, f2, AuraDimensKt.SpacingLargePlusMicro + f), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new RentalCarDetailsScreenKt$RentalCarBookFooter$2(function0, f, bRg2, i, i2);
        }
    }

    /* renamed from: RentalCarDetailsLoaded-hGBTI10, reason: not valid java name */
    public static final void m1877RentalCarDetailsLoadedhGBTI10(RentalCarRate rentalCarRate, String str, Function0<Unit> function0, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1256918970);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarRate) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f);
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
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA03 = C3U4.A03(AnonymousClass005.A0T(bfm, c1062ATq), axnA0Y.Agy(c00r.AGd()) + FOOTER_FADE_HEIGHT);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            RentalCarDetailsSectionsKt.RentalCarHeroImage(rentalCarRate.car.imageUrl, str, null, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            BRg bRgA09 = C3U4.A09(C10G.A02, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingLargePlusMicro, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            int i4 = iA0d & 14;
            RentalCarDetailsSectionsKt.RentalCarDetailsHeader(rentalCarRate, null, bfm, i4, 2);
            RentalCarDetailsSectionsKt.RentalCarSpecsSection(rentalCarRate.car, rentalCarRate.mileage, null, bfm, 0, 4);
            RentalCarStop rentalCarStop = rentalCarRate.pickup;
            RentalCarStop rentalCarStop2 = rentalCarRate.dropoff;
            int i5 = RentalCarStop.$stable;
            RentalCarDetailsSectionsKt.RentalCarDatesSection(rentalCarStop, rentalCarStop2, null, bfm, i5 | (i5 << 3), 4);
            RentalCarDetailsSectionsKt.RentalCarLocationSection(rentalCarRate, null, bfm, i4, 2);
            RentalCarDetailsSectionsKt.RentalCarPriceSection(rentalCarRate, null, bfm, i4, 2);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            BRg bRgA4C = c0z7.A4C(C2VU.A06, bs0);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new RentalCarDetailsScreenKt$RentalCarDetailsLoaded$1$3$1(c00r);
                bfm.Ai0(objAaT2);
            }
            m1876RentalCarBookFooteruFdPcIQ(function0, f, BIj.A00(bRgA4C, (G0U) objAaT2), bfm, (iA0d >> 6) & 126, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new RentalCarDetailsScreenKt$RentalCarDetailsLoaded$2(rentalCarRate, str, function0, f, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void RentalCarDetailsScreen(RentalCarDetailsScreenKey rentalCarDetailsScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        RentalCarLoadState.Loaded loaded;
        RentalCarRate rentalCarRate;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(rentalCarDetailsScreenKey, 0);
        bfm.AgG(-366861725);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, rentalCarDetailsScreenKey) | i : i;
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
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            String string = rentalCarDetailsScreenKey.toString();
            RentalCarDetailsViewModel.Factory factory = new RentalCarDetailsViewModel.Factory(rentalCarDetailsScreenKey, abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            RentalCarDetailsViewModel rentalCarDetailsViewModel = (RentalCarDetailsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), RentalCarDetailsViewModel.class, string);
            String strRentalCarBookingMessage = null;
            C1BO c1boA02 = C2CK.A02(bfm, rentalCarDetailsViewModel.uiState);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120581);
            RentalCarLoadState rentalCarLoadState = (RentalCarLoadState) c1boA02.getValue();
            if (!(rentalCarLoadState instanceof RentalCarLoadState.Loaded) || (loaded = (RentalCarLoadState.Loaded) rentalCarLoadState) == null || (rentalCarRate = (RentalCarRate) loaded.value) == null) {
                bfm.AgE(1514678427);
            } else {
                bfm.AgE(1514678428);
                strRentalCarBookingMessage = RentalCarBookingKt.rentalCarBookingMessage(rentalCarRate, bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, strRentalCarBookingMessage);
            boolean zA1R = AnonymousClass001.A1R(bfm, strA01, AnonymousClass005.A1V(bfm, abstractC3358CGzA0h, auraNavigatorA0b, rentalCarDetailsScreenKey, AnonymousClass003.A1N(bfm, rentalCarDetailsViewModel, mutableStateA00)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new RentalCarDetailsScreenKt$RentalCarDetailsScreen$1$1(rentalCarDetailsViewModel, abstractC3358CGzA0h, auraNavigatorA0b, rentalCarDetailsScreenKey, strA01, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, rentalCarDetailsViewModel, auraNavigatorA0b);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AuraContentRole auraContentRole = AuraContentRole.Focused;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new RentalCarDetailsScreenKt$RentalCarDetailsScreen$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRg2, auraContentRole, 0L, null, null, (Function0) objAaT2, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass3(rentalCarDetailsScreenKey, rentalCarDetailsViewModel, c1boA02), 133514536), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 0, 805306422, 533725112);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(rentalCarDetailsScreenKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ RentalCarLoadState access$RentalCarDetailsScreen$lambda$0(C1BO c1bo) {
        return (RentalCarLoadState) c1bo.getValue();
    }
}
