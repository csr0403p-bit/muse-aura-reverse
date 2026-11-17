package X;

import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;

/* loaded from: classes6.dex */
public final class FCS extends LruCache<String, BitmapDrawable> {
    public FCS() {
        super(4194304);
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ int sizeOf(String str, BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        C7384Etj.A0Y(bitmapDrawable2, 1);
        return bitmapDrawable2.getBitmap().getAllocationByteCount();
    }
}
