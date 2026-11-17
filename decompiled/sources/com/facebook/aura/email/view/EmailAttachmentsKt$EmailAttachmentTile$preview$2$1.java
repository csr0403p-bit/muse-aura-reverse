package com.facebook.aura.email.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.view.EmailAttachmentsKt$EmailAttachmentTile$preview$2$1", f = "EmailAttachments.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailAttachmentsKt$EmailAttachmentTile$preview$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<String>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ EmailAttachment $attachment;
    public final /* synthetic */ boolean $available;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ EmailRepository $repository;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAttachmentsKt$EmailAttachmentTile$preview$2$1(boolean z, EmailRepository emailRepository, String str, String str2, EmailAttachment emailAttachment, HtJ<? super EmailAttachmentsKt$EmailAttachmentTile$preview$2$1> htJ) {
        super(2, htJ);
        this.$available = z;
        this.$repository = emailRepository;
        this.$environmentId = str;
        this.$messageId = str2;
        this.$attachment = emailAttachment;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        EmailAttachmentsKt$EmailAttachmentTile$preview$2$1 emailAttachmentsKt$EmailAttachmentTile$preview$2$1 = new EmailAttachmentsKt$EmailAttachmentTile$preview$2$1(this.$available, this.$repository, this.$environmentId, this.$messageId, this.$attachment, htJ);
        emailAttachmentsKt$EmailAttachmentTile$preview$2$1.L$0 = obj;
        return emailAttachmentsKt$EmailAttachmentTile$preview$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        MutableState mutableState2 = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            mutableState2.Af8(null);
        }
        if (i == 0) {
            Hwg.A00(obj);
            mutableState2.Af8(null);
            if (this.$available) {
                EmailRepository emailRepository = this.$repository;
                String str = this.$environmentId;
                String str2 = this.$messageId;
                EmailAttachment emailAttachment = this.$attachment;
                this.L$0 = mutableState2;
                this.L$1 = mutableState2;
                this.label = 1;
                obj = emailRepository.attachmentPreview(str, str2, emailAttachment, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
                mutableState = mutableState2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$1;
        Hwg.A00(obj);
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<String> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((EmailAttachmentsKt$EmailAttachmentTile$preview$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
