package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginEntryOffers$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ boolean $offersCredentials;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginEntryOffers$1$1(Activity activity, NativeLoginViewModel nativeLoginViewModel, boolean z) {
        super(1);
        this.$activity = activity;
        this.$viewModel = nativeLoginViewModel;
        this.$offersCredentials = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Activity activity = this.$activity;
        final Integer numValueOf = activity != null ? Integer.valueOf(this.$viewModel.onEntryScreenShown(activity, this.$offersCredentials)) : null;
        final NativeLoginViewModel nativeLoginViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginEntryOffers$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Integer num = numValueOf;
                if (num != null) {
                    nativeLoginViewModel.onEntryScreenHidden(num.intValue());
                }
            }
        };
    }
}
