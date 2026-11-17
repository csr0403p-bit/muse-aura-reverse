package androidx.credentials.playservices;

import X.Dff;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes5.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final Dff A00 = new Dff(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.A00;
    }
}
