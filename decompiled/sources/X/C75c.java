package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.75c, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75c {
    public static final int A00;
    public static final int A01;
    public static final Map<C75e, Integer> A02 = AGH.A0D(AnonymousClass002.A0p(C75e.A0O, R.layout._name_removed__res_0x7f0d0230), AnonymousClass002.A0p(C75e.A0G, R.layout._name_removed__res_0x7f0d01ef), AnonymousClass002.A0p(C75e.A04, R.layout._name_removed__res_0x7f0d0164), AnonymousClass002.A0p(C75e.A05, R.layout._name_removed__res_0x7f0d0165), AnonymousClass002.A0p(C75e.A03, R.layout._name_removed__res_0x7f0d0158), AnonymousClass002.A0p(C75e.A0M, R.layout._name_removed__res_0x7f0d0218), AnonymousClass002.A0p(C75e.A0N, R.layout._name_removed__res_0x7f0d0219), AnonymousClass002.A0p(C75e.A08, R.layout._name_removed__res_0x7f0d018e), AnonymousClass002.A0p(C75e.A09, R.layout._name_removed__res_0x7f0d019a), AnonymousClass002.A0p(C75e.A0A, R.layout._name_removed__res_0x7f0d019e), AnonymousClass002.A0p(C75e.A0D, R.layout._name_removed__res_0x7f0d01ca), AnonymousClass002.A0p(C75e.A0E, R.layout._name_removed__res_0x7f0d01ce), AnonymousClass002.A0p(C75e.A0B, R.layout._name_removed__res_0x7f0d01b2), AnonymousClass002.A0p(C75e.A0C, R.layout._name_removed__res_0x7f0d01b6), AnonymousClass002.A0p(C75e.A0F, R.layout._name_removed__res_0x7f0d01e3), AnonymousClass002.A0p(C75e.A06, R.layout._name_removed__res_0x7f0d017f), AnonymousClass002.A0p(C75e.A0S, R.layout._name_removed__res_0x7f0d0260), AnonymousClass002.A0p(C75e.A0U, R.layout._name_removed__res_0x7f0d0278), AnonymousClass002.A0p(C75e.A0T, R.layout._name_removed__res_0x7f0d026c), AnonymousClass002.A0p(C75e.A0R, R.layout._name_removed__res_0x7f0d0254), AnonymousClass002.A0p(C75e.A0Q, R.layout._name_removed__res_0x7f0d0248), AnonymousClass002.A0p(C75e.A0P, R.layout._name_removed__res_0x7f0d023c), AnonymousClass002.A0p(C75e.A0H, R.layout._name_removed__res_0x7f0d01fb), AnonymousClass002.A0p(C75e.A0I, R.layout._name_removed__res_0x7f0d01fc));

    public static final int A00(RemoteViews remoteViews, C75P c75p, Integer num, Integer num2, int i) {
        Integer num3 = num;
        Integer num4 = C79.A01;
        if (num == num4) {
            num3 = C79.A00;
        }
        Integer num5 = num2;
        if (num2 == num4) {
            num5 = C79.A00;
        }
        C063675s c063675sA01 = C063675s.A01(num3, num5);
        Map<C063675s, Integer> map = c75p.A08.A02.get(Integer.valueOf(i));
        if (map == null) {
            throw C3cG.A0Q(FGI.A0H("Parent doesn't have child position ", i));
        }
        Integer num6 = map.get(c063675sA01);
        if (num6 == null) {
            StringBuilder sbA0y = C60O.A0y("No child for position ", i);
            sbA0y.append(" and size ");
            sbA0y.append(AnonymousClass768.A00(num));
            sbA0y.append(" x ");
            throw C3cG.A0Q(AnonymousClass001.A0v(AnonymousClass768.A00(num2), sbA0y));
        }
        int iIntValue = num6.intValue();
        Collection<Integer> collectionValues = map.values();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Integer num7 : collectionValues) {
            if (AnonymousClass001.A0F(num7) != iIntValue) {
                arrayListA0h.add(num7);
            }
        }
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            C75a.A00(remoteViews, c75p, Integer.valueOf(R.id.deletedViewId), C60Q.A03(it), R.layout._name_removed__res_0x7f0d018c);
        }
        return iIntValue;
    }

    static {
        int size = AbstractC062575d.A04.size();
        A01 = size;
        A00 = Build.VERSION.SDK_INT >= 31 ? 400 : 400 / size;
    }

    public static final C75T A02(RemoteViews remoteViews, C76B c76b, C75e c75e, C75P c75p, C059472r c059472r, C059572s c059572s, int i) {
        int i2;
        if (i > 10) {
            StringBuilder sbA0f = C3cG.A0f(c75e, "Truncated ");
            sbA0f.append(" container from ");
            sbA0f.append(i);
            String strA0v = AnonymousClass001.A0v(" to 10 elements", sbA0f);
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(c75e);
            Log.e("GlanceAppWidget", strA0v, C60O.A0i(AnonymousClass001.A0v(" container cannot have more than 10 elements", sbA0w)));
            i2 = 10;
        } else {
            i2 = i;
        }
        Integer numA05 = A05(c76b, c75e);
        if (numA05 == null) {
            AnonymousClass760 anonymousClass760 = AbstractC062575d.A03.get(AnonymousClass736.A00(c75e, c059472r, c059572s, i2));
            if (anonymousClass760 == null) {
                StringBuilder sbA0f2 = C3cG.A0f(c75e, "Cannot find container ");
                sbA0f2.append(" with ");
                sbA0f2.append(i);
                throw C60O.A0i(AnonymousClass001.A0v(" children", sbA0f2));
            }
            numA05 = Integer.valueOf(anonymousClass760.A00);
        }
        int iIntValue = numA05.intValue();
        Map<Integer, Map<C063675s, Integer>> map = AbstractC062575d.A01.get(c75e);
        if (map == null) {
            throw C60O.A0i(AnonymousClass007.A0a("Cannot find generated children for ", c75e));
        }
        C75T c75tA03 = A03(remoteViews, c76b, c75p, iIntValue);
        C75T c75t = new C75T(c75tA03.A01, c75tA03.A00, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(c75t.A01);
        }
        return c75t;
    }

    public static final C75T A03(RemoteViews remoteViews, C76B c76b, C75P c75p, int i) {
        int iA00;
        int i2 = c75p.A01;
        Integer numValueOf = null;
        C062875i c062875i = (C062875i) c76b.foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.76I
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i2;
            }
        });
        C72e c72e = c062875i != null ? c062875i.A00 : AnonymousClass735.A00;
        C062775h c062775h = (C062775h) c76b.foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.76H
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h2;
            }
        });
        C72e c72e2 = c062775h != null ? c062775h.A00 : AnonymousClass735.A00;
        if (!c76b.all(new C8i1(2))) {
            if (c75p.A0B.getAndSet(true)) {
                throw C3cG.A0Q("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (numValueOf != null) {
                iA00 = numValueOf.intValue();
            } else {
                int iIncrementAndGet = c75p.A0C.incrementAndGet();
                Map<C061673p, C064275z> map = AbstractC062575d.A05;
                if (iIncrementAndGet >= 500) {
                    throw C3cG.A0Q("There are too many views");
                }
                iA00 = R.id.glance_view_id_000 + iIncrementAndGet;
            }
            c75p.A06.getPackageName();
            C76W.A00(remoteViews, C76P.A00(i, iA00), c75p.A08.A01, i2);
        } else if (i3 >= 31) {
            C72T c72t = C72T.A00;
            iA00 = C75a.A00(remoteViews, c75p, numValueOf, A00(remoteViews, c75p, c72e.equals(c72t) ? C79.A0C : C79.A00, c72e2.equals(c72t) ? C79.A0C : C79.A00, i2), i);
        } else {
            Integer numA06 = A06(c72e);
            Integer numA062 = A06(c72e2);
            int iA002 = A00(remoteViews, c75p, numA06, numA062, i2);
            Integer num = C79.A01;
            if (numA06 == num || numA062 == num) {
                C064275z c064275z = AbstractC062575d.A02.get(C063675s.A01(numA06, numA062));
                if (c064275z != null) {
                    return new C75T(C75a.A00(remoteViews, c75p, numValueOf, R.id.glanceViewStub, i), C75a.A00(remoteViews, c75p, null, iA002, c064275z.A00), AGH.A0E());
                }
                throw C60O.A0i(FGI.A0d("Could not find complex layout for width=", AnonymousClass768.A00(numA06), ", height=", AnonymousClass768.A00(numA062)));
            }
            iA00 = C75a.A00(remoteViews, c75p, numValueOf, iA002, i);
        }
        return new C75T(iA00, -1, AGH.A0E());
    }

    public static final C062475b A04(C76B c76b, C75P c75p, int i) {
        RemoteViews remoteViews;
        C75T c75t;
        Map mapA10;
        Context context = c75p.A06;
        int i2 = Build.VERSION.SDK_INT;
        String strA00 = AbstractC7606F5t.A00(17);
        if (i2 >= 31) {
            Map<C061673p, C064275z> map = AbstractC062575d.A05;
            if (i >= 400) {
                throw C60O.A0i(FGI.A0T("Index of the root view cannot be more than ", strA00, 400, i));
            }
            C063675s c063675sA00 = C063675s.A00(C79.A00);
            remoteViews = new RemoteViews(context.getPackageName(), R.layout._name_removed__res_0x7f0d02f8 + i);
            C062875i c062875i = (C062875i) c76b.foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.76K
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.G0V
                public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i2, InterfaceC060673f interfaceC060673f) {
                    return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i2;
                }
            });
            if (c062875i != null) {
                C75L.A03(remoteViews, c062875i, R.id.rootView);
            }
            C062775h c062775h = (C062775h) c76b.foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.76J
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.G0V
                public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h2, InterfaceC060673f interfaceC060673f) {
                    return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h2;
                }
            });
            if (c062775h != null) {
                C75L.A02(remoteViews, c062775h, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
                mapA10 = AGH.A0E();
            } else {
                mapA10 = AnonymousClass006.A10(0, AnonymousClass006.A10(c063675sA00, Integer.valueOf(R.id.rootStubId)));
            }
            c75t = new C75T(R.id.rootView, -1, mapA10);
        } else {
            int i3 = A01 * i;
            Map<C061673p, C064275z> map2 = AbstractC062575d.A05;
            if (i3 >= 400) {
                throw C60O.A0i(FGI.A0T("Index of the root view cannot be more than ", strA00, 100, i));
            }
            C062875i c062875i2 = (C062875i) c76b.foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.76M
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.G0V
                public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i3, InterfaceC060673f interfaceC060673f) {
                    return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i3;
                }
            });
            Object obj = c062875i2 != null ? c062875i2.A00 : AnonymousClass735.A00;
            C062775h c062775h2 = (C062775h) c76b.foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.76L
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.G0V
                public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h3, InterfaceC060673f interfaceC060673f) {
                    return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h3;
                }
            });
            Object obj2 = c062775h2 != null ? c062775h2.A00 : AnonymousClass735.A00;
            C72U c72u = C72U.A00;
            Integer num = obj.equals(c72u) ? C79.A0K : C79.A00;
            Integer num2 = obj2.equals(c72u) ? C79.A0K : C79.A00;
            C063675s c063675sA01 = C063675s.A01(num, num2);
            Integer num3 = AbstractC062575d.A04.get(c063675sA01);
            if (num3 == null) {
                throw C3cG.A0Q(FGI.A0e("Cannot find root element for size [", AnonymousClass768.A00(num), ", ", AnonymousClass768.A00(num2), ']'));
            }
            remoteViews = new RemoteViews(context.getPackageName(), R.layout._name_removed__res_0x7f0d02f8 + i3 + num3.intValue());
            c75t = new C75T(-1, -1, AnonymousClass006.A10(0, AnonymousClass006.A10(c063675sA01, Integer.valueOf(R.id.rootStubId))));
        }
        return new C062475b(remoteViews, c75t);
    }

    public static final Integer A05(C76B c76b, C75e c75e) {
        C064275z c064275z;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        C062675g c062675g = (C062675g) c76b.foldIn(null, new G0V<C062675g, InterfaceC060673f, C062675g>() { // from class: X.76V
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062675g invoke(C062675g c062675g2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062675g ? interfaceC060673f : c062675g2;
            }
        });
        C062875i c062875i = (C062875i) c76b.foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.76G
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i2;
            }
        });
        boolean zEquals = c062875i != null ? c062875i.A00.equals(C72T.A00) : false;
        C062775h c062775h = (C062775h) c76b.foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.76F
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h2;
            }
        });
        boolean zEquals2 = c062775h != null ? c062775h.A00.equals(C72T.A00) : false;
        if (c062675g != null) {
            Map<AnonymousClass737, C064275z> map = AbstractC062575d.A00;
            C059672t c059672t = c062675g.A00;
            c064275z = map.get(AnonymousClass737.A00(c75e, c059672t.A00, c059672t.A01));
            if (c064275z == null) {
                throw C60O.A0i(AnonymousClass006.A0y(c059672t, " with alignment ", C3cG.A0f(c75e, "Cannot find ")));
            }
        } else {
            if (!zEquals && !zEquals2) {
                return null;
            }
            c064275z = AbstractC062575d.A05.get(C061673p.A00(c75e, zEquals, zEquals2));
            if (c064275z == null) {
                throw C60O.A0i(AnonymousClass001.A0v(" with defaultWeight set", C3cG.A0f(c75e, "Cannot find ")));
            }
        }
        return Integer.valueOf(c064275z.A00);
    }

    public static final Integer A06(C72e c72e) {
        if (c72e instanceof AnonymousClass735) {
            return C79.A00;
        }
        if (c72e instanceof C72T) {
            return C79.A0C;
        }
        if (c72e instanceof C72U) {
            return C79.A0K;
        }
        if (c72e instanceof C72R) {
            return C79.A01;
        }
        throw C3cG.A0q();
    }

    public static final C75T A01(RemoteViews remoteViews, C76B c76b, C75e c75e, C75P c75p) {
        Integer numA05 = A05(c76b, c75e);
        if (numA05 == null && (numA05 = A02.get(c75e)) == null) {
            throw C60O.A0i(AnonymousClass007.A0a("Cannot use `insertView` with a container like ", c75e));
        }
        return A03(remoteViews, c76b, c75p, numA05.intValue());
    }
}
