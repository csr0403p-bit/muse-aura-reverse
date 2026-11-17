package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.FgV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8574FgV extends AEs {
    public static final InterfaceC08439ui A06 = new InterfaceC08439ui() { // from class: X.9um
        @Override // X.InterfaceC08439ui
        public final <T extends AEs> T create(Class<T> cls) {
            return new C8574FgV(true);
        }

        @Override // X.InterfaceC08439ui
        public final /* synthetic */ AEs create(C9uG c9uG, A6J a6j) {
            return AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public final /* synthetic */ AEs create(Class cls, A6J a6j) {
            return InterfaceC08439ui.A00(this, cls);
        }
    };
    public final boolean A05;
    public final HashMap<String, Fragment> A03 = BV4.A0u();
    public final HashMap<String, C8574FgV> A02 = BV4.A0u();
    public final HashMap<String, BJt> A04 = BV4.A0u();
    public boolean A00 = false;
    public boolean A01 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C8574FgV c8574FgV = (C8574FgV) obj;
                if (!this.A03.equals(c8574FgV.A03) || !this.A02.equals(c8574FgV.A02) || !this.A04.equals(c8574FgV.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A03(C8574FgV c8574FgV, String str, boolean z) {
        HashMap<String, C8574FgV> map = c8574FgV.A02;
        C8574FgV c8574FgV2 = map.get(str);
        if (c8574FgV2 != null) {
            if (z) {
                ArrayList arrayListA0h = C3cG.A0h();
                arrayListA0h.addAll(c8574FgV2.A02.keySet());
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    c8574FgV2.A06(AnonymousClass005.A0j(it), true);
                }
            }
            c8574FgV2.onCleared();
            map.remove(str);
        }
        HashMap<String, BJt> map2 = c8574FgV.A04;
        BJt bJt = map2.get(str);
        if (bJt != null) {
            bJt.A00();
            map2.remove(str);
        }
    }

    public final void A04(Fragment fragment) {
        String strA0a;
        if (!this.A01) {
            HashMap<String, Fragment> map = this.A03;
            if (map.containsKey(fragment.mWho)) {
                return;
            }
            map.put(fragment.mWho, fragment);
            if (!AbstractC8571FgQ.A0N(2)) {
                return;
            } else {
                strA0a = AnonymousClass007.A0a("Updating retained Fragments: Added ", fragment);
            }
        } else if (!AbstractC8571FgQ.A0N(2)) {
            return;
        } else {
            strA0a = "Ignoring addRetainedFragment as the state is already saved";
        }
        Log.v("FragmentManager", strA0a);
    }

    public final void A05(Fragment fragment) {
        String strA0a;
        if (this.A01) {
            if (!AbstractC8571FgQ.A0N(2)) {
                return;
            } else {
                strA0a = "Ignoring removeRetainedFragment as the state is already saved";
            }
        } else if (this.A03.remove(fragment.mWho) == null || !AbstractC8571FgQ.A0N(2)) {
            return;
        } else {
            strA0a = AnonymousClass007.A0a("Updating retained Fragments: Removed ", fragment);
        }
        Log.v("FragmentManager", strA0a);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A03)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FragmentManagerViewModel{");
        AbstractC7609F5w.A1K(sbA0x, this);
        sbA0x.append("} Fragments (");
        Iterator itA0x = BV5.A0x(this.A03);
        while (itA0x.hasNext()) {
            sbA0x.append(itA0x.next());
            if (itA0x.hasNext()) {
                sbA0x.append(", ");
            }
        }
        sbA0x.append(") Child Non Config (");
        Iterator itA0y = BV5.A0y(this.A02);
        while (itA0y.hasNext()) {
            sbA0x.append(AnonymousClass005.A0j(itA0y));
            if (itA0y.hasNext()) {
                sbA0x.append(", ");
            }
        }
        sbA0x.append(") ViewModelStores (");
        Iterator itA0y2 = BV5.A0y(this.A04);
        while (itA0y2.hasNext()) {
            sbA0x.append(AnonymousClass005.A0j(itA0y2));
            if (itA0y2.hasNext()) {
                sbA0x.append(", ");
            }
        }
        return AnonymousClass006.A0z(sbA0x);
    }

    public C8574FgV(boolean z) {
        this.A05 = z;
    }

    public final void A06(String str, boolean z) {
        if (AbstractC8571FgQ.A0M()) {
            AbstractC7607F5u.A1O(FGI.A0M("Clearing non-config state for saved state of Fragment ", str));
        }
        A03(this, str, z);
    }

    @Override // X.AEs
    public final void onCleared() {
        if (AbstractC8571FgQ.A0M()) {
            AbstractC7607F5u.A1O(AnonymousClass007.A0a("onCleared called for ", this));
        }
        this.A00 = true;
    }
}
