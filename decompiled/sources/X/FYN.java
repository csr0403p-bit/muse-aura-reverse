package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public abstract class FYN {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static boolean A03;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            A00 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            A02 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            A01 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            A03 = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void A00(View view, FYL fyl, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = A00;
            Integer numValueOf = Integer.valueOf(i);
            method.invoke(fyl, numValueOf, view, AnonymousClass001.A0h(), -1, -1);
            A02.invoke(fyl, numValueOf);
            A01.invoke(fyl, numValueOf);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static boolean A01() {
        return A03;
    }
}
