package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class DIS implements Comparable<DIS> {
    public List<String> A00;
    public List<Integer> A01;
    public List<Long> A02;
    public List<String> A03;
    public List<String> A04;
    public List<String> A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static boolean A00(List<?> list, List<?> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        return list != null && list2 != null && list.size() == list2.size() && list.containsAll(list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DIS dis = (DIS) obj;
                if (this.A07 != dis.A07 || this.A06 != dis.A06 || !A00(this.A04, dis.A04) || !A00(this.A05, dis.A05) || !A00(this.A00, dis.A00) || !A00(this.A01, dis.A01) || !A00(this.A03, dis.A03) || !A00(this.A02, dis.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A01() {
        int i = this.A08;
        if (i != -1) {
            List<String> list = this.A04;
            int size = i - (list == null ? 0 : list.size());
            List<String> list2 = this.A00;
            int size2 = size - (list2 == null ? 0 : list2.size());
            List<String> list3 = this.A03;
            A02("qpl_internal__lost_annotation_count", size2 - (list3 != null ? list3.size() : 0));
        }
    }

    public final void A02(String str, int i) {
        List listA0h = this.A00;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            this.A00 = listA0h;
        }
        if (this.A01 == null) {
            this.A01 = C3cG.A0h();
        }
        listA0h.add(str);
        this.A01.add(Integer.valueOf(i));
    }

    public final void A03(String str, long j) {
        List listA0h = this.A03;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            this.A03 = listA0h;
        }
        if (this.A02 == null) {
            this.A02 = C3cG.A0h();
        }
        listA0h.add(str);
        this.A02.add(Long.valueOf(j));
    }

    public final void A04(String str, String str2) {
        List listA0h = this.A04;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
            this.A04 = listA0h;
        }
        if (this.A05 == null) {
            this.A05 = C3cG.A0h();
        }
        listA0h.add(str);
        this.A05.add(str2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(DIS dis) {
        DIS dis2 = dis;
        int i = this.A07;
        int i2 = dis2.A07;
        if (i == i2 && (i = this.A06) == (i2 = dis2.A06)) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public final int hashCode() {
        int iHashCode = ((217 + this.A07) * 31) + this.A06;
        List<String> list = this.A04;
        if (list != null) {
            iHashCode = (iHashCode * 31) + list.hashCode();
        }
        List<String> list2 = this.A05;
        if (list2 != null) {
            iHashCode = (iHashCode * 31) + list2.hashCode();
        }
        List<String> list3 = this.A00;
        if (list3 != null) {
            iHashCode = (iHashCode * 31) + list3.hashCode();
        }
        List<Integer> list4 = this.A01;
        if (list4 != null) {
            iHashCode = (iHashCode * 31) + list4.hashCode();
        }
        List<String> list5 = this.A03;
        if (list5 != null) {
            iHashCode = (iHashCode * 31) + list5.hashCode();
        }
        List<Long> list6 = this.A02;
        return list6 != null ? (iHashCode * 31) + list6.hashCode() : iHashCode;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MarkerRecord{markerId=");
        sbA0x.append(this.A07);
        sbA0x.append(", instanceKey=");
        sbA0x.append(this.A06);
        sbA0x.append(", strAnnotationKeys=");
        sbA0x.append(this.A04);
        sbA0x.append(", strAnnotationValues=");
        sbA0x.append(this.A05);
        sbA0x.append(", intAnnotationKeys=");
        sbA0x.append(this.A00);
        sbA0x.append(", intAnnotationValues=");
        sbA0x.append(this.A01);
        sbA0x.append(", pointNames=");
        sbA0x.append(this.A03);
        sbA0x.append(", pointDurations=");
        sbA0x.append(this.A02);
        return C8j3.A15(sbA0x);
    }

    public DIS(int i, int i2, int i3) {
        this.A07 = i;
        this.A06 = i2;
        this.A08 = i3;
    }
}
