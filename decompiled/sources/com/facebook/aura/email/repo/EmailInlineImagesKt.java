package com.facebook.aura.email.repo;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.model.EmailThread;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public abstract class EmailInlineImagesKt {

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailInlineImagesKt$prepareThreadHtml$2", f = "EmailInlineImages.kt", l = {23}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailInlineImagesKt$prepareThreadHtml$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailThread>, Object> {
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailRepository $this_prepareThreadHtml;
        public final /* synthetic */ EmailThread $thread;
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.email.repo.EmailInlineImagesKt$prepareThreadHtml$2$1", f = "EmailInlineImages.kt", l = {27}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.email.repo.EmailInlineImagesKt$prepareThreadHtml$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ EmailInlineImageBudget $budget;
            public final /* synthetic */ String $environmentId;
            public final /* synthetic */ List<EmailMessage> $messages;
            public final /* synthetic */ EmailRepository $this_prepareThreadHtml;
            public int I$0;
            public int I$1;
            public int I$2;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public Object L$5;
            public Object L$6;
            public Object L$7;
            public Object L$8;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<EmailMessage> list, EmailRepository emailRepository, String str, EmailInlineImageBudget emailInlineImageBudget, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$messages = list;
                this.$this_prepareThreadHtml = emailRepository;
                this.$environmentId = str;
                this.$budget = emailInlineImageBudget;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$messages, this.$this_prepareThreadHtml, this.$environmentId, this.$budget, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007c -> B:16:0x0083). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    X.Hji r8 = X.EnumC10460Hji.A02
                    int r0 = r12.label
                    r7 = 1
                    if (r0 == 0) goto L31
                    if (r0 != r7) goto L2c
                    int r11 = r12.I$2
                    int r10 = r12.I$1
                    int r1 = r12.I$0
                    java.lang.Object r9 = r12.L$8
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Object r0 = r12.L$7
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Object r6 = r12.L$5
                    java.util.Iterator r6 = (java.util.Iterator) r6
                    java.lang.Object r5 = r12.L$4
                    com.facebook.aura.email.repo.EmailInlineImageBudget r5 = (com.facebook.aura.email.repo.EmailInlineImageBudget) r5
                    java.lang.Object r4 = r12.L$3
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r3 = r12.L$2
                    com.facebook.aura.email.repo.EmailRepository r3 = (com.facebook.aura.email.repo.EmailRepository) r3
                    java.lang.Object r2 = r12.L$1
                    java.util.List r2 = (java.util.List) r2
                    goto L80
                L2c:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L31:
                    X.Hwg.A00(r13)
                    java.util.List<com.facebook.aura.email.model.EmailMessage> r0 = r12.$messages
                    X.ADq r0 = X.AbstractC0885AGm.A12(r0)
                    java.util.List<com.facebook.aura.email.model.EmailMessage> r2 = r12.$messages
                    com.facebook.aura.email.repo.EmailRepository r3 = r12.$this_prepareThreadHtml
                    java.lang.String r4 = r12.$environmentId
                    com.facebook.aura.email.repo.EmailInlineImageBudget r5 = r12.$budget
                    java.util.Iterator r6 = r0.iterator()
                L46:
                    r9 = r2
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L95
                    java.lang.Object r0 = r6.next()
                    int r11 = X.AnonymousClass001.A0F(r0)
                    java.lang.Object r1 = r2.get(r11)     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    com.facebook.aura.email.model.EmailMessage r1 = (com.facebook.aura.email.model.EmailMessage) r1     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r0 = 0
                    r12.L$0 = r0     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$1 = r2     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$2 = r3     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$3 = r4     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$4 = r5     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$5 = r6     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$6 = r0     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$7 = r2     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.L$8 = r2     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.I$0 = r11     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.I$1 = r11     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.I$2 = r11     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    r12.label = r7     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    java.lang.Object r13 = com.facebook.aura.email.repo.EmailInlineImagesKt.withInlineImages(r3, r4, r1, r5, r12)     // Catch: java.lang.Exception -> L86 java.util.concurrent.CancellationException -> L93
                    if (r13 == r8) goto L97
                    r10 = r11
                    r1 = r11
                    r0 = r2
                    goto L83
                L80:
                    X.Hwg.A00(r13)     // Catch: java.lang.Exception -> L89 java.util.concurrent.CancellationException -> L93
                L83:
                    com.facebook.aura.email.model.EmailMessage r13 = (com.facebook.aura.email.model.EmailMessage) r13     // Catch: java.lang.Exception -> L89 java.util.concurrent.CancellationException -> L93
                    goto L8f
                L86:
                    r10 = r11
                    r1 = r11
                    r0 = r2
                L89:
                    java.lang.Object r13 = r2.get(r1)
                    r11 = r10
                    r9 = r0
                L8f:
                    r9.set(r11, r13)
                    goto L46
                L93:
                    r0 = move-exception
                    throw r0
                L95:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                L97:
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailInlineImagesKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailThread emailThread, EmailRepository emailRepository, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$thread = emailThread;
            this.$this_prepareThreadHtml = emailRepository;
            this.$environmentId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$thread, this.$this_prepareThreadHtml, this.$environmentId, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailInlineImageBudget emailInlineImageBudget = new EmailInlineImageBudget();
                ArrayList arrayListA0R = AbstractC0878AGe.A0R(this.$thread.messages);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayListA0R, this.$this_prepareThreadHtml, this.$environmentId, emailInlineImageBudget, null);
                this.L$0 = null;
                this.L$1 = arrayListA0R;
                this.label = 1;
                arrayList = arrayListA0R;
                if (GAX.A01(this, anonymousClass1, 15000L) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                ?? r4 = (Iterable) this.L$1;
                Hwg.A00(obj);
                arrayList = r4;
            }
            EmailThread emailThread = this.$thread;
            AHD ahdA07 = AGI.A07(arrayList);
            EmailSummary emailSummary = emailThread.summary;
            AnonymousClass003.A0u(emailSummary, ahdA07);
            return new EmailThread(emailSummary, ahdA07);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EmailThread> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailInlineImagesKt", f = "EmailInlineImages.kt", l = {78}, m = "withInlineImages", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailInlineImagesKt$withInlineImages$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailInlineImagesKt.withInlineImages(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01d6 -> B:74:0x01dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object withInlineImages(com.facebook.aura.email.repo.EmailRepository r24, java.lang.String r25, com.facebook.aura.email.model.EmailMessage r26, com.facebook.aura.email.repo.EmailInlineImageBudget r27, X.HtJ<? super com.facebook.aura.email.model.EmailMessage> r28) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.repo.EmailInlineImagesKt.withInlineImages(com.facebook.aura.email.repo.EmailRepository, java.lang.String, com.facebook.aura.email.model.EmailMessage, com.facebook.aura.email.repo.EmailInlineImageBudget, X.HtJ):java.lang.Object");
    }

    public static final Object prepareThreadHtml(EmailRepository emailRepository, String str, EmailThread emailThread, HtJ<? super EmailThread> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(emailThread, emailRepository, str, null));
    }
}
