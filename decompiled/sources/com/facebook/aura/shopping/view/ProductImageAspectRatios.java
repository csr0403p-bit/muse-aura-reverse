package com.facebook.aura.shopping.view;

import X.C7384Etj;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class ProductImageAspectRatios {
    public static final int $stable = 0;
    public static final ProductImageAspectRatios INSTANCE = new ProductImageAspectRatios();
    public static final LruCache<String, Float> ratios = new LruCache<>(256);

    public final Float get(String str) {
        C7384Etj.A0Y(str, 0);
        return ratios.get(str);
    }

    public final Float put(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        LruCache<String, Float> lruCache = ratios;
        Float fValueOf = Float.valueOf(i / i2);
        lruCache.put(str, fValueOf);
        return fValueOf;
    }
}
