package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ boolean $fromSettings;
    public final /* synthetic */ String $key;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ String $verifyAddress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$1$1(EmailViewModel emailViewModel, String str, boolean z, String str2, Activity activity) {
        super(1);
        this.$model = emailViewModel;
        this.$key = str;
        this.$fromSettings = z;
        this.$verifyAddress = str2;
        this.$activity = activity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$model.beginOwnerConfirmation(this.$key, this.$fromSettings, this.$verifyAddress);
        final Activity activity = this.$activity;
        final EmailViewModel emailViewModel = this.$model;
        final String str = this.$key;
        return new C78g() { // from class: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity2 = activity;
                if (activity2 == null || !activity2.isChangingConfigurations()) {
                    emailViewModel.endOwnerConfirmation(str);
                } else {
                    emailViewModel.pauseOwnerConfirmation(str, true);
                }
            }
        };
    }
}
