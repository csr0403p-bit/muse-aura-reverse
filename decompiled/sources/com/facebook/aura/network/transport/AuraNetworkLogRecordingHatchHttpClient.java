package com.facebook.aura.network.transport;

import X.C06H;
import X.C7384Etj;
import X.C7BY;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class AuraNetworkLogRecordingHatchHttpClient implements HatchHttpClient {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int TRANSPORT_FAILURE_STATUS = -1;

    @Deprecated
    public static final String VM_HOST_MARKER = "metaaivm.com";
    public final HatchHttpClient delegate;

    @DebugMetadata(c = "com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient", f = "AuraNetworkLogRecordingHatchHttpClient.kt", l = {26}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraNetworkLogRecordingHatchHttpClient.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient", f = "AuraNetworkLogRecordingHatchHttpClient.kt", l = {59}, m = "executeStreaming", v = 2)
    /* renamed from: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeStreaming$1, reason: invalid class name and case insensitive filesystem */
    public final class C127261 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127261(HtJ<? super C127261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraNetworkLogRecordingHatchHttpClient.this.executeStreaming(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient", f = "AuraNetworkLogRecordingHatchHttpClient.kt", l = {78}, m = "executeVmProbe", v = 2)
    /* renamed from: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeVmProbe$1, reason: invalid class name and case insensitive filesystem */
    public final class C127271 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C127271(HtJ<? super C127271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraNetworkLogRecordingHatchHttpClient.this.executeVmProbe(null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient", f = "AuraNetworkLogRecordingHatchHttpClient.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "executeWithBearer", v = 2)
    /* renamed from: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeWithBearer$1, reason: invalid class name and case insensitive filesystem */
    public final class C127281 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C127281(HtJ<? super C127281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraNetworkLogRecordingHatchHttpClient.this.executeWithBearer(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient", f = "AuraNetworkLogRecordingHatchHttpClient.kt", l = {102}, m = "openResponseStream", v = 2)
    /* renamed from: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$openResponseStream$1, reason: invalid class name and case insensitive filesystem */
    public final class C127291 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C127291(HtJ<? super C127291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraNetworkLogRecordingHatchHttpClient.this.openResponseStream(null, this);
        }
    }

    public AuraNetworkLogRecordingHatchHttpClient(HatchHttpClient hatchHttpClient) {
        C7384Etj.A0Y(hatchHttpClient, 0);
        this.delegate = hatchHttpClient;
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public void preconnect(String str) {
        C7384Etj.A0Y(str, 0);
        this.delegate.preconnect(str);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void record(String str, String str2, long j, int i) {
        if (C7BY.A0q(str2, "metaaivm.com", false)) {
            AuraNetworkLogRecorder.INSTANCE.record(new AuraNetworkLogEntry(j, str, str2, i, System.currentTimeMillis() - j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient] */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.facebook.aura.network.transport.HatchHttpRequest r8, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.AnonymousClass1
            if (r0 == 0) goto L24
            r6 = r9
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$execute$1 r6 = (com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            long r1 = r6.J$0
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r8 = (com.facebook.aura.network.transport.HatchHttpRequest) r8
            goto L48
        L24:
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$execute$1 r6 = new com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$execute$1
            r6.<init>(r9)
            goto L12
        L2a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r0)
            throw r3
        L32:
            X.Hwg.A00(r5)
            long r1 = java.lang.System.currentTimeMillis()
            com.facebook.aura.network.transport.HatchHttpClient r0 = r7.delegate     // Catch: java.lang.Throwable -> L53
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L53
            r6.J$0 = r1     // Catch: java.lang.Throwable -> L53
            r6.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = r0.execute(r8, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 != r4) goto L4b
            return r4
        L48:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L53
        L4b:
            com.facebook.aura.network.transport.HatchHttpResponse r5 = (com.facebook.aura.network.transport.HatchHttpResponse) r5     // Catch: java.lang.Throwable -> L53
            int r0 = r5.statusCode
            r7.record(r8, r1, r0)
            return r5
        L53:
            r3 = move-exception
            r0 = -1
            r7.record(r8, r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.execute(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient] */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeStreaming(com.facebook.aura.network.transport.HatchHttpRequest r8, java.io.OutputStream r9, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127261
            if (r0 == 0) goto L24
            r6 = r10
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeStreaming$1 r6 = (com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127261) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r3 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L2a
            long r1 = r6.J$0
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r8 = (com.facebook.aura.network.transport.HatchHttpRequest) r8
            goto L48
        L24:
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeStreaming$1 r6 = new com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeStreaming$1
            r6.<init>(r10)
            goto L12
        L2a:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
            throw r3
        L2f:
            X.Hwg.A00(r3)
            long r1 = java.lang.System.currentTimeMillis()
            com.facebook.aura.network.transport.HatchHttpClient r3 = r7.delegate     // Catch: java.lang.Throwable -> L53
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L53
            r0 = 0
            r6.L$1 = r0     // Catch: java.lang.Throwable -> L53
            r6.J$0 = r1     // Catch: java.lang.Throwable -> L53
            r6.label = r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r3 = r3.executeStreaming(r8, r9, r6)     // Catch: java.lang.Throwable -> L53
            if (r3 != r5) goto L4b
            return r5
        L48:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L53
        L4b:
            com.facebook.aura.network.transport.HatchHttpResponse r3 = (com.facebook.aura.network.transport.HatchHttpResponse) r3     // Catch: java.lang.Throwable -> L53
            int r0 = r3.statusCode
            r7.record(r8, r1, r0)
            return r3
        L53:
            r3 = move-exception
            r0 = -1
            r7.record(r8, r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.executeStreaming(com.facebook.aura.network.transport.HatchHttpRequest, java.io.OutputStream, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Type inference failed for: r14v3, types: [long] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeVmProbe(java.lang.String r15, java.lang.String r16, java.util.List<com.facebook.aura.network.transport.HatchHttpRequest> r17, com.facebook.aura.network.transport.HatchVmProbeAuthProvider r18, com.facebook.aura.network.transport.HatchVmProbeResponseObserver r19, X.HtJ<? super com.facebook.aura.network.transport.HatchVmProbeResult> r20) {
        /*
            r14 = this;
            r3 = r20
            r7 = r17
            r5 = r15
            boolean r0 = r3 instanceof com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127271
            r11 = r14
            if (r0 == 0) goto L2e
            r10 = r3
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeVmProbe$1 r10 = (com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127271) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r10.label = r2
        L18:
            java.lang.Object r3 = r10.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L34
            long r14 = r10.J$0
            java.lang.Object r7 = r10.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r10.L$0
            java.lang.String r5 = (java.lang.String) r5
            goto L5e
        L2e:
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeVmProbe$1 r10 = new com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeVmProbe$1
            r10.<init>(r3)
            goto L18
        L34:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L39:
            X.Hwg.A00(r3)
            long r14 = java.lang.System.currentTimeMillis()
            com.facebook.aura.network.transport.HatchHttpClient r4 = r11.delegate     // Catch: java.lang.Throwable -> L64
            r10.L$0 = r5     // Catch: java.lang.Throwable -> L64
            r0 = 0
            r10.L$1 = r0     // Catch: java.lang.Throwable -> L64
            r10.L$2 = r7     // Catch: java.lang.Throwable -> L64
            r10.L$3 = r0     // Catch: java.lang.Throwable -> L64
            r10.L$4 = r0     // Catch: java.lang.Throwable -> L64
            r10.J$0 = r14     // Catch: java.lang.Throwable -> L64
            r10.label = r1     // Catch: java.lang.Throwable -> L64
            r6 = r16
            r8 = r18
            r9 = r19
            java.lang.Object r3 = r4.executeVmProbe(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L64
            if (r3 != r2) goto L61
            return r2
        L5e:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L64
        L61:
            com.facebook.aura.network.transport.HatchVmProbeResult r3 = (com.facebook.aura.network.transport.HatchVmProbeResult) r3     // Catch: java.lang.Throwable -> L64
            goto L82
        L64:
            r2 = move-exception
            java.util.Iterator r1 = r7.iterator()
        L69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r1.next()
            com.facebook.aura.network.transport.HatchHttpRequest r0 = (com.facebook.aura.network.transport.HatchHttpRequest) r0
            com.facebook.aura.network.transport.HatchHttpMethod r0 = r0.method
            java.lang.String r12 = r0.name()
            r16 = -1
            r13 = r5
            r11.record(r12, r13, r14, r16)
            goto L69
        L82:
            java.util.Iterator r4 = r7.iterator()
            r2 = 0
        L87:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r4.next()
            int r1 = r2 + 1
            if (r2 >= 0) goto L9d
            X.AbstractC0885AGm.A14()
            X.F60 r2 = X.F60.createAndThrow()
        L9c:
            throw r2
        L9d:
            com.facebook.aura.network.transport.HatchHttpRequest r0 = (com.facebook.aura.network.transport.HatchHttpRequest) r0
            com.facebook.aura.network.transport.HatchHttpMethod r0 = r0.method
            java.lang.String r12 = r0.name()
            if (r3 == 0) goto Lbd
            java.util.List<com.facebook.aura.network.transport.HatchHttpResponse> r0 = r3.responses
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r2, r0)
            com.facebook.aura.network.transport.HatchHttpResponse r0 = (com.facebook.aura.network.transport.HatchHttpResponse) r0
            if (r0 == 0) goto Lbd
            int r0 = r0.statusCode
        Lb5:
            r13 = r5
            r16 = r0
            r11.record(r12, r13, r14, r16)
            r2 = r1
            goto L87
        Lbd:
            r0 = -1
            goto Lb5
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.executeVmProbe(java.lang.String, java.lang.String, java.util.List, com.facebook.aura.network.transport.HatchVmProbeAuthProvider, com.facebook.aura.network.transport.HatchVmProbeResponseObserver, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeWithBearer(com.facebook.aura.network.transport.HatchHttpRequest r9, java.lang.String r10, java.lang.String r11, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127281
            if (r0 == 0) goto L25
            r7 = r12
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeWithBearer$1 r7 = (com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127281) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r2 = -1
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 != r5) goto L2b
            long r0 = r7.J$0
            java.lang.Object r9 = r7.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r9 = (com.facebook.aura.network.transport.HatchHttpRequest) r9
            goto L4b
        L25:
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeWithBearer$1 r7 = new com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$executeWithBearer$1
            r7.<init>(r12)
            goto L12
        L2b:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
            throw r3
        L30:
            X.Hwg.A00(r3)
            long r0 = java.lang.System.currentTimeMillis()
            com.facebook.aura.network.transport.HatchHttpClient r4 = r8.delegate     // Catch: java.lang.Throwable -> L58
            r7.L$0 = r9     // Catch: java.lang.Throwable -> L58
            r3 = 0
            r7.L$1 = r3     // Catch: java.lang.Throwable -> L58
            r7.L$2 = r3     // Catch: java.lang.Throwable -> L58
            r7.J$0 = r0     // Catch: java.lang.Throwable -> L58
            r7.label = r5     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r4.executeWithBearer(r9, r10, r11, r7)     // Catch: java.lang.Throwable -> L58
            if (r3 != r6) goto L4e
            return r6
        L4b:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L58
        L4e:
            com.facebook.aura.network.transport.HatchHttpResponse r3 = (com.facebook.aura.network.transport.HatchHttpResponse) r3     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L54
            int r2 = r3.statusCode
        L54:
            r8.record(r9, r0, r2)
            return r3
        L58:
            r3 = move-exception
            r8.record(r9, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.executeWithBearer(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object openDuplexStream(HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
        return this.delegate.openDuplexStream(hatchHttpRequest, hatchDuplexResponseHandler, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient] */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object openResponseStream(com.facebook.aura.network.transport.HatchHttpRequest r8, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponseStream> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127291
            if (r0 == 0) goto L24
            r6 = r9
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$openResponseStream$1 r6 = (com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.C127291) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L2a
            long r1 = r6.J$0
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r8 = (com.facebook.aura.network.transport.HatchHttpRequest) r8
            goto L45
        L24:
            com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$openResponseStream$1 r6 = new com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient$openResponseStream$1
            r6.<init>(r9)
            goto L12
        L2a:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
            throw r3
        L2f:
            X.Hwg.A00(r5)
            long r1 = java.lang.System.currentTimeMillis()
            com.facebook.aura.network.transport.HatchHttpClient r0 = r7.delegate     // Catch: java.lang.Throwable -> L50
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L50
            r6.J$0 = r1     // Catch: java.lang.Throwable -> L50
            r6.label = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r5 = r0.openResponseStream(r8, r6)     // Catch: java.lang.Throwable -> L50
            if (r5 != r4) goto L48
            return r4
        L45:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L50
        L48:
            com.facebook.aura.network.transport.HatchHttpResponseStream r5 = (com.facebook.aura.network.transport.HatchHttpResponseStream) r5     // Catch: java.lang.Throwable -> L50
            int r0 = r5.statusCode
            r7.record(r8, r1, r0)
            return r5
        L50:
            r3 = move-exception
            r0 = -1
            r7.record(r8, r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.AuraNetworkLogRecordingHatchHttpClient.openResponseStream(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    private final void record(HatchHttpRequest hatchHttpRequest, long j, int i) {
        record(hatchHttpRequest.method.name(), hatchHttpRequest.url, j, i);
    }
}
