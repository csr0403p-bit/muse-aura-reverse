package com.facebook.aura.shopping.view;

import X.AKH;
import X.AKQ;
import X.AT5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BOI;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DM;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchProductDetailsShimmerKt {
    public static final float PriceSlotFallbackHeight = 28.0f;
    public static final int SECTION_APPEAR_DURATION_MS = 280;
    public static final float SectionAppearSlide = 12.0f;
    public static final float ShimmerBarCorner = 8.0f;
    public static final float ShimmerHeaderWidth = 140.0f;
    public static final float ShimmerTextLineHeight = 16.0f;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt$ProductDetailsShimmer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            HatchProductDetailsShimmerKt.ProductDetailsShimmer(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt$ProductPriceLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C137272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137272(BRg bRg, int i, int i2) {
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
            HatchProductDetailsShimmerKt.ProductPriceLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt$ShimmerBar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ BO4 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BO4 bo4, BRg bRg, C1DM c1dm, int i, int i2) {
            super(2);
            this.$state = bo4;
            this.$modifier = bRg;
            this.$shape = c1dm;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchProductDetailsShimmerKt.ShimmerBar(this.$state, this.$modifier, this.$shape, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ProductDetailsShimmer(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1600631538);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BO4 bo4A01 = BOI.A01(bfm, null, 0.0f, 252, AnonymousClass001.A0f(bfm, akh).shimmeringBase, AnonymousClass001.A0f(bfm, akh).shimmeringHighlight);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            BRg bRgA08 = C10G.A08(bs0, ShimmerHeaderWidth);
            float f = ShimmerTextLineHeight;
            ShimmerBar(bo4A01, C10G.A04(bRgA08, f), null, bfm, 48, 4);
            C01N.A05(bfm, bs0);
            ShimmerBar(bo4A01, C10G.A04(c1062ATq, f), null, bfm, 48, 4);
            ShimmerBar(bo4A01, C10G.A04(c1062ATq, f), null, bfm, 48, 4);
            ShimmerBar(bo4A01, C10G.A04(C10G.A03(bs0, 0.6f), f), null, bfm, 48, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final void ProductPriceLoading(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2011031034);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc9);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BO4 bo4A01 = BOI.A01(bfm, null, 0.0f, 252, AnonymousClass001.A0f(bfm, akh).shimmeringBase, AnonymousClass001.A0f(bfm, akh).shimmeringHighlight);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchProductDetailsShimmerKt$ProductPriceLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            ShimmerBar(bo4A01, AnonymousClass001.A0Y(bRg2, objAaT, false), null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137272(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ShimmerBar(X.BO4 r7, X.BRg r8, X.C1DM r9, X.BFM r10, int r11, int r12) {
        /*
            r5 = r9
            r0 = -1751672177(0xffffffff97979a8f, float:-9.797162E-25)
            r10.AgG(r0)
            r6 = r11
            r0 = r11 & 6
            r3 = r7
            if (r0 != 0) goto L71
            int r2 = X.AnonymousClass004.A0d(r10, r7)
            r2 = r2 | r11
        L12:
            r0 = r11 & 48
            r4 = r8
            if (r0 != 0) goto L1c
            int r0 = X.AnonymousClass004.A0e(r10, r8)
            r2 = r2 | r0
        L1c:
            r0 = r11 & 384(0x180, float:5.38E-43)
            r7 = r12
            if (r0 != 0) goto L30
            r0 = r12 & 4
            if (r0 != 0) goto L2d
            boolean r1 = r10.A65(r9)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L2f
        L2d:
            r0 = 128(0x80, float:1.794E-43)
        L2f:
            r2 = r2 | r0
        L30:
            boolean r0 = X.AnonymousClass004.A1J(r2)
            boolean r0 = X.AnonymousClass001.A1b(r0, r10, r2)
            if (r0 == 0) goto L6d
            r10.Afy()
            r0 = r11 & 1
            if (r0 == 0) goto L62
            boolean r0 = r10.AEk()
            if (r0 != 0) goto L62
            r10.Afo()
        L4a:
            r10.AAb()
            X.BRg r0 = X.BOI.A00(r8, r5, r3)
            X.C01N.A07(r10, r0)
        L54:
            X.BBb r0 = r10.AAc()
            if (r0 == 0) goto L61
            com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt$ShimmerBar$1 r2 = new com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt$ShimmerBar$1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A06 = r2
        L61:
            return
        L62:
            r0 = r12 & 4
            if (r0 == 0) goto L4a
            float r0 = com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt.ShimmerBarCorner
            X.1D3 r5 = X.C1D8.A00(r0)
            goto L4a
        L6d:
            r10.Afo()
            goto L54
        L71:
            r2 = r11
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductDetailsShimmerKt.ShimmerBar(X.BO4, X.BRg, X.1DM, X.BFM, int, int):void");
    }

    public static final float getPriceSlotFallbackHeight() {
        return PriceSlotFallbackHeight;
    }

    public static final BRg pdpSectionAppearance(BRg bRg, Object obj, BFM bfm, int i) {
        AnonymousClass003.A0u(bRg, obj);
        boolean zA65 = bfm.A65(obj);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass002.A0I(bfm, 0.0f);
        }
        AT5 at5 = (AT5) objAaT;
        boolean zA67 = bfm.A67(at5);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = new HatchProductDetailsShimmerKt$pdpSectionAppearance$1$1(at5, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, obj);
        float fAh4 = AnonymousClass002.A0Y(bfm).Ah4(SectionAppearSlide);
        boolean zA672 = bfm.A67(at5) | bfm.A62(fAh4);
        Object objAaT3 = bfm.AaT();
        if (zA672 || objAaT3 == C78N.A00) {
            objAaT3 = new HatchProductDetailsShimmerKt$pdpSectionAppearance$2$1(at5, fAh4);
            bfm.Ai0(objAaT3);
        }
        return AnonymousClass001.A0W(bRg, objAaT3);
    }
}
