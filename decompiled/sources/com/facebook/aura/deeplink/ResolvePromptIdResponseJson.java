package com.facebook.aura.deeplink;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ResolvePromptIdResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String prompt_id;
    public final String text;

    public final class Companion {
        public final C9hr<ResolvePromptIdResponseJson> serializer() {
            return ResolvePromptIdResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_deeplink_deeplink(ResolvePromptIdResponseJson resolvePromptIdResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(resolvePromptIdResponseJson.prompt_id)) {
            c9j5.AAV(resolvePromptIdResponseJson.prompt_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(resolvePromptIdResponseJson.text)) {
            c9j5.AAV(resolvePromptIdResponseJson.text, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResolvePromptIdResponseJson) {
                ResolvePromptIdResponseJson resolvePromptIdResponseJson = (ResolvePromptIdResponseJson) obj;
                if (!C7384Etj.areEqual(this.prompt_id, resolvePromptIdResponseJson.prompt_id) || !C7384Etj.areEqual(this.text, resolvePromptIdResponseJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ResolvePromptIdResponseJson copy$default(ResolvePromptIdResponseJson resolvePromptIdResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resolvePromptIdResponseJson.prompt_id;
        }
        if ((i & 2) != 0) {
            str2 = resolvePromptIdResponseJson.text;
        }
        AnonymousClass003.A0u(str, str2);
        return new ResolvePromptIdResponseJson(str, str2);
    }

    public final String component1() {
        return this.prompt_id;
    }

    public final String component2() {
        return this.text;
    }

    public final String getPrompt_id() {
        return this.prompt_id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass001.A0G(this.prompt_id));
    }

    public ResolvePromptIdResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.prompt_id = str;
        this.text = str2;
    }

    public final ResolvePromptIdResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ResolvePromptIdResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ResolvePromptIdResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ ResolvePromptIdResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.prompt_id = "";
        } else {
            this.prompt_id = str;
        }
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
    }

    public ResolvePromptIdResponseJson() {
        this("", "");
    }
}
