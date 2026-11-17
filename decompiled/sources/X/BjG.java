package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* loaded from: classes5.dex */
public final class BjG implements InterfaceC2741Bji {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public C3010Brs<Void> A02;
    public boolean A03;
    public final Range<Float> A04;
    public final C2476Bc3 A05;

    @Override // X.InterfaceC2741Bji
    public final void A3s(BgU bgU) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.A00);
        BY1 by1 = BY1.REQUIRED;
        bgU.A00(key, by1, fValueOf);
        if (!this.A03 || Build.VERSION.SDK_INT < 34) {
            return;
        }
        bgU.A00(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, by1, 1);
    }

    @Override // X.InterfaceC2741Bji
    public final Rect AED() {
        Object objA02 = this.A05.A02(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        objA02.getClass();
        return (Rect) objA02;
    }

    @Override // X.InterfaceC2741Bji
    public final float AHU() {
        return AnonymousClass001.A02(this.A04.getUpper());
    }

    @Override // X.InterfaceC2741Bji
    public final float AHk() {
        return AnonymousClass001.A02(this.A04.getLower());
    }

    @Override // X.InterfaceC2741Bji
    public final void AS9(TotalCaptureResult totalCaptureResult) {
        CaptureRequest request;
        Number number;
        if (this.A02 == null || (request = totalCaptureResult.getRequest()) == null || (number = (Number) request.get(CaptureRequest.CONTROL_ZOOM_RATIO)) == null) {
            return;
        }
        if (this.A01 == number.floatValue()) {
            this.A02.A03(null);
            this.A02 = null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (FLX/Brs<Ljava/lang/Void;>;)V */
    @Override // X.InterfaceC2741Bji
    public final void AfJ(C3010Brs c3010Brs, float f) {
        this.A00 = f;
        C3010Brs<Void> c3010Brs2 = this.A02;
        if (c3010Brs2 != null) {
            C3010Brs.A01(c3010Brs2, "There is a new zoomRatio being set");
        }
        this.A01 = this.A00;
        this.A02 = c3010Brs;
    }

    @Override // X.InterfaceC2741Bji
    public final void resetZoom() {
        this.A00 = 1.0f;
        C3010Brs<Void> c3010Brs = this.A02;
        if (c3010Brs != null) {
            C3010Brs.A01(c3010Brs, "Camera is not active.");
            this.A02 = null;
        }
    }

    public BjG(C2476Bc3 c2476Bc3) {
        this.A05 = c2476Bc3;
        this.A04 = (Range) c2476Bc3.A02(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.A03 = c2476Bc3.A03();
    }
}
