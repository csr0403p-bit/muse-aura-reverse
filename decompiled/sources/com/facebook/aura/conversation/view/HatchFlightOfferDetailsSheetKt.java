package com.facebook.aura.conversation.view;

import X.AGH;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
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
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.flight.ui.FlightDetailRow;
import com.facebook.aura.flight.ui.FlightDetailRowKind;
import com.facebook.aura.flight.ui.FlightSegmentCardKt;
import com.facebook.aura.flight.ui.FlightSegmentUiModel;
import com.facebook.aura.model.FareCondition;
import com.facebook.aura.model.FlightRowBags;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSegmentPassenger;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchFlightOfferDetailsSheetKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$FlightOfferFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ int $sliceIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlightRowData flightRowData, int i, String str, BRg bRg, int i2, int i3) {
            super(2);
            this.$offer = flightRowData;
            this.$sliceIndex = i;
            this.$sessionId = str;
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
            HatchFlightOfferDetailsSheetKt.FlightOfferFooter(this.$offer, this.$sliceIndex, this.$sessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C114672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $offerId;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ int $sliceIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114672(String str, int i, String str2, int i2) {
            super(2);
            this.$offerId = str;
            this.$sliceIndex = i;
            this.$sessionId = str2;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFlightOfferDetailsSheetKt.HatchFlightOfferDetailsSheet(this.$offerId, this.$sliceIndex, this.$sessionId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ int $sliceIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FlightRowData flightRowData, int i, String str) {
            super(2);
            this.$offer = flightRowData;
            this.$sliceIndex = i;
            this.$sessionId = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchFlightOfferDetailsSheetKt.FlightOfferFooter(this.$offer, this.$sliceIndex, this.$sessionId, null, bfm, 0, 8);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ FlightRowData $offer;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingLarge;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(c1062ATq, f, f2);
            C9m9 c9m9A00 = AcQ.A00(f2);
            FlightRowData flightRowData = this.$offer;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V != null) {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String str = flightRowData.price;
                if (str == null) {
                    bfm.AgE(554908416);
                } else {
                    bfm.AgE(554908417);
                    HatchFlightOfferDetailsSheetKt.TotalPriceRow(str, null, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                bfm.AgE(1680470348);
                int i2 = 0;
                for (FlightRowSlice flightRowSlice : flightRowData.slices) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        FlightRowSlice flightRowSlice2 = flightRowSlice;
                        String strSliceSectionLabel = HatchFlightOfferDetailsSheetKt.sliceSectionLabel(flightRowData, i2, bfm, 0);
                        if (strSliceSectionLabel == null) {
                            bfm.AgE(-591001261);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(-591001260);
                            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f2, bfm, 0);
                            AuraTheme auraTheme = AuraTheme.INSTANCE;
                            AuraTextKt.m2639AuraTextUY9GdpU(strSliceSectionLabel, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                            BBI.A0R(bbi, false);
                        }
                        bfm.AgE(1680481283);
                        Iterator<FlightRowSegment> it = flightRowSlice2.segments.iterator();
                        while (it.hasNext()) {
                            FlightSegmentCardKt.FlightSegmentCard(HatchFlightOfferDetailsSheetKt.toUiModel(it.next(), flightRowSlice2, flightRowData, bfm, 0), null, bfm, 0, 2);
                        }
                        BBI.A0R(bbi, false);
                        i2 = i3;
                    }
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            C00x.A00();
            throw F60.createAndThrow();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(FlightRowData flightRowData) {
            super(3);
            this.$offer = flightRowData;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $offerId;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ int $sliceIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, int i, String str2, int i2) {
            super(2);
            this.$offerId = str;
            this.$sliceIndex = i;
            this.$sessionId = str2;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFlightOfferDetailsSheetKt.HatchFlightOfferDetailsSheet(this.$offerId, this.$sliceIndex, this.$sessionId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt$TotalPriceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C114682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $price;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114682(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$price = str;
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
            HatchFlightOfferDetailsSheetKt.TotalPriceRow(this.$price, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchFlightOfferDetailsSheet(String str, int i, String str2, BFM bfm, int i2) {
        BBb bBbAAc;
        Object anonymousClass6;
        AnonymousClass002.A1A(str, 0, str2);
        bfm.AgG(-1560471865);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = (FlightRowData) FlightOfferDetailHolder.cache.get(str);
                bfm.Ai0(objAaT);
            }
            FlightRowData flightRowData = (FlightRowData) objAaT;
            if (flightRowData == null) {
                bfm.AgE(708905790);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, unit);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass6 = new C114672(str, i, str2, i2);
                    C3cG.A1D(bBbAAc, anonymousClass6);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 708995163);
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            int i3 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(offerRoute(flightRowData, i, bfm, i3), offerSubtitle(flightRowData, i, bfm, i3), null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass3(flightRowData, i, str2), -997321938);
            boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, AnonymousClass003.A1D(iA0d));
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == C78N.A00) {
                objAaT3 = new HatchFlightOfferDetailsSheetKt$HatchFlightOfferDetailsSheet$4$1(str2, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, null, null, auraBottomSheetHeaderConfig, b1uA00, null, (Function0) objAaT3, false, false, false, null, B1V.A00(bfm, new AnonymousClass5(flightRowData), 986851562), bfm, 24582, 48, 1958);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(str, i, str2, i2);
            C3cG.A1D(bBbAAc, anonymousClass6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r2 r3 r5
  0x006a: PHI (r2v1 java.lang.String) = (r2v4 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0016, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v1 boolean) = (r3v3 boolean), (r3v4 boolean) binds: [B:8:0x0016, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r5v2 X.BBI) = (r5v4 X.BBI), (r5v5 X.BBI) binds: [B:8:0x0016, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[PHI: r2 r3 r5
  0x0014: PHI (r2v4 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:16:0x0047, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x0014: PHI (r3v3 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:16:0x0047, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x0014: PHI (r5v4 X.BBI) = (r5v1 X.BBI), (r5v5 X.BBI) binds: [B:16:0x0047, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String bookingCarrier(com.facebook.aura.model.FlightRowData r6, com.facebook.aura.model.FlightRowSlice r7, X.BFM r8, int r9) {
        /*
            r4 = 0
            if (r7 != 0) goto L34
            r0 = 1362592165(0x513781a5, float:4.9259631E10)
            r8.AgE(r0)
            r5 = r8
            X.BBI r5 = (X.BBI) r5
            r3 = 0
            X.BBI.A0R(r5, r3)
        L10:
            java.lang.String r2 = r6.airline
            if (r7 == 0) goto L6a
        L14:
            java.util.List<com.facebook.aura.model.FlightRowSegment> r0 = r7.segments
            if (r0 == 0) goto L6a
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r1.next()
            com.facebook.aura.model.FlightRowSegment r0 = (com.facebook.aura.model.FlightRowSegment) r0
            java.lang.String r0 = r0.flight
            if (r0 == 0) goto L20
            r6.add(r0)
            goto L20
        L34:
            r0 = 1362592166(0x513781a6, float:4.9259635E10)
            r8.AgE(r0)
            r0 = r9 & 14
            java.lang.String r2 = com.facebook.aura.conversation.view.HatchFlightListRowKt.airlineLabel(r6, r7, r8, r0)
            r5 = r8
            X.BBI r5 = (X.BBI) r5
            r3 = 0
            X.BBI.A0R(r5, r3)
            if (r2 != 0) goto L14
            goto L10
        L4a:
            r0 = -2034250656(0xffffffff86bfcc60, float:-7.2146517E-35)
            r8.AgE(r0)
            r0 = 2131888687(0x7f120a2f, float:1.9412016E38)
            java.lang.String r1 = X.AbstractC2271BQs.A01(r8, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = X.AbstractC0878AGe.A0L(r1, r0, r0, r6, r4)
            X.BBI.A0R(r5, r3)
            if (r1 == 0) goto L73
            int r0 = r1.length()
            if (r0 <= 0) goto L73
            r4 = r1
            goto L73
        L6a:
            r0 = 1362739105(0x5139bfa1, float:4.9861497E10)
            r8.AgE(r0)
            X.BBI.A0R(r5, r3)
        L73:
            if (r2 == 0) goto L88
            if (r4 == 0) goto L88
            r0 = -2034245110(0xffffffff86bfe20a, float:-7.217835E-35)
            r8.AgE(r0)
            r0 = 2131888667(0x7f120a1b, float:1.9411976E38)
            java.lang.String r2 = X.AnonymousClass006.A0w(r8, r2, r4, r0)
            X.BBI.A0R(r5, r3)
        L87:
            return r2
        L88:
            r0 = 1362998483(0x513db4d3, float:5.0923909E10)
            r8.AgE(r0)
            X.BBI.A0R(r5, r3)
            if (r2 != 0) goto L87
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt.bookingCarrier(com.facebook.aura.model.FlightRowData, com.facebook.aura.model.FlightRowSlice, X.BFM, int):java.lang.String");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FareCondition.values().length];
            try {
                AnonymousClass002.A13(FareCondition.YES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FareCondition.NO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FareCondition.NOT_STATED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FlightOfferFooter(FlightRowData flightRowData, int i, String str, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-393883555);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            int i5 = iA0d & 14;
            String strBookingMessage = bookingMessage(flightRowData, i, bfm, iA0d & 126);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingLarge;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgThen, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String str2 = flightRowData.ctaText;
            if (str2 == null || flightRowData.responseMessage.length() <= 0) {
                bfm.AgE(-595916226);
            } else {
                bfm.AgE(-595916225);
                AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
                boolean zA1X = AnonymousClass005.A1X(bfm, strBookingMessage, auraNavigatorA0b, AnonymousClass004.A1K(iA0d), AnonymousClass003.A17(i5));
                Object objAaT = bfm.AaT();
                if (zA1X || objAaT == C78N.A00) {
                    objAaT = new HatchFlightOfferDetailsSheetKt$FlightOfferFooter$1$2$1$1(str, flightRowData, strBookingMessage, auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str2, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 1, false, 0, bfm, 199680, 0, RuntimeInternals.IOPRIO_BACKGROUND, 117424069);
            }
            BBI.A0R(bbi, false);
            String str3 = flightRowData.flightLink;
            if (str3 == null) {
                bfm.AgE(-595307200);
            } else {
                bfm.AgE(-595307199);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a26);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize2 = AuraButtonSize.MEDIUM;
                boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, AnonymousClass005.A1X(bfm, str3, contextA0H, bfm.A67(abstractC3358CGzA0h), (iA0d & 896) == 256));
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchFlightOfferDetailsSheetKt$FlightOfferFooter$1$3$1$1(str, abstractC3358CGzA0h, str3, contextA0H, auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondary, auraButtonSize2, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 1, false, 0, bfm, 199680, 0, RuntimeInternals.IOPRIO_BACKGROUND, 117424069);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightRowData, i, str, bRg2, i2, i3);
        }
    }

    public static final void TotalPriceRow(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2000243488);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a30);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, c90m.AiP(BRg.A00, 1.0f, true), C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, auraTheme.getColors(bfm, 6).success, auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114682(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String bookingMessage(com.facebook.aura.model.FlightRowData r9, int r10, X.BFM r11, int r12) {
        /*
            java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r9.slices
            java.lang.Object r8 = X.AbstractC0878AGe.A0A(r10, r0)
            com.facebook.aura.model.FlightRowSlice r8 = (com.facebook.aura.model.FlightRowSlice) r8
            if (r8 != 0) goto L12
            java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r9.slices
            java.lang.Object r8 = X.AbstractC0878AGe.A0G(r0)
            com.facebook.aura.model.FlightRowSlice r8 = (com.facebook.aura.model.FlightRowSlice) r8
        L12:
            r0 = r12 & 14
            java.lang.String r7 = bookingCarrier(r9, r8, r11, r0)
            r5 = 0
            if (r8 == 0) goto L2c
            java.lang.String r0 = r8.from
            int r0 = r0.length()
            if (r0 <= 0) goto L2c
            java.lang.String r0 = r8.to
            int r0 = r0.length()
            r4 = r8
            if (r0 > 0) goto L2d
        L2c:
            r4 = r5
        L2d:
            r3 = 0
            if (r4 != 0) goto L98
            r0 = -467383947(0xffffffffe4244975, float:-1.2122237E22)
            X.BBI r4 = X.AnonymousClass002.A0M(r11, r0)
            r6 = r5
        L38:
            if (r8 == 0) goto L40
            com.facebook.aura.model.FlightTimestamp r0 = r8.depart
            if (r0 == 0) goto L40
            java.lang.String r5 = r0.longTimestampString
        L40:
            java.lang.String r2 = r9.price
            if (r7 == 0) goto L85
            if (r6 == 0) goto L85
            if (r5 == 0) goto L85
            if (r2 == 0) goto L77
            r0 = 1647501128(0x6232df48, float:8.249024E20)
            r11.AgE(r0)
            r1 = 2131888668(0x7f120a1c, float:1.9411978E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r6, r5, r2}
        L57:
            java.lang.String r2 = X.AbstractC2271BQs.A02(r11, r0, r1)
            X.BBI.A0R(r4, r3)
            if (r2 == 0) goto L8e
            r0 = -466662607(0xffffffffe42f4b31, float:-1.2934393E22)
            r11.AgE(r0)
            r1 = 2131888670(0x7f120a1e, float:1.9411982E38)
            java.lang.String r0 = r9.responseMessage
            java.lang.String r0 = X.AnonymousClass006.A0w(r11, r0, r2, r1)
            X.BBI.A0R(r4, r3)
            if (r0 != 0) goto L76
        L74:
            java.lang.String r0 = r9.responseMessage
        L76:
            return r0
        L77:
            r0 = 1647508026(0x6232fa3a, float:8.253878E20)
            r11.AgE(r0)
            r1 = 2131888669(0x7f120a1d, float:1.941198E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r6, r5}
            goto L57
        L85:
            r0 = -467119920(0xffffffffe42850d0, float:-1.2419505E22)
            r11.AgE(r0)
            X.BBI.A0R(r4, r3)
        L8e:
            r0 = -466662608(0xffffffffe42f4b30, float:-1.2934392E22)
            r11.AgE(r0)
            X.BBI.A0R(r4, r3)
            goto L74
        L98:
            r0 = -467383946(0xffffffffe4244976, float:-1.2122238E22)
            r11.AgE(r0)
            r2 = 2131888686(0x7f120a2e, float:1.9412014E38)
            java.lang.String r1 = r4.from
            java.lang.String r0 = r4.to
            java.lang.String r6 = X.AnonymousClass006.A0w(r11, r1, r0, r2)
            X.BBI r4 = X.C3cG.A07(r11)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt.bookingMessage(com.facebook.aura.model.FlightRowData, int, X.BFM, int):java.lang.String");
    }

    public static final String cabinLine(FlightRowSegment flightRowSegment, FlightRowSlice flightRowSlice, BFM bfm, int i) {
        String strA01;
        List<FlightRowSegmentPassenger> list = flightRowSegment.passengers;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<FlightRowSegmentPassenger> it = list.iterator();
        while (true) {
            strA01 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = it.next().cabin;
            if (str != null && !C7BY.A0j(str)) {
                arrayListA0h.add(str);
            }
        }
        List listA0m = C3cG.A0m(arrayListA0h);
        if (listA0m.size() > 1) {
            bfm.AgE(-311438780);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a1f);
        } else {
            if (listA0m.size() == 1) {
                AnonymousClass004.A1A(bfm, -311436013);
                return (String) AbstractC0878AGe.A0F(listA0m);
            }
            if (!flightRowSlice.cabinVaries) {
                AnonymousClass004.A1A(bfm, -311434223);
                return flightRowSlice.cabin;
            }
            bfm.AgE(-1064549167);
        }
        AnonymousClass002.A19(bfm);
        return strA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String describe(com.facebook.aura.model.FlightRowBags r7, X.BFM r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            java.lang.Long r0 = r7.carryOn
            r5 = 0
            r4 = 0
            if (r0 == 0) goto L8b
            long r1 = r0.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8b
            int r0 = (int) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L14:
            java.lang.Long r0 = r7.checked
            if (r0 == 0) goto L89
            long r1 = r0.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L89
            int r0 = (int) r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L25:
            if (r3 == 0) goto L58
            if (r5 == 0) goto L6c
            r0 = 1483852501(0x5871cad5, float:1.06341384E15)
            r8.AgE(r0)
            r4 = 2131888666(0x7f120a1a, float:1.9411974E38)
            r2 = 2131755051(0x7f10002b, float:1.914097E38)
            int r1 = r3.intValue()
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r3 = X.AbstractC2271BQs.A00(r2, r0, r8, r1)
            r2 = 2131755052(0x7f10002c, float:1.9140972E38)
            int r1 = r5.intValue()
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r0 = X.AbstractC2271BQs.A00(r2, r0, r8, r1)
            java.lang.String r4 = X.AnonymousClass006.A0w(r8, r3, r0, r4)
        L54:
            X.AnonymousClass001.A1D(r8)
            return r4
        L58:
            if (r5 == 0) goto L82
            r0 = 1483872258(0x58721802, float:1.06473971E15)
            r8.AgE(r0)
            r2 = 2131755052(0x7f10002c, float:1.9140972E38)
            int r1 = r5.intValue()
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            goto L7d
        L6c:
            r0 = 1483866627(0x58720203, float:1.06436182E15)
            r8.AgE(r0)
            r2 = 2131755051(0x7f10002b, float:1.914097E38)
            int r1 = r3.intValue()
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
        L7d:
            java.lang.String r4 = X.AbstractC2271BQs.A00(r2, r0, r8, r1)
            goto L54
        L82:
            r0 = -1244454619(0xffffffffb5d32125, float:-1.5730371E-6)
            r8.AgE(r0)
            goto L54
        L89:
            r5 = r4
            goto L25
        L8b:
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt.describe(com.facebook.aura.model.FlightRowBags, X.BFM, int):java.lang.String");
    }

    public static final List<FlightDetailRow> fareDetailRows(FlightRowData flightRowData, BFM bfm, int i) throws Resources.NotFoundException {
        int i2 = i & 14;
        String strFareRuleRow = fareRuleRow(flightRowData, bfm, i2);
        FlightDetailRow flightDetailRow = strFareRuleRow != null ? new FlightDetailRow(FlightDetailRowKind.FARE_RULES, strFareRuleRow) : null;
        String strBagRow = bagRow(flightRowData, bfm, i2);
        return BFI.A0F(new FlightDetailRow[]{flightDetailRow, strBagRow != null ? new FlightDetailRow(FlightDetailRowKind.INCLUDED, strBagRow) : null});
    }

    public static final String fareRuleRow(FlightRowData flightRowData, BFM bfm, int i) {
        int i2;
        int i3;
        FareCondition fareCondition = flightRowData.refundable;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = fareCondition.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(-526449146);
            i2 = R.string._name_removed__res_0x7f120a2c;
        } else if (iOrdinal == 1) {
            bfm.AgE(-526446487);
            i2 = R.string._name_removed__res_0x7f120a28;
        } else {
            if (iOrdinal != 2) {
                throw AnonymousClass005.A0k(bfm, -526450659);
            }
            bfm.AgE(-526443475);
            i2 = R.string._name_removed__res_0x7f120a2b;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, i2);
        BBI bbiA07 = C3cG.A07(bfm);
        int iOrdinal2 = flightRowData.changeable.ordinal();
        if (iOrdinal2 == 0) {
            bfm.AgE(-526438810);
            i3 = R.string._name_removed__res_0x7f120a21;
        } else if (iOrdinal2 == 1) {
            bfm.AgE(-526436151);
            i3 = R.string._name_removed__res_0x7f120a27;
        } else {
            if (iOrdinal2 != 2) {
                throw AnonymousClass003.A0k(bfm, bbiA07, -526440323);
            }
            bfm.AgE(-526433139);
            i3 = R.string._name_removed__res_0x7f120a20;
        }
        String strA0s = AnonymousClass001.A0s(bfm, bbiA07, i3);
        String strA0e = C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a2f), BFI.A0F(new String[]{flightRowData.refundPenalty, flightRowData.changePenalty}));
        String strA0w = AnonymousClass006.A0w(bfm, strA01, strA0s, R.string._name_removed__res_0x7f120a22);
        if (strA0e.length() == 0) {
            bfm.AgE(-526423660);
        } else {
            bfm.AgE(-526423196);
            strA0w = AnonymousClass006.A0w(bfm, strA0w, strA0e, R.string._name_removed__res_0x7f120a23);
        }
        BBI.A0R(bbiA07, false);
        return strA0w;
    }

    public static final void logFlightOfferClick(String str, HatchComponent hatchComponent) {
        boolean zEquals = "primary_session_id".equals(str);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        HatchScreen hatchScreenChatScreen = HatchInteractionEnumsKt.chatScreen(zEquals);
        if (zEquals) {
            str = null;
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreenChatScreen, hatchComponent, null, HatchInteractionEnumsKt.chatThreadLogMetadata(zEquals, str, null, AGH.A0E()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r0
  0x0015: PHI (r0v3 com.facebook.aura.model.FlightRowSlice) = (r0v2 com.facebook.aura.model.FlightRowSlice), (r0v13 com.facebook.aura.model.FlightRowSlice) binds: [B:3:0x0008, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String offerRoute(com.facebook.aura.model.FlightRowData r4, int r5, X.BFM r6, int r7) {
        /*
            java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r4.slices
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r5, r0)
            com.facebook.aura.model.FlightRowSlice r0 = (com.facebook.aura.model.FlightRowSlice) r0
            if (r0 != 0) goto L15
            java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r4.slices
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r0)
            com.facebook.aura.model.FlightRowSlice r0 = (com.facebook.aura.model.FlightRowSlice) r0
            r3 = 0
            if (r0 == 0) goto L17
        L15:
            java.lang.String r3 = r0.from
        L17:
            java.lang.String r2 = ""
            if (r3 != 0) goto L1c
            r3 = r2
        L1c:
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.to
            if (r1 != 0) goto L23
        L22:
            r1 = r2
        L23:
            int r0 = r3.length()
            if (r0 <= 0) goto L3d
            int r0 = r1.length()
            if (r0 <= 0) goto L3d
            r0 = -1147371513(0xffffffffbb9c8007, float:-0.0047760042)
            r6.AgE(r0)
            r0 = 2131888686(0x7f120a2e, float:1.9412014E38)
            java.lang.String r2 = X.C3cJ.A0H(r6, r3, r1, r0)
        L3c:
            return r2
        L3d:
            r0 = -1147368971(0xffffffffbb9c89f5, float:-0.004777188)
            X.AnonymousClass004.A1A(r6, r0)
            java.lang.String r0 = r4.airline
            if (r0 == 0) goto L3c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt.offerRoute(com.facebook.aura.model.FlightRowData, int, X.BFM, int):java.lang.String");
    }

    public static final String sliceSectionLabel(FlightRowData flightRowData, int i, BFM bfm, int i2) {
        int i3;
        String strA01;
        if (flightRowData.slices.size() < 2) {
            AnonymousClass004.A1A(bfm, -629684679);
            return null;
        }
        if (flightRowData.slices.size() > 2) {
            bfm.AgE(1088067461);
            strA01 = AnonymousClass001.A0t(bfm, Integer.valueOf(i + 1), R.string._name_removed__res_0x7f120a25);
        } else {
            if (i == 0) {
                bfm.AgE(1088070200);
                i3 = R.string._name_removed__res_0x7f120a2a;
            } else {
                bfm.AgE(1088072343);
                i3 = R.string._name_removed__res_0x7f120a24;
            }
            strA01 = AbstractC2271BQs.A01(bfm, i3);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final FlightSegmentUiModel toUiModel(FlightRowSegment flightRowSegment, FlightRowSlice flightRowSlice, FlightRowData flightRowData, BFM bfm, int i) {
        String strA0H;
        if (flightRowSegment.from.length() <= 0 || flightRowSegment.to.length() <= 0) {
            AnonymousClass003.A0l(bfm, -625993337);
            strA0H = null;
        } else {
            bfm.AgE(-574384943);
            strA0H = C3cJ.A0H(bfm, flightRowSegment.from, flightRowSegment.to, R.string._name_removed__res_0x7f120a2e);
        }
        FlightTimestamp flightTimestamp = flightRowSegment.depart;
        String str = flightTimestamp != null ? flightTimestamp.longTimestampString : null;
        FlightTimestamp flightTimestamp2 = flightRowSegment.arrive;
        return new FlightSegmentUiModel(strA0H, str, flightTimestamp2 != null ? flightTimestamp2.longTimestampString : null, BFI.A0F(new String[]{flightLine(flightRowSegment, bfm, i & 14), flightRowSegment.duration, cabinLine(flightRowSegment, flightRowSlice, bfm, i & 126)}), fareDetailRows(flightRowData, bfm, (i >> 6) & 14), flightRowSegment.airlineIcon);
    }

    public static final String bagRow(FlightRowData flightRowData, BFM bfm, int i) throws Resources.NotFoundException {
        BBI bbiA0M;
        String strDescribe;
        bfm.AgE(1254908302);
        if (flightRowData.baggageVaries) {
            bfm.AgE(1577952947);
            strDescribe = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a19);
        } else {
            bbiA0M = AnonymousClass002.A0M(bfm, 1578015412);
            FlightRowBags flightRowBags = flightRowData.bags;
            if (flightRowBags == null) {
                bfm.AgE(1578037545);
                BBI.A0R(bbiA0M, false);
                strDescribe = null;
                BBI.A0R(bbiA0M, false);
                return strDescribe;
            }
            bfm.AgE(-918926888);
            strDescribe = describe(flightRowBags, bfm, 0);
        }
        bbiA0M = C3cG.A07(bfm);
        BBI.A0R(bbiA0M, false);
        return strDescribe;
    }

    public static final String flightLine(FlightRowSegment flightRowSegment, BFM bfm, int i) {
        bfm.AgE(2016784239);
        String strA0w = null;
        String strA0L = AbstractC0878AGe.A0L(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a2f), "", "", BFI.A0F(new String[]{flightRowSegment.flight, flightRowSegment.carrier}), null);
        if (strA0L.length() > 0) {
            String str = flightRowSegment.operatingCarrier;
            if (str == null) {
                AnonymousClass001.A1D(bfm);
                return strA0L;
            }
            strA0w = AnonymousClass006.A0w(bfm, strA0L, str, R.string._name_removed__res_0x7f120a29);
        }
        AnonymousClass001.A1D(bfm);
        return strA0w;
    }

    public static final String offerSubtitle(FlightRowData flightRowData, int i, BFM bfm, int i2) {
        BBI bbiA07;
        FlightRowSlice flightRowSlice;
        String strFlightStopsLabel;
        bfm.AgE(651635127);
        if (flightRowData.slices.size() == 2) {
            bfm.AgE(-390010385);
            strFlightStopsLabel = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a2d);
            bbiA07 = C3cG.A07(bfm);
        } else {
            bfm.AgE(-389952725);
            bbiA07 = (BBI) bfm;
            BBI.A0R(bbiA07, false);
            if (flightRowData.slices.size() > 2 || ((flightRowSlice = (FlightRowSlice) AbstractC0878AGe.A0A(i, flightRowData.slices)) == null && (flightRowSlice = (FlightRowSlice) AbstractC0878AGe.A0G(flightRowData.slices)) == null)) {
                BBI.A0R(bbiA07, false);
                return null;
            }
            strFlightStopsLabel = FlightStopsLabelKt.flightStopsLabel(flightRowSlice, bfm, 0);
            String str = flightRowSlice.duration;
            if (str != null) {
                strFlightStopsLabel = AnonymousClass006.A0w(bfm, str, strFlightStopsLabel, R.string._name_removed__res_0x7f120a4f);
            }
        }
        BBI.A0R(bbiA07, false);
        return strFlightStopsLabel;
    }

    public static final String separatorText(BFM bfm, int i) {
        return AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a2f);
    }
}
