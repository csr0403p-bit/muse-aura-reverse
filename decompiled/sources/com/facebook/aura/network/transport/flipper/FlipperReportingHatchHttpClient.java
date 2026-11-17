package com.facebook.aura.network.transport.flipper;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass751;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseBody;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.network.transport.HatchVmProbeResult;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class FlipperReportingHatchHttpClient implements HatchHttpClient {
    public final HatchHttpClient delegate;
    public final FlipperHttpReporter reporter;

    @DebugMetadata(c = "com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient", f = "FlipperReportingHatchHttpClient.kt", l = {40, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlipperReportingHatchHttpClient.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient", f = "FlipperReportingHatchHttpClient.kt", l = {102, 109, 113}, m = "executeStreaming", v = 2)
    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeStreaming$1, reason: invalid class name and case insensitive filesystem */
    public final class C127341 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C127341(HtJ<? super C127341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlipperReportingHatchHttpClient.this.executeStreaming(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeVmProbe$2", f = "FlipperReportingHatchHttpClient.kt", l = {131}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeVmProbe$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super HatchVmProbeResult>, Object> {
        public final /* synthetic */ HatchVmProbeAuthProvider $authProvider;
        public final /* synthetic */ String $authToken;
        public final /* synthetic */ List<HatchHttpRequest> $requests;
        public final /* synthetic */ HatchVmProbeResponseObserver $responseObserver;
        public final /* synthetic */ String $vmUrl;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$vmUrl = str;
            this.$authToken = str2;
            this.$requests = list;
            this.$authProvider = hatchVmProbeAuthProvider;
            this.$responseObserver = hatchVmProbeResponseObserver;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return FlipperReportingHatchHttpClient.this.new AnonymousClass2(this.$vmUrl, this.$authToken, this.$requests, this.$authProvider, this.$responseObserver, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpClient hatchHttpClient = FlipperReportingHatchHttpClient.this.delegate;
                String str = this.$vmUrl;
                String str2 = this.$authToken;
                List<HatchHttpRequest> list = this.$requests;
                HatchVmProbeAuthProvider hatchVmProbeAuthProvider = this.$authProvider;
                HatchVmProbeResponseObserver hatchVmProbeResponseObserver = this.$responseObserver;
                this.label = 1;
                obj = hatchHttpClient.executeVmProbe(str, str2, list, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super HatchVmProbeResult> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient", f = "FlipperReportingHatchHttpClient.kt", l = {138, 149}, m = "executeVmProbeWithReporting", v = 2)
    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeVmProbeWithReporting$1, reason: invalid class name and case insensitive filesystem */
    public final class C127351 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C127351(HtJ<? super C127351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlipperReportingHatchHttpClient.this.executeVmProbeWithReporting(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient", f = "FlipperReportingHatchHttpClient.kt", l = {69, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 81}, m = "executeWithBearer", v = 2)
    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeWithBearer$1, reason: invalid class name and case insensitive filesystem */
    public final class C127361 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C127361(HtJ<? super C127361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlipperReportingHatchHttpClient.this.executeWithBearer(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient", f = "FlipperReportingHatchHttpClient.kt", l = {232, 239, 243}, m = "openResponseStream", v = 2)
    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$1, reason: invalid class name and case insensitive filesystem */
    public final class C127371 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127371(HtJ<? super C127371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlipperReportingHatchHttpClient.this.openResponseStream(null, this);
        }
    }

    /* renamed from: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$2, reason: invalid class name and case insensitive filesystem */
    public final class C127382 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchHttpResponseStream $response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127382(HatchHttpResponseStream hatchHttpResponseStream) {
            super(0);
            this.$response = hatchHttpResponseStream;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$response.close();
        }
    }

    public FlipperReportingHatchHttpClient(HatchHttpClient hatchHttpClient) {
        C7384Etj.A0Y(hatchHttpClient, 0);
        this.delegate = hatchHttpClient;
        this.reporter = new FlipperHttpReporter();
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object executeVmProbe(String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
        return executeVmProbeWithReporting(list, new AnonymousClass2(str, str2, list, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, null), htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public void preconnect(String str) {
        C7384Etj.A0Y(str, 0);
        this.delegate.preconnect(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.facebook.aura.network.transport.HatchVmProbeResult] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeVmProbeWithReporting(java.util.List<com.facebook.aura.network.transport.HatchHttpRequest> r12, X.G0U<? super X.HtJ<? super com.facebook.aura.network.transport.HatchVmProbeResult>, ? extends java.lang.Object> r13, X.HtJ<? super com.facebook.aura.network.transport.HatchVmProbeResult> r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.executeVmProbeWithReporting(java.util.List, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.facebook.aura.network.transport.HatchHttpRequest r8, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.AnonymousClass1
            if (r0 == 0) goto L2c
            r6 = r9
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$execute$1 r6 = (com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r6.label
            r1 = 3
            r0 = 2
            r2 = 1
            if (r3 == 0) goto L55
            if (r3 == r2) goto L51
            if (r3 == r0) goto L51
            if (r3 != r1) goto L49
            java.lang.Object r3 = r6.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r6.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r0 = (com.facebook.aura.network.transport.HatchHttpRequest) r0
            goto L32
        L2c:
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$execute$1 r6 = new com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$execute$1
            r6.<init>(r9)
            goto L12
        L32:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L38
            com.facebook.aura.network.transport.HatchHttpResponse r5 = (com.facebook.aura.network.transport.HatchHttpResponse) r5     // Catch: java.lang.Throwable -> L38
            goto L6e
        L38:
            r2 = move-exception
            com.facebook.aura.network.transport.flipper.FlipperHttpReporter r1 = r7.reporter
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L45
            java.lang.String r0 = r2.toString()
        L45:
            r1.reportError(r3, r0)
            throw r2
        L49:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L51:
            X.Hwg.A00(r5)
            return r5
        L55:
            X.Hwg.A00(r5)
            boolean r0 = r8.skipBodyObserver
            if (r0 != 0) goto L60
            java.lang.Class<X.751> r0 = X.AnonymousClass751.class
            monitor-enter(r0)
            monitor-exit(r0)
        L60:
            com.facebook.aura.network.transport.HatchHttpClient r1 = r7.delegate
            r0 = 0
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r0 = r1.execute(r8, r6)
            if (r0 != r4) goto L76
            return r4
        L6e:
            boolean r0 = r0.skipBodyObserver
            r0 = r0 ^ 1
            com.facebook.aura.network.transport.HatchHttpResponse r0 = r7.reportResponseAndRestoreBody(r3, r5, r0)
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.execute(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeStreaming(com.facebook.aura.network.transport.HatchHttpRequest r8, java.io.OutputStream r9, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.C127341
            if (r0 == 0) goto L28
            r6 = r10
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeStreaming$1 r6 = (com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.C127341) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r6.label
            r1 = 3
            r0 = 2
            r2 = 1
            if (r3 == 0) goto L57
            if (r3 == r2) goto L53
            if (r3 == r0) goto L53
            if (r3 != r1) goto L4e
            java.lang.Object r3 = r6.L$2
            java.lang.String r3 = (java.lang.String) r3
            goto L2e
        L28:
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeStreaming$1 r6 = new com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeStreaming$1
            r6.<init>(r10)
            goto L12
        L2e:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L3d
            com.facebook.aura.network.transport.HatchHttpResponse r5 = (com.facebook.aura.network.transport.HatchHttpResponse) r5     // Catch: java.lang.Throwable -> L3d
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.headers
            X.AnonymousClass003.A0w(r3, r0)
            java.lang.Class<X.751> r0 = X.AnonymousClass751.class
            monitor-enter(r0)
            monitor-exit(r0)
            return r5
        L3d:
            r2 = move-exception
            com.facebook.aura.network.transport.flipper.FlipperHttpReporter r1 = r7.reporter
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L4a
            java.lang.String r0 = r2.toString()
        L4a:
            r1.reportError(r3, r0)
            throw r2
        L4e:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L53:
            X.Hwg.A00(r5)
            return r5
        L57:
            X.Hwg.A00(r5)
            boolean r0 = r8.skipBodyObserver
            if (r0 != 0) goto L62
            java.lang.Class<X.751> r0 = X.AnonymousClass751.class
            monitor-enter(r0)
            monitor-exit(r0)
        L62:
            com.facebook.aura.network.transport.HatchHttpClient r1 = r7.delegate
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r2
            java.lang.Object r0 = r1.executeStreaming(r8, r9, r6)
            if (r0 != r4) goto L72
            return r4
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.executeStreaming(com.facebook.aura.network.transport.HatchHttpRequest, java.io.OutputStream, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object executeWithBearer(com.facebook.aura.network.transport.HatchHttpRequest r8, java.lang.String r9, java.lang.String r10, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.C127361
            if (r0 == 0) goto L2c
            r5 = r11
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeWithBearer$1 r5 = (com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.C127361) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r6 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r5.label
            r1 = 3
            r0 = 2
            r2 = 1
            if (r3 == 0) goto L65
            if (r3 == r2) goto L61
            if (r3 == r0) goto L61
            if (r3 != r1) goto L5c
            java.lang.Object r3 = r5.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r5.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r0 = (com.facebook.aura.network.transport.HatchHttpRequest) r0
            goto L32
        L2c:
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeWithBearer$1 r5 = new com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$executeWithBearer$1
            r5.<init>(r11)
            goto L12
        L32:
            X.Hwg.A00(r6)     // Catch: java.lang.Throwable -> L4b
            com.facebook.aura.network.transport.HatchHttpResponse r6 = (com.facebook.aura.network.transport.HatchHttpResponse) r6     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto L42
            com.facebook.aura.network.transport.flipper.FlipperHttpReporter r1 = r7.reporter
            java.lang.String r0 = "Explicit bearer is unsupported"
            r1.reportError(r3, r0)
            r0 = 0
            return r0
        L42:
            boolean r0 = r0.skipBodyObserver
            r0 = r0 ^ 1
            com.facebook.aura.network.transport.HatchHttpResponse r0 = r7.reportResponseAndRestoreBody(r3, r6, r0)
            return r0
        L4b:
            r2 = move-exception
            com.facebook.aura.network.transport.flipper.FlipperHttpReporter r1 = r7.reporter
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L58
            java.lang.String r0 = r2.toString()
        L58:
            r1.reportError(r3, r0)
            throw r2
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L61:
            X.Hwg.A00(r6)
            return r6
        L65:
            X.Hwg.A00(r6)
            boolean r0 = r8.skipBodyObserver
            if (r0 != 0) goto L70
            java.lang.Class<X.751> r0 = X.AnonymousClass751.class
            monitor-enter(r0)
            monitor-exit(r0)
        L70:
            com.facebook.aura.network.transport.HatchHttpClient r1 = r7.delegate
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r1.executeWithBearer(r8, r9, r10, r5)
            if (r0 != r4) goto L82
            return r4
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.executeWithBearer(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public Object openDuplexStream(HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
        return this.delegate.openDuplexStream(hatchHttpRequest, hatchDuplexResponseHandler, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object openResponseStream(com.facebook.aura.network.transport.HatchHttpRequest r9, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponseStream> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.C127371
            if (r0 == 0) goto L2c
            r6 = r10
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$1 r6 = (com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.C127371) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r4 = r6.label
            r1 = 3
            r0 = 2
            r3 = 1
            if (r4 == 0) goto L52
            if (r4 == r3) goto L4e
            if (r4 == r0) goto L4e
            if (r4 != r1) goto L49
            java.lang.Object r4 = r6.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r6.L$0
            com.facebook.aura.network.transport.HatchHttpRequest r0 = (com.facebook.aura.network.transport.HatchHttpRequest) r0
            goto L32
        L2c:
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$1 r6 = new com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$1
            r6.<init>(r10)
            goto L12
        L32:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L38
            com.facebook.aura.network.transport.HatchHttpResponseStream r2 = (com.facebook.aura.network.transport.HatchHttpResponseStream) r2     // Catch: java.lang.Throwable -> L38
            goto L6b
        L38:
            r2 = move-exception
            com.facebook.aura.network.transport.flipper.FlipperHttpReporter r1 = r8.reporter
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L45
            java.lang.String r0 = r2.toString()
        L45:
            r1.reportError(r4, r0)
            throw r2
        L49:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L4e:
            X.Hwg.A00(r2)
            return r2
        L52:
            X.Hwg.A00(r2)
            boolean r0 = r9.skipBodyObserver
            if (r0 != 0) goto L5d
            java.lang.Class<X.751> r0 = X.AnonymousClass751.class
            monitor-enter(r0)
            monitor-exit(r0)
        L5d:
            com.facebook.aura.network.transport.HatchHttpClient r1 = r8.delegate
            r0 = 0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r2 = r1.openResponseStream(r9, r6)
            if (r2 != r5) goto L9a
            return r5
        L6b:
            java.io.InputStream r3 = r2.body
            if (r3 == 0) goto L9b
            boolean r0 = com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClientKt.shouldCaptureStreamBody(r0, r2)
            if (r0 == 0) goto L9b
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$reportingBody$1 r1 = new com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$reportingBody$1
            r1.<init>(r8, r4, r2)
            r0 = 4194304(0x400000, float:5.877472E-39)
            com.facebook.aura.network.transport.flipper.FlipperCapturingInputStream r6 = new com.facebook.aura.network.transport.flipper.FlipperCapturingInputStream
            r6.<init>(r3, r0, r1)
            int r3 = r2.statusCode
            java.lang.String r4 = r2.statusMessage
            java.util.Map<java.lang.String, java.lang.String> r5 = r2.headers
            java.lang.String r7 = r2.errorMessage
            boolean r8 = r2.isSuccessful
            java.lang.Throwable r9 = r2.cause
            com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$2 r10 = new com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient$openResponseStream$2
            r10.<init>(r2)
            X.AnonymousClass003.A0x(r4, r5)
            com.facebook.aura.network.transport.HatchHttpResponseStream r2 = new com.facebook.aura.network.transport.HatchHttpResponseStream
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L9a:
            return r2
        L9b:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.headers
            X.AnonymousClass003.A0w(r4, r0)
            java.lang.Class<X.751> r0 = X.AnonymousClass751.class
            monitor-enter(r0)
            monitor-exit(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.flipper.FlipperReportingHatchHttpClient.openResponseStream(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    private final HatchHttpResponse reportResponseAndRestoreBody(String str, HatchHttpResponse hatchHttpResponse, boolean z) {
        InputStream inputStream;
        HatchHttpResponseBody hatchHttpResponseBodyBody = hatchHttpResponse.body();
        if (hatchHttpResponseBodyBody == null || (inputStream = hatchHttpResponseBodyBody.stream) == null) {
            AnonymousClass003.A0w(str, hatchHttpResponse.headers);
            synchronized (AnonymousClass751.class) {
            }
            return hatchHttpResponse;
        }
        try {
            CapturedBody upTo = FlipperReportingHatchHttpClientKt.readUpTo(inputStream, 50331648L);
            InputStream inputStream2 = upTo.tail;
            AnonymousClass003.A0w(str, hatchHttpResponse.headers);
            synchronized (AnonymousClass751.class) {
            }
            byte[] bArr = upTo.prefix;
            return FlipperReportingHatchHttpClientKt.withBody(hatchHttpResponse, inputStream2 == null ? new ByteArrayInputStream(bArr) : new SequenceInputStream(new ByteArrayInputStream(bArr), upTo.tail));
        } catch (Throwable unused) {
            AnonymousClass003.A0w(str, hatchHttpResponse.headers);
            synchronized (AnonymousClass751.class) {
                return hatchHttpResponse;
            }
        }
    }
}
