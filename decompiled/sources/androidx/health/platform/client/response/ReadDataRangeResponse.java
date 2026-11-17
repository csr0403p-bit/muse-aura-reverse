package androidx.health.platform.client.response;

import X.C7580F4t;
import X.C9177Fzk;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class ReadDataRangeResponse extends ProtoParcelable<C9177Fzk> {
    public static final Parcelable.Creator<ReadDataRangeResponse> CREATOR = new C7580F4t(9);
    public final C9177Fzk A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public ReadDataRangeResponse(C9177Fzk c9177Fzk) {
        this.A00 = c9177Fzk;
    }
}
