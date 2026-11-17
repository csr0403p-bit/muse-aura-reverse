package com.facebook.aura.shopping.view;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
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
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingCartItem;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ShoppingCartRowsKt {
    public static final C1D3 ShoppingCartThumbnailShape = C1D8.A00(8.0f);
    public static final float ShoppingCartThumbnailSize = 40.0f;

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartEmpty$1, reason: invalid class name */
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

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartEmpty(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartItemRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingCartItem $item;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ShoppingCartItem shoppingCartItem, BRg bRg, int i, int i2) {
            super(2);
            this.$item = shoppingCartItem;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartItemRow(this.$item, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartQuantityPill$1, reason: invalid class name and case insensitive filesystem */
    public final class C137581 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ double $quantity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137581(double d, BRg bRg, int i, int i2) {
            super(2);
            this.$quantity = d;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartQuantityPill(this.$quantity, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartStaleNotice$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isRetrying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isRetrying = z;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartStaleNotice(this.$isRetrying, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartSubtotal$3, reason: invalid class name and case insensitive filesystem */
    public final class C137593 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtotal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137593(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$subtotal = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartSubtotal(this.$subtotal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartThumbnail$1, reason: invalid class name and case insensitive filesystem */
    public final class C137601 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137601(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartThumbnail(this.$imageUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartRowsKt$ShoppingCartThumbnailPlaceholder$1, reason: invalid class name and case insensitive filesystem */
    public final class C137611 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137611(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingCartRowsKt.ShoppingCartThumbnailPlaceholder(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ShoppingCartEmpty(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-106635548);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f8);
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXlarge);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA06, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void ShoppingCartItemRow(ShoppingCartItem shoppingCartItem, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(shoppingCartItem, 0);
        bfm.AgG(-1791576595);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingCartItem) | i : i;
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
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ShoppingCartRowsKt$ShoppingCartItemRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            ShoppingCartThumbnail(shoppingCartItem.imageUrl, null, bfm, 0, 2);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = shoppingCartItem.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str2 = shoppingCartItem.linePrice;
            if (str2 == null) {
                bfm.AgE(-496987440);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -496987439).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            ShoppingCartQuantityPill(shoppingCartItem.quantity, null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(shoppingCartItem, bRg2, i, i2);
        }
    }

    public static final void ShoppingCartQuantityPill(double d, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1874965120);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(bfm.A61(d) ? 1 : 0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0t = AnonymousClass001.A0t(bfm, formatCartQuantity(d, bfm, iA05 & 14), R.string._name_removed__res_0x7f1205f9);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, C3U4.A0B(C1b8.A01(C11U.A03(bRg2, auraTheme.getShapes(bfm, 6).pill), auraTheme.getColors(bfm, 6).secondaryElevated), AuraDimensKt.SpacingXsmall, AuraDimensKt.SpacingMicro), C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15856);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137581(d, bRg2, i, i2);
        }
    }

    public static final void ShoppingCartStaleNotice(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1626056136);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205fa);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ShoppingCartRowsKt$ShoppingCartStaleNotice$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA012 = ARD.A01(bs0, (G0U) objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA012, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205fc), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205ff), null, null, AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.PILL, bfm, 54, 0), AuraButtonSize.SMALL, null, false, false, false, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, AnonymousClass001.A0B(iA0n << 9, iA0n & 14), 0, 134200269);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, function0, bRg2, i, i2);
        }
    }

    public static final void ShoppingCartSubtotal(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-611315232);
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
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ShoppingCartRowsKt$ShoppingCartSubtotal$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingMedium, 0.0f, 0.0f), AuraDimensKt.SpacingMicro, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0S, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205fd);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA0O, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137593(str, bRg2, i, i2);
        }
    }

    public static final void ShoppingCartThumbnail(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1299301220);
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
            float f = ShoppingCartThumbnailSize;
            BRg bRgA07 = C10G.A07(bRg2, f);
            C1D3 c1d3 = ShoppingCartThumbnailShape;
            BRg bRgA03 = C11U.A03(bRgA07, c1d3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA02 = C1DI.A02(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).elevated), c1d3, 0.5f, auraTheme.getColors(bfm, 6).border);
            String strHttpsUrlOrNull = ProductDetailsPresentationKt.httpsUrlOrNull(str);
            if (strHttpsUrlOrNull == null) {
                bfm.AgE(-1236907350);
                ShoppingCartThumbnailPlaceholder(bRgA02, bfm, 0, 0);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(-1236835554);
                AuraImageKt.m2573AuraImageXRP3Ue8(strHttpsUrlOrNull, bRgA02, B18.A00, null, null, false, new C1DG(f), 0L, false, false, false, ComposableSingletons$ShoppingCartRowsKt.f274lambda$1649229835, null, null, null, bfm, 1573248, 48, 30648);
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137601(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String formatCartQuantity(double r3, X.BFM r5, int r6) {
        /*
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r5.A61(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r5.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L2c
        L1d:
            android.icu.text.NumberFormat r1 = android.icu.text.NumberFormat.getNumberInstance()
            r0 = 2
            r1.setMaximumFractionDigits(r0)
            java.lang.String r1 = r1.format(r3)
            r5.Ai0(r1)
        L2c:
            java.lang.String r1 = (java.lang.String) r1
            X.C7384Etj.A0X(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingCartRowsKt.formatCartQuantity(double, X.BFM, int):java.lang.String");
    }

    public static final void ShoppingCartThumbnailPlaceholder(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1916356770);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A02(C2VU.A09, bRg, false), BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0), AuraIconSize.SMALL, null, C3cH.A0W(bfm).secondaryText, null, bfm, AnonymousClass001.A03(), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137611(bRg, i, i2);
        }
    }
}
