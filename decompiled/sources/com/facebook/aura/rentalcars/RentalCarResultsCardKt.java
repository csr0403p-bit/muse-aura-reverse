package com.facebook.aura.rentalcars;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DM;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class RentalCarResultsCardKt {
    public static final int VISIBLE_RENTAL_CARS = 4;

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsCardKt$RentalCarResultRow$3, reason: invalid class name */
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
            RentalCarResultsCardKt.RentalCarResultRow(this.$rate, this.$imageSharedKey, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsCardKt$RentalCarResultsHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsCardKt.RentalCarResultsHeader(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsCardKt$RentalCarResultsHeader$3, reason: invalid class name and case insensitive filesystem */
    public final class C134633 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134633(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarResultsCardKt.RentalCarResultsHeader(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void RentalCarResultRow(RentalCarRate rentalCarRate, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-360249300);
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
                objAaT = RentalCarResultsCardKt$RentalCarResultRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA05, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            String str2 = rentalCarRate.car.imageUrl;
            BS0 bs0 = BRg.A00;
            RentalCarImageKt.m1882RentalCarImage6PoWaU8(str2, str, C10G.A07(bs0, 80.0f), 0.0f, 0.0f, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 24);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
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
            AuraTextKt.m2639AuraTextUY9GdpU(RentalCarFormattingKt.rentalCarPriceLine(rentalCarRate, bfm, i4), null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
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

    /* renamed from: RentalCarResultsCard-3f6hBDE, reason: not valid java name */
    public static final void m1883RentalCarResultsCard3f6hBDE(RentalCarResults rentalCarResults, String str, String str2, String str3, long j, C1DM c1dm, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(rentalCarResults, str, str2);
        C7384Etj.A0Y(c1dm, 5);
        bfm.AgG(1208646565);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarResults) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass002.A04(bfm.A64(j) ? 1 : 0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, c1dm);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRgA0Q);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0Q.then(c1062ATq), c1dm), j);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA01, f, AuraDimensKt.SpacingSmall, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA012, iA02);
                int i4 = 0;
                RentalCarResultsHeader(rentalCarResults.title, rentalCarResults.subtitle, null, bfm, 0, 4);
                bfm.AgE(714561893);
                for (Object obj : AbstractC0878AGe.A0a(rentalCarResults.rates, 4)) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        RentalCarRate rentalCarRate = (RentalCarRate) obj;
                        bfm.Ag8(1231085026, bfm.APR(Integer.valueOf(i4), rentalCarRate.rateId));
                        String strRentalCarImageSharedKey = RentalCarImageKt.rentalCarImageSharedKey(str, str2, i4, false);
                        boolean zA1W = AnonymousClass002.A1W(bfm, rentalCarRate, bfm.A67(auraNavigatorA0b) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1C(iA0d) | AnonymousClass004.A1K(iA0d), bfm.A63(i4));
                        Object objAaT = bfm.AaT();
                        if (zA1W || objAaT == C78N.A00) {
                            objAaT = new RentalCarResultsCardKt$RentalCarResultsCard$1$1$1$1(auraNavigatorA0b, str3, str, str2, i4, rentalCarRate);
                            bfm.Ai0(objAaT);
                        }
                        RentalCarResultRow(rentalCarRate, strRentalCarImageSharedKey, (Function0) objAaT, null, bfm, 0, 8);
                        BBI.A0R(bbi, false);
                        i4 = i5;
                    }
                }
                BBI.A0R(bbi, false);
                if (rentalCarResults.rates.size() > 4) {
                    bfm.AgE(677538121);
                    String strA0I = C3cJ.A0I(bfm, rentalCarResults.rates, R.plurals._name_removed__res_0x7f100017, rentalCarResults.rates.size());
                    AuraLabelButtonStyle auraLabelButtonStyleA0g = AnonymousClass006.A0g(bfm);
                    AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                    boolean zA1K = AnonymousClass004.A1K(iA0d) | bfm.A67(auraNavigatorA0b) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1C(iA0d);
                    Object objAaT2 = bfm.AaT();
                    if (zA1K || objAaT2 == C78N.A00) {
                        objAaT2 = new RentalCarResultsCardKt$RentalCarResultsCard$1$2$1(auraNavigatorA0b, str3, str, str2);
                        bfm.Ai0(objAaT2);
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0I, null, c1062ATq, auraLabelButtonStyleA0g, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                } else {
                    bfm.AgE(678014963);
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1Z);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new RentalCarResultsCardKt$RentalCarResultsCard$2(rentalCarResults, str, str2, str3, j, c1dm, bRgA0Q, i, i2);
        }
    }

    public static final void RentalCarResultsHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c134633;
        BRg bRg2 = bRg;
        bfm.AgG(-1271337749);
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
                    c134633 = new AnonymousClass1(str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c134633);
                }
                return;
            }
            BRg bRgA03 = C3U4.A03(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingNano);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            if (str == null) {
                bfm.AgE(220122214);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(220122215);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            if (str2 == null) {
                bfm.AgE(220363146);
            } else {
                bfm.AgE(220363147);
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme2), C3cH.A0E(bfm, auraTheme2), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c134633 = new C134633(str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c134633);
        }
    }
}
