package X;

import android.content.Context;
import com.meta.maps.core.MapsSdkProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AFU implements C9n2 {
    public final Function0<MapsSdkProvider> A00;

    public AFU(Function0<MapsSdkProvider> function0) {
        C7384Etj.A0Y(function0, 0);
        this.A00 = function0;
    }

    @Override // X.C9n2
    public final AL9 createView(Context context) {
        C7384Etj.A0Y(context, 0);
        Function0<MapsSdkProvider> function0 = this.A00;
        GBK gbk = AbstractC9266GBt.A00;
        return new AL9(context, new AFV(C8831Fpd.A00, HlU.A01, AbstractC7429Evm.A00, function0));
    }
}
