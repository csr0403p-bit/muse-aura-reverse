package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ boolean $isLoading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$1$1(boolean z, C0Hi c0Hi) {
        super(1);
        this.$isLoading = z;
        this.$focusManager = c0Hi;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isLoading) {
            this.$focusManager.A6G(false);
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
