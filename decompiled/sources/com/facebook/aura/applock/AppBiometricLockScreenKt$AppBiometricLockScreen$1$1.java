package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.CFK;
import X.G0U;

/* loaded from: classes2.dex */
public final class AppBiometricLockScreenKt$AppBiometricLockScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final AppBiometricLockScreenKt$AppBiometricLockScreen$1$1 INSTANCE = new AppBiometricLockScreenKt$AppBiometricLockScreen$1$1();

    public AppBiometricLockScreenKt$AppBiometricLockScreen$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        CFK.A05(AppBiometricLockScreenKt.TAG, "AppBiometricLockScreen entered composition");
        return new C78g() { // from class: com.facebook.aura.applock.AppBiometricLockScreenKt$AppBiometricLockScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                CFK.A05(AppBiometricLockScreenKt.TAG, "AppBiometricLockScreen left composition");
            }
        };
    }
}
