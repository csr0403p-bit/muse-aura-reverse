package com.facebook.aura.library.view;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.ui.ItemPosition;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$3$1 extends C7438Evz implements G0V<ItemPosition, Object, Boolean> {
    public HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$3$1(Object obj) {
        super(2, obj, GoalDragResolver.class, "canNest", "canNest(Lcom/facebook/aura/ui/ItemPosition;Ljava/lang/Object;)Z", 0);
    }

    @Override // X.G0V
    public final Boolean invoke(ItemPosition itemPosition, Object obj) {
        AnonymousClass003.A0u(itemPosition, obj);
        return Boolean.valueOf(((GoalDragResolver) this.receiver).canNest(itemPosition, obj));
    }
}
