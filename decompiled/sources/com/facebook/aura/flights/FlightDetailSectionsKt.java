package com.facebook.aura.flights;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.conversation.view.FlightTimeLabelKt;
import com.facebook.aura.model.FareCondition;
import com.facebook.aura.model.FlightRowBags;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSegment;
import com.facebook.aura.model.FlightRowSlice;
import com.facebook.aura.model.FlightTimestamp;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightDetailSectionsKt {

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightDetailCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightDetailSectionsKt.FlightDetailCard(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightDetailDivider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            FlightDetailSectionsKt.FlightDetailDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightDetailRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
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
            FlightDetailSectionsKt.FlightDetailRow(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightDetailSubtitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C120111 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120111(String str, BRg bRg, int i, int i2) {
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
            FlightDetailSectionsKt.FlightDetailSubtitle(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightDetailTitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C120121 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120121(String str, BRg bRg, int i, int i2) {
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
            FlightDetailSectionsKt.FlightDetailTitle(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightFareCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C120132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowData $offer;
        public final /* synthetic */ String $price;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120132(FlightRowData flightRowData, FlightRowSlice flightRowSlice, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$offer = flightRowData;
            this.$slice = flightRowSlice;
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
            FlightDetailSectionsKt.FlightFareCard(this.$offer, this.$slice, this.$price, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightFareTerm$3, reason: invalid class name and case insensitive filesystem */
    public final class C120143 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120143(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
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
            FlightDetailSectionsKt.FlightFareTerm(this.$label, this.$value, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightItineraryCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C120151 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120151(FlightRowSlice flightRowSlice) {
            super(2);
            this.$slice = flightRowSlice;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                int i2 = 0;
                for (FlightRowSegment flightRowSegment : this.$slice.segments) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    FlightRowSegment flightRowSegment2 = flightRowSegment;
                    if (i2 > 0) {
                        bfm.AgE(-1214774584);
                        FlightDetailSectionsKt.FlightDetailDivider(null, bfm, 0, 1);
                    } else {
                        bfm.AgE(996713743);
                    }
                    BBI.A0R((BBI) bfm, false);
                    FlightDetailSectionsKt.FlightSegmentRows(flightRowSegment2, null, bfm, 0, 2);
                    i2 = i3;
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightItineraryCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C120162 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120162(FlightRowSlice flightRowSlice, BRg bRg, int i, int i2) {
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
            FlightDetailSectionsKt.FlightItineraryCard(this.$slice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.flights.FlightDetailSectionsKt$FlightSegmentRows$2, reason: invalid class name and case insensitive filesystem */
    public final class C120172 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightRowSegment $segment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120172(FlightRowSegment flightRowSegment, BRg bRg, int i, int i2) {
            super(2);
            this.$segment = flightRowSegment;
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
            FlightDetailSectionsKt.FlightSegmentRows(this.$segment, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightDetailCard(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(-1876953451);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0R, auraTheme.getShapes(bfm, 6).card), auraTheme.getColors(bfm, 6).card);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            AnonymousClass003.A13(bfm, g0v, iA0d >> 3);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, g0v, i, i2);
        }
    }

    public static final void FlightItineraryCard(FlightRowSlice flightRowSlice, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(flightRowSlice, 0);
        bfm.AgG(1408803846);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowSlice) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            FlightDetailCard(bRg, B1V.A00(bfm, new C120151(flightRowSlice), 1702401637), bfm, ((iA0d >> 3) & 14) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120162(flightRowSlice, bRg, i, i2);
        }
    }

    public static final String cabinLabel(FlightRowSlice flightRowSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightRowSlice, 0);
        if (flightRowSlice.cabinVaries) {
            bfm.AgE(466997893);
            return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120a0c);
        }
        AnonymousClass003.A0l(bfm, 466999795);
        return flightRowSlice.cabin;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FareCondition.values().length];
            try {
                AnonymousClass002.A13(FareCondition.NO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FareCondition.YES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FareCondition.NOT_STATED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FlightDetailRow(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-984627862);
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
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightDetailSectionsKt$FlightDetailRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            FlightDetailTitle(str, null, bfm, iA0d & 14, 2);
            if (str2 == null) {
                bfm.AgE(-1772139770);
            } else {
                bfm.AgE(-1772139769);
                FlightDetailSubtitle(str2, null, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, bRg2, i, i2);
        }
    }

    public static final void FlightDetailSubtitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(950150279);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120111(str, bRg2, i, i2);
        }
    }

    public static final void FlightDetailTitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1298561591);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120121(str, bRg2, i, i2);
        }
    }

    public static final void FlightFareCard(FlightRowData flightRowData, FlightRowSlice flightRowSlice, String str, BRg bRg, BFM bfm, int i, int i2) {
        HxE hxEA0r;
        BBI bbiA07;
        HxE hxEA0S;
        HxE hxEA0S2;
        HxE hxEA0S3;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(flightRowData, flightRowSlice);
        bfm.AgG(-1046856696);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowData) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, flightRowSlice);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
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
            String strFareRule = fareRule(flightRowData.changeable, flightRowData.changePenalty, bfm, 0);
            if (strFareRule == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, -1150077589);
                hxEA0r = null;
            } else {
                bfm.AgE(-1150077588);
                hxEA0r = C3cG.A0r(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a05), strFareRule);
                bbiA07 = C3cG.A07(bfm);
            }
            String strRefundRule = refundRule(flightRowData.refundable, flightRowData.refundPenalty, bfm, 0);
            if (strRefundRule == null) {
                bfm.AgE(-1149941530);
                BBI.A0R(bbiA07, false);
                hxEA0S = null;
            } else {
                bfm.AgE(-1149941529);
                hxEA0S = C3cJ.A0S(bfm, bbiA07, strRefundRule, R.string._name_removed__res_0x7f120a02);
            }
            FlightRowBags flightRowBags = flightRowData.bags;
            int i4 = iA0d & 14;
            String strBagAllowance = bagAllowance(flightRowData, flightRowBags != null ? flightRowBags.carryOn : null, bfm, i4);
            if (strBagAllowance == null) {
                bfm.AgE(-1149809718);
                BBI.A0R(bbiA07, false);
                hxEA0S2 = null;
            } else {
                bfm.AgE(-1149809717);
                hxEA0S2 = C3cJ.A0S(bfm, bbiA07, strBagAllowance, R.string._name_removed__res_0x7f120a03);
            }
            FlightRowBags flightRowBags2 = flightRowData.bags;
            String strBagAllowance2 = bagAllowance(flightRowData, flightRowBags2 != null ? flightRowBags2.checked : null, bfm, i4);
            if (strBagAllowance2 == null) {
                bfm.AgE(-1149681657);
                BBI.A0R(bbiA07, false);
                hxEA0S3 = null;
            } else {
                bfm.AgE(-1149681656);
                hxEA0S3 = C3cJ.A0S(bfm, bbiA07, strBagAllowance2, R.string._name_removed__res_0x7f120a06);
            }
            List listA0F = BFI.A0F(new HxE[]{hxEA0r, hxEA0S, hxEA0S2, hxEA0S3});
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            FlightResultsScreenKt.m949FlightSectionLabel6a0pyJM(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a08), null, 0.0f, bfm, 0, 6);
            FlightDetailCard(null, B1V.A00(bfm, new FlightDetailSectionsKt$FlightFareCard$1$1(flightRowSlice, str, listA0F), 41299933), bfm, 48, zA1a ? 1 : 0);
            BBI.A0R(bbiA07, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120132(flightRowData, flightRowSlice, str, bRg2, i, i2);
        }
    }

    public static final void FlightFareTerm(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1461270301);
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
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightDetailSectionsKt$FlightFareTerm$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, BRg.A00, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120143(str, str2, bRg2, i, i2);
        }
    }

    public static final String bagAllowance(FlightRowData flightRowData, Long l, BFM bfm, int i) {
        String strA0Y;
        int i2;
        if (flightRowData.baggageVaries) {
            bfm.AgE(139873176);
            i2 = R.string._name_removed__res_0x7f120a17;
        } else {
            if (l == null) {
                AnonymousClass003.A0l(bfm, 41172182);
                return null;
            }
            long jLongValue = l.longValue();
            if (jLongValue <= 0) {
                bfm.AgE(139876350);
                i2 = R.string._name_removed__res_0x7f120a0e;
            } else {
                if (jLongValue != 1) {
                    bfm.AgE(139881339);
                    strA0Y = AnonymousClass007.A0Y((int) jLongValue, bfm, R.plurals._name_removed__res_0x7f100029);
                    AnonymousClass001.A1D(bfm);
                    return strA0Y;
                }
                bfm.AgE(139878810);
                i2 = R.string._name_removed__res_0x7f120a0a;
            }
        }
        strA0Y = AbstractC2271BQs.A01(bfm, i2);
        AnonymousClass001.A1D(bfm);
        return strA0Y;
    }

    public static final String fareRule(FareCondition fareCondition, String str, BFM bfm, int i) {
        String strA01;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = fareCondition.ordinal();
        if (iOrdinal != 1) {
            strA01 = null;
            if (iOrdinal == 0) {
                bfm.AgE(-1635515502);
                if (str == null) {
                    bfm.AgE(-1635508962);
                } else {
                    bfm.AgE(-1635508961);
                    strA01 = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120a09);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                if (strA01 == null) {
                    bfm.AgE(639980731);
                    strA01 = AnonymousClass001.A0s(bfm, bbiA07, R.string._name_removed__res_0x7f1209ff);
                } else {
                    bfm.AgE(639978096);
                    BBI.A0R(bbiA07, false);
                }
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass005.A0k(bfm, 639973894);
                }
                bfm.AgE(-1635350924);
            }
        } else {
            bfm.AgE(639975071);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a0d);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final String refundRule(FareCondition fareCondition, String str, BFM bfm, int i) {
        String strFareRule;
        if (fareCondition == FareCondition.NO) {
            bfm.AgE(-1689485800);
            strFareRule = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a0f);
        } else {
            bfm.AgE(-1689483685);
            strFareRule = fareRule(fareCondition, str, bfm, i & 126);
        }
        AnonymousClass002.A19(bfm);
        return strFareRule;
    }

    public static final void FlightDetailDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(624828075);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraDividerKt.AuraRowDivider(C3U4.A07(bRg, AuraDimensKt.SpacingMedium), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final void FlightSegmentRows(FlightRowSegment flightRowSegment, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1435751946);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, flightRowSegment) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
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
            FlightTimestamp flightTimestamp = flightRowSegment.depart;
            if (flightTimestamp == null) {
                bfm.AgE(-696094998);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-696094997);
                String strA0t = AnonymousClass001.A0t(bfm, flightTimestamp.shortTimestampString, R.string._name_removed__res_0x7f120a07);
                String str = flightTimestamp.dateString;
                if (str == null) {
                    str = flightTimestamp.longTimestampString;
                }
                String str2 = flightRowSegment.from;
                if (str2.length() == 0) {
                    str2 = null;
                }
                FlightDetailRow(strA0t, FlightResultsFormattingKt.detailPair(str, str2, bfm, 0), null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            }
            if (flightRowSegment.depart == null || flightRowSegment.arrive == null) {
                bfm.AgE(-695697546);
            } else {
                bfm.AgE(393199489);
                FlightDetailDivider(null, bfm, 0, 1);
            }
            BBI.A0R(bbi, false);
            FlightTimestamp flightTimestamp2 = flightRowSegment.arrive;
            if (flightTimestamp2 == null) {
                bfm.AgE(-695666640);
            } else {
                bfm.AgE(-695666639);
                String strA0t2 = AnonymousClass001.A0t(bfm, FlightTimeLabelKt.flightShortTime(flightTimestamp2, bfm, 0), R.string._name_removed__res_0x7f120a00);
                String str3 = flightTimestamp2.dateString;
                if (str3 == null) {
                    str3 = flightTimestamp2.longTimestampString;
                }
                String str4 = flightRowSegment.to;
                FlightDetailRow(strA0t2, FlightResultsFormattingKt.detailPair(str3, str4.length() != 0 ? str4 : null, bfm, 0), null, bfm, 0, 4);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C120172(flightRowSegment, bRg, i, i2);
        }
    }
}
