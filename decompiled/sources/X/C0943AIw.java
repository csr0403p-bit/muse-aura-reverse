package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.AIw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0943AIw<E> extends AbstractC0891AGs<E> implements AHG<E> {
    public static final C0943AIw A03;
    public final Object A00;
    public final Object A01;
    public final C0952AJf<E, C0945AIy> A02;

    static {
        C0946AIz c0946AIz = C0946AIz.A00;
        A03 = new C0943AIw(c0946AIz, c0946AIz, C0952AJf.A02);
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A02.size();
    }

    @Override // X.AHG
    @Deprecated(message = "Use adding() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "adding(element)", imports = {}))
    public final AHG<E> A35(E e) {
        C0952AJf<E, C0945AIy> c0952AJf = this.A02;
        if (c0952AJf.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new C0943AIw(e, e, C0952AJf.A00(e, new C0945AIy(), c0952AJf));
        }
        Object obj = this.A01;
        C0945AIy c0945AIy = c0952AJf.get(obj);
        C7384Etj.A0X(c0945AIy);
        return new C0943AIw(this.A00, e, C0952AJf.A00(e, new C0945AIy(obj, C0946AIz.A00), C0952AJf.A00(obj, new C0945AIy(c0945AIy.A01, e), c0952AJf)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AHG
    @Deprecated(message = "Use removing() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removing(element)", imports = {}))
    public final AHG<E> Aaa(E e) {
        C0952AJf<E, C0945AIy> c0952AJf = this.A02;
        C0945AIy c0945AIy = c0952AJf.get(e);
        if (c0945AIy == null) {
            return this;
        }
        C0952AJf c0952AJfA01 = C0952AJf.A01(e, c0952AJf);
        Object obj = c0945AIy.A01;
        C0946AIz c0946AIz = C0946AIz.A00;
        boolean zA1Z = AnonymousClass006.A1Z(obj, c0946AIz);
        if (zA1Z) {
            V v = c0952AJfA01.get(obj);
            C7384Etj.A0X(v);
            c0952AJfA01 = C0952AJf.A00(obj, new C0945AIy(((C0945AIy) v).A01, c0945AIy.A00), c0952AJfA01);
        }
        Object obj2 = c0945AIy.A00;
        boolean zA1Z2 = AnonymousClass006.A1Z(obj2, c0946AIz);
        if (zA1Z2) {
            V v2 = c0952AJfA01.get(obj2);
            C7384Etj.A0X(v2);
            c0952AJfA01 = C0952AJf.A00(obj2, new C0945AIy(obj, ((C0945AIy) v2).A00), c0952AJfA01);
        }
        if (zA1Z) {
            obj2 = this.A00;
        }
        if (zA1Z2) {
            obj = this.A01;
        }
        return new C0943AIw(obj2, obj, c0952AJfA01);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A02.containsKey(obj);
    }

    @Override // X.AbstractC0891AGs, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        C0956AJj<E, C0945AIy> c0956AJj;
        C0956AJj<E, C0945AIy> c0956AJj2;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                if (set instanceof C0943AIw) {
                    c0956AJj = this.A02.A00;
                    c0956AJj2 = ((C0943AIw) obj).A02.A00;
                    i = 17;
                } else {
                    if (!(set instanceof C0944AIx)) {
                        return super.equals(obj);
                    }
                    c0956AJj = this.A02.A00;
                    c0956AJj2 = ((C0944AIx) obj).A03.A04;
                    i = 18;
                }
                return c0956AJj.A0N(new C2280BSg(i), c0956AJj2);
            }
        }
        return false;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C0941AIu(this.A00, this.A02);
    }

    public C0943AIw(Object obj, Object obj2, C0952AJf<E, C0945AIy> c0952AJf) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = c0952AJf;
    }

    @Override // X.AHG
    @Deprecated(message = "Use removingAll() instead. For more details, read the documentation for this function.", replaceWith = @ReplaceWith(expression = "removingAll(elements)", imports = {}))
    public final AHG<E> Aak(Collection<? extends E> collection) {
        if (C8j4.A1Z(collection)) {
            return this;
        }
        C0944AIx c0944AIx = new C0944AIx(this);
        c0944AIx.removeAll(collection);
        return c0944AIx.A5T();
    }
}
