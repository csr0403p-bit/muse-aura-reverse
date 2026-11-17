package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.email.model.EmailSendPermission;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSettingsComponentsKt$EmailPermissionRow$1$5$1 extends AbstractC7559F3s implements G0U<ConnectorPermissionMode, Unit> {
    public final /* synthetic */ G0U<EmailSendPermission, Unit> $onChange;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorPermissionMode connectorPermissionMode) {
        C7384Etj.A0Y(connectorPermissionMode, 0);
        EmailSendPermission emailSendPermissionFromWire = EmailSendPermission.Companion.fromWire(connectorPermissionMode.getWireValue());
        if (emailSendPermissionFromWire != null) {
            this.$onChange.invoke(emailSendPermissionFromWire);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailSettingsComponentsKt$EmailPermissionRow$1$5$1(G0U<? super EmailSendPermission, Unit> g0u) {
        super(1);
        this.$onChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionMode connectorPermissionMode) {
        invoke2(connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
