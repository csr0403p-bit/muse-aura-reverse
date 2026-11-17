package com.facebook.aura.flights;

import X.AKQ;
import X.AbstractC0878AGe;
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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.FlightTimeLabelKt;
import com.facebook.aura.flights.FlightDetailPrimaryAction;
import com.facebook.aura.flights.FlightDetailViewModel;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.ScrimConfig;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightDetailScreenKt {

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightBookingActions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReserve;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlightDetail flightDetail, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$detail = flightDetail;
            this.$onReserve = function0;
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
            FlightDetailScreenKt.FlightBookingActions(this.$detail, this.$onReserve, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightBookingScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ Function0<Unit> $onReserve;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlightDetail flightDetail, Function0<Unit> function0) {
            super(2);
            this.$detail = flightDetail;
            this.$onReserve = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                FlightDetailScreenKt.FlightBookingActions(this.$detail, this.$onReserve, C3U4.A0B(BRg.A00, AuraDimensKt.SpacingLargePlusMicro, AuraDimensKt.SpacingSmall), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightBookingScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C120022 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ G0U<String, Unit> $onChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C120022(FlightRowData flightRowData, FlightDetail flightDetail, G0U<? super String, Unit> g0u) {
            super(3);
            this.$offer = flightRowData;
            this.$detail = flightDetail;
            this.$onChange = g0u;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            FlightBookingSectionsKt.FlightBookingItinerarySection(this.$offer, this.$detail.changeTargets, this.$onChange, null, bfm, 0, 8);
            FlightBookingSectionsKt.FlightBookingPriceSection(this.$offer, this.$detail.results.getTravelers(), null, bfm, 0, 4);
            FlightRowData flightRowData = this.$offer;
            FlightDetailSectionsKt.FlightFareCard(flightRowData, (FlightRowSlice) AbstractC0878AGe.A0F(flightRowData.slices), null, null, bfm, 384, 8);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightBookingScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChange;
        public final /* synthetic */ Function0<Unit> $onReserve;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(FlightDetail flightDetail, Function0<Unit> function0, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$detail = flightDetail;
            this.$onReserve = function0;
            this.$onChange = g0u;
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
            FlightDetailScreenKt.FlightBookingScreen(this.$detail, this.$onReserve, this.$onChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightDetailPage$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C120032 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C120032(G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
            super(4);
            this.$footer = g0v;
            this.$content = g0w;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m947invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m947invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C10G.A01, 0.0f, 0.0f, 0.0f, f2);
            G0V<BFM, Integer, Unit> g0v = this.$footer;
            G0W<C07C, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, AnonymousClass001.A0N(c90l, bs0, true), C10G.A02);
            float f3 = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA0H, f3, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, f3, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            float f4 = AuraDimensKt.SpacingXsmall;
            C01N.A08(bfm, bs0, f - f4);
            AnonymousClass001.A1G(c90l, bfm, g0w, 6);
            C01N.A04(bfm, bbi, bs0, f4, true);
            AnonymousClass001.A1H(bfm, g0v, 0);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightDetailPage$3, reason: invalid class name and case insensitive filesystem */
    public final class C120043 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C120043(String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$footer = g0v;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightDetailScreenKt.FlightDetailPage(this.$title, this.$subtitle, this.$footer, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightDetailScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C120052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FlightDetailScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120052(FlightDetailScreenKey flightDetailScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = flightDetailScreenKey;
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
            FlightDetailScreenKt.FlightDetailScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightDetailUnavailable$2, reason: invalid class name and case insensitive filesystem */
    public final class C120062 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120062(BRg bRg, int i, int i2) {
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
            FlightDetailScreenKt.FlightDetailUnavailable(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightOptionDetailsScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C120071 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ Function0<Unit> $onSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120071(FlightDetail flightDetail, Function0<Unit> function0) {
            super(2);
            this.$detail = flightDetail;
            this.$onSelect = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                FlightDetailPrimaryAction flightDetailPrimaryAction = this.$detail.primaryAction;
                if (flightDetailPrimaryAction == null) {
                    bfm.AgE(1402687798);
                } else {
                    bfm.AgE(1402687799);
                    Function0<Unit> function0 = this.$onSelect;
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, FlightDetailScreenKt.primaryActionLabel(flightDetailPrimaryAction, bfm, 0), null, C3U4.A0B(C10G.A02, AuraDimensKt.SpacingLargePlusMicro, AuraDimensKt.SpacingSmall), AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightOptionDetailsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C120082 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120082(FlightRowData flightRowData, FlightRowSlice flightRowSlice, FlightDetail flightDetail) {
            super(3);
            this.$offer = flightRowData;
            this.$slice = flightRowSlice;
            this.$detail = flightDetail;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            FlightRowSlice flightRowSlice = this.$slice;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strFarePriceLabel = null;
            FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a0b), null, 0.0f, bfm, 0, 6);
            FlightDetailSectionsKt.FlightItineraryCard(flightRowSlice, null, bfm, 0, 2);
            BBI.A0R(bbi, true);
            FlightRowData flightRowData = this.$offer;
            FlightRowSlice flightRowSlice2 = this.$slice;
            FlightFarePrice flightFarePrice = this.$detail.farePrice;
            if (flightFarePrice == null) {
                bfm.AgE(1838610741);
            } else {
                bfm.AgE(1838610742);
                strFarePriceLabel = FlightDetailScreenKt.farePriceLabel(flightFarePrice, bfm, 0);
            }
            BBI.A0R(bbi, false);
            FlightDetailSectionsKt.FlightFareCard(flightRowData, flightRowSlice2, strFarePriceLabel, null, bfm, 0, 8);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightOptionDetailsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C120093 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ FlightDetail $detail;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120093(FlightDetail flightDetail, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$detail = flightDetail;
            this.$onSelect = function0;
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
            FlightDetailScreenKt.FlightOptionDetailsScreen(this.$detail, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailScreenKt$FlightWebsiteButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C120102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $link;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120102(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$link = str;
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
            FlightDetailScreenKt.FlightWebsiteButton(this.$link, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightDetailScreen(FlightDetailScreenKey flightDetailScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(flightDetailScreenKey, 0);
        bfm.AgG(-1202388586);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, flightDetailScreenKey) | i : i;
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String string = flightDetailScreenKey.toString();
            FlightDetailViewModel.Factory factory = new FlightDetailViewModel.Factory(flightDetailScreenKey, AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            FlightDetailViewModel flightDetailViewModel = (FlightDetailViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), FlightDetailViewModel.class, string);
            FlightDetail flightDetail = flightDetailViewModel.detail;
            boolean zA1S = AnonymousClass005.A1S(bfm, flightDetailViewModel, auraNavigatorA0b, flightDetailScreenKey);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new FlightDetailScreenKt$FlightDetailScreen$onPrimaryAction$1$1(flightDetailViewModel, auraNavigatorA0b, flightDetailScreenKey);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            if (flightDetail == null) {
                bfm.AgE(-149203966);
                FlightDetailUnavailable(bRg2, bfm, (iA0T >> 3) & 14, 0);
                AnonymousClass001.A1D(bfm);
            } else {
                if (flightDetail.showsDetails) {
                    bfm.AgE(-149201312);
                    FlightOptionDetailsScreen(flightDetail, function0, bRg2, bfm, (iA0T << 3) & 896, 0);
                } else {
                    bfm.AgE(-149195868);
                    boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA0b, flightDetailScreenKey);
                    Object objAaT2 = bfm.AaT();
                    if (zA1M || objAaT2 == C78N.A00) {
                        objAaT2 = new FlightDetailScreenKt$FlightDetailScreen$1$1(auraNavigatorA0b, flightDetailScreenKey);
                        bfm.Ai0(objAaT2);
                    }
                    FlightBookingScreen(flightDetail, function0, (G0U) objAaT2, bRg2, bfm, (iA0T << 6) & 7168, 0);
                }
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120052(flightDetailScreenKey, bRg2, i, i2);
        }
    }

    public static final void FlightBookingActions(FlightDetail flightDetail, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1581411064);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightDetail) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicroPlusNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            FlightDetailPrimaryAction flightDetailPrimaryAction = flightDetail.primaryAction;
            if (flightDetailPrimaryAction == null) {
                bfm.AgE(-1260606799);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1260606798);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, primaryActionLabel(flightDetailPrimaryAction, bfm, 0), null, c1062ATq, AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d << 9) & 57344, 0, 134201285);
                BBI.A0R(bbi, false);
            }
            String str = flightDetail.offer.flightLink;
            if (str == null) {
                bfm.AgE(-1260331767);
            } else {
                bfm.AgE(-1260331766);
                FlightWebsiteButton(str, null, bfm, 0, 2);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightDetail, function0, bRgA0Q, i, i2);
        }
    }

    public static final void FlightBookingScreen(FlightDetail flightDetail, Function0<Unit> function0, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1980179936);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightDetail) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
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
            FlightRowData flightRowData = flightDetail.offer;
            FlightDetailPage(C3cJ.A0I(bfm, flightRowData.slices, R.plurals._name_removed__res_0x7f10002a, flightRowData.slices.size()), null, B1V.A00(bfm, new AnonymousClass1(flightDetail, function0), 1640607551), bRg2, B1V.A00(bfm, new C120022(flightRowData, flightDetail, g0u), -2031938223), bfm, (iA0d & 7168) | 25008, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(flightDetail, function0, g0u, bRg2, i, i2);
        }
    }

    public static final void FlightDetailPage(String str, String str2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-863209798);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objA6v = bfm.A6v(AuraNavigatorKt.LocalNavigator);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            ScrimConfig scrimConfigFlightHeaderScrim = FlightResultsScreenKt.flightHeaderScrim(bfm, 0);
            String str3 = str2 == null ? "" : str2;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, AuraTheme.INSTANCE);
            boolean zA67 = bfm.A67(objA6v);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new FlightDetailScreenKt$FlightDetailPage$1$1(objA6v);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRg2, null, 0L, str, str3, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, c1822ArmA0B, 0.0f, scrimConfigFlightHeaderScrim, null, null, 0, null, null, null, false, B1V.A00(bfm, new C120032(g0v, g0w), -485437099), bfm, AnonymousClass001.A0B(iA0d << 12, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 0, 805306374, 533200780);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120043(str, str2, g0v, bRg2, g0w, i, i2);
        }
    }

    public static final void FlightDetailUnavailable(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-694957162);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objA6v = bfm.A6v(AuraNavigatorKt.LocalNavigator);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            boolean zA67 = bfm.A67(objA6v);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new FlightDetailScreenKt$FlightDetailUnavailable$1$1(objA6v);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRg2, null, 0L, null, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, ComposableSingletons$FlightDetailScreenKt.lambda$146489947, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0, 805306368, 536870844);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120062(bRg2, i, i2);
        }
    }

    public static final void FlightOptionDetailsScreen(FlightDetail flightDetail, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1433934337);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightDetail) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
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
            FlightRowData flightRowData = flightDetail.offer;
            FlightRowSlice flightRowSlice = flightRowData.slices.get(flightDetail.displayedSliceIndex);
            String strFlightNumbers = FlightResultsFormattingKt.flightNumbers(flightRowSlice, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a3f));
            if (strFlightNumbers == null) {
                bfm.AgE(-673592022);
                strFlightNumbers = FlightResultsFormattingKt.flightResultsTitle(flightDetail.results, bfm, 0);
                if (strFlightNumbers == null) {
                    strFlightNumbers = "";
                }
            } else {
                bfm.AgE(-673594161);
            }
            AnonymousClass001.A1D(bfm);
            FlightTimestamp flightTimestamp = flightRowSlice.depart;
            FlightDetailPage(strFlightNumbers, FlightResultsFormattingKt.detailPair(flightTimestamp != null ? flightTimestamp.dateString : null, flightRowSlice.duration, bfm, 0), B1V.A00(bfm, new C120071(flightDetail, function0), -838445408), bRg2, B1V.A00(bfm, new C120082(flightRowData, flightRowSlice, flightDetail), -1680239182), bfm, ((iA0d << 3) & 7168) | 24960, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120093(flightDetail, function0, bRg2, i, i2);
        }
    }

    public static final void FlightWebsiteButton(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1215891185);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a18);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, contextA0H, auraNavigatorA0b, bfm.A67(abstractC3358CGzA0h), AnonymousClass003.A1B(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new FlightDetailScreenKt$FlightWebsiteButton$1$1(abstractC3358CGzA0h, str, contextA0H, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0R, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120102(str, bRg2, i, i2);
        }
    }

    public static final String farePriceLabel(FlightFarePrice flightFarePrice, BFM bfm, int i) {
        int i2;
        String strA0t;
        boolean z = flightFarePrice.isPerPerson;
        if (z && flightFarePrice.isFromPrice) {
            bfm.AgE(565804840);
            strA0t = FlightTimeLabelKt.flightFromPrice(FlightTimeLabelKt.flightPricePerPerson(flightFarePrice.amount, bfm, 0), bfm, 0);
        } else if (z) {
            bfm.AgE(565807415);
            strA0t = FlightTimeLabelKt.flightPricePerPerson(flightFarePrice.amount, bfm, 0);
        } else {
            if (flightFarePrice.isFromPrice) {
                bfm.AgE(565809892);
                i2 = R.string._name_removed__res_0x7f120a4d;
            } else {
                bfm.AgE(565812959);
                i2 = R.string._name_removed__res_0x7f120a52;
            }
            strA0t = AnonymousClass001.A0t(bfm, flightFarePrice.amount, i2);
        }
        AnonymousClass001.A1D(bfm);
        return AnonymousClass001.A0t(bfm, strA0t, R.string._name_removed__res_0x7f120a12);
    }

    public static final String primaryActionLabel(FlightDetailPrimaryAction flightDetailPrimaryAction, BFM bfm, int i) {
        if (flightDetailPrimaryAction instanceof FlightDetailPrimaryAction.SendSelection) {
            AnonymousClass004.A1A(bfm, 2061740425);
            return ((FlightDetailPrimaryAction.SendSelection) flightDetailPrimaryAction).label;
        }
        if (C7384Etj.areEqual(flightDetailPrimaryAction, FlightDetailPrimaryAction.ReviewBooking.INSTANCE)) {
            bfm.AgE(2061742556);
            return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120a14);
        }
        AnonymousClass004.A1A(bfm, 2061738222);
        throw C3cG.A0q();
    }
}
