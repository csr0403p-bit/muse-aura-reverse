package com.google.android.gms.internal.location;

import X.CSE;
import android.os.IInterface;

/* loaded from: classes5.dex */
public final class zzdg extends zzb implements IInterface {
    public final /* synthetic */ CSE A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzdg(CSE cse) {
        this();
        this.A00 = cse;
    }

    public zzdg() {
        attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
    }
}
