package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class B0S {
    public static final AnV A00(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
            } else if (baseContext != null) {
                C2167B0g c2167B0g = InterfaceC2169B0i.A00;
                B0U b0u = B0Y.A00().A8A(baseContext, ((B0Z) C2167B0g.A00.invoke(C2167B0g.A01)).A00).A00;
                int i = b0u.A01;
                int i2 = b0u.A03;
                int i3 = b0u.A02;
                int i4 = b0u.A00;
                long jA0C = AnonymousClass007.A0C(new Rect(i, i2, i3, i4).width(), new Rect(i, i2, i3, i4).height());
                return new AnV(jA0C, ASU.A02(AbstractC1500Ak7.A00(baseContext), AQY.A01(jA0C)));
            }
        }
        Configuration configurationA0Z = C8j3.A0Z(context);
        C1498Ak5 c1498Ak5A00 = AbstractC1500Ak7.A00(context);
        long jA00 = C16n.A00(configurationA0Z.screenWidthDp, configurationA0Z.screenHeightDp);
        long jA03 = ASU.A03(c1498Ak5A00, jA00);
        return new AnV(C8j3.A0S((int) AnonymousClass001.A00(jA03), (int) AnonymousClass001.A01(jA03, 4294967295L)), jA00);
    }
}
