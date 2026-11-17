package X;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gkv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9912Gkv {
    public C8888Ft1 A00;
    public AbstractC9930GlR A01;
    public AbstractC9944Glx A02;
    public C10035GoB A03;
    public C9934Glc A04;
    public HashMap<String, AbstractC9915Gl5> A05;
    public HashSet<String> A06;
    public HashSet<String> A07;
    public List<C10115Gpg> A08;
    public boolean A09;
    public AbstractC9915Gl5[] A0A;
    public final C9898Gke A0B;
    public final AbstractC9904Gkk A0C;
    public final C9914Gl4 A0D;
    public final Map<String, AbstractC9915Gl5> A0E = C3cG.A0j();

    public final JsonDeserializer<?> A03() throws DatabindException {
        Collection<AbstractC9915Gl5> collectionValues = this.A0E.values();
        A02(this, collectionValues);
        C9898Gke c9898Gke = this.A0B;
        Map mapA00 = A00(this, collectionValues);
        C9914Gl4 c9914Gl4 = this.A0D;
        Boolean boolA01 = c9914Gl4.A02().A01(EnumC10062Goj.A00);
        C9668GdQ c9668GdQ = new C9668GdQ(collectionValues, c9898Gke._base._locale, mapA00, boolA01 == null ? c9898Gke.A09(EnumC9951GmA.A02) : boolA01.booleanValue());
        Object[] objArr = c9668GdQ._hashArea;
        int length = objArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            AbstractC9915Gl5 abstractC9915Gl5 = (AbstractC9915Gl5) objArr[i2];
            if (abstractC9915Gl5 != null) {
                abstractC9915Gl5.A0H(i);
                i++;
            }
        }
        boolean zA09 = c9898Gke.A09(EnumC9951GmA.A0G);
        boolean z = !zA09;
        if (zA09) {
            Iterator<AbstractC9915Gl5> it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().A0P()) {
                    z = true;
                    break;
                }
            }
        }
        C10035GoB c10035GoB = this.A03;
        if (c10035GoB != null) {
            c9668GdQ = c9668GdQ.A03(new C9961GmY(C10034GoA.A02, c10035GoB));
        }
        return new BeanDeserializer(this, c9668GdQ, c9914Gl4, this.A05, this.A06, this.A07, this.A09, z);
    }

    public static final void A01(C9912Gkv c9912Gkv, IllegalArgumentException illegalArgumentException) throws DatabindException {
        try {
            c9912Gkv.A0C.A0g(c9912Gkv.A0D, illegalArgumentException.getMessage(), BV4.A1W());
            throw F60.createAndThrow();
        } catch (DatabindException e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }

    public static final void A02(C9912Gkv c9912Gkv, Collection collection) throws DatabindException {
        C9898Gke c9898Gke = c9912Gkv.A0B;
        if (c9898Gke.A07()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((AbstractC9915Gl5) it.next()).A0J(c9898Gke);
                } catch (IllegalArgumentException e) {
                    A01(c9912Gkv, e);
                    throw F60.createAndThrow();
                }
            }
        }
        AbstractC9930GlR abstractC9930GlR = c9912Gkv.A01;
        if (abstractC9930GlR != null) {
            AbstractC9970Gmj.A00(c9898Gke, abstractC9930GlR._setter);
        }
        C9934Glc c9934Glc = c9912Gkv.A04;
        if (c9934Glc != null) {
            AbstractC9970Gmj.A00(c9898Gke, c9934Glc);
        }
    }

    public final void A04(AbstractC9915Gl5 abstractC9915Gl5) {
        AbstractC9915Gl5 abstractC9915Gl5Put = this.A0E.put(abstractC9915Gl5._propName._simpleName, abstractC9915Gl5);
        if (abstractC9915Gl5Put == null || abstractC9915Gl5Put == abstractC9915Gl5) {
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Duplicate property '");
        sbA0x.append(abstractC9915Gl5._propName._simpleName);
        sbA0x.append("' for ");
        throw C60O.A0i(C8j3.A14(this.A0D.A05, sbA0x));
    }

    public C9912Gkv(AbstractC9904Gkk abstractC9904Gkk, C9914Gl4 c9914Gl4) {
        this.A0D = c9914Gl4;
        this.A0C = abstractC9904Gkk;
        this.A0B = abstractC9904Gkk._config;
    }

    public static final Map A00(C9912Gkv c9912Gkv, Collection collection) {
        AbstractC9970Gmj abstractC9970GmjAHe;
        Iterator it = collection.iterator();
        HashMap mapA0u = null;
        while (it.hasNext()) {
            AbstractC9915Gl5 abstractC9915Gl5 = (AbstractC9915Gl5) it.next();
            C9898Gke c9898Gke = c9912Gkv.A0B;
            List<C10009Gnh> listA0b = ((GmW) abstractC9915Gl5).A00;
            if (listA0b == null) {
                AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
                if (abstractC9910GksA02 == null || (abstractC9970GmjAHe = abstractC9915Gl5.AHe()) == null || (listA0b = abstractC9910GksA02.A0b(abstractC9970GmjAHe)) == null) {
                    listA0b = Collections.EMPTY_LIST;
                }
                ((GmW) abstractC9915Gl5).A00 = listA0b;
                if (listA0b != null) {
                }
            }
            if (!listA0b.isEmpty()) {
                if (mapA0u == null) {
                    mapA0u = BV4.A0u();
                }
                mapA0u.put(abstractC9915Gl5._propName._simpleName, listA0b);
            }
        }
        return mapA0u == null ? Collections.EMPTY_MAP : mapA0u;
    }
}
