package X;

import android.content.Context;
import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.AnF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1639AnF {
    public static final C0918AHu<Context, C1BN<Float>> A00 = C0918AHu.A02();

    public static final BBV A00(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof BBV) {
            return (BBV) tag;
        }
        return null;
    }
}
