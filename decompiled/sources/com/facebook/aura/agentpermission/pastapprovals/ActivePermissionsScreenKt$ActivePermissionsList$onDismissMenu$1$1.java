package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$ActivePermissionsList$onDismissMenu$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $menuPermissionId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsScreenKt$ActivePermissionsList$onDismissMenu$1$1(MutableState<String> mutableState) {
        super(0);
        this.$menuPermissionId$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$menuPermissionId$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
