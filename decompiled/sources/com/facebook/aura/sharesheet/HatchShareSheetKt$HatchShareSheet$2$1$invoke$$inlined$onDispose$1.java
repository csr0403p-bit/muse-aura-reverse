package com.facebook.aura.sharesheet;

import X.C78g;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$2$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HatchShareSheetViewModel $viewModel$inlined;

    public HatchShareSheetKt$HatchShareSheet$2$1$invoke$$inlined$onDispose$1(HatchShareSheetViewModel hatchShareSheetViewModel) {
        this.$viewModel$inlined = hatchShareSheetViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$viewModel$inlined.sendPendingRecipientsImmediately();
    }
}
