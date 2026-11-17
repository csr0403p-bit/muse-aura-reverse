package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$13$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactPlacementRequest $moveToLibraryRequest;
    public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ UnifiedArtifactsRepository $unifiedArtifactsRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$13$2$1(ArtifactPlacementRequest artifactPlacementRequest, Function0<Unit> function0, UnifiedArtifactsRepository unifiedArtifactsRepository, PinnedItemsRepository pinnedItemsRepository) {
        super(0);
        this.$moveToLibraryRequest = artifactPlacementRequest;
        this.$onSelectedTabRemoved = function0;
        this.$unifiedArtifactsRepository = unifiedArtifactsRepository;
        this.$pinnedItemsRepository = pinnedItemsRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraSidePanelTabsKt.AuraSidePanelTabs$moveSpaceToLibrary(this.$onSelectedTabRemoved, this.$unifiedArtifactsRepository, this.$pinnedItemsRepository, this.$moveToLibraryRequest);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
