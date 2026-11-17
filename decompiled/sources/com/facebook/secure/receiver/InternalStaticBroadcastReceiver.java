package com.facebook.secure.receiver;

import X.C75I;
import X.C7mH;
import X.C7mP;
import X.C7mY;
import X.C8fD;

/* loaded from: classes3.dex */
public abstract class InternalStaticBroadcastReceiver extends StaticBroadcastReceiverBase implements C8fD {
    public static final C7mP delegatingEnforcement = new C7mP();
    public static volatile C7mY reporter = new C75I();

    @Override // com.facebook.secure.receiver.SecureBroadcastReceiverBase
    public boolean shouldCheckActionNotNull() {
        return false;
    }

    public InternalStaticBroadcastReceiver() {
        this.scope = new C7mH(delegatingEnforcement, reporter);
    }
}
