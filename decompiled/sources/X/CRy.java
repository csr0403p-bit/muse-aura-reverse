package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public abstract class CRy {
    public static void A01() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && C6xC.A00(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw C3cG.A0Q("Must not be called on GoogleApiHandler thread.");
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;)TT; */
    public static void A03(Object obj) {
        if (obj == null) {
            throw BV4.A0a("null reference");
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/Object;)TT; */
    public static void A04(Object obj, Object obj2) {
        if (obj == null) {
            throw BV5.A0Y(obj2);
        }
    }

    public static void A08(boolean z, Object obj) {
        if (!z) {
            throw C60O.A0i(String.valueOf(obj));
        }
    }

    public static void A09(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static C4241CrD A00(Context context) {
        A03(context);
        return new C4241CrD(context, new C4356Cu0());
    }

    public static void A02(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw C3cG.A0Q(FGI.A0h("Must be called on ", BV7.A13(handler).getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void A05(String str) {
        if (TextUtils.isEmpty(str)) {
            throw C60O.A0i("Given String is empty or null");
        }
    }

    public static void A06(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw C3cG.A0Q(str);
        }
    }

    public static void A07(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw C60O.A0i(String.valueOf(obj));
        }
    }
}
