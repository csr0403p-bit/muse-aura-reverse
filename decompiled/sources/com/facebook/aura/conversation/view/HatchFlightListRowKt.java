package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AXQ;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass000;
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
import X.BFI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C1515AkP;
import X.C1D8;
import X.C2VU;
import X.C3TF;
import X.C3TG;
import X.C3TH;
import X.C3Tr;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC8647Fhz;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.LocalConversationSessionIdKt;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchFlightListRowKt {
    public static final C7197Ei9 FLIGHT_ICON_FIT;
    public static final float FlightRowHorizontalPadding = 16.0f;
    public static final float FlightRowIconCornerRadius = 10.0f;
    public static final float FlightRowIconSize = 40.0f;
    public static final float FlightRowVerticalPadding = 8.0f;
    public static final float LegSpacing = 8.0f;
    public static final int MaxStackedIcons = 2;

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightListRowKt$FlightHeadline$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $airline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$airline = str;
            this.$price = str2;
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
            HatchFlightListRowKt.FlightHeadline(this.$airline, this.$price, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightListRowKt$FlightHeadline$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $airline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$airline = str;
            this.$price = str2;
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
            HatchFlightListRowKt.FlightHeadline(this.$airline, this.$price, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightListRowKt$FlightHeadlineText$1, reason: invalid class name and case insensitive filesystem */
    public final class C114661 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114661(String str, BRg bRg, int i, int i2) {
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
            HatchFlightListRowKt.FlightHeadlineText(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightListRowKt$FlightLeg$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlightRowSlice flightRowSlice, BRg bRg, int i, int i2) {
            super(2);
            this.$slice = flightRowSlice;
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
            HatchFlightListRowKt.FlightLeg(this.$slice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* renamed from: FlightCarrierMonogram-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m598FlightCarrierMonogram942rkJo(java.lang.String r50, X.C1DM r51, float r52, X.BRg r53, X.BFM r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFlightListRowKt.m598FlightCarrierMonogram942rkJo(java.lang.String, X.1DM, float, X.BRg, X.BFM, int, int):void");
    }

    public static final void FlightHeadlineText(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-369252171);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114661(str, bRg2, i, i2);
        }
    }

    public static final void FlightLeg(FlightRowSlice flightRowSlice, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(815884783);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, flightRowSlice) : i;
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
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            int i4 = iA0d & 14;
            String strFlightTimeRange = FlightTimeLabelKt.flightTimeRange(flightRowSlice, R.string._name_removed__res_0x7f120a55, bfm, i4);
            if (strFlightTimeRange == null) {
                bfm.AgE(1820851225);
            } else {
                bfm.AgE(1820851226);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strFlightTimeRange, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            BBI.A0R(bbi, false);
            String strLegDetails = legDetails(flightRowSlice, bfm, i4);
            AuraTheme auraTheme2 = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strLegDetails, null, C3cH.A07(bfm, auraTheme2), C3cH.A0E(bfm, auraTheme2), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightRowSlice, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* renamed from: HatchFlightCarrierIcons-RZJR0o8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m599HatchFlightCarrierIconsRZJR0o8(java.util.List<java.lang.String> r27, java.lang.String r28, long r29, java.util.List<java.lang.String> r31, X.BRg r32, float r33, X.C1DM r34, float r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFlightListRowKt.m599HatchFlightCarrierIconsRZJR0o8(java.util.List, java.lang.String, long, java.util.List, X.BRg, float, X.1DM, float, X.BFM, int, int):void");
    }

    /* renamed from: HatchFlightListRow-sW7UJKQ, reason: not valid java name */
    public static final void m600HatchFlightListRowsW7UJKQ(FlightRowData flightRowData, long j, BRg bRg, G0U<? super FlightRowData, Unit> g0u, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object hatchFlightListRowKt$HatchFlightListRow$4;
        BRg bRg2;
        BRg bRgM2509auraClickableCardYQRRFTQ;
        BBI bbiA07;
        BRg bRg3 = bRg;
        C7384Etj.A0Y(flightRowData, 0);
        bfm.AgG(1029847999);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg3);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                g0u = null;
            }
            if (flightRowData.slices.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    hatchFlightListRowKt$HatchFlightListRow$4 = new HatchFlightListRowKt$HatchFlightListRow$1(flightRowData, j, bRg3, g0u, i, i2);
                    C3cG.A1D(bBbAAc, hatchFlightListRowKt$HatchFlightListRow$4);
                }
                return;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str = (String) bfm.A6v(LocalConversationSessionIdKt.LocalConversationSessionId);
            BRg bRgA0R = AnonymousClass001.A0R(bRg3);
            if (flightRowData.id.length() == 0) {
                bbiA07 = AnonymousClass002.A0M(bfm, 1841462983);
                bRgM2509auraClickableCardYQRRFTQ = BRg.A00;
                bRg2 = bRgM2509auraClickableCardYQRRFTQ;
            } else {
                BS0 bs0A09 = C3cG.A09(bfm, 1841465749);
                bRg2 = bs0A09;
                boolean zA1O = AnonymousClass003.A1O(bfm, auraNavigatorA0b, str, AnonymousClass002.A1Q(iA0d & 7168, 2048) | ((iA0d & 14) == 4));
                Object objAaT = bfm.AaT();
                if (zA1O || objAaT == C78N.A00) {
                    objAaT = new HatchFlightListRowKt$HatchFlightListRow$2$1(g0u, flightRowData, auraNavigatorA0b, str);
                    bfm.Ai0(objAaT);
                }
                bRgM2509auraClickableCardYQRRFTQ = AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bs0A09, (Function0) objAaT, null, 0, null);
                bbiA07 = C3cG.A07(bfm);
            }
            BRg bRgA0B = C3U4.A0B(bRgA0R.then(bRgM2509auraClickableCardYQRRFTQ), FlightRowHorizontalPadding, FlightRowVerticalPadding);
            float f = AuraDimensKt.SpacingMicroPlusNano;
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            List<FlightRowSlice> list = flightRowData.slices;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<FlightRowSlice> it = list.iterator();
            while (it.hasNext()) {
                AbstractC0882AGj.A0r(it.next().segments, arrayListA0h);
            }
            List<String> listDistinctCarriers = distinctCarriers(arrayListA0h);
            String strCarrierLabel = carrierLabel(listDistinctCarriers, flightRowData.airline, bfm, 0);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRg2);
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            BPg.A02(bfm, interfaceC1380AiAA0K, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            m599HatchFlightCarrierIconsRZJR0o8(flightRowData.icons, strCarrierLabel, j, listDistinctCarriers, null, AuraTheme.INSTANCE.getDimensions(bfm, 6).icon.xSmall, C1D8.A00, 0.0f, bfm, (iA0d << 3) & 896, VoiceCallForegroundService.AVATAR_TARGET_PX);
            FlightHeadline(strCarrierLabel, flightHeadlinePrice(flightRowData, bfm, iA0d & 14), null, bfm, 0, 4);
            BBI.A0R(bbiA07, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, LegSpacing, 6);
            int iA0D2 = AnonymousClass001.A0D(bbiA07);
            AKQ akqA043 = BBI.A04(bbiA07);
            BRg bRgA013 = AxM.A01(bfm, bRg2);
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            bfm.AgE(1477358028);
            Iterator<FlightRowSlice> it2 = flightRowData.slices.iterator();
            while (it2.hasNext()) {
                FlightLeg(it2.next(), null, bfm, 0, 2);
            }
            AnonymousClass002.A10(bbiA07, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchFlightListRowKt$HatchFlightListRow$4 = new HatchFlightListRowKt$HatchFlightListRow$4(flightRowData, j, bRg3, g0u, i, i2);
            C3cG.A1D(bBbAAc, hatchFlightListRowKt$HatchFlightListRow$4);
        }
    }

    public static final void logFlightRowClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.GENERIC_LIST_ROW, null, null, null);
    }

    static {
        C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
        c7196Ei8A00.A00(InterfaceC8647Fhz.A05);
        FLIGHT_ICON_FIT = new C7197Ei9(c7196Ei8A00);
    }

    public static final void FlightHeadline(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        String strA0t;
        bfm.AgG(396495065);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (str == null && str2 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(str, str2, bRg, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new InterfaceC1380AiA() { // from class: com.facebook.aura.conversation.view.HatchFlightListRowKt$FlightHeadline$2$1

                    /* renamed from: com.facebook.aura.conversation.view.HatchFlightListRowKt$FlightHeadline$2$1$2, reason: invalid class name */
                    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AYU, Unit> {
                        public final /* synthetic */ List<AZE> $placeables;

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AYU ayu) {
                            C7384Etj.A0Y(ayu, 0);
                            int i = 0;
                            for (AZE aze : this.$placeables) {
                                AYU.A04(ayu, aze, i, 0);
                                i += aze.A01;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass2(List<? extends AZE> list) {
                            super(1);
                            this.$placeables = list;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                            invoke2(ayu);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A00(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A01(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    /* renamed from: measure-3p2s80s */
                    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
                        boolean zA1b = AnonymousClass004.A1b(axy, list);
                        int iA01 = Constraints.A01(j);
                        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
                        Iterator<? extends C3TG> it = list.iterator();
                        while (it.hasNext()) {
                            arrayListA0m.add(Integer.valueOf(it.next().AQO(Constraints.A00(j))));
                        }
                        List<Integer> listSharedWidths = HatchFlightListRowKt.sharedWidths(arrayListA0m, iA01);
                        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
                        int i4 = 0;
                        for (C3TG c3tg : list) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                AbstractC0885AGm.A14();
                                throw F60.createAndThrow();
                            }
                            arrayListA0m2.add(c3tg.AQW(AnonymousClass004.A0x(j, zA1b ? 1 : 0, AnonymousClass001.A0F(listSharedWidths.get(i4)))));
                            i4 = i5;
                        }
                        Iterator it2 = arrayListA0m2.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int i6 = ((AZE) it2.next()).A00;
                        while (true) {
                            int i7 = i6;
                            while (it2.hasNext()) {
                                i6 = ((AZE) it2.next()).A00;
                                if (i7 < i6) {
                                    break;
                                }
                            }
                            return AnonymousClass002.A0X(axy, new AnonymousClass2(arrayListA0m2), iA01, i7);
                        }
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A02(c3tf, this, list, i4);
                    }

                    @Override // X.InterfaceC1380AiA
                    public /* bridge */ int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i4) {
                        return AXQ.A03(c3tf, this, list, i4);
                    }
                };
                bfm.Ai0(objAaT);
            }
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
            AnonymousClass005.A0p(bfm, objAaT, akqA04, bRgA01, iA0J);
            if (str == null) {
                bfm.AgE(-1460922036);
            } else {
                bfm.AgE(-1460922035);
                FlightHeadlineText(str, null, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            if (str2 == null) {
                bfm.AgE(-1460860935);
            } else {
                bfm.AgE(-1460860934);
                if (str == null) {
                    bfm.AgE(1222991691);
                    BBI.A0R(bbi, false);
                    strA0t = str2;
                } else {
                    bfm.AgE(1222992588);
                    strA0t = AnonymousClass001.A0t(bfm, str2, R.string._name_removed__res_0x7f120a4e);
                    BBI.A0R(bbi, false);
                }
                BRg bRgA0C = BRg.A00;
                if (str != null) {
                    bRgA0C = C3U4.A0C(bRgA0C, AuraDimensKt.SpacingMicro, 0.0f, 0.0f, 0.0f);
                }
                FlightHeadlineText(strA0t, bRgA0C, bfm, 0, 0);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, str2, bRg, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final String airlineLabel(FlightRowData flightRowData, FlightRowSlice flightRowSlice, BFM bfm, int i) {
        return carrierLabel(distinctCarriers(flightRowSlice.segments), flightRowData.airline, bfm, AnonymousClass004.A1b(flightRowData, flightRowSlice) ? 1 : 0);
    }

    public static final String carrierLabel(List<String> list, String str, BFM bfm, int i) {
        int i2;
        String strA0e;
        Object objA0H;
        int size = list.size();
        String str2 = (String) AbstractC0878AGe.A0K(list);
        if (size == 2) {
            bfm.AgE(-1547859209);
            i2 = R.string._name_removed__res_0x7f120a4a;
            strA0e = list.get(0);
            objA0H = list.get(1);
        } else {
            if (size <= 2) {
                if (str2 != null) {
                    AnonymousClass003.A0l(bfm, -1547846330);
                    return str2;
                }
                AnonymousClass003.A0l(bfm, -1547845720);
                return str;
            }
            bfm.AgE(-1547855194);
            i2 = R.string._name_removed__res_0x7f120a4a;
            strA0e = C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a4b), AbstractC0878AGe.A0d(list, 1));
            objA0H = AbstractC0878AGe.A0H(list);
        }
        return C3cJ.A0H(bfm, strA0e, objA0H, i2);
    }

    public static final List<String> distinctCarriers(List<FlightRowSegment> list) {
        ArrayList arrayListA0y = C3cI.A0y(list);
        Iterator<FlightRowSegment> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().carrier;
            if (str != null) {
                arrayListA0y.add(str);
            }
        }
        return C3cG.A0m(arrayListA0y);
    }

    public static final String flightHeadlinePrice(FlightRowData flightRowData, BFM bfm, int i) {
        int i2;
        bfm.AgE(876240194);
        String strA02 = null;
        if (flightRowData.sliceIndex == 0) {
            String str = flightRowData.price;
            if (str == null) {
                AnonymousClass003.A0l(bfm, -739487926);
                str = flightRowData.fromPrice;
                if (str == null) {
                    bfm.AgE(-739375892);
                    AnonymousClass001.A1D(bfm);
                } else {
                    bfm.AgE(-739375891);
                    i2 = R.string._name_removed__res_0x7f120a4d;
                }
            } else {
                bfm.AgE(-739487925);
                i2 = R.string._name_removed__res_0x7f120a52;
            }
            strA02 = AbstractC2271BQs.A02(bfm, new Object[]{str}, i2);
            AnonymousClass001.A1D(bfm);
        }
        AnonymousClass002.A19(bfm);
        return strA02;
    }

    public static final String legDetails(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        bfm.AgE(12279971);
        int i2 = i & 14;
        Iterator it = BFI.A0F(new String[]{FlightTimeLabelKt.flightRoute(flightRowSlice, bfm, i2), flightRowSlice.duration, FlightStopsLabelKt.flightStopsWithAirports(flightRowSlice, bfm, i2)}).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException(AnonymousClass000.A00(11));
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = AnonymousClass006.A0w(bfm, next, it.next(), R.string._name_removed__res_0x7f120a4f);
        }
        String str = (String) next;
        AnonymousClass001.A1D(bfm);
        return str;
    }

    public static final List<Integer> sharedWidths(List<Integer> list, int i) {
        int iMin;
        Integer numValueOf;
        if (list.size() >= 2) {
            Iterator<T> it = list.iterator();
            int iA0F = 0;
            while (it.hasNext()) {
                iA0F += AnonymousClass001.A0F(it.next());
            }
            if (iA0F > i) {
                int iA0F2 = AnonymousClass001.A0F(list.get(0));
                int iA0F3 = AnonymousClass001.A0F(list.get(1));
                if (iA0F2 < i / 2) {
                    numValueOf = Integer.valueOf(iA0F2);
                    iMin = i - iA0F2;
                } else {
                    iMin = Math.min(iA0F3, i);
                    numValueOf = Integer.valueOf(i - iMin);
                }
                return Arrays.asList(numValueOf, Integer.valueOf(iMin));
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(Integer.valueOf(Math.min(AnonymousClass001.A0F(it2.next()), i)));
        }
        return arrayListA0i;
    }
}
