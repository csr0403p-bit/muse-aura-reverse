package com.facebook.aura.commands.core;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodePermissionActivity$onCreate$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $rationaleFirst;
    public final /* synthetic */ String[] $ungranted;
    public final /* synthetic */ NodePermissionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodePermissionActivity$onCreate$4$1$1(NodePermissionActivity nodePermissionActivity, boolean z, String[] strArr) {
        super(0);
        this.this$0 = nodePermissionActivity;
        this.$rationaleFirst = z;
        this.$ungranted = strArr;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NodePermissionActivity nodePermissionActivity = this.this$0;
        int i = NodePermissionActivity.$stable;
        MutableState.A09(false, nodePermissionActivity.showConsent);
        boolean z = this.$rationaleFirst;
        NodePermissionActivity nodePermissionActivity2 = this.this$0;
        if (z) {
            MutableState.A09(true, nodePermissionActivity2.showSettingsDialog);
        } else {
            nodePermissionActivity2.permissionLauncher.A01(null, this.$ungranted);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
