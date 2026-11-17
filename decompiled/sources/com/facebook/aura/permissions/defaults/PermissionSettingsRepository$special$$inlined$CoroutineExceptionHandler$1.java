package com.facebook.aura.permissions.defaults;

import X.C78T;
import X.C78p;
import X.CFK;
import X.HqU;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class PermissionSettingsRepository$special$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        CFK.A0K(PermissionSettingsRepository.TAG, th, "Permission settings state failed");
    }

    public PermissionSettingsRepository$special$$inlined$CoroutineExceptionHandler$1(C78p c78p) {
        super(c78p);
    }
}
