package com.facebook.aura.bloks.asynccomponent;

import X.BV4;
import X.C7727FCd;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class AuraComponentQueryObjectSet {
    public static final AuraComponentQueryObjectSet INSTANCE = new AuraComponentQueryObjectSet();

    public final C7727FCd create(Context context) {
        SparseArray sparseArrayA0B = BV4.A0B();
        if (context != null) {
            sparseArrayA0B.put(R.id.bk_context_key_android_context, context);
        }
        return new C7727FCd(sparseArrayA0B);
    }
}
