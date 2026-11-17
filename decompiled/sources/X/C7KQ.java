package X;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* renamed from: X.7KQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7KQ {
    public static Object A00(Intent intent) {
        return intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
    }

    public static ArrayList A01(Intent intent) {
        return intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
    }
}
