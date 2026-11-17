package X;

import android.net.Uri;

/* renamed from: X.C9b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3285C9b {
    public static Uri A00(String... strArr) {
        Uri.Builder builderAuthority;
        Uri.Builder builderScheme = new Uri.Builder().scheme("https");
        if (builderScheme == null || (builderAuthority = builderScheme.authority("b-www.facebook.com")) == null) {
            return Uri.EMPTY;
        }
        int i = 0;
        do {
            builderAuthority.appendPath(strArr[i]);
            i++;
        } while (i < 2);
        builderAuthority.appendPath("");
        return builderAuthority.build();
    }
}
