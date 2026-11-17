package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.perf.HatchConnectorQplLogger;

/* loaded from: classes.dex */
public final class DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1 INSTANCE = new DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1();

    public DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        HatchConnectorQplLogger.INSTANCE.markDisconnectConfirmationShown();
        return new DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1$invoke$$inlined$onDispose$1();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        HatchConnectorQplLogger.INSTANCE.markDisconnectConfirmationShown();
        return new DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1$invoke$$inlined$onDispose$1();
    }
}
