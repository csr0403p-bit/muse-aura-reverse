package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class B69 implements BRn {
    public final Context A00;
    public final Ab2<Drawable.ConstantState> A01;
    public final Ab2<String> A02;

    @Override // X.BRn
    public final Drawable A9k(Context context, int i) {
        Drawable drawableNewDrawable;
        C7384Etj.A0Y(context, 0);
        if (context != this.A00) {
            return context.getDrawable(i);
        }
        Ab2<Drawable.ConstantState> ab2 = this.A01;
        Drawable.ConstantState constantStateA04 = ab2.A04(i);
        if (constantStateA04 != null && (drawableNewDrawable = constantStateA04.newDrawable(context.getResources())) != null) {
            return drawableNewDrawable;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return drawable;
        }
        ab2.A0B(i, drawable.getConstantState());
        return drawable;
    }

    @Override // X.BRn
    public final String AgV(Context context, int i) {
        Object string;
        C7384Etj.A0Y(context, 0);
        if (context != this.A00) {
            return context.getString(i);
        }
        Ab2<String> ab2 = this.A02;
        int iA06 = ab2.A06(i);
        if (iA06 >= 0) {
            string = ab2.A04[iA06];
            if (string == null) {
                string = context.getString(i);
            }
            return (String) string;
        }
        string = context.getString(i);
        iA06 ^= -1;
        ab2.A02[iA06] = i;
        ab2.A04[iA06] = string;
        return (String) string;
    }

    public B69(Context context) {
        this.A00 = context;
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A01 = new Ab2<>(6);
        this.A02 = new Ab2<>(6);
    }
}
