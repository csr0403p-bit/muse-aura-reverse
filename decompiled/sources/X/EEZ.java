package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class EEZ implements SensorEventListener {
    public final /* synthetic */ EEX A00;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        C7384Etj.A0Y(sensor, 0);
        List<SensorEventListener> list = this.A00.A03;
        synchronized (list) {
            Iterator<SensorEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onAccuracyChanged(sensor, i);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C7384Etj.A0Y(sensorEvent, 0);
        List<SensorEventListener> list = this.A00.A03;
        synchronized (list) {
            Iterator<SensorEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onSensorChanged(sensorEvent);
            }
        }
    }

    public EEZ(EEX eex) {
        this.A00 = eex;
    }
}
