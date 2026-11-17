package libraries.accessv2.src.authenticator;

import X.AnonymousClass001;
import X.C20;
import X.C7384Etj;
import X.F60;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class AccessLibraryAuthenticatorService extends Service {
    public C20 A00;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C20 c20 = this.A00;
        if (c20 == null) {
            C7384Etj.A0b("authenticator");
            throw F60.createAndThrow();
        }
        IBinder iBinder = c20.getIBinder();
        C7384Etj.A0U(iBinder);
        return iBinder;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.A00 = new C20(AnonymousClass001.A0I(this));
    }
}
