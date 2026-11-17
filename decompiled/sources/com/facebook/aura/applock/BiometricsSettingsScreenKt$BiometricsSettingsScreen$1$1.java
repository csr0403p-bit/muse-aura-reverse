package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.C00r;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import android.content.Context;

/* loaded from: classes2.dex */
public final class BiometricsSettingsScreenKt$BiometricsSettingsScreen$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ C00r $biometricStatus$delegate;
    public final /* synthetic */ Context $context;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$biometricStatus$delegate.AdX(AppLockBiometricSettingsKt.getBiometricStatus(this.$context));
        return new InterfaceC06807bD() { // from class: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsSettingsScreenKt$BiometricsSettingsScreen$1$1(Context context, C00r c00r) {
        super(1);
        this.$context = context;
        this.$biometricStatus$delegate = c00r;
    }
}
