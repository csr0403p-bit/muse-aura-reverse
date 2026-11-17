package X;

import android.content.Context;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.appwidget.proto.LayoutProtoSerializer;
import java.io.File;
import java.util.Collections;

/* renamed from: X.6PI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PI implements C6PQ<C064576h> {
    public static final C6PI A00 = new C6PI();

    @Override // X.C6PQ
    public final C6JO AEd(Context context, String str) {
        LayoutProtoSerializer layoutProtoSerializer = LayoutProtoSerializer.A01;
        C8iL c8iL = new C8iL(context, str, 0);
        C0881AGi c0881AGi = C0881AGi.A00;
        GBK gbk = AbstractC9266GBt.A00;
        return new SingleProcessDataStore(new C6PG(), layoutProtoSerializer, Collections.singletonList(new C07228ib((HtJ) null, (G0V<? super Preferences, ? super HtJ<? super Preferences>, ? extends Object>) c0881AGi, (HtJ<? super C07228ib>) 4)), c8iL, C78W.A04(HlU.A01));
    }

    @Override // X.C6PQ
    public final File AHB(Context context, String str) {
        return C6PX.A00(context, str);
    }
}
