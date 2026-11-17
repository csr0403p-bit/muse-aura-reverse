package com.facebook.aura.network.transport;

import X.AGH;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import java.io.OutputStream;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public interface HatchHttpClient {

    /* renamed from: com.facebook.aura.network.transport.HatchHttpClient$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object executeStreaming$suspendImpl(com.facebook.aura.network.transport.HatchHttpClient r9, com.facebook.aura.network.transport.HatchHttpRequest r10, java.io.OutputStream r11, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r12) throws java.io.IOException {
            /*
                boolean r0 = r12 instanceof com.facebook.aura.network.transport.HatchHttpClient.AnonymousClass1
                if (r0 == 0) goto L48
                r4 = r12
                com.facebook.aura.network.transport.HatchHttpClient$executeStreaming$1 r4 = (com.facebook.aura.network.transport.HatchHttpClient.AnonymousClass1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L48
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r3 = r4.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L35
                if (r0 != r1) goto L72
                java.lang.Object r11 = r4.L$2
                java.io.OutputStream r11 = (java.io.OutputStream) r11
                X.Hwg.A00(r3)
            L24:
                com.facebook.aura.network.transport.HatchHttpResponse r3 = (com.facebook.aura.network.transport.HatchHttpResponse) r3
                boolean r0 = r3.isSuccessful
                if (r0 == 0) goto L5c
                com.facebook.aura.network.transport.HatchHttpResponseBody r0 = r3.body()
                if (r0 == 0) goto L5c
                java.io.InputStream r2 = r0.stream
                if (r2 == 0) goto L5c
                goto L4e
            L35:
                X.Hwg.A00(r3)
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.L$2 = r11
                r4.label = r1
                java.lang.Object r3 = r9.execute(r10, r4)
                if (r3 != r2) goto L24
                return r2
            L48:
                com.facebook.aura.network.transport.HatchHttpClient$executeStreaming$1 r4 = new com.facebook.aura.network.transport.HatchHttpClient$executeStreaming$1
                r4.<init>(r12)
                goto L12
            L4e:
                X.F0H.A00(r2, r11)     // Catch: java.lang.Throwable -> L52
                goto L59
            L52:
                r1 = move-exception
                throw r1     // Catch: java.lang.Throwable -> L54
            L54:
                r0 = move-exception
                X.AbstractC7531Ezs.A00(r2, r1)
                throw r0
            L59:
                r2.close()
            L5c:
                com.facebook.aura.network.transport.HatchHttpResponse$Companion r4 = com.facebook.aura.network.transport.HatchHttpResponse.Companion
                int r5 = r3.statusCode
                java.lang.String r6 = r3.statusMessage
                java.util.Map<java.lang.String, java.lang.String> r7 = r3.headers
                java.lang.String r9 = r3.errorMessage
                boolean r10 = r3.isSuccessful
                com.facebook.aura.network.transport.HatchHttpCacheStatus r11 = r3.cacheStatus
                java.lang.Throwable r12 = r3.cause
                r8 = 0
                com.facebook.aura.network.transport.HatchHttpResponse r2 = r4.of(r5, r6, r7, r8, r9, r10, r11, r12)
                return r2
            L72:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.HatchHttpClient.CC.executeStreaming$suspendImpl(com.facebook.aura.network.transport.HatchHttpClient, com.facebook.aura.network.transport.HatchHttpRequest, java.io.OutputStream, X.HtJ):java.lang.Object");
        }

        public static /* synthetic */ Object executeVmProbe$default(HatchHttpClient hatchHttpClient, String str, String str2, List list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ htJ, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeVmProbe");
            }
            if ((i & 8) != 0) {
                hatchVmProbeAuthProvider = HatchVmProbeAuthProvider.Companion.Legacy;
            }
            if ((i & 16) != 0) {
                hatchVmProbeResponseObserver = HatchVmProbeResponseObserver.Companion.None;
            }
            return hatchHttpClient.executeVmProbe(str, str2, list, hatchVmProbeAuthProvider, hatchVmProbeResponseObserver, htJ);
        }

        public static /* synthetic */ Object openDuplexStream$suspendImpl(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
            return new FailedHatchDuplexHttpStream(HatchHttpResponse.Companion.of(-1, "", AGH.A0E(), null, "duplex streaming is not supported by this transport", false, HatchHttpCacheStatus.NETWORK, new UnsupportedOperationException("duplex streaming is not supported")));
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object openResponseStream$suspendImpl(com.facebook.aura.network.transport.HatchHttpClient r10, com.facebook.aura.network.transport.HatchHttpRequest r11, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponseStream> r12) {
            /*
                boolean r0 = r12 instanceof com.facebook.aura.network.transport.HatchHttpClient.C127301
                if (r0 == 0) goto L52
                r4 = r12
                com.facebook.aura.network.transport.HatchHttpClient$openResponseStream$1 r4 = (com.facebook.aura.network.transport.HatchHttpClient.C127301) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L52
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r3 = r4.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L41
                if (r0 != r1) goto L58
                X.Hwg.A00(r3)
            L20:
                com.facebook.aura.network.transport.HatchHttpResponse r3 = (com.facebook.aura.network.transport.HatchHttpResponse) r3
                com.facebook.aura.network.transport.HatchHttpResponseStream$Companion r4 = com.facebook.aura.network.transport.HatchHttpResponseStream.Companion
                int r5 = r3.statusCode
                java.lang.String r6 = r3.statusMessage
                java.util.Map<java.lang.String, java.lang.String> r7 = r3.headers
                com.facebook.aura.network.transport.HatchHttpResponseBody r0 = r3.body()
                if (r0 == 0) goto L3f
                java.io.InputStream r8 = r0.stream
            L32:
                java.lang.String r9 = r3.errorMessage
                boolean r10 = r3.isSuccessful
                java.lang.Throwable r11 = r3.cause
                com.facebook.aura.network.transport.HatchHttpResponseStream$Companion$of$1 r12 = com.facebook.aura.network.transport.HatchHttpResponseStream$Companion$of$1.INSTANCE
                com.facebook.aura.network.transport.HatchHttpResponseStream r0 = r4.of(r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
            L3f:
                r8 = 0
                goto L32
            L41:
                X.Hwg.A00(r3)
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.label = r1
                java.lang.Object r3 = r10.execute(r11, r4)
                if (r3 != r2) goto L20
                return r2
            L52:
                com.facebook.aura.network.transport.HatchHttpClient$openResponseStream$1 r4 = new com.facebook.aura.network.transport.HatchHttpClient$openResponseStream$1
                r4.<init>(r12)
                goto L12
            L58:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.transport.HatchHttpClient.CC.openResponseStream$suspendImpl(com.facebook.aura.network.transport.HatchHttpClient, com.facebook.aura.network.transport.HatchHttpRequest, X.HtJ):java.lang.Object");
        }

        public static void $default$preconnect(HatchHttpClient hatchHttpClient, String str) {
        }

        public static /* synthetic */ void access$preconnect$jd(HatchHttpClient hatchHttpClient, String str) {
        }

        public static Object $default$executeWithBearer(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ htJ) {
            return null;
        }

        public static /* synthetic */ Object access$executeWithBearer$jd(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ htJ) {
            return null;
        }

        public static /* synthetic */ Object executeWithBearer$suspendImpl(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ<? super HatchHttpResponse> htJ) {
            return null;
        }

        public static Object $default$executeVmProbe(HatchHttpClient hatchHttpClient, String str, String str2, List list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ htJ) {
            return null;
        }

        public static /* synthetic */ Object access$executeVmProbe$jd(HatchHttpClient hatchHttpClient, String str, String str2, List list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ htJ) {
            return null;
        }

        public static /* synthetic */ Object executeVmProbe$suspendImpl(HatchHttpClient hatchHttpClient, String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
            return null;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.HatchHttpClient", f = "HatchHttpClient.kt", l = {82}, m = "executeStreaming$suspendImpl", v = 2)
    /* renamed from: com.facebook.aura.network.transport.HatchHttpClient$executeStreaming$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CC.executeStreaming$suspendImpl(HatchHttpClient.this, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.transport.HatchHttpClient", f = "HatchHttpClient.kt", l = {104}, m = "openResponseStream$suspendImpl", v = 2)
    /* renamed from: com.facebook.aura.network.transport.HatchHttpClient$openResponseStream$1, reason: invalid class name and case insensitive filesystem */
    public final class C127301 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127301(HtJ<? super C127301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CC.openResponseStream$suspendImpl(HatchHttpClient.this, null, this);
        }
    }

    Object execute(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponse> htJ);

    Object executeStreaming(HatchHttpRequest hatchHttpRequest, OutputStream outputStream, HtJ<? super HatchHttpResponse> htJ);

    Object executeVmProbe(String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ);

    Object executeWithBearer(HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ<? super HatchHttpResponse> htJ);

    Object openDuplexStream(HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ);

    Object openResponseStream(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponseStream> htJ);

    void preconnect(String str);

    public abstract class DefaultImpls {
        @Deprecated
        public static void preconnect(HatchHttpClient hatchHttpClient, String str) {
            C7384Etj.A0Y(str, 1);
        }

        @Deprecated
        public static Object executeStreaming(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, OutputStream outputStream, HtJ<? super HatchHttpResponse> htJ) {
            return CC.executeStreaming$suspendImpl(hatchHttpClient, hatchHttpRequest, outputStream, htJ);
        }

        @Deprecated
        public static Object openDuplexStream(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, HatchDuplexResponseHandler hatchDuplexResponseHandler, HtJ<? super HatchDuplexHttpStream> htJ) {
            return CC.openDuplexStream$suspendImpl(hatchHttpClient, hatchHttpRequest, hatchDuplexResponseHandler, htJ);
        }

        @Deprecated
        public static Object openResponseStream(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, HtJ<? super HatchHttpResponseStream> htJ) {
            return CC.openResponseStream$suspendImpl(hatchHttpClient, hatchHttpRequest, htJ);
        }

        @Deprecated
        public static Object executeWithBearer(HatchHttpClient hatchHttpClient, HatchHttpRequest hatchHttpRequest, String str, String str2, HtJ<? super HatchHttpResponse> htJ) {
            return null;
        }

        @Deprecated
        public static Object executeVmProbe(HatchHttpClient hatchHttpClient, String str, String str2, List<HatchHttpRequest> list, HatchVmProbeAuthProvider hatchVmProbeAuthProvider, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
            return null;
        }
    }
}
