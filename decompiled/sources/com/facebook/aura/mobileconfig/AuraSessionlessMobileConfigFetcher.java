package com.facebook.aura.mobileconfig;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BFI;
import X.C3UX;
import X.C60O;
import X.C78T;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpMethod;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.mobileconfig.MobileConfigFetcher;
import com.facebook.mobileconfig.MobileConfigFetcherHandler;
import com.facebook.tigon.iface.TigonRequest;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraSessionlessMobileConfigFetcher implements MobileConfigFetcher {
    public static final String BASE_URL = "https://graph.facebook.com";
    public static final String TAG = "AuraSessionlessMCFetch";
    public static final AuraSessionlessMobileConfigFetcher INSTANCE = new AuraSessionlessMobileConfigFetcher();
    public static final Set<String> INTEGER_FIELDS = BFI.A0H(new String[]{"api_version", "batch_size", "bool_opt_policy", "missing_params_count", "tier", "ts", "unit_type"});
    public static final C3UX scope = C78T.A00();

    @DebugMetadata(c = "com.facebook.aura.mobileconfig.AuraSessionlessMobileConfigFetcher$fetch$1", f = "AuraSessionlessMobileConfigFetcher.kt", l = {122}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.mobileconfig.AuraSessionlessMobileConfigFetcher$fetch$1, reason: invalid class name */
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
                    HatchHttpClient hatchHttpClientA07 = C60O.A07();
                    HatchHttpRequest hatchHttpRequest = this.$request;
                    this.label = 1;
                    obj = hatchHttpClientA07.execute(hatchHttpRequest, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                AuraSessionlessMobileConfigFetcher.INSTANCE.handleResponse((HatchHttpResponse) obj, this.$endpoint, this.$callback);
            } catch (Exception e) {
                CFK.A04(AuraSessionlessMobileConfigFetcher.TAG, FGI.A0d("fetch FAILED (network): endpoint=", this.$endpoint, " error=", e.getMessage()));
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
    private final HatchHttpMethod parseMethod(String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    @Override // com.facebook.mobileconfig.MobileConfigFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fetch(java.lang.String r20, java.lang.String r21, java.util.Map<java.lang.String, java.lang.String> r22, com.facebook.mobileconfig.MobileConfigFetcherHandler r23, java.lang.String r24, java.lang.Integer r25) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.AuraSessionlessMobileConfigFetcher.fetch(java.lang.String, java.lang.String, java.util.Map, com.facebook.mobileconfig.MobileConfigFetcherHandler, java.lang.String, java.lang.Integer):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResponse(HatchHttpResponse hatchHttpResponse, String str, MobileConfigFetcherHandler mobileConfigFetcherHandler) throws IOException {
        StringBuilder sbA0x;
        String strBodyString = hatchHttpResponse.bodyString();
        if (strBodyString == null) {
            strBodyString = "";
        }
        int i = hatchHttpResponse.statusCode;
        if (i == 200 && strBodyString.length() > 0) {
            CFK.A05(TAG, FGI.A0V("fetch OK: endpoint=", str, " code=", 200));
            mobileConfigFetcherHandler.onComplete(true, strBodyString);
            return;
        }
        String str2 = hatchHttpResponse.errorMessage;
        if (str2 != null) {
            sbA0x = C60O.A0y("code=", i);
            sbA0x.append(" transport=");
            sbA0x.append(str2);
        } else {
            int length = strBodyString.length();
            sbA0x = C60O.A0x("code=");
            if (length == 0) {
                sbA0x.append(i);
                strBodyString = " | empty response body";
            } else {
                sbA0x.append(i);
                sbA0x.append(" body=");
            }
            sbA0x.append(strBodyString);
        }
        String string = sbA0x.toString();
        CFK.A04(TAG, FGI.A0d("fetch FAILED: endpoint=", str, InviteCodeScratcherKt.CODE_SEPARATOR, string));
        mobileConfigFetcherHandler.onComplete(false, string);
    }
}
