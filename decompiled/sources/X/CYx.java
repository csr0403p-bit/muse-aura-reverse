package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* loaded from: classes5.dex */
public final class CYx extends CZ7 {
    public int A00 = 0;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public CYx(Context context) {
        this.A03 = context.getApplicationContext();
    }
}
