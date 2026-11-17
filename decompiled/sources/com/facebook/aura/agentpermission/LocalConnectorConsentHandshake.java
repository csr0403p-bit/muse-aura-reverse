package com.facebook.aura.agentpermission;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalConnectorConsentHandshake {
    public static final int $stable = 0;
    public static final LocalConnectorConsentHandshake INSTANCE = new LocalConnectorConsentHandshake();
    public static Function0<Unit> onAccept;

    public final Function0<Unit> getOnAccept() {
        return onAccept;
    }

    public final void setOnAccept(Function0<Unit> function0) {
        onAccept = function0;
    }
}
