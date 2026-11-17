package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailOwnerAddresses$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ EmailSender $sender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSendersScreenKt$EmailOwnerAddresses$3$2$1(EmailViewModel emailViewModel, EmailSender emailSender) {
        super(0);
        this.$model = emailViewModel;
        this.$sender = emailSender;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.removeSender(this.$sender);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
