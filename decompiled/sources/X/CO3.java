package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CO3 extends COS {
    public final int A00;
    public final COB A01;

    public final int hashCode() {
        return BV7.A0D(5, this.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        COS cos = (COS) obj;
        int iA01 = cos.A01();
        int size = 5;
        if (5 == iA01) {
            COB cob = this.A01;
            int size2 = cob.size();
            COB cob2 = ((CO3) cos).A01;
            if (size2 == cob2.size()) {
                CO4 co4A05 = cob.entrySet().A05();
                CO4 co4A052 = cob2.entrySet().A05();
                do {
                    if (!co4A05.hasNext() && !co4A052.hasNext()) {
                        return 0;
                    }
                    Map.Entry entryA0l = C3cH.A0l(co4A05);
                    Map.Entry entryA0l2 = C3cH.A0l(co4A052);
                    int iCompareTo2 = ((COS) entryA0l.getKey()).compareTo(entryA0l2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((COS) entryA0l.getValue()).compareTo(entryA0l2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = cob.size();
            iA01 = cob2.size();
        }
        return size - iA01;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((CO3) obj).A01);
    }

    public final String toString() {
        COB cob = this.A01;
        if (cob.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        CO4 co4A05 = cob.entrySet().A05();
        while (co4A05.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(co4A05);
            linkedHashMapA0j.put(entryA0l.getKey().toString().replace(PairsDiscretionDocument.TERMINATOR, "\n  "), entryA0l.getValue().toString().replace(PairsDiscretionDocument.TERMINATOR, "\n  "));
        }
        StringBuilder sbA0x = C60O.A0x("{\n  ");
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        try {
            if (itA0i.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i);
                Object key = entryA0l2.getKey();
                sbA0x.append(BV8.A0k(key, key));
                while (true) {
                    sbA0x.append((CharSequence) " : ");
                    Object value = entryA0l2.getValue();
                    sbA0x.append(BV8.A0k(value, value));
                    if (!itA0i.hasNext()) {
                        break;
                    }
                    sbA0x.append((CharSequence) ",\n  ");
                    entryA0l2 = C3cH.A0l(itA0i);
                    Object key2 = entryA0l2.getKey();
                    sbA0x.append(BV8.A0k(key2, key2));
                }
            }
            return AnonymousClass001.A0v("\n}", sbA0x);
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    public CO3(COB cob) throws zzhf {
        this.A01 = cob;
        CO4 co4A05 = cob.entrySet().A05();
        int i = 0;
        while (co4A05.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(co4A05);
            int iA02 = ((COS) entryA0l.getKey()).A02();
            i = i < iA02 ? iA02 : i;
            int iA022 = ((COS) entryA0l.getValue()).A02();
            if (i < iA022) {
                i = iA022;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }
}
