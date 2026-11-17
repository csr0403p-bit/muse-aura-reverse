package X;

import android.content.Context;
import android.util.TypedValue;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FXB {
    public final float A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public FXB(Context context) {
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A03 = (context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f0401c0, typedValueA0Z, true) && typedValueA0Z.type == 18) ? AnonymousClass002.A1L(typedValueA0Z.data) : false;
        TypedValue typedValueA0Z2 = AbstractC7607F5u.A0Z();
        this.A02 = context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f0401bf, typedValueA0Z2, true) ? typedValueA0Z2.data : 0;
        TypedValue typedValueA0Z3 = AbstractC7607F5u.A0Z();
        this.A01 = context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f040139, typedValueA0Z3, true) ? typedValueA0Z3.data : 0;
        this.A00 = C60Q.A0B(context).density;
    }
}
