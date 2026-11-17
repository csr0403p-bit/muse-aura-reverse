package X;

import java.lang.reflect.Field;

/* renamed from: X.Gjj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9875Gjj {
    public static final C10448Hig A00;
    public static final Field[] A01;

    static {
        C10448Hig c10448Hig = new C10448Hig();
        A00 = c10448Hig;
        A01 = new Field[]{C10448Hig.A00(c10448Hig, c10448Hig.lowerEndpoint), C10448Hig.A00(c10448Hig, c10448Hig.upperEndpoint), C10448Hig.A00(c10448Hig, c10448Hig.lowerBoundType), C10448Hig.A00(c10448Hig, c10448Hig.upperBoundType)};
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GpR;)LX/Hig; */
    public static C10448Hig A00(C10103GpR c10103GpR, AbstractC9901Gkh abstractC9901Gkh) {
        if (c10103GpR == null) {
            return A00;
        }
        new C9876Gjk(abstractC9901Gkh._base._typeFactory);
        Field[] fieldArr = A01;
        Field field = fieldArr[0];
        field.getClass();
        String name = field.getName();
        Field field2 = fieldArr[1];
        field2.getClass();
        String name2 = field2.getName();
        Field field3 = fieldArr[2];
        field3.getClass();
        String name3 = field3.getName();
        Field field4 = fieldArr[3];
        field4.getClass();
        return new C10448Hig(name, name2, name3, field4.getName());
    }
}
