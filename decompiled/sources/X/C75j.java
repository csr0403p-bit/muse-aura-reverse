package X;

import android.content.Context;
import android.os.Build;
import androidx.glance.appwidget.LayoutConfiguration$Companion;
import androidx.glance.state.GlanceState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.75j, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75j {
    public static final LayoutConfiguration$Companion A06 = new LayoutConfiguration$Companion();
    public int A00;
    public final int A01;
    public final Context A02;
    public final Map<C064376f, Integer> A03;
    public final Set<Integer> A04;
    public final Set<Integer> A05;

    public static final EnumC063275o A01(int i) {
        if (i == 0) {
            return EnumC063275o.START;
        }
        if (i == 1) {
            return EnumC063275o.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return EnumC063275o.END;
        }
        throw C3cG.A0Q(C60R.A0h("Horizontal(value=", C60O.A0x("unknown horizontal alignment "), i));
    }

    public static final EnumC063075m A00(C72e c72e) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC064175y.A00(c72e);
        }
        int i = C75c.A01;
        if (c72e instanceof C72R) {
            return EnumC063075m.EXACT;
        }
        if (c72e instanceof AnonymousClass735) {
            return EnumC063075m.WRAP;
        }
        if (c72e instanceof C72U) {
            return EnumC063075m.FILL;
        }
        if (c72e instanceof C72T) {
            return EnumC063075m.EXPAND;
        }
        throw C3cG.A0Q("After resolution, no other type should be present");
    }

    public static final C064376f A02(Context context, C73D c73d) {
        EnumC062975l enumC062975l;
        int i;
        int i2;
        EnumC063375p enumC063375p;
        EnumC063175n enumC063175n;
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) C064376f.DEFAULT_INSTANCE.A05(C79.A0P);
        boolean z = c73d instanceof C059972y;
        if (z) {
            enumC062975l = EnumC062975l.BOX;
        } else if (c73d instanceof AnonymousClass731) {
            enumC062975l = C8i1.A00(((AnonymousClass731) c73d).A02) ? EnumC062975l.RADIO_ROW : EnumC062975l.ROW;
        } else if (c73d instanceof AnonymousClass730) {
            enumC062975l = C8i1.A00(((AnonymousClass730) c73d).A02) ? EnumC062975l.RADIO_COLUMN : EnumC062975l.COLUMN;
        } else if (c73d instanceof C058972i) {
            enumC062975l = EnumC062975l.TEXT;
        } else if (c73d instanceof C060072z) {
            enumC062975l = EnumC062975l.LIST_ITEM;
        } else if (c73d instanceof C059872x) {
            enumC062975l = EnumC062975l.LAZY_COLUMN;
        } else if (c73d instanceof C72Q) {
            enumC062975l = EnumC062975l.SPACER;
        } else if (c73d instanceof C061173k) {
            enumC062975l = EnumC062975l.IMAGE;
        } else if (c73d instanceof C059072n) {
            enumC062975l = EnumC062975l.CIRCULAR_PROGRESS_INDICATOR;
        } else if (c73d instanceof AnonymousClass733) {
            enumC062975l = EnumC062975l.REMOTE_VIEWS_ROOT;
        } else {
            if (!(c73d instanceof AnonymousClass739)) {
                throw C60Q.A0U("Unknown element type ", C60Q.A0f(c73d));
            }
            enumC062975l = EnumC062975l.SIZE_BOX;
        }
        A03(abstractC10440Hhn).type_ = enumC062975l.value;
        C062875i c062875i = (C062875i) c73d.AHq().foldIn(null, new G0V<C062875i, InterfaceC060673f, C062875i>() { // from class: X.76E
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062875i invoke(C062875i c062875i2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062875i ? interfaceC060673f : c062875i2;
            }
        });
        A03(abstractC10440Hhn).width_ = A00(c062875i != null ? c062875i.A00 : AnonymousClass735.A00).value;
        C062775h c062775h = (C062775h) c73d.AHq().foldIn(null, new G0V<C062775h, InterfaceC060673f, C062775h>() { // from class: X.76D
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C062775h invoke(C062775h c062775h2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C062775h ? interfaceC060673f : c062775h2;
            }
        });
        A03(abstractC10440Hhn).height_ = A00(c062775h != null ? c062775h.A00 : AnonymousClass735.A00).value;
        A03(abstractC10440Hhn).hasAction_ = AnonymousClass002.A1X(c73d.AHq().foldIn(null, new G0V<C75V, InterfaceC060673f, C75V>() { // from class: X.73d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C75V invoke(C75V c75v, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C75V ? interfaceC060673f : c75v;
            }
        }));
        if (c73d.AHq().foldIn(null, new G0V() { // from class: X.76Z
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return obj;
            }
        }) != null) {
            A03(abstractC10440Hhn).identity_ = EnumC063475q.BACKGROUND_NODE.value;
        }
        if (c73d instanceof C061173k) {
            C061173k c061173k = (C061173k) c73d;
            int i3 = c061173k.A00;
            if (i3 == 1) {
                enumC063175n = EnumC063175n.FIT;
            } else if (i3 == 0) {
                enumC063175n = EnumC063175n.CROP;
            } else {
                if (i3 != 2) {
                    throw C3cG.A0Q(C60R.A0h("ContentScale(value=", C60O.A0x("Unknown content scale "), i3));
                }
                enumC063175n = EnumC063175n.FILL_BOUNDS;
            }
            A03(abstractC10440Hhn).imageScale_ = enumC063175n.value;
            A03(abstractC10440Hhn).hasImageDescription_ = !AbstractC060773g.A02(c061173k);
            A03(abstractC10440Hhn).hasImageColorFilter_ = AnonymousClass002.A1X(c061173k.A01);
            A03(abstractC10440Hhn).hasImageAlpha_ = c061173k.A04 != null;
        } else {
            if (c73d instanceof AnonymousClass730) {
                i = ((AnonymousClass730) c73d).A00;
            } else {
                if (c73d instanceof AnonymousClass731) {
                    i2 = ((AnonymousClass731) c73d).A01;
                } else if (z) {
                    C059972y c059972y = (C059972y) c73d;
                    A03(abstractC10440Hhn).horizontalAlignment_ = A01(c059972y.A01.A00).value;
                    i2 = c059972y.A01.A01;
                } else if (c73d instanceof C059872x) {
                    i = ((AnonymousClass732) c73d).A00;
                }
                if (i2 == 0) {
                    enumC063375p = EnumC063375p.TOP;
                } else if (i2 == 1) {
                    enumC063375p = EnumC063375p.CENTER_VERTICALLY;
                } else {
                    if (i2 != 2) {
                        throw C3cG.A0Q(C60R.A0h("Vertical(value=", C60O.A0x("unknown vertical alignment "), i2));
                    }
                    enumC063375p = EnumC063375p.BOTTOM;
                }
                A03(abstractC10440Hhn).verticalAlignment_ = enumC063375p.value;
            }
            A03(abstractC10440Hhn).horizontalAlignment_ = A01(i).value;
        }
        if ((c73d instanceof AnonymousClass738) && !(c73d instanceof AnonymousClass732)) {
            List<C73D> list = ((AnonymousClass738) c73d).A01;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<C73D> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(A02(context, it.next()));
            }
            C064376f c064376fA03 = A03(abstractC10440Hhn);
            GDM<C064376f> gdmAQz = c064376fA03.children_;
            if (!((GDE) gdmAQz).A00) {
                int size = gdmAQz.size();
                int i4 = size * 2;
                if (size == 0) {
                    i4 = 10;
                }
                gdmAQz = gdmAQz.AQz(i4);
                c064376fA03.children_ = gdmAQz;
            }
            AbstractC10524Hor.A00(arrayListA0i, gdmAQz);
        }
        return (C064376f) abstractC10440Hhn.A00();
    }

    public final int A04(C73D c73d) {
        int iIntValue;
        C064376f c064376fA02 = A02(this.A02, c73d);
        synchronized (this) {
            Map<C064376f, Integer> map = this.A03;
            Integer num = map.get(c064376fA02);
            if (num == null) {
                iIntValue = this.A00;
                do {
                    Set<Integer> set = this.A04;
                    int i = iIntValue + 1;
                    if (C60Q.A1W(set, iIntValue)) {
                        iIntValue = i % C75c.A00;
                    } else {
                        this.A00 = i % C75c.A00;
                        Set<Integer> set2 = this.A05;
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        set2.add(numValueOf);
                        set.add(numValueOf);
                        map.put(c064376fA02, numValueOf);
                    }
                } while (iIntValue != this.A00);
                throw C60O.A0i("Cannot assign a valid layout index to the new layout: no free index left.");
            }
            iIntValue = num.intValue();
            this.A05.add(num);
        }
        return iIntValue;
    }

    public final Object A05(HtJ<? super Unit> htJ) {
        return C3cG.A0U(GlanceState.A00.A02(this.A02, C6PI.A00, FGI.A0H("appWidgetLayout-", this.A01), htJ, new C07228ib(this, (BPp) null, (HtJ<? super C07228ib>) 12)));
    }

    public /* synthetic */ C75j(Context context, Map map, Set set, int i, int i2, int i3) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        set = (i3 & 32) != 0 ? C3cG.A0k() : set;
        this.A02 = context;
        this.A03 = map;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = linkedHashSetA0k;
        this.A04 = set;
    }

    public static C064376f A03(AbstractC10440Hhn abstractC10440Hhn) {
        abstractC10440Hhn.A01();
        return (C064376f) abstractC10440Hhn.A00;
    }
}
