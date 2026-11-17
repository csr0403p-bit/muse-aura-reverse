package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C6ys;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.model.HatchSendMessage;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AssistVoicePhotoSender implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isSending;
    public final Context context;
    public final C1BN<Boolean> isSending;
    public final C3UX scope;
    public final AbstractC3358CGz session;

    @DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2", f = "AssistVoicePhotoSender.kt", l = {121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSendMessage $message;
        public final /* synthetic */ HatchConversationRepository $repository;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConversationRepository hatchConversationRepository, HatchSendMessage hatchSendMessage, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$repository = hatchConversationRepository;
            this.$message = hatchSendMessage;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = AssistVoicePhotoSender.this.new AnonymousClass2(this.$repository, this.$message, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [X.27k, X.Hrx, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r4v5, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r7v1, types: [X.27k, X.Hrx, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v2, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r7v6, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? A01;
            ?? A012;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(AssistVoicePhotoSender.this.session);
                Integer num = C79.A0K;
                AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1 assistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1 = new AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1(gateway, this.$message, null);
                C6ys c6ys = C6ys.A00;
                A01 = GAo.A01(num, c6ys, assistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1, c3ux);
                A012 = GAo.A01(num, c6ys, new AssistVoicePhotoSender$sendAndAwaitDelivery$2$failure$1(gateway, this.$message, null), c3ux);
                try {
                    this.$repository.sendMessage(this.$message, null);
                    AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1 assistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1 = new AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1(A01, A012, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = A01;
                    this.L$3 = A012;
                    this.label = 1;
                    obj = GAX.A01(this, assistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1, 15000L);
                    A01 = A01;
                    A012 = A012;
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } catch (Throwable th) {
                    th = th;
                    A01.A5w(null);
                    A012.A5w(null);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                A012 = (HoC) this.L$3;
                A01 = (HoC) this.L$2;
                try {
                    Hwg.A00(obj);
                    A01 = A01;
                    A012 = A012;
                } catch (Throwable th2) {
                    th = th2;
                    A01.A5w(null);
                    A012.A5w(null);
                    throw th;
                }
            }
            if (!AnonymousClass002.A1b((Boolean) obj, true)) {
                throw C3cG.A0Q("Camera photo delivery failed");
            }
            A01.A5w(null);
            A012.A5w(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistVoicePhotoSender$sendPhoto$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ File $photo;
        public final /* synthetic */ AssistVoicePhotoSender this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, AssistVoicePhotoSender assistVoicePhotoSender) {
            super(1);
            this.$photo = file;
            this.this$0 = assistVoicePhotoSender;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.$photo.delete();
            AnonymousClass004.A1D(false, this.this$0._isSending);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender", f = "AssistVoicePhotoSender.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY, 99}, m = "sendUploadedPhoto", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistVoicePhotoSender$sendUploadedPhoto$1, reason: invalid class name and case insensitive filesystem */
    public final class C109501 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C109501(HtJ<? super C109501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssistVoicePhotoSender.this.sendUploadedPhoto(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$uploadPhoto$2", f = "AssistVoicePhotoSender.kt", l = {136, 146, 150, 151}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistVoicePhotoSender$uploadPhoto$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C109512 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ File $photo;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$uploadPhoto$2$1", f = "AssistVoicePhotoSender.kt", l = {137}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.assist.AssistVoicePhotoSender$uploadPhoto$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ AssistVoicePhotoSender this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AssistVoicePhotoSender assistVoicePhotoSender, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = assistVoicePhotoSender;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.this$0.session);
                    this.label = 1;
                    if (gateway.awaitConnected(this) == enumC10460Hji) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109512(File file, HtJ<? super C109512> htJ) {
            super(2, htJ);
            this.$photo = file;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AssistVoicePhotoSender.this.new C109512(this.$photo, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (X.GAX.A00(r16, r7, 15000) == r0) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:32:0x00c6, B:33:0x00ca, B:26:0x009f, B:27:0x00a3, B:29:0x00a7), top: B:45:0x000d }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistVoicePhotoSender.C109512.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C109512) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendAndAwaitDelivery(HatchConversationRepository hatchConversationRepository, HatchSendMessage hatchSendMessage, HtJ<? super Unit> htJ) {
        return C3cG.A0U(Hxb.A00(new AnonymousClass2(hatchConversationRepository, hatchSendMessage, null), htJ));
    }

    public final void sendPhoto(File file, String str, long j, String str2) {
        AnonymousClass003.A0w(file, str2);
        if (AnonymousClass003.A1Z(this._isSending)) {
            file.delete();
            return;
        }
        HtJ htJA14 = C3cI.A14(this._isSending, AnonymousClass001.A0i());
        AnonymousClass001.A11(new AssistVoicePhotoSender$sendPhoto$sendJob$1(this, file, str, j, str2, htJA14), this.scope).AO5(new AnonymousClass1(file, this));
    }

    public final class Companion {
        public final AssistVoicePhotoSender getInstance(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            return (AssistVoicePhotoSender) abstractC3358CGz.A03(AssistVoicePhotoSender.class, new AssistVoicePhotoSender$Companion$getInstance$1(context, abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendUploadedPhoto(java.lang.String r20, java.lang.String r21, X.HtJ<? super kotlin.Unit> r22) {
        /*
            r19 = this;
            r5 = r22
            boolean r0 = r5 instanceof com.facebook.aura.assist.AssistVoicePhotoSender.C109501
            r2 = r19
            if (r0 == 0) goto L29
            r1 = r5
            com.facebook.aura.assist.AssistVoicePhotoSender$sendUploadedPhoto$1 r1 = (com.facebook.aura.assist.AssistVoicePhotoSender.C109501) r1
            int r4 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L29
            int r4 = r4 - r3
            r1.label = r4
        L16:
            java.lang.Object r6 = r1.result
            X.Hji r0 = X.EnumC10460Hji.A02
            int r5 = r1.label
            r3 = 2
            r4 = 1
            if (r5 == 0) goto L38
            if (r5 == r4) goto La4
            if (r5 != r3) goto L33
            java.lang.Object r12 = r1.L$3
            com.facebook.aura.conversation.repo.HatchConversationRepository r12 = (com.facebook.aura.conversation.repo.HatchConversationRepository) r12
            goto L2f
        L29:
            com.facebook.aura.assist.AssistVoicePhotoSender$sendUploadedPhoto$1 r1 = new com.facebook.aura.assist.AssistVoicePhotoSender$sendUploadedPhoto$1
            r1.<init>(r5)
            goto L16
        L2f:
            X.Hwg.A00(r6)     // Catch: java.lang.Throwable -> Laa
            goto La0
        L33:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L38:
            X.Hwg.A00(r6)
            r6 = r20
            java.util.List r11 = java.util.Collections.singletonList(r6)
            X.HxE r5 = new X.HxE
            r5.<init>(r6, r6)
            java.util.Map r19 = X.AIW.A0J(r5)
            r10 = 0
            java.lang.String r8 = ""
            r17 = 0
            java.lang.String r9 = X.AnonymousClass002.A0k()
            X.AGi r12 = X.C0881AGi.A00
            com.facebook.aura.model.HatchSendMessage r7 = new com.facebook.aura.model.HatchSendMessage
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r18 = r10
            r20 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r15 = r21
            if (r21 != 0) goto L82
            com.facebook.aura.conversation.repo.HatchPrimaryConversationRepository$Companion r6 = com.facebook.aura.conversation.repo.HatchPrimaryConversationRepository.Companion
            android.content.Context r5 = r2.context
            X.CGz r3 = r2.session
            com.facebook.aura.conversation.repo.HatchPrimaryConversationRepository r3 = r6.getInstance(r5, r3)
            com.facebook.aura.conversation.repo.HatchConversationRepository r3 = r3.repository
            r1.L$0 = r10
            r1.L$1 = r10
            r1.L$2 = r10
            r1.label = r4
            java.lang.Object r1 = r2.sendAndAwaitDelivery(r3, r7, r1)
            if (r1 != r0) goto La7
            return r0
        L82:
            android.content.Context r13 = r2.context
            X.CGz r14 = r2.session
            r19 = 8
            com.facebook.aura.conversation.repo.HatchConversationRepository r12 = new com.facebook.aura.conversation.repo.HatchConversationRepository
            r18 = r17
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.L$0 = r10     // Catch: java.lang.Throwable -> Laa
            r1.L$1 = r10     // Catch: java.lang.Throwable -> Laa
            r1.L$2 = r10     // Catch: java.lang.Throwable -> Laa
            r1.L$3 = r12     // Catch: java.lang.Throwable -> Laa
            r1.label = r3     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r1 = r2.sendAndAwaitDelivery(r12, r7, r1)     // Catch: java.lang.Throwable -> Laa
            if (r1 != r0) goto La0
            return r0
        La0:
            r12.dispose()
            goto La7
        La4:
            X.Hwg.A00(r6)
        La7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Laa:
            r0 = move-exception
            r12.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistVoicePhotoSender.sendUploadedPhoto(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final C1BN<Boolean> isSending() {
        return this.isSending;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadPhoto(File file, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C109512(file, null));
    }

    public /* synthetic */ AssistVoicePhotoSender(Context context, AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(context, abstractC3358CGz);
    }

    public AssistVoicePhotoSender(Context context, AbstractC3358CGz abstractC3358CGz) {
        this.context = context;
        this.session = abstractC3358CGz;
        this.scope = Hxb.A02(C3cH.A0u());
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isSending = c9286GCnA0v;
        this.isSending = C3cG.A11(c9286GCnA0v);
    }
}
