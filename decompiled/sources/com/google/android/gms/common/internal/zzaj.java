package com.google.android.gms.common.internal;

import X.AnonymousClass002;
import X.CRy;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes5.dex */
public final class zzaj extends Exception {
    public final ConnectionResult zza;

    public zzaj(ConnectionResult connectionResult) {
        CRy.A08(AnonymousClass002.A1X(connectionResult.A02), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.zza = connectionResult;
    }
}
