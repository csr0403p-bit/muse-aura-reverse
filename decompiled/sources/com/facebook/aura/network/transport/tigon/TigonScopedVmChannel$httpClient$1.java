package com.facebook.aura.network.transport.tigon;

import X.HtJ;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.network.transport.HatchVmProbeResult;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes5.dex */
public final class TigonScopedVmChannel$httpClient$1 implements HatchHttpClient {
    public final /* synthetic */ TigonScopedVmChannel this$0;

    public TigonScopedVmChannel$httpClient$1(TigonScopedVmChannel tigonScopedVmChannel) {
        this.this$0 = tigonScopedVmChannel;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0072: INVOKE (r4 I:com.facebook.aura.network.transport.tigon.TigonScopedVmChannel) STATIC call: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel.access$leaveInFlight(com.facebook.aura.network.transport.tigon.TigonScopedVmChannel):void A[MD:(com.facebook.aura.network.transport.tigon.TigonScopedVmChannel):void (m)] (LINE:114), block:B:28:0x0072 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.facebook.aura.network.transport.HatchHttpRequest r9, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$execute$1
            if (r0 == 0) goto L22
            r7 = r10
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$execute$1 r7 = (com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$execute$1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 != r5) goto L28
            java.lang.Object r4 = r7.L$1
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel r4 = (com.facebook.aura.network.transport.tigon.TigonScopedVmChannel) r4
            goto L5c
        L22:
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$execute$1 r7 = new com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$execute$1
            r7.<init>(r8, r10)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r0)
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel r4 = r8.this$0
            java.util.concurrent.atomic.AtomicInteger r0 = r4.inFlight
            r0.incrementAndGet()
            boolean r0 = r4.isOpen()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L48
            java.lang.String r0 = "scoped_vm_channel.not_open"
            java.io.IOException r0 = X.BV4.A0K(r0)     // Catch: java.lang.Throwable -> L71
            com.facebook.aura.network.transport.HatchHttpResponse r0 = com.facebook.aura.network.transport.tigon.TigonHatchHttpClientKt.transportFailureResponse(r0)     // Catch: java.lang.Throwable -> L71
            goto L6d
        L48:
            com.facebook.aura.network.transport.tigon.TigonHatchHttpClient r3 = r4.client     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = r4.bearer     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r4.vmHost     // Catch: java.lang.Throwable -> L71
            r0 = 0
            r7.L$0 = r0     // Catch: java.lang.Throwable -> L71
            r7.L$1 = r4     // Catch: java.lang.Throwable -> L71
            r7.label = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r3.executeWithBearer(r9, r2, r1, r7)     // Catch: java.lang.Throwable -> L71
            if (r0 != r6) goto L5f
            return r6
        L5c:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L71
        L5f:
            com.facebook.aura.network.transport.HatchHttpResponse r0 = (com.facebook.aura.network.transport.HatchHttpResponse) r0     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L6d
            java.lang.String r0 = "scoped_vm_channel.wrong_host"
            java.io.IOException r0 = X.BV4.A0K(r0)     // Catch: java.lang.Throwable -> L71
            com.facebook.aura.network.transport.HatchHttpResponse r0 = com.facebook.aura.network.transport.tigon.TigonHatchHttpClientKt.transportFailureResponse(r0)     // Catch: java.lang.Throwable -> L71
        L6d:
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel.access$leaveInFlight(r4)
            return r0
        L71:
            r0 = move-exception
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel.access$leaveInFlight(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1.execute(com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[DONT_GENERATE] */
    @Override // com.facebook.aura.network.transport.HatchHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object openDuplexStream(com.facebook.aura.network.transport.HatchHttpRequest r12, com.facebook.aura.network.transport.HatchDuplexResponseHandler r13, X.HtJ<? super com.facebook.aura.network.transport.HatchDuplexHttpStream> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$openDuplexStream$1
            if (r0 == 0) goto L22
            r10 = r14
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$openDuplexStream$1 r10 = (com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$openDuplexStream$1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r1 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            java.lang.Object r2 = r10.L$2
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$InFlightStream r2 = (com.facebook.aura.network.transport.tigon.TigonScopedVmChannel.InFlightStream) r2
            goto L73
        L22:
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$openDuplexStream$1 r10 = new com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1$openDuplexStream$1
            r10.<init>(r11, r14)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel r0 = r11.this$0
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$InFlightStream r2 = new com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$InFlightStream
            r2.<init>()
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel r0 = r11.this$0
            java.util.concurrent.atomic.AtomicInteger r0 = r0.inFlight
            r0.incrementAndGet()
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel r0 = r11.this$0     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L56
            java.lang.String r0 = "scoped_vm_channel.not_open"
            java.io.IOException r0 = X.BV4.A0K(r0)     // Catch: java.lang.Throwable -> L84
            com.facebook.aura.network.transport.HatchHttpResponse r0 = com.facebook.aura.network.transport.tigon.TigonHatchHttpClientKt.transportFailureResponse(r0)     // Catch: java.lang.Throwable -> L84
            com.facebook.aura.network.transport.tigon.FailedTigonDuplexHttpStream r1 = new com.facebook.aura.network.transport.tigon.FailedTigonDuplexHttpStream     // Catch: java.lang.Throwable -> L84
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            goto L78
        L56:
            com.facebook.aura.network.transport.tigon.TigonScopedVmChannel r0 = r11.this$0     // Catch: java.lang.Throwable -> L84
            com.facebook.aura.network.transport.tigon.TigonHatchHttpClient r5 = r0.client     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = r0.bearer     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r0.vmHost     // Catch: java.lang.Throwable -> L84
            com.facebook.aura.network.transport.HatchDuplexResponseHandler r9 = r2.handler(r13)     // Catch: java.lang.Throwable -> L84
            r0 = 0
            r10.L$0 = r0     // Catch: java.lang.Throwable -> L84
            r10.L$1 = r0     // Catch: java.lang.Throwable -> L84
            r10.L$2 = r2     // Catch: java.lang.Throwable -> L84
            r10.label = r3     // Catch: java.lang.Throwable -> L84
            r6 = r12
            java.lang.Object r1 = r5.openDuplexStreamWithBearer(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L84
            if (r1 != r4) goto L76
            return r4
        L73:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L84
        L76:
            com.facebook.aura.network.transport.HatchDuplexHttpStream r1 = (com.facebook.aura.network.transport.HatchDuplexHttpStream) r1     // Catch: java.lang.Throwable -> L84
        L78:
            boolean r0 = r1 instanceof com.facebook.aura.network.transport.tigon.FailedTigonDuplexHttpStream
            if (r0 == 0) goto L7f
            r2.end()
        L7f:
            com.facebook.aura.network.transport.HatchDuplexHttpStream r0 = r2.wrap(r1)
            return r0
        L84:
            r0 = move-exception
            r2.end()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.tigon.TigonScopedVmChannel$httpClient$1.openDuplexStream(com.facebook.aura.network.transport.HatchHttpRequest, com.facebook.aura.network.transport.HatchDuplexResponseHandler, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public /* bridge */ Object executeStreaming(HatchHttpRequest hatchHttpRequest, OutputStream outputStream, HtJ<? super HatchHttpResponse> htJ) {
        return HatchHttpClient.CC.executeStreaming$suspendImpl(this, hatchHttpRequest, outputStream, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public /* bridge */ Object openResponseStream(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponseStream> htJ) {
        return HatchHttpClient.CC.openResponseStream$suspendImpl(this, hatchHttpRequest, htJ);
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public /* bridge */ void preconnect(String str) {
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public /* bridge */ Object executeWithBearer(HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ<? super HatchHttpResponse> htJ) {
        return null;
    }

    @Override // com.facebook.aura.network.transport.HatchHttpClient
    public /* bridge */ Object executeVmProbe(String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
        return null;
    }
}
