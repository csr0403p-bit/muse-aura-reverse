package com.facebook.aura.library.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G2j;
import com.facebook.aura.ui.ItemPosition;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$2$1 extends C7438Evz implements G2j<ItemPosition, Integer, Integer, Boolean, Integer> {
    public HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$2$1(Object obj) {
        super(4, obj, GoalDragResolver.class, "roomTopHint", "roomTopHint(Lcom/facebook/aura/ui/ItemPosition;IIZ)I", 0);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Integer invoke(ItemPosition itemPosition, Integer num, Integer num2, Boolean bool) {
        return invoke(itemPosition, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2), AnonymousClass001.A1X(bool));
    }

    public final Integer invoke(ItemPosition itemPosition, int i, int i2, boolean z) {
        return Integer.valueOf(((GoalDragResolver) AnonymousClass006.A0o(itemPosition, this)).roomTopHint(itemPosition, i, i2, z));
    }
}
