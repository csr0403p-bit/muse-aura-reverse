package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.skills.viewmodel.SkillPermissionGroupUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionsUiState;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ SkillPermissionGroupUiModel $group;
    public final /* synthetic */ String $menuMethodKey;
    public final /* synthetic */ G0U<SkillPermissionMethodUiModel, Unit> $onAdditionalAccessRequested;
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ G0U<String, Unit> $onMenuRequested;
    public final /* synthetic */ G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> $onMethodModeSelected;
    public final /* synthetic */ SkillPermissionsUiState $uiState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<SkillPermissionMethodUiModel> ahd = this.$group.methods;
        SkillPermissionsUiState skillPermissionsUiState = this.$uiState;
        G0U<SkillPermissionMethodUiModel, Unit> g0u = this.$onAdditionalAccessRequested;
        String str = this.$menuMethodKey;
        G0U<String, Unit> g0u2 = this.$onMenuRequested;
        Function0<Unit> function0 = this.$onDismissMenu;
        G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> g0v = this.$onMethodModeSelected;
        for (SkillPermissionMethodUiModel skillPermissionMethodUiModel : ahd) {
            AnonymousClass006.A1E(hatchSectionScope, new ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1(skillPermissionMethodUiModel, g0u, C7384Etj.areEqual(skillPermissionsUiState.updatingMethodKey, skillPermissionMethodUiModel.key), skillPermissionsUiState, str, g0u2, function0, g0v), 1936301084);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1(SkillPermissionGroupUiModel skillPermissionGroupUiModel, SkillPermissionsUiState skillPermissionsUiState, G0U<? super SkillPermissionMethodUiModel, Unit> g0u, String str, G0U<? super String, Unit> g0u2, Function0<Unit> function0, G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v) {
        super(1);
        this.$group = skillPermissionGroupUiModel;
        this.$uiState = skillPermissionsUiState;
        this.$onAdditionalAccessRequested = g0u;
        this.$menuMethodKey = str;
        this.$onMenuRequested = g0u2;
        this.$onDismissMenu = function0;
        this.$onMethodModeSelected = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
