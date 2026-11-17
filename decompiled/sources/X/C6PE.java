package X;

import android.content.Context;
import androidx.datastore.preferences.core.Preferences;
import java.io.File;

/* renamed from: X.6PE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PE implements C6PQ<Preferences> {
    public static final C6PE A00 = new C6PE();

    @Override // X.C6PQ
    public final C6JO AEd(Context context, String str) {
        C8iL c8iL = new C8iL(context, str, 1);
        C0881AGi c0881AGi = C0881AGi.A00;
        GBK gbk = AbstractC9266GBt.A00;
        return C6PF.A00(c0881AGi, c8iL, C78W.A04(HlU.A01));
    }

    @Override // X.C6PQ
    public final File AHB(Context context, String str) {
        return C6PJ.A00(context, str);
    }
}
