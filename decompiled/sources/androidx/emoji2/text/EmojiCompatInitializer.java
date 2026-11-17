package androidx.emoji2.text;

import X.AnonymousClass001;
import X.Bx2;
import X.Bx3;
import X.Bx4;
import X.Bx7;
import X.C1HY;
import X.C3424CMn;
import X.C60O;
import X.E9X;
import X.F2N;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class EmojiCompatInitializer implements Bx4<Boolean> {
    @Override // X.Bx4
    public final /* bridge */ /* synthetic */ Boolean A7V(Context context) {
        Object objA01;
        Bx7 bx7 = new Bx7(context);
        C3424CMn c3424CMn = new C3424CMn();
        if (E9X.A08 == null) {
            synchronized (E9X.A07) {
                if (E9X.A08 == null) {
                    E9X.A08 = new E9X(c3424CMn, bx7);
                }
            }
        }
        Bx3 bx3A00 = Bx3.A00(context);
        synchronized (Bx3.A03) {
            objA01 = bx3A00.A01.get(ProcessLifecycleInitializer.class);
            if (objA01 == null) {
                objA01 = Bx3.A01(bx3A00, ProcessLifecycleInitializer.class, C60O.A13());
            }
        }
        F2N lifecycle = ((C1HY) objA01).getLifecycle();
        lifecycle.A04(new Bx2(this, lifecycle));
        return AnonymousClass001.A0i();
    }

    @Override // X.Bx4
    public final List<Class<? extends Bx4<?>>> A8o() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
