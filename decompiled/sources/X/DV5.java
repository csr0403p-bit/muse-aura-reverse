package X;

import android.net.Uri;

/* loaded from: classes5.dex */
public class DV5 {
    public static DV5 sInstance;

    public static synchronized DV5 getInstance() {
        DV5 dv5;
        dv5 = sInstance;
        if (dv5 == null) {
            dv5 = new DV5();
            sInstance = dv5;
        }
        return dv5;
    }

    public CCV getBitmapCacheKey(C7183Eht c7183Eht, Object obj) {
        String string = c7183Eht.A0H;
        if (string == null) {
            string = getCacheKeySourceUri(c7183Eht.A04).toString();
        }
        return new C2464Bbr(c7183Eht.A06, c7183Eht.A08, c7183Eht.A09, string);
    }

    public CCV getEncodedCacheKey(C7183Eht c7183Eht, Object obj) {
        return getEncodedCacheKey(c7183Eht, c7183Eht.A04, obj);
    }

    public CCV getPostprocessedBitmapCacheKey(C7183Eht c7183Eht, Object obj) {
        String string = c7183Eht.A0H;
        if (string == null) {
            string = getCacheKeySourceUri(c7183Eht.A04).toString();
        }
        return new C2464Bbr(c7183Eht.A06, c7183Eht.A08, c7183Eht.A09, string);
    }

    public Uri getCacheKeySourceUri(Uri uri) {
        return uri;
    }

    public CCV getEncodedCacheKey(C7183Eht c7183Eht, Uri uri, Object obj) {
        String string = c7183Eht.A0H;
        if (string == null) {
            string = getCacheKeySourceUri(uri).toString();
        }
        return new C7428Evl(string);
    }
}
