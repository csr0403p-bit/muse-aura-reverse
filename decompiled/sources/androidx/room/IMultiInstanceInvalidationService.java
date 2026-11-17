package androidx.room;

import android.os.IInterface;

/* loaded from: classes5.dex */
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String A00 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    void A5M(int i, String[] strArr);

    int AZz(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);

    void Ahj(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i);
}
