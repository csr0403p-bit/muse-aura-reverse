package com.facebook.aura.commands.sms;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC10560Hsz;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class DirectMessageDraftSender implements MessageDraftSender {

    @DebugMetadata(c = "com.facebook.aura.commands.sms.DirectMessageDraftSender", f = "MessageDraftSender.kt", l = {173}, m = "send", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.DirectMessageDraftSender$send$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DirectMessageDraftSender.this.send(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.DirectMessageDraftSender", f = "MessageDraftSender.kt", l = {255}, m = "sendAndAwaitResult", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.DirectMessageDraftSender$sendAndAwaitResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C111351 extends HzP {
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

        public C111351(HtJ<? super C111351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DirectMessageDraftSender.this.sendAndAwaitResult(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.DirectMessageDraftSender$sendAndAwaitResult$5", f = "MessageDraftSender.kt", l = {255}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.DirectMessageDraftSender$sendAndAwaitResult$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super MessageDraftResult>, Object> {
        public final /* synthetic */ InterfaceC10560Hsz<MessageDraftResult> $result;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InterfaceC10560Hsz<MessageDraftResult> interfaceC10560Hsz, HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
            this.$result = interfaceC10560Hsz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass5(this.$result, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super MessageDraftResult> htJ) {
            return new AnonymousClass5(this.$result, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InterfaceC10560Hsz<MessageDraftResult> interfaceC10560Hsz = this.$result;
                this.label = 1;
                obj = C3cG.A0W(interfaceC10560Hsz, this);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182 A[Catch: Exception -> 0x0191, CancellationException -> 0x01a6, LOOP:1: B:64:0x017c->B:66:0x0182, LOOP_END, TRY_LEAVE, TryCatch #9 {Exception -> 0x0191, blocks: (B:63:0x0175, B:64:0x017c, B:66:0x0182), top: B:91:0x0175 }] */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.telephony.SmsManager] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.AbstractCollection, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendAndAwaitResult(final android.content.Context r18, android.telephony.SmsManager r19, java.lang.String r20, java.lang.String r21, X.HtJ<? super com.facebook.aura.commands.sms.MessageDraftResult> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DirectMessageDraftSender.sendAndAwaitResult(android.content.Context, android.telephony.SmsManager, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // com.facebook.aura.commands.sms.MessageDraftSender
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(android.content.Context r11, java.lang.String r12, java.lang.String r13, X.HtJ<? super com.facebook.aura.commands.sms.MessageDraftResult> r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DirectMessageDraftSender.send(android.content.Context, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
