package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* renamed from: X.FiU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8668FiU {
    public final AssetManager A00;
    public final F22<String> A01 = new F22<>();
    public final Map<F22<String>, Typeface> A03 = BV4.A0u();
    public final Map<String, Typeface> A02 = BV4.A0u();

    public C8668FiU(Drawable.Callback callback) {
        AssetManager assets;
        if (callback instanceof View) {
            assets = ((View) callback).getContext().getAssets();
        } else {
            BXP.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        }
        this.A00 = assets;
    }
}
