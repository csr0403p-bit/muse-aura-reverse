package com.facebook.aura.email.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFI;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.email.model.EmailAttachment;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$attachmentImage$2$1", f = "EmailRepository.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$attachmentImage$2$1 extends AbstractC07127nr implements G0U<HtJ<? super EmailInlineImage>, Object> {
    public final /* synthetic */ EmailAttachment $attachment;
    public final /* synthetic */ String $id;
    public final /* synthetic */ long $maxPixels;
    public final /* synthetic */ String $messageId;
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$attachmentImage$2$1$1", f = "EmailRepository.kt", l = {113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$attachmentImage$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailInlineImage>, Object> {
        public final /* synthetic */ EmailAttachment $attachment;
        public final /* synthetic */ String $id;
        public final /* synthetic */ long $maxPixels;
        public final /* synthetic */ String $messageId;
        public int label;
        public final /* synthetic */ EmailRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmailRepository emailRepository, String str, String str2, EmailAttachment emailAttachment, long j, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = emailRepository;
            this.$id = str;
            this.$messageId = str2;
            this.$attachment = emailAttachment;
            this.$maxPixels = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$id, this.$messageId, this.$attachment, this.$maxPixels, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = this.this$0;
                String str = this.$id;
                String str2 = this.$messageId;
                EmailAttachment emailAttachment = this.$attachment;
                this.label = 1;
                obj = emailRepository.fetchAttachment(str, str2, emailAttachment, 2097152L, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            EmailAttachmentContentJson emailAttachmentContentJson = (EmailAttachmentContentJson) obj;
            if (emailAttachmentContentJson.size != this.$attachment.size) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            byte[] bArrDecode = Base64.decode(emailAttachmentContentJson.content_base64, 0);
            int length = bArrDecode.length;
            if (length != emailAttachmentContentJson.size) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArrDecode, 0, length, options);
            int i3 = options.outWidth;
            if (i3 <= 0 || (i = options.outHeight) <= 0 || i3 * i > this.$maxPixels || !BFI.A0H(new String[]{HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE, MediaDeviceSyncClientKt.FALLBACK_MIME, "image/gif", "image/webp"}).contains(options.outMimeType)) {
                return null;
            }
            return new EmailInlineImage(FGI.A0d(HatchWebPageParserKt.DATA_URI_PREFIX, options.outMimeType, ";base64,", emailAttachmentContentJson.content_base64), options.outWidth * options.outHeight);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EmailInlineImage> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$attachmentImage$2$1(EmailRepository emailRepository, String str, String str2, EmailAttachment emailAttachment, long j, HtJ<? super EmailRepository$attachmentImage$2$1> htJ) {
        super(1, htJ);
        this.this$0 = emailRepository;
        this.$id = str;
        this.$messageId = str2;
        this.$attachment = emailAttachment;
        this.$maxPixels = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new EmailRepository$attachmentImage$2$1(this.this$0, this.$id, this.$messageId, this.$attachment, this.$maxPixels, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, this.$messageId, this.$attachment, this.$maxPixels, null);
            this.label = 1;
            obj = GAo.A00(this, c78tA0s, anonymousClass1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super EmailInlineImage> htJ) {
        return ((EmailRepository$attachmentImage$2$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
