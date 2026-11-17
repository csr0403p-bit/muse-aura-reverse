package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.email.model.EmailSender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailOwnerAddresses$1$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $removeId$delegate;
    public final /* synthetic */ EmailSender $sender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSendersScreenKt$EmailOwnerAddresses$1$1$1$2$1(EmailSender emailSender, MutableState<String> mutableState) {
        super(0);
        this.$sender = emailSender;
        this.$removeId$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$removeId$delegate.Af8(this.$sender.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
