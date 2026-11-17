package X;

import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes6.dex */
public final class HrG extends Paint {
    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            PointF pointF = AbstractC8699Fiz.A00;
            super.setAlpha(BV5.A02(255, i, 0));
        } else {
            int color = getColor();
            PointF pointF2 = AbstractC8699Fiz.A00;
            setColor((BV5.A02(255, i, 0) << 24) | (color & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
