package X;

import X.AbstractC0878AGe;
import X.C7384Etj;
import X.FD3;
import X.FD8;
import X.FDA;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FD3 {
    public static FD4 A00;
    public static FD8 A01;
    public static Boolean A02;
    public static final FD3 A03 = new FD3();
    public static final ArrayList<FD8> A04 = C3cG.A0h();

    public static final void A00() throws Exception {
        FD4 fd4 = A00;
        if (fd4 == null || fd4.A00 != C79.A0C) {
            return;
        }
        fd4.A00();
        A00 = null;
    }

    public static final void A01(FBB fbb) {
        if (A00 == null) {
            A00 = new FD4(new C7727FCd(fbb.A02.createObjectSet()), C8631Fhi.A00(6));
            FBF fbf = new FBF(fbb);
            F9b f9bA03 = FBA.A03(fbb);
            if (f9bA03.A0R) {
                return;
            }
            List<FBH> list = f9bA03.A0J;
            synchronized (list) {
                list.add(fbf);
            }
        }
    }

    public final void A02(Context context) {
        Object next;
        ArrayList<FD8> arrayList = A04;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<FD8> it = arrayList.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(it.next().ACP(), context)) {
                    return;
                }
            }
        }
        Iterator<FD8> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            FD8 fd8 = (FD8) next;
            if (fd8.ACs() == null && C7384Etj.areEqual(fd8.ACP(), context)) {
                break;
            }
        }
        FD8 fd82 = (FD8) next;
        FD8 fd83 = fd82;
        if (fd82 == null) {
            final FDA fda = new FDA(context);
            arrayList.add(fda);
            final Activity activityA00 = HiC.A00(context);
            fd83 = fda;
            if (activityA00 != null) {
                Application application = activityA00.getApplication();
                fd83 = fda;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.bloks.foa.screen.registry.BloksNavigationRegistry$findOrRegisterNativeScreen$1
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                            C7384Etj.A0Y(activity, 0);
                            if (activity.equals(activityA00)) {
                                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                                ArrayList<FD8> arrayList2 = FD3.A04;
                                FDA fda2 = fda;
                                arrayList2.remove(fda2);
                                if (C7384Etj.areEqual(FD3.A01, fda2)) {
                                    FD3.A01 = (FD8) AbstractC0878AGe.A0I(arrayList2);
                                }
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }
                    });
                    fd83 = fda;
                }
            }
        }
        A01 = fd83;
    }

    public final void A04(FD8 fd8) {
        FD8 fd82;
        ArrayList<FD8> arrayList = A04;
        boolean zContains = arrayList.contains(fd8);
        if (!zContains) {
            fd8.A3u(FD6.A00);
            arrayList.add(fd8);
        }
        FD8 fd83 = A01;
        A01 = fd8;
        if (C7384Etj.areEqual(fd83, fd8) || !zContains) {
            FD4 fd4 = A00;
            if (fd4 != null) {
                fd4.A01();
                return;
            }
            return;
        }
        int iIndexOf = arrayList.indexOf(fd8) + 1;
        if (iIndexOf >= arrayList.size() || (fd82 = arrayList.get(iIndexOf)) == null) {
            return;
        }
        fd82.A3u(new FD9(fd8));
    }

    public final void A03(Context context, C7658F9a c7658F9a, InterfaceC7646F8n interfaceC7646F8n, FBB fbb, Integer num) {
        A02(context);
        if (c7658F9a.A00) {
            A00();
        }
        Boolean boolA0h = A02;
        if (boolA0h == null) {
            boolA0h = AnonymousClass001.A0h();
            A02 = boolA0h;
        }
        if (boolA0h.booleanValue()) {
            A01(fbb);
        }
        FD4 fd4 = A00;
        if (fd4 == null || fd4.A00 != C79.A00) {
            interfaceC7646F8n.execute(context, fbb, num);
        } else {
            AnonymousClass002.A1J(interfaceC7646F8n, c7658F9a, fd4.A02);
        }
    }
}
