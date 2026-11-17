package com.facebook.graphql.error;

import X.AbstractC9783GgU;
import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.C9784Ggl;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes5.dex */
public class GraphQLErrorSerializer extends JsonSerializer<GraphQLError> {
    static {
        C9784Ggl.A02.putIfAbsent(GraphQLError.class, new GraphQLErrorSerializer());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0C(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) throws JsonGenerationException {
        GraphQLError graphQLError = (GraphQLError) obj;
        if (graphQLError == null) {
            abstractC9919GlE.A0R();
        }
        abstractC9919GlE.A0T();
        int i = graphQLError.code;
        abstractC9919GlE.A0o(AuraDeeplinkRouteMapper.CODE_PARAM);
        abstractC9919GlE.A0X(i);
        int i2 = graphQLError.apiErrorCode;
        abstractC9919GlE.A0o("api_error_code");
        abstractC9919GlE.A0X(i2);
        String str = graphQLError.summary;
        if (str != null) {
            abstractC9919GlE.A0o("summary");
            abstractC9919GlE.A0s(str);
        }
        String str2 = graphQLError.description;
        if (str2 != null) {
            abstractC9919GlE.A0o(HatchWebPageParserKt.DESCRIPTION);
            abstractC9919GlE.A0s(str2);
        }
        boolean z = graphQLError.isSilent;
        abstractC9919GlE.A0o("is_silent");
        abstractC9919GlE.A0w(z);
        boolean z2 = graphQLError.isTransient;
        abstractC9919GlE.A0o("is_transient");
        abstractC9919GlE.A0w(z2);
        String str3 = graphQLError.fbRequestId;
        if (str3 != null) {
            abstractC9919GlE.A0o("fb_request_id");
            abstractC9919GlE.A0s(str3);
        }
        boolean z3 = graphQLError.requiresReauth;
        abstractC9919GlE.A0o("requires_reauth");
        abstractC9919GlE.A0w(z3);
        String str4 = graphQLError.debugInfo;
        if (str4 != null) {
            abstractC9919GlE.A0o("debug_info");
            abstractC9919GlE.A0s(str4);
        }
        String str5 = graphQLError.queryPath;
        if (str5 != null) {
            abstractC9919GlE.A0o("query_path");
            abstractC9919GlE.A0s(str5);
        }
        ImmutableMap<String, String> immutableMap = graphQLError.sentryBlockUserInfo;
        if (immutableMap != null) {
            abstractC9919GlE.A0o("sentry_block_user_info");
            AbstractC9783GgU.A00(abstractC9919GlE, abstractC9842Gii, immutableMap);
        }
        String str6 = graphQLError.severity;
        if (str6 != null) {
            abstractC9919GlE.A0o("severity");
            abstractC9919GlE.A0s(str6);
        }
        long j = graphQLError.helpCenterId;
        abstractC9919GlE.A0o("help_center_id");
        abstractC9919GlE.A0Y(j);
        abstractC9919GlE.A0Q();
    }
}
