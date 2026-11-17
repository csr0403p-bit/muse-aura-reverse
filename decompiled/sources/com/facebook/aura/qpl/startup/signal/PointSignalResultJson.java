package com.facebook.aura.qpl.startup.signal;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PointSignalResultJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String reason;
    public final String status;

    public final class Companion {
        public final C9hr<PointSignalResultJson> serializer() {
            return PointSignalResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PointSignalResultJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
        this.reason = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_qpl_startup_signal_signal(PointSignalResultJson pointSignalResultJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(pointSignalResultJson.status)) {
            c9j5.AAV(pointSignalResultJson.status, c9iZ, 0);
        }
        if (zAfR || pointSignalResultJson.reason != null) {
            c9j5.AAP(pointSignalResultJson.reason, C07779iq.A01, c9iZ, 1);
        }
    }

    public final PointSignalResultJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new PointSignalResultJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PointSignalResultJson) {
                PointSignalResultJson pointSignalResultJson = (PointSignalResultJson) obj;
                if (!C7384Etj.areEqual(this.status, pointSignalResultJson.status) || !C7384Etj.areEqual(this.reason, pointSignalResultJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PointSignalResultJson copy$default(PointSignalResultJson pointSignalResultJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pointSignalResultJson.status;
        }
        if ((i & 2) != 0) {
            str2 = pointSignalResultJson.reason;
        }
        C7384Etj.A0Y(str, 0);
        return new PointSignalResultJson(str, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.reason;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.status) + AnonymousClass006.A0G(this.reason);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PointSignalResultJson(int i, String str, String str2, C2hx c2hx) {
        this.status = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.reason = null;
        } else {
            this.reason = str2;
        }
    }

    public /* synthetic */ PointSignalResultJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public PointSignalResultJson() {
        this("", null);
    }
}
