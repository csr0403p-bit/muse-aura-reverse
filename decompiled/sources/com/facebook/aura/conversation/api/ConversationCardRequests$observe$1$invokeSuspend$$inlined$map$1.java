package com.facebook.aura.conversation.api;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.api.ConversationCardRequests;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1 implements C20Q<List<? extends ConversationCardRequests.CardState>> {
    public final /* synthetic */ String $conversationId$inlined;
    public final /* synthetic */ boolean $isPrimaryChat$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ ConversationCardRequests this$0;

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1", f = "ConversationCardRequests.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ String $conversationId$inlined;
        public final /* synthetic */ boolean $isPrimaryChat$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ ConversationCardRequests this$0;

        @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2", f = "ConversationCardRequests.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(HtJ htJ) {
                super(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(C20Z c20z, ConversationCardRequests conversationCardRequests, String str, boolean z) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = conversationCardRequests;
            this.$conversationId$inlined = str;
            this.$isPrimaryChat$inlined = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, X.HtJ r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L63
                r9 = r13
                com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2$1 r9 = (com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r9
                int r2 = r9.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L63
                int r2 = r2 - r1
                r9.label = r2
            L12:
                java.lang.Object r1 = r9.result
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r10 = 1
                if (r0 == 0) goto L23
                if (r0 != r10) goto L69
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L23:
                X.Hwg.A00(r1)
                X.20Z r7 = r11.$this_unsafeFlow
                java.util.List r12 = (java.util.List) r12
                java.util.ArrayList r6 = X.C3cG.A0h()
                java.util.Iterator r5 = r12.iterator()
            L32:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L51
                java.lang.Object r4 = r5.next()
                r0 = r4
                com.facebook.aura.conversation.api.ConversationCardRequests$CardState r0 = (com.facebook.aura.conversation.api.ConversationCardRequests.CardState) r0
                com.facebook.aura.conversation.api.ConversationCardRequests r3 = r11.this$0
                com.facebook.aura.conversation.api.ConversationCardRequests$Target r2 = r0.target
                java.lang.String r1 = r11.$conversationId$inlined
                boolean r0 = r11.$isPrimaryChat$inlined
                boolean r0 = com.facebook.aura.conversation.api.ConversationCardRequests.access$matches(r3, r2, r1, r0)
                if (r0 == 0) goto L32
                r6.add(r4)
                goto L32
            L51:
                r0 = 0
                r9.L$0 = r0
                r9.L$1 = r0
                r9.L$2 = r0
                r9.L$3 = r0
                r9.label = r10
                java.lang.Object r0 = r7.emit(r6, r9)
                if (r0 != r8) goto L20
                return r8
            L63:
                com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2$1 r9 = new com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2$1
                r9.<init>(r13)
                goto L12
            L69:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1(C20Q c20q, ConversationCardRequests conversationCardRequests, String str, boolean z) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = conversationCardRequests;
        this.$conversationId$inlined = str;
        this.$isPrimaryChat$inlined = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super java.util.List<? extends com.facebook.aura.conversation.api.ConversationCardRequests.CardState>> r9, X.HtJ r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L43
            r7 = r10
            com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$1 r7 = (com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L49
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L23:
            X.Hwg.A00(r1)
            X.20Q r4 = r8.$this_unsafeTransform$inlined
            com.facebook.aura.conversation.api.ConversationCardRequests r3 = r8.this$0
            java.lang.String r2 = r8.$conversationId$inlined
            boolean r0 = r8.$isPrimaryChat$inlined
            com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2 r1 = new com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$2
            r1.<init>(r9, r3, r2, r0)
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r0
            r7.label = r5
            java.lang.Object r0 = r4.collect(r1, r7)
            if (r0 != r6) goto L20
            return r6
        L43:
            com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$1 r7 = new com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1$1
            r7.<init>(r10)
            goto L12
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
