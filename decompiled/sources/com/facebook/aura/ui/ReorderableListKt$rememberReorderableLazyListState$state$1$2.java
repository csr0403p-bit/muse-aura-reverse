package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1BO;
import X.G0W;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$state$1$2 extends AbstractC7559F3s implements G0W<ItemPosition, Object, Boolean, Object> {
    public final /* synthetic */ C1BO<G0W<ItemPosition, Object, Boolean, Object>> $currentRoomBeforeFor$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$rememberReorderableLazyListState$state$1$2(C1BO<? extends G0W<? super ItemPosition, Object, ? super Boolean, ? extends Object>> c1bo) {
        super(3);
        this.$currentRoomBeforeFor$delegate = c1bo;
    }

    public final Object invoke(ItemPosition itemPosition, Object obj, boolean z) {
        AnonymousClass003.A0u(itemPosition, obj);
        return this.$currentRoomBeforeFor$delegate.getValue().invoke(itemPosition, obj, Boolean.valueOf(z));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(ItemPosition itemPosition, Object obj, Boolean bool) {
        return invoke(itemPosition, obj, AnonymousClass001.A1X(bool));
    }
}
