package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1$1$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ ShoppingProductDetailsPagerItem $page;
    public final /* synthetic */ PagerState $pagerState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1$1$1(ShoppingProductDetailsPagerItem shoppingProductDetailsPagerItem, int i, PagerState pagerState) {
        super(0);
        this.$page = shoppingProductDetailsPagerItem;
        this.$index = i;
        this.$pagerState = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = this.$page.key.sharedElementKey;
        if (this.$index != this.$pagerState.A07()) {
            return null;
        }
        return str;
    }
}
