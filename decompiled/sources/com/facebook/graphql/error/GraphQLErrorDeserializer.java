package com.facebook.graphql.error;

import X.BV4;
import X.BV8;
import X.F60;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.common.json.FbJsonField;
import com.google.common.base.Throwables;
import java.util.Map;

/* loaded from: classes5.dex */
public class GraphQLErrorDeserializer extends FbJsonDeserializer {
    public static Map<String, FbJsonField> A00;

    @Override // com.facebook.common.json.FbJsonDeserializer
    public final FbJsonField A0p(String str) {
        FbJsonField fbJsonFieldA0e;
        synchronized (GraphQLErrorDeserializer.class) {
            Map<String, FbJsonField> map = A00;
            try {
                if (map != null) {
                    fbJsonFieldA0e = map.get(str);
                    if (fbJsonFieldA0e == null) {
                    }
                    return fbJsonFieldA0e;
                }
                A00 = BV4.A0u();
                switch (str.hashCode()) {
                    case -2001855728:
                        if (str.equals("sentry_block_user_info")) {
                            fbJsonFieldA0e = BV8.A0e("sentryBlockUserInfo");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -1857640538:
                        if (str.equals("summary")) {
                            fbJsonFieldA0e = BV8.A0e("summary");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -1840544998:
                        if (str.equals("debug_info")) {
                            fbJsonFieldA0e = BV8.A0e("debugInfo");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -1724546052:
                        if (str.equals(HatchWebPageParserKt.DESCRIPTION)) {
                            fbJsonFieldA0e = BV8.A0e(HatchWebPageParserKt.DESCRIPTION);
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -1198128887:
                        if (str.equals("api_error_code")) {
                            fbJsonFieldA0e = BV8.A0e("apiErrorCode");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -1090636345:
                        if (str.equals("help_center_id")) {
                            fbJsonFieldA0e = BV8.A0e("helpCenterId");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -438288118:
                        if (str.equals("is_silent")) {
                            fbJsonFieldA0e = BV8.A0e("isSilent");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -258359883:
                        if (str.equals("is_transient")) {
                            fbJsonFieldA0e = BV8.A0e("isTransient");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case -168279748:
                        if (str.equals("query_path")) {
                            fbJsonFieldA0e = BV8.A0e("queryPath");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case 3059181:
                        if (str.equals(AuraDeeplinkRouteMapper.CODE_PARAM)) {
                            fbJsonFieldA0e = BV8.A0e(AuraDeeplinkRouteMapper.CODE_PARAM);
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case 1028291630:
                        if (str.equals("fb_request_id")) {
                            fbJsonFieldA0e = BV8.A0e("fbRequestId");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case 1478300413:
                        if (str.equals("severity")) {
                            fbJsonFieldA0e = BV8.A0e("severity");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    case 1503300620:
                        if (str.equals("requires_reauth")) {
                            fbJsonFieldA0e = BV8.A0e("requiresReauth");
                            A00.put(str, fbJsonFieldA0e);
                            return fbJsonFieldA0e;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (Exception e) {
                Throwables.propagate(e);
                throw F60.createAndThrow();
            }
        }
    }

    public GraphQLErrorDeserializer() {
        this.A00 = GraphQLError.class;
    }
}
