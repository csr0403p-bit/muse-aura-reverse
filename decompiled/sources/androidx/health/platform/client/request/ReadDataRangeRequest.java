package androidx.health.platform.client.request;

import X.C10638I0i;
import X.C9171Fze;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes6.dex */
public final class ReadDataRangeRequest extends ProtoParcelable<C9171Fze> {
    public static final Parcelable.Creator<ReadDataRangeRequest> CREATOR = new C10638I0i(19);
    public final C9171Fze A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public ReadDataRangeRequest(C9171Fze c9171Fze) {
        this.A00 = c9171Fze;
    }
}
