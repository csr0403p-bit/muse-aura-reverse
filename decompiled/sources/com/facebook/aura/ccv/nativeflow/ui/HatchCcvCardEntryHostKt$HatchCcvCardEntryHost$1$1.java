package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.analytics.hatch.HatchComponent;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ HatchCcvViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$1$1(Activity activity, HatchCcvViewModel hatchCcvViewModel) {
        super(1);
        this.$activity = activity;
        this.$viewModel = hatchCcvViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchCcvCardEntryHostKt.logCcvImpression(HatchComponent.CCV_FORM, null);
        final Activity activity = this.$activity;
        final HatchCcvViewModel hatchCcvViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchCcvCardEntryHost$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity2 = activity;
                if (activity2 == null || !activity2.isChangingConfigurations()) {
                    hatchCcvViewModel.onFormHidden();
                }
            }
        };
    }
}
