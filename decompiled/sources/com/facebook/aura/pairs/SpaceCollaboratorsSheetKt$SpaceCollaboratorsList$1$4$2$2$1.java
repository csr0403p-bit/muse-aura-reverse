package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2$2$1 extends AbstractC7559F3s implements G0U<SpaceRole, Unit> {
    public final /* synthetic */ SpaceCollaborator $collaborator;
    public final /* synthetic */ SpaceCollaboratorsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SpaceRole spaceRole) {
        C7384Etj.A0Y(spaceRole, 0);
        this.$viewModel.setRole(this.$collaborator.principal, spaceRole);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2$2$1(SpaceCollaboratorsViewModel spaceCollaboratorsViewModel, SpaceCollaborator spaceCollaborator) {
        super(1);
        this.$viewModel = spaceCollaboratorsViewModel;
        this.$collaborator = spaceCollaborator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SpaceRole spaceRole) {
        invoke2(spaceRole);
        return Unit.INSTANCE;
    }
}
