package X;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class A6E implements A6F {
    public Bundle A00;
    public boolean A01;
    public final F0C A02;
    public final SavedStateRegistry A03;

    public final void A00() {
        HxE[] hxEArrA1b;
        if (this.A01) {
            return;
        }
        Bundle bundleA00 = this.A03.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C9jH c9jH = C9jH.A00;
        if (c9jH.isEmpty()) {
            hxEArrA1b = new HxE[0];
        } else {
            ArrayList arrayListA1A = C8j3.A1A(c9jH);
            Iterator itA1B = C8j3.A1B(c9jH);
            while (itA1B.hasNext()) {
                Map.Entry entry = (Map.Entry) itA1B.next();
                arrayListA1A.add(new HxE(entry.getKey(), entry.getValue()));
            }
            hxEArrA1b = C8j3.A1b(arrayListA1A);
        }
        Bundle bundleA002 = AbstractC0849A5g.A00(hxEArrA1b);
        Bundle bundle = this.A00;
        if (bundle != null) {
            bundleA002.putAll(bundle);
        }
        if (bundleA00 != null) {
            bundleA002.putAll(bundleA00);
        }
        this.A00 = bundleA002;
        this.A01 = true;
        this.A02.getValue();
    }

    @Override // X.A6F
    public final Bundle Ac4() {
        HxE[] hxEArrA1b;
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
        Bundle bundle = this.A00;
        if (bundle != null) {
            bundleA00.putAll(bundle);
        }
        Iterator itA0n = AnonymousClass002.A0n(((C08459uk) this.A02.getValue()).A00);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Bundle bundleAc4 = ((A6N) entryA0l.getValue()).A00.A00.Ac4();
            C7384Etj.A0Y(bundleAc4, 0);
            if (!bundleAc4.isEmpty()) {
                C7384Etj.A0Y(strA0t, 1);
                bundleA00.putBundle(strA0t, bundleAc4);
            }
        }
        this.A01 = false;
        return bundleA00;
    }

    public A6E(BOD bod, SavedStateRegistry savedStateRegistry) {
        AnonymousClass003.A0u(savedStateRegistry, bod);
        this.A03 = savedStateRegistry;
        this.A02 = AbstractC5321DgF.A03(C2293BSt.A00(bod, 33));
    }
}
