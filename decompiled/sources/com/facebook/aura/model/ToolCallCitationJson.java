package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ToolCallCitationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String citation_id;
    public final String url;

    public final class Companion {
        public final C9hr<ToolCallCitationJson> serializer() {
            return ToolCallCitationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ToolCallCitationJson toolCallCitationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || toolCallCitationJson.citation_id != null) {
            c9j5.AAP(toolCallCitationJson.citation_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || toolCallCitationJson.url != null) {
            c9j5.AAP(toolCallCitationJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ToolCallCitationJson) {
                ToolCallCitationJson toolCallCitationJson = (ToolCallCitationJson) obj;
                if (!C7384Etj.areEqual(this.citation_id, toolCallCitationJson.citation_id) || !C7384Etj.areEqual(this.url, toolCallCitationJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ToolCallCitationJson copy$default(ToolCallCitationJson toolCallCitationJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolCallCitationJson.citation_id;
        }
        if ((i & 2) != 0) {
            str2 = toolCallCitationJson.url;
        }
        return new ToolCallCitationJson(str, str2);
    }

    public final String component1() {
        return this.citation_id;
    }

    public final String component2() {
        return this.url;
    }

    public final ToolCallCitationJson copy(String str, String str2) {
        return new ToolCallCitationJson(str, str2);
    }

    public final String getCitation_id() {
        return this.citation_id;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.citation_id) * 31) + AnonymousClass005.A0H(this.url);
    }

    public ToolCallCitationJson(String str, String str2) {
        this.citation_id = str;
        this.url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ToolCallCitationJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.citation_id = null;
        } else {
            this.citation_id = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public /* synthetic */ ToolCallCitationJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ToolCallCitationJson() {
        this(null, null);
    }
}
