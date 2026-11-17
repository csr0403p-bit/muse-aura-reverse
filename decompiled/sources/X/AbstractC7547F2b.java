package X;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: X.F2b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7547F2b {
    public static C7528Ezc A00(Configuration configuration) {
        LocaleList locales = configuration.getLocales();
        C7528Ezc c7528Ezc = C7528Ezc.A01;
        return new C7528Ezc(new F2l(locales));
    }
}
