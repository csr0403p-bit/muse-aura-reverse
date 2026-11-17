package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallJoinLocationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long fix_timestamp_ms;
    public final double latitude;
    public final double longitude;
    public final Long upload_timestamp_ms;

    public final class Companion {
        public final C9hr<CallJoinLocationJson> serializer() {
            return CallJoinLocationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ CallJoinLocationJson copy$default(CallJoinLocationJson callJoinLocationJson, double d, double d2, Long l, Long l2, int i, Object obj) {
        double d3 = d;
        double d4 = d2;
        Long l3 = l;
        Long l4 = l2;
        if ((i & 1) != 0) {
            d3 = callJoinLocationJson.latitude;
        }
        if ((i & 2) != 0) {
            d4 = callJoinLocationJson.longitude;
        }
        if ((i & 4) != 0) {
            l3 = callJoinLocationJson.fix_timestamp_ms;
        }
        if ((i & 8) != 0) {
            l4 = callJoinLocationJson.upload_timestamp_ms;
        }
        return new CallJoinLocationJson(d3, d4, l3, l4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(CallJoinLocationJson callJoinLocationJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAD(c9iZ, callJoinLocationJson.latitude, 0);
        c9j5.AAD(c9iZ, callJoinLocationJson.longitude, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || callJoinLocationJson.fix_timestamp_ms != null) {
            c9j5.AAP(callJoinLocationJson.fix_timestamp_ms, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || callJoinLocationJson.upload_timestamp_ms != null) {
            c9j5.AAP(callJoinLocationJson.upload_timestamp_ms, C9j1.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallJoinLocationJson) {
                CallJoinLocationJson callJoinLocationJson = (CallJoinLocationJson) obj;
                if (Double.compare(this.latitude, callJoinLocationJson.latitude) != 0 || Double.compare(this.longitude, callJoinLocationJson.longitude) != 0 || !C7384Etj.areEqual(this.fix_timestamp_ms, callJoinLocationJson.fix_timestamp_ms) || !C7384Etj.areEqual(this.upload_timestamp_ms, callJoinLocationJson.upload_timestamp_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final Long component3() {
        return this.fix_timestamp_ms;
    }

    public final Long component4() {
        return this.upload_timestamp_ms;
    }

    public final CallJoinLocationJson copy(double d, double d2, Long l, Long l2) {
        return new CallJoinLocationJson(d, d2, l, l2);
    }

    public final Long getFix_timestamp_ms() {
        return this.fix_timestamp_ms;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Long getUpload_timestamp_ms() {
        return this.upload_timestamp_ms;
    }

    public int hashCode() {
        return (((((AnonymousClass002.A0A(Double.doubleToLongBits(this.latitude)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.longitude))) * 31) + AnonymousClass006.A0D(this.fix_timestamp_ms)) * 31) + C3cH.A02(this.upload_timestamp_ms);
    }

    public CallJoinLocationJson(double d, double d2, Long l, Long l2) {
        this.latitude = d;
        this.longitude = d2;
        this.fix_timestamp_ms = l;
        this.upload_timestamp_ms = l2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallJoinLocationJson(int i, double d, double d2, Long l, Long l2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CallJoinLocationJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.latitude = d;
        this.longitude = d2;
        if ((i & 4) == 0) {
            this.fix_timestamp_ms = null;
        } else {
            this.fix_timestamp_ms = l;
        }
        if ((i & 8) == 0) {
            this.upload_timestamp_ms = null;
        } else {
            this.upload_timestamp_ms = l2;
        }
    }

    public /* synthetic */ CallJoinLocationJson(double d, double d2, Long l, Long l2, int i, C06H c06h) {
        this(d, d2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }
}
