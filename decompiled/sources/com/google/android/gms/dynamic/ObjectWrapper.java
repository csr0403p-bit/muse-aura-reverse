package com.google.android.gms.dynamic;

import X.BV4;
import X.BV5;
import X.C60O;
import X.CRy;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    public final Object A00;

    public static <T> T A00(IObjectWrapper iObjectWrapper) throws SecurityException {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).A00;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw BV5.A0Q("Unexpected number of IObjectWrapper declared fields: ", length);
        }
        CRy.A03(field);
        if (field.isAccessible()) {
            throw C60O.A0i("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw BV4.A0Q("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw BV4.A0Q("Binder object is null.", e2);
        }
    }

    public ObjectWrapper(Object obj) {
        this.A00 = obj;
    }
}
