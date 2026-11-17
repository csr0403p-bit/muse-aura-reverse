package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.Hqu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10542Hqu {
    public static C8328Fbu A00(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, int i, boolean z) {
        if (TextUtils.isEmpty(charSequence4)) {
            throw C60O.A0i("Title must be set and non-empty.");
        }
        if (!AbstractC10508Hnv.A00(i)) {
            throw C60O.A0i(FGI.A0W("Authenticator combination is unsupported on API ", ": ", i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG", Build.VERSION.SDK_INT));
        }
        boolean zA1U = i != 0 ? AbstractC7609F5w.A1U(i, 32768) : false;
        if (TextUtils.isEmpty(charSequence2) && !zA1U) {
            throw C60O.A0i("Negative text must be set and non-empty.");
        }
        if (TextUtils.isEmpty(charSequence2) || !zA1U) {
            return new C8328Fbu(charSequence4, charSequence3, charSequence, charSequence2, i, z);
        }
        throw C60O.A0i("Negative text must not be set if device credential authentication is allowed.");
    }
}
