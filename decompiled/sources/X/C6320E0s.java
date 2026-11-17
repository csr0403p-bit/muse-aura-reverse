package X;

import android.graphics.Rect;
import java.util.Arrays;

/* renamed from: X.E0s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6320E0s {
    public int A02;
    public int A03;
    public Rect A04;
    public boolean A05;
    public boolean A06;
    public int[] A07;
    public final int[] A08 = new int[4];
    public int A00 = -1;
    public int A01 = -1;

    public static void A00(Rect rect, C6340E1q c6340E1q, C6320E0s c6320E0s, int[] iArr, boolean z) {
        int i;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i2 = !z ? 1 : 0;
        int i3 = i2 * iWidth;
        while (true) {
            int i4 = 0;
            do {
                int i5 = iWidth;
                int iA08 = 0;
                for (int i6 = 1; iA08 < i6 && i6 <= 64; i6 <<= 2) {
                    if (c6340E1q.A06() < 4) {
                        i = -1;
                        i5 = 0;
                        break;
                    }
                    iA08 = (iA08 << 4) | c6340E1q.A08(4);
                }
                i = iA08 & 3;
                if (iA08 >= 4) {
                    i5 = iA08 >> 2;
                }
                int iA0F = C8j3.A0F(iWidth, i4, i5);
                if (iA0F > 0) {
                    int i7 = i3 + iA0F;
                    Arrays.fill(iArr, i3, i7, c6320E0s.A08[i]);
                    i4 += iA0F;
                    i3 = i7;
                }
            } while (i4 < iWidth);
            i2 += 2;
            if (i2 >= iHeight) {
                return;
            }
            i3 = i2 * iWidth;
            c6340E1q.A09();
        }
    }
}
