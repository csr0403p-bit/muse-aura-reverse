package X;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;
import com.facebook.primitive.video.ViewOwnerTracker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* renamed from: X.Fgj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8584Fgj {
    public final CopyOnWriteArrayList<FRB> A00 = new CopyOnWriteArrayList<>();
    public final AbstractC8571FgQ A01;

    public final void A01(Bundle bundle, View view, Fragment fragment) {
        C7384Etj.A0Y(view, 1);
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A01(bundle, view, fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A05(Bundle bundle, Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A05(bundle, fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            FRB next = it.next();
            if (!z) {
                AbstractC8601Fh5 abstractC8601Fh5 = next.A00;
                if (abstractC8601Fh5 instanceof C8579Fgd) {
                    C8580Fge c8580Fge = ((C8579Fgd) abstractC8601Fh5).A00;
                    if (fragment.equals(c8580Fge.A02)) {
                        bundle.putInt("key_bloks_navigation_tracker_backstack_size", c8580Fge.A01);
                        Integer num = c8580Fge.A07;
                        if (num != null) {
                            bundle.putInt("key_bloks_navigation_tracker_parent_backstack_size", num.intValue());
                        }
                    }
                }
            }
        }
    }

    public final void A02(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A02(bundle, fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A03(bundle, fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A04(Bundle bundle, Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A04(bundle, fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            FRB next = it.next();
            if (!z) {
                AbstractC8601Fh5 abstractC8601Fh5 = next.A00;
                if (abstractC8601Fh5 instanceof C8578Fgc) {
                    C8578Fgc c8578Fgc = (C8578Fgc) abstractC8601Fh5;
                    if (!fragment.equals(c8578Fgc.A03) && c8578Fgc.A00 == null && bundle == null) {
                        String strA0x = BV7.A0x(fragment);
                        C7384Etj.A0U(strA0x);
                        c8578Fgc.A00 = strA0x;
                        c8578Fgc.A05.invoke(EnumC8596Fgy.A04);
                    }
                }
            }
        }
    }

    public final void A06(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A06(fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A07(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A07(fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A08(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A08(fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A09(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A09(fragment);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A0A(Fragment fragment, boolean z) {
        AbstractC8571FgQ abstractC8571FgQ = this.A01;
        Fragment fragment2 = abstractC8571FgQ.A06;
        if (fragment2 != null) {
            A00(fragment2).A0A(fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            FRB next = it.next();
            if (!z) {
                next.A00.A01(fragment, abstractC8571FgQ);
            }
        }
    }

    public final void A0B(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A0B(fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            FRB next = it.next();
            if (!z) {
                AbstractC8601Fh5 abstractC8601Fh5 = next.A00;
                if (abstractC8601Fh5 instanceof ViewOwnerTracker) {
                    fragment.equals(((ViewOwnerTracker) abstractC8601Fh5).A00);
                }
            }
        }
    }

    public final void A0C(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A0C(fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A0D(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A0D(fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            FRB next = it.next();
            if (!z) {
                AbstractC8601Fh5 abstractC8601Fh5 = next.A00;
                if (abstractC8601Fh5 instanceof C8579Fgd) {
                    C8580Fge c8580Fge = ((C8579Fgd) abstractC8601Fh5).A00;
                    Fragment fragment3 = c8580Fge.A02;
                    if (fragment.equals(fragment3)) {
                        ActivityLifecycleTracker activityLifecycleTracker = c8580Fge.A04;
                        if (activityLifecycleTracker != null && !activityLifecycleTracker.A00) {
                            activityLifecycleTracker.A00 = true;
                            Application application = activityLifecycleTracker.A01.getApplication();
                            if (application != null) {
                                application.registerActivityLifecycleCallbacks(activityLifecycleTracker);
                            }
                        }
                        C8578Fgc c8578Fgc = c8580Fge.A05;
                        if (c8578Fgc != null) {
                            c8578Fgc.A02();
                        }
                        List<Fragment> listA03 = c8580Fge.A03.A0U.A03();
                        C7384Etj.A0U(listA03);
                        if (C7384Etj.areEqual(AbstractC0878AGe.A0I(listA03), fragment3)) {
                            C8580Fge.A00(c8580Fge, EnumC8596Fgy.A02);
                        }
                    }
                }
            }
        }
    }

    public final void A0E(Fragment fragment, boolean z) {
        G0U<EnumC8596Fgy, Unit> g0u;
        EnumC8596Fgy enumC8596Fgy;
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            A00(fragment2).A0E(fragment, true);
        }
        Iterator<FRB> it = this.A00.iterator();
        while (it.hasNext()) {
            FRB next = it.next();
            if (!z) {
                AbstractC8601Fh5 abstractC8601Fh5 = next.A00;
                if (abstractC8601Fh5 instanceof C8578Fgc) {
                    C8578Fgc c8578Fgc = (C8578Fgc) abstractC8601Fh5;
                    int iA0R = c8578Fgc.A04.A0R() - c8578Fgc.A02;
                    if (iA0R == 1) {
                        g0u = c8578Fgc.A05;
                        enumC8596Fgy = EnumC8596Fgy.A04;
                    } else if (iA0R <= -1) {
                        g0u = c8578Fgc.A05;
                        enumC8596Fgy = EnumC8596Fgy.A03;
                    }
                    g0u.invoke(enumC8596Fgy);
                }
            }
        }
    }

    public C8584Fgj(AbstractC8571FgQ abstractC8571FgQ) {
        this.A01 = abstractC8571FgQ;
    }

    public static C8584Fgj A00(Fragment fragment) {
        AbstractC8571FgQ parentFragmentManager = fragment.getParentFragmentManager();
        C7384Etj.A0U(parentFragmentManager);
        return parentFragmentManager.A0T;
    }
}
