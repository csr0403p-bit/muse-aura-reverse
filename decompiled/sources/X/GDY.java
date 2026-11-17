package X;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class GDY extends GDD<String> implements Hl2, RandomAccess {
    public static final Hl2 A01;
    public static final GDY A02;
    public final List<Object> A00;

    static {
        GDY gdy = new GDY();
        A02 = gdy;
        ((GDD) gdy).A00 = false;
        A01 = gdy;
    }

    public GDY() {
        this(C60O.A11(10));
    }

    public static String A00(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC9309GDl)) {
            return new String((byte[]) obj, GGV.A03);
        }
        AbstractC9309GDl abstractC9309GDl = (AbstractC9309GDl) obj;
        Charset charset = GGV.A03;
        if (abstractC9309GDl.A01() == 0) {
            return "";
        }
        C9306GDi c9306GDi = (C9306GDi) abstractC9309GDl;
        return BV4.A0n(charset, c9306GDi.bytes, c9306GDi.A02(), c9306GDi.A01());
    }

    @Override // X.Hl2
    public final Object AJO(int i) {
        return this.A00.get(i);
    }

    @Override // X.Hl2
    public final List<?> AME() {
        return Collections.unmodifiableList(this.A00);
    }

    @Override // X.Hl2
    public final Hl2 AMH() {
        return super.A00 ? new HwJ(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int iA01;
        List<Object> list = this.A00;
        Object str = list.get(i);
        if (!(str instanceof String)) {
            if (str instanceof AbstractC9309GDl) {
                AbstractC9309GDl abstractC9309GDl = (AbstractC9309GDl) str;
                Charset charset = GGV.A03;
                if (abstractC9309GDl.A01() == 0) {
                    str = "";
                } else {
                    C9306GDi c9306GDi = (C9306GDi) abstractC9309GDl;
                    str = BV4.A0n(charset, c9306GDi.bytes, c9306GDi.A02(), c9306GDi.A01());
                }
                C9306GDi c9306GDi2 = (C9306GDi) abstractC9309GDl;
                int iA02 = c9306GDi2.A02();
                iA01 = AbstractC9318GDv.A00.A01(c9306GDi2.bytes, iA02, c9306GDi2.A01() + iA02);
            } else {
                byte[] bArr = (byte[]) str;
                str = new String(bArr, GGV.A03);
                iA01 = AbstractC9318GDv.A00.A01(bArr, 0, bArr.length);
            }
            if (iA01 == 0) {
                list.set(i, str);
            }
        }
        return str;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    @Override // X.Hl2
    public final void A36(AbstractC9309GDl abstractC9309GDl) {
        A01();
        this.A00.add(abstractC9309GDl);
        ((AbstractList) this).modCount++;
    }

    @Override // X.GDO
    public final /* bridge */ /* synthetic */ GDO AQy(int i) {
        if (i < size()) {
            throw BV4.A0P();
        }
        ArrayList arrayListA11 = C60O.A11(i);
        arrayListA11.addAll(this.A00);
        return new GDY(arrayListA11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        A01();
        this.A00.add(i, obj);
        ((AbstractList) this).modCount++;
    }

    @Override // X.GDD, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // X.GDD, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A01();
        this.A00.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        A01();
        Object objRemove = this.A00.remove(i);
        ((AbstractList) this).modCount++;
        return A00(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        A01();
        return A00(this.A00.set(i, obj));
    }

    public GDY(ArrayList<Object> arrayList) {
        this.A00 = arrayList;
    }

    @Override // X.GDD, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        A01();
        if (collection instanceof Hl2) {
            collection = ((Hl2) collection).AME();
        }
        boolean zAddAll = this.A00.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
