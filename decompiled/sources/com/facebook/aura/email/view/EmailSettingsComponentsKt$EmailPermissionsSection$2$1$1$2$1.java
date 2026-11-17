package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.email.model.EmailPermissionMethod;
import com.facebook.aura.email.model.EmailSendPermission;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailSettingsComponentsKt$EmailPermissionsSection$2$1$1$2$1 extends AbstractC7559F3s implements G0U<EmailSendPermission, Unit> {
    public final /* synthetic */ EmailPermissionMethod $method;
    public final /* synthetic */ EmailViewModel $model;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EmailSendPermission emailSendPermission) {
        C7384Etj.A0Y(emailSendPermission, 0);
        this.$model.setPermissionMode(this.$method.key, emailSendPermission);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsComponentsKt$EmailPermissionsSection$2$1$1$2$1(EmailViewModel emailViewModel, EmailPermissionMethod emailPermissionMethod) {
        super(1);
        this.$model = emailViewModel;
        this.$method = emailPermissionMethod;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(EmailSendPermission emailSendPermission) {
        invoke2(emailSendPermission);
        return Unit.INSTANCE;
    }
}
