package X;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FXx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8181FXx {
    public final Context A06;
    public final TextView A07;
    public static final RectF A09 = AbstractC7607F5u.A0Y();
    public static ConcurrentHashMap<String, Method> A08 = C60O.A1C();
    public int A03 = 0;
    public float A02 = -1.0f;
    public float A01 = -1.0f;
    public float A00 = -1.0f;
    public int[] A05 = new int[0];
    public boolean A04 = false;

    public static int[] A00(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayListA0h = C3cG.A0h();
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 > 0 && Collections.binarySearch(arrayListA0h, Integer.valueOf(i2)) < 0) {
                    C60Q.A1P(arrayListA0h, i2);
                }
                i++;
            } while (i < length);
            if (length != arrayListA0h.size()) {
                int size = arrayListA0h.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = AnonymousClass001.A0F(arrayListA0h.get(i3));
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public C8181FXx(TextView textView) {
        this.A07 = textView;
        this.A06 = textView.getContext();
    }
}
