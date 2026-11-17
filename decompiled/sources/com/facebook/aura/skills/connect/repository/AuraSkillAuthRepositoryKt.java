package com.facebook.aura.skills.connect.repository;

import X.C6tn;
import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* loaded from: classes3.dex */
public abstract class AuraSkillAuthRepositoryKt {
    public static final String AUTH_FLOW_TYPE_CONSENT = "consent";
    public static final String AUTH_FLOW_TYPE_DIRECT_OAUTH = "direct_oauth";
    public static final String AUTH_FLOW_TYPE_WEB = "web";
    public static final String CALLBACK_STATUS_FAILED = "failed";
    public static final int MAX_OAUTH_CONNECTOR_STATES = 32;
    public static final String TAG = "AuraSkillAuthRepo";

    public static final String encodePathSegment(String str) {
        return C6tn.A06(str, HatchWebPageParserKt.UTF_8);
    }
}
