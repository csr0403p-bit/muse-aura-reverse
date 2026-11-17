package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class I0V implements View.OnLayoutChangeListener {
    public final int $t;
    public final Object A00;

    public I0V(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Resources resources;
        Configuration configuration;
        int i9;
        switch (this.$t) {
            case 0:
                FLV flv = (FLV) this.A00;
                View view2 = flv.A01;
                if (view2 != null && (resources = view2.getResources()) != null && (configuration = resources.getConfiguration()) != null && (i9 = configuration.orientation) != flv.A00) {
                    flv.A00 = i9;
                    Function0<Unit> function0 = flv.A03;
                    if (function0 != null) {
                        function0.invoke();
                        break;
                    }
                }
                break;
            case 1:
                if (i3 - i > 0 && i4 - i2 > 0) {
                    AL9.A0F((AL9) this.A00);
                    break;
                }
                break;
            case 2:
                FL0 fl0 = (FL0) this.A00;
                fl0.A02.removeOnLayoutChangeListener(this);
                FL0.A00(fl0);
                break;
            default:
                ((BottomAppBar$Behavior) this.A00).A00.get();
                view.removeOnLayoutChangeListener(this);
                break;
        }
    }
}
