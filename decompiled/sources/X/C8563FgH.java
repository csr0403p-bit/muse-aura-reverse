package X;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.FgH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8563FgH implements InterfaceC8038FQp {
    public final /* synthetic */ AbstractC8571FgQ A00;

    public C8563FgH(AbstractC8571FgQ abstractC8571FgQ) {
        this.A00 = abstractC8571FgQ;
    }

    @Override // X.InterfaceC8038FQp
    public final boolean ABs(ArrayList<C8573FgU> arrayList, ArrayList<Boolean> arrayList2) {
        boolean zA0x;
        AbstractC8571FgQ abstractC8571FgQ = this.A00;
        if (AbstractC8571FgQ.A0L()) {
            Log.v("FragmentManager", C8j3.A14(abstractC8571FgQ.A0V, C60O.A0x("FragmentManager has the following pending actions inside of prepareBackStackState: ")));
        }
        ArrayList<C8573FgU> arrayList3 = abstractC8571FgQ.A0D;
        if (arrayList3.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zA0x = false;
        } else {
            C8573FgU c8573FgU = arrayList3.get(arrayList3.size() - 1);
            abstractC8571FgQ.A05 = c8573FgU;
            Iterator<C8598Fh0> it = c8573FgU.A0B.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().A05;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            zA0x = abstractC8571FgQ.A0x(null, arrayList, arrayList2, -1, 0);
        }
        ArrayList<InterfaceC8627Fhb> arrayList4 = abstractC8571FgQ.A0E;
        if (!arrayList4.isEmpty() && arrayList.size() > 0) {
            arrayList2.get(C8j3.A0K(arrayList));
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator<C8573FgU> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSetA0k.addAll(AbstractC8571FgQ.A03(it2.next()));
            }
            Iterator<InterfaceC8627Fhb> it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                it3.next();
                Iterator it4 = linkedHashSetA0k.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
            }
        }
        return zA0x;
    }
}
