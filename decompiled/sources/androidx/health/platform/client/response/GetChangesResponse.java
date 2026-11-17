package androidx.health.platform.client.response;

import X.C7580F4t;
import X.C9176Fzj;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class GetChangesResponse extends ProtoParcelable<C9176Fzj> {
    public static final Parcelable.Creator<GetChangesResponse> CREATOR = new C7580F4t(7);
    public final C9176Fzj A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public GetChangesResponse(C9176Fzj c9176Fzj) {
        this.A00 = c9176Fzj;
    }
}
