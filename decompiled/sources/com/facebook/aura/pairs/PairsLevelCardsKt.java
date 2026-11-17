package com.facebook.aura.pairs;

import X.AHD;
import X.AKH;
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
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BOf;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0lh;
import X.C0ob;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D8;
import X.C1DI;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3bM;
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
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PairsLevelCardsKt {

    /* renamed from: com.facebook.aura.pairs.PairsLevelCardsKt$PairsLevelCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ PairsLevel $level;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PairsLevel pairsLevel, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$level = pairsLevel;
            this.$selected = z;
            this.$enabled = z2;
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
            PairsLevelCardsKt.PairsLevelCard(this.$level, this.$selected, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsLevelCardsKt$PairsLevelCards$2, reason: invalid class name and case insensitive filesystem */
    public final class C129242 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ AHD<PairsLevel> $levels;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PairsLevel, Unit> $onLevelSelected;
        public final /* synthetic */ PairsLevel $selectedLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C129242(AHD<? extends PairsLevel> ahd, PairsLevel pairsLevel, G0U<? super PairsLevel, Unit> g0u, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$levels = ahd;
            this.$selectedLevel = pairsLevel;
            this.$onLevelSelected = g0u;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PairsLevelCardsKt.PairsLevelCards(this.$levels, this.$selectedLevel, this.$onLevelSelected, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final int getTitleRes(PairsLevel pairsLevel) {
        C7384Etj.A0Y(pairsLevel, 0);
        return presentation(pairsLevel).title;
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsLevel.values().length];
            try {
                AnonymousClass002.A13(PairsLevel.ASK_FIRST, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsLevel.ACT_FREELY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PairsLevelCard(PairsLevel pairsLevel, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AKH<AuraColors> akh;
        long jA0I;
        BRg bRgA02;
        BRg bRg2;
        BRg bRg3 = bRg;
        bfm.AgG(-2077140366);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, pairsLevel) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            PairsLevelPresentation pairsLevelPresentationPresentation = presentation(pairsLevel);
            if (z) {
                bfm.AgE(1027908797);
                akh = AuraColorsKt.LocalAuraColors;
                jA0I = C06G.A0L(bfm, akh);
            } else {
                bfm.AgE(1027909887);
                akh = AuraColorsKt.LocalAuraColors;
                jA0I = C06G.A0I(bfm, akh);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (z) {
                bfm.AgE(1027912044);
                bRg2 = BRg.A00;
                bRgA02 = C1DI.A02(bRg2, C1D8.A00(20.0f), 4.0f, C06G.A0L(bfm, akh));
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1027914234);
                BBI.A0R(bbi, false);
                bRgA02 = BRg.A00;
                bRg2 = bRgA02;
            }
            BRg bRgA00 = C0ob.A00(C1b8.A01(C11U.A01(AnonymousClass001.A0U(bRg3, 122.0f), 20.0f), AnonymousClass001.A0f(bfm, akh).card).then(bRgA02), new C1YD(3), function0, z, z2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BRg bRgA0B = C3U4.A0B(C10G.A02, 12.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 4.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0T, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AVy aVyA00 = BOf.A00(bfm, pairsLevelPresentationPresentation.icon, 0);
            int i5 = AVy.$stable;
            AuraIconKt.m2568AuraIconFyETyZw(null, aVyA00, 24.0f, null, jA0I, null, bfm, (i5 << 3) | 384, 41);
            String strA01 = AbstractC2271BQs.A01(bfm, pairsLevelPresentationPresentation.title);
            AKH<AuraTypography> akh2 = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, jA0I, AnonymousClass001.A0g(bfm, akh2).bodyEmphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, pairsLevelPresentationPresentation.body), null, jA0I, C06G.A0a(bfm, akh2), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
            if (z) {
                bfm.AgE(-1539574075);
                AuraIconKt.m2568AuraIconFyETyZw(C3U4.A0C(c0z7.A4C(C2VU.A0D, bRg2), 0.0f, 12.0f, 12.0f, 0.0f), BOf.A00(bfm, R.drawable.circle_check_wght400_filled_24, 0), 20.0f, null, AnonymousClass002.A0c(bfm).iconSuccess, null, bfm, (i5 << 3) | 384, 40);
            } else {
                bfm.AgE(-1539317302);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pairsLevel, z, z2, function0, bRg3, i, i2);
        }
    }

    public static final void PairsLevelCards(AHD<? extends PairsLevel> ahd, PairsLevel pairsLevel, G0U<? super PairsLevel, Unit> g0u, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        AnonymousClass002.A1A(ahd, 0, g0u);
        bfm.AgG(348548746);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(pairsLevel));
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
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            BRg bRgA00 = C3bM.A00(BGR.A00(C0lh.A03, AnonymousClass001.A0R(bRg2)));
            InterfaceC1380AiA interfaceC1380AiAA0Q = AnonymousClass006.A0Q(AcQ.A00(10.0f), bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0Q, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 402435785);
            while (itA0w.hasNext()) {
                PairsLevel pairsLevel2 = (PairsLevel) itA0w.next();
                boolean zA1Z = AnonymousClass002.A1Z(pairsLevel2, pairsLevel);
                boolean zA1H = AnonymousClass003.A1H(bfm, pairsLevel2, AnonymousClass004.A1K(iA0d));
                Object objAaT = bfm.AaT();
                if (zA1H || objAaT == C78N.A00) {
                    objAaT = new PairsLevelCardsKt$PairsLevelCards$1$1$1$1(g0u, pairsLevel2);
                    bfm.Ai0(objAaT);
                }
                PairsLevelCard(pairsLevel2, zA1Z, z2, (Function0) objAaT, AnonymousClass006.A0L(c90m, BRg.A00).then(C10G.A00), bfm, (iA0d >> 6) & 896, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129242(ahd, pairsLevel, g0u, bRg2, z2, i, i2);
        }
    }

    public static final PairsLevelPresentation presentation(PairsLevel pairsLevel) {
        int i;
        int i2;
        int i3;
        int iOrdinal = pairsLevel.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.handstopalt_outline_24_wght400;
            i2 = R.string._name_removed__res_0x7f120d6b;
            i3 = R.string._name_removed__res_0x7f120d6a;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.thumbup_outline_24_wght400;
            i2 = R.string._name_removed__res_0x7f120d69;
            i3 = R.string._name_removed__res_0x7f120d68;
        }
        return new PairsLevelPresentation(i, i2, i3);
    }
}
