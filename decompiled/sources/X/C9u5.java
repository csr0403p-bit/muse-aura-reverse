package X;

import java.util.Arrays;

/* renamed from: X.9u5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9u5 extends AbstractC0886AGn {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean A00(T[] tArr, T[] tArr2) {
        int length;
        if (tArr != tArr2) {
            if (tArr != 0 && tArr2 != 0 && (length = tArr.length) == tArr2.length) {
                for (int i = 0; i < length; i++) {
                    Object[] objArr = tArr[i];
                    Object[] objArr2 = tArr2[i];
                    if (objArr != objArr2) {
                        if (objArr != 0 && objArr2 != 0) {
                            if (!(((objArr instanceof Object[]) && (objArr2 instanceof Object[])) ? A00(objArr, objArr2) : ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) ? Arrays.equals((byte[]) objArr, (byte[]) objArr2) : ((objArr instanceof short[]) && (objArr2 instanceof short[])) ? Arrays.equals((short[]) objArr, (short[]) objArr2) : ((objArr instanceof int[]) && (objArr2 instanceof int[])) ? Arrays.equals((int[]) objArr, (int[]) objArr2) : ((objArr instanceof long[]) && (objArr2 instanceof long[])) ? Arrays.equals((long[]) objArr, (long[]) objArr2) : ((objArr instanceof float[]) && (objArr2 instanceof float[])) ? Arrays.equals((float[]) objArr, (float[]) objArr2) : ((objArr instanceof double[]) && (objArr2 instanceof double[])) ? Arrays.equals((double[]) objArr, (double[]) objArr2) : ((objArr instanceof char[]) && (objArr2 instanceof char[])) ? Arrays.equals((char[]) objArr, (char[]) objArr2) : ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) ? Arrays.equals((boolean[]) objArr, (boolean[]) objArr2) : ((objArr instanceof C9oW) && (objArr2 instanceof C9oW)) ? Arrays.equals(((C9oW) objArr).A00, ((C9oW) objArr2).A00) : ((objArr instanceof C9oV) && (objArr2 instanceof C9oV)) ? Arrays.equals(((C9oV) objArr).A00, ((C9oV) objArr2).A00) : ((objArr instanceof C9oX) && (objArr2 instanceof C9oX)) ? Arrays.equals(((C9oX) objArr).A00, ((C9oX) objArr2).A00) : ((objArr instanceof C9tP) && (objArr2 instanceof C9tP)) ? Arrays.equals(((C9tP) objArr).A00, ((C9tP) objArr2).A00) : objArr.equals(objArr2))) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
