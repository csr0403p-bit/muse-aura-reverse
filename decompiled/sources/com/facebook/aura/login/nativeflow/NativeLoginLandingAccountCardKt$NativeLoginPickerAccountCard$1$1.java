package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $clickable;
    public final /* synthetic */ MutableState<Boolean> $sheetOpen$delegate;
    public final /* synthetic */ boolean $showTransparency;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$1$1(boolean z, boolean z2, MutableState<Boolean> mutableState) {
        super(1);
        this.$clickable = z;
        this.$showTransparency = z2;
        this.$sheetOpen$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$clickable || !this.$showTransparency) {
            MutableState.A09(false, this.$sheetOpen$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
