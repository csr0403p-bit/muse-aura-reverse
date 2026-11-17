package com.facebook.aura.flight.ui;

import X.AKQ;
import X.AVy;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C10G;
import X.C11T;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightSegmentCardKt {
    public static final C7197Ei9 AIRLINE_ICON_FIT;
    public static final float ARRIVING_ARROW_ROTATION = 180.0f;
    public static final float AirlineIconCornerRadius = 8.0f;
    public static final float AirlineIconSize = 28.0f;
    public static final float DetailIconSlotSize = 12.0f;
    public static final float TimeIconSlotSize = 14.0f;
    public static final float TimeLabelMaxWidth = 132.0f;
    public static final float TimeLabelMinWidth = 76.0f;
    public static final float TimeRowLineHeight = 22.0f;

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightSegmentUiModel $segment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FlightSegmentUiModel flightSegmentUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$segment = flightSegmentUiModel;
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
            FlightSegmentCardKt.FlightSegmentCard(this.$segment, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightSegmentUiModel $segment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FlightSegmentUiModel flightSegmentUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$segment = flightSegmentUiModel;
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
            FlightSegmentCardKt.FlightSegmentCard(this.$segment, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentDetailRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightDetailRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlightDetailRow flightDetailRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = flightDetailRow;
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
            FlightSegmentCardKt.FlightSegmentDetailRow(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C119941 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $airlineIconUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119941(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$airlineIconUrl = str2;
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
            FlightSegmentCardKt.FlightSegmentHeader(this.$title, this.$airlineIconUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentHeader$3, reason: invalid class name and case insensitive filesystem */
    public final class C119953 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $airlineIconUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119953(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$airlineIconUrl = str2;
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
            FlightSegmentCardKt.FlightSegmentHeader(this.$title, this.$airlineIconUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentSecondaryText$1, reason: invalid class name and case insensitive filesystem */
    public final class C119961 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119961(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            FlightSegmentCardKt.FlightSegmentSecondaryText(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flight.ui.FlightSegmentCardKt$FlightSegmentTimeRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C119972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $iconRotation;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119972(float f, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$iconRotation = f;
            this.$label = str;
            this.$value = str2;
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
            FlightSegmentCardKt.FlightSegmentTimeRow(this.$iconRotation, this.$label, this.$value, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightDetailRowKind.values().length];
            try {
                AnonymousClass002.A13(FlightDetailRowKind.FARE_RULES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FlightDetailRowKind.INCLUDED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FlightDetailRowKind.EXCLUDED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(FlightDetailRowKind.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FlightSegmentCard(FlightSegmentUiModel flightSegmentUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(flightSegmentUiModel, 0);
        bfm.AgG(1051730551);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightSegmentUiModel) | i : i;
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
            if (!flightSegmentUiModel.getHasRenderableContent()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(flightSegmentUiModel, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A01(bRgA0R, auraTheme.getDimensions(bfm, 6).sectionCornerRadius), AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable));
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA01, f, f2);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            FlightSegmentHeader(flightSegmentUiModel.title, flightSegmentUiModel.airlineIconUrl, null, bfm, 0, 4);
            float f3 = AuraDimensKt.SpacingXsmall;
            C9m9 c9m9A00 = AcQ.A00(f3);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(c9m9A00, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String str = flightSegmentUiModel.departing;
            if (str == null) {
                bfm.AgE(-60440865);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-60440864);
                FlightSegmentTimeRow(0.0f, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a44), str, null, bfm, 6, 8);
                BBI.A0R(bbi, false);
            }
            String str2 = flightSegmentUiModel.arriving;
            if (str2 == null) {
                bfm.AgE(-60233909);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-60233908);
                FlightSegmentTimeRow(180.0f, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a43), str2, null, bfm, 6, 8);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (flightSegmentUiModel.secondaryLines.isEmpty()) {
                bfm.AgE(-1332675583);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1332868744);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f2, bfm, 0);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingMicro, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA014, g0vA0u);
                bfm.AgE(-915834662);
                Iterator<String> it = flightSegmentUiModel.secondaryLines.iterator();
                while (it.hasNext()) {
                    FlightSegmentSecondaryText(AnonymousClass005.A0j(it), null, bfm, 0, 2);
                }
                AnonymousClass002.A0z(bbi, false, true);
            }
            if (flightSegmentUiModel.detailRows.isEmpty()) {
                bfm.AgE(-1332373023);
            } else {
                bfm.AgE(-1332624805);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f2, bfm, 0);
                AuraDividerKt.AuraRowDivider(null, bfm, 0, 1);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f3, bfm, 0);
                InterfaceC1380AiA interfaceC1380AiAA0U2 = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingMicro, 0);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0U2, g0vA0v);
                BPg.A02(bfm, akqA044, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA015, g0vA0u);
                bfm.AgE(1914123013);
                Iterator<FlightDetailRow> it2 = flightSegmentUiModel.detailRows.iterator();
                while (it2.hasNext()) {
                    FlightSegmentDetailRow(it2.next(), null, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(flightSegmentUiModel, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void FlightSegmentDetailRow(FlightDetailRow flightDetailRow, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-152975833);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightDetailRow) | i : i;
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, DetailIconSlotSize);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            Integer numDetailRowIconRes = detailRowIconRes(flightDetailRow.kind);
            if (numDetailRowIconRes == null) {
                bfm.AgE(672753938);
            } else {
                bfm.AgE(672753939);
                AnonymousClass007.A0z(bfm, BOf.A00(bfm, numDetailRowIconRes.intValue(), 0), AuraIconSize.X_TINY, AuraTheme.INSTANCE.getColors(bfm, 6).secondaryIcon.enabled);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMicro);
            String str = flightDetailRow.text;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, zA1V), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightDetailRow, bRg2, i, i2);
        }
    }

    public static final void FlightSegmentHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c119953;
        BRg bRg2 = bRg;
        bfm.AgG(-2066600536);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            if (str == null && str2 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c119953 = new C119941(str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c119953);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            if (str == null) {
                bfm.AgE(-551017064);
            } else {
                bfm.AgE(-551017063);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).bodyMedium;
                long jA06 = C3cH.A06(bfm, auraTheme);
                BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = FlightSegmentCardKt$FlightSegmentHeader$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            }
            BBI.A0R(bbi, false);
            if (str2 == null) {
                bfm.AgE(-550770521);
            } else {
                BS0 bs0A09 = C3cG.A09(bfm, -550770520);
                C01N.A09(bfm, bs0A09, AuraDimensKt.SpacingSmall);
                AuraImageKt.AuraImage(str2, C1b8.A01(C11U.A01(C10G.A07(bs0A09, AirlineIconSize), AirlineIconCornerRadius), C3cH.A0W(bfm).background), AIRLINE_ICON_FIT, null, null, false, null, null, false, null, bfm, 1575936, 944);
            }
            AnonymousClass003.A0q(bbi);
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingSmall, bfm, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c119953 = new C119953(str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c119953);
        }
    }

    public static final void FlightSegmentSecondaryText(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(422912623);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119961(str, bRg2, i, i2);
        }
    }

    public static final void FlightSegmentTimeRow(float f, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1302164626);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA04 |= 3072;
        } else if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 1171, 1170), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA04 = C10G.A04(C10G.A08(bs0, TimeIconSlotSize), TimeRowLineHeight);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA04);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrow_diagonal_right_up_20, 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(C11T.A00(bs0, f), aVyA00, AuraIconSize.X_TINY, null, auraTheme.getColors(bfm, 6).secondaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 32);
            BBI.A0R(bbi, true);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMicro);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A0D(bs0, TimeLabelMinWidth, TimeLabelMaxWidth), C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA04 >> 3) & 14) | 805306416, 6, 14832);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingXsmall);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0O(c90m, bs0, true), C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA04 >> 6), 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119972(f, str, str2, bRg2, i, i2);
        }
    }

    static {
        C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
        c7196Ei8A00.A00(InterfaceC8647Fhz.A05);
        AIRLINE_ICON_FIT = new C7197Ei9(c7196Ei8A00);
    }

    public static final Integer detailRowIconRes(FlightDetailRowKind flightDetailRowKind) {
        int i;
        int iOrdinal = flightDetailRowKind.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.arrowsundo_outline_24_wght400;
        } else if (iOrdinal == 1) {
            i = R.drawable.check_outline_24_wght400;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return null;
                }
                throw C3cG.A0q();
            }
            i = R.drawable.x_wght400_outline_24;
        }
        return Integer.valueOf(i);
    }
}
