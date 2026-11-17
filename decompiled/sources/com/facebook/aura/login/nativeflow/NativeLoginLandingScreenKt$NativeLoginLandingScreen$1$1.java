package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class NativeLoginLandingScreenKt$NativeLoginLandingScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isRemoveProfilesSheetOpen$delegate;
    public final /* synthetic */ boolean $offersRemoveProfiles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginLandingScreenKt$NativeLoginLandingScreen$1$1(boolean z, MutableState<Boolean> mutableState) {
        super(1);
        this.$offersRemoveProfiles = z;
        this.$isRemoveProfilesSheetOpen$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$offersRemoveProfiles) {
            MutableState.A09(false, this.$isRemoveProfilesSheetOpen$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt$NativeLoginLandingScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
