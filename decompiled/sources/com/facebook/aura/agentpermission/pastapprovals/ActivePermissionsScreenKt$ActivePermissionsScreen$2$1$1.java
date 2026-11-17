package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$ActivePermissionsScreen$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ActivePermissionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsScreenKt$ActivePermissionsScreen$2$1$1(ActivePermissionsViewModel activePermissionsViewModel) {
        super(0);
        this.$viewModel = activePermissionsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.loadPermissions(true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
