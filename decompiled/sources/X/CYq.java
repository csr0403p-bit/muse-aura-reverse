package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy;

/* loaded from: classes5.dex */
public final class CYq implements ServiceConnection {
    public final HatchInstallReferrerLogger.AnonymousClass1 A00;
    public final /* synthetic */ CYx A01;

    public CYq(CYx cYx, HatchInstallReferrerLogger.AnonymousClass1 anonymousClass1) {
        this.A01 = cYx;
        this.A00 = anonymousClass1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.finsky.externalreferrer.IGetInstallReferrerService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGetInstallReferrerService$Stub$Proxy iGetInstallReferrerService$Stub$Proxy;
        CZ0.A00("Install Referrer service connected.");
        CYx cYx = this.A01;
        if (iBinder == null) {
            iGetInstallReferrerService$Stub$Proxy = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService)) {
                IGetInstallReferrerService$Stub$Proxy iGetInstallReferrerService$Stub$Proxy2 = new IGetInstallReferrerService$Stub$Proxy();
                iGetInstallReferrerService$Stub$Proxy2.A00 = iBinder;
                iGetInstallReferrerService$Stub$Proxy = iGetInstallReferrerService$Stub$Proxy2;
            } else {
                iGetInstallReferrerService$Stub$Proxy = (IGetInstallReferrerService) iInterfaceQueryLocalInterface;
            }
        }
        cYx.A02 = iGetInstallReferrerService$Stub$Proxy;
        cYx.A00 = 2;
        this.A00.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BV5.A1J("InstallReferrerClient", "Install Referrer service disconnected.");
        CYx cYx = this.A01;
        cYx.A02 = null;
        cYx.A00 = 0;
    }
}
