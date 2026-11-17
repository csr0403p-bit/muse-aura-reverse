package com.facebook.aura.gateway;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchVmWakeApi {
    public static final int $stable = 0;
    public static final HatchVmWakeApi INSTANCE = new HatchVmWakeApi();

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmWakeApi", f = "HatchVmWakeApi.kt", l = {91}, m = "wakeVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmWakeApi$wakeVm$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmWakeApi.this.wakeVm(null, 0, null, null, null, null, this);
        }
    }

    public static /* synthetic */ Object wakeVm$default(HatchVmWakeApi hatchVmWakeApi, String str, int i, String str2, HatchVmWakeTrigger hatchVmWakeTrigger, Long l, Long l2, HtJ htJ, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            l = null;
        }
        if ((i2 & 32) != 0) {
            l2 = null;
        }
        return hatchVmWakeApi.wakeVm(str, i, str2, hatchVmWakeTrigger, l, l2, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[PHI: r7
  0x005f: PHI (r7v5 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v7 java.lang.Integer) binds: [B:17:0x004e, B:19:0x0053, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wakeVm(java.lang.String r17, int r18, java.lang.String r19, com.facebook.aura.gateway.HatchVmWakeTrigger r20, java.lang.Long r21, java.lang.Long r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmWakeApi.wakeVm(java.lang.String, int, java.lang.String, com.facebook.aura.gateway.HatchVmWakeTrigger, java.lang.Long, java.lang.Long, X.HtJ):java.lang.Object");
    }
}
