package com.facebook.aura.gateway;

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
/* loaded from: classes2.dex */
public final class CallIdleVideosJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String dark;
    public final DisplayCropJson dark_display_crop;
    public final String light;
    public final DisplayCropJson light_display_crop;

    public final class Companion {
        public final C9hr<CallIdleVideosJson> serializer() {
            return CallIdleVideosJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CallIdleVideosJson callIdleVideosJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || callIdleVideosJson.light != null) {
            c9j5.AAP(callIdleVideosJson.light, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || callIdleVideosJson.light_display_crop != null) {
            c9j5.AAP(callIdleVideosJson.light_display_crop, DisplayCropJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || callIdleVideosJson.dark != null) {
            c9j5.AAP(callIdleVideosJson.dark, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || callIdleVideosJson.dark_display_crop != null) {
            c9j5.AAP(callIdleVideosJson.dark_display_crop, DisplayCropJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallIdleVideosJson) {
                CallIdleVideosJson callIdleVideosJson = (CallIdleVideosJson) obj;
                if (!C7384Etj.areEqual(this.light, callIdleVideosJson.light) || !C7384Etj.areEqual(this.light_display_crop, callIdleVideosJson.light_display_crop) || !C7384Etj.areEqual(this.dark, callIdleVideosJson.dark) || !C7384Etj.areEqual(this.dark_display_crop, callIdleVideosJson.dark_display_crop)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallIdleVideosJson copy$default(CallIdleVideosJson callIdleVideosJson, String str, DisplayCropJson displayCropJson, String str2, DisplayCropJson displayCropJson2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callIdleVideosJson.light;
        }
        if ((i & 2) != 0) {
            displayCropJson = callIdleVideosJson.light_display_crop;
        }
        if ((i & 4) != 0) {
            str2 = callIdleVideosJson.dark;
        }
        if ((i & 8) != 0) {
            displayCropJson2 = callIdleVideosJson.dark_display_crop;
        }
        return new CallIdleVideosJson(str, displayCropJson, str2, displayCropJson2);
    }

    public final String component1() {
        return this.light;
    }

    public final DisplayCropJson component2() {
        return this.light_display_crop;
    }

    public final String component3() {
        return this.dark;
    }

    public final DisplayCropJson component4() {
        return this.dark_display_crop;
    }

    public final CallIdleVideosJson copy(String str, DisplayCropJson displayCropJson, String str2, DisplayCropJson displayCropJson2) {
        return new CallIdleVideosJson(str, displayCropJson, str2, displayCropJson2);
    }

    public final String getDark() {
        return this.dark;
    }

    public final DisplayCropJson getDark_display_crop() {
        return this.dark_display_crop;
    }

    public final String getLight() {
        return this.light;
    }

    public final DisplayCropJson getLight_display_crop() {
        return this.light_display_crop;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.light) * 31) + AnonymousClass006.A0D(this.light_display_crop)) * 31) + AnonymousClass006.A0G(this.dark)) * 31) + C3cH.A02(this.dark_display_crop);
    }

    public CallIdleVideosJson(String str, DisplayCropJson displayCropJson, String str2, DisplayCropJson displayCropJson2) {
        this.light = str;
        this.light_display_crop = displayCropJson;
        this.dark = str2;
        this.dark_display_crop = displayCropJson2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallIdleVideosJson(int i, String str, DisplayCropJson displayCropJson, String str2, DisplayCropJson displayCropJson2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.light = null;
        } else {
            this.light = str;
        }
        if ((i & 2) == 0) {
            this.light_display_crop = null;
        } else {
            this.light_display_crop = displayCropJson;
        }
        if ((i & 4) == 0) {
            this.dark = null;
        } else {
            this.dark = str2;
        }
        if ((i & 8) == 0) {
            this.dark_display_crop = null;
        } else {
            this.dark_display_crop = displayCropJson2;
        }
    }

    public /* synthetic */ CallIdleVideosJson(String str, DisplayCropJson displayCropJson, String str2, DisplayCropJson displayCropJson2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : displayCropJson, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : displayCropJson2);
    }

    public CallIdleVideosJson() {
        this(null, null, null, null);
    }
}
