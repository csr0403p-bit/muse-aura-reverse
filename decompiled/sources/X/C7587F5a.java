package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.F5a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7587F5a implements Ht9, Function0 {
    public final int $t;

    public C7587F5a(int i) {
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        switch (this.$t) {
            case 0:
                return Integer.valueOf(CUB.A01.A05(2147418112) + 65536);
            case 1:
                return AnonymousClass001.A0i();
            case 2:
                String[] strArr = EHO.A03;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 3:
                Method declaredMethod2 = null;
                try {
                    Method value = EHO.A02.getValue();
                    if (value == null || (returnType = value.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    declaredMethod2 = returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    return declaredMethod2;
                } catch (Throwable unused2) {
                    return declaredMethod2;
                }
            case 4:
                return Unit.INSTANCE;
            default:
                return null;
        }
    }
}
