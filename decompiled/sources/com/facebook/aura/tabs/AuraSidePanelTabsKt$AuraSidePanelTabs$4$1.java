package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00q;
import X.C00r;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.DraggedRowPosition;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$4$1 extends AbstractC7559F3s implements G0V<Integer, DraggedRowPosition, Unit> {
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ MutableState<Boolean> $draggedClearOfList$delegate;
    public final /* synthetic */ C00r $targetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$4$1(C00q c00q, MutableState<Boolean> mutableState, C00r c00r) {
        super(2);
        this.$dragOffsetY$delegate = c00q;
        this.$draggedClearOfList$delegate = mutableState;
        this.$targetIndex$delegate = c00r;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, DraggedRowPosition draggedRowPosition) {
        invoke(AnonymousClass001.A0F(num), draggedRowPosition);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, DraggedRowPosition draggedRowPosition) {
        C7384Etj.A0Y(draggedRowPosition, 1);
        this.$dragOffsetY$delegate.AdS(draggedRowPosition.offsetY);
        MutableState.A09(AnonymousClass002.A1N((draggedRowPosition.offsetY > (draggedRowPosition.restingTopFromGroupBottom - (draggedRowPosition.height / 2.0f)) ? 1 : (draggedRowPosition.offsetY == (draggedRowPosition.restingTopFromGroupBottom - (draggedRowPosition.height / 2.0f)) ? 0 : -1))), this.$draggedClearOfList$delegate);
        if (draggedRowPosition.targetIndex != this.$targetIndex$delegate.AGd()) {
            this.$targetIndex$delegate.AdX(draggedRowPosition.targetIndex);
        }
    }
}
