package com.facebook.aura.network.transport.tigon;

import X.BV4;
import X.C27i;
import X.C2zT;
import X.C3cG;
import X.C8eM;
import X.GCQ;
import X.GCV;
import X.HtJ;
import X.HzP;
import X.HzR;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class ScopedNoiseIdentityProbe {
    public static final ScopedNoiseIdentityProbe INSTANCE = new ScopedNoiseIdentityProbe();
    public static final HzR<Integer> availableResourceSlots;
    public static final C8eM resourceCapacity;

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe", f = "ScopedNoiseIdentityProbe.kt", l = {93}, m = "acquireResourceSlot", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$acquireResourceSlot$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScopedNoiseIdentityProbe.this.acquireResourceSlot(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe", f = "ScopedNoiseIdentityProbe.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 79}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C127391 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C127391(HtJ<? super C127391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScopedNoiseIdentityProbe.this.execute(null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe", f = "ScopedNoiseIdentityProbe.kt", l = {134, 155, 172}, m = "executeWithResourceSlot", v = 2)
    /* renamed from: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$executeWithResourceSlot$1, reason: invalid class name and case insensitive filesystem */
    public final class C127401 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
        public Object L$19;
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

        public C127401(HtJ<? super C127401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScopedNoiseIdentityProbe.this.executeWithResourceSlot(null, null, null, null, null, 0, this);
        }
    }

    static {
        int i = 0;
        int i2 = GCQ.A00;
        resourceCapacity = new C27i(5);
        GCV gcv = new GCV(5, null);
        while (!(gcv.AhZ(Integer.valueOf(i)) instanceof C2zT)) {
            i++;
            if (i >= 5) {
                availableResourceSlots = gcv;
                return;
            }
        }
        throw BV4.A0S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireResourceSlot(X.HtJ<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.AnonymousClass1
            if (r0 == 0) goto L3b
            r4 = r6
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$acquireResourceSlot$1 r4 = (com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4d
            X.Hwg.A00(r3)
        L20:
            X.HzR<java.lang.Integer> r0 = com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.availableResourceSlots
            java.lang.Object r1 = r0.AhX()
            boolean r0 = r1 instanceof X.C2zT
            if (r0 != 0) goto L41
            if (r1 == 0) goto L41
            return r1
        L2d:
            X.Hwg.A00(r3)
            X.8eM r0 = com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.resourceCapacity
            r4.label = r2
            java.lang.Object r0 = r0.A2u(r4)
            if (r0 != r1) goto L20
            return r1
        L3b:
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$acquireResourceSlot$1 r4 = new com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$acquireResourceSlot$1
            r4.<init>(r6)
            goto L12
        L41:
            X.8eM r0 = com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.resourceCapacity
            r0.release()
            java.lang.String r0 = "Scoped Noise probe resource slot unavailable after acquiring capacity"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.acquireResourceSlot(X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01ca -> B:45:0x01cf). Please report as a decompilation issue!!! */
    public final java.lang.Object executeWithResourceSlot(java.lang.String r32, java.lang.String r33, java.util.List<com.facebook.aura.network.transport.HatchHttpRequest> r34, com.facebook.aura.network.transport.HatchVmProbeAuthProvider r35, com.facebook.aura.network.transport.HatchVmProbeResponseObserver r36, int r37, X.HtJ<? super com.facebook.aura.network.transport.HatchVmProbeResult> r38) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.executeWithResourceSlot(java.lang.String, java.lang.String, java.util.List, com.facebook.aura.network.transport.HatchVmProbeAuthProvider, com.facebook.aura.network.transport.HatchVmProbeResponseObserver, int, X.HtJ):java.lang.Object");
    }

    private final void releaseResourceSlot(int i) {
        if (!(!(availableResourceSlots.AhZ(Integer.valueOf(i)) instanceof C2zT))) {
            throw C3cG.A0Q("Scoped Noise probe resource slot returned twice");
        }
        resourceCapacity.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r15, java.lang.String r16, java.util.List<com.facebook.aura.network.transport.HatchHttpRequest> r17, com.facebook.aura.network.transport.HatchVmProbeAuthProvider r18, com.facebook.aura.network.transport.HatchVmProbeResponseObserver r19, X.HtJ<? super com.facebook.aura.network.transport.HatchVmProbeResult> r20) {
        /*
            r14 = this;
            r3 = r20
            r13 = r19
            r12 = r18
            r11 = r17
            r10 = r16
            r9 = r15
            boolean r0 = r3 instanceof com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.C127391
            r8 = r14
            if (r0 == 0) goto L30
            r15 = r3
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$execute$1 r15 = (com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.C127391) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r15.label = r2
        L1e:
            java.lang.Object r1 = r15.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L3b
            if (r0 == r6) goto L96
            if (r0 != r4) goto L36
            int r14 = r15.I$0
            goto Lc9
        L30:
            com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$execute$1 r15 = new com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe$execute$1
            r15.<init>(r3)
            goto L1e
        L36:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3b:
            X.Hwg.A00(r1)
            java.lang.String r3 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.redactedGatewayUrlForLog(r9)
            boolean r7 = X.C7BY.A0j(r10)
            r2 = 0
            r0 = 16
            java.lang.String r1 = X.C60N.A00(r0)
            if (r7 == 0) goto L55
            java.lang.String r0 = "Skipping scoped Noise VM probe: missing auth token for "
            X.C3cG.A1G(r0, r3, r1)
            return r2
        L55:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L90
            boolean r0 = r11 instanceof java.util.Collection
            if (r0 == 0) goto L7a
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L7a
        L65:
            r15.L$0 = r9
            r15.L$1 = r10
            r15.L$2 = r11
            r15.L$3 = r12
            r15.L$4 = r13
            r15.L$5 = r2
            r15.label = r6
            java.lang.Object r1 = r14.acquireResourceSlot(r15)
            if (r1 != r5) goto Lad
            return r5
        L7a:
            java.util.Iterator r7 = r11.iterator()
        L7e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r7.next()
            com.facebook.aura.network.transport.HatchHttpRequest r0 = (com.facebook.aura.network.transport.HatchHttpRequest) r0
            boolean r0 = com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbeKt.isSupportedVmProbe(r0)
            if (r0 != 0) goto L7e
        L90:
            java.lang.String r0 = "Scoped Noise probe only supports GET /identity and GET /health for "
            X.C60O.A1P(r0, r3, r1)
            return r2
        L96:
            java.lang.Object r13 = r15.L$4
            com.facebook.aura.network.transport.HatchVmProbeResponseObserver r13 = (com.facebook.aura.network.transport.HatchVmProbeResponseObserver) r13
            java.lang.Object r12 = r15.L$3
            com.facebook.aura.network.transport.HatchVmProbeAuthProvider r12 = (com.facebook.aura.network.transport.HatchVmProbeAuthProvider) r12
            java.lang.Object r11 = r15.L$2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r15.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r15.L$0
            java.lang.String r9 = (java.lang.String) r9
            X.Hwg.A00(r1)
        Lad:
            int r14 = X.AnonymousClass001.A0F(r1)
            r0 = 0
            r15.L$0 = r0     // Catch: java.lang.Throwable -> Ld2
            r15.L$1 = r0     // Catch: java.lang.Throwable -> Ld2
            r15.L$2 = r0     // Catch: java.lang.Throwable -> Ld2
            r15.L$3 = r0     // Catch: java.lang.Throwable -> Ld2
            r15.L$4 = r0     // Catch: java.lang.Throwable -> Ld2
            r15.L$5 = r0     // Catch: java.lang.Throwable -> Ld2
            r15.I$0 = r14     // Catch: java.lang.Throwable -> Ld2
            r15.label = r4     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r1 = r8.executeWithResourceSlot(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Ld2
            if (r1 != r5) goto Lcc
            return r5
        Lc9:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> Ld2
        Lcc:
            com.facebook.aura.network.transport.HatchVmProbeResult r1 = (com.facebook.aura.network.transport.HatchVmProbeResult) r1     // Catch: java.lang.Throwable -> Ld2
            r8.releaseResourceSlot(r14)
            return r1
        Ld2:
            r0 = move-exception
            r8.releaseResourceSlot(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.ScopedNoiseIdentityProbe.execute(java.lang.String, java.lang.String, java.util.List, com.facebook.aura.network.transport.HatchVmProbeAuthProvider, com.facebook.aura.network.transport.HatchVmProbeResponseObserver, X.HtJ):java.lang.Object");
    }
}
