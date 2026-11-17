package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.G0U;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmLeave$delegate;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $moveFailedMessage;
    public final /* synthetic */ ArtifactPlacementRequest $moveRequest;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onMoved;
    public final /* synthetic */ Function0<Unit> $onTogglePin;
    public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
    public final /* synthetic */ UnifiedArtifactsRepository $repository;
    public final /* synthetic */ String $sidebarFullMessage;
    public final /* synthetic */ View $viewRoot;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i == 0) {
            Function0<Unit> function0 = this.$onTogglePin;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                MutableState.A09(true, this.$confirmLeave$delegate);
                return;
            }
            return;
        }
        ArtifactPlacementRequest artifactPlacementRequest = this.$moveRequest;
        if (artifactPlacementRequest != null) {
            C3UX c3ux = this.$coroutineScope;
            UnifiedArtifactsRepository unifiedArtifactsRepository = this.$repository;
            PinnedItemsRepository pinnedItemsRepository = this.$pinnedItemsRepository;
            Function0<Unit> function02 = this.$onMoved;
            String str = this.$sidebarFullMessage;
            String str2 = this.$moveFailedMessage;
            View view = this.$viewRoot;
            SpacesSidebarAnalytics.INSTANCE.logMoveFromLibrary(artifactPlacementRequest);
            AnonymousClass001.A1J(new PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1$1$1(unifiedArtifactsRepository, artifactPlacementRequest, pinnedItemsRepository, function02, str, str2, view, null), c3ux);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceLibraryItemsKt$PeerSpaceItemContextMenu$4$1(Function0<Unit> function0, Function0<Unit> function02, ArtifactPlacementRequest artifactPlacementRequest, MutableState<Boolean> mutableState, C3UX c3ux, UnifiedArtifactsRepository unifiedArtifactsRepository, PinnedItemsRepository pinnedItemsRepository, Function0<Unit> function03, String str, String str2, View view) {
        super(1);
        this.$onDismiss = function0;
        this.$onTogglePin = function02;
        this.$moveRequest = artifactPlacementRequest;
        this.$confirmLeave$delegate = mutableState;
        this.$coroutineScope = c3ux;
        this.$repository = unifiedArtifactsRepository;
        this.$pinnedItemsRepository = pinnedItemsRepository;
        this.$onMoved = function03;
        this.$sidebarFullMessage = str;
        this.$moveFailedMessage = str2;
        this.$viewRoot = view;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
