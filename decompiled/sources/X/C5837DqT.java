package X;

import android.media.Spatializer;

/* renamed from: X.DqT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5837DqT implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C5737DoX A00;
    public final /* synthetic */ DoW A01;

    public C5837DqT(C5737DoX c5737DoX, DoW doW) {
        this.A01 = doW;
        this.A00 = c5737DoX;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        DoW.A07(this.A01);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        DoW.A07(this.A01);
    }
}
