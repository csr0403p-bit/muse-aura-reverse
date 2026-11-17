package X;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GlW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9933GlW implements Serializable {
    public static final long serialVersionUID = 1;
    public final Enum<?> _defaultValue;
    public final Class<Enum<?>> _enumClass;
    public final Enum<?>[] _enums;
    public final HashMap<String, Enum<?>> _enumsById;
    public final boolean _isFromIntValue;
    public final boolean _isIgnoreCase;

    public final C10127Gps A03() {
        int i;
        HashMap<String, Enum<?>> map = this._enumsById;
        if (map.isEmpty()) {
            return C10127Gps.A00;
        }
        int size = map.size();
        if (size <= 5) {
            i = 8;
        } else {
            i = 16;
            if (size > 12) {
                i = 32;
                while (i < size + (size >> 2)) {
                    i += i;
                }
            }
        }
        int i2 = i - 1;
        int i3 = (i >> 1) + i;
        Object[] objArrCopyOf = new Object[i3 * 2];
        Iterator itA0i = C3cG.A0i(map);
        int i4 = 0;
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String strA0t = C60O.A0t(entryA0l);
            if (strA0t != null) {
                int iHashCode = strA0t.hashCode() & i2;
                int i5 = iHashCode + iHashCode;
                if (objArrCopyOf[i5] != null) {
                    i5 = ((iHashCode >> 1) + i) << 1;
                    if (objArrCopyOf[i5] != null) {
                        i5 = (i3 << 1) + i4;
                        i4 += 2;
                        if (i5 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i5] = strA0t;
                objArrCopyOf[i5 + 1] = entryA0l.getValue();
            }
        }
        return new C10127Gps(objArrCopyOf, i2, i4);
    }

    public final Enum<?> A04(String str) {
        Enum<?> r1 = this._enumsById.get(str);
        if (r1 != null || !this._isIgnoreCase) {
            return r1;
        }
        Iterator itA0i = C3cG.A0i(this._enumsById);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            if (str.equalsIgnoreCase(C60O.A0t(entryA0l))) {
                return (Enum) entryA0l.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<Ljava/lang/Enum<*>;>;[Ljava/lang/Enum<*>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Enum<*>;>;Ljava/lang/Enum<*>;ZZ)V */
    public C9933GlW(Class cls, Enum r2, HashMap map, Enum[] enumArr, boolean z, boolean z2) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = map;
        this._defaultValue = r2;
        this._isIgnoreCase = z;
        this._isFromIntValue = z2;
    }

    public static C9933GlW A00(C9898Gke c9898Gke, C9909Gkr c9909Gkr) {
        AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
        boolean zA09 = c9898Gke.A09(EnumC9951GmA.A01);
        Class<?> cls = c9909Gkr.A05;
        Enum<?>[] enumArrA02 = A02(cls);
        int length = enumArrA02.length;
        String[] strArr = new String[length];
        String[][] strArr2 = new String[length][];
        if (abstractC9910GksA02 != null) {
            abstractC9910GksA02.A0d(c9909Gkr, enumArrA02, strArr);
            abstractC9910GksA02.A0e(c9909Gkr, enumArrA02, strArr2);
        }
        HashMap mapA0u = BV4.A0u();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r4 = enumArrA02[length];
            String string = strArr[length];
            if (string == null) {
                string = r4.toString();
            }
            mapA0u.put(string, r4);
            String[] strArr3 = strArr2[length];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    mapA0u.putIfAbsent(str, r4);
                }
            }
        }
        return new C9933GlW(cls, abstractC9910GksA02 != null ? abstractC9910GksA02.A0Q(c9909Gkr, enumArrA02) : null, mapA0u, enumArrA02, zA09, false);
    }

    @Deprecated
    public static C9933GlW A01(C9898Gke c9898Gke, Class<?> cls) {
        JsonAlias jsonAlias;
        AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
        boolean zA09 = c9898Gke.A09(EnumC9951GmA.A01);
        Enum<?>[] enumArrA02 = A02(cls);
        HashMap mapA0u = BV4.A0u();
        int length = enumArrA02.length;
        String[][] strArr = new String[length][];
        if (abstractC9910GksA02 != null && (abstractC9910GksA02 instanceof C9888GkO)) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                    String[] strArrValue = jsonAlias.value();
                    if (strArrValue.length != 0) {
                        String name = field.getName();
                        for (int i = 0; i < length; i++) {
                            if (name.equals(enumArrA02[i].name())) {
                                strArr[i] = strArrValue;
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r4 = enumArrA02[length];
            mapA0u.put(r4.toString(), r4);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    mapA0u.putIfAbsent(str, r4);
                }
            }
        }
        return new C9933GlW(cls, abstractC9910GksA02 != null ? abstractC9910GksA02.A0R(cls) : null, mapA0u, enumArrA02, zA09, false);
    }

    public static Enum<?>[] A02(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw C60Q.A0U("No enum constants for class ", cls.getName());
    }
}
