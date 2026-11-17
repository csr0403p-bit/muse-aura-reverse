package com.facebook.aura.network.fresco;

import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC6692EUz;
import X.AbstractC7260Ejk;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BV4;
import X.BV7;
import X.C06H;
import X.C07739il;
import X.C10533Hqc;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60N;
import X.C60O;
import X.C6988Edo;
import X.C6ys;
import X.C7185Ehv;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C8j3;
import X.CFK;
import X.CUB;
import X.EUm;
import X.EUt;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.HxE;
import X.HzP;
import X.InterfaceC7028EeZ;
import X.InterfaceC7029Eea;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.conversation.view.HatchConversationScreenKt;
import com.facebook.aura.network.api.CloudflareImageUrl;
import com.facebook.aura.network.transport.HatchHttpRequest;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class AuraImageNetworkFetcher extends AbstractC6692EUz<ImageNetworkFetchState> {
    public static final String FETCH_TIME = "fetch_time";
    public static final String IMAGE_SIZE = "image_size";
    public static final String QUEUE_TIME = "queue_time";
    public static final String TOTAL_TIME = "total_time";
    public final C3UX scope = C78W.A03();
    public static final Companion Companion = new Companion();
    public static final List<C07739il> IO_RETRY_BACKOFF_RANGES_MS = Arrays.asList(new C07739il(150, 800), new C07739il(500, HatchConversationScreenKt.THREAD_HEADER_INTRO_DURATION_MS), new C07739il(1500, 6000));
    public static final List<C07739il> HTTP_5XX_RETRY_BACKOFF_RANGES_MS = Arrays.asList(new C07739il(500, 1500), new C07739il(1500, 4000), new C07739il(3000, 10000));

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isTransientConnectFailure(IOException iOException) {
            String message;
            return (iOException instanceof SSLHandshakeException) || (iOException instanceof SocketTimeoutException) || ((iOException instanceof SocketException) && (message = iOException.getMessage()) != null && C7BY.A0q(message, "Connection reset", false));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isTransientHttpError(int i) {
            if (i == 408 || i == 429) {
                return true;
            }
            return 500 <= i && i < 600;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class ImageNetworkFetchState extends EUt {
        public final String accountId;
        public final CloudflareImageUrl cloudflareImage;
        public final AtomicReference<Uri> effectiveUri;
        public final AtomicBoolean fellBackToRaw;
        public long fetchCompleteTime;
        public volatile HoC inFlight;
        public final AtomicBoolean isCancelled;
        public final String logUri;
        public long responseTime;
        public long submitTime;

        public final String getAccountId() {
            return this.accountId;
        }

        public final CloudflareImageUrl getCloudflareImage() {
            return this.cloudflareImage;
        }

        public final String getLogUri() {
            return this.logUri;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageNetworkFetchState(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
            super(interfaceC7028EeZ, interfaceC7029Eea);
            boolean zA1b = AnonymousClass004.A1b(interfaceC7028EeZ, interfaceC7029Eea);
            this.isCancelled = BV4.A12(zA1b);
            this.effectiveUri = BV4.A16(getUri());
            this.fellBackToRaw = BV4.A12(zA1b);
            CloudflareImageUrl cloudflareImageUrl = CloudflareImageUrl.Companion.parse(getUri());
            this.cloudflareImage = cloudflareImageUrl;
            this.accountId = AuraImageCacheKeyFactory.INSTANCE.accountIdFor(((C7185Ehv) interfaceC7029Eea).A07);
            this.logUri = cloudflareImageUrl != null ? "<shared-image>" : C60O.A0o(getUri());
        }
    }

    public final class ImageNetworkFetcherException extends Exception {
        public final int responseCode;
        public final Map<String, String> responseHeaders;

        public ImageNetworkFetcherException(int i, Map<String, String> map) {
            C7384Etj.A0Y(map, 1);
            this.responseCode = i;
            this.responseHeaders = map;
        }

        public final int getResponseCode() {
            return this.responseCode;
        }

        public final Map<String, String> getResponseHeaders() {
            return this.responseHeaders;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.fresco.AuraImageNetworkFetcher$createFetchJob$1", f = "AuraImageNetworkFetcher.kt", l = {236, 258, 259}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.network.fresco.AuraImageNetworkFetcher$createFetchJob$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $attempt;
        public final /* synthetic */ EUm $callback;
        public final /* synthetic */ ImageNetworkFetchState $fetchState;
        public final /* synthetic */ HatchHttpRequest $request;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ AuraImageNetworkFetcher this$0;

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[Catch: all -> 0x00da, CancellationException -> 0x010f, TRY_ENTER, TryCatch #5 {CancellationException -> 0x010f, all -> 0x00da, blocks: (B:40:0x00ce, B:45:0x00d6, B:46:0x00d9, B:34:0x00ad, B:35:0x00b0, B:23:0x0060, B:24:0x0063, B:27:0x0082, B:29:0x0088, B:14:0x0026, B:16:0x0030, B:18:0x003f, B:20:0x0045, B:31:0x0092), top: B:63:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: all -> 0x00da, CancellationException -> 0x010f, TryCatch #5 {CancellationException -> 0x010f, all -> 0x00da, blocks: (B:40:0x00ce, B:45:0x00d6, B:46:0x00d9, B:34:0x00ad, B:35:0x00b0, B:23:0x0060, B:24:0x0063, B:27:0x0082, B:29:0x0088, B:14:0x0026, B:16:0x0030, B:18:0x003f, B:20:0x0045, B:31:0x0092), top: B:63:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ce A[Catch: all -> 0x00da, CancellationException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x010f, all -> 0x00da, blocks: (B:40:0x00ce, B:45:0x00d6, B:46:0x00d9, B:34:0x00ad, B:35:0x00b0, B:23:0x0060, B:24:0x0063, B:27:0x0082, B:29:0x0088, B:14:0x0026, B:16:0x0030, B:18:0x003f, B:20:0x0045, B:31:0x0092), top: B:63:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.fresco.AuraImageNetworkFetcher.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImageNetworkFetchState imageNetworkFetchState, AuraImageNetworkFetcher auraImageNetworkFetcher, int i, EUm eUm, HatchHttpRequest hatchHttpRequest, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$fetchState = imageNetworkFetchState;
            this.this$0 = auraImageNetworkFetcher;
            this.$attempt = i;
            this.$callback = eUm;
            this.$request = hatchHttpRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$fetchState, this.this$0, this.$attempt, this.$callback, this.$request, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.network.fresco.AuraImageNetworkFetcher", f = "AuraImageNetworkFetcher.kt", l = {410}, m = "handleResponse", v = 2)
    /* renamed from: com.facebook.aura.network.fresco.AuraImageNetworkFetcher$handleResponse$1, reason: invalid class name and case insensitive filesystem */
    public final class C127141 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C127141(HtJ<? super C127141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraImageNetworkFetcher.this.handleResponse(null, null, 0, null, this);
        }
    }

    private final void scheduleRetry(ImageNetworkFetchState imageNetworkFetchState, EUm eUm, int i, long j) {
        requestId(imageNetworkFetchState);
        C3UX c3ux = this.scope;
        C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new AuraImageNetworkFetcher$scheduleRetry$job$1(j, this, imageNetworkFetchState, eUm, i, null), c3ux);
        imageNetworkFetchState.inFlight = c10533HqcA02;
        c10533HqcA02.Afv();
    }

    @Override // X.AbstractC6692EUz
    public void fetch(final ImageNetworkFetchState imageNetworkFetchState, EUm eUm) {
        String host;
        boolean zA1a = AnonymousClass002.A1a(imageNetworkFetchState, eUm);
        if (imageNetworkFetchState.cloudflareImage == null && (host = imageNetworkFetchState.getUri().getHost()) != null && host.endsWith(C60N.A00(39)) == zA1a) {
            eUm.onFailure(BV4.A0K("Invalid Cloudflare image URL"));
            return;
        }
        imageNetworkFetchState.submitTime = SystemClock.elapsedRealtime();
        String strA0x = BV7.A0x(imageNetworkFetchState);
        C7384Etj.A0U(strA0x);
        CFK.A00(strA0x, Boolean.valueOf(AnonymousClass002.A1X(imageNetworkFetchState.cloudflareImage)), imageNetworkFetchState.getUri().getScheme(), Boolean.valueOf(imageNetworkFetchState.context.AOu()), AuraImageNetworkFetcherKt.TAG, "image route req=%s shared=%b scheme=%s prefetch=%b");
        requestId(imageNetworkFetchState);
        if (AuraImageNetworkFetcherKt.isCleartextUri(imageNetworkFetchState.getUri())) {
            Uri uriHttpsUpgrade = AuraImageNetworkFetcherKt.httpsUpgrade(imageNetworkFetchState.getUri());
            String strA0x2 = BV7.A0x(imageNetworkFetchState);
            C7384Etj.A0U(strA0x2);
            CFK.A0H(AuraImageNetworkFetcherKt.TAG, "upgraded cleartext uri req=%s from=%s to=%s", strA0x2, imageNetworkFetchState.getUri(), uriHttpsUpgrade);
            imageNetworkFetchState.effectiveUri.set(uriHttpsUpgrade);
        }
        HoC hoCCreateFetchJob = createFetchJob(imageNetworkFetchState, eUm, 0);
        imageNetworkFetchState.inFlight = hoCCreateFetchJob;
        imageNetworkFetchState.context.A3R(new AbstractC7260Ejk() { // from class: com.facebook.aura.network.fresco.AuraImageNetworkFetcher.fetch.1
            @Override // X.AbstractC7260Ejk
            public void onCancellationRequested() {
                AuraImageNetworkFetcher.access$requestId(AuraImageNetworkFetcher.this, imageNetworkFetchState);
                imageNetworkFetchState.isCancelled.set(true);
                AnonymousClass002.A1K(imageNetworkFetchState.inFlight);
            }
        });
        hoCCreateFetchJob.Afv();
    }

    @Override // X.AbstractC6692EUz
    public Map<String, String> getExtraMap(ImageNetworkFetchState imageNetworkFetchState, int i) {
        C7384Etj.A0Y(imageNetworkFetchState, 0);
        long j = imageNetworkFetchState.responseTime;
        long j2 = imageNetworkFetchState.submitTime;
        HxE hxEA0r = C3cG.A0r(QUEUE_TIME, String.valueOf(j - j2));
        long j3 = imageNetworkFetchState.fetchCompleteTime;
        return C3cH.A0n(IMAGE_SIZE, String.valueOf(i), hxEA0r, C3cG.A0r(FETCH_TIME, String.valueOf(j3 - j)), C3cG.A0r(TOTAL_TIME, String.valueOf(j3 - j2)));
    }

    @Override // X.AbstractC6692EUz
    public void onFetchCompletion(ImageNetworkFetchState imageNetworkFetchState, int i) {
        C7384Etj.A0Y(imageNetworkFetchState, 0);
        imageNetworkFetchState.fetchCompleteTime = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.HoC createFetchJob(com.facebook.aura.network.fresco.AuraImageNetworkFetcher.ImageNetworkFetchState r17, X.EUm r18, int r19) {
        /*
            r16 = this;
            r13 = r17
            X.Eea r0 = r13.context
            X.Ehv r0 = (X.C7185Ehv) r0
            X.Eht r0 = r0.A07
            X.EUs r4 = r0.A05
            if (r4 == 0) goto L33
            java.lang.String r3 = "Range"
            int r0 = r4.A00
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L7b
            java.lang.String r2 = ""
        L17:
            int r0 = r4.A01
            if (r0 != r1) goto L76
            java.lang.String r0 = ""
        L1d:
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r1)
            r1 = 0
            java.lang.String r0 = "bytes=%s-%s"
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            java.util.Map r3 = X.AnonymousClass006.A10(r3, r0)
            if (r3 != 0) goto L37
        L33:
            X.9jH r3 = X.AGH.A0E()
        L37:
            com.facebook.aura.network.transport.HatchHttpRequest$Companion r1 = com.facebook.aura.network.transport.HatchHttpRequest.Companion
            java.util.concurrent.atomic.AtomicReference<android.net.Uri> r0 = r13.effectiveUri
            java.lang.Object r0 = r0.get()
            java.lang.String r2 = X.C60O.A0o(r0)
            com.facebook.aura.network.transport.HatchRequestCategory r7 = com.facebook.aura.network.transport.HatchRequestCategory.IMAGE
            X.Eea r0 = r13.context
            boolean r0 = r0.AOu()
            if (r0 == 0) goto L73
            com.facebook.aura.network.transport.HatchRequestPurpose r8 = com.facebook.aura.network.transport.HatchRequestPurpose.PREFETCH
        L4f:
            r4 = 0
            r10 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r12 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT
            r5 = r4
            r6 = r4
            r9 = r4
            r11 = r10
            com.facebook.aura.network.transport.HatchHttpRequest r17 = r1.get(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14 = r16
            X.3UX r2 = r14.scope
            java.lang.Integer r1 = X.C79.A01
            com.facebook.aura.network.fresco.AuraImageNetworkFetcher$createFetchJob$1 r12 = new com.facebook.aura.network.fresco.AuraImageNetworkFetcher$createFetchJob$1
            r16 = r18
            r15 = r19
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.6ys r0 = X.C6ys.A00
            X.Hqc r0 = X.GAo.A02(r1, r0, r12, r2)
            return r0
        L73:
            com.facebook.aura.network.transport.HatchRequestPurpose r8 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            goto L4f
        L76:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L1d
        L7b:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.fresco.AuraImageNetworkFetcher.createFetchJob(com.facebook.aura.network.fresco.AuraImageNetworkFetcher$ImageNetworkFetchState, X.EUm, int):X.HoC");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleResponse(com.facebook.aura.network.fresco.AuraImageNetworkFetcher.ImageNetworkFetchState r14, X.EUm r15, int r16, com.facebook.aura.network.transport.HatchHttpResponseStream r17, X.HtJ<? super kotlin.Unit> r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.fresco.AuraImageNetworkFetcher.handleResponse(com.facebook.aura.network.fresco.AuraImageNetworkFetcher$ImageNetworkFetchState, X.EUm, int, com.facebook.aura.network.transport.HatchHttpResponseStream, X.HtJ):java.lang.Object");
    }

    private final void handleTransportFailure(ImageNetworkFetchState imageNetworkFetchState, EUm eUm, int i, IOException iOException) {
        boolean zIsTransientConnectFailure = Companion.isTransientConnectFailure(iOException);
        List<C07739il> list = IO_RETRY_BACKOFF_RANGES_MS;
        boolean zA1T = C8j3.A1T(i, list.size());
        String strA0x = BV7.A0x(imageNetworkFetchState);
        C7384Etj.A0U(strA0x);
        Integer numValueOf = Integer.valueOf(i);
        String strA0Y = C3cI.A0Y(iOException);
        String message = iOException.getMessage();
        if (message == null) {
            message = "<null>";
        }
        CFK.A0H(AuraImageNetworkFetcherKt.TAG, "transport failure req=%s attempt=%d errType=%s msg=%s transient=%b retryBudget=%b/%d", strA0x, numValueOf, strA0Y, message, Boolean.valueOf(zIsTransientConnectFailure), Boolean.valueOf(zA1T), Integer.valueOf(list.size()));
        if (zIsTransientConnectFailure && zA1T) {
            scheduleRetry(imageNetworkFetchState, eUm, i + 1, ATD.A08(CUB.A00, list.get(i)));
            return;
        }
        String message2 = iOException.getMessage();
        if (message2 == null) {
            message2 = "transport failure";
        }
        if (tryFallbackToRaw(imageNetworkFetchState, eUm, message2)) {
            return;
        }
        String strA0x2 = BV7.A0x(imageNetworkFetchState);
        C7384Etj.A0U(strA0x2);
        String message3 = iOException.getMessage();
        CFK.A0F(AuraImageNetworkFetcherKt.TAG, "terminal failure req=%s attempt=%d reason=transport-no-retry errType=%s msg=%s uri=%s", strA0x2, numValueOf, strA0Y, message3 != null ? message3 : "<null>", imageNetworkFetchState.effectiveUri.get());
        eUm.onFailure(iOException);
    }

    private final boolean tryFallbackToRaw(ImageNetworkFetchState imageNetworkFetchState, EUm eUm, String str) {
        Uri uri = imageNetworkFetchState.effectiveUri.get();
        C7384Etj.A0X(uri);
        Uri uriRawUriFor = AuraImageNetworkFetcherKt.rawUriFor(uri);
        if (uriRawUriFor != null && AuraImageNetworkFetcherKt.isImageUri(uri)) {
            boolean zCompareAndSet = imageNetworkFetchState.fellBackToRaw.compareAndSet(false, true);
            String strA0x = BV7.A0x(imageNetworkFetchState);
            C7384Etj.A0U(strA0x);
            if (zCompareAndSet) {
                CFK.A0H(AuraImageNetworkFetcherKt.TAG, "fallback to raw req=%s reason=%s thumb=%s raw=%s", strA0x, str, uri, uriRawUriFor);
                imageNetworkFetchState.effectiveUri.set(uriRawUriFor);
                fetchOnce(imageNetworkFetchState, eUm, 0);
                return true;
            }
            CFK.A0H(AuraImageNetworkFetcherKt.TAG, "fallback skipped (already fell back) req=%s reason=%s uri=%s", strA0x, str, uri);
        }
        return false;
    }

    public static final /* synthetic */ String access$requestId(AuraImageNetworkFetcher auraImageNetworkFetcher, ImageNetworkFetchState imageNetworkFetchState) {
        String strA0x = BV7.A0x(imageNetworkFetchState);
        C7384Etj.A0U(strA0x);
        return strA0x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchOnce(ImageNetworkFetchState imageNetworkFetchState, EUm eUm, int i) {
        HoC hoCCreateFetchJob = createFetchJob(imageNetworkFetchState, eUm, i);
        imageNetworkFetchState.inFlight = hoCCreateFetchJob;
        hoCCreateFetchJob.Afv();
    }

    private final String requestId(ImageNetworkFetchState imageNetworkFetchState) {
        String strA0x = BV7.A0x(imageNetworkFetchState);
        C7384Etj.A0U(strA0x);
        return strA0x;
    }

    @Override // X.AbstractC6692EUz
    public /* bridge */ /* synthetic */ EUt createFetchState(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        return new ImageNetworkFetchState(interfaceC7028EeZ, interfaceC7029Eea);
    }

    @Override // X.AbstractC6692EUz
    public ImageNetworkFetchState createFetchState(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        AnonymousClass003.A0u(interfaceC7028EeZ, interfaceC7029Eea);
        return new ImageNetworkFetchState(interfaceC7028EeZ, interfaceC7029Eea);
    }
}
