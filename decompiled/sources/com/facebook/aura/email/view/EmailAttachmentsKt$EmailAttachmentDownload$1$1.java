package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailAttachmentsKt$EmailAttachmentDownload$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmailAttachment $attachment;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $failure;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ String $success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAttachmentsKt$EmailAttachmentDownload$1$1(EmailViewModel emailViewModel, Context context, String str, EmailAttachment emailAttachment, String str2, String str3) {
        super(0);
        this.$model = emailViewModel;
        this.$context = context;
        this.$messageId = str;
        this.$attachment = emailAttachment;
        this.$success = str2;
        this.$failure = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.downloadAttachment(this.$context, this.$messageId, this.$attachment, this.$success, this.$failure);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
