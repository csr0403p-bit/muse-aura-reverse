package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class MessagingCardInstructionKt$messagingCardEnvelope$1$2$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ MessagingAttachmentArg $attachment;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("path", this.$attachment.path, c2nw);
        String str = this.$attachment.fileName;
        if (str != null) {
            C7qW.A06("file_name", str, c2nw);
        }
        String str2 = this.$attachment.mimeType;
        if (str2 != null) {
            C7qW.A06(PhotosSearchHandlerKt.PARAM_MIME_TYPE, str2, c2nw);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagingCardInstructionKt$messagingCardEnvelope$1$2$1$1(MessagingAttachmentArg messagingAttachmentArg) {
        super(1);
        this.$attachment = messagingAttachmentArg;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
