package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectorPermissionGroup $group;
    public final /* synthetic */ ConnectorPermissionMethod $method;
    public final /* synthetic */ G0V<String, String, Unit> $onMenuRequested;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1$1$1(G0V<? super String, ? super String, Unit> g0v, ConnectorPermissionGroup connectorPermissionGroup, ConnectorPermissionMethod connectorPermissionMethod) {
        super(0);
        this.$onMenuRequested = g0v;
        this.$group = connectorPermissionGroup;
        this.$method = connectorPermissionMethod;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onMenuRequested.invoke(this.$group.key, this.$method.key);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
