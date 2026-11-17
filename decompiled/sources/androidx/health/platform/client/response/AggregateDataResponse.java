package androidx.health.platform.client.response;

import X.C7580F4t;
import X.C9182Fzp;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class AggregateDataResponse extends ProtoParcelable<C9182Fzp> {
    public static final Parcelable.Creator<AggregateDataResponse> CREATOR = new C7580F4t(6);
    public final C9182Fzp A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public AggregateDataResponse(C9182Fzp c9182Fzp) {
        this.A00 = c9182Fzp;
    }
}
