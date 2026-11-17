package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ HatchAgeLinkingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$1$1(Activity activity, HatchAgeLinkingViewModel hatchAgeLinkingViewModel) {
        super(1);
        this.$activity = activity;
        this.$viewModel = hatchAgeLinkingViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Activity activity = this.$activity;
        final HatchAgeLinkingViewModel hatchAgeLinkingViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity2 = activity;
                if (activity2 == null || !activity2.isChangingConfigurations()) {
                    hatchAgeLinkingViewModel.reset();
                }
            }
        };
    }
}
