package com.facebook.aura.bloks.fbpay.pttprovider;

import X.AbstractC3358CGz;
import X.C3cH;
import X.C7384Etj;
import X.CH0;
import X.EVP;
import X.EVT;
import X.EVc;
import X.F3H;
import android.content.Context;
import com.facebook.aura.auth.store.AuraUserSessionStore;

/* loaded from: classes5.dex */
public final class AuraModularAuthTicketManagerProvider {
    public static final AuraModularAuthTicketManagerProvider INSTANCE = new AuraModularAuthTicketManagerProvider();

    public EVc get(Context context) {
        C7384Etj.A0Y(context, 0);
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        return new EVc(new EVT(new EVP(C3cH.A0I())), new F3H(context), currentUserSession != null ? ((CH0) currentUserSession).A01 : "");
    }
}
