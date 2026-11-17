package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.repo.TaskConnectorPermissions;
import com.facebook.aura.skills.repo.TaskPermissionMethod;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ TaskConnectorPermissions $connector;
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ TaskPermissionsUiState $state;
    public final /* synthetic */ String $taskName;
    public final /* synthetic */ TaskPermissionsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<TaskPermissionMethod> ahd = this.$connector.methods;
        TaskPermissionsUiState taskPermissionsUiState = this.$state;
        String str = this.$connectorId;
        TaskPermissionsViewModel taskPermissionsViewModel = this.$viewModel;
        String str2 = this.$taskName;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1((TaskPermissionMethod) it.next(), taskPermissionsUiState, str, taskPermissionsViewModel, str2), -57748328);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1(TaskConnectorPermissions taskConnectorPermissions, TaskPermissionsUiState taskPermissionsUiState, String str, TaskPermissionsViewModel taskPermissionsViewModel, String str2) {
        super(1);
        this.$connector = taskConnectorPermissions;
        this.$state = taskPermissionsUiState;
        this.$connectorId = str;
        this.$viewModel = taskPermissionsViewModel;
        this.$taskName = str2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
