package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$1$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<Integer> $currentPage$delegate;
    public final /* synthetic */ int $page;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$1$2$1(int i, C1BO<Integer> c1bo) {
        super(0);
        this.$page = i;
        this.$currentPage$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1Q(this.$page, C1BO.A02(this.$currentPage$delegate)));
    }
}
