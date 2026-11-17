package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$activePermissionSection$4$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<ActivePermission, Unit> $onRevoke;
    public final /* synthetic */ ActivePermission $permission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivePermissionsScreenKt$activePermissionSection$4$1$2$1(G0U<? super ActivePermission, Unit> g0u, ActivePermission activePermission) {
        super(0);
        this.$onRevoke = g0u;
        this.$permission = activePermission;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRevoke.invoke(this.$permission);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
