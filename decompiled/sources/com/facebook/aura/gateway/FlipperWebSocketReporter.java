package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass751;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8Ky;
import X.C8Kz;
import X.C8L0;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.flipper.core.FlipperObject;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class FlipperWebSocketReporter {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_PENDING = 128;
    public final ConcurrentHashMap<String, PendingEntry> pendingRequests;
    public final C3UX scope;

    public final class PendingEntry {
        public final String flipperRequestId;
        public final String suffix;

        public final String getFlipperRequestId() {
            return this.flipperRequestId;
        }

        public final String getSuffix() {
            return this.suffix;
        }

        public PendingEntry(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.flipperRequestId = str;
            this.suffix = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.FlipperWebSocketReporter$reportReceived$1", f = "FlipperWebSocketReporter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.FlipperWebSocketReporter$reportReceived$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ C8Ky $networkPlugin;
        public final /* synthetic */ String $url;
        public int label;
        public final /* synthetic */ FlipperWebSocketReporter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, FlipperWebSocketReporter flipperWebSocketReporter, C8Ky c8Ky, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$message = str;
            this.this$0 = flipperWebSocketReporter;
            this.$networkPlugin = c8Ky;
            this.$url = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$message, this.this$0, this.$networkPlugin, this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0k;
            C8Kz c8Kz;
            String str;
            String strOptString = "";
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(HatchJsonKt.HatchJson.A04(this.$message));
                if (jsonObjectAsJsonObjectOrNull != null) {
                    strOptString = JsonObjectExtensionsKt.optString(jsonObjectAsJsonObjectOrNull, "id", "");
                }
            } catch (Exception unused) {
            }
            PendingEntry pendingEntryRemove = strOptString.length() > 0 ? this.this$0.pendingRequests.remove(strOptString) : null;
            if (pendingEntryRemove != null) {
                c8Kz = new C8Kz();
                str = this.$message;
                strA0k = pendingEntryRemove.flipperRequestId;
            } else {
                strA0k = AnonymousClass002.A0k();
                C8Ky.A00(this.$networkPlugin, HatchGatewayNetworkLogRecorder.METHOD_WS_EVENT, strA0k, this.this$0.buildFullUri(this.$url, this.this$0.extractSuffix(this.$message)), AbstractC0885AGm.A0y(new C8L0("Content-Type", "application/json")), null, jCurrentTimeMillis);
                c8Kz = new C8Kz();
                str = this.$message;
            }
            c8Kz.A02 = strA0k;
            c8Kz.A01 = jCurrentTimeMillis;
            c8Kz.A00 = 200;
            c8Kz.A04 = C3cG.A1S(str);
            c8Kz.A03 = AbstractC0885AGm.A0y(new C8L0("Content-Type", "application/json"));
            C8Ky c8Ky = this.$networkPlugin;
            synchronized (c8Ky) {
            }
            try {
                synchronized (c8Ky) {
                }
                c8Kz.A04 = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", c8Kz.A02);
                    try {
                        jSONObject.put("timestamp", Long.valueOf(c8Kz.A01));
                        try {
                            jSONObject.put(AuraDeeplinkRouteMapper.STATUS_ROUTE, Integer.valueOf(c8Kz.A00));
                            try {
                                jSONObject.put("reason", (Object) null);
                                List<C8L0> list = c8Kz.A03;
                                JSONArray jSONArray = new JSONArray();
                                for (C8L0 c8l0 : list) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        jSONObject2.put("key", c8l0.A00);
                                        try {
                                            jSONObject2.put(BrowserOperationCatalogKt.VALUE, c8l0.A01);
                                            jSONArray.put(jSONObject2);
                                        } catch (JSONException e) {
                                            throw new RuntimeException(e);
                                        }
                                    } catch (JSONException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                }
                                try {
                                    jSONObject.put("headers", jSONArray);
                                    try {
                                        jSONObject.put("isMock", (Object) false);
                                        try {
                                            jSONObject.put("data", (Object) null);
                                            try {
                                                jSONObject.put("totalChunks", (Object) 1);
                                                try {
                                                    jSONObject.put("index", (Object) 0);
                                                    c8Ky.A01(new FlipperObject(jSONObject));
                                                } catch (JSONException e3) {
                                                    throw new RuntimeException(e3);
                                                }
                                            } catch (JSONException e4) {
                                                throw new RuntimeException(e4);
                                            }
                                        } catch (JSONException e5) {
                                            throw new RuntimeException(e5);
                                        }
                                    } catch (JSONException e6) {
                                        throw new RuntimeException(e6);
                                    }
                                } catch (JSONException e7) {
                                    throw new RuntimeException(e7);
                                }
                            } catch (JSONException e8) {
                                throw new RuntimeException(e8);
                            }
                        } catch (JSONException e9) {
                            throw new RuntimeException(e9);
                        }
                    } catch (JSONException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            } catch (Throwable unused2) {
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.FlipperWebSocketReporter$reportSent$1", f = "FlipperWebSocketReporter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.FlipperWebSocketReporter$reportSent$1, reason: invalid class name and case insensitive filesystem */
    public final class C120281 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ C8Ky $networkPlugin;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C120281(String str, String str2, C8Ky c8Ky, HtJ<? super C120281> htJ) {
            super(2, htJ);
            this.$message = str;
            this.$url = str2;
            this.$networkPlugin = c8Ky;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FlipperWebSocketReporter.this.new C120281(this.$message, this.$url, this.$networkPlugin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            String strA0k = AnonymousClass002.A0k();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strExtractSuffix = FlipperWebSocketReporter.this.extractSuffix(this.$message);
            String strBuildFullUri = FlipperWebSocketReporter.this.buildFullUri(this.$url, strExtractSuffix);
            try {
                JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(HatchJsonKt.HatchJson.A04(this.$message));
                String strA0u = jsonObjectAsJsonObjectOrNull != null ? C60O.A0u(jsonObjectAsJsonObjectOrNull, "id") : "";
                if (strA0u.length() > 0) {
                    FlipperWebSocketReporter.this.pendingRequests.put(strA0u, new PendingEntry(strA0k, strExtractSuffix));
                    if (FlipperWebSocketReporter.this.pendingRequests.size() > 128) {
                        FlipperWebSocketReporter.this.pendingRequests.clear();
                    }
                }
            } catch (Exception unused) {
            }
            C8Ky.A00(this.$networkPlugin, HatchGatewayNetworkLogRecorder.METHOD_WS, strA0k, strBuildFullUri, AbstractC0885AGm.A0y(new C8L0("Content-Type", "application/json")), C3cG.A1S(this.$message), jCurrentTimeMillis);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C120281) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildFullUri(String str, String str2) {
        return FGI.A0M(C7BY.A0Z(str, '/'), str2);
    }

    public final void reportReceived(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        synchronized (AnonymousClass751.class) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractSuffix(String str) {
        String strA0M = "";
        try {
            JsonObject jsonObjectA1H = C60O.A1H(str);
            if (jsonObjectA1H == null) {
                return "";
            }
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1H, AgeCheckFunnelLogging.KEY_METHOD, "");
            String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1H, "event", "");
            JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectA1H, AuraBloksDataProps.PARAMS);
            String strOptStringOrNull = jsonObjectOptJsonObject != null ? JsonObjectExtensionsKt.optStringOrNull(jsonObjectOptJsonObject, "path") : null;
            if (strOptStringOrNull == null) {
                strOptStringOrNull = "";
            }
            strA0M = FGI.A0M(strOptString.length() > 0 ? FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strOptString.replace('.', '/')) : strOptString2.length() > 0 ? FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strOptString2.replace('.', '/')) : "", strOptStringOrNull.length() > 0 ? FGI.A0M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strOptStringOrNull) : "");
            return strA0M;
        } catch (Exception unused) {
            return strA0M;
        }
    }

    private final C8Ky getPlugin() {
        synchronized (AnonymousClass751.class) {
        }
        return null;
    }

    public final class Companion {
        public final FlipperWebSocketReporter create(C3UX c3ux) {
            C7384Etj.A0Y(c3ux, 0);
            return new FlipperWebSocketReporter(c3ux);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FlipperWebSocketReporter(C3UX c3ux) {
        this.scope = c3ux;
        this.pendingRequests = C60O.A1C();
    }

    public final void reportSent(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        synchronized (AnonymousClass751.class) {
        }
    }

    public /* synthetic */ FlipperWebSocketReporter(C3UX c3ux, C06H c06h) {
        this(c3ux);
    }
}
