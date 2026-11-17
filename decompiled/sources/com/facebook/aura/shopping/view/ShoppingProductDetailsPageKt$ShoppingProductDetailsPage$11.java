package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ Function0<Boolean> $isSettledPage;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ShoppingProductDetailsPageKey $productKey;
    public final /* synthetic */ ShoppingResultProduct $seededProduct;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ String $viewModelKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$11(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, float f, float f2, Function0<String> function0, ShoppingResultProduct shoppingResultProduct, String str, Function0<Boolean> function02, BRg bRg, int i, int i2) {
        super(2);
        this.$productKey = shoppingProductDetailsPageKey;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$sharedElementKey = function0;
        this.$seededProduct = shoppingResultProduct;
        this.$viewModelKey = str;
        this.$isSettledPage = function02;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingProductDetailsPageKt.m2074ShoppingProductDetailsPageeWuZFaY(this.$productKey, this.$topPadding, this.$bottomPadding, this.$sharedElementKey, this.$seededProduct, this.$viewModelKey, this.$isSettledPage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
