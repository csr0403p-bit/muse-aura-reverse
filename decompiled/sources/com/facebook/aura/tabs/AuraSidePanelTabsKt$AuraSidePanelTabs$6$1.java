package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.C00r;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$6$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ MutableState<Boolean> $draggedClearOfList$delegate;
    public final /* synthetic */ MutableState<String> $pendingDraggedItemId$delegate;
    public final /* synthetic */ MutableState<AHD<String>> $preDropOrder$delegate;
    public final /* synthetic */ MutableState<Integer> $preDropTabCount$delegate;
    public final /* synthetic */ C00r $targetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$6$1(C00q c00q, C00r c00r, MutableState<Boolean> mutableState, MutableState<AHD<String>> mutableState2, MutableState<Integer> mutableState3, MutableState<String> mutableState4) {
        super(1);
        this.$dragOffsetY$delegate = c00q;
        this.$targetIndex$delegate = c00r;
        this.$draggedClearOfList$delegate = mutableState;
        this.$preDropOrder$delegate = mutableState2;
        this.$preDropTabCount$delegate = mutableState3;
        this.$pendingDraggedItemId$delegate = mutableState4;
    }

    public final void invoke(int i) {
        this.$dragOffsetY$delegate.AdS(0.0f);
        this.$targetIndex$delegate.AdX(-1);
        MutableState.A09(false, this.$draggedClearOfList$delegate);
        this.$preDropOrder$delegate.Af8(null);
        this.$preDropTabCount$delegate.Af8(null);
        this.$pendingDraggedItemId$delegate.Af8(null);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
