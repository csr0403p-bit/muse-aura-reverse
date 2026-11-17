package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class HqY {
    public static final ConcurrentHashMap<Class<?>, Field[]> A00 = C60O.A1C();

    public static final boolean A00(Object obj, Object obj2) {
        int iCompare;
        if (obj != obj2) {
            if (obj == null || obj2 == null) {
                return false;
            }
            Class<?> cls = obj.getClass();
            if (!cls.equals(obj2.getClass())) {
                return false;
            }
            if (obj instanceof Float) {
                iCompare = Float.compare(AnonymousClass001.A02(obj), AnonymousClass001.A02(obj2));
            } else {
                if (!(obj instanceof Double)) {
                    if (obj instanceof InterfaceC10547Hrt) {
                        return ((InterfaceC10547Hrt) obj).AON(obj2);
                    }
                    if (cls.isArray()) {
                        if (obj instanceof byte[]) {
                            return Arrays.equals((byte[]) obj, (byte[]) obj2);
                        }
                        if (obj instanceof short[]) {
                            return Arrays.equals((short[]) obj, (short[]) obj2);
                        }
                        if (obj instanceof char[]) {
                            return Arrays.equals((char[]) obj, (char[]) obj2);
                        }
                        if (obj instanceof int[]) {
                            return Arrays.equals((int[]) obj, (int[]) obj2);
                        }
                        if (obj instanceof long[]) {
                            return Arrays.equals((long[]) obj, (long[]) obj2);
                        }
                        if (obj instanceof float[]) {
                            return Arrays.equals((float[]) obj, (float[]) obj2);
                        }
                        if (obj instanceof double[]) {
                            return Arrays.equals((double[]) obj, (double[]) obj2);
                        }
                        if (obj instanceof boolean[]) {
                            return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                        }
                        Object[] objArr = (Object[]) obj;
                        Object[] objArr2 = (Object[]) obj2;
                        int length = objArr.length;
                        if (length != objArr2.length) {
                            return false;
                        }
                        for (int i = 0; i < length; i++) {
                            if (!A00(objArr[i], objArr2[i])) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if ((obj instanceof List) && (obj instanceof RandomAccess)) {
                        List list = (List) obj;
                        List list2 = (List) obj2;
                        if (list.size() != list2.size()) {
                            return false;
                        }
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (!A00(list.get(i2), list2.get(i2))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if (!(obj instanceof Collection)) {
                        if (!(obj instanceof CharSequence)) {
                            return obj.equals(obj2);
                        }
                        try {
                            return obj.equals(obj2);
                        } catch (NullPointerException unused) {
                            return false;
                        }
                    }
                    Collection collection = (Collection) obj;
                    Collection collection2 = (Collection) obj2;
                    if (collection.size() != collection2.size()) {
                        return false;
                    }
                    Iterator it = collection.iterator();
                    Iterator it2 = collection2.iterator();
                    while (it.hasNext()) {
                        if (!A00(it.next(), it2.next())) {
                            return false;
                        }
                    }
                    return true;
                }
                iCompare = Double.compare(BV6.A00(obj), BV6.A00(obj2));
            }
            if (iCompare != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A01(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        Class<?> cls = obj.getClass();
        if (!cls.equals(obj2.getClass())) {
            return false;
        }
        boolean z = FFH.A00;
        Field[] declaredFields = cls.getDeclaredFields();
        C7384Etj.A0U(declaredFields);
        for (Field field : declaredFields) {
            try {
                boolean zIsAccessible = field.isAccessible();
                if (!zIsAccessible) {
                    field.setAccessible(true);
                }
                Object obj3 = field.get(obj);
                Object obj4 = field.get(obj2);
                if (!zIsAccessible) {
                    field.setAccessible(false);
                }
                if (!A00(obj3, obj4)) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Unable to get fields by reflection.", e);
            }
        }
        return true;
    }
}
