package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.shopping.model.PdpActionIntent;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsDisplayState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $addToCartFailed;
    public final /* synthetic */ ProductDetailsAnalytics $analytics;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ Integer $buyButtonColor;
    public final /* synthetic */ boolean $buyFailed;
    public final /* synthetic */ ShoppingProductDetailsDisplayState $display;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $heroOverlay;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ ShoppingProductDetailsHydrationState $hydration;
    public final /* synthetic */ boolean $isAddingToCart;
    public final /* synthetic */ boolean $isBuying;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
    public final /* synthetic */ G0V<ShoppingResultProduct, ShoppingFormat, Unit> $onRelatedProductClick;
    public final /* synthetic */ Function0<Unit> $onReload;
    public final /* synthetic */ G0V<String, String, Unit> $onSelect;
    public final /* synthetic */ G0V<List<String>, Integer, Unit> $onSelectHeroImage;
    public final /* synthetic */ ProductDetailsPresentation $presentation;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ boolean $usesPartnerTemplate;

    public final void invoke(BFM bfm, int i) {
        ShoppingProductDetailsBodyKt.m2071ShoppingProductDetailsBodynywSH8E(this.$presentation, this.$display, this.$hydration, this.$usesPartnerTemplate, this.$isBuying, this.$buyFailed, this.$isAddingToCart, this.$addToCartFailed, this.$onSelect, this.$onAction, this.$onReload, this.$onRelatedProductClick, this.$onSelectHeroImage, this.$hostMessageId, this.$analytics, this.$topPadding, this.$bottomPadding, this.$buyButtonColor, this.$sharedElementKey, this.$morphSeedDecodeSize, this.$heroOverlay, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$2(ProductDetailsPresentation productDetailsPresentation, ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState, ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, G0V<? super String, ? super String, Unit> g0v, G0U<? super PdpActionIntent, Unit> g0u, Function0<Unit> function0, G0V<? super ShoppingResultProduct, ? super ShoppingFormat, Unit> g0v2, G0V<? super List<String>, ? super Integer, Unit> g0v3, String str, ProductDetailsAnalytics productDetailsAnalytics, float f, float f2, Integer num, Function0<String> function02, C1DG c1dg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, int i, int i2, int i3, int i4) {
        super(2);
        this.$presentation = productDetailsPresentation;
        this.$display = shoppingProductDetailsDisplayState;
        this.$hydration = shoppingProductDetailsHydrationState;
        this.$usesPartnerTemplate = z;
        this.$isBuying = z2;
        this.$buyFailed = z3;
        this.$isAddingToCart = z4;
        this.$addToCartFailed = z5;
        this.$onSelect = g0v;
        this.$onAction = g0u;
        this.$onReload = function0;
        this.$onRelatedProductClick = g0v2;
        this.$onSelectHeroImage = g0v3;
        this.$hostMessageId = str;
        this.$analytics = productDetailsAnalytics;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$buyButtonColor = num;
        this.$sharedElementKey = function02;
        this.$morphSeedDecodeSize = c1dg;
        this.$heroOverlay = g0w;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
