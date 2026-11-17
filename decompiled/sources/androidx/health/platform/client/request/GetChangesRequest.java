package androidx.health.platform.client.request;

import X.C7580F4t;
import X.C9186Fzt;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class GetChangesRequest extends ProtoParcelable<C9186Fzt> {
    public static final Parcelable.Creator<GetChangesRequest> CREATOR = new C7580F4t(4);
    public final C9186Fzt A00;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }

    public GetChangesRequest(C9186Fzt c9186Fzt) {
        this.A00 = c9186Fzt;
    }
}
