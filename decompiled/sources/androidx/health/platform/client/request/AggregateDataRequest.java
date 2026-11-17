package androidx.health.platform.client.request;

import X.C7580F4t;
import X.C9170Fzd;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class AggregateDataRequest extends ProtoParcelable<C9170Fzd> {
    public static final Parcelable.Creator<AggregateDataRequest> CREATOR = new C7580F4t(3);
    public final C9170Fzd A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public AggregateDataRequest(C9170Fzd c9170Fzd) {
        this.A00 = c9170Fzd;
    }
}
