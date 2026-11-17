package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class BAP implements B0d {
    public static final BAP A00 = new BAP();

    @Override // X.B0d
    public final Rect A89(Activity activity) throws Exception {
        Object obj;
        C7384Etj.A0Y(activity, 0);
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj2.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj2, null);
                C7384Etj.A0Z(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            Log.w("BoundsHelper", e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Class<?> cls = defaultDisplay.getClass();
                Class<?> cls2 = objNewInstance.getClass();
                Method declaredMethod = cls.getDeclaredMethod("getDisplayInfo", cls2);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = cls2.getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(objNewInstance);
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                Log.w("BoundsHelper", e2);
            }
            DisplayCutout displayCutout = obj instanceof DisplayCutout ? (DisplayCutout) obj : null;
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right += displayCutout.getSafeInsetRight();
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom += displayCutout.getSafeInsetBottom();
                }
            }
        }
        return rect;
    }
}
