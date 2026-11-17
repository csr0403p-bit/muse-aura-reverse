package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$state$1$1 extends AbstractC7559F3s implements G0V<ItemPosition, Integer, Integer> {
    public final /* synthetic */ C1BO<G0V<ItemPosition, Integer, Integer>> $currentTargetSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$rememberReorderableLazyListState$state$1$1(C1BO<? extends G0V<? super ItemPosition, ? super Integer, Integer>> c1bo) {
        super(2);
        this.$currentTargetSize$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Integer invoke(ItemPosition itemPosition, Integer num) {
        return invoke(itemPosition, AnonymousClass001.A0F(num));
    }

    public final Integer invoke(ItemPosition itemPosition, int i) {
        C7384Etj.A0Y(itemPosition, 0);
        return this.$currentTargetSize$delegate.getValue().invoke(itemPosition, Integer.valueOf(i));
    }
}
