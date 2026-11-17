package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$5$1 extends AbstractC7559F3s implements G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> {
    public final /* synthetic */ SkillPermissionsViewModel $skillPermissionsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$5$1(SkillPermissionsViewModel skillPermissionsViewModel) {
        super(2);
        this.$skillPermissionsViewModel = skillPermissionsViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(SkillPermissionMethodUiModel skillPermissionMethodUiModel, ConnectorPermissionMode connectorPermissionMode) {
        invoke2(skillPermissionMethodUiModel, connectorPermissionMode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SkillPermissionMethodUiModel skillPermissionMethodUiModel, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass003.A0u(skillPermissionMethodUiModel, connectorPermissionMode);
        this.$skillPermissionsViewModel.setMethodMode(skillPermissionMethodUiModel, connectorPermissionMode);
    }
}
