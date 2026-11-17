package androidx.health.platform.client.response;

import X.C7580F4t;
import X.C9189Fzw;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class GetChangesTokenResponse extends ProtoParcelable<C9189Fzw> {
    public static final Parcelable.Creator<GetChangesTokenResponse> CREATOR = new C7580F4t(8);
    public final C9189Fzw A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public GetChangesTokenResponse(C9189Fzw c9189Fzw) {
        this.A00 = c9189Fzw;
    }
}
