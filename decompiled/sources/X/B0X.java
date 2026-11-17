package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class B0X implements B0Y {
    public static final B0X A00 = new B0X();

    @Override // X.B0Y
    public final B0T A8A(Context context, InterfaceC2166B0e interfaceC2166B0e) {
        boolean zA1b = AnonymousClass004.A1b(context, interfaceC2166B0e);
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                C7384Etj.A0U(baseContext);
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            C7384Etj.A0Y(activity, zA1b ? 1 : 0);
            Rect rectA89 = B0d.A00().A89(activity);
            C7384Etj.A0Y(rectA89, zA1b ? 1 : 0);
            return new B0T(new B0U(rectA89.left, rectA89.top, rectA89.right, rectA89.bottom), interfaceC2166B0e.A8n(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw C60O.A0i("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        C7384Etj.A0U(defaultDisplay);
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new B0T(new Rect(zA1b ? 1 : 0, zA1b ? 1 : 0, point.x, point.y), interfaceC2166B0e.A8n(context));
    }
}
