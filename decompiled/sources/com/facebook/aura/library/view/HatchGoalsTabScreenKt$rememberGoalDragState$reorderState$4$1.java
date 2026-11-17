package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0981AMm;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.ui.ItemPosition;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$4$1 extends AbstractC7559F3s implements G0V<ItemPosition, Integer, Integer> {
    public final /* synthetic */ C0981AMm<Object, Integer> $rootRowHeights;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$rememberGoalDragState$reorderState$4$1(C0981AMm<Object, Integer> c0981AMm) {
        super(2);
        this.$rootRowHeights = c0981AMm;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Integer invoke(ItemPosition itemPosition, Integer num) {
        return invoke(itemPosition, AnonymousClass001.A0F(num));
    }

    public final Integer invoke(ItemPosition itemPosition, int i) {
        C7384Etj.A0Y(itemPosition, 0);
        Integer num = this.$rootRowHeights.get(itemPosition.key);
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }
}
