package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HxK {
    public static final Object A02 = C3cG.A0T();
    public final Context A00;
    public final Map<String, C6840Eas> A01;

    public HxK(Drawable.Callback callback, Map map) {
        if (!TextUtils.isEmpty(null)) {
            throw BV4.A0a("length");
        }
        this.A01 = map;
        this.A00 = !(callback instanceof View) ? null : ((View) callback).getContext().getApplicationContext();
    }
}
