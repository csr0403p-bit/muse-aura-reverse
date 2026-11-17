package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.status.viewmodel.DesktopViewModel;

/* loaded from: classes2.dex */
public final class DesktopScreenKt$DesktopScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ DesktopViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesktopScreenKt$DesktopScreen$1$1(DesktopViewModel desktopViewModel) {
        super(1);
        this.$viewModel = desktopViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.observeUpdates();
        final DesktopViewModel desktopViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                desktopViewModel.stopObserving();
            }
        };
    }
}
