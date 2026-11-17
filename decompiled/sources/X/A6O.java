package X;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class A6O {
    public final SavedStateRegistry A00;
    public final A6Q A01;

    public final void A02(Bundle bundle) {
        HxE[] hxEArrA1b;
        A6Q a6q = this.A01;
        C9jH c9jH = C9jH.A00;
        if (c9jH.isEmpty()) {
            hxEArrA1b = new HxE[0];
        } else {
            ArrayList arrayListA1A = C8j3.A1A(c9jH);
            Iterator itA1B = C8j3.A1B(c9jH);
            while (itA1B.hasNext()) {
                C8j5.A0q(arrayListA1A, itA1B);
            }
            hxEArrA1b = C8j3.A1b(arrayListA1A);
        }
        Bundle bundleA00 = AbstractC0849A5g.A00(hxEArrA1b);
        Bundle bundle2 = a6q.A00;
        if (bundle2 != null) {
            bundleA00.putAll(bundle2);
        }
        synchronized (a6q.A05) {
            Iterator itA0n = AnonymousClass002.A0n(a6q.A06);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                Bundle bundleAc4 = ((A6F) entryA0l.getValue()).Ac4();
                AnonymousClass003.A0x(strA0t, bundleAc4);
                bundleA00.putBundle(strA0t, bundleAc4);
            }
        }
        if (bundleA00.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA00);
    }

    public static final A6O A00(A6I a6i) {
        return new A6O(new A6Q(a6i, C2293BSt.A00(a6i, 37)));
    }

    public final void A01(Bundle bundle) {
        A6Q a6q = this.A01;
        if (!a6q.A01) {
            a6q.A00();
        }
        A6I a6i = a6q.A04;
        if (C8j3.A0m(a6i).A00(EnumC10573Huf.A06)) {
            throw C3cG.A0Q(C8j3.A14(C8j3.A0m(a6i), C60O.A0x("performRestore cannot be called when owner is ")));
        }
        if (a6q.A03) {
            throw C3cG.A0Q("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key") && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) == null) {
            A5q.A00("androidx.lifecycle.BundlableSavedStateRegistry.key");
            throw F60.createAndThrow();
        }
        a6q.A00 = bundle2;
        a6q.A03 = true;
    }

    public A6O(A6Q a6q) {
        this.A01 = a6q;
        this.A00 = new SavedStateRegistry(a6q);
    }
}
