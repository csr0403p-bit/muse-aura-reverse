package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SpaceCollaborator $collaborator;
    public final /* synthetic */ SpaceCollaboratorsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2$3$1(SpaceCollaboratorsViewModel spaceCollaboratorsViewModel, SpaceCollaborator spaceCollaborator) {
        super(0);
        this.$viewModel = spaceCollaboratorsViewModel;
        this.$collaborator = spaceCollaborator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.remove(this.$collaborator.principal);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
