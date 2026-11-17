package com.facebook.aura.analytics.waterfall;

import X.AbstractC5321DgF;
import X.C7384Etj;
import X.C8j4;
import X.C98f;
import X.CFK;
import X.F0C;
import android.net.Uri;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchNMEEntrypointAttribution {
    public static final String ENTRYPOINT_QUERY_PARAM = "entrypoint";
    public static final int MAX_TRACKED_NOTIFICATION_IMPRESSIONS = 256;
    public static final String TAG = "HatchNMEAttribution";
    public static final HatchNMEEntrypointAttribution INSTANCE = new HatchNMEEntrypointAttribution();
    public static final F0C entrypointsByValue$delegate = AbstractC5321DgF.A03(HatchNMEEntrypointAttribution$entrypointsByValue$2.INSTANCE);
    public static final HatchNMEEntrypointAttribution$loggedNotificationImpressions$1 loggedNotificationImpressions = new LinkedHashMap<String, Unit>() { // from class: com.facebook.aura.analytics.waterfall.HatchNMEEntrypointAttribution$loggedNotificationImpressions$1
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return super.containsKey(obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Unit) {
                return super.containsValue(obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Unit get(Object obj) {
            if (obj instanceof String) {
                return (Unit) super.get(obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            super.getOrDefault(obj, obj2);
            return Unit.INSTANCE;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Unit remove(Object obj) {
            if (obj instanceof String) {
                return (Unit) super.remove(obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Unit>> entrySet() {
            return super.entrySet();
        }

        public /* bridge */ Set<Map.Entry<String, Unit>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Unit> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Unit> entry) {
            return C8j4.A1V(size(), 256);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return super.size();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Unit> values() {
            return super.values();
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(Unit unit) {
            return super.containsValue((Object) unit);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return super.get(obj);
        }

        public final /* bridge */ void getOrDefault(Object obj, Unit unit) {
            if (obj instanceof String) {
                super.getOrDefault(obj, (Object) unit);
            }
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof Unit)) {
                return false;
            }
            return super.remove(obj, obj2);
        }

        public /* bridge */ Unit get(String str) {
            return (Unit) super.get((Object) str);
        }

        public /* bridge */ void getOrDefault(String str, Unit unit) {
            super.getOrDefault((Object) str, (String) unit);
        }

        public /* bridge */ boolean remove(String str, Unit unit) {
            return super.remove((Object) str, (Object) unit);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return super.remove(obj);
        }

        public /* bridge */ Unit remove(String str) {
            return (Unit) super.remove((Object) str);
        }
    };

    public final C98f entrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall(Uri uri) {
        String queryParameter;
        if (uri == null || !uri.isHierarchical() || (queryParameter = uri.getQueryParameter("entrypoint")) == null) {
            return null;
        }
        return fromRawValue(queryParameter);
    }

    public final void logImpression(Uri uri, String str) {
        C7384Etj.A0Y(str, 1);
        try {
            C98f c98fEntrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall = entrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall(uri);
            if (c98fEntrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall != null) {
                HatchNMEEntrypointAttribution$loggedNotificationImpressions$1 hatchNMEEntrypointAttribution$loggedNotificationImpressions$1 = loggedNotificationImpressions;
                synchronized (hatchNMEEntrypointAttribution$loggedNotificationImpressions$1) {
                    if (hatchNMEEntrypointAttribution$loggedNotificationImpressions$1.get((Object) str) == null && new HatchNMEEntrypointLogger(null, 1, null).logImpression(c98fEntrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall, null)) {
                        hatchNMEEntrypointAttribution$loggedNotificationImpressions$1.put(str, Unit.INSTANCE);
                    }
                }
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "notification impression attribution logger threw");
        }
    }

    private final Map<String, C98f> getEntrypointsByValue() {
        return (Map) entrypointsByValue$delegate.getValue();
    }

    public final C98f fromRawValue(String str) {
        if (str != null) {
            return (C98f) ((Map) entrypointsByValue$delegate.getValue()).get(str);
        }
        return null;
    }

    public final void logClick(Uri uri) {
        try {
            C98f c98fEntrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall = entrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall(uri);
            if (c98fEntrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall != null) {
                new HatchNMEEntrypointLogger(null, 1, null).logClick(c98fEntrypointFromUri$fbandroid_express_aura_java_com_facebook_aura_analytics_waterfall_waterfall, null);
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "notification click attribution logger threw");
        }
    }
}
