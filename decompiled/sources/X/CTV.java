package X;

import android.util.Log;
import com.google.firebase.iid.zzm;

/* loaded from: classes5.dex */
public final class CTV extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        if (!BV4.A1U("FirebaseInstanceId")) {
            return zzm.class;
        }
        Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
        return zzm.class;
    }
}
