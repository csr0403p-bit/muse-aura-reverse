package androidx.health.platform.client.request;

import X.C10638I0i;
import X.C5322DgG;
import X.C7384Etj;
import X.F0C;
import X.FZO;
import X.G0L;
import X.GF5;
import X.GF8;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class RequestContext extends ProtoParcelable<G0L> {
    public static final Parcelable.Creator<RequestContext> CREATOR = new C10638I0i(20);
    public final int A00;
    public final String A01;
    public final String A02;
    public final F0C A03 = C5322DgG.A01((Function0) FZO.A02(this, 2));
    public final boolean A04;

    @Override // X.HoU
    public final /* bridge */ /* synthetic */ GF8 A01() {
        return (GF5) C7384Etj.A0G(this.A03);
    }

    public RequestContext(String str, int i, String str2, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A04 = z;
    }
}
