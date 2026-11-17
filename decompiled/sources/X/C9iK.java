package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9iK, reason: invalid class name */
/* loaded from: classes4.dex */
public class C9iK implements C9iZ, C9iH {
    public int A00 = -1;
    public Map<String, Integer> A01;
    public final int A02;
    public final String A03;
    public final F0C A04;
    public final F0C A05;
    public final F0C A06;
    public final C9cd<?> A07;
    public final String[] A08;
    public final List<Annotation>[] A09;
    public final boolean[] A0A;

    public static C9iK A00(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 1);
        c9iK.A08("environmentId", false);
        return c9iK;
    }

    public static C9iK A01(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 1);
        c9iK.A08("response_code", false);
        return c9iK;
    }

    public static C9iK A02(String str, C9cd c9cd) {
        C9iK c9iK = new C9iK(str, c9cd, 3);
        c9iK.A08("submissionId", false);
        c9iK.A08("screenshotUri", true);
        c9iK.A08(ErrorReportingConstants.ENDPOINT, true);
        return c9iK;
    }

    @Override // X.C9iZ
    public final int AF4(String str) {
        C7384Etj.A0Y(str, 0);
        Integer num = this.A01.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj instanceof C9iK) {
                C9iZ c9iZ = (C9iZ) obj;
                if (this.A03.equals(c9iZ.AKP()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((C9iK) obj).A06.getValue()) && (i = this.A02) == c9iZ.AF6()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (C7384Etj.areEqual(AF3(i2).AKP(), c9iZ.AF3(i2).AKP()) && C7384Etj.areEqual(AF3(i2).AGs(), c9iZ.AF3(i2).AGs())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A05(C9iK c9iK) {
        c9iK.A08("amount", true);
        c9iK.A08("currency", true);
    }

    public static void A06(C9iK c9iK, boolean z) {
        c9iK.A08(GeofenceEventWorker.KEY_LATITUDE, z);
        c9iK.A08(GeofenceEventWorker.KEY_LONGITUDE, z);
    }

    public static boolean A07(C9iK c9iK) {
        c9iK.A08("response_code", false);
        return false;
    }

    public final void A08(String str, boolean z) {
        String[] strArr = this.A08;
        int i = this.A00 + 1;
        this.A00 = i;
        strArr[i] = str;
        this.A0A[i] = z;
        this.A09[i] = null;
        if (i == this.A02 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.A01 = map;
        }
    }

    @Override // X.C9iZ
    public final List<Annotation> AF2(int i) {
        List<Annotation> list = this.A09[i];
        return list == null ? C0881AGi.A00 : list;
    }

    @Override // X.C9iZ
    public C9iZ AF3(int i) {
        return ((C9hr[]) this.A05.getValue())[i].getDescriptor();
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        return this.A08[i];
    }

    @Override // X.C9iZ
    public final int AF6() {
        return this.A02;
    }

    @Override // X.C9iZ
    public BL8 AGs() {
        return C9iN.A00;
    }

    @Override // X.C9iZ
    public final String AKP() {
        return this.A03;
    }

    @Override // X.C9iH
    public final Set<String> AKQ() {
        return this.A01.keySet();
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        return this.A0A[i];
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean AOo() {
        return false;
    }

    @Override // X.C9iZ
    public final List<Annotation> getAnnotations() {
        return C0881AGi.A00;
    }

    public int hashCode() {
        return ((Number) this.A04.getValue()).intValue();
    }

    @Override // X.C9iZ
    public /* synthetic */ boolean isInline() {
        return false;
    }

    public C9iK(String str, C9cd<?> c9cd, int i) {
        this.A03 = str;
        this.A07 = c9cd;
        this.A02 = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.A08 = strArr;
        this.A09 = new List[i];
        this.A0A = new boolean[i];
        this.A01 = C9jH.A00;
        Integer num = C79.A01;
        this.A05 = AbstractC5321DgF.A02(num, new C2293BSt(this, 47));
        this.A06 = AbstractC5321DgF.A02(num, new C2293BSt(this, 48));
        this.A04 = AbstractC5321DgF.A02(num, new C2293BSt(this, 49));
    }

    public static void A03(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("price", z);
    }

    public static void A04(String str, C9iK c9iK, boolean z) {
        c9iK.A08(str, z);
        c9iK.A08("version", z);
    }

    public String toString() {
        return C9iP.A01(this);
    }
}
