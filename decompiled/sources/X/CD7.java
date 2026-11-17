package X;

import android.content.Context;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class CD7 {
    @Deprecated(message = "Please use the variant provided in VoltronRuntimeModule. This is temporary so\n        FacebookApplication can reference it!")
    public final synchronized C3301CCy A00(Context context, CCz cCz, CD8 cd8) {
        C3301CCy c3301CCy;
        AnonymousClass003.A0u(context, cd8);
        c3301CCy = C3301CCy.A04;
        if (c3301CCy == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            c3301CCy = new C3301CCy(context, cCz, cd8);
            C3301CCy.A04 = c3301CCy;
        } else if (c3301CCy.A02 != cd8) {
            throw BV4.A0c("Different VoltronModuleLoaders detected!");
        }
        return c3301CCy;
    }
}
