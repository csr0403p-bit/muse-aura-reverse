package com.facebook.aura.qpl.startup.signal;

import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.json.HatchJsonKt;

/* loaded from: classes3.dex */
public final class PointSignalResult {
    public static final Companion Companion = new Companion();
    public final String reason;
    public final String status;

    public PointSignalResult(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
        this.reason = str2;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean isFailure() {
        return "FAILURE".equals(this.status);
    }

    public final String toJson() {
        return HatchJsonKt.HatchJson.A02(new PointSignalResultJson(this.status, this.reason), PointSignalResultJson$$serializer.INSTANCE);
    }

    public final class Companion {
        public final PointSignalResult parse(String str) {
            if (str != null) {
                try {
                    PointSignalResultJson pointSignalResultJson = (PointSignalResultJson) HatchJsonKt.HatchJson.A00(str, PointSignalResultJson$$serializer.INSTANCE);
                    String str2 = pointSignalResultJson.status;
                    if (str2.length() > 0) {
                        return new PointSignalResult(str2, pointSignalResultJson.reason);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ PointSignalResult(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
