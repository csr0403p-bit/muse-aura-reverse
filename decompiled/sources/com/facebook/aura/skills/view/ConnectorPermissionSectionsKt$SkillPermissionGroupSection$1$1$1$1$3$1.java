package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$3$1 extends AbstractC7559F3s implements G0U<ConnectorPermissionMode, Unit> {
    public final /* synthetic */ SkillPermissionMethodUiModel $method;
    public final /* synthetic */ G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> $onMethodModeSelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorPermissionMode connectorPermissionMode) {
        C7384Etj.A0Y(connectorPermissionMode, 0);
        this.$onMethodModeSelected.invoke(this.$method, connectorPermissionMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$3$1(G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v, SkillPermissionMethodUiModel skillPermissionMethodUiModel) {
        super(1);
        this.$onMethodModeSelected = g0v;
        this.$method = skillPermissionMethodUiModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionMode connectorPermissionMode) {
        invoke2(connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
