package com.facebook.aura.subscription.view;

import X.C78g;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.toast.api.ToastApi;

/* loaded from: classes3.dex */
public final class SubscriptionSheetHelpersKt$rememberDismissToast$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ MutableState $pending$inlined;

    public SubscriptionSheetHelpersKt$rememberDismissToast$1$1$invoke$$inlined$onDispose$1(MutableState mutableState) {
        this.$pending$inlined = mutableState;
    }

    @Override // X.C78g
    public void dispose() {
        String strA05 = MutableState.A05(this.$pending$inlined);
        if (strA05 != null) {
            ToastApi.INSTANCE.showToast(strA05);
        }
    }
}
