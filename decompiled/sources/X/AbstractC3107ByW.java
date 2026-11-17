package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import com.facebook.rendercore.MountContentPools$PoolsActivityCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.ByW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3107ByW {
    public static MountContentPools$PoolsActivityCallback A00;
    public static final Object A01 = C3cG.A0T();
    public static final Map<Context, C3108ByX> A02 = BV4.A0v(4);
    public static final WeakHashMap<Context, Boolean> A05 = BV4.A11();
    public static final WeakHashMap<Context, Boolean> A03 = BV4.A11();
    public static final ThreadLocal A04 = new ThreadLocal();

    public static final C3109ByY A00(Context context, InterfaceC7830FGl interfaceC7830FGl, Hra hra, int i) {
        Map map;
        if (i <= 0) {
            return null;
        }
        synchronized (A01) {
            Map<Context, C3108ByX> map2 = A02;
            C3108ByX c3108ByX = map2.get(context);
            if (c3108ByX == null) {
                Context baseContext = context;
                while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity) && !(baseContext instanceof Application) && !(baseContext instanceof Service)) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    C7384Etj.A0U(baseContext);
                }
                if (A05.containsKey(baseContext)) {
                    return null;
                }
                if (baseContext instanceof C1HY) {
                    WeakHashMap<Context, Boolean> weakHashMap = A03;
                    if (!weakHashMap.containsKey(baseContext)) {
                        BV4.A1G(baseContext, weakHashMap, true);
                        AbstractC8162FXe.A01(new BxB(baseContext));
                    }
                } else if (A00 == null) {
                    A00 = new MountContentPools$PoolsActivityCallback();
                    Context applicationContext = baseContext.getApplicationContext();
                    C7384Etj.A0Z(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(A00);
                }
                c3108ByX = new C3108ByX();
                map2.put(context, c3108ByX);
            }
            if (hra.equals(Hra.A00)) {
                map = c3108ByX.A01;
            } else {
                Map map3 = c3108ByX.A00;
                Object objA0u = map3.get(hra);
                if (objA0u == null) {
                    objA0u = BV4.A0u();
                    map3.put(hra, objA0u);
                }
                map = (Map) objA0u;
            }
            Class clsAIr = interfaceC7830FGl.AIr();
            C3109ByY c3109ByY = (C3109ByY) map.get(clsAIr);
            if (c3109ByY == null) {
                c3109ByY = new C3109ByY(clsAIr, i);
            }
            map.put(clsAIr, c3109ByY);
            return c3109ByY;
        }
    }

    public static final void A01(Context context) {
        C7384Etj.A0Y(context, 0);
        synchronized (A01) {
            if (A02.containsKey(context)) {
                throw C3cG.A0Q("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    public static final void A02(Context context) {
        C7384Etj.A0Y(context, 0);
        synchronized (A01) {
            Map<Context, C3108ByX> map = A02;
            C3108ByX c3108ByXRemove = map.remove(context);
            if (c3108ByXRemove != null) {
                c3108ByXRemove.A00();
            }
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                Context baseContext = (Context) entryA0l.getKey();
                C3108ByX c3108ByX = (C3108ByX) entryA0l.getValue();
                Context baseContext2 = context;
                while (baseContext2 instanceof ContextWrapper) {
                    baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
                    C7384Etj.A0U(baseContext2);
                }
                while (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    C7384Etj.A0U(baseContext);
                }
                if (baseContext == baseContext2) {
                    itA0n.remove();
                    c3108ByX.A00();
                }
            }
            WeakHashMap<Context, Boolean> weakHashMap = A05;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
                context = ((ContextWrapper) context).getBaseContext();
                C7384Etj.A0U(context);
            }
            BV4.A1G(context, weakHashMap, true);
        }
    }

    public static final void A04(C3109ByY c3109ByY, Object obj) {
        if (c3109ByY != null) {
            try {
                if (c3109ByY.A00.AaC(obj)) {
                    c3109ByY.A02.incrementAndGet();
                }
            } catch (IllegalStateException e) {
                throw new IllegalStateException(FGI.A0M("Failed to release item to DefaultContentPool: ", c3109ByY.A01), e);
            }
        }
    }

    public static final void A03(View view) {
        view.isAttachedToWindow();
        ArrayList arrayListA11 = C60O.A11(4);
        for (ViewParent parent = view.getParent(); parent != null && arrayListA11.size() < 4; parent = parent.getParent()) {
            arrayListA11.add(C60Q.A0e(parent));
        }
        AbstractC0878AGe.A0L(" > ", "", "", arrayListA11, null);
        Hx0.A01();
    }
}
