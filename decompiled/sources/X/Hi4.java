package X;

import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class Hi4 {
    public static final Object A01 = C3cG.A0T();
    public static final AtomicInteger A03 = BV5.A17();
    public static final SparseArray<Object> A00 = BV4.A0B();
    public static final List<Function0<Unit>> A02 = C3cG.A0h();

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Integer;Ljava/lang/Class<TT;>;)TT; */
    public static final Object A01(Class cls, Integer num) {
        Object objCast;
        if (num == null) {
            return null;
        }
        try {
            synchronized (A01) {
                SparseArray<Object> sparseArray = A00;
                int iIntValue = num.intValue();
                objCast = sparseArray.indexOfKey(iIntValue) < 0 ? null : cls.cast(sparseArray.get(iIntValue));
            }
            return objCast;
        } catch (ClassCastException e) {
            FFI.A01(null, "Casting error when retrieving data", e);
            return null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Integer;Ljava/lang/Class<TT;>;)TT; */
    public static final Object A02(Class cls, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            synchronized (A01) {
                SparseArray<Object> sparseArray = A00;
                int iIntValue = num.intValue();
                if (sparseArray.indexOfKey(iIntValue) < 0) {
                    return null;
                }
                Object objCast = cls.cast(sparseArray.get(iIntValue));
                sparseArray.delete(iIntValue);
                return objCast;
            }
        } catch (ClassCastException e) {
            FFI.A01(null, "Casting error when retrieving data", e);
            return null;
        }
    }

    public static final int A00(Object obj) {
        int iIncrementAndGet = A03.incrementAndGet();
        synchronized (A01) {
            A00.append(iIncrementAndGet, obj);
        }
        return iIncrementAndGet;
    }
}
