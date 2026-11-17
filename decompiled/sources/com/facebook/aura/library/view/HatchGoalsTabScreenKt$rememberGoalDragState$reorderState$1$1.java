package com.facebook.aura.library.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7438Evz;
import X.G0W;
import com.facebook.aura.ui.ItemPosition;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$1$1 extends C7438Evz implements G0W<ItemPosition, Object, Boolean, GoalRootPlacement> {
    public HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$1$1(Object obj) {
        super(3, obj, GoalDragResolver.class, "roomBefore", "roomBefore(Lcom/facebook/aura/ui/ItemPosition;Ljava/lang/Object;Z)Lcom/facebook/aura/library/view/GoalRootPlacement;", 0);
    }

    public final GoalRootPlacement invoke(ItemPosition itemPosition, Object obj, boolean z) {
        AnonymousClass003.A0u(itemPosition, obj);
        return ((GoalDragResolver) this.receiver).roomBefore(itemPosition, obj, z);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ GoalRootPlacement invoke(ItemPosition itemPosition, Object obj, Boolean bool) {
        return invoke(itemPosition, obj, AnonymousClass001.A1X(bool));
    }
}
