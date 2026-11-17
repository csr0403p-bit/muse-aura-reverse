package com.facebook.aura.tabs;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.C00r;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$5$1 extends AbstractC7559F3s implements G0U<Integer, Boolean> {
    public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ MutableState<Boolean> $draggedClearOfList$delegate;
    public final /* synthetic */ AHD<String> $itemIds;
    public final /* synthetic */ AHD<AuraTabItem> $items;
    public final /* synthetic */ AuraTabLayout $layout;
    public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
    public final /* synthetic */ MutableState<String> $pendingDraggedItemId$delegate;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ MutableState<AHD<String>> $preDropOrder$delegate;
    public final /* synthetic */ MutableState<Integer> $preDropTabCount$delegate;
    public final /* synthetic */ int $tabCount;
    public final /* synthetic */ C00r $targetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$5$1(AHD<? extends AuraTabItem> ahd, AuraTabLayout auraTabLayout, int i, MutableState<Boolean> mutableState, C00r c00r, AHD<String> ahd2, PinnedItemsRepository pinnedItemsRepository, AuraTabRootNavKey auraTabRootNavKey, Function0<Unit> function0, MutableState<AHD<String>> mutableState2, MutableState<Integer> mutableState3, MutableState<String> mutableState4, C00q c00q) {
        super(1);
        this.$items = ahd;
        this.$layout = auraTabLayout;
        this.$tabCount = i;
        this.$draggedClearOfList$delegate = mutableState;
        this.$targetIndex$delegate = c00r;
        this.$itemIds = ahd2;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$currentTabRoot = auraTabRootNavKey;
        this.$onSelectedTabRemoved = function0;
        this.$preDropOrder$delegate = mutableState2;
        this.$preDropTabCount$delegate = mutableState3;
        this.$pendingDraggedItemId$delegate = mutableState4;
        this.$dragOffsetY$delegate = c00q;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[PHI: r2
  0x007b: PHI (r2v1 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v5 boolean) binds: [B:25:0x005e, B:32:0x0086, B:28:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(int r14) {
        /*
            r13 = this;
            X.AHD<com.facebook.aura.tabs.AuraTabItem> r0 = r13.$items
            java.lang.Object r10 = X.AbstractC0878AGe.A0A(r14, r0)
            com.facebook.aura.tabs.AuraTabItem r10 = (com.facebook.aura.tabs.AuraTabItem) r10
            com.facebook.aura.tabs.AuraTabLayout r1 = r13.$layout
            boolean r0 = r1.sortingEnabled
            r4 = 1
            r2 = 0
            if (r0 == 0) goto Laf
            boolean r0 = r1.spacesEnabled
            if (r0 == 0) goto Laf
            if (r10 == 0) goto Laf
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r13.$draggedClearOfList$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == 0) goto Laf
            X.00r r0 = r13.$targetIndex$delegate
            int r1 = r0.AGd()
            int r0 = r13.$tabCount
            if (r1 >= r0) goto Laf
            if (r4 > r14) goto Laf
            if (r14 >= r0) goto Laf
            r3 = 1
            int r0 = r0 - r4
            if (r0 >= r2) goto L31
            r0 = 0
        L31:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L35:
            X.AHD<com.facebook.aura.tabs.AuraTabItem> r1 = r13.$items
            X.00r r0 = r13.$targetIndex$delegate
            int r0 = r0.AGd()
            java.lang.Object r11 = X.AbstractC0878AGe.A0A(r0, r1)
            com.facebook.aura.tabs.AuraTabItem r11 = (com.facebook.aura.tabs.AuraTabItem) r11
            if (r10 == 0) goto Lac
            if (r3 == 0) goto La3
            X.AHD<com.facebook.aura.tabs.AuraTabItem> r1 = r13.$items
            if (r12 == 0) goto La0
            int r0 = r12.intValue()
        L4f:
            java.util.List r9 = com.facebook.aura.tabs.AuraSidePanelTabsKt.movedToFirstSpaceSlot(r1, r10, r0)
        L53:
            X.00r r1 = r13.$targetIndex$delegate
            r0 = -1
            r1.AdX(r0)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r13.$draggedClearOfList$delegate
            androidx.compose.runtime.MutableState.A09(r2, r0)
            if (r10 == 0) goto L7b
            if (r3 == 0) goto L86
            X.AHD<java.lang.String> r0 = r13.$itemIds
            com.facebook.aura.tabs.AuraTabLayout r1 = r13.$layout
            int r2 = r13.$tabCount
            com.facebook.aura.spaces.repo.PinnedItemsRepository r3 = r13.$pinnedItemsRepository
            com.facebook.aura.navigation.AuraTabRootNavKey r4 = r13.$currentTabRoot
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r13.$onSelectedTabRemoved
            androidx.compose.runtime.MutableState<X.AHD<java.lang.String>> r6 = r13.$preDropOrder$delegate
            androidx.compose.runtime.MutableState<java.lang.Integer> r7 = r13.$preDropTabCount$delegate
            androidx.compose.runtime.MutableState<java.lang.String> r8 = r13.$pendingDraggedItemId$delegate
            r11 = 0
            boolean r2 = com.facebook.aura.tabs.AuraSidePanelTabsKt.AuraSidePanelTabs$persistReorderedItems(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L79:
            if (r2 != 0) goto L81
        L7b:
            X.00q r1 = r13.$dragOffsetY$delegate
            r0 = 0
            r1.AdS(r0)
        L81:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L86:
            if (r11 == 0) goto L7b
            X.AHD<java.lang.String> r0 = r13.$itemIds
            com.facebook.aura.tabs.AuraTabLayout r1 = r13.$layout
            int r2 = r13.$tabCount
            com.facebook.aura.spaces.repo.PinnedItemsRepository r3 = r13.$pinnedItemsRepository
            com.facebook.aura.navigation.AuraTabRootNavKey r4 = r13.$currentTabRoot
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r13.$onSelectedTabRemoved
            androidx.compose.runtime.MutableState<X.AHD<java.lang.String>> r6 = r13.$preDropOrder$delegate
            androidx.compose.runtime.MutableState<java.lang.Integer> r7 = r13.$preDropTabCount$delegate
            androidx.compose.runtime.MutableState<java.lang.String> r8 = r13.$pendingDraggedItemId$delegate
            r12 = 0
            boolean r2 = com.facebook.aura.tabs.AuraSidePanelTabsKt.AuraSidePanelTabs$persistReorderedItems(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L79
        La0:
            int r0 = r13.$tabCount
            goto L4f
        La3:
            if (r11 == 0) goto Lac
            X.AHD<com.facebook.aura.tabs.AuraTabItem> r0 = r13.$items
            java.util.List r9 = com.facebook.aura.ui.ReorderableColumnKt.movedIntoSlotOf(r0, r10, r11)
            goto L53
        Lac:
            X.AHD<com.facebook.aura.tabs.AuraTabItem> r9 = r13.$items
            goto L53
        Laf:
            r3 = 0
            r12 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$5$1.invoke(int):java.lang.Boolean");
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
