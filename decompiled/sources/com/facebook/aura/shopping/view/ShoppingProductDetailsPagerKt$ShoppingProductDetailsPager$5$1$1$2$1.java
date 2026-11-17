package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ PagerState $pagerState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1$2$1(int i, PagerState pagerState) {
        super(0);
        this.$index = i;
        this.$pagerState = pagerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1Q(this.$index, C1BO.A02(this.$pagerState.A0W)));
    }
}
