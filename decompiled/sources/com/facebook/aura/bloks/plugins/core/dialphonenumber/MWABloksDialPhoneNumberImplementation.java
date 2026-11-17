package com.facebook.aura.bloks.plugins.core.dialphonenumber;

import X.C3cG;
import X.C7384Etj;
import X.C7mU;
import X.F6D;
import X.Hj6;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class MWABloksDialPhoneNumberImplementation {
    public static final MWABloksDialPhoneNumberImplementation INSTANCE = new MWABloksDialPhoneNumberImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        C7384Etj.A0Y(hj6, 0);
        Object obj = hj6.A01[0];
        C7384Etj.A0U(obj);
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", (String) obj, null));
        intent.setFlags(268435456);
        C7mU.A00().A04().A05(C3cG.A06(), intent);
        return C3cG.A0T();
    }
}
