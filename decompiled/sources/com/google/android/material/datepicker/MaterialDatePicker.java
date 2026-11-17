package com.google.android.material.datepicker;

import X.FWM;
import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.DialogFragment;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class MaterialDatePicker<S> extends DialogFragment {
    public static final Object A01 = "CONFIRM_BUTTON_TAG";
    public static final Object A00 = "CANCEL_BUTTON_TAG";
    public static final Object A02 = "TOGGLE_BUTTON_TAG";

    public static boolean A00(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(FWM.A00(context, MaterialCalendar.class.getCanonicalName(), R.attr._name_removed__res_0x7f0403c4), new int[]{android.R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }
}
