package com.facebook.aura.nudge;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class ConversationCardTimeline$observe$$inlined$map$1 implements C20Q<List<? extends RequestedCardContent>> {
    public final /* synthetic */ String $surface$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1", f = "ConversationCardTimeline.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$1, reason: invalid class name */
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
            return ConversationCardTimeline$observe$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ String $surface$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2", f = "ConversationCardTimeline.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, String str) {
            this.$this_unsafeFlow = c20z;
            this.$surface$inlined = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, X.HtJ r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L5f
                r9 = r12
                com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2$1 r9 = (com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1.AnonymousClass2.AnonymousClass1) r9
                int r2 = r9.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L5f
                int r2 = r2 - r1
                r9.label = r2
            L12:
                java.lang.Object r1 = r9.result
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r7 = 1
                if (r0 == 0) goto L23
                if (r0 != r7) goto L65
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L23:
                X.Hwg.A00(r1)
                X.20Z r6 = r10.$this_unsafeFlow
                java.util.List r11 = (java.util.List) r11
                java.util.ArrayList r5 = X.AnonymousClass003.A0i(r11)
                java.util.Iterator r4 = r11.iterator()
            L32:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L4d
                java.lang.Object r0 = r4.next()
                com.facebook.aura.nudge.RequestedCardRow r0 = (com.facebook.aura.nudge.RequestedCardRow) r0
                com.facebook.aura.conversation.api.PendingConversationCard r3 = r0.card
                boolean r2 = r0.isVisible
                java.lang.String r1 = r10.$surface$inlined
                com.facebook.aura.nudge.RequestedCardContent r0 = new com.facebook.aura.nudge.RequestedCardContent
                r0.<init>(r3, r2, r1)
                r5.add(r0)
                goto L32
            L4d:
                r0 = 0
                r9.L$0 = r0
                r9.L$1 = r0
                r9.L$2 = r0
                r9.L$3 = r0
                r9.label = r7
                java.lang.Object r0 = r6.emit(r5, r9)
                if (r0 != r8) goto L20
                return r8
            L5f:
                com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2$1 r9 = new com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2$1
                r9.<init>(r12)
                goto L12
            L65:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public ConversationCardTimeline$observe$$inlined$map$1(C20Q c20q, String str) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$surface$inlined = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super java.util.List<? extends com.facebook.aura.nudge.RequestedCardContent>> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$1 r5 = (com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L45
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.20Q r2 = r6.$this_unsafeTransform$inlined
            java.lang.String r0 = r6.$surface$inlined
            com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2 r1 = new com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$2
            r1.<init>(r7, r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3f:
            com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$1 r5 = new com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nudge.ConversationCardTimeline$observe$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
