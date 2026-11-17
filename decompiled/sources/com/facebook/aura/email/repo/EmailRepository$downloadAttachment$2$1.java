package com.facebook.aura.email.repo;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzS;
import android.content.Context;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.email.model.EmailAttachment;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1", f = "EmailRepository.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$downloadAttachment$2$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ EmailAttachment $attachment;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $id;
    public final /* synthetic */ String $messageId;
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1$1", f = "EmailRepository.kt", l = {185, 188, HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EmailAttachment $attachment;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $id;
        public final /* synthetic */ String $messageId;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ EmailRepository this$0;

        /* renamed from: com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes5.dex */
        public final class C01431 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
            public final /* synthetic */ byte[] $bytes;
            public final /* synthetic */ C78T $coroutineContext;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OutputStream outputStream) throws IOException {
                C7384Etj.A0Y(outputStream, 0);
                HzS.A05(this.$coroutineContext);
                outputStream.write(this.$bytes);
                HzS.A05(this.$coroutineContext);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01431(C78T c78t, byte[] bArr) {
                super(1);
                this.$coroutineContext = c78t;
                this.$bytes = bArr;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
                invoke2(outputStream);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmailRepository emailRepository, String str, String str2, EmailAttachment emailAttachment, Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = emailRepository;
            this.$id = str;
            this.$messageId = str2;
            this.$attachment = emailAttachment;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$id, this.$messageId, this.$attachment, this.$context, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r1 = r14.label
                r7 = 0
                r3 = 3
                r0 = 1
                r2 = 2
                if (r1 == 0) goto L16
                if (r1 == r0) goto L2d
                if (r1 == r2) goto L4f
                if (r1 != r3) goto Lbe
                X.Hwg.A00(r15)
            L13:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L16:
                X.Hwg.A00(r15)
                com.facebook.aura.email.repo.EmailRepository r8 = r14.this$0
                java.lang.String r9 = r14.$id
                java.lang.String r10 = r14.$messageId
                com.facebook.aura.email.model.EmailAttachment r11 = r14.$attachment
                r14.label = r0
                r12 = 33554432(0x2000000, double:1.6578092E-316)
                java.lang.Object r15 = com.facebook.aura.email.repo.EmailRepository.access$fetchAttachment(r8, r9, r10, r11, r12, r14)
                if (r15 != r4) goto L30
                return r4
            L2d:
                X.Hwg.A00(r15)
            L30:
                r8 = r15
                com.facebook.aura.email.repo.EmailAttachmentContentJson r8 = (com.facebook.aura.email.repo.EmailAttachmentContentJson) r8
                java.lang.String r0 = r8.content_base64
                byte[] r6 = android.util.Base64.decode(r0, r7)
                int r0 = r6.length
                long r4 = (long) r0
                long r0 = r8.size
                int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r9 != 0) goto Lcb
                com.facebook.aura.email.repo.EmailRepository r1 = r14.this$0
                java.lang.String r0 = r14.$id
                r14.L$0 = r8
                r14.L$1 = r6
                r14.label = r2
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r1, r0, r14)
                goto L5a
            L4f:
                java.lang.Object r6 = r14.L$1
                byte[] r6 = (byte[]) r6
                java.lang.Object r8 = r14.L$0
                com.facebook.aura.email.repo.EmailAttachmentContentJson r8 = (com.facebook.aura.email.repo.EmailAttachmentContentJson) r8
                X.Hwg.A00(r15)
            L5a:
                java.lang.String r1 = r8.filename
                r0 = 47
                java.lang.String r1 = X.C7BY.A0R(r1, r1, r0)
                r0 = 92
                java.lang.String r5 = X.C7BY.A0R(r1, r1, r0)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                int r2 = r5.length()
            L71:
                if (r7 >= r2) goto L85
                char r0 = r5.charAt(r7)
                char r1 = (char) r0
                char r0 = (char) r1
                boolean r0 = java.lang.Character.isISOControl(r0)
                if (r0 != 0) goto L82
                r4.append(r1)
            L82:
                int r7 = r7 + 1
                goto L71
            L85:
                java.lang.String r1 = r4.toString()
                r0 = 200(0xc8, float:2.8E-43)
                java.lang.String r5 = X.BQG.A17(r1, r0)
                boolean r0 = X.C7BY.A0j(r5)
                if (r0 == 0) goto L97
                java.lang.String r5 = "attachment"
            L97:
                X.78T r4 = r14.getContext()
                android.content.Context r2 = r14.$context
                java.lang.String r1 = r8.mime_type
                com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1$1$1 r0 = new com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1$1$1
                r0.<init>(r4, r6)
                android.net.Uri r0 = com.facebook.aura.file.utils.HatchDownloadsWriterKt.writeToDownloads(r2, r5, r1, r0)
                if (r0 == 0) goto Lc3
                com.facebook.aura.email.repo.EmailRepository r2 = r14.this$0
                java.lang.String r1 = r14.$id
                r0 = 0
                r14.L$0 = r0
                r14.L$1 = r0
                r14.L$2 = r0
                r14.L$3 = r0
                r14.label = r3
                com.facebook.aura.email.repo.EmailRepository.access$checkEnvironment(r2, r1, r14)
                goto L13
            Lbe:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lc3:
                java.lang.String r1 = "Required value was null."
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r1)
                throw r0
            Lcb:
                java.lang.String r1 = "Check failed."
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailRepository$downloadAttachment$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$downloadAttachment$2$1(EmailRepository emailRepository, String str, String str2, EmailAttachment emailAttachment, Context context, HtJ<? super EmailRepository$downloadAttachment$2$1> htJ) {
        super(1, htJ);
        this.this$0 = emailRepository;
        this.$id = str;
        this.$messageId = str2;
        this.$attachment = emailAttachment;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new EmailRepository$downloadAttachment$2$1(this.this$0, this.$id, this.$messageId, this.$attachment, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, this.$messageId, this.$attachment, this.$context, null);
            this.label = 1;
            if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((EmailRepository$downloadAttachment$2$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
