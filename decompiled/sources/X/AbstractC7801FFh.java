package X;

import android.graphics.Rect;

/* renamed from: X.FFh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7801FFh {
    public static final Rect[] A00(int i, int i2, int i3, boolean z) {
        Rect[] rectArr = new Rect[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            rectArr[i5] = AbstractC7607F5u.A0X();
        }
        if (i2 != 0) {
            double d = i2 / i3;
            while (i4 < i3) {
                int iA00 = Ab3.A00(i4 * d);
                int i6 = i4 + 1;
                int iA002 = i2 - Ab3.A00(i6 * d);
                Rect rect = rectArr[i4];
                if (i != 1) {
                    rect.top = iA00;
                    rect.bottom = iA002;
                } else if (z) {
                    rect.left = iA002;
                    rect.right = iA00;
                } else {
                    rect.left = iA00;
                    rect.right = iA002;
                }
                i4 = i6;
            }
        }
        return rectArr;
    }
}
