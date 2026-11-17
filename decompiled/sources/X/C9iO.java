package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9iO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9iO implements C9iZ, C9iH {
    public final int A00;
    public final String A01;
    public final F0C A02;
    public final C9iZ[] A03;
    public final C9iZ[] A04;
    public final List<Annotation> A05;
    public final Map<String, Integer> A06;
    public final Set<String> A07;
    public final BL8 A08;
    public final String[] A09;
    public final List<Annotation>[] A0A;
    public final boolean[] A0B;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/BL8;ILjava/util/List<+LX/9iZ;>;LX/9e5;)V */
    public C9iO(String str, List list, C9e5 c9e5, BL8 bl8, int i) {
        this.A01 = str;
        this.A08 = bl8;
        this.A00 = i;
        this.A05 = c9e5.A00;
        List<String> list2 = c9e5.A03;
        int i2 = 0;
        HashSet hashSet = new HashSet(AIW.A0H(Hr7.A1D(list2, 12)));
        AbstractC0878AGe.A0j(list2, hashSet);
        this.A07 = hashSet;
        String[] strArr = (String[]) list2.toArray(new String[0]);
        this.A09 = strArr;
        this.A03 = C9iG.A02(c9e5.A02);
        this.A0A = (List[]) c9e5.A01.toArray(new List[0]);
        List<Boolean> list3 = c9e5.A04;
        boolean[] zArr = new boolean[list3.size()];
        Iterator<Boolean> it = list3.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i2++;
            zArr[i3] = it.next().booleanValue();
            i3 = i2;
        }
        this.A0B = zArr;
        C7384Etj.A0Y(strArr, 0);
        AbK abK = new AbK(new C2293BSt(strArr, 39));
        ArrayList arrayList = new ArrayList(10);
        Iterator it2 = abK.iterator();
        while (it2.hasNext()) {
            C2273BRq c2273BRq = (C2273BRq) it2.next();
            arrayList.add(new HxE(c2273BRq.A01, Integer.valueOf(c2273BRq.A00)));
        }
        this.A06 = AGH.A06(arrayList);
        this.A04 = C9iG.A02(list);
        this.A02 = AbstractC5321DgF.A03(new C2293BSt(this, 46));
    }

    @Override // X.C9iZ
    public final int AF4(String str) {
        C7384Etj.A0Y(str, 0);
        Integer num = this.A06.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj instanceof C9iO) {
                C9iZ c9iZ = (C9iZ) obj;
                if (this.A01.equals(c9iZ.AKP()) && Arrays.equals(this.A04, ((C9iO) obj).A04) && (i = this.A00) == c9iZ.AF6()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        C9iZ[] c9iZArr = this.A03;
                        if (C7384Etj.areEqual(c9iZArr[i2].AKP(), c9iZ.AF3(i2).AKP()) && C7384Etj.areEqual(c9iZArr[i2].AGs(), c9iZ.AF3(i2).AGs())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C9iZ
    public final List<Annotation> AF2(int i) {
        return this.A0A[i];
    }

    @Override // X.C9iZ
    public final C9iZ AF3(int i) {
        return this.A03[i];
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        return this.A09[i];
    }

    @Override // X.C9iZ
    public final int AF6() {
        return this.A00;
    }

    @Override // X.C9iZ
    public final BL8 AGs() {
        return this.A08;
    }

    @Override // X.C9iZ
    public final String AKP() {
        return this.A01;
    }

    @Override // X.C9iH
    public final Set<String> AKQ() {
        return this.A07;
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        return this.A0B[i];
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean AOo() {
        return false;
    }

    @Override // X.C9iZ
    public final List<Annotation> getAnnotations() {
        return this.A05;
    }

    public final int hashCode() {
        return AnonymousClass001.A0F(this.A02.getValue());
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return C9iP.A01(this);
    }
}
