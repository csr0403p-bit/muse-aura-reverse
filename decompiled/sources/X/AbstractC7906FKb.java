package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.WeakHashMap;

/* renamed from: X.FKb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7906FKb {
    public static final FKW A00(Context context) throws Resources.NotFoundException, CloneNotSupportedException {
        FKW fkw;
        Integer num = FKZ.A00;
        Resources.Theme theme = context.getTheme();
        WeakHashMap<Resources.Theme, FKW> weakHashMap = FKZ.A01;
        synchronized (weakHashMap) {
            fkw = weakHashMap.get(theme);
        }
        if (fkw == null) {
            fkw = new FKW();
            Resources.Theme theme2 = context.getTheme();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC7909FKg.A01, 0, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme2.obtainStyledAttributes(resourceId, AbstractC7909FKg.A00);
                FKZ.A01(typedArrayObtainStyledAttributes2, fkw);
                typedArrayObtainStyledAttributes2.recycle();
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(null, AbstractC7909FKg.A02, 0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(0, -1);
            typedArrayObtainStyledAttributes3.recycle();
            if (resourceId2 != -1) {
                TypedArray typedArrayObtainStyledAttributes4 = theme2.obtainStyledAttributes(resourceId2, AbstractC7909FKg.A00);
                FKZ.A01(typedArrayObtainStyledAttributes4, fkw);
                typedArrayObtainStyledAttributes4.recycle();
            }
            synchronized (weakHashMap) {
                weakHashMap.put(theme, fkw);
            }
        }
        FKW fkwA00 = fkw.A00();
        fkwA00.A0g = true;
        fkwA00.A0A = 0;
        return fkwA00;
    }
}
