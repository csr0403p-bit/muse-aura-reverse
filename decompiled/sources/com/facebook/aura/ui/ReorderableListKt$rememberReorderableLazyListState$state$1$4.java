package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1BO;
import X.G0V;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$state$1$4 extends AbstractC7559F3s implements G0V<ItemPosition, Object, Boolean> {
    public final /* synthetic */ C1BO<G0V<ItemPosition, Object, Boolean>> $currentCanNestInto$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$rememberReorderableLazyListState$state$1$4(C1BO<? extends G0V<? super ItemPosition, Object, Boolean>> c1bo) {
        super(2);
        this.$currentCanNestInto$delegate = c1bo;
    }

    @Override // X.G0V
    public final Boolean invoke(ItemPosition itemPosition, Object obj) {
        AnonymousClass003.A0u(itemPosition, obj);
        return this.$currentCanNestInto$delegate.getValue().invoke(itemPosition, obj);
    }
}
