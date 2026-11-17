package X;

import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AGI {
    public static AuraMarkdownDocument A03(Iterable iterable) {
        AHD ahdA07 = A07(iterable);
        C7384Etj.A0Y(ahdA07, 0);
        return new AuraMarkdownDocument(ahdA07);
    }

    public static final <T> AHD<T> A07(Iterable<? extends T> iterable) {
        AHD<T> ahd;
        C7384Etj.A0Y(iterable, 0);
        return (!(iterable instanceof AHD) || (ahd = (AHD) iterable) == null) ? A0C(iterable) : ahd;
    }

    public static final <K, V> BO6<K, V> A08(Map<K, ? extends V> map) {
        AGJ agj;
        BO6<K, V> bo6A5S;
        C7384Etj.A0Y(map, 0);
        return ((!(map instanceof BO6) || (bo6A5S = (BO6) map) == null) && (!(map instanceof AGJ) || (agj = (AGJ) map) == null || (bo6A5S = agj.A5S()) == null)) ? C0953AJg.A03.AYm(map) : bo6A5S;
    }

    public static final <T> BQI<T> A09(Iterable<? extends T> iterable) {
        AGL agl;
        BQI<T> bqiA5T;
        C7384Etj.A0Y(iterable, 0);
        return ((!(iterable instanceof BQI) || (bqiA5T = (BQI) iterable) == null) && (!(iterable instanceof AGL) || (agl = (AGL) iterable) == null || (bqiA5T = agl.A5T()) == null)) ? A0I(iterable, C0943AIw.A03) : bqiA5T;
    }

    public static final <T> AHH<T> A0C(Iterable<? extends T> iterable) {
        AGK agk;
        AHH<T> ahhA5R;
        AHH<T> ahh;
        C7384Etj.A0Y(iterable, 0);
        if ((iterable instanceof AHH) && (ahh = (AHH) iterable) != null) {
            return ahh;
        }
        if ((iterable instanceof AGK) && (agk = (AGK) iterable) != null && (ahhA5R = agk.A5R()) != null) {
            return ahhA5R;
        }
        AHI ahi = AHI.A01;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            C7384Etj.A0Y(collection, 1);
            return (AHH<T>) ahi.A3M(collection);
        }
        AHL ahlA5c = ahi.A5c();
        AbstractC0882AGj.A0r(iterable, ahlA5c);
        return ahlA5c.A5R();
    }

    public static final <T> AHD<T> A0D(C3b6<? extends T> c3b6) {
        C7384Etj.A0Y(c3b6, 0);
        AHL ahlA5c = AHI.A01.A5c();
        Iterator<? extends T> it = c3b6.iterator();
        while (it.hasNext()) {
            ahlA5c.add(it.next());
        }
        return ahlA5c.A5R();
    }

    public static final <E> AHH<E> A0E(E... eArr) {
        C7384Etj.A0Y(eArr, 0);
        return AHI.A01.A3M(Arrays.asList(eArr));
    }

    public static final <K, V> InterfaceC0962AJp<K, V> A0F(Map<K, ? extends V> map) {
        C0954AJh c0954AJh;
        InterfaceC0962AJp<K, V> interfaceC0962AJpA5S;
        C7384Etj.A0Y(map, 0);
        return ((!(map instanceof C0953AJg) || (interfaceC0962AJpA5S = (C0953AJg) map) == null) && (!(map instanceof C0954AJh) || (c0954AJh = (C0954AJh) map) == null || (interfaceC0962AJpA5S = c0954AJh.A5S()) == null)) ? C0953AJg.A03.AYm(map) : interfaceC0962AJpA5S;
    }

    public static final <T> AHG<T> A0H(Iterable<? extends T> iterable) {
        C0944AIx c0944AIx;
        C0943AIw c0943AIwA5T;
        C7384Etj.A0Y(iterable, 0);
        return ((!(iterable instanceof C0943AIw) || (c0943AIwA5T = (C0943AIw) iterable) == null) && (!(iterable instanceof C0944AIx) || (c0944AIx = (C0944AIx) iterable) == null || (c0943AIwA5T = c0944AIx.A5T()) == null)) ? A0I(iterable, C0943AIw.A03) : c0943AIwA5T;
    }

    public static AHH A0A(B6A b6a, long j) {
        return A0E(b6a, new B6A(j));
    }

    public static AHH A0B(B6A b6a, long j) {
        return A0E(b6a, new B6A(j << 32));
    }

    public static final <K, V> InterfaceC0962AJp<K, V> A0G(HxE<? extends K, ? extends V>... hxEArr) {
        C0954AJh c0954AJh = new C0954AJh(C0953AJg.A03);
        AGH.A0G(c0954AJh, hxEArr);
        return c0954AJh.A5S();
    }

    public static final <E> AHG<E> A0I(AHG<? extends E> ahg, Iterable<? extends E> iterable) {
        C0944AIx c0944AIx;
        if (ahg instanceof Collection) {
            AHG<? extends E> ahg2 = ahg;
            C7384Etj.A0Y(ahg2, 1);
            C0943AIw c0943AIw = (C0943AIw) iterable;
            if (ahg2.isEmpty()) {
                return c0943AIw;
            }
            c0944AIx = new C0944AIx(c0943AIw);
            c0944AIx.addAll(ahg2);
        } else {
            c0944AIx = new C0944AIx((C0943AIw) iterable);
            AbstractC0882AGj.A0r(ahg, c0944AIx);
        }
        return c0944AIx.A5T();
    }

    public static AuraBlock.BlockQuote A00(Iterable iterable) {
        AHD ahdA07 = A07(iterable);
        C7384Etj.A0Y(ahdA07, 0);
        return new AuraBlock.BlockQuote(ahdA07);
    }

    public static AuraBlock.OrderedList A01(AuraBlock.OrderedList orderedList, Iterable iterable) {
        return orderedList.copy(A07(iterable), orderedList.startNumber, orderedList.tight);
    }

    public static AuraBlock.UnorderedList A02(AuraBlock.UnorderedList unorderedList, Iterable iterable) {
        AHD ahdA07 = A07(iterable);
        boolean z = unorderedList.tight;
        C7384Etj.A0Y(ahdA07, 0);
        return new AuraBlock.UnorderedList(ahdA07, z);
    }

    public static ListItem A04(Iterable iterable) {
        return new ListItem(A07(iterable));
    }

    public static TableCell A05(Iterable iterable) {
        return new TableCell(A07(iterable));
    }

    public static AHD A06(Iterable iterable) {
        AHD ahdA07 = A07(iterable);
        C7384Etj.A0Y(ahdA07, 0);
        return ahdA07;
    }
}
