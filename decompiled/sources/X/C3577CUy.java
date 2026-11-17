package X;

import android.content.Context;

/* renamed from: X.CUy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3577CUy {
    public static final C3565CUi<?> A01;
    public final Context A00;

    public final synchronized String A00() {
        String string;
        Context context = this.A00;
        string = context.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string == null) {
            string = AnonymousClass002.A0k();
            context.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string).apply();
        }
        return string;
    }

    static {
        C3566CUj c3566CUjA00 = C3566CUj.A00(C3577CUy.class);
        C3566CUj.A02(c3566CUjA00, C3555CTs.class, 1);
        C3566CUj.A02(c3566CUjA00, Context.class, 1);
        A01 = C3566CUj.A01(c3566CUjA00, new C3578CUz());
    }

    public C3577CUy(Context context) {
        this.A00 = context;
    }
}
