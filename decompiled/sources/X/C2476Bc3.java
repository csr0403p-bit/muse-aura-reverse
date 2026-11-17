package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.Map;

/* renamed from: X.Bc3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2476Bc3 {
    public final InterfaceC2478Bc5 A01;
    public final String A02;
    public final Map<CameraCharacteristics.Key<?>, Object> A03 = BV4.A0u();
    public C2473Bc0 A00 = null;

    public static int A00(C2476Bc3 c2476Bc3) {
        return ((Number) c2476Bc3.A02(CameraCharacteristics.LENS_FACING)).intValue();
    }

    public final C2473Bc0 A01() {
        C2473Bc0 c2473Bc0 = this.A00;
        if (c2473Bc0 != null) {
            return c2473Bc0;
        }
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) A02(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                throw C60O.A0i("StreamConfigurationMap is null!");
            }
            C2473Bc0 c2473Bc02 = new C2473Bc0(streamConfigurationMap, new C2395BZs(this.A02));
            this.A00 = c2473Bc02;
            return c2473Bc02;
        } catch (AssertionError | NullPointerException e) {
            throw C60O.A0i(e.getMessage());
        }
    }

    public final <T> T A02(CameraCharacteristics.Key<T> key) {
        T t;
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) ((C2477Bc4) this.A01).A00.get(key);
        }
        synchronized (this) {
            Map<CameraCharacteristics.Key<?>, Object> map = this.A03;
            t = (T) map.get(key);
            if (t == null && (t = (T) ((C2477Bc4) this.A01).A00.get(key)) != null) {
                map.put(key, t);
            }
        }
        return t;
    }

    public final boolean A03() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((C2477Bc4) this.A01).A00.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C2476Bc3(CameraCharacteristics cameraCharacteristics, String str) {
        this.A01 = new C2477Bc4(cameraCharacteristics);
        this.A02 = str;
    }
}
