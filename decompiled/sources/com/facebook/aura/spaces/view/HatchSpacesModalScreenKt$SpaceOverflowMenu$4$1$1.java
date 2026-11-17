package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C3UX;
import android.view.View;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ UnifiedArtifactsRepository $artifactsRepository;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $moveFailedMessage;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ ArtifactPlacementRequest $request;
    public final /* synthetic */ String $sidebarFullMessage;
    public final /* synthetic */ View $viewRoot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$4$1$1(ArtifactPlacementRequest artifactPlacementRequest, Function0<Unit> function0, UnifiedArtifactsRepository unifiedArtifactsRepository, C3UX c3ux, PinnedItemsRepository pinnedItemsRepository, View view, String str, String str2) {
        super(0);
        this.$request = artifactPlacementRequest;
        this.$onDeleted = function0;
        this.$artifactsRepository = unifiedArtifactsRepository;
        this.$coroutineScope = c3ux;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$viewRoot = view;
        this.$sidebarFullMessage = str;
        this.$moveFailedMessage = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchSpacesModalScreenKt.SpaceOverflowMenu_WHI4liM$moveSpace(this.$onDeleted, this.$artifactsRepository, this.$coroutineScope, this.$pinnedItemsRepository, this.$viewRoot, this.$sidebarFullMessage, this.$moveFailedMessage, this.$request);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
