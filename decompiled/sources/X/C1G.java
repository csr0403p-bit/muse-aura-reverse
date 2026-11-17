package X;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;

/* loaded from: classes5.dex */
public abstract class C1G {
    public static void A03(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static int A01(C5426DiN c5426DiN, AbstractC5421DiH abstractC5421DiH, int i) {
        int[] iArr = abstractC5421DiH.A01;
        A05(iArr);
        return iArr[i] - (c5426DiN.A00 + c5426DiN.A03);
    }

    public static void A04(Object obj) {
        A06(obj, "The uri must be set.");
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;)TT; */
    public static void A05(Object obj) {
        if (obj == null) {
            throw BV4.A0T();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/Object;)TT; */
    public static void A06(Object obj, Object obj2) {
        if (obj == null) {
            throw C3cG.A0Q(String.valueOf(obj2));
        }
    }

    public static void A07(boolean z) {
        if (!z) {
            throw BV4.A0P();
        }
    }

    public static void A08(boolean z) {
        if (!z) {
            throw BV4.A0T();
        }
    }

    public static void A09(boolean z, Object obj) {
        if (!z) {
            throw C60O.A0i(String.valueOf(obj));
        }
    }

    public static int A00(SparseBooleanArray sparseBooleanArray, int i) {
        A03(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public static Handler A02(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        A05(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }
}
