package X;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public abstract class FYZ {
    public static final Field A00;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        A00 = declaredField;
    }
}
