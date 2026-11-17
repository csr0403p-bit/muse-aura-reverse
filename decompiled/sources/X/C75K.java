package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.75K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75K {
    public static final int A00(C059672t c059672t) {
        int i = c059672t.A00;
        int i2 = 8388611;
        if (!AnonymousClass002.A1Q(i, 0)) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", C60R.A0h("Horizontal(value=", C60O.A0x("Unknown horizontal alignment: "), i));
            }
        }
        int i3 = c059672t.A01;
        int i4 = 48;
        if (!AnonymousClass002.A1Q(i3, 0)) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", C60R.A0h("Vertical(value=", C60O.A0x("Unknown vertical alignment: "), i3));
            }
        }
        return i4 | i2;
    }

    public static final RemoteViews A01(ComponentName componentName, Context context, C063975v c063975v, C75j c75j, AnonymousClass733 anonymousClass733, int i, int i2, long j) {
        return A02(new C75P(componentName, context, c063975v, new C75T(-1, -1, AGH.A0E()), c75j, null, new AtomicBoolean(false), new AtomicInteger(-1), i, -1, -1, -1, j, context.getResources().getConfiguration().getLayoutDirection() == 1, false, false), ((AnonymousClass738) anonymousClass733).A01, i2);
    }

    public static final RemoteViews A02(C75P c75p, List<? extends C73D> list, int i) {
        Object obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<? extends C73D> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof AnonymousClass739)) {
                    C73D c73d = (C73D) AbstractC0878AGe.A0J(list);
                    C062475b c062475bA04 = C75c.A04(c73d.AHq(), c75p, i);
                    RemoteViews remoteViews = c062475bA04.A00;
                    C75P c75pA01 = c75p.A01(c062475bA04.A01, 0);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    AtomicInteger atomicInteger = new AtomicInteger(-1);
                    Context context = c75pA01.A06;
                    int i2 = c75pA01.A00;
                    boolean z = c75pA01.A0F;
                    C75j c75j = c75pA01.A09;
                    int i3 = c75pA01.A01;
                    boolean z2 = c75pA01.A0E;
                    C75T c75t = c75pA01.A08;
                    long j = c75pA01.A04;
                    int i4 = c75pA01.A03;
                    int i5 = c75pA01.A02;
                    boolean z3 = c75pA01.A0D;
                    A03(remoteViews, c73d, new C75P(c75pA01.A05, context, c75pA01.A07, c75t, c75j, c75pA01.A0A, atomicBoolean, atomicInteger, i2, i3, i4, i5, j, z, z2, z3));
                    return remoteViews;
                }
            }
        }
        Object objA0F = AbstractC0878AGe.A0F(list);
        C7384Etj.A0Z(objA0F, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        C70B c70b = ((AnonymousClass739) objA0F).A01;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (C73D c73d2 : list) {
            C7384Etj.A0Z(c73d2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            AnonymousClass739 anonymousClass739 = (AnonymousClass739) c73d2;
            long j2 = anonymousClass739.A00;
            C062475b c062475bA042 = C75c.A04(anonymousClass739.AHq(), c75p, i);
            RemoteViews remoteViews2 = c062475bA042.A00;
            C75P c75pA012 = c75p.A01(c062475bA042.A01, 0);
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            AtomicInteger atomicInteger2 = new AtomicInteger(-1);
            Context context2 = c75pA012.A06;
            int i6 = c75pA012.A00;
            boolean z4 = c75pA012.A0F;
            C75j c75j2 = c75pA012.A09;
            int i7 = c75pA012.A01;
            boolean z5 = c75pA012.A0E;
            C75T c75t2 = c75pA012.A08;
            int i8 = c75pA012.A03;
            int i9 = c75pA012.A02;
            boolean z6 = c75pA012.A0D;
            A03(remoteViews2, c73d2, new C75P(c75pA012.A05, context2, c75pA012.A07, c75t2, c75j2, c75pA012.A0A, atomicBoolean2, atomicInteger2, i6, i7, i8, i9, j2, z4, z5, z6));
            AnonymousClass002.A1J(new SizeF(AnonymousClass003.A03(j2), Float.intBitsToFloat(AnonymousClass002.A09(j2))), remoteViews2, arrayListA0m);
        }
        if (c70b instanceof C73B) {
            obj = ((HxE) AbstractC0878AGe.A0J(arrayListA0m)).second;
        } else {
            if (!C7384Etj.areEqual(c70b, C70A.A00)) {
                throw C3cG.A0q();
            }
            if (Build.VERSION.SDK_INT >= 31) {
                return AbstractC064075w.A00(AGH.A06(arrayListA0m));
            }
            if (arrayListA0m.size() != 1 && arrayListA0m.size() != 2) {
                throw C60O.A0i("unsupported views size");
            }
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0m);
            Iterator it2 = arrayListA0m.iterator();
            while (it2.hasNext()) {
                arrayListA0m2.add(C60Q.A10(it2).second);
            }
            int size = arrayListA0m2.size();
            if (size != 1) {
                if (size == 2) {
                    return new RemoteViews((RemoteViews) arrayListA0m2.get(0), (RemoteViews) arrayListA0m2.get(1));
                }
                throw C60O.A0i("There must be between 1 and 2 views.");
            }
            obj = arrayListA0m2.get(0);
        }
        return (RemoteViews) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.widget.RemoteViews r38, X.C73D r39, X.C75P r40) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75K.A03(android.widget.RemoteViews, X.73D, X.75P):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/widget/RemoteViews;LX/75P;LX/75T;Ljava/util/List<+LX/73D;>;)V */
    public static final void A04(RemoteViews remoteViews, C75T c75t, C75P c75p, List list) {
        int i = 0;
        for (Object obj : AbstractC0878AGe.A0a(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            A03(remoteViews, (C73D) obj, c75p.A01(c75t, i));
            i = i2;
        }
    }
}
