package X;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;

/* renamed from: X.Fu1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8945Fu1 implements Dg3, C2Kw {
    public final int $t;
    public final Object A00;

    public C8945Fu1(Fragment fragment) {
        this.$t = 3;
        this.A00 = fragment;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        View view;
        switch (this.$t) {
            case 0:
                ComponentActivity._init_$lambda$1((ComponentActivity) this.A00, c1hy, enumC3085Bxl);
                break;
            case 1:
                ComponentActivity._init_$lambda$2((ComponentActivity) this.A00, c1hy, enumC3085Bxl);
                break;
            case 2:
                ComponentActivity componentActivity = (ComponentActivity) this.A00;
                componentActivity.ensureViewModelStore();
                componentActivity.lifecycleRegistry.A05(this);
                break;
            default:
                if (enumC3085Bxl == EnumC3085Bxl.ON_STOP && (view = ((Fragment) this.A00).mView) != null) {
                    view.cancelPendingInputEvents();
                    break;
                }
                break;
        }
    }

    public C8945Fu1(ComponentActivity componentActivity, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
                this.A00 = componentActivity;
                break;
            default:
                this.A00 = componentActivity;
                break;
        }
    }
}
