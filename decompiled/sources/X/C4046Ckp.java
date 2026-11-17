package X;

import android.content.Context;
import com.facebook.analytics2.logger.interfaces.DefaultHandlerThreadFactory;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.Ckp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4046Ckp {
    public static C4046Ckp A09;
    public final Context A07;
    public final ArrayList<SamplingPolicyConfig> A03 = C3cG.A0h();
    public final ArrayList A08 = C3cG.A0h();
    public final ArrayList<InterfaceC4012Cjq> A05 = C3cG.A0h();
    public final ArrayList A04 = C3cG.A0h();
    public final ArrayList A06 = C3cG.A0h();
    public final ArrayList A01 = C3cG.A0h();
    public final ArrayList A00 = C3cG.A0h();
    public final ArrayList<InterfaceC4071ClJ> A02 = C3cG.A0h();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.Ckp) */
    public static synchronized Object A01(C4046Ckp c4046Ckp, String str, ArrayList arrayList) {
        Object objA03;
        synchronized (c4046Ckp) {
            try {
                objA03 = c4046Ckp.A03(Class.forName(str), arrayList);
            } catch (ClassNotFoundException e) {
                CFK.A0E("ContextConstructorHelper", "Cannot find class: %s", e, str);
                return null;
            }
        }
        return objA03;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.Ckp) */
    public static synchronized Object A02(C4046Ckp c4046Ckp, String str, ArrayList arrayList) {
        synchronized (c4046Ckp) {
            try {
                try {
                    try {
                        try {
                            try {
                                return c4046Ckp.A03(Class.forName(str), arrayList);
                            } catch (ClassNotFoundException e) {
                                CFK.A0C("ContextConstructorHelper", "Cannot find class: %s", e, str);
                                return null;
                            }
                        } catch (InstantiationException e2) {
                            CFK.A0L("ContextConstructorHelper", e2, "InstantiationException");
                            return null;
                        }
                    } catch (IllegalAccessException e3) {
                        CFK.A0L("ContextConstructorHelper", e3, "IllegalAccessException");
                        return null;
                    }
                } catch (ClassCastException e4) {
                    CFK.A0E("ContextConstructorHelper", "ClassCastException, existingInstances size: %d, className: %s", e4, Integer.valueOf(arrayList.size()), str);
                    return null;
                }
            } catch (NoSuchMethodException e5) {
                CFK.A0L("ContextConstructorHelper", e5, "NoSuchMethodException");
                return null;
            } catch (InvocationTargetException e6) {
                CFK.A0L("ContextConstructorHelper", e6, "InvocationTargetException");
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r1 = r5.getConstructor(android.content.Context.class).newInstance(r4.A07);
        r6.add(r1);
     */
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Ljava/util/ArrayList<TT;>;Ljava/lang/Class<+TT;>;)TT; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.lang.Object A03(java.lang.Class r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L32
            r2 = 0
        L6:
            if (r2 >= r3) goto L19
            java.lang.Object r1 = r6.get(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L30
            int r2 = r2 + 1
            goto L6
        L19:
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r5.getConstructor(r0)     // Catch: java.lang.Throwable -> L32
            android.content.Context r0 = r4.A07     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L32
            r6.add(r1)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r4)
            return r1
        L32:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4046Ckp.A03(java.lang.Class, java.util.ArrayList):java.lang.Object");
    }

    public static synchronized C4046Ckp A00(Context context) {
        C4046Ckp c4046Ckp;
        c4046Ckp = A09;
        if (c4046Ckp == null) {
            c4046Ckp = new C4046Ckp(context.getApplicationContext());
            A09 = c4046Ckp;
        }
        return c4046Ckp;
    }

    public final DefaultHandlerThreadFactory A05(String str) {
        DefaultHandlerThreadFactory defaultHandlerThreadFactory = (DefaultHandlerThreadFactory) A02(this, str, this.A08);
        if (defaultHandlerThreadFactory != null) {
            return defaultHandlerThreadFactory;
        }
        DefaultHandlerThreadFactory defaultHandlerThreadFactory2 = new DefaultHandlerThreadFactory();
        CFK.A07("ContextConstructorHelper", "Unable to create instance for HandlerThreadFactory");
        return defaultHandlerThreadFactory2;
    }

    public C4046Ckp(Context context) {
        this.A07 = context;
    }

    public static void A04(Context context) {
        A00(context).A05(DefaultHandlerThreadFactory.class.getName());
    }
}
