package X;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.FPz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8023FPz {
    public final float A00;
    public final Long A01;
    public final boolean A02;

    public C8023FPz(C8020FPu c8020FPu, FQ0 fq0, Long l, boolean z) {
        Map<String, FQ5> map = fq0.A04;
        String str = c8020FPu.A00;
        FQ5 fq5 = map.get(str);
        float f = 0.0f;
        if (fq5 != null) {
            Rect rect = fq5.A01;
            if (rect.top != Integer.MIN_VALUE && rect.left != Integer.MIN_VALUE && rect.right != Integer.MIN_VALUE && rect.bottom != Integer.MIN_VALUE) {
                int iHeight = rect.height() * rect.width();
                int iHeight2 = 0;
                for (Rect rect2 : fq5.A02) {
                    iHeight2 += rect2.height() * rect2.width();
                }
                f = iHeight2 / iHeight;
            }
        }
        this.A00 = f;
        map.get(str);
        this.A02 = z;
        this.A01 = l;
    }
}
