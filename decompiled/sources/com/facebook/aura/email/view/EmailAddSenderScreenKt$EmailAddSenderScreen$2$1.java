package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailAddSenderScreenKt$EmailAddSenderScreen$2$1 extends AbstractC7559F3s implements G0U<EmailViewModel, Unit> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EmailViewModel emailViewModel) {
        C7384Etj.A0Y(emailViewModel, 0);
        if (emailViewModel.backFromOwnerConfirmation(this.$key)) {
            this.$navigator.back();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAddSenderScreenKt$EmailAddSenderScreen$2$1(String str, AuraNavigator auraNavigator) {
        super(1);
        this.$key = str;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel) {
        invoke2(emailViewModel);
        return Unit.INSTANCE;
    }
}
