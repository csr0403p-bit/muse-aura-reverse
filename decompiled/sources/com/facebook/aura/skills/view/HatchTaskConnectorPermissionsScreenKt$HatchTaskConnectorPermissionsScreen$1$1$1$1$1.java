package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.skills.repo.TaskPermissionMethod;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ TaskPermissionMethod $method;
    public final /* synthetic */ TaskPermissionsUiState $state;
    public final /* synthetic */ String $taskName;
    public final /* synthetic */ TaskPermissionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1(TaskPermissionMethod taskPermissionMethod, TaskPermissionsUiState taskPermissionsUiState, String str, TaskPermissionsViewModel taskPermissionsViewModel, String str2) {
        super(3);
        this.$method = taskPermissionMethod;
        this.$state = taskPermissionsUiState;
        this.$connectorId = str;
        this.$viewModel = taskPermissionsViewModel;
        this.$taskName = str2;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        bfm.Ag8(338432633, this.$method.key);
        TaskPermissionMethod taskPermissionMethod = this.$method;
        TaskPermissionsUiState taskPermissionsUiState = this.$state;
        boolean z = !taskPermissionsUiState.isBusy();
        boolean zAreEqual = C7384Etj.areEqual(taskPermissionsUiState.updatingMethodKey, taskPermissionMethod.key);
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$taskName, AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1T(bfm, this.$method, bfm.A65(this.$connectorId))));
        String str = this.$connectorId;
        TaskPermissionMethod taskPermissionMethod2 = this.$method;
        TaskPermissionsViewModel taskPermissionsViewModel = this.$viewModel;
        String str2 = this.$taskName;
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1$1$1(str, taskPermissionMethod2, taskPermissionsViewModel, str2);
            bfm.Ai0(objAaT);
        }
        G0U g0u = (G0U) objAaT;
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$method, bfm.A65(this.$connectorId));
        String str3 = this.$connectorId;
        TaskPermissionMethod taskPermissionMethod3 = this.$method;
        Object objAaT2 = bfm.AaT();
        if (zA1T || objAaT2 == C78N.A00) {
            objAaT2 = new HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1$2$1(str3, taskPermissionMethod3);
            bfm.Ai0(objAaT2);
        }
        HatchTaskConnectorPermissionsScreenKt.TaskPermissionMethodRow(taskPermissionMethod, z, zAreEqual, g0u, (Function0) objAaT2, null, bfm, 0, 32);
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
