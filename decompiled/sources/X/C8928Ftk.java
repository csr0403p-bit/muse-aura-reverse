package X;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ftk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8928Ftk implements A6F {
    public final int $t;
    public final Object A00;

    public C8928Ftk(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.A6F
    public final Bundle Ac4() {
        switch (this.$t) {
            case 0:
                return ComponentActivity._init_$lambda$3((ComponentActivity) this.A00);
            case 1:
                Bundle bundleA0N = BV6.A0N();
                ((AppCompatActivity) this.A00).getDelegate();
                return bundleA0N;
            case 2:
                return ((FragmentActivity) this.A00).m48lambda$init$0$androidxfragmentappFragmentActivity();
            default:
                return ((AbstractC8571FgQ) this.A00).A0S();
        }
    }
}
