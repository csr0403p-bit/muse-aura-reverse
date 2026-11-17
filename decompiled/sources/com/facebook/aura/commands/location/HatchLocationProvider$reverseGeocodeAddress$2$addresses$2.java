package com.facebook.aura.commands.location;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider$reverseGeocodeAddress$2$addresses$2", f = "HatchLocationProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchLocationProvider$reverseGeocodeAddress$2$addresses$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<Address>>, Object> {
    public final /* synthetic */ Geocoder $geocoder;
    public final /* synthetic */ double $lat;
    public final /* synthetic */ double $lng;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLocationProvider$reverseGeocodeAddress$2$addresses$2(Geocoder geocoder, double d, double d2, HtJ<? super HatchLocationProvider$reverseGeocodeAddress$2$addresses$2> htJ) {
        super(2, htJ);
        this.$geocoder = geocoder;
        this.$lat = d;
        this.$lng = d2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchLocationProvider$reverseGeocodeAddress$2$addresses$2(this.$geocoder, this.$lat, this.$lng, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String message;
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        try {
            return this.$geocoder.getFromLocation(this.$lat, this.$lng, 1);
        } catch (IOException e) {
            message = e.getMessage();
            str = "Reverse geocode I/O failure: ";
            C3cG.A1G(str, message, HatchLocationProviderKt.TAG);
            return null;
        } catch (IllegalArgumentException e2) {
            message = e2.getMessage();
            str = "Reverse geocode invalid args: ";
            C3cG.A1G(str, message, HatchLocationProviderKt.TAG);
            return null;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super List<Address>> htJ) {
        return ((HatchLocationProvider$reverseGeocodeAddress$2$addresses$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
