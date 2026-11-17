package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.Fau, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class MenuItemOnMenuItemClickListenerC8272Fau implements MenuItem.OnMenuItemClickListener {
    public static final Class<?>[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return AnonymousClass001.A1X(method.invoke(this.A00, menuItem));
            }
            method.invoke(this.A00, menuItem);
            return true;
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    public MenuItemOnMenuItemClickListenerC8272Fau(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e) {
            InflateException inflateException = new InflateException(FGI.A0d("Couldn't resolve menu item onClick handler ", str, " in class ", cls.getName()));
            inflateException.initCause(e);
            throw inflateException;
        }
    }
}
