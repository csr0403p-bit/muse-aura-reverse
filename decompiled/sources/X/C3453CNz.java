package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.CNz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3453CNz extends COS {
    public final int A00;
    public final COO A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        COS cos = (COS) obj;
        int iA01 = cos.A01();
        int size = 4;
        if (4 == iA01) {
            COO coo = this.A01;
            int size2 = coo.size();
            COO coo2 = ((C3453CNz) cos).A01;
            if (size2 == coo2.size()) {
                for (int i = 0; i < coo.size(); i++) {
                    int iCompareTo = ((COS) coo.get(i)).compareTo(coo2.get(i));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return 0;
            }
            size = coo.size();
            iA01 = coo2.size();
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
        return this.A01.equals(((C3453CNz) obj).A01);
    }

    public final String toString() {
        COO coo = this.A01;
        if (coo.isEmpty()) {
            return "[]";
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int size = coo.size();
        for (int i = 0; i < size; i++) {
            arrayListA0h.add(coo.get(i).toString().replace(PairsDiscretionDocument.TERMINATOR, "\n  "));
        }
        StringBuilder sbA0x = C60O.A0x("[\n  ");
        Iterator it = arrayListA0h.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                sbA0x.append(BV8.A0k(next, next));
                while (it.hasNext()) {
                    sbA0x.append((CharSequence) ",\n  ");
                    Object next2 = it.next();
                    sbA0x.append(BV8.A0k(next2, next2));
                }
            }
            return AnonymousClass001.A0v("\n]", sbA0x);
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    public C3453CNz(COO coo) throws zzhf {
        this.A01 = coo;
        int i = 0;
        int i2 = 0;
        while (true) {
            COO coo2 = this.A01;
            if (i >= coo2.size()) {
                break;
            }
            int iA02 = ((COS) coo2.get(i)).A02();
            if (i2 < iA02) {
                i2 = iA02;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int hashCode() {
        return BV7.A0D(BV4.A0Z(), this.A01);
    }
}
