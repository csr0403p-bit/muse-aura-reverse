package com.google.android.gms.internal.location;

import X.CSE;
import android.os.IInterface;

/* loaded from: classes5.dex */
public final class zzdk extends zzb implements IInterface {
    public final /* synthetic */ CSE A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzdk(CSE cse) {
        this();
        this.A00 = cse;
    }

    public zzdk() {
        attachInterface(this, "com.google.android.gms.location.internal.ILocationStatusCallback");
    }
}
