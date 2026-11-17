package com.facebook.aura.agentpermission;

import X.C78g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ Function0 $ownedAccept$inlined;

    public LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1$invoke$$inlined$onDispose$1(Function0 function0) {
        this.$ownedAccept$inlined = function0;
    }

    @Override // X.C78g
    public void dispose() {
        if (LocalConnectorConsentHandshake.onAccept == this.$ownedAccept$inlined) {
            LocalConnectorConsentHandshake.onAccept = null;
        }
    }
}
