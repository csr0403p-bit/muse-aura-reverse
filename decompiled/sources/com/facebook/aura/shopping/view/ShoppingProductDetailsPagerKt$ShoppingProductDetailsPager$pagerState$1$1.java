package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$pagerState$1$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ AHD<ShoppingProductDetailsPagerItem> $pages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$pagerState$1$1(AHD<ShoppingProductDetailsPagerItem> ahd) {
        super(0);
        this.$pages = ahd;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$pages.size());
    }
}
