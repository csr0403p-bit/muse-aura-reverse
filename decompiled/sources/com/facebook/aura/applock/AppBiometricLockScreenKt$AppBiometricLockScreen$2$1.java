package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06787bB;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import X.InterfaceC06807bD;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AppBiometricLockScreenKt$AppBiometricLockScreen$2$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ G0U<Boolean, Unit> $launchPrompt;
    public final /* synthetic */ AppBiometricLockViewModel $viewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        CFK.A05(AppBiometricLockScreenKt.TAG, "resume: refreshing availability and launching prompt");
        this.$viewModel.refreshAvailability();
        AnonymousClass001.A1K(false, this.$launchPrompt);
        return new InterfaceC06807bD() { // from class: com.facebook.aura.applock.AppBiometricLockScreenKt$AppBiometricLockScreen$2$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBiometricLockScreenKt$AppBiometricLockScreen$2$1(AppBiometricLockViewModel appBiometricLockViewModel, G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$viewModel = appBiometricLockViewModel;
        this.$launchPrompt = g0u;
    }
}
