package com.facebook.aura.skills.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$4$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ MutableState<Integer> $localConnectorRefreshNonce$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$4$1$2$1(String str, AbstractC3358CGz abstractC3358CGz, MutableState<Integer> mutableState) {
        super(0);
        this.$connectorId = str;
        this.$userSession = abstractC3358CGz;
        this.$localConnectorRefreshNonce$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectorPermissionsScreenKt.logPermissionsReset(this.$connectorId);
        LocalDeviceConnectorKt.resetLocalDeviceConnectorModes(this.$userSession, this.$connectorId);
        MutableState.A07(MutableState.A02((MutableState) this.$localConnectorRefreshNonce$delegate) + 1, this.$localConnectorRefreshNonce$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
