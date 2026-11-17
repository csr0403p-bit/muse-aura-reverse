package com.facebook.aura.login.nativeflow;

import X.C06H;
import X.C7384Etj;
import X.C7438Evz;
import X.G0W;
import X.HsJ;
import X.HtJ;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointContinuation {
    public static final int $stable = 8;
    public final G0W<String, String, HtJ<? super HsJ<String>>, Object> blobDecrypter;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0W {
        public AnonymousClass1(Object obj) {
            super(3, obj, NativeLoginCheckpointBlobDecrypter.class, "decrypt", "decrypt-0E7RQCE(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        @Override // X.G0W
        /* renamed from: invoke-0E7RQCE, reason: not valid java name and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.String r6, java.lang.String r7, X.HtJ<? super X.HsJ<java.lang.String>> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1$invoke0E7RQCE$1
                if (r0 == 0) goto L3b
                r4 = r8
                com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1$invoke-0E7RQCE$1 r4 = (com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1$invoke0E7RQCE$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3b
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L26
                if (r0 != r2) goto L41
                java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
            L21:
                X.HsJ r3 = X.C3cG.A0t(r0)
                return r3
            L26:
                X.Hwg.A00(r1)
                java.lang.Object r1 = r5.receiver
                com.facebook.aura.login.nativeflow.NativeLoginCheckpointBlobDecrypter r1 = (com.facebook.aura.login.nativeflow.NativeLoginCheckpointBlobDecrypter) r1
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.label = r2
                java.lang.Object r0 = r1.m1275decrypt0E7RQCE(r6, r7, r4)
                if (r0 != r3) goto L21
                return r3
            L3b:
                com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1$invoke-0E7RQCE$1 r4 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$1$invoke-0E7RQCE$1
                r4.<init>(r5, r8)
                goto L12
            L41:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation.AnonymousClass1.invoke(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
        }
    }

    public /* synthetic */ NativeLoginCheckpointContinuation(G0W g0w, int i, C06H c06h) {
        this((i & 1) != 0 ? new AnonymousClass1(new NativeLoginCheckpointBlobDecrypter()) : g0w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* renamed from: decryptAccessToken-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1276decryptAccessToken0E7RQCE(java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<java.lang.String>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$1
            if (r0 == 0) goto L6a
            r6 = r10
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$1 r6 = (com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L42
            if (r0 != r4) goto L70
            X.Hwg.A00(r1)
        L23:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L28:
            X.Hwg.A00(r1)
            X.78T r2 = X.C3cG.A0v()
            r1 = 0
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$callback$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$callback$1
            r0.<init>(r8, r9, r1)
            r6.L$0 = r1
            r6.L$1 = r9
            r6.label = r3
            java.lang.Object r1 = X.GAo.A00(r6, r2, r0)
            if (r1 != r5) goto L47
            return r5
        L42:
            java.lang.Object r9 = r6.L$1
            X.Hwg.A00(r1)
        L47:
            X.6tk r1 = (X.C05706tk) r1
            if (r1 != 0) goto L56
            r1 = 0
            com.facebook.aura.login.nativeflow.InvalidCheckpointCallbackException r0 = new com.facebook.aura.login.nativeflow.InvalidCheckpointCallbackException
            r0.<init>(r1)
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        L56:
            X.G0W<java.lang.String, java.lang.String, X.HtJ<? super X.HsJ<java.lang.String>>, java.lang.Object> r2 = r7.blobDecrypter
            java.lang.String r1 = r1.A00
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r1 = r2.invoke(r9, r1, r6)
            if (r1 != r5) goto L23
            return r5
        L6a:
            com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$1 r6 = new com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$1
            r6.<init>(r7, r10)
            goto L12
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation.m1276decryptAccessToken0E7RQCE(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointContinuation(G0W<? super String, ? super String, ? super HtJ<? super HsJ<String>>, ? extends Object> g0w) {
        C7384Etj.A0Y(g0w, 0);
        this.blobDecrypter = g0w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCheckpointContinuation() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
