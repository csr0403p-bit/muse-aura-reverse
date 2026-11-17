package kotlinx.coroutines.android;

import X.AIA;
import X.B8t;
import X.B8w;
import X.C3cG;
import X.C7384Etj;
import X.GB9;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes4.dex */
public final class AndroidDispatcherFactory {
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public GB9 createDispatcher(List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw C3cG.A0Q("The main looper is not available");
        }
        B8w b8w = AIA.A00;
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
        C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return new B8t((Handler) objInvoke, null, false);
    }

    public int getLoadPriority() {
        return 1073741823;
    }
}
