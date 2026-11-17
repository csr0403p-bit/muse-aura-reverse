package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.facebook.aura.bugreport.AuraRageShakeManager$startListening$1$1;

/* renamed from: X.EEe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6546EEe implements SensorEventListener {
    public long A00 = System.currentTimeMillis();
    public final AuraRageShakeManager$startListening$1$1 A01;
    public final C6547EEf A02;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6546EEe.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public /* synthetic */ C6546EEe(AuraRageShakeManager$startListening$1$1 auraRageShakeManager$startListening$1$1, C6547EEf c6547EEf) {
        this.A01 = auraRageShakeManager$startListening$1$1;
        this.A02 = c6547EEf;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
