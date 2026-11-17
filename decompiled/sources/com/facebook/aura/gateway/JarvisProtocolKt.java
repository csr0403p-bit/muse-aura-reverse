package com.facebook.aura.gateway;

import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.network.sandbox.HatchDeveloperOverrides;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class JarvisProtocolKt {
    public static final String ACTIVITY_FEED_GOALS_CAPABILITY = "ACTIVITY_FEED_GOALS";
    public static final String ACTIVITY_FEED_GOAL_ACTIONS_LAZY_CAPABILITY = "ACTIVITY_FEED_GOAL_ACTIONS_LAZY";
    public static final String AUTH_TOKEN_QUERY_PARAM = "auth_token";
    public static final int CHAT_SUBSCRIBE_REPLAY_LIMIT = 500;
    public static final String DEFAULT_FILE_NAME = "file";
    public static final String DEFAULT_IDEA_KIND = "item";
    public static final String DEFAULT_MIME_TYPE = "application/octet-stream";
    public static final String LOCAL_MAP_ELEMENT_KIND_MARKER = "marker";
    public static final String LOCAL_MAP_ELEMENT_KIND_RICH_PLACE = "rich_place";
    public static final int MAX_TRACKED_USER_LIVE_TRANSCRIPTS = 256;
    public static final String MISSING_LOG_VALUE = "<missing>";
    public static final String NONE_LOG_VALUE = "<none>";
    public static final String PRIMARY_CURSOR_KEY = "__primary__";
    public static final String SPACES_PLACEMENT_CAPABILITY = "spaces_placement";
    public static final String TAG = "JarvisProtocol";
    public static final String UNKNOWN_CONNECTION_ATTEMPT_ID = "unknown";
    public static final String USER_LIVE_TRANSCRIPT_SOURCE = "runtime.user_live_transcript";
    public static final String VM_ID_QUERY_PARAM = "vm_id";
    public static final Set<String> DISPLAY_TEXT_FALLBACK_KINDS = Collections.singleton(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_MARKETPLACE_MAP);
    public static final String APP_ID_QUERY_PARAM = "app_id";
    public static final String APP_VERSION_QUERY_PARAM = "app_version";
    public static final String ATOD_TOKEN_QUERY_PARAM = "atod_token";
    public static final Set<String> MANAGED_CONNECTION_QUERY_PARAMS = BFI.A0H(new String[]{"auth_token", APP_ID_QUERY_PARAM, APP_VERSION_QUERY_PARAM, "vm_id", ATOD_TOKEN_QUERY_PARAM});

    public static /* synthetic */ String jarvisConnectionUrl$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return jarvisConnectionUrl(str, str2, z);
    }

    public static final void appendExistingQueryParametersTo(Uri uri, Uri.Builder builder, Set<String> set) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (AbstractC2159Azp.A12(AnonymousClass005.A0j(it2), strA0j, true)) {
                        break;
                    }
                }
            }
            Iterator<String> it3 = uri.getQueryParameters(strA0j).iterator();
            while (it3.hasNext()) {
                builder.appendQueryParameter(strA0j, AnonymousClass005.A0j(it3));
            }
        }
    }

    public static final String firstQueryParameterIgnoreCase(Uri uri, String str) {
        String strA0l;
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                return null;
            }
            String strA0j = AnonymousClass005.A0j(it);
            if (AbstractC2159Azp.A12(strA0j, str, true)) {
                List<String> queryParameters = uri.getQueryParameters(strA0j);
                C7384Etj.A0U(queryParameters);
                Iterator<String> it2 = queryParameters.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    String str3 = next;
                    C7384Etj.A0X(str3);
                    if (!C7BY.A0j(str3)) {
                        str2 = next;
                        break;
                    }
                }
                String str4 = str2;
                if (str4 != null && (strA0l = AnonymousClass002.A0l(str4)) != null) {
                    return strA0l;
                }
            }
        }
    }

    public static final String jarvisConnectionUrl(String str, String str2, boolean z) {
        String str3;
        String strA0l;
        AnonymousClass003.A0u(str, str2);
        String strA0l2 = AnonymousClass002.A0l(str);
        Uri uri = Uri.parse(strA0l2);
        C7384Etj.A0X(uri);
        String strFirstQueryParameterIgnoreCase = firstQueryParameterIgnoreCase(uri, "vm_id");
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        C7384Etj.A0X(builderClearQuery);
        appendExistingQueryParametersTo(uri, builderClearQuery, MANAGED_CONNECTION_QUERY_PARAMS);
        builderClearQuery.appendQueryParameter("auth_token", AnonymousClass002.A0l(str2)).appendQueryParameter(APP_ID_QUERY_PARAM, "4331325740476680").appendQueryParameter(APP_VERSION_QUERY_PARAM, "16.0.0.11.159");
        if (strFirstQueryParameterIgnoreCase != null || (strFirstQueryParameterIgnoreCase = HatcheryVMIdUtilsKt.extractHatcheryVMId(strA0l2)) != null) {
            builderClearQuery.appendQueryParameter("vm_id", strFirstQueryParameterIgnoreCase);
        }
        if (z && (str3 = HatchDeveloperOverrides.cachedAtodToken) != null && (strA0l = AnonymousClass002.A0l(str3)) != null && strA0l.length() > 0) {
            builderClearQuery.appendQueryParameter(ATOD_TOKEN_QUERY_PARAM, strA0l);
        }
        return C60R.A0b(builderClearQuery);
    }
}
