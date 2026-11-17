package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$currentPage$2$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$currentPage$2$1(LazyListState lazyListState) {
        super(0);
        this.$listState = lazyListState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(HatchProductDetailsHeroKt.mostVisibleItemIndex(this.$listState));
    }
}
