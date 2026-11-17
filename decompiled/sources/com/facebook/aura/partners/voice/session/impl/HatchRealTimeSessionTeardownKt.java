package com.facebook.aura.partners.voice.session.impl;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public abstract class HatchRealTimeSessionTeardownKt {
    public static final String TAG = "HatchRTSessionController";

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt", f = "HatchRealTimeSessionTeardown.kt", l = {18, 25}, m = "tearDownRealTimeSession", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt$tearDownRealTimeSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchRealTimeSessionTeardownKt.tearDownRealTimeSession(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object tearDownRealTimeSession(X.GTf r7, X.C57m r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt.AnonymousClass1
            if (r0 == 0) goto L23
            r6 = r10
            com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt$tearDownRealTimeSession$1 r6 = (com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            java.lang.String r4 = "HatchRTSessionController"
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L32
            if (r0 != r3) goto L2d
            goto L29
        L23:
            com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt$tearDownRealTimeSession$1 r6 = new com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt$tearDownRealTimeSession$1
            r6.<init>(r10)
            goto L12
        L29:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L6e
            goto L74
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            java.lang.Object r9 = r6.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r6.L$0
            X.GTf r7 = (X.GTf) r7
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L56
            goto L5c
        L3e:
            X.Hwg.A00(r1)
            if (r8 == 0) goto L5c
            java.lang.String r1 = "lifecycle_close"
            r6.L$0 = r7     // Catch: java.lang.Exception -> L56
            r0 = 0
            r6.L$1 = r0     // Catch: java.lang.Exception -> L56
            r6.L$2 = r9     // Catch: java.lang.Exception -> L56
            r6.label = r2     // Catch: java.lang.Exception -> L56
            r0 = 0
            java.lang.Object r0 = r8.AAY(r1, r6, r2, r0)     // Catch: java.lang.Exception -> L56
            if (r0 != r5) goto L5c
            return r5
        L56:
            r1 = move-exception
            java.lang.String r0 = "Failed to end session during teardown"
            X.CFK.A0A(r4, r0, r1)
        L5c:
            if (r7 == 0) goto L74
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Exception -> L6e
            r6.L$1 = r0     // Catch: java.lang.Exception -> L6e
            r6.L$2 = r0     // Catch: java.lang.Exception -> L6e
            r6.label = r3     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r7.Ahl(r9, r6)     // Catch: java.lang.Exception -> L6e
            if (r0 != r5) goto L74
            return r5
        L6e:
            r1 = move-exception
            java.lang.String r0 = "Failed to unregister user during teardown"
            X.CFK.A0A(r4, r0, r1)
        L74:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionTeardownKt.tearDownRealTimeSession(X.GTf, X.57m, java.lang.String, X.HtJ):java.lang.Object");
    }
}
