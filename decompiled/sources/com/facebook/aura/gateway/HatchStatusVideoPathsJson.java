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
public final class HatchStatusVideoPathsJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String connecting;
    public final HatchStatusVideoPathsJson dark;
    public final String idle;
    public final String making_something;
    public final String waking;
    public final String working;

    public final class Companion {
        public final C9hr<HatchStatusVideoPathsJson> serializer() {
            return HatchStatusVideoPathsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchStatusVideoPathsJson() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ HatchStatusVideoPathsJson copy$default(HatchStatusVideoPathsJson hatchStatusVideoPathsJson, String str, String str2, String str3, String str4, String str5, HatchStatusVideoPathsJson hatchStatusVideoPathsJson2, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        HatchStatusVideoPathsJson hatchStatusVideoPathsJson3 = hatchStatusVideoPathsJson2;
        if ((i & 1) != 0) {
            str6 = hatchStatusVideoPathsJson.idle;
        }
        if ((i & 2) != 0) {
            str7 = hatchStatusVideoPathsJson.working;
        }
        if ((i & 4) != 0) {
            str8 = hatchStatusVideoPathsJson.making_something;
        }
        if ((i & 8) != 0) {
            str9 = hatchStatusVideoPathsJson.connecting;
        }
        if ((i & 16) != 0) {
            str10 = hatchStatusVideoPathsJson.waking;
        }
        if ((i & 32) != 0) {
            hatchStatusVideoPathsJson3 = hatchStatusVideoPathsJson.dark;
        }
        return new HatchStatusVideoPathsJson(str6, str7, str8, str9, str10, hatchStatusVideoPathsJson3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(HatchStatusVideoPathsJson hatchStatusVideoPathsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchStatusVideoPathsJson.idle != null) {
            c9j5.AAP(hatchStatusVideoPathsJson.idle, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchStatusVideoPathsJson.working != null) {
            c9j5.AAP(hatchStatusVideoPathsJson.working, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchStatusVideoPathsJson.making_something != null) {
            c9j5.AAP(hatchStatusVideoPathsJson.making_something, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchStatusVideoPathsJson.connecting != null) {
            c9j5.AAP(hatchStatusVideoPathsJson.connecting, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchStatusVideoPathsJson.waking != null) {
            c9j5.AAP(hatchStatusVideoPathsJson.waking, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hatchStatusVideoPathsJson.dark != null) {
            c9j5.AAP(hatchStatusVideoPathsJson.dark, HatchStatusVideoPathsJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStatusVideoPathsJson) {
                HatchStatusVideoPathsJson hatchStatusVideoPathsJson = (HatchStatusVideoPathsJson) obj;
                if (!C7384Etj.areEqual(this.idle, hatchStatusVideoPathsJson.idle) || !C7384Etj.areEqual(this.working, hatchStatusVideoPathsJson.working) || !C7384Etj.areEqual(this.making_something, hatchStatusVideoPathsJson.making_something) || !C7384Etj.areEqual(this.connecting, hatchStatusVideoPathsJson.connecting) || !C7384Etj.areEqual(this.waking, hatchStatusVideoPathsJson.waking) || !C7384Etj.areEqual(this.dark, hatchStatusVideoPathsJson.dark)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.idle;
    }

    public final String component2() {
        return this.working;
    }

    public final String component3() {
        return this.making_something;
    }

    public final String component4() {
        return this.connecting;
    }

    public final String component5() {
        return this.waking;
    }

    public final HatchStatusVideoPathsJson component6() {
        return this.dark;
    }

    public final HatchStatusVideoPathsJson copy(String str, String str2, String str3, String str4, String str5, HatchStatusVideoPathsJson hatchStatusVideoPathsJson) {
        return new HatchStatusVideoPathsJson(str, str2, str3, str4, str5, hatchStatusVideoPathsJson);
    }

    public final String getConnecting() {
        return this.connecting;
    }

    public final HatchStatusVideoPathsJson getDark() {
        return this.dark;
    }

    public final String getIdle() {
        return this.idle;
    }

    public final String getMaking_something() {
        return this.making_something;
    }

    public final String getWaking() {
        return this.waking;
    }

    public final String getWorking() {
        return this.working;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.idle) * 31) + AnonymousClass006.A0G(this.working)) * 31) + AnonymousClass006.A0G(this.making_something)) * 31) + AnonymousClass006.A0G(this.connecting)) * 31) + AnonymousClass006.A0G(this.waking)) * 31) + C3cH.A02(this.dark);
    }

    public String toString() {
        return super.toString();
    }

    public HatchStatusVideoPathsJson(String str, String str2, String str3, String str4, String str5, HatchStatusVideoPathsJson hatchStatusVideoPathsJson) {
        this.idle = str;
        this.working = str2;
        this.making_something = str3;
        this.connecting = str4;
        this.waking = str5;
        this.dark = hatchStatusVideoPathsJson;
    }

    public /* synthetic */ HatchStatusVideoPathsJson(String str, String str2, String str3, String str4, String str5, HatchStatusVideoPathsJson hatchStatusVideoPathsJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : hatchStatusVideoPathsJson);
    }

    public /* synthetic */ HatchStatusVideoPathsJson(int i, String str, String str2, String str3, String str4, String str5, HatchStatusVideoPathsJson hatchStatusVideoPathsJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.idle = null;
        } else {
            this.idle = str;
        }
        if ((i & 2) == 0) {
            this.working = null;
        } else {
            this.working = str2;
        }
        if ((i & 4) == 0) {
            this.making_something = null;
        } else {
            this.making_something = str3;
        }
        if ((i & 8) == 0) {
            this.connecting = null;
        } else {
            this.connecting = str4;
        }
        if ((i & 16) == 0) {
            this.waking = null;
        } else {
            this.waking = str5;
        }
        if ((i & 32) == 0) {
            this.dark = null;
        } else {
            this.dark = hatchStatusVideoPathsJson;
        }
    }
}
