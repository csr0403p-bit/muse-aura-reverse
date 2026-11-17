package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.GBM;
import X.InterfaceC10560Hsz;
import com.facebook.aura.analytics.hatch.HatchEventType;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$notificationPermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ InterfaceC10560Hsz<Unit> $notificationPermissionDeferred;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$notificationPermissionLauncher$1$1(InterfaceC10560Hsz<Unit> interfaceC10560Hsz) {
        super(1);
        this.$notificationPermissionDeferred = interfaceC10560Hsz;
    }

    public final void invoke(boolean z) {
        HatchConversationScreenKt.logNotificationPermission(z ? HatchEventType.PERMISSION_ACCEPTED : HatchEventType.PERMISSION_DENIED);
        ((GBM) this.$notificationPermissionDeferred).A0R(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
