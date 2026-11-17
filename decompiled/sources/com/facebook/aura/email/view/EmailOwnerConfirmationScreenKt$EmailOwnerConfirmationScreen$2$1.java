package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$2$1 extends AbstractC7559F3s implements G0U<EmailViewModel, Unit> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $verifyAddress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EmailViewModel emailViewModel) {
        C7384Etj.A0Y(emailViewModel, 0);
        if (this.$verifyAddress != null || emailViewModel.backFromOwnerConfirmation(this.$key)) {
            emailViewModel.leaveOwnerStep(this.$key);
            this.$navigator.back();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationScreen$2$1(String str, String str2, AuraNavigator auraNavigator) {
        super(1);
        this.$verifyAddress = str;
        this.$key = str2;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel) {
        invoke2(emailViewModel);
        return Unit.INSTANCE;
    }
}
