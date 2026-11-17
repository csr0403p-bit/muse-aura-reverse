package com.facebook.aura.analytics.hatch;

import X.AGH;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC6676EOt;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7526EzK;
import X.C7BY;
import X.C7N8;
import X.C7NA;
import X.C7NB;
import X.C7NC;
import X.Eu1;
import X.G0U;
import X.HwV;
import android.net.Uri;
import com.facebook.aura.analytics.AuraLogger;
import com.facebook.aura.deeplink.HatchNotificationDeeplinkHandler;
import com.facebook.aura.file.actions.HatchShareKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class HatchAppOpenLogger {
    public static final int $stable = 0;
    public static final String LOGIN_REFIRE_APP_OPEN_SOURCE = "login_refire";
    public static final String TAG = "HatchAppOpenLogger";
    public static final String UTM_CAMPAIGN = "utm_campaign";
    public static final String UTM_MEDIUM = "utm_medium";
    public static final String UTM_SOURCE = "utm_source";
    public static final HatchAppOpenLogger INSTANCE = new HatchAppOpenLogger();
    public static final AtomicReference<PendingAppOpen> pendingLoggedOutOpen = new AtomicReference<>(null);
    public static final Set<String> UTM_PARAMS = C60O.A1A("utm_source", "utm_medium", "utm_campaign");
    public static final Set<String> SECRET_QUERY_PARAMS = C60O.A19("integration_key", HatchNotificationDeeplinkHandler.CARD_TOKEN_PARAM);

    public final class PendingAppOpen extends C06G {
        public final String sourceApplication;
        public final Uri uri;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingAppOpen) {
                    PendingAppOpen pendingAppOpen = (PendingAppOpen) obj;
                    if (!C7384Etj.areEqual(this.uri, pendingAppOpen.uri) || !C7384Etj.areEqual(this.sourceApplication, pendingAppOpen.sourceApplication)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingAppOpen copy$default(PendingAppOpen pendingAppOpen, Uri uri, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = pendingAppOpen.uri;
            }
            if ((i & 2) != 0) {
                str = pendingAppOpen.sourceApplication;
            }
            return new PendingAppOpen(uri, str);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final String component2() {
            return this.sourceApplication;
        }

        public final PendingAppOpen copy(Uri uri, String str) {
            return new PendingAppOpen(uri, str);
        }

        public final String getSourceApplication() {
            return this.sourceApplication;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.uri) * 31) + AnonymousClass005.A0H(this.sourceApplication);
        }

        public PendingAppOpen(Uri uri, String str) {
            this.uri = uri;
            this.sourceApplication = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchAppOpenLogger$emit$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C7NA, C7NB<C7NA>> {
        public final /* synthetic */ String $pigeonSessionId;
        public final /* synthetic */ String $resolvedAppOpenSource;
        public final /* synthetic */ String $sourceApplication;
        public final /* synthetic */ Uri $uri;
        public final /* synthetic */ String $waterfallId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Uri uri, String str, String str2, String str3, String str4) {
            super(1);
            this.$uri = uri;
            this.$resolvedAppOpenSource = str;
            this.$sourceApplication = str2;
            this.$waterfallId = str3;
            this.$pigeonSessionId = str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final C7NB<C7NA> invoke2(C7NA c7na) {
            String string;
            HatchAppOpenLogger hatchAppOpenLogger = HatchAppOpenLogger.INSTANCE;
            HwV<String, String, String> hwVExtractUtmParams = hatchAppOpenLogger.extractUtmParams(this.$uri);
            String str = hwVExtractUtmParams.first;
            String str2 = hwVExtractUtmParams.second;
            String str3 = hwVExtractUtmParams.third;
            Uri uriUriForLogging = hatchAppOpenLogger.uriForLogging(this.$uri);
            if (uriUriForLogging == null || (string = uriUriForLogging.toString()) == null) {
                string = "";
            }
            String str4 = this.$resolvedAppOpenSource;
            if (str4 != null) {
                ((AbstractC6676EOt) c7na).A03("app_open_source", str4);
            }
            AbstractC6676EOt abstractC6676EOt = (AbstractC6676EOt) c7na;
            abstractC6676EOt.A03("url", string);
            abstractC6676EOt.A03(HatchShareKt.ATTRIBUTION_PARAM, this.$sourceApplication);
            abstractC6676EOt.A03("waterfall_id", this.$waterfallId);
            abstractC6676EOt.A03("pigeon_session_id", this.$pigeonSessionId);
            abstractC6676EOt.A03("mobile_app_session_id", HatchSessionId.INSTANCE.get());
            abstractC6676EOt.A02("client_event_time_ms", C60O.A0k());
            abstractC6676EOt.A03("utm_medium", str);
            abstractC6676EOt.A03("utm_source", str2);
            abstractC6676EOt.A03("utm_campaign", str3);
            return c7na;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ C7NB<C7NA> invoke(C7NA c7na) {
            C7NA c7na2 = c7na;
            invoke2(c7na2);
            return c7na2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logAppOpen(android.net.Uri r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r6 = this;
            r3 = r6
            r4 = r7
            r6.uriForLogging(r7)
            java.util.concurrent.atomic.AtomicReference<com.facebook.aura.analytics.hatch.HatchAppOpenLogger$PendingAppOpen> r2 = com.facebook.aura.analytics.hatch.HatchAppOpenLogger.pendingLoggedOutOpen
            java.lang.Object r1 = r2.get()
            com.facebook.aura.analytics.hatch.HatchAppOpenLogger$PendingAppOpen r1 = (com.facebook.aura.analytics.hatch.HatchAppOpenLogger.PendingAppOpen) r1
            r7 = r9
            if (r1 == 0) goto L33
            android.net.Uri r0 = r1.uri
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 == 0) goto L33
            java.lang.String r0 = r1.sourceApplication
            boolean r0 = X.C7384Etj.areEqual(r0, r9)
            if (r0 == 0) goto L33
            r6 = 0
            boolean r0 = X.Bs8.A00(r1, r6, r2)
            if (r0 == 0) goto L33
            android.net.Uri r4 = r1.uri
            java.lang.String r7 = r1.sourceApplication
            java.lang.String r5 = "login_refire"
            r8 = r6
            r9 = r6
        L2f:
            r3.emit(r4, r5, r6, r7, r8, r9)
            return
        L33:
            r5 = 0
            r6 = r8
            r8 = r10
            r9 = r11
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.hatch.HatchAppOpenLogger.logAppOpen(android.net.Uri, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void logLoggedOutAppOpen(Uri uri, String str) {
        uriForLogging(uri);
        emit(uri, null, null, str, null, null);
        pendingLoggedOutOpen.set(new PendingAppOpen(uri, str));
    }

    public final Map<String, String> utmParams(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        Set<String> set = UTM_PARAMS;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            String queryParameter = uri.getQueryParameter(strA0j);
            if (queryParameter != null) {
                AnonymousClass002.A1J(strA0j, queryParameter, arrayListA0h);
            }
        }
        Map<String, String> mapA06 = AGH.A06(arrayListA0h);
        if (mapA06.containsKey("utm_source") || mapA06.containsKey("utm_medium") || mapA06.containsKey("utm_campaign")) {
            return mapA06;
        }
        String queryParameter2 = uri.getQueryParameter("referrer");
        if (queryParameter2 == null) {
            return AGH.A0E();
        }
        List listA0e = C7BY.A0e(queryParameter2, "&");
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(listA0e));
        Iterator it2 = listA0e.iterator();
        while (it2.hasNext()) {
            List listA0i = C7BY.A0i(AnonymousClass005.A0j(it2), new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 2);
            linkedHashMapA15.put(listA0i.get(0), listA0i.size() == 2 ? listA0i.get(1) : "");
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0i = C3cG.A0i(linkedHashMapA15);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            if (set.contains(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        return linkedHashMapA0j;
    }

    private final void emit(Uri uri, String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            str = uri == null ? "organic_app_open" : str2;
        }
        Eu1 eu1AcquireEvent = AuraLogger.INSTANCE.getInstance().acquireEvent("hatch_app_opens", C7526EzK.A02);
        C7N8 c7n8 = new C7N8();
        c7n8.A00 = eu1AcquireEvent;
        C7NC.A00(c7n8, new AnonymousClass1(uri, str, str3, str4, str5));
    }

    public static /* synthetic */ void emit$default(HatchAppOpenLogger hatchAppOpenLogger, Uri uri, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        hatchAppOpenLogger.emit(uri, str, str2, str3, str4, str5);
    }

    public static /* synthetic */ void logAppOpen$default(HatchAppOpenLogger hatchAppOpenLogger, Uri uri, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        hatchAppOpenLogger.logAppOpen(uri, str, str2, str3, str4);
    }

    public final HwV<String, String, String> extractUtmParams(Uri uri) {
        Map<String, String> mapA0E;
        if (uri == null || (mapA0E = utmParams(uri)) == null) {
            mapA0E = AGH.A0E();
        }
        return new HwV<>(mapA0E.get("utm_medium"), mapA0E.get("utm_source"), mapA0E.get("utm_campaign"));
    }

    public final Uri uriForLogging(Uri uri) {
        String strA01;
        List listA0d;
        Uri uriWithoutEntryContextToken = HatchDeferredDeeplinkStore.INSTANCE.withoutEntryContextToken(uri);
        if (uriWithoutEntryContextToken == null) {
            return null;
        }
        String encodedQuery = uriWithoutEntryContextToken.getEncodedQuery();
        if (encodedQuery == null || (listA0d = C7BY.A0d(encodedQuery)) == null) {
            strA01 = null;
        } else {
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : listA0d) {
                String str = (String) obj;
                Set<String> set = SECRET_QUERY_PARAMS;
                String strDecode = Uri.decode(C7BY.A0S(str, str, '='));
                C7384Etj.A0U(strDecode);
                if (!set.contains(strDecode.toLowerCase(Locale.ROOT))) {
                    arrayListA0h.add(obj);
                }
            }
            strA01 = AbstractC06907md.A01("&", arrayListA0h, null);
            if (strA01 == null || strA01.length() == 0) {
                strA01 = null;
            }
        }
        return withoutShareKey(uriWithoutEntryContextToken).buildUpon().encodedQuery(strA01).fragment(null).build();
    }

    private final Uri withoutShareKey(Uri uri) {
        String scheme;
        String host;
        String strA0n;
        List<String> pathSegments = uri.getPathSegments();
        if ((pathSegments.size() != 3 || (strA0n = C60Q.A0n(pathSegments, 0)) == null || !strA0n.equalsIgnoreCase("s")) && (pathSegments.size() != 2 || (scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("hatch") || (host = uri.getHost()) == null || !host.equalsIgnoreCase("s"))) {
            return uri;
        }
        Uri uriBuild = uri.buildUpon().path(AbstractC0878AGe.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, CustomConnectorRegisterRepositoryKt.ROOT_PATH, "", AbstractC0878AGe.A0d(pathSegments, 1), null)).build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }
}
