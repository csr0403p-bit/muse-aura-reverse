package com.google.android.gms.internal.p000authapi;

import X.CSE;
import android.os.IInterface;

/* loaded from: classes5.dex */
public final class zbam extends zbb implements IInterface {
    public final /* synthetic */ CSE A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zbam(CSE cse) {
        this();
        this.A00 = cse;
    }

    public zbam() {
        attachInterface(this, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }
}
