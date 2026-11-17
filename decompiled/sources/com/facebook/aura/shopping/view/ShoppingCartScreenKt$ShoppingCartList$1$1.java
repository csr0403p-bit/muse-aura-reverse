package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.analytics.hatch.HatchShoppingDataState;
import com.facebook.aura.shopping.model.ShoppingCart;
import com.facebook.aura.shopping.model.ShoppingCartItem;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ShoppingCartScreenKt$ShoppingCartList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ ShoppingCart $cart;
    public final /* synthetic */ HatchShoppingDataState $dataState;
    public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
    public final /* synthetic */ boolean $showSubtotal;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $staleNotice;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        G0W<? super AnonymousClass037, ? super BFM, ? super Integer, Unit> g0wA01;
        Object obj;
        String str;
        C7384Etj.A0Y(c0cd, 0);
        G0V<BFM, Integer, Unit> g0v = this.$staleNotice;
        if (g0v != null) {
            c0cd.APJ("stale_notice", null, B1V.A01(new ShoppingCartScreenKt$ShoppingCartList$1$1$1$1(g0v), 1043400010, true));
        }
        ShoppingCart shoppingCart = this.$cart;
        if (shoppingCart != null) {
            if (shoppingCart.items.isEmpty()) {
                g0wA01 = ComposableSingletons$ShoppingCartScreenKt.f275lambda$1632783848;
                obj = null;
                str = "empty";
            } else {
                final List<ShoppingCartItem> list = this.$cart.items;
                final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
                final ShoppingCheckoutLogContext shoppingCheckoutLogContext = this.$logContext;
                final HatchShoppingDataState hatchShoppingDataState = this.$dataState;
                c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartList$1$1$invoke$$inlined$itemsIndexed$default$1
                    public final Object invoke(int i) {
                        return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass2, i);
                    }

                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(AnonymousClass001.A0F(num));
                    }
                } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartList$1$1$invoke$$inlined$itemsIndexed$default$2
                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        list.get(AnonymousClass001.A0F(num));
                        return null;
                    }

                    public final Object invoke(int i) {
                        list.get(i);
                        return null;
                    }
                }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartList$1$1$invoke$$inlined$itemsIndexed$default$3
                    public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                        if ((i2 & 48) == 0) {
                            iA0d |= AnonymousClass004.A0E(bfm, i);
                        }
                        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                            bfm.Afo();
                            return;
                        }
                        ShoppingCartItem shoppingCartItem = (ShoppingCartItem) list.get(i);
                        bfm.AgE(-1440471649);
                        BRg bRgA09 = C3cG.A09(bfm, -600653069);
                        if (i == 0) {
                            bRgA09 = ShoppingCheckoutImpressionKt.rememberShoppingCheckoutImpression(shoppingCheckoutLogContext, null, hatchShoppingDataState, bfm, 0, 2);
                        }
                        BBI bbiA07 = C3cG.A07(bfm);
                        ShoppingCartRowsKt.ShoppingCartItemRow(shoppingCartItem, bRgA09, bfm, 0, 0);
                        BBI.A0R(bbiA07, false);
                    }

                    @Override // X.G2j
                    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                        invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                        return Unit.INSTANCE;
                    }
                }, 2039820996, true), list.size());
                String str2 = this.$cart.subtotal;
                if (str2 == null || !this.$showSubtotal) {
                    return;
                }
                g0wA01 = B1V.A01(new ShoppingCartScreenKt$ShoppingCartList$1$1$5$1(str2), -2023959656, true);
                obj = null;
                str = "subtotal";
            }
            c0cd.APJ(str, obj, g0wA01);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingCartScreenKt$ShoppingCartList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, ShoppingCartItem, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ShoppingCartItem shoppingCartItem) {
            AnonymousClass005.A0w(num);
            ShoppingCartItem shoppingCartItem2 = shoppingCartItem;
            C7384Etj.A0Y(shoppingCartItem2, 1);
            return shoppingCartItem2.id;
        }

        public final Object invoke(int i, ShoppingCartItem shoppingCartItem) {
            C7384Etj.A0Y(shoppingCartItem, 1);
            return shoppingCartItem.id;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingCartScreenKt$ShoppingCartList$1$1(G0V<? super BFM, ? super Integer, Unit> g0v, ShoppingCart shoppingCart, ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingDataState hatchShoppingDataState, boolean z) {
        super(1);
        this.$staleNotice = g0v;
        this.$cart = shoppingCart;
        this.$logContext = shoppingCheckoutLogContext;
        this.$dataState = hatchShoppingDataState;
        this.$showSubtotal = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
