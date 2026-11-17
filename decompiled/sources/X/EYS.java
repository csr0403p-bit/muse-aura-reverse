package X;

import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EYS<T extends Enum<T>> extends AbstractC6735EXt<T> {
    public static final EYY A03 = new F4J(2);
    public final Map<String, T> A01 = BV4.A0u();
    public final Map<String, T> A02 = BV4.A0u();
    public final Map<T, String> A00 = BV4.A0u();

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Object obj) throws IOException {
        c6733EXr.A0H(obj == null ? null : C60O.A0p(obj, this.A00));
    }

    public EYS(Class<T> cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r6 = (Enum) field2.get(null);
                String strName = r6.name();
                String string = r6.toString();
                SerializedName serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    strName = serializedName.value();
                    for (String str : serializedName.alternate()) {
                        this.A01.put(str, r6);
                    }
                }
                this.A01.put(strName, r6);
                this.A02.put(string, r6);
                this.A00.put(r6, strName);
            }
        } catch (IllegalAccessException e) {
            throw BV4.A0N(e);
        }
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Object read(EY1 ey1) throws MalformedJsonException {
        if (ey1.A0R() == C79.A0Z) {
            ey1.A0a();
            return null;
        }
        String strA0V = ey1.A0V();
        T t = this.A01.get(strA0V);
        return t == null ? this.A02.get(strA0V) : t;
    }
}
