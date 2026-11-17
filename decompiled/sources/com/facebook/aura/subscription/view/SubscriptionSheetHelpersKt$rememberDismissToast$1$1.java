package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes3.dex */
public final class SubscriptionSheetHelpersKt$rememberDismissToast$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<String> $pending;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionSheetHelpersKt$rememberDismissToast$1$1(MutableState<String> mutableState) {
        super(1);
        this.$pending = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new SubscriptionSheetHelpersKt$rememberDismissToast$1$1$invoke$$inlined$onDispose$1(this.$pending);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new SubscriptionSheetHelpersKt$rememberDismissToast$1$1$invoke$$inlined$onDispose$1(this.$pending);
    }
}
