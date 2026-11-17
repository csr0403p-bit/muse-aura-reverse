package com.facebook.aura.bloks.screenquery;

import X.BV4;
import X.C7384Etj;
import X.C7727FCd;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class AuraObjectSetUtilsKt {
    public static final C7727FCd createObjectSet(Context context) {
        C7384Etj.A0Y(context, 0);
        SparseArray sparseArrayA0B = BV4.A0B();
        sparseArrayA0B.put(R.id.bk_context_key_android_context, context);
        return new C7727FCd(sparseArrayA0B);
    }

    public static final Context getContext(C7727FCd c7727FCd) {
        C7384Etj.A0Y(c7727FCd, 0);
        Object obj = c7727FCd.A00.get(R.id.bk_context_key_android_context);
        if (obj != null) {
            return (Context) obj;
        }
        throw BV4.A0a("Attempting to extract missing value. Please ensure that the value is passed to the BloksObjectSet correctly");
    }
}
