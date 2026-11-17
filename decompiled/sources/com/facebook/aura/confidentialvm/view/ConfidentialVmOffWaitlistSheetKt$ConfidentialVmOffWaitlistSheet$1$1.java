package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSheetLogger;

/* loaded from: classes.dex */
public final class ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$1$1 INSTANCE = new ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$1$1();

    public ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        ConfidentialVmSheetLogger.INSTANCE.logOffWaitlistShown();
        return new ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$1$1$invoke$$inlined$onDispose$1();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        ConfidentialVmSheetLogger.INSTANCE.logOffWaitlistShown();
        return new ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$1$1$invoke$$inlined$onDispose$1();
    }
}
