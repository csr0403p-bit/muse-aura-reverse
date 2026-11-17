package X;

import android.net.Uri;

/* renamed from: X.7ob, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7ob {
    public static final Uri A00;

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").authority(FGI.A0M("com.facebook.appmanager", ".dynamicappsupport")).build();
        C7384Etj.A0U(uriBuild);
        A00 = uriBuild;
    }
}
