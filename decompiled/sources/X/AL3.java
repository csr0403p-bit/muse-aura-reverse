package X;

import com.meta.maps.core.MapsSdkProvider;

/* loaded from: classes4.dex */
public final class AL3 implements Runnable {
    public static final String __redex_internal_original_name = "BaseMapView$createMapWhenSized$listener$1$onLayoutChange$1";
    public final /* synthetic */ ALE A00;
    public final /* synthetic */ AL9 A01;
    public final /* synthetic */ MapsSdkProvider A02;

    public AL3(ALE ale, AL9 al9, MapsSdkProvider mapsSdkProvider) {
        this.A01 = al9;
        this.A00 = ale;
        this.A02 = mapsSdkProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AL9 al9 = this.A01;
        if (al9.A0b || al9.A0V != null) {
            return;
        }
        AL9.A06(this.A00, al9, this.A02);
    }
}
