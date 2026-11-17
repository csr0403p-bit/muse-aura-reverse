package com.facebook.aura.spaces.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSpaceBuildingViewKt {
    public static final C7197Ei9 ICON_CENTER_CROP = AnonymousClass005.A0Z(C7197Ei9.A0P);
    public static final float IconSize = 72.0f;
    public static final float SpinnerSize = 20.0f;

    /* renamed from: com.facebook.aura.spaces.view.HatchSpaceBuildingViewKt$HatchSpaceBuildingView$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SpaceCard $card;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SpaceCard spaceCard, BRg bRg, int i, int i2) {
            super(2);
            this.$card = spaceCard;
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
            HatchSpaceBuildingViewKt.HatchSpaceBuildingView(this.$card, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.HatchSpaceBuildingViewKt$SpaceBuildingIcon$3, reason: invalid class name and case insensitive filesystem */
    public final class C139673 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SpaceCard $card;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139673(SpaceCard spaceCard, int i) {
            super(2);
            this.$card = spaceCard;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSpaceBuildingViewKt.SpaceBuildingIcon(this.$card, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchSpaceBuildingView(SpaceCard spaceCard, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(spaceCard, 0);
        bfm.AgG(-1503231477);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, spaceCard) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(bRg2), C06G.A0B(bfm));
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA07 = C3U4.A07(bRgA01, f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchSpaceBuildingViewKt$HatchSpaceBuildingView$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            SpaceBuildingIcon(spaceCard, bfm, iA0T & 14);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f);
            String strA0t = AnonymousClass001.A0t(bfm, spaceCard.title, R.string._name_removed__res_0x7f120fd7);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, 0L, AnonymousClass001.A0g(bfm, akh).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            C01N.A05(bfm, bs0);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, SpinnerSize), null, 0L, bfm, 6, 6);
            C01N.A09(bfm, bs0, 6.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fd8), null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(spaceCard, bRg2, i, i2);
        }
    }

    public static final void SpaceBuildingIcon(SpaceCard spaceCard, BFM bfm, int i) {
        bfm.AgG(-13209194);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, spaceCard) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            String str = spaceCard.imageUrl;
            String str2 = spaceCard.icon;
            boolean zA65 = bfm.A65(str);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            if (str != null && !MutableState.A0A(mutableState)) {
                bfm.AgE(1622117561);
                BRg bRgA03 = C11U.A03(C10G.A07(BRg.A00, IconSize), C06G.A0R(bfm));
                C7197Ei9 c7197Ei9 = ICON_CENTER_CROP;
                boolean zA652 = bfm.A65(mutableState);
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSpaceBuildingViewKt$SpaceBuildingIcon$1$1(mutableState);
                    bfm.Ai0(objAaT2);
                }
                AuraImageKt.AuraImage(str, bRgA03, c7197Ei9, null, null, false, null, (Function0) objAaT2, false, null, bfm, 1572864, 824);
            } else if (str2 == null || str2.length() == 0) {
                bfm.AgE(1622753123);
                String upperCase = BQG.A17(AnonymousClass002.A0l(spaceCard.title), 1).toUpperCase(Locale.ROOT);
                if (upperCase.length() == 0) {
                    upperCase = "S";
                }
                AuraTextKt.m2639AuraTextUY9GdpU(upperCase, C10G.A02(C2VU.A09, C06G.A0P(bfm, C10G.A07(BRg.A00, IconSize), C06G.A0R(bfm)), false), C06G.A0D(bfm), C06G.A0U(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C10G.A02(C2VU.A09, C06G.A0P(bfm, C10G.A07(BRg.A00, IconSize), C06G.A0R(bfm)), false), 0L, AnonymousClass006.A0k(bfm, 1622400064).title2Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139673(spaceCard, i);
        }
    }
}
