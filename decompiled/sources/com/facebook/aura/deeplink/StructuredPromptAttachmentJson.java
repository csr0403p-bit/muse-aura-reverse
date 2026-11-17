package com.facebook.aura.deeplink;

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
public final class StructuredPromptAttachmentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String url;

    public final class Companion {
        public final C9hr<StructuredPromptAttachmentJson> serializer() {
            return StructuredPromptAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(StructuredPromptAttachmentJson structuredPromptAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || structuredPromptAttachmentJson.url != null) {
            c9j5.AAP(structuredPromptAttachmentJson.url, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StructuredPromptAttachmentJson) && C7384Etj.areEqual(this.url, ((StructuredPromptAttachmentJson) obj).url));
    }

    public static /* synthetic */ StructuredPromptAttachmentJson copy$default(StructuredPromptAttachmentJson structuredPromptAttachmentJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = structuredPromptAttachmentJson.url;
        }
        return new StructuredPromptAttachmentJson(str);
    }

    public final String component1() {
        return this.url;
    }

    public final StructuredPromptAttachmentJson copy(String str) {
        return new StructuredPromptAttachmentJson(str);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.url);
    }

    public /* synthetic */ StructuredPromptAttachmentJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public StructuredPromptAttachmentJson(String str) {
        this.url = str;
    }

    public /* synthetic */ StructuredPromptAttachmentJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public StructuredPromptAttachmentJson() {
        this(null);
    }
}
