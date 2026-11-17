package X;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: X.FRr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8063FRr {
    public static void A01(View view, FS1 fs1, String[] strArr) {
        view.setOnReceiveContentListener(strArr, fs1 == null ? null : new OnReceiveContentListenerC8064FRs(fs1));
    }

    public static C8071FRz A00(View view, C8071FRz c8071FRz) {
        ContentInfo contentInfoA01 = c8071FRz.A01();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA01);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent != contentInfoA01 ? C8071FRz.A00(contentInfoPerformReceiveContent) : c8071FRz;
    }

    public static String[] A02(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
