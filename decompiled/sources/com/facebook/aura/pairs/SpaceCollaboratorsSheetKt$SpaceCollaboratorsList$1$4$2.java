package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.pairs.SpaceCollaboratorsUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ SpaceCollaborator $collaborator;
    public final /* synthetic */ String $name;
    public final /* synthetic */ SpaceCollaboratorsUiState.Loaded $state;
    public final /* synthetic */ SpaceCollaboratorsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2(String str, SpaceCollaborator spaceCollaborator, SpaceCollaboratorsUiState.Loaded loaded, SpaceCollaboratorsViewModel spaceCollaboratorsViewModel) {
        super(2);
        this.$name = str;
        this.$collaborator = spaceCollaborator;
        this.$state = loaded;
        this.$viewModel = spaceCollaboratorsViewModel;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        String str = this.$name;
        SpaceCollaborator spaceCollaborator = this.$collaborator;
        SpaceRole spaceRole = spaceCollaborator.role;
        if (spaceCollaborator.isInvited) {
            spaceRole = null;
        }
        boolean z = !this.$state.busy.contains(spaceCollaborator.principal);
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$collaborator, bfm.A67(this.$viewModel));
        SpaceCollaboratorsViewModel spaceCollaboratorsViewModel = this.$viewModel;
        SpaceCollaborator spaceCollaborator2 = this.$collaborator;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2$2$1(spaceCollaboratorsViewModel, spaceCollaborator2);
            bfm.Ai0(objAaT);
        }
        G0U g0u = (G0U) objAaT;
        boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$collaborator, bfm.A67(this.$viewModel));
        SpaceCollaboratorsViewModel spaceCollaboratorsViewModel2 = this.$viewModel;
        SpaceCollaborator spaceCollaborator3 = this.$collaborator;
        Object objAaT2 = bfm.AaT();
        if (zA1T2 || objAaT2 == C78N.A00) {
            objAaT2 = new SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$4$2$3$1(spaceCollaboratorsViewModel2, spaceCollaborator3);
            bfm.Ai0(objAaT2);
        }
        SpaceCollaboratorsSheetKt.SpaceCollaboratorRoleMenu(str, spaceRole, z, g0u, (Function0) objAaT2, null, bfm, 0, 32);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
