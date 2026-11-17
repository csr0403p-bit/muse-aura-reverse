package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import android.app.Activity;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$2$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ String $key;
    public final /* synthetic */ EmailViewModel $model;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        final EmailViewModel emailViewModel = this.$model;
        final String str = this.$key;
        final Activity activity = this.$activity;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$2$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                EmailViewModel emailViewModel2 = emailViewModel;
                String str2 = str;
                Activity activity2 = activity;
                boolean z = false;
                if (activity2 != null && activity2.isChangingConfigurations()) {
                    z = true;
                }
                emailViewModel2.pauseOwnerConfirmation(str2, z);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationLifecycle$2$1(EmailViewModel emailViewModel, String str, Activity activity) {
        super(1);
        this.$model = emailViewModel;
        this.$key = str;
        this.$activity = activity;
    }
}
