package com.facebook.aura.partners.voice.session.impl;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchCallJoinContext$joinRetries$$inlined$filter$1 implements C20Q<HatchCallJoinContext.JoinRetry> {
    public final /* synthetic */ String $callId$inlined;
    public final /* synthetic */ long $generation$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1", f = "HatchCallJoinContext.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$1, reason: invalid class name */
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
            return HatchCallJoinContext$joinRetries$$inlined$filter$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ String $callId$inlined;
        public final /* synthetic */ long $generation$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2", f = "HatchCallJoinContext.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
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

        public AnonymousClass2(C20Z c20z, String str, long j) {
            this.$this_unsafeFlow = c20z;
            this.$callId$inlined = str;
            this.$generation$inlined = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, X.HtJ r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L4f
                r7 = r11
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2$1 r7 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L4f
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r8 = 1
                if (r0 == 0) goto L23
                if (r0 != r8) goto L55
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L23:
                X.Hwg.A00(r1)
                X.20Z r5 = r9.$this_unsafeFlow
                r2 = r10
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinRetry r2 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinRetry) r2
                java.lang.String r1 = r2.callId
                java.lang.String r0 = r9.$callId$inlined
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L20
                long r3 = r2.generation
                long r1 = r9.$generation$inlined
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L20
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.L$3 = r0
                r7.label = r8
                java.lang.Object r0 = r5.emit(r10, r7)
                if (r0 != r6) goto L20
                return r6
            L4f:
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2$1 r7 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2$1
                r7.<init>(r11)
                goto L12
            L55:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public HatchCallJoinContext$joinRetries$$inlined$filter$1(C20Q c20q, String str, long j) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$callId$inlined = str;
        this.$generation$inlined = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinRetry> r9, X.HtJ r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1.AnonymousClass1
            if (r0 == 0) goto L41
            r7 = r10
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$1 r7 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L47
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L23:
            X.Hwg.A00(r1)
            X.20Q r4 = r8.$this_unsafeTransform$inlined
            java.lang.String r0 = r8.$callId$inlined
            long r2 = r8.$generation$inlined
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2 r1 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$2
            r1.<init>(r9, r0, r2)
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r0
            r7.label = r5
            java.lang.Object r0 = r4.collect(r1, r7)
            if (r0 != r6) goto L20
            return r6
        L41:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$1 r7 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1$1
            r7.<init>(r10)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$joinRetries$$inlined$filter$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
