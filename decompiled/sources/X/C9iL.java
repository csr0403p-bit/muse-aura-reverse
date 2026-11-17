package X;

import com.whatsapp.accountlinking.ipc.api.models.ResponseCode;
import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9iL, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9iL {
    public static final <T extends Enum<T>> C9hr<T> A01(String str, T[] tArr) {
        C7384Etj.A0Y(tArr, 1);
        return new C9iQ(str, tArr);
    }

    public static final C9iQ A02(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        String strName;
        Annotation[] annotationArr2;
        C7384Etj.A0Y(enumArr, 1);
        int length = enumArr.length;
        C9iD c9iD = new C9iD(str, length);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r1 = enumArr[i];
            int i3 = i2 + 1;
            if (i2 < 0 || i2 >= strArr.length || (strName = strArr[i2]) == null) {
                strName = r1.name();
            }
            c9iD.A08(strName, false);
            if (i2 >= 0 && i2 < annotationArr.length && (annotationArr2 = annotationArr[i2]) != null) {
                for (Annotation annotation : annotationArr2) {
                    C7384Etj.A0Y(annotation, 0);
                    List<Annotation>[] listArr = c9iD.A09;
                    int i4 = ((C9iK) c9iD).A00;
                    List<Annotation> listA11 = listArr[i4];
                    if (listA11 == null) {
                        listA11 = C60O.A11(1);
                        listArr[i4] = listA11;
                    }
                    listA11.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        C9iQ c9iQ = new C9iQ(str, enumArr);
        c9iQ.A00 = c9iD;
        return c9iQ;
    }

    public static C9iQ A00() {
        return A01("com.whatsapp.accountlinking.ipc.api.models.ResponseCode", ResponseCode.values());
    }
}
