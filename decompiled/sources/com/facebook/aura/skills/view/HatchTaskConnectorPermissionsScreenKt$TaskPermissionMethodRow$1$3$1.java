package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchTaskConnectorPermissionsScreenKt$TaskPermissionMethodRow$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTaskConnectorPermissionsScreenKt$TaskPermissionMethodRow$1$3$1(G0U<? super ConnectorPermissionMode, Unit> g0u) {
        super(0);
        this.$onModeSelected = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onModeSelected.invoke(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
