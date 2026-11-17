package com.facebook.aura.bloks.plugins.core.bkactionsharetext;

import X.AnonymousClass004;
import X.F6D;
import X.FBB;
import X.Hj6;
import android.content.Context;
import com.facebook.aura.file.actions.HatchShare;

/* loaded from: classes3.dex */
public final class BKBloksActionShareTextImplementation {
    public static final BKBloksActionShareTextImplementation INSTANCE = new BKBloksActionShareTextImplementation();

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        Context context;
        Object obj = hj6.A01[AnonymousClass004.A1b(hj6, f6d) ? 1 : 0];
        obj.getClass();
        String str = (String) obj;
        FBB fbb = f6d.A02;
        if (fbb != null && (context = fbb.A00) != null) {
            HatchShare.INSTANCE.shareText(context, str, null, null);
        }
        return null;
    }
}
