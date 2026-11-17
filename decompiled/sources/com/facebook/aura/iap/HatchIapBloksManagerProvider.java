package com.facebook.aura.iap;

import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F6D;
import X.FBB;
import X.Hon;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class HatchIapBloksManagerProvider {
    public Hon getIapUserSession(F6D f6d) {
        Context context;
        WeakReference<FBB> weakReference;
        C7384Etj.A0Y(f6d, 0);
        FBB fbb = f6d.A02;
        if ((fbb == null && ((weakReference = f6d.A08) == null || (fbb = weakReference.get()) == null)) || (context = fbb.A00) == null) {
            throw C60O.A0i("Unable to find androidContext from environment");
        }
        HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(context);
        if (scoped != null) {
            return scoped;
        }
        throw C3cG.A0Q("No current user session available");
    }
}
