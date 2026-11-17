package androidx.health.platform.client.permission;

import X.C7384Etj;
import X.C7580F4t;
import X.C9180Fzn;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;

/* loaded from: classes5.dex */
public final class Permission extends ProtoParcelable<C9180Fzn> {
    public static final Parcelable.Creator<Permission> CREATOR = new C7580F4t(2);
    public final C9180Fzn A00;

    public Permission(C9180Fzn c9180Fzn) {
        C7384Etj.A0Y(c9180Fzn, 0);
        this.A00 = c9180Fzn;
    }

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return this.A00;
    }
}
