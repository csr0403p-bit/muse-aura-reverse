package com.google.android.gms.internal.p001authapiphone;

import X.CSE;
import android.os.IInterface;

/* loaded from: classes5.dex */
public final class zzaj extends zzb implements IInterface {
    public final /* synthetic */ CSE A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaj(CSE cse) {
        this();
        this.A00 = cse;
    }

    public zzaj() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }
}
