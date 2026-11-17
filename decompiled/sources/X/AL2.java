package X;

import android.view.View;
import com.meta.maps.core.MapsSdkProvider;

/* loaded from: classes4.dex */
public final class AL2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ALE A00;
    public final /* synthetic */ AL9 A01;
    public final /* synthetic */ MapsSdkProvider A02;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i <= 0 || i4 - i2 <= 0) {
            return;
        }
        AL9 al9 = this.A01;
        al9.removeOnLayoutChangeListener(this);
        al9.A02 = null;
        C60O.A02().post(new AL3(this.A00, al9, this.A02));
    }

    public AL2(ALE ale, AL9 al9, MapsSdkProvider mapsSdkProvider) {
        this.A01 = al9;
        this.A00 = ale;
        this.A02 = mapsSdkProvider;
    }
}
