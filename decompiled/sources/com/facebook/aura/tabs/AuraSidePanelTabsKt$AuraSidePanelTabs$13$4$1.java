package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.ui.ReorderableColumnKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$13$4$1 extends AbstractC7559F3s implements G0U<AuraTabItem, Unit> {
    public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
    public final /* synthetic */ AuraTabItem $item;
    public final /* synthetic */ AHD<String> $itemIds;
    public final /* synthetic */ AHD<AuraTabItem> $items;
    public final /* synthetic */ AuraTabLayout $layout;
    public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
    public final /* synthetic */ MutableState<String> $pendingDraggedItemId$delegate;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ MutableState<AHD<String>> $preDropOrder$delegate;
    public final /* synthetic */ MutableState<Integer> $preDropTabCount$delegate;
    public final /* synthetic */ int $tabCount;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraTabItem auraTabItem) {
        C7384Etj.A0Y(auraTabItem, 0);
        AuraSidePanelTabsKt.AuraSidePanelTabs$persistReorderedItems(this.$itemIds, this.$layout, this.$tabCount, this.$pinnedItemsRepository, this.$currentTabRoot, this.$onSelectedTabRemoved, this.$preDropOrder$delegate, this.$preDropTabCount$delegate, this.$pendingDraggedItemId$delegate, ReorderableColumnKt.movedIntoSlotOf(this.$items, this.$item, auraTabItem), this.$item, auraTabItem, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$13$4$1(AHD<? extends AuraTabItem> ahd, AuraTabItem auraTabItem, AHD<String> ahd2, AuraTabLayout auraTabLayout, int i, PinnedItemsRepository pinnedItemsRepository, AuraTabRootNavKey auraTabRootNavKey, Function0<Unit> function0, MutableState<AHD<String>> mutableState, MutableState<Integer> mutableState2, MutableState<String> mutableState3) {
        super(1);
        this.$items = ahd;
        this.$item = auraTabItem;
        this.$itemIds = ahd2;
        this.$layout = auraTabLayout;
        this.$tabCount = i;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$currentTabRoot = auraTabRootNavKey;
        this.$onSelectedTabRemoved = function0;
        this.$preDropOrder$delegate = mutableState;
        this.$preDropTabCount$delegate = mutableState2;
        this.$pendingDraggedItemId$delegate = mutableState3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraTabItem auraTabItem) {
        invoke2(auraTabItem);
        return Unit.INSTANCE;
    }
}
