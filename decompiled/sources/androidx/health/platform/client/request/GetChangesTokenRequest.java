package androidx.health.platform.client.request;

import X.C7580F4t;
import X.C9173Fzg;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class GetChangesTokenRequest extends ProtoParcelable<C9173Fzg> {
    public static final Parcelable.Creator<GetChangesTokenRequest> CREATOR = new C7580F4t(5);
    public final C9173Fzg A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public GetChangesTokenRequest(C9173Fzg c9173Fzg) {
        this.A00 = c9173Fzg;
    }
}
