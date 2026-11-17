package com.facebook.aura.devices.link.ordering;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public abstract class HatchLinkOrderStatusResolverKt {
    public static final long STATUS_INITIAL_BACKOFF_MS = 1000;
    public static final int STATUS_MAX_ATTEMPTS = 3;

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt", f = "HatchLinkOrderStatusResolver.kt", l = {18, 24}, m = "resolveCreatedOrderStatus", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt$resolveCreatedOrderStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLinkOrderStatusResolverKt.resolveCreatedOrderStatus(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7 >= r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006b -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveCreatedOrderStatus(com.facebook.aura.devices.link.ordering.HatchLinkOrderResult r9, X.G0V<? super java.lang.String, ? super X.HtJ<? super com.facebook.aura.devices.link.ordering.HatchLinkOrderResult>, ? extends java.lang.Object> r10, X.HtJ<? super com.facebook.aura.devices.link.ordering.HatchLinkOrderResult> r11) {
        /*
            boolean r0 = r11 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt.AnonymousClass1
            if (r0 == 0) goto L8a
            r4 = r11
            com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt$resolveCreatedOrderStatus$1 r4 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L80
            if (r0 == r2) goto L6e
            if (r0 != r3) goto L91
            int r8 = r4.I$1
            int r6 = r4.I$0
            java.lang.Object r10 = r4.L$1
            X.G0V r10 = (X.G0V) r10
            java.lang.Object r9 = r4.L$0
            com.facebook.aura.devices.link.ordering.HatchLinkOrderResult r9 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderResult) r9
            X.Hwg.A00(r1)
        L2f:
            int r7 = r8 + 1
            if (r7 >= r6) goto L96
        L33:
            r0 = r9
            com.facebook.aura.devices.link.ordering.HatchLinkOrderResult$Success r0 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderResult.Success) r0
            com.facebook.aura.devices.link.ordering.HatchLinkOrder r0 = r0.order
            java.lang.String r0 = r0.orderId
            r4.L$0 = r9
            r4.L$1 = r10
            r4.I$0 = r6
            r4.I$1 = r7
            r4.I$2 = r7
            r4.label = r2
            java.lang.Object r1 = r10.invoke(r0, r4)
            if (r1 == r5) goto L90
            r8 = r7
        L4d:
            boolean r0 = r1 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderResult.Success
            if (r0 == 0) goto L52
            return r1
        L52:
            boolean r0 = r1 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderResult.Rejected
            if (r0 != 0) goto L96
            if (r7 >= r3) goto L2f
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 << r7
            r4.L$0 = r9
            r4.L$1 = r10
            r4.I$0 = r6
            r4.I$1 = r8
            r4.I$2 = r7
            r4.label = r3
            java.lang.Object r0 = X.C7Bq.A01(r0, r4)
            if (r0 != r5) goto L2f
            return r5
        L6e:
            int r7 = r4.I$2
            int r8 = r4.I$1
            int r6 = r4.I$0
            java.lang.Object r10 = r4.L$1
            X.G0V r10 = (X.G0V) r10
            java.lang.Object r9 = r4.L$0
            com.facebook.aura.devices.link.ordering.HatchLinkOrderResult r9 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderResult) r9
            X.Hwg.A00(r1)
            goto L4d
        L80:
            X.Hwg.A00(r1)
            boolean r0 = r9 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderResult.Success
            if (r0 == 0) goto L96
            r6 = 3
            r7 = 0
            goto L33
        L8a:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt$resolveCreatedOrderStatus$1 r4 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt$resolveCreatedOrderStatus$1
            r4.<init>(r11)
            goto L12
        L90:
            return r5
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L96:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderStatusResolverKt.resolveCreatedOrderStatus(com.facebook.aura.devices.link.ordering.HatchLinkOrderResult, X.G0V, X.HtJ):java.lang.Object");
    }
}
