package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G2j;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$state$1$3 extends AbstractC7559F3s implements G2j<ItemPosition, Integer, Integer, Boolean, Integer> {
    public final /* synthetic */ C1BO<G2j<ItemPosition, Integer, Integer, Boolean, Integer>> $currentRoomTopHintFor$delegate;

    public final Integer invoke(ItemPosition itemPosition, int i, int i2, boolean z) {
        C7384Etj.A0Y(itemPosition, 0);
        return this.$currentRoomTopHintFor$delegate.getValue().invoke(itemPosition, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$rememberReorderableLazyListState$state$1$3(C1BO<? extends G2j<? super ItemPosition, ? super Integer, ? super Integer, ? super Boolean, Integer>> c1bo) {
        super(4);
        this.$currentRoomTopHintFor$delegate = c1bo;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Integer invoke(ItemPosition itemPosition, Integer num, Integer num2, Boolean bool) {
        return invoke(itemPosition, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2), AnonymousClass001.A1X(bool));
    }
}
