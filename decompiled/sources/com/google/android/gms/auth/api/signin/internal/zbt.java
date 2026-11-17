package com.google.android.gms.auth.api.signin.internal;

import X.CaS;
import X.FGI;
import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import com.google.android.gms.internal.p000authapi.zbb;

/* loaded from: classes5.dex */
public final class zbt extends zbb implements IInterface {
    public final Context A00;

    public static final void A00(zbt zbtVar) {
        if (!CaS.A00(zbtVar.A00, Binder.getCallingUid())) {
            throw new SecurityException(FGI.A0I("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }

    public zbt(Context context) {
        this();
        this.A00 = context;
    }

    public zbt() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
}
