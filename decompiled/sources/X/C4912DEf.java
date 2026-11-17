package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.DEf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4912DEf implements InterfaceC5903Drm {
    public final InbandTelemetryBweEstimate A00;

    public final boolean equals(Object obj) {
        if (obj == null || !BV5.A1T(this, obj)) {
            return false;
        }
        return this.A00.equals(((C4912DEf) obj).A00);
    }

    public static C4912DEf A00() {
        return new C4912DEf(new InbandTelemetryBweEstimate(new InbandTelemetryBweEstimate.Builder()));
    }

    @Override // X.InterfaceC5903Drm
    public final /* synthetic */ C5480DjH ADi() {
        return null;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C4912DEf(InbandTelemetryBweEstimate inbandTelemetryBweEstimate) {
        this.A00 = inbandTelemetryBweEstimate;
    }

    @Override // X.InterfaceC5903Drm
    public final long AFL(int i) {
        return -1L;
    }

    @Override // X.InterfaceC5903Drm
    public final long AFM(String str, int i) {
        return -1L;
    }

    @Override // X.InterfaceC5903Drm
    public final long AFJ(String str, int i, long j) {
        return -1L;
    }
}
