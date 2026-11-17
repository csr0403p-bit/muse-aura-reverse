package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.keys.EmailVerifySenderKey;
import com.facebook.aura.email.model.EmailSender;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSendersScreenKt$EmailOwnerAddresses$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailSender $sender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSendersScreenKt$EmailOwnerAddresses$1$1$1$1$1(AuraNavigator auraNavigator, String str, EmailSender emailSender) {
        super(0);
        this.$navigator = auraNavigator;
        this.$environmentId = str;
        this.$sender = emailSender;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new EmailVerifySenderKey(this.$environmentId, this.$sender.emailAddress), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
