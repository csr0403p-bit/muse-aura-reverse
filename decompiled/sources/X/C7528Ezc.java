package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.Ezc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7528Ezc {
    public static final C7528Ezc A01 = new C7528Ezc(new F2l(new LocaleList(new Locale[0])));
    public final F3O A00;

    public static C7528Ezc A00(String str) {
        if (str == null || str.isEmpty()) {
            return A01;
        }
        String[] strArrA1a = BV4.A1a(str, ",");
        int length = strArrA1a.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrA1a[i]);
        }
        return new C7528Ezc(new F2l(new LocaleList(localeArr)));
    }

    public final int A01() {
        return ((F2l) this.A00).A00.size();
    }

    public final Locale A02(int i) {
        return ((F2l) this.A00).A00.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7528Ezc) && this.A00.equals(((C7528Ezc) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C7528Ezc(F3O f3o) {
        this.A00 = f3o;
    }
}
