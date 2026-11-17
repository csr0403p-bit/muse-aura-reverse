package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Brl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3003Brl {
    public final List<C3004Brm> A00;

    public static final C3003Brl A00(String str) {
        ArrayList arrayList;
        Iterator it;
        String str2;
        try {
            List listA0g = C7BY.A0g(str, new char[]{';'});
            arrayList = new ArrayList(Hr7.A1D(listA0g, 10));
            it = listA0g.iterator();
        } catch (Throwable unused) {
        }
        while (it.hasNext()) {
            List listA0g2 = C7BY.A0g((String) it.next(), new char[]{','});
            int size = listA0g2.size();
            if (2 > size || size >= 5) {
                return new C3003Brl(Collections.singletonList(new C3004Brm(0.0d, 1.0d, 1.0d, true)));
            }
            arrayList.add(new C3004Brm(Double.parseDouble((String) listA0g2.get(0)), Double.parseDouble((String) listA0g2.get(1)), listA0g2.size() > 2 ? Double.parseDouble((String) listA0g2.get(2)) : 1.0d, (listA0g2.size() <= 3 || (str2 = (String) listA0g2.get(3)) == null) ? false : str2.equalsIgnoreCase("d")));
        }
        return new C3003Brl(arrayList);
    }

    public final double A01() {
        Iterator<C3004Brm> it = this.A00.iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        double dMax = it.next().A02;
        while (it.hasNext()) {
            dMax = Math.max(dMax, it.next().A02);
        }
        return dMax;
    }

    public final double A02(double d) {
        int i;
        C3004Brm c3004Brm;
        List<C3004Brm> list = this.A00;
        C7384Etj.A0Y(list, 0);
        int iA00 = C60O.A00(list);
        int i2 = 0;
        while (true) {
            if (i2 > iA00) {
                i = -(i2 + 1);
                break;
            }
            i = (i2 + iA00) >>> 1;
            int iCompare = Double.compare(list.get(i).A01, d);
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                iA00 = i - 1;
            } else {
                i2 = i + 1;
            }
        }
        if (i >= 0) {
            c3004Brm = list.get(i);
        } else {
            int i3 = -i;
            int iA002 = i3 - 1;
            if (iA002 != 0) {
                if (iA002 != list.size()) {
                    C3004Brm c3004Brm2 = list.get(i3 - 2);
                    C3004Brm c3004Brm3 = list.get(iA002);
                    double d2 = c3004Brm2.A01;
                    double d3 = (d - d2) / (c3004Brm3.A01 - d2);
                    if (c3004Brm2.A03) {
                        double d4 = c3004Brm2.A02;
                        return d4 + ((c3004Brm3.A02 - d4) * StrictMath.pow(d3, c3004Brm2.A00));
                    }
                    double d5 = c3004Brm3.A02;
                    return d5 - ((d5 - c3004Brm2.A02) * StrictMath.pow(1.0d - d3, c3004Brm2.A00));
                }
                iA002 = C60O.A00(list);
            }
            c3004Brm = list.get(iA002);
        }
        return c3004Brm.A02;
    }

    public C3003Brl(List<C3004Brm> list) {
        this.A00 = AbstractC0878AGe.A0c(list, new C7572F4l(23));
    }
}
