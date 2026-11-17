package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class BAO implements B0d {
    public static final BAO A00 = new BAO();

    @Override // X.B0d
    public final Rect A89(Activity activity) throws Exception {
        C7384Etj.A0Y(activity, 0);
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            Log.w("BoundsHelper", e);
            return BAP.A00.A89(activity);
        }
    }
}
