package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConversationComposers implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final ConcurrentHashMap<Object, String> conversationsWithContent;

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationComposers", f = "ConversationComposers.kt", l = {18}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationComposers$publish$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationComposers.this.publish(null, null, this);
        }
    }

    public final boolean hasContent(String str) {
        C7384Etj.A0Y(str, 0);
        return this.conversationsWithContent.containsValue(str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.conversationsWithContent.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(final java.lang.String r8, X.C20Q<java.lang.Boolean> r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.api.ConversationComposers.AnonymousClass1
            if (r0 == 0) goto L20
            r6 = r10
            com.facebook.aura.conversation.api.ConversationComposers$publish$1 r6 = (com.facebook.aura.conversation.api.ConversationComposers.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L2a
            java.lang.Object r3 = r6.L$2
            goto L26
        L20:
            com.facebook.aura.conversation.api.ConversationComposers$publish$1 r6 = new com.facebook.aura.conversation.api.ConversationComposers$publish$1
            r6.<init>(r10)
            goto L12
        L26:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L57
            goto L4f
        L2a:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L2f:
            X.Hwg.A00(r1)
            java.lang.Object r3 = X.C3cG.A0T()
            X.20Q r2 = X.GDB.A01(r9)     // Catch: java.lang.Throwable -> L57
            com.facebook.aura.conversation.api.ConversationComposers$publish$2 r1 = new com.facebook.aura.conversation.api.ConversationComposers$publish$2     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Throwable -> L57
            r6.L$1 = r0     // Catch: java.lang.Throwable -> L57
            r6.L$2 = r3     // Catch: java.lang.Throwable -> L57
            r6.label = r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r2.collect(r1, r6)     // Catch: java.lang.Throwable -> L57
            if (r0 != r5) goto L4f
            return r5
        L4f:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.String> r0 = r7.conversationsWithContent
            r0.remove(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L57:
            r1 = move-exception
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.String> r0 = r7.conversationsWithContent
            r0.remove(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationComposers.publish(java.lang.String, X.20Q, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final ConversationComposers getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConversationComposers) abstractC3358CGz.A03(ConversationComposers.class, ConversationComposers$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ ConversationComposers(C06H c06h) {
        this();
    }

    public ConversationComposers() {
        this.conversationsWithContent = new ConcurrentHashMap<>();
    }
}
