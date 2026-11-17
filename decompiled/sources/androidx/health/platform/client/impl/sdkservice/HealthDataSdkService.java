package androidx.health.platform.client.impl.sdkservice;

import X.BV5;
import X.F2W;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class HealthDataSdkService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("androidx.health.platform.client.ACTION_BIND_SDK_SERVICE".equals(action)) {
            return new HealthDataSdkServiceStubImpl(getApplicationContext(), Executors.newSingleThreadExecutor(new F2W(Executors.defaultThreadFactory(), BV5.A19())));
        }
        Log.i("HealthDataSdkService", String.format("Bind request with an invalid action [%s]", action));
        return null;
    }
}
