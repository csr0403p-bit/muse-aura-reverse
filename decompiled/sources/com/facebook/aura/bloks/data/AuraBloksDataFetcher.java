package com.facebook.aura.bloks.data;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.C06H;
import X.C10453Hir;
import X.C10572Hue;
import X.C3330CEv;
import X.C3341CFl;
import X.C7384Etj;
import X.C79;
import X.CFK;
import X.CPS;
import X.CPX;
import X.DYI;
import X.DcZ;
import X.Dca;
import X.EnumC3451CNw;
import X.F0T;
import X.F1G;
import X.F61;
import X.FFI;
import X.FGI;
import X.HoB;
import X.HsN;
import X.Hsf;
import X.Hsv;
import X.Ht3;
import X.Huk;
import X.Hw6;
import X.Hzd;
import android.content.Context;
import android.util.JsonReader;
import com.facebook.aura.bloks.extensions.async.AuraBloksTemplateContextProvider;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAppRootQueryImpl;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAppRootQueryResponse;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.bloks.BloksParseResult;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuraBloksDataFetcher {
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraBloksDataFetcher";

    public final class Companion {

        /* loaded from: classes6.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[C79.A00(7).length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[6] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[1] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[2] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[4] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[5] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HoB getErrorFetchSummary() {
            return new HoB(new C10572Hue(true), 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.HoB getFetchSummary(X.F1G<com.facebook.aura.bloks.graphql.frl.FrlBloksAppRootQueryResponse> r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L52
                X.CPX r2 = (X.CPX) r2
                T r0 = r2.A01
                if (r0 == 0) goto L13
                com.facebook.pando.Summary r0 = r2.A00
                java.lang.String r1 = r0.source
                int r0 = r1.hashCode()
                switch(r0) {
                    case 461569884: goto L2d;
                    case 1561714200: goto L39;
                    case 1782559025: goto L3c;
                    case 1843485230: goto L47;
                    default: goto L13;
                }
            L13:
                java.lang.Integer r0 = X.C79.A0K
            L15:
                int r0 = r0.intValue()
                switch(r0) {
                    case 0: goto L29;
                    case 1: goto L1c;
                    case 2: goto L1c;
                    case 3: goto L2b;
                    default: goto L1c;
                }
            L1c:
                r2 = 2
            L1d:
                r0 = 1
                X.Hue r1 = new X.Hue
                r1.<init>(r0)
                X.HoB r0 = new X.HoB
                r0.<init>(r1, r2)
                return r0
            L29:
                r2 = 1
                goto L1d
            L2b:
                r2 = 4
                goto L1d
            L2d:
                java.lang.String r0 = "stale_cache"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L13
                java.lang.Integer r0 = X.C79.A0C
                goto L15
            L39:
                java.lang.String r0 = "consistency"
                goto L3e
            L3c:
                java.lang.String r0 = "fresh_cache"
            L3e:
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L13
                java.lang.Integer r0 = X.C79.A01
                goto L15
            L47:
                java.lang.String r0 = "network"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L13
                java.lang.Integer r0 = X.C79.A00
                goto L15
            L52:
                java.lang.String r0 = "Failed to find GraphQL Summary Data"
                java.lang.RuntimeException r0 = X.BV4.A0c(r0)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.data.AuraBloksDataFetcher.Companion.getFetchSummary(X.F1G):X.HoB");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Huk transformBloksNetworkResponse(F1G<FrlBloksAppRootQueryResponse> f1g, AuraAppDataConfig auraAppDataConfig) {
        RuntimeException runtimeExceptionA0c;
        HoB fetchSummary;
        JsonReader jsonReader;
        F61 f61;
        FrlBloksAppRootQueryResponse frlBloksAppRootQueryResponse;
        FrlBloksAppRootQueryResponse.BloksApp bloksApp;
        FrlBloksAppRootQueryResponse.BloksApp.BloksBundle bloksBundle;
        String bloksBundleTree = (f1g == null || (frlBloksAppRootQueryResponse = (FrlBloksAppRootQueryResponse) ((CPX) f1g).A01) == null || (bloksApp = frlBloksAppRootQueryResponse.getBloksApp()) == null || (bloksBundle = bloksApp.getBloksBundle()) == null) ? null : bloksBundle.getBloksBundleTree();
        if (bloksBundleTree == null) {
            CFK.A04(TAG, "Bloks payload is null in GraphQL response");
            runtimeExceptionA0c = BV4.A0c("Bloks response null");
            fetchSummary = Companion.getErrorFetchSummary();
        } else {
            DcZ.A00.nextInt();
            try {
                jsonReader = new JsonReader(new StringReader(bloksBundleTree));
            } catch (IOException e) {
                FFI.A04(e);
            }
            try {
                C3330CEv c3330CEv = new C3330CEv(jsonReader);
                c3330CEv.ARK();
                C10453Hir c10453HirA00 = C10453Hir.A00(c3330CEv);
                C7384Etj.A0U(c10453HirA00);
                Hsf hsf = c10453HirA00.A00;
                if (hsf != null && (f61 = hsf.A00) != null) {
                    BloksParseResult bloksParseResultA01 = BloksParseResult.A01(new Ht3(), f61, null);
                    jsonReader.close();
                    return new Hsv(bloksParseResultA01, Companion.getFetchSummary(f1g));
                }
                jsonReader.close();
                runtimeExceptionA0c = BV4.A0c("Bloks parse result null");
                fetchSummary = Companion.getFetchSummary(f1g);
            } finally {
            }
        }
        return new Hw6(fetchSummary, runtimeExceptionA0c);
    }

    public void fetch(Context context, String str, Map<String, String> map, final AuraAppDataConfig auraAppDataConfig, final Dca dca) {
        AnonymousClass003.A0x(str, map);
        AnonymousClass002.A1C(auraAppDataConfig, 3, dca);
        Hzd defaultBloksTemplateContext = AuraBloksTemplateContextProvider.INSTANCE.getDefaultBloksTemplateContext();
        C3341CFl.A00(defaultBloksTemplateContext.A04(), Double.valueOf(3.0d), "pixel_ratio");
        Hzd hzd = new Hzd(3);
        hzd.A08(JarvisProtocolKt.APP_ID_QUERY_PARAM, str);
        hzd.A08(AuraBloksDataProps.PARAMS, new JSONObject(AGH.A0A(map)).toString());
        hzd.A08("bloks_versioning_id", "8b70b804c58d946dc7b47cb242c3c2882614ead1855b79522049fb8c550a8994");
        DYI<FrlBloksAppRootQueryResponse> dyiBuild = new FrlBloksAppRootQueryImpl.Builder().setParams(hzd).setBkContext(defaultBloksTemplateContext).build();
        ((PandoGraphQLRequest) dyiBuild).m3184setFriendlyName(FGI.A0M("FrlBloksAppRootQuery-", str));
        AuraGraphQLService.INSTANCE.bloksInstance().execute(dyiBuild, new F0T() { // from class: com.facebook.aura.bloks.data.AuraBloksDataFetcher.fetch.1
            @Override // X.F0T
            public final void invoke(F1G<FrlBloksAppRootQueryResponse> f1g) {
                C7384Etj.A0Y(f1g, 0);
                dca.onResponse(this.transformBloksNetworkResponse(f1g, auraAppDataConfig));
            }
        }, new CPS() { // from class: com.facebook.aura.bloks.data.AuraBloksDataFetcher.fetch.2
            @Override // X.CPS
            public final void invoke(Throwable th) {
                C7384Etj.A0Y(th, 0);
                th.getMessage();
                dca.onResponse(new Hw6(AuraBloksDataFetcher.Companion.getErrorFetchSummary(), BV4.A0e(th)));
            }
        }, EnumC3451CNw.A01);
    }

    public /* bridge */ /* synthetic */ void fetch(Context context, String str, Map map, HsN hsN, Dca dca) {
        fetch(context, str, (Map<String, String>) map, (AuraAppDataConfig) hsN, dca);
    }
}
