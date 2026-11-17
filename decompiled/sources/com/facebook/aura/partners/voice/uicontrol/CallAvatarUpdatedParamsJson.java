package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class CallAvatarUpdatedParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String avatar_image_path;
    public final String avatar_stem;
    public final JsonElement call_portrait;
    public final String reason;
    public final boolean started_on_previous;
    public final String status;
    public final String target_call_id;

    public final class Companion {
        public final C9hr<CallAvatarUpdatedParamsJson> serializer() {
            return CallAvatarUpdatedParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CallAvatarUpdatedParamsJson() {
        this(null, null, null, null, null, null, false);
    }

    public static /* synthetic */ CallAvatarUpdatedParamsJson copy$default(CallAvatarUpdatedParamsJson callAvatarUpdatedParamsJson, String str, String str2, JsonElement jsonElement, String str3, String str4, String str5, boolean z, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        JsonElement jsonElement2 = jsonElement;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str6 = callAvatarUpdatedParamsJson.target_call_id;
        }
        if ((i & 2) != 0) {
            str7 = callAvatarUpdatedParamsJson.status;
        }
        if ((i & 4) != 0) {
            jsonElement2 = callAvatarUpdatedParamsJson.call_portrait;
        }
        if ((i & 8) != 0) {
            str8 = callAvatarUpdatedParamsJson.reason;
        }
        if ((i & 16) != 0) {
            str9 = callAvatarUpdatedParamsJson.avatar_stem;
        }
        if ((i & 32) != 0) {
            str10 = callAvatarUpdatedParamsJson.avatar_image_path;
        }
        if ((i & 64) != 0) {
            z2 = callAvatarUpdatedParamsJson.started_on_previous;
        }
        return new CallAvatarUpdatedParamsJson(str6, str7, jsonElement2, str8, str9, str10, z2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_uicontrol_uicontrol(CallAvatarUpdatedParamsJson callAvatarUpdatedParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || callAvatarUpdatedParamsJson.target_call_id != null) {
            c9j5.AAP(callAvatarUpdatedParamsJson.target_call_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || callAvatarUpdatedParamsJson.status != null) {
            c9j5.AAP(callAvatarUpdatedParamsJson.status, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || callAvatarUpdatedParamsJson.call_portrait != null) {
            c9j5.AAP(callAvatarUpdatedParamsJson.call_portrait, JsonElementSerializer.A00, c9iZ, 2);
        }
        if (zAfR || callAvatarUpdatedParamsJson.reason != null) {
            c9j5.AAP(callAvatarUpdatedParamsJson.reason, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || callAvatarUpdatedParamsJson.avatar_stem != null) {
            c9j5.AAP(callAvatarUpdatedParamsJson.avatar_stem, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || callAvatarUpdatedParamsJson.avatar_image_path != null) {
            c9j5.AAP(callAvatarUpdatedParamsJson.avatar_image_path, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || callAvatarUpdatedParamsJson.started_on_previous) {
            c9j5.AA7(c9iZ, 6, callAvatarUpdatedParamsJson.started_on_previous);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallAvatarUpdatedParamsJson) {
                CallAvatarUpdatedParamsJson callAvatarUpdatedParamsJson = (CallAvatarUpdatedParamsJson) obj;
                if (!C7384Etj.areEqual(this.target_call_id, callAvatarUpdatedParamsJson.target_call_id) || !C7384Etj.areEqual(this.status, callAvatarUpdatedParamsJson.status) || !C7384Etj.areEqual(this.call_portrait, callAvatarUpdatedParamsJson.call_portrait) || !C7384Etj.areEqual(this.reason, callAvatarUpdatedParamsJson.reason) || !C7384Etj.areEqual(this.avatar_stem, callAvatarUpdatedParamsJson.avatar_stem) || !C7384Etj.areEqual(this.avatar_image_path, callAvatarUpdatedParamsJson.avatar_image_path) || this.started_on_previous != callAvatarUpdatedParamsJson.started_on_previous) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.target_call_id;
    }

    public final String component2() {
        return this.status;
    }

    public final JsonElement component3() {
        return this.call_portrait;
    }

    public final String component4() {
        return this.reason;
    }

    public final String component5() {
        return this.avatar_stem;
    }

    public final String component6() {
        return this.avatar_image_path;
    }

    public final boolean component7() {
        return this.started_on_previous;
    }

    public final CallAvatarUpdatedParamsJson copy(String str, String str2, JsonElement jsonElement, String str3, String str4, String str5, boolean z) {
        return new CallAvatarUpdatedParamsJson(str, str2, jsonElement, str3, str4, str5, z);
    }

    public final String getAvatar_image_path() {
        return this.avatar_image_path;
    }

    public final String getAvatar_stem() {
        return this.avatar_stem;
    }

    public final JsonElement getCall_portrait() {
        return this.call_portrait;
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getStarted_on_previous() {
        return this.started_on_previous;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTarget_call_id() {
        return this.target_call_id;
    }

    public int hashCode() {
        return C0KA.A00(((((((((((AnonymousClass006.A0G(this.target_call_id) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0D(this.call_portrait)) * 31) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass006.A0G(this.avatar_stem)) * 31) + AnonymousClass005.A0H(this.avatar_image_path)) * 31, this.started_on_previous);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallAvatarUpdatedParamsJson(int i, String str, String str2, JsonElement jsonElement, String str3, String str4, String str5, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.target_call_id = null;
        } else {
            this.target_call_id = str;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.call_portrait = null;
        } else {
            this.call_portrait = jsonElement;
        }
        if ((i & 8) == 0) {
            this.reason = null;
        } else {
            this.reason = str3;
        }
        if ((i & 16) == 0) {
            this.avatar_stem = null;
        } else {
            this.avatar_stem = str4;
        }
        if ((i & 32) == 0) {
            this.avatar_image_path = null;
        } else {
            this.avatar_image_path = str5;
        }
        if ((i & 64) == 0) {
            this.started_on_previous = false;
        } else {
            this.started_on_previous = z;
        }
    }

    public CallAvatarUpdatedParamsJson(String str, String str2, JsonElement jsonElement, String str3, String str4, String str5, boolean z) {
        this.target_call_id = str;
        this.status = str2;
        this.call_portrait = jsonElement;
        this.reason = str3;
        this.avatar_stem = str4;
        this.avatar_image_path = str5;
        this.started_on_previous = z;
    }

    public /* synthetic */ CallAvatarUpdatedParamsJson(String str, String str2, JsonElement jsonElement, String str3, String str4, String str5, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, C3cH.A1M(i, z));
    }
}
