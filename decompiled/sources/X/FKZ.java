package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public abstract class FKZ {
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();
    public static final Integer A00 = C79.A00;
    public static final WeakHashMap<Resources.Theme, FKW> A01 = new WeakHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r1 != 8388613) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A00(int r0, int r1) {
        /*
            switch(r0) {
                case 0: goto L6;
                case 1: goto L6;
                case 2: goto L1e;
                case 3: goto L21;
                case 4: goto L30;
                case 5: goto L27;
                case 6: goto L24;
                default: goto L3;
            }
        L3:
            java.lang.Integer r0 = X.FKZ.A00
            return r0
        L6:
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 1
            if (r1 == r0) goto L30
            r0 = 3
            if (r1 == r0) goto L2d
            r0 = 5
            if (r1 == r0) goto L2a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L27
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L24
            goto L3
        L1e:
            java.lang.Integer r0 = X.C79.A00
            return r0
        L21:
            java.lang.Integer r0 = X.C79.A01
            return r0
        L24:
            java.lang.Integer r0 = X.C79.A0P
            return r0
        L27:
            java.lang.Integer r0 = X.C79.A0K
            return r0
        L2a:
            java.lang.Integer r0 = X.C79.A0W
            return r0
        L2d:
            java.lang.Integer r0 = X.C79.A0T
            return r0
        L30:
            java.lang.Integer r0 = X.C79.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKZ.A00(int, int):java.lang.Integer");
    }

    public static void A01(TypedArray typedArray, FKW fkw) {
        int indexCount = typedArray.getIndexCount();
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index == 2) {
                fkw.A0S = typedArray.getColorStateList(index);
                fkw.A08 = 0;
            } else if (index == 0) {
                fkw.A0Q = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    fkw.A0U = A02[integer - 1];
                }
            } else if (index == 25) {
                i = typedArray.getInt(index, -1);
                fkw.A0Z = A00(i, i2);
            } else if (index == 6) {
                i2 = typedArray.getInt(index, -1);
                fkw.A0Z = A00(i, i2);
                int i4 = i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                fkw.A0a = i4 != 16 ? (i4 == 48 || i4 != 80) ? C79.A00 : C79.A0C : C79.A01;
            } else if (index == 15) {
                fkw.A0c = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                fkw.A0M = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                fkw.A0J = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                fkw.A0d = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                fkw.A0F = typedArray.getColor(index, 0);
            } else if (index == 3) {
                fkw.A0A = typedArray.getColor(index, 0);
            } else if (index == 1) {
                fkw.A0R = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                fkw.A04 = typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                fkw.A03 = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                fkw.A05 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                fkw.A06 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                fkw.A07 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                fkw.A0P = typedArray.getColor(index, 0);
            } else if (index == 13) {
                fkw.A0L = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                fkw.A0I = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                fkw.A0N = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                fkw.A0K = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    fkw.A0T = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                fkw.A09 = typedArray.getInt(index, 0);
            } else if (index == 27) {
                fkw.A0C = typedArray.getInt(index, 0);
            } else if (index == 28) {
                fkw.A0D = typedArray.getInt(index, 0);
            }
        }
    }
}
