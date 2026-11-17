package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$ActivePermissionsList$onMenuRequested$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $menuPermissionId$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        MutableState<String> mutableState = this.$menuPermissionId$delegate;
        if (str.equals(mutableState.getValue())) {
            str = null;
        }
        mutableState.Af8(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsScreenKt$ActivePermissionsList$onMenuRequested$1$1(MutableState<String> mutableState) {
        super(1);
        this.$menuPermissionId$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
