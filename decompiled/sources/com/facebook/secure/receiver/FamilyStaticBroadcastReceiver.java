package com.facebook.secure.receiver;

import X.C7381Etf;
import X.C7384Etj;
import X.C75I;
import X.C7mM;
import X.C7mP;
import X.C8fD;

/* loaded from: classes3.dex */
public abstract class FamilyStaticBroadcastReceiver extends StaticBroadcastReceiverBase implements C8fD {
    public static final C75I reporter = new C75I();
    public static final C7mP sDelegatingEnforcement = new C7mP();

    public FamilyStaticBroadcastReceiver(C7381Etf c7381Etf) {
        C7384Etj.A0Y(c7381Etf, 0);
        this.scope = new C7mM(sDelegatingEnforcement, reporter, c7381Etf, "FamilyIntentScope");
    }

    public FamilyStaticBroadcastReceiver() {
        this.scope = new C7mM(sDelegatingEnforcement, reporter);
    }
}
