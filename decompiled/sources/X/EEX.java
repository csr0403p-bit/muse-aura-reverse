package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import org.webrtc.AndroidVideoDecoder;

/* loaded from: classes5.dex */
public final class EEX {
    public boolean A00;
    public final SensorManager A01;
    public final EEZ A02 = new EEZ(this);
    public final List<SensorEventListener> A03;

    public final synchronized void A00() {
        SensorManager sensorManager;
        Sensor defaultSensor;
        CFK.A05("RageShakeSensorEventDispatcher", FGI.A0r("[start] isListenerRegistered: ", this.A00));
        if (!this.A00 && (defaultSensor = (sensorManager = this.A01).getDefaultSensor(1)) != null) {
            StringBuilder sbA0y = C60O.A0y("[start] build: ", Build.VERSION.SDK_INT);
            sbA0y.append(", sensor: ");
            sbA0y.append("ACCELEROMETER");
            sbA0y.append(", samplingPeriodUs: ");
            sbA0y.append(30000);
            CFK.A05("RageShakeSensorEventDispatcher", C60P.A1O(", maxReportLatencyUs: ", sbA0y, AndroidVideoDecoder.DEQUEUE_INPUT_TIMEOUT_US));
            sensorManager.registerListener(this.A02, defaultSensor, 30000, AndroidVideoDecoder.DEQUEUE_INPUT_TIMEOUT_US);
            this.A00 = true;
            CFK.A05("RageShakeSensorEventDispatcher", "[start] started");
        }
    }

    public EEX(SensorManager sensorManager) {
        this.A01 = sensorManager;
        List<SensorEventListener> listSynchronizedList = Collections.synchronizedList(C3cG.A0h());
        C7384Etj.A0U(listSynchronizedList);
        this.A03 = listSynchronizedList;
    }
}
