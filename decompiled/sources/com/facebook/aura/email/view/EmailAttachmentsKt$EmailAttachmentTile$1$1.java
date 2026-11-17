package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.keys.EmailAttachmentKey;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailAttachmentsKt$EmailAttachmentTile$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailAttachment $attachment;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAttachmentsKt$EmailAttachmentTile$1$1(AuraNavigator auraNavigator, String str, String str2, EmailAttachment emailAttachment) {
        super(0);
        this.$navigator = auraNavigator;
        this.$environmentId = str;
        this.$messageId = str2;
        this.$attachment = emailAttachment;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new EmailAttachmentKey(this.$environmentId, this.$messageId, this.$attachment.index), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
