package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallPortraitJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String appearance;
    public final CallPortraitDisplayCropJson display_crop;

    public final class Companion {
        public final C9hr<CallPortraitJson> serializer() {
            return CallPortraitJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(CallPortraitJson callPortraitJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || callPortraitJson.appearance != null) {
            c9j5.AAP(callPortraitJson.appearance, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || callPortraitJson.display_crop != null) {
            c9j5.AAP(callPortraitJson.display_crop, CallPortraitDisplayCropJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallPortraitJson) {
                CallPortraitJson callPortraitJson = (CallPortraitJson) obj;
                if (!C7384Etj.areEqual(this.appearance, callPortraitJson.appearance) || !C7384Etj.areEqual(this.display_crop, callPortraitJson.display_crop)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallPortraitJson copy$default(CallPortraitJson callPortraitJson, String str, CallPortraitDisplayCropJson callPortraitDisplayCropJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callPortraitJson.appearance;
        }
        if ((i & 2) != 0) {
            callPortraitDisplayCropJson = callPortraitJson.display_crop;
        }
        return new CallPortraitJson(str, callPortraitDisplayCropJson);
    }

    public final String component1() {
        return this.appearance;
    }

    public final CallPortraitDisplayCropJson component2() {
        return this.display_crop;
    }

    public final CallPortraitJson copy(String str, CallPortraitDisplayCropJson callPortraitDisplayCropJson) {
        return new CallPortraitJson(str, callPortraitDisplayCropJson);
    }

    public final String getAppearance() {
        return this.appearance;
    }

    public final CallPortraitDisplayCropJson getDisplay_crop() {
        return this.display_crop;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.appearance) * 31) + C3cH.A02(this.display_crop);
    }

    public CallPortraitJson(String str, CallPortraitDisplayCropJson callPortraitDisplayCropJson) {
        this.appearance = str;
        this.display_crop = callPortraitDisplayCropJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallPortraitJson(int i, String str, CallPortraitDisplayCropJson callPortraitDisplayCropJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.appearance = null;
        } else {
            this.appearance = str;
        }
        if ((i & 2) == 0) {
            this.display_crop = null;
        } else {
            this.display_crop = callPortraitDisplayCropJson;
        }
    }

    public /* synthetic */ CallPortraitJson(String str, CallPortraitDisplayCropJson callPortraitDisplayCropJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : callPortraitDisplayCropJson);
    }

    public CallPortraitJson() {
        this(null, null);
    }
}
