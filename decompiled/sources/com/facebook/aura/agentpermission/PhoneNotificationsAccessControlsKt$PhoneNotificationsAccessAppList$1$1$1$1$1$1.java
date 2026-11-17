package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C4Ax;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ C4Ax $app;
    public final /* synthetic */ G0V<String, Boolean, Unit> $onToggle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1$1$1$1$1(G0V<? super String, ? super Boolean, Unit> g0v, C4Ax c4Ax) {
        super(1);
        this.$onToggle = g0v;
        this.$app = c4Ax;
    }

    public final void invoke(boolean z) {
        this.$onToggle.invoke(this.$app.A01, Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
