package com.facebook.aura.bloks.extensions.async;

import X.AGH;
import X.AbstractC10476Hkp;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV6;
import X.BV7;
import X.C10453Hir;
import X.C3330CEv;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7616F6s;
import X.C7633F7q;
import X.C9115Fyg;
import X.CFJ;
import X.CFK;
import X.CPS;
import X.CPX;
import X.CQG;
import X.DYI;
import X.DcZ;
import X.Dcy;
import X.EnumC3451CNw;
import X.F0T;
import X.F1G;
import X.F61;
import X.F6D;
import X.F6K;
import X.F6w;
import X.F8L;
import X.F96;
import X.F97;
import X.F9J;
import X.FBB;
import X.FBC;
import X.FBD;
import X.FDW;
import X.FFI;
import X.FGI;
import X.Hj6;
import X.HjT;
import X.Hnz;
import X.HsM;
import X.Hsf;
import X.Ht3;
import X.Hzd;
import android.content.Context;
import android.os.Handler;
import android.util.JsonReader;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncActionQueryImpl;
import com.facebook.aura.bloks.graphql.frl.FrlBloksAsyncActionQueryResponse;
import com.facebook.aura.bloks.host.AuraBloksHost;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.bloks.BloksParseResult;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuraAsyncActions {
    public static final String TAG = "MwaAsyncActions";
    public static final AuraAsyncActions INSTANCE = new AuraAsyncActions();
    public static final Handler handler = C60O.A02();
    public static final Map<String, WeakReference<AsyncActionBloksErrorCallback>> asyncActionBloksErrorCallbacks = C3cG.A0j();
    public static final Map<String, WeakReference<Function0<Unit>>> asyncActionResultCallbacks = C3cG.A0j();

    /* renamed from: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$asyncAction$1, reason: invalid class name */
    public final class AnonymousClass1 implements CQG<F1G<FrlBloksAsyncActionQueryResponse>> {
        public final /* synthetic */ String $appId;
        public final /* synthetic */ F6D $environment;
        public final /* synthetic */ C7633F7q $failureCallback;
        public final /* synthetic */ C7633F7q $successCallback;

        @Override // X.CQG
        public void onFailure(final Throwable th) {
            C7384Etj.A0Y(th, 0);
            Handler handler = AuraAsyncActions.handler;
            final C7633F7q c7633F7q = this.$failureCallback;
            handler.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$asyncAction$1$onFailure$1
                @Override // java.lang.Runnable
                public final void run() {
                    CFK.A08(AuraAsyncActions.TAG, "Failed to fetch Bloks Payload from server", th);
                    c7633F7q.A00(Hj6.A02, null);
                }
            });
        }

        public AnonymousClass1(F6D f6d, C7633F7q c7633F7q, C7633F7q c7633F7q2, String str) {
            this.$environment = f6d;
            this.$successCallback = c7633F7q;
            this.$failureCallback = c7633F7q2;
            this.$appId = str;
        }

        @Override // X.CQG
        public void onSuccess(final F1G<FrlBloksAsyncActionQueryResponse> f1g) {
            Handler handler = AuraAsyncActions.handler;
            final F6D f6d = this.$environment;
            final C7633F7q c7633F7q = this.$successCallback;
            final C7633F7q c7633F7q2 = this.$failureCallback;
            final String str = this.$appId;
            handler.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$asyncAction$1$onSuccess$1
                @Override // java.lang.Runnable
                public final void run() {
                    AuraAsyncActions auraAsyncActions = AuraAsyncActions.INSTANCE;
                    HjT bloksActionParseResult = auraAsyncActions.getBloksActionParseResult(f1g);
                    if (bloksActionParseResult != null) {
                        try {
                            F9J.A01(bloksActionParseResult, c7633F7q, f6d, Collections.EMPTY_MAP);
                            String str2 = str;
                            C7384Etj.A0X(str2);
                            auraAsyncActions.notifyAsyncActionResult(str2);
                        } catch (Exception e) {
                            CFK.A08(AuraAsyncActions.TAG, "Failed to execute Bloks Async Action", e);
                            this.onFailure(e);
                        }
                    }
                }
            });
        }
    }

    private final Hzd buildBloksQueryData(String str) {
        Hzd hzd = new Hzd(3);
        C7384Etj.A0Y(str, 0);
        hzd.A08(JarvisProtocolKt.APP_ID_QUERY_PARAM, str);
        hzd.A08("bloks_versioning_id", "8b70b804c58d946dc7b47cb242c3c2882614ead1855b79522049fb8c550a8994");
        return hzd;
    }

    private final synchronized void cleanupStaleReferences() {
        Iterator itA0n = AnonymousClass002.A0n(asyncActionBloksErrorCallbacks);
        while (itA0n.hasNext()) {
            if (((WeakReference) BV7.A0s(itA0n)).get() == null) {
                itA0n.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final HjT getBloksActionParseResult(F1G<FrlBloksAsyncActionQueryResponse> f1g) {
        FrlBloksAsyncActionQueryResponse frlBloksAsyncActionQueryResponse;
        FrlBloksAsyncActionQueryResponse.BloksAction bloksAction;
        FrlBloksAsyncActionQueryResponse.BloksAction.Action action;
        FrlBloksAsyncActionQueryResponse.BloksAction.Action.ActionBundle actionBundle;
        FrlBloksAsyncActionQueryResponse.BloksAction.Action action2;
        FrlBloksAsyncActionQueryResponse.BloksAction.Action.ActionBundle actionBundle2;
        F61 f61;
        FrlBloksAsyncActionQueryResponse frlBloksAsyncActionQueryResponse2;
        FrlBloksAsyncActionQueryResponse.BloksAction bloksAction2;
        FrlBloksAsyncActionQueryResponse.BloksAction.Action action3;
        if (((f1g == null || (frlBloksAsyncActionQueryResponse2 = (FrlBloksAsyncActionQueryResponse) ((CPX) f1g).A01) == null || (bloksAction2 = frlBloksAsyncActionQueryResponse2.getBloksAction()) == null || (action3 = bloksAction2.getAction()) == null) ? null : action3.getActionBundle()) == null || (frlBloksAsyncActionQueryResponse = (FrlBloksAsyncActionQueryResponse) ((CPX) f1g).A01) == null || (bloksAction = frlBloksAsyncActionQueryResponse.getBloksAction()) == null || (action = bloksAction.getAction()) == null || (actionBundle = action.getActionBundle()) == null || actionBundle.getBloksBundleAction() == null) {
            CFK.A04(TAG, "Bloks payload is null in GraphQL response");
            return null;
        }
        FrlBloksAsyncActionQueryResponse.BloksAction bloksAction3 = frlBloksAsyncActionQueryResponse.getBloksAction();
        if (bloksAction3 != null && (action2 = bloksAction3.getAction()) != null && (actionBundle2 = action2.getActionBundle()) != null) {
            String bloksBundleAction = actionBundle2.getBloksBundleAction();
            if (bloksBundleAction != null) {
                DcZ.A00.nextInt();
                try {
                    JsonReader jsonReader = new JsonReader(new StringReader(bloksBundleAction));
                    try {
                        C3330CEv c3330CEv = new C3330CEv(jsonReader);
                        c3330CEv.ARK();
                        C10453Hir c10453HirA00 = C10453Hir.A00(c3330CEv);
                        C7384Etj.A0U(c10453HirA00);
                        Hsf hsf = c10453HirA00.A00;
                        if (hsf != null && (f61 = hsf.A00) != null) {
                            Ht3 ht3 = new Ht3();
                            jsonReader.close();
                            HsM hsM = f61.A04;
                            List<F6K> list = f61.A07;
                            List<F96> list2 = f61.A09;
                            Map<String, C7616F6s> mapA02 = BloksParseResult.A02(f61.A08);
                            F6w f6w = f61.A02;
                            List<F97> list3 = f61.A0A;
                            Map<String, FDW> map = f61.A0K;
                            List<F8L> list4 = f61.A0I;
                            Map<String, Object> map2 = f61.A0J;
                            Hnz hnz = f61.A01;
                            return new HjT(ht3, f6w, hsM, hnz != null ? hnz.A00 : null, list, list2, list3, list4, mapA02, map, map2);
                        }
                        jsonReader.close();
                    } finally {
                    }
                } catch (IOException e) {
                    FFI.A04(e);
                }
            }
        }
        CFK.A04(TAG, "Bloks Action Payload is null in GraphQL Response");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void notifyAsyncActionResult(String str) {
        Function0<Unit> function0;
        WeakReference<Function0<Unit>> weakReferenceRemove = asyncActionResultCallbacks.remove(str);
        if (weakReferenceRemove != null && (function0 = weakReferenceRemove.get()) != null) {
            function0.invoke();
        }
    }

    public final void asyncAction(FBD fbd, F6D f6d, Hj6 hj6) {
        int iA0C = AnonymousClass002.A0C(f6d, hj6, 1);
        Object[] objArr = hj6.A01;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>");
        HsM hsMA0B = C7384Etj.A0B(hj6.A01, iA0C);
        HsM hsMA0B2 = C7384Etj.A0B(hj6.A01, 3);
        HashMap<String, String> mapA02 = CFJ.A02((HashMap) obj);
        String strA01 = mapA02 != null ? CFJ.A01(mapA02) : null;
        C7384Etj.A0X(str);
        Hzd hzdCreateQueryData = createQueryData(str, strA01);
        F6D f6dA00 = FBC.A00(f6d);
        fetchBloksAsyncAction(hzdCreateQueryData, str, new AnonymousClass1(f6d, new C7633F7q(hsMA0B, f6dA00), new C7633F7q(hsMA0B2, f6dA00), str), null);
    }

    public final void asyncActionV2(final F6D f6d, Hj6 hj6) {
        final HsM hsMA0D;
        final HsM hsMA0D2;
        boolean zA1a = AnonymousClass002.A1a(f6d, hj6);
        final String str = (String) BV6.A0n(hj6.A01, 0);
        Map map = (Map) BV6.A0n(hj6.A01, zA1a ? 1 : 0);
        Object obj = hj6.A01[2];
        FDW fdw = obj instanceof FDW ? (FDW) obj : null;
        final FBB fbb = f6d.A02;
        if (fbb == null) {
            throw BV4.A0U();
        }
        final Context context = fbb.A00;
        C7384Etj.A0U(context);
        final FBD fbd = fbb.A02;
        HashMap<String, String> mapA02 = CFJ.A02(map);
        Hzd hzdCreateQueryData = createQueryData(str, mapA02 != null ? CFJ.A01(mapA02) : null);
        if (fdw != null) {
            hsMA0D = fdw.A0D(36);
            hsMA0D2 = fdw.A0D(35);
        } else {
            hsMA0D = null;
            hsMA0D2 = null;
        }
        final Map mapA01 = AbstractC10476Hkp.A01(f6d, fdw, 40);
        F6D f6dA00 = FBC.A00(f6d);
        final C7633F7q c7633F7q = hsMA0D != null ? new C7633F7q(hsMA0D, f6dA00) : null;
        final C7633F7q c7633F7q2 = hsMA0D2 != null ? new C7633F7q(hsMA0D2, f6dA00) : null;
        fetchBloksAsyncAction(hzdCreateQueryData, str, new CQG<F1G<FrlBloksAsyncActionQueryResponse>>() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions.asyncActionV2.1
            @Override // X.CQG
            public void onFailure(final Throwable th) {
                C7384Etj.A0Y(th, 0);
                Handler handler2 = AuraAsyncActions.handler;
                final C7633F7q c7633F7q3 = c7633F7q2;
                final FBB fbb2 = fbb;
                handler2.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$asyncActionV2$1$onFailure$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CFK.A08(AuraAsyncActions.TAG, "Failed to fetch Bloks Payload from server (V2)", th);
                        C7633F7q c7633F7q4 = c7633F7q3;
                        if (c7633F7q4 != null) {
                            C9115Fyg c9115Fyg = new C9115Fyg();
                            c9115Fyg.A06(fbb2, 0);
                            c7633F7q4.A00(c9115Fyg.A05(), null);
                        }
                    }
                });
            }

            @Override // X.CQG
            public void onSuccess(final F1G<FrlBloksAsyncActionQueryResponse> f1g) {
                Handler handler2 = AuraAsyncActions.handler;
                final HsM hsM = hsMA0D;
                final HsM hsM2 = hsMA0D2;
                final Context context2 = context;
                final Map<String, Object> map2 = mapA01;
                final FBD fbd2 = fbd;
                final F6D f6d2 = f6d;
                final C7633F7q c7633F7q3 = c7633F7q;
                final C7633F7q c7633F7q4 = c7633F7q2;
                final String str2 = str;
                handler2.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$asyncActionV2$1$onSuccess$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuraAsyncActions auraAsyncActions = AuraAsyncActions.INSTANCE;
                        HjT bloksActionParseResult = auraAsyncActions.getBloksActionParseResult(f1g);
                        if (bloksActionParseResult != null) {
                            try {
                                Context context3 = context2;
                                HashMap mapA0w = BV4.A0w(map2);
                                FBD fbd3 = fbd2;
                                F6D f6d3 = f6d2;
                                C7633F7q c7633F7q5 = c7633F7q3;
                                C7633F7q c7633F7q6 = c7633F7q4;
                                C7384Etj.A0Y(context3, 0);
                                if (f6d3 != null) {
                                    F9J.A01(bloksActionParseResult, c7633F7q5, f6d3, mapA0w);
                                } else if (bloksActionParseResult.A02 != null) {
                                    Object objA00 = F9J.A00(context3, bloksActionParseResult, fbd3, Hj6.A02, mapA0w);
                                    if (c7633F7q5 != null) {
                                        C9115Fyg c9115Fyg = new C9115Fyg();
                                        c9115Fyg.A06(objA00, 0);
                                        c9115Fyg.A06(null, 1);
                                        c7633F7q5.A00(c9115Fyg.A05(), null);
                                    }
                                } else if (c7633F7q6 != null) {
                                    C9115Fyg c9115Fyg2 = new C9115Fyg();
                                    c9115Fyg2.A06(null, 0);
                                    c7633F7q6.A00(c9115Fyg2.A05(), null);
                                }
                                auraAsyncActions.notifyAsyncActionResult(str2);
                            } catch (Exception e) {
                                CFK.A08(AuraAsyncActions.TAG, "asyncActionV2: executeParsedAsyncAction failed", e);
                            }
                        }
                    }
                });
            }
        }, null);
    }

    public final void fetch(Context context, String str, Map<String, String> map, FBD fbd, final Dcy dcy) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass002.A1C(fbd, 3, dcy);
        if (!(fbd instanceof AuraBloksHost)) {
            throw C60O.A0i("Host instance must be an instance of AuraBloksHost to use this");
        }
        Hzd hzd = new Hzd(3);
        hzd.A08(JarvisProtocolKt.APP_ID_QUERY_PARAM, str);
        hzd.A08("bloks_versioning_id", "8b70b804c58d946dc7b47cb242c3c2882614ead1855b79522049fb8c550a8994");
        if (map == null) {
            map = AGH.A0E();
        }
        hzd.A08(AuraBloksDataProps.PARAMS, new JSONObject(map).toString());
        fetchBloksAsyncAction(hzd, str, new CQG<F1G<FrlBloksAsyncActionQueryResponse>>() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions.fetch.1
            @Override // X.CQG
            public void onFailure(final Throwable th) {
                C7384Etj.A0Y(th, 0);
                final Dcy dcy2 = null;
                AuraAsyncActions.handler.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$fetch$1$onFailure$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CFK.A08(AuraAsyncActions.TAG, "Failed to fetch Bloks async action Payload from server", th);
                        throw BV4.A0a("onFailure");
                    }
                });
            }

            @Override // X.CQG
            public void onSuccess(final F1G<FrlBloksAsyncActionQueryResponse> f1g) {
                final Dcy dcy2 = null;
                AuraAsyncActions.handler.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$fetch$1$onSuccess$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AuraAsyncActions.INSTANCE.getBloksActionParseResult(f1g) != null) {
                            throw BV4.A0a("onSuccess");
                        }
                        new Exception("Retrieved `null` Bloks payload for async action");
                        throw BV4.A0a("onFailure");
                    }
                });
            }
        }, null);
    }

    public final void fetchAndRunAsyncAction(final Context context, String str, String str2, final FBD fbd, final AsyncActionCallback asyncActionCallback, Integer num) {
        C7384Etj.A0Y(str, 1);
        fetchBloksAsyncAction(createQueryData(str, str2), str, new CQG<F1G<FrlBloksAsyncActionQueryResponse>>() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions.fetchAndRunAsyncAction.1
            @Override // X.CQG
            public void onFailure(final Throwable th) {
                C7384Etj.A0Y(th, 0);
                Handler handler2 = AuraAsyncActions.handler;
                final AsyncActionCallback asyncActionCallback2 = asyncActionCallback;
                handler2.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$fetchAndRunAsyncAction$1$onFailure$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncActionCallback asyncActionCallback3 = asyncActionCallback2;
                        if (asyncActionCallback3 != null) {
                            asyncActionCallback3.onFailure(th);
                        }
                        CFK.A08(AuraAsyncActions.TAG, "openScreenAsyncAction() Failure", th);
                    }
                });
            }

            @Override // X.CQG
            public void onSuccess(final F1G<FrlBloksAsyncActionQueryResponse> f1g) {
                Handler handler2 = AuraAsyncActions.handler;
                final AsyncActionCallback asyncActionCallback2 = asyncActionCallback;
                final Context context2 = context;
                final FBD fbd2 = fbd;
                handler2.post(new Runnable() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions$fetchAndRunAsyncAction$1$onSuccess$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncActionCallback asyncActionCallback3 = asyncActionCallback2;
                        if (asyncActionCallback3 != null) {
                            asyncActionCallback3.onSuccess();
                        }
                        HjT bloksActionParseResult = AuraAsyncActions.INSTANCE.getBloksActionParseResult(f1g);
                        if (bloksActionParseResult != null) {
                            F9J.A00(context2, bloksActionParseResult, fbd2, Hj6.A02, Collections.EMPTY_MAP);
                        }
                    }
                });
            }
        }, num);
    }

    public final synchronized void registerAsyncActionResultCallback(String str, Function0<Unit> function0) {
        AnonymousClass003.A0u(str, function0);
        asyncActionResultCallbacks.put(str, BV4.A0q(function0));
    }

    public final synchronized void registerErrorCallback(String str, AsyncActionBloksErrorCallback asyncActionBloksErrorCallback) {
        AnonymousClass003.A0u(str, asyncActionBloksErrorCallback);
        cleanupStaleReferences();
        asyncActionBloksErrorCallbacks.put(str, BV4.A0q(asyncActionBloksErrorCallback));
    }

    public final synchronized void unregisterAsyncActionResultCallback(String str) {
        C7384Etj.A0Y(str, 0);
        asyncActionResultCallbacks.remove(str);
    }

    public final synchronized void unregisterErrorCallback(String str) {
        C7384Etj.A0Y(str, 0);
        asyncActionBloksErrorCallbacks.remove(str);
        cleanupStaleReferences();
    }

    public static /* synthetic */ void fetchAndRunAsyncAction$default(AuraAsyncActions auraAsyncActions, Context context, String str, String str2, FBD fbd, AsyncActionCallback asyncActionCallback, Integer num, int i, Object obj) {
        if ((i & 32) != 0) {
            num = null;
        }
        auraAsyncActions.fetchAndRunAsyncAction(context, str, str2, fbd, asyncActionCallback, num);
    }

    private final void fetchBloksAsyncAction(final Hzd hzd, String str, final CQG<F1G<FrlBloksAsyncActionQueryResponse>> cqg, Integer num) {
        DYI<FrlBloksAsyncActionQueryResponse> dyiBuild = new FrlBloksAsyncActionQueryImpl.Builder().setParams(hzd).setBkContext(AuraBloksTemplateContextProvider.INSTANCE.getDefaultBloksTemplateContext()).build();
        PandoGraphQLRequest pandoGraphQLRequest = (PandoGraphQLRequest) dyiBuild;
        pandoGraphQLRequest.m3184setFriendlyName(FGI.A0M("FrlBloksAsyncActionQuery-", str));
        if (num != null) {
            pandoGraphQLRequest.m3187setNetworkTimeoutSeconds(num.intValue());
        }
        AuraGraphQLService.INSTANCE.bloksInstance().execute(dyiBuild, new F0T() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions.fetchBloksAsyncAction.2
            @Override // X.F0T
            public final void invoke(F1G<FrlBloksAsyncActionQueryResponse> f1g) {
                C7384Etj.A0Y(f1g, 0);
                cqg.onSuccess(f1g);
            }
        }, new CPS() { // from class: com.facebook.aura.bloks.extensions.async.AuraAsyncActions.fetchBloksAsyncAction.3
            @Override // X.CPS
            public final void invoke(Throwable th) {
                C7384Etj.A0Y(th, 0);
                cqg.onFailure(th);
                AuraAsyncActions.INSTANCE.notifyError(th, hzd);
                CFK.A08(AuraAsyncActions.TAG, "Error occurred while fetching AsyncAction", th);
            }
        }, EnumC3451CNw.A01);
    }

    public static /* synthetic */ void fetchBloksAsyncAction$default(AuraAsyncActions auraAsyncActions, Hzd hzd, String str, CQG cqg, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        auraAsyncActions.fetchBloksAsyncAction(hzd, str, cqg, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyError(Throwable th, Hzd hzd) {
        Iterator itA0n = AnonymousClass002.A0n(asyncActionBloksErrorCallbacks);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            AsyncActionBloksErrorCallback asyncActionBloksErrorCallback = (AsyncActionBloksErrorCallback) ((Reference) entryA0l.getValue()).get();
            if (asyncActionBloksErrorCallback == null) {
                itA0n.remove();
            } else {
                try {
                    asyncActionBloksErrorCallback.onBloksFetchFailure(th, strA0t);
                } catch (Exception e) {
                    CFK.A08(TAG, "Error occurred while calling onBloksFetchFailure callback", e);
                }
            }
        }
    }

    private final Hzd createQueryData(String str, String str2) {
        Hzd hzdBuildBloksQueryData = buildBloksQueryData(str);
        if (str2 != null) {
            hzdBuildBloksQueryData.A08(AuraBloksDataProps.PARAMS, str2);
        }
        return hzdBuildBloksQueryData;
    }
}
