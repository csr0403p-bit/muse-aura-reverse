package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailMessageMenuKt$EmailMessageMenu$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $deleteFailure;
    public final /* synthetic */ String $deleteSuccess;
    public final /* synthetic */ EmailMessage $message;
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailMessageMenuKt$EmailMessageMenu$2$1(EmailViewModel emailViewModel, EmailMessage emailMessage, String str, String str2) {
        super(0);
        this.$model = emailViewModel;
        this.$message = emailMessage;
        this.$deleteSuccess = str;
        this.$deleteFailure = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.deleteMessage(this.$message.id, this.$deleteSuccess, this.$deleteFailure);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
