package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FgX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8575FgX {
    public C8574FgV A00;
    public final ArrayList<Fragment> A01 = C3cG.A0h();
    public final HashMap<String, C8572FgR> A02 = BV4.A0u();
    public final HashMap<String, Bundle> A03 = BV4.A0u();

    public final Fragment A00(String str) {
        C8572FgR c8572FgR = this.A02.get(str);
        if (c8572FgR != null) {
            return c8572FgR.A02;
        }
        return null;
    }

    public final Fragment A01(String str) {
        Fragment fragmentFindFragmentByWho;
        Iterator itA0x = BV5.A0x(this.A02);
        while (itA0x.hasNext()) {
            C8572FgR c8572FgR = (C8572FgR) itA0x.next();
            if (c8572FgR != null && (fragmentFindFragmentByWho = c8572FgR.A02.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final List<Fragment> A03() {
        ArrayList arrayListA0t;
        ArrayList<Fragment> arrayList = this.A01;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (arrayList) {
            arrayListA0t = BV4.A0t(arrayList);
        }
        return arrayListA0t;
    }

    public final void A04(Fragment fragment) {
        ArrayList<Fragment> arrayList = this.A01;
        if (arrayList.contains(fragment)) {
            throw AbstractC7607F5u.A10(fragment, "Fragment already added: ");
        }
        synchronized (arrayList) {
            arrayList.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final void A05(C8572FgR c8572FgR) {
        Fragment fragment = c8572FgR.A02;
        String str = fragment.mWho;
        HashMap<String, C8572FgR> map = this.A02;
        if (map.get(str) == null) {
            map.put(fragment.mWho, c8572FgR);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                boolean z = fragment.mRetainInstance;
                C8574FgV c8574FgV = this.A00;
                if (z) {
                    c8574FgV.A04(fragment);
                } else {
                    c8574FgV.A05(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (AbstractC8571FgQ.A0L()) {
                AbstractC7607F5u.A1N(AnonymousClass007.A0a("Added fragment to active set ", fragment));
            }
        }
    }

    public final void A06(C8572FgR c8572FgR) {
        Fragment fragment = c8572FgR.A02;
        if (fragment.mRetainInstance) {
            this.A00.A05(fragment);
        }
        HashMap<String, C8572FgR> map = this.A02;
        if (map.get(fragment.mWho) == c8572FgR && map.put(fragment.mWho, null) != null && AbstractC8571FgQ.A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("Removed fragment from active set ", fragment));
        }
    }

    public final List<C8572FgR> A02() {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0x = BV5.A0x(this.A02);
        while (itA0x.hasNext()) {
            Object next = itA0x.next();
            if (next != null) {
                arrayListA0h.add(next);
            }
        }
        return arrayListA0h;
    }
}
