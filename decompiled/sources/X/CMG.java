package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public abstract class CMG {
    public static final ThreadLocal<TypedValue> A01 = new ThreadLocal<>();
    public static final WeakHashMap<CMH, SparseArray<CMI>> A02 = new WeakHashMap<>(0);
    public static final Object A00 = C3cG.A0T();

    public static Typeface A00(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return A01(context, new TypedValue(), null, i, 0, false, false);
    }

    public static void A02(Context context, CM9 cm9, int i) throws XmlPullParserException, IllegalAccessException, Resources.NotFoundException, IOException, IllegalArgumentException, InvocationTargetException {
        if (context.isRestricted()) {
            cm9.A00(-4);
        } else {
            A01(context, new TypedValue(), cm9, i, 0, false, false);
        }
    }

    public static void A03(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            } else {
                continue;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface A01(android.content.Context r36, android.util.TypedValue r37, X.CM9 r38, int r39, int r40, boolean r41, boolean r42) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CMG.A01(android.content.Context, android.util.TypedValue, X.CM9, int, int, boolean, boolean):android.graphics.Typeface");
    }
}
