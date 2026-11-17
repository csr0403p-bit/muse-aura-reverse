package com.facebook.aura.bugreport;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC1979Avk;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0A3;
import X.C0ob;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1DP;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraBugCategoryChipsKt {
    public static final C1D3 ChipShape = C1D8.A00(18.0f);
    public static final C3TQ ChipPadding = new C1DP(12.0f, 10.0f, 12.0f, 10.0f);

    /* renamed from: com.facebook.aura.bugreport.AuraBugCategoryChipsKt$AuraBugCategoryChips$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C0A3, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<AuraBugCategory> $categories;
        public final /* synthetic */ G0U<String, Unit> $onSelectionChange;
        public final /* synthetic */ String $selectedId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<AuraBugCategory> ahd, String str, G0U<? super String, Unit> g0u) {
            super(3);
            this.$categories = ahd;
            this.$selectedId = str;
            this.$onSelectionChange = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0A3 c0a3, BFM bfm, Integer num) {
            invoke(c0a3, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C0A3 c0a3, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                for (AuraBugCategory auraBugCategory : this.$categories) {
                    boolean zAreEqual = C7384Etj.areEqual(auraBugCategory.id, this.$selectedId);
                    boolean zA1K = AnonymousClass003.A1K(bfm, this.$onSelectionChange, auraBugCategory);
                    G0U<String, Unit> g0u = this.$onSelectionChange;
                    Object objAaT = bfm.AaT();
                    if (zA1K || objAaT == C78N.A00) {
                        objAaT = new AuraBugCategoryChipsKt$AuraBugCategoryChips$1$1$1(g0u, auraBugCategory);
                        bfm.Ai0(objAaT);
                    }
                    AuraBugCategoryChipsKt.CategoryChip(auraBugCategory, zAreEqual, (G0U) objAaT, null, bfm, 0, 8);
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugCategoryChipsKt$AuraBugCategoryChips$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<AuraBugCategory> $categories;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onSelectionChange;
        public final /* synthetic */ String $selectedId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<AuraBugCategory> ahd, String str, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$categories = ahd;
            this.$selectedId = str;
            this.$onSelectionChange = g0u;
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
            AuraBugCategoryChipsKt.AuraBugCategoryChips(this.$categories, this.$selectedId, this.$onSelectionChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugCategoryChipsKt$CategoryChip$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraBugCategory $category;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onToggle;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraBugCategory auraBugCategory, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$category = auraBugCategory;
            this.$selected = z;
            this.$onToggle = g0u;
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
            AuraBugCategoryChipsKt.CategoryChip(this.$category, this.$selected, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraBugCategoryChips(AHD<AuraBugCategory> ahd, String str, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(ahd, 0, g0u);
        bfm.AgG(-873071425);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC1979Avk.A02(AcQ.A00(8.0f), AcQ.A00(8.0f), bfm, null, bRg2, B1V.A00(bfm, new AnonymousClass1(ahd, str, g0u), -729522054), 0, 0, ((iA0d >> 9) & 14) | 1573296, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, str, g0u, bRg2, i, i2);
        }
    }

    public static final void CategoryChip(AuraBugCategory auraBugCategory, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        AKH<AuraColors> akh;
        long jA0E;
        BRg bRg2 = bRg;
        bfm.AgG(1057715107);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraBugCategory) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
            if (z) {
                bfm.AgE(-1443025074);
                akh = AuraColorsKt.LocalAuraColors;
                jA0E = C06G.A0L(bfm, akh);
            } else {
                bfm.AgE(-1443023991);
                akh = AuraColorsKt.LocalAuraColors;
                jA0E = C06G.A0E(bfm, akh);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            long j = AnonymousClass001.A0f(bfm, akh).elevated;
            BRg bRgA0V = AnonymousClass001.A0V(bRg2, 36.0f);
            C1D3 c1d3 = ChipShape;
            BRg bRgA02 = C1DI.A02(C1b8.A03(C11U.A03(bRgA0V, c1d3), c1d3, j), c1d3, 1.0f, jA0E);
            C1YD c1yd = new C1YD(4);
            boolean zA1D = AnonymousClass003.A1D(iA0d) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new AuraBugCategoryChipsKt$CategoryChip$1$1(g0u, z);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0D = C3U4.A0D(C0ob.A00(bRgA02, c1yd, (Function0) objAaT, z, true), ChipPadding);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 4.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0D);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0D);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, auraBugCategory.iconRes, 0), AuraIconSize.TINY, null, C06G.A0G(bfm, akh), null, bfm, AnonymousClass001.A03(), 41);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, auraBugCategory.titleRes), null, C06G.A0C(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraBugCategory, z, g0u, bRg2, i, i2);
        }
    }
}
