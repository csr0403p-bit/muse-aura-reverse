package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes6.dex */
public class FX8 {
    public final Object[] A00 = new Object[2];
    public static final Class<?>[] A04 = {Context.class, AttributeSet.class};
    public static final int[] A01 = {R.attr.onClick};
    public static final String[] A02 = {"android.widget.", "android.view.", "android.webkit."};
    public static final DQZ<String, Constructor<? extends View>> A03 = new DQZ<>(0);

    public static View A00(Context context, FX8 fx8, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strA0M;
        DQZ<String, Constructor<? extends View>> dqz = A03;
        Constructor<? extends View> constructor = dqz.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strA0M = FGI.A0M(str2, str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strA0M = str;
            }
            constructor = Class.forName(strA0M, false, context.getClassLoader()).asSubclass(View.class).getConstructor(A04);
            dqz.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(fx8.A00);
    }
}
