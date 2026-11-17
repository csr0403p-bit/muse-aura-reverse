package X;

import com.facebook.errorreporting.field.ReportFieldBase;
import java.util.List;
import java.util.Properties;

/* loaded from: classes5.dex */
public abstract class C4R implements C4S {
    public final C4S A00;

    @Override // X.C4S
    public final boolean AI6(C4Q c4q) {
        while (this.A00.AI6(c4q)) {
            String str = c4q.A00;
            if (str != null) {
                ReportFieldBase.sNoConsentNeeded.contains(str);
                String str2 = c4q.A00;
                C7384Etj.A0Y(str2, 0);
                c4q.A00 = str2;
                return true;
            }
        }
        return false;
    }

    @Override // X.C4S
    public final void A3a(Properties properties) {
        this.A00.A3a(properties);
    }

    @Override // X.C4S
    public final Properties ACk() {
        String str;
        C4Q c4q = new C4Q();
        Properties properties = new Properties();
        while (AI6(c4q)) {
            String str2 = c4q.A00;
            if (str2 != null && (str = c4q.A01) != null) {
                properties.put(str2, str);
            }
        }
        return properties;
    }

    @Override // X.C4S
    public final String[] AJD(List<String> list) {
        String[] strArrAJD = this.A00.AJD(list);
        for (int i = 0; i < strArrAJD.length; i++) {
            String str = list.get(i);
            String str2 = strArrAJD[i];
            if (str != null) {
                ReportFieldBase.sNoConsentNeeded.contains(str);
            } else {
                str2 = null;
            }
            strArrAJD[i] = str2;
        }
        reset();
        return strArrAJD;
    }

    @Override // X.C4S
    public final void reset() {
        this.A00.reset();
    }

    public C4R(C4S c4s) {
        this.A00 = c4s;
    }
}
