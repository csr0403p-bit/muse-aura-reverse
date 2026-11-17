package X;

import java.lang.reflect.Array;

/* renamed from: X.GnM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9993GnM {
    public C10173Gqi A00 = null;
    public C10172Gqh A01 = null;
    public C10167Gqc A06 = null;
    public C10169Gqe A04 = null;
    public C10168Gqd A05 = null;
    public C10170Gqf A03 = null;
    public C10171Gqg A02 = null;

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>([TT;TT;)[TT; */
    public static Object[] A00(Object obj, Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == obj) {
                if (i == 0) {
                    return objArr;
                }
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, 0, objArr2, 1, i);
                objArr2[0] = obj;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    System.arraycopy(objArr, i2, objArr2, i2, i3);
                }
                return objArr2;
            }
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr3, 1, length);
        }
        objArr3[0] = obj;
        return objArr3;
    }
}
