package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1BO;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$state$1$5 extends AbstractC7559F3s implements G0U<DragRelease, Boolean> {
    public final /* synthetic */ C1BO<G0U<DragRelease, Boolean>> $currentOnDragEnd$delegate;

    @Override // X.G0U
    public final Boolean invoke(DragRelease dragRelease) {
        C7384Etj.A0Y(dragRelease, 0);
        G0U g0uA0B = C1BO.A0B(this.$currentOnDragEnd$delegate);
        boolean z = false;
        if (g0uA0B != null && AnonymousClass003.A1X(dragRelease, g0uA0B)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$rememberReorderableLazyListState$state$1$5(C1BO<? extends G0U<? super DragRelease, Boolean>> c1bo) {
        super(1);
        this.$currentOnDragEnd$delegate = c1bo;
    }
}
