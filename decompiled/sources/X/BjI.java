package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes5.dex */
public final class BjI implements InterfaceC2741Bji {
    public Rect A00 = null;
    public Rect A01 = null;
    public C3010Brs<Void> A02;
    public final C2476Bc3 A03;

    @Override // X.InterfaceC2741Bji
    public final void resetZoom() {
        this.A01 = null;
        this.A00 = null;
        C3010Brs<Void> c3010Brs = this.A02;
        if (c3010Brs != null) {
            C3010Brs.A01(c3010Brs, "Camera is not active.");
            this.A02 = null;
        }
    }

    @Override // X.InterfaceC2741Bji
    public final void A3s(BgU bgU) {
        Rect rect = this.A00;
        if (rect != null) {
            bgU.A00(CaptureRequest.SCALER_CROP_REGION, BY1.REQUIRED, rect);
        }
    }

    @Override // X.InterfaceC2741Bji
    public final Rect AED() {
        Rect rect = this.A00;
        if (rect != null) {
            return rect;
        }
        Object objA02 = this.A03.A02(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        objA02.getClass();
        return (Rect) objA02;
    }

    @Override // X.InterfaceC2741Bji
    public final float AHU() {
        Number number = (Number) this.A03.A02(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (number != null) {
            float fFloatValue = number.floatValue();
            if (fFloatValue >= 1.0f) {
                return fFloatValue;
            }
        }
        return 1.0f;
    }

    @Override // X.InterfaceC2741Bji
    public final float AHk() {
        return 1.0f;
    }

    @Override // X.InterfaceC2741Bji
    public final void AS9(TotalCaptureResult totalCaptureResult) {
        if (this.A02 != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Object obj = request == null ? null : request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect = this.A01;
            if (rect == null || !rect.equals(obj)) {
                return;
            }
            this.A02.A03(null);
            this.A02 = null;
            this.A01 = null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (FLX/Brs<Ljava/lang/Void;>;)V */
    @Override // X.InterfaceC2741Bji
    public final void AfJ(C3010Brs c3010Brs, float f) {
        Object objA02 = this.A03.A02(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        objA02.getClass();
        Rect rect = (Rect) objA02;
        float fWidth = rect.width() / f;
        float fHeight = rect.height() / f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        this.A00 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        C3010Brs<Void> c3010Brs2 = this.A02;
        if (c3010Brs2 != null) {
            C3010Brs.A01(c3010Brs2, "There is a new zoomRatio being set");
        }
        this.A01 = this.A00;
        this.A02 = c3010Brs;
    }

    public BjI(C2476Bc3 c2476Bc3) {
        this.A03 = c2476Bc3;
    }
}
