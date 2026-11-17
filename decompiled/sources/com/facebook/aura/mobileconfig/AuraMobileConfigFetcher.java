package com.facebook.aura.mobileconfig;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BFI;
import X.C3UX;
import X.C3cI;
import X.C60P;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpMethod;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchTransport;
import com.facebook.mobileconfig.MobileConfigFetcher;
import com.facebook.mobileconfig.MobileConfigFetcherHandler;
import com.facebook.tigon.iface.TigonRequest;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraMobileConfigFetcher implements MobileConfigFetcher {
    public static final String API_VERSION = "1.0.0";
    public static final String API_VERSION_HEADER = "X-API-Version";
    public static final String BASE_URL = "https://hatch-api.meta.ai";
    public static final String TAG = "AuraMobileConfigFetcher";
    public static final AuraMobileConfigFetcher INSTANCE = new AuraMobileConfigFetcher();
    public static final Set<String> INTEGER_FIELDS = BFI.A0H(new String[]{"api_version", "batch_size", "bool_opt_policy", "missing_params_count", "tier", "ts", "unit_type"});
    public static final C3UX scope = C78T.A00();

    @DebugMetadata(c = "com.facebook.aura.mobileconfig.AuraMobileConfigFetcher$fetch$1", f = "AuraMobileConfigFetcher.kt", l = {142}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfigFetcher$fetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MobileConfigFetcherHandler $callback;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ HatchHttpRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchHttpRequest hatchHttpRequest, String str, MobileConfigFetcherHandler mobileConfigFetcherHandler, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$request = hatchHttpRequest;
            this.$endpoint = str;
            this.$callback = mobileConfigFetcherHandler;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$request, this.$endpoint, this.$callback, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchHttpClient hatchHttpClientHttpClient = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_BEARER);
                    HatchHttpRequest hatchHttpRequest = this.$request;
                    this.label = 1;
                    obj = hatchHttpClientHttpClient.execute(hatchHttpRequest, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AuraMobileConfigFetcher.INSTANCE.handleResponse((HatchHttpResponse) obj, this.$endpoint, this.$callback);
            } catch (Exception e) {
                CFK.A04(AuraMobileConfigFetcher.TAG, FGI.A0d("fetch FAILED (network): endpoint=", this.$endpoint, " error=", e.getMessage()));
                this.$callback.onComplete(false, AbstractC07127nr.A07(e));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final HatchHttpMethod httpHttpMethodFor(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        switch (upperCase.hashCode()) {
            case 70454:
                if (upperCase.equals(TigonRequest.GET)) {
                    return HatchHttpMethod.GET;
                }
                break;
            case 79599:
                if (upperCase.equals("PUT")) {
                    return HatchHttpMethod.PUT;
                }
                break;
            case 75900968:
                if (upperCase.equals("PATCH")) {
                    return HatchHttpMethod.PATCH;
                }
                break;
            case 2012838315:
                if (upperCase.equals("DELETE")) {
                    return HatchHttpMethod.DELETE;
                }
                break;
        }
        return HatchHttpMethod.POST;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    @Override // com.facebook.mobileconfig.MobileConfigFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fetch(java.lang.String r26, java.lang.String r27, java.util.Map<java.lang.String, java.lang.String> r28, com.facebook.mobileconfig.MobileConfigFetcherHandler r29, java.lang.String r30, java.lang.Integer r31) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.AuraMobileConfigFetcher.fetch(java.lang.String, java.lang.String, java.util.Map, com.facebook.mobileconfig.MobileConfigFetcherHandler, java.lang.String, java.lang.Integer):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResponse(HatchHttpResponse hatchHttpResponse, String str, MobileConfigFetcherHandler mobileConfigFetcherHandler) throws IOException {
        boolean z;
        int length;
        String strBodyString = hatchHttpResponse.bodyString();
        if (strBodyString == null) {
            strBodyString = "";
        }
        int i = hatchHttpResponse.statusCode;
        if (!hatchHttpResponse.isSuccessful || (length = strBodyString.length()) <= 0) {
            String str2 = hatchHttpResponse.errorMessage;
            String string = (str2 != null ? C3cI.A0x("transport=", str2) : C3cI.A0x("body=", strBodyString)).toString();
            StringBuilder sbA0x = C3cI.A0x("fetch FAILED: endpoint=", str);
            sbA0x.append(" code=");
            sbA0x.append(i);
            CFK.A04(TAG, C60P.A1M(InviteCodeScratcherKt.CODE_SEPARATOR, string, sbA0x));
            z = false;
        } else {
            StringBuilder sbA0x2 = C3cI.A0x("fetch OK: endpoint=", str);
            sbA0x2.append(" code=");
            sbA0x2.append(i);
            CFK.A05(TAG, C60P.A1O(" bodyLength=", sbA0x2, length));
            z = true;
        }
        mobileConfigFetcherHandler.onComplete(z, strBodyString);
    }
}
