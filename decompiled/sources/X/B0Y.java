package X;

import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
public interface B0Y {
    B0T A8A(Context context, InterfaceC2166B0e interfaceC2166B0e);

    static B0Y A00() {
        int i = Build.VERSION.SDK_INT;
        return i >= 34 ? B0W.A00 : i >= 30 ? B0V.A00 : B0X.A00;
    }
}
