package X;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CTr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3554CTr {
    public final Context A00;
    public final C3557CTu A01;
    public final CUO A02;
    public final CUJ<CTN> A03;
    public final String A04;
    public static final Object A09 = C3cG.A0T();
    public static final Executor A0B = new ExecutorC7512Eyc();
    public static final Map<String, C3554CTr> A0A = new DQd(0);
    public final AtomicBoolean A06 = BV4.A12(false);
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final List A05 = new CopyOnWriteArrayList();
    public final List A07 = new CopyOnWriteArrayList();

    public static C3554CTr A00() {
        C3554CTr c3554CTr;
        synchronized (A09) {
            c3554CTr = A0A.get("[DEFAULT]");
            if (c3554CTr == null) {
                String processName = CTw.A01;
                if (processName == null) {
                    processName = Application.getProcessName();
                    CTw.A01 = processName;
                }
                throw BV5.A0V("Default FirebaseApp is not initialized in this process ", processName, ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c3554CTr;
    }

    public static void A01(C3554CTr c3554CTr) {
        CRy.A09(!c3554CTr.A08.get(), "FirebaseApp was deleted");
    }

    public static void A02(C3554CTr c3554CTr) {
        Context context = c3554CTr.A00;
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            A01(c3554CTr);
            String str = c3554CTr.A04;
            Log.i("FirebaseApp", FGI.A0M("Device unlocked: initializing all Firebase APIs for app ", str));
            CUO cuo = c3554CTr.A02;
            A01(c3554CTr);
            cuo.A06("[DEFAULT]".equals(str));
            return;
        }
        A01(c3554CTr);
        Log.i("FirebaseApp", FGI.A0M("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ", c3554CTr.A04));
        AtomicReference<C3556CTt> atomicReference = C3556CTt.A01;
        if (atomicReference.get() == null) {
            C3556CTt c3556CTt = new C3556CTt(context);
            if (C7O.A00(null, c3556CTt, atomicReference)) {
                context.registerReceiver(c3556CTt, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3554CTr)) {
            return false;
        }
        String str = this.A04;
        C3554CTr c3554CTr = (C3554CTr) obj;
        A01(c3554CTr);
        return str.equals(c3554CTr.A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        C7392EuT c7392EuT = new C7392EuT(this);
        c7392EuT.A00(this.A04, "name");
        c7392EuT.A00(this.A01, "options");
        return c7392EuT.toString();
    }

    public C3554CTr(Context context, C3557CTu c3557CTu, String str) {
        CRy.A03(context);
        this.A00 = context;
        CRy.A05(str);
        this.A04 = str;
        this.A01 = c3557CTu;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = AbstractC7379Eta.A00(ComponentDiscoveryService.class, context).iterator();
        while (it.hasNext()) {
            arrayListA0h.add(new C3558CTv((String) it.next()));
        }
        Executor executor = A0B;
        ArrayList arrayListA0h2 = C3cG.A0h();
        ArrayList arrayListA0h3 = C3cG.A0h();
        arrayListA0h2.addAll(arrayListA0h);
        arrayListA0h2.add(new C7602F5p(new FirebaseCommonRegistrar(), 0));
        C3565CUi.A01(Context.class, context, arrayListA0h3);
        C3565CUi.A01(C3554CTr.class, this, arrayListA0h3);
        C3565CUi.A01(C3557CTu.class, c3557CTu, arrayListA0h3);
        this.A02 = new CUO(arrayListA0h2, arrayListA0h3, executor);
        this.A03 = new CUJ<>(new C7604F5r(0, context, this));
    }
}
