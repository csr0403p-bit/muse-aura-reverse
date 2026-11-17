package com.facebook.aura.bloks.extensions.async;

import X.AbstractC7712FBk;
import X.BV4;
import X.BV5;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7403Euh;
import X.C7632F7p;
import X.C7718FBu;
import X.CPS;
import X.CQG;
import X.DYI;
import X.EEO;
import X.EnumC3451CNw;
import X.F0T;
import X.F1G;
import X.FBL;
import X.FBQ;
import X.FBU;
import X.FBW;
import X.FBX;
import X.FFI;
import X.FGI;
import X.HlX;
import X.Hnp;
import X.HxG;
import X.Hzd;
import X.InterfaceC10551Hsc;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQueryImpl;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQueryResponse;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.graphql.error.GraphQLErrorException;
import com.facebook.pando.PandoGraphQLRequest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuraAsyncComponentsFetcher {
    public static final AuraAsyncComponentsFetcher INSTANCE = new AuraAsyncComponentsFetcher();

    public final void fetchBloksAsyncComponents(String str, Map<String, ? extends Object> map, boolean z, HlX hlX, Executor executor, final InterfaceC10551Hsc interfaceC10551Hsc) {
        boolean zA1Y = C60P.A1Y(str, map);
        C7384Etj.A0Y(interfaceC10551Hsc, 5);
        Hzd hzd = new Hzd(3);
        hzd.A08(JarvisProtocolKt.APP_ID_QUERY_PARAM, str);
        hzd.A08("bloks_versioning_id", "8b70b804c58d946dc7b47cb242c3c2882614ead1855b79522049fb8c550a8994");
        if (!map.isEmpty()) {
            hzd.A08(AuraBloksDataProps.PARAMS, C60O.A0o(BV4.A18().put(AuraBloksDataProps.PARAMS, new JSONObject(map))));
        }
        if (z) {
            hzd.A07("is_prebundled", Boolean.valueOf(zA1Y));
        }
        final CQG<F1G<FrlBloksAsyncComponentQueryResponse>> cqg = new CQG<F1G<FrlBloksAsyncComponentQueryResponse>>() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncComponentsFetcher$fetchBloksAsyncComponents$innerCallback$1
            @Override // X.CQG
            public void onFailure(Throwable th) throws NoSuchAlgorithmException {
                GraphQLErrorException.GraphQLResponseError graphQLResponseError;
                C7384Etj.A0Y(th, 0);
                HxG hxG = null;
                if ((th instanceof GraphQLErrorException.GraphQLResponseError) && (graphQLResponseError = (GraphQLErrorException.GraphQLResponseError) th) != null) {
                    hxG = new HxG(Integer.valueOf(graphQLResponseError.code), graphQLResponseError.description);
                }
                InterfaceC10551Hsc interfaceC10551Hsc2 = interfaceC10551Hsc;
                C7632F7p c7632F7p = new C7632F7p();
                FBW fbw = (FBW) interfaceC10551Hsc2;
                Iterator itA10 = BV5.A10(fbw.A06);
                while (itA10.hasNext()) {
                    C7403Euh c7403Euh = (C7403Euh) itA10.next();
                    FBL fbl = fbw.A01.A01.A01;
                    C7384Etj.A0Y(c7403Euh, 0);
                    fbl.A01.A01(c7403Euh);
                    EEO eeo = fbl.A00;
                    if (eeo != null) {
                        eeo.A03(c7403Euh);
                    }
                }
                FBQ fbq = fbw.A01;
                Map<String, C7718FBu> map2 = fbq.A02;
                String str2 = fbw.A04;
                C7718FBu c7718FBu = map2.get(str2);
                C7718FBu c7718FBu2 = fbw.A00;
                if (c7718FBu != c7718FBu2) {
                    FFI.A01(null, "Invalid state: Active queries have been cleaned up, but requests still in flight", null);
                    return;
                }
                map2.remove(str2);
                if (!c7718FBu2.A01) {
                    c7718FBu2.A01 = true;
                }
                AbstractC7712FBk abstractC7712FBk = fbw.A03;
                HlX hlX2 = abstractC7712FBk.A00;
                HlX hlX3 = HlX.A02;
                if (hlX2 == hlX3 || !c7718FBu.A00.contains(hlX3)) {
                    fbw.A08.invoke(new Hnp(hxG, c7632F7p, str2, th));
                    return;
                }
                String str3 = abstractC7712FBk.A02;
                Map<String, Object> map3 = abstractC7712FBk instanceof FBX ? ((FBX) abstractC7712FBk).A05 : ((FBU) abstractC7712FBk).A05;
                fbq.A01(new FBU(hlX3, abstractC7712FBk.A01, str3, map3, map3.keySet()), str2, fbw.A07, fbw.A08, fbw.A09, fbw.A0A);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0327  */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
            @Override // X.CQG
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess(X.F1G<com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncComponentQueryResponse> r43) throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instructions count: 1240
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.extensions.async.AuraAsyncComponentsFetcher$fetchBloksAsyncComponents$innerCallback$1.onSuccess(X.F1G):void");
            }
        };
        DYI<FrlBloksAsyncComponentQueryResponse> dyiBuild = new FrlBloksAsyncComponentQueryImpl.Builder().setParams(hzd).setBkContext(AuraBloksTemplateContextProvider.INSTANCE.getDefaultBloksTemplateContext()).build();
        ((PandoGraphQLRequest) dyiBuild).m3184setFriendlyName(FGI.A0M("FrlBloksAsyncComponentQuery-", str));
        AuraGraphQLService.INSTANCE.bloksInstance().execute(dyiBuild, new F0T() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncComponentsFetcher.fetchBloksAsyncComponents.1
            @Override // X.F0T
            public final void invoke(F1G<FrlBloksAsyncComponentQueryResponse> f1g) {
                C7384Etj.A0Y(f1g, 0);
                cqg.onSuccess(f1g);
            }
        }, new CPS() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncComponentsFetcher.fetchBloksAsyncComponents.2
            @Override // X.CPS
            public final void invoke(Throwable th) {
                C7384Etj.A0Y(th, 0);
                cqg.onFailure(th);
            }
        }, EnumC3451CNw.A01);
    }
}
