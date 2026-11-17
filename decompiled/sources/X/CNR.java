package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public abstract class CNR {
    public static final Uri A00;
    public static final Uri A01;
    public static final Uri A02;

    static {
        String strA0M = FGI.A0M("com.facebook.appmanager", ".attribution");
        A02 = Uri.parse(FGI.A0M("content://", strA0M));
        A01 = new Uri.Builder().scheme("content").authority(strA0M).appendPath("device_id").build();
        A00 = new Uri.Builder().scheme("content").authority(strA0M).appendPath("attribution_info").build();
    }
}
