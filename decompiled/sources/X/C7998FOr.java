package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.FOr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7998FOr extends View {
    public final Drawable A00;

    public C7998FOr(Context context, float[] fArr, float f, int i) {
        super(context);
        C8371Fcl c8371Fcl = new C8371Fcl(fArr, i);
        this.A00 = c8371Fcl;
        setLayerType(2, null);
        setAlpha(f);
        setBackground(c8371Fcl);
    }

    public final void A00(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
