package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.C00r;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.DraggedRowPosition;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$3$1 extends AbstractC7559F3s implements G0V<Integer, DraggedRowPosition, Boolean> {
    public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ MutableState<Boolean> $draggedClearOfList$delegate;
    public final /* synthetic */ AHD<AuraTabItem> $items;
    public final /* synthetic */ MutableState<String> $pendingDraggedItemId$delegate;
    public final /* synthetic */ MutableState<AHD<String>> $preDropOrder$delegate;
    public final /* synthetic */ MutableState<Integer> $preDropTabCount$delegate;
    public final /* synthetic */ int $tabCount;
    public final /* synthetic */ C00r $targetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$3$1(AHD<? extends AuraTabItem> ahd, AuraSidePanelCollapseState auraSidePanelCollapseState, int i, MutableState<AHD<String>> mutableState, MutableState<Integer> mutableState2, MutableState<String> mutableState3, C00r c00r, C00q c00q, MutableState<Boolean> mutableState4) {
        super(2);
        this.$items = ahd;
        this.$collapseState = auraSidePanelCollapseState;
        this.$tabCount = i;
        this.$preDropOrder$delegate = mutableState;
        this.$preDropTabCount$delegate = mutableState2;
        this.$pendingDraggedItemId$delegate = mutableState3;
        this.$targetIndex$delegate = c00r;
        this.$dragOffsetY$delegate = c00q;
        this.$draggedClearOfList$delegate = mutableState4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, DraggedRowPosition draggedRowPosition) {
        return invoke(AnonymousClass001.A0F(num), draggedRowPosition);
    }

    public final Boolean invoke(int i, DraggedRowPosition draggedRowPosition) {
        boolean z = false;
        if (!AuraSidePanelTabsKt.isMainChat((AuraTabItem) AbstractC0878AGe.A0A(i, this.$items)) && !AuraSidePanelTabsKt.isCollapsedAt(this.$collapseState, i, this.$tabCount)) {
            this.$preDropOrder$delegate.Af8(null);
            this.$preDropTabCount$delegate.Af8(null);
            this.$pendingDraggedItemId$delegate.Af8(null);
            this.$targetIndex$delegate.AdX(i);
            this.$dragOffsetY$delegate.AdS(0.0f);
            MutableState.A09(false, this.$draggedClearOfList$delegate);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
