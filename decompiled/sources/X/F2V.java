package X;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class F2V {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                F2V f2v = (F2V) obj;
                if (!C6xC.A00(this.A04, f2v.A04) || !C6xC.A00(this.A03, f2v.A03) || !C6xC.A00(this.A00, f2v.A00) || !C6xC.A00(this.A01, f2v.A01) || !C6xC.A00(this.A06, f2v.A06) || !C6xC.A00(this.A07, f2v.A07) || !C6xC.A00(this.A05, f2v.A05) || !C6xC.A00(this.A02, f2v.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public static F2V A00(Bundle bundle) {
        return bundle == null ? new F2V("appmanager_unknown", "appmanager_unknown", "appmanager_missing_utm_bundle", "appmanager_unknown", "appmanager_unknown", "appmanager_unknown", "", "") : new F2V(bundle.getString("utm_source", "appmanager_unknown"), bundle.getString("utm_medium", "appmanager_unknown"), bundle.getString("utm_campaign", "appmanager_unknown"), bundle.getString("utm_content", "appmanager_unknown"), bundle.getString("utm_term", "appmanager_unknown"), bundle.getString("utm_id", "appmanager_unknown"), bundle.getString(C3cF.A00(42), ""), bundle.getString("custom_data", ""));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, this.A00, this.A01, this.A06, this.A07, this.A05, this.A02});
    }

    public final String toString() {
        return FGI.A0k("Utm{source='", this.A04, "', medium='", this.A03, "', campaign='", this.A00, "'}");
    }

    public F2V(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A01 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A05 = str7;
        this.A02 = str8;
    }
}
