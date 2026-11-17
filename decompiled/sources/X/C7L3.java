package X;

import android.provider.MediaStore;

/* renamed from: X.7L3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7L3 extends Hx6 {
    public static final int A00() {
        if (AbstractC8147FWl.A00()) {
            return MediaStore.getPickImagesMaxLimit();
        }
        return Integer.MAX_VALUE;
    }
}
