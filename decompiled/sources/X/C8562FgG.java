package X;

import android.content.res.Resources;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.FgG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8562FgG extends AbstractC2185B9e {
    public final /* synthetic */ AbstractC8571FgQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8562FgG(AbstractC8571FgQ abstractC8571FgQ) {
        super(false);
        this.A00 = abstractC8571FgQ;
    }

    @Override // X.AbstractC2185B9e
    public final void A03() {
        if (AbstractC8571FgQ.A0N(3)) {
            AbstractC7607F5u.A1O(A00(this, "handleOnBackCancelled. PREDICTIVE_BACK = "));
        }
        final AbstractC8571FgQ abstractC8571FgQ = this.A00;
        if (AbstractC8571FgQ.A0N(3)) {
            AbstractC7607F5u.A1O(C8j3.A14(abstractC8571FgQ.A05, C60O.A0x("cancelBackStackTransition for transition ")));
        }
        C8573FgU c8573FgU = abstractC8571FgQ.A05;
        if (c8573FgU != null) {
            c8573FgU.A01 = false;
            c8573FgU.A04();
            Runnable runnable = new Runnable() { // from class: X.FgI
                public static final String __redex_internal_original_name = "FragmentManager$$ExternalSyntheticLambda5";

                @Override // java.lang.Runnable
                public final void run() {
                    Iterator<InterfaceC8627Fhb> it = abstractC8571FgQ.A0E.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            };
            ArrayList<Runnable> arrayListA0h = c8573FgU.A0A;
            if (arrayListA0h == null) {
                arrayListA0h = C3cG.A0h();
                c8573FgU.A0A = arrayListA0h;
            }
            arrayListA0h.add(runnable);
            c8573FgU.A03(false, true);
            abstractC8571FgQ.A0G = true;
            abstractC8571FgQ.A0s(true);
            AbstractC8571FgQ.A0E(abstractC8571FgQ);
            abstractC8571FgQ.A0G = false;
            abstractC8571FgQ.A05 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // X.AbstractC2185B9e
    public final void A04() throws Resources.NotFoundException {
        if (AbstractC8571FgQ.A0N(3)) {
            AbstractC7607F5u.A1O(A00(this, "handleOnBackPressed. PREDICTIVE_BACK = "));
        }
        AbstractC8571FgQ abstractC8571FgQ = this.A00;
        abstractC8571FgQ.A0G = true;
        abstractC8571FgQ.A0s(true);
        abstractC8571FgQ.A0G = false;
        C8573FgU c8573FgU = abstractC8571FgQ.A05;
        if (c8573FgU == null) {
            boolean z = abstractC8571FgQ.A0R.A00;
            boolean zA0N = AbstractC8571FgQ.A0N(3);
            if (z) {
                if (zA0N) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                AbstractC8571FgQ.A0Q(abstractC8571FgQ, -1, 0);
                return;
            } else {
                if (zA0N) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                abstractC8571FgQ.A01.A01.A03();
                return;
            }
        }
        ArrayList<InterfaceC8627Fhb> arrayList = abstractC8571FgQ.A0E;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC8571FgQ.A03(c8573FgU));
            Iterator<InterfaceC8627Fhb> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
        Iterator<C8598Fh0> it3 = abstractC8571FgQ.A05.A0B.iterator();
        while (it3.hasNext()) {
            Fragment fragment = it3.next().A05;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it4 = abstractC8571FgQ.A0Z(BV4.A0t(Collections.singletonList(abstractC8571FgQ.A05)), 0, 1).iterator();
        while (it4.hasNext()) {
            AbstractC8541Ffu abstractC8541Ffu = (AbstractC8541Ffu) it4.next();
            if (AbstractC8571FgQ.A0N(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            List<C8542Ffv> list = abstractC8541Ffu.A05;
            AbstractC8541Ffu.A07(abstractC8541Ffu, list);
            AbstractC8541Ffu.A06(abstractC8541Ffu, list);
        }
        Iterator<C8598Fh0> it5 = abstractC8571FgQ.A05.A0B.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = it5.next().A05;
            if (fragment2 != null && fragment2.mContainer == null) {
                abstractC8571FgQ.A0X(fragment2).A04();
            }
        }
        abstractC8571FgQ.A05 = null;
        AbstractC8571FgQ.A0F(abstractC8571FgQ);
        if (AbstractC8571FgQ.A0N(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            StringBuilder sbA0x = C60O.A0x("OnBackPressedCallback enabled=");
            sbA0x.append(abstractC8571FgQ.A0R.A00);
            Log.d("FragmentManager", AnonymousClass006.A0y(abstractC8571FgQ, " for  FragmentManager ", sbA0x));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractCollection, java.util.HashSet] */
    @Override // X.AbstractC2185B9e
    public final void A06(C2194B9z c2194B9z) {
        if (AbstractC8571FgQ.A0N(2)) {
            AbstractC7607F5u.A1N(A00(this, "handleOnBackProgressed. PREDICTIVE_BACK = "));
        }
        AbstractC8571FgQ abstractC8571FgQ = this.A00;
        C8573FgU c8573FgU = abstractC8571FgQ.A05;
        if (c8573FgU != null) {
            Iterator it = abstractC8571FgQ.A0Z(BV4.A0t(Collections.singletonList(c8573FgU)), 0, 1).iterator();
            while (it.hasNext()) {
                AbstractC8541Ffu abstractC8541Ffu = (AbstractC8541Ffu) it.next();
                if (AbstractC8571FgQ.A0N(2)) {
                    float f = c2194B9z.A00;
                    StringBuilder sbA0g = C3cG.A0g("SpecialEffectsController: Processing Progress ");
                    sbA0g.append(f);
                    AbstractC7607F5u.A1N(sbA0g.toString());
                }
                List<C8542Ffv> list = abstractC8541Ffu.A05;
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<C8542Ffv> it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC0882AGj.A0r(AbstractC7607F5u.A0l(it2).A0A, arrayListA0h);
                }
                List listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0g(arrayListA0h));
                int size = listA0X.size();
                for (int i = 0; i < size; i++) {
                    ((C8552Fg5) listA0X.get(i)).A04(c2194B9z);
                }
            }
            Iterator<InterfaceC8627Fhb> it3 = abstractC8571FgQ.A0E.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    public static String A00(C8562FgG c8562FgG, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(true);
        sb.append(" fragment manager ");
        sb.append(c8562FgG.A00);
        return sb.toString();
    }

    @Override // X.AbstractC2185B9e
    public final void A05() {
        if (AbstractC8571FgQ.A0M()) {
            AbstractC7607F5u.A1O(A00(this, "handleOnBackStarted. PREDICTIVE_BACK = "));
        }
        AbstractC8571FgQ abstractC8571FgQ = this.A00;
        AbstractC8571FgQ.A0D(abstractC8571FgQ);
        abstractC8571FgQ.A0p(new C8563FgH(abstractC8571FgQ), false);
    }
}
