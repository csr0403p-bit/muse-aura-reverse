package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.DeM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5257DeM implements InterfaceC5259DeO {
    public static final C5258DeN<Context, C5251DeG> A00 = new C5258DeN<>(new C5256DeL());

    public static AbstractC5257DeM get(Context context) {
        C5251DeG c5251DeGAPe;
        C5258DeN<Context, C5251DeG> c5258DeN = A00;
        WeakHashMap<Context, WeakReference<C5251DeG>> weakHashMap = c5258DeN.A01;
        WeakReference<C5251DeG> weakReference = weakHashMap.get(context);
        if (weakReference == null || (c5251DeGAPe = weakReference.get()) == null) {
            c5251DeGAPe = c5258DeN.A00.APe(context);
            synchronized (c5258DeN) {
                weakHashMap.put(context, BV4.A0q(c5251DeGAPe));
            }
        }
        return c5251DeGAPe;
    }
}
