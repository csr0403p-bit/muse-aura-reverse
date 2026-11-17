package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$7$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmMove$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ArtifactPlacementRequest $request;
    public final /* synthetic */ PeerSpaceMembersViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$7$1$1(PeerSpaceMembersViewModel peerSpaceMembersViewModel, ArtifactPlacementRequest artifactPlacementRequest, AuraNavigator auraNavigator, MutableState<Boolean> mutableState) {
        super(0);
        this.$viewModel = peerSpaceMembersViewModel;
        this.$request = artifactPlacementRequest;
        this.$navigator = auraNavigator;
        this.$confirmMove$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$confirmMove$delegate);
        this.$viewModel.move(this.$request);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
