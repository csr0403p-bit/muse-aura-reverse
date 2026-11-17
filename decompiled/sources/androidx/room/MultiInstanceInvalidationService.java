package androidx.room;

import X.C3cG;
import X.RemoteCallbackListC5294DfZ;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final Map<Integer, String> A02 = C3cG.A0j();
    public final RemoteCallbackList<IMultiInstanceInvalidationCallback> A01 = new RemoteCallbackListC5294DfZ(this);
    public final MultiInstanceInvalidationService$binder$1 A03 = new MultiInstanceInvalidationService$binder$1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.A03;
    }
}
