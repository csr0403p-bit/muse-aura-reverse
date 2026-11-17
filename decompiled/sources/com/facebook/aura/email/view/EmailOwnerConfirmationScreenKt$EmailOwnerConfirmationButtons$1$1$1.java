package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationButtons$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ C1BO<EmailState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailOwnerConfirmationScreenKt$EmailOwnerConfirmationButtons$1$1$1(EmailViewModel emailViewModel, String str, C1BO<EmailState> c1bo) {
        super(0);
        this.$model = emailViewModel;
        this.$key = str;
        this.$state$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.performOwnerPrimaryAction(C1BO.A06(this.$state$delegate).ownerRecipient, this.$key);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
