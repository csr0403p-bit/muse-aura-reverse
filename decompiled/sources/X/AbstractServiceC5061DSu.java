package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Deprecated;

/* renamed from: X.DSu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractServiceC5061DSu extends Service implements C1HY {
    public final C5062DSv A00 = new C5062DSv(this);

    @Override // X.C1HY
    public final F2N getLifecycle() {
        return this.A00.A01;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C5062DSv.A00(EnumC3085Bxl.ON_START, this.A00);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C5062DSv.A00(EnumC3085Bxl.ON_CREATE, this.A00);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C5062DSv c5062DSv = this.A00;
        C5062DSv.A00(EnumC3085Bxl.ON_STOP, c5062DSv);
        C5062DSv.A00(EnumC3085Bxl.ON_DESTROY, c5062DSv);
        super.onDestroy();
    }

    @Override // android.app.Service
    @Deprecated(message = "Deprecated in Java")
    public final void onStart(Intent intent, int i) {
        C5062DSv.A00(EnumC3085Bxl.ON_START, this.A00);
        super.onStart(intent, i);
    }
}
