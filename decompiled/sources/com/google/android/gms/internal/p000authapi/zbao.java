package com.google.android.gms.internal.p000authapi;

import X.CSE;
import android.os.IInterface;

/* loaded from: classes5.dex */
public final class zbao extends zbb implements IInterface {
    public final /* synthetic */ CSE A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zbao(CSE cse) {
        this();
        this.A00 = cse;
    }

    public zbao() {
        attachInterface(this, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }
}
