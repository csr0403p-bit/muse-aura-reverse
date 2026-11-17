package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics;

/* loaded from: classes.dex */
public final class ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1 INSTANCE = new ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1();

    public ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpShown();
        return new ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1$invoke$$inlined$onDispose$1();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpShown();
        return new ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1$invoke$$inlined$onDispose$1();
    }
}
