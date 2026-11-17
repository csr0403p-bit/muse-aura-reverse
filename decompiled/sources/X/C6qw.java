package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.6qw, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6qw extends Hx6<Uri, Boolean> {
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Boolean parseResult(int i, Intent intent) {
        return Boolean.valueOf(AnonymousClass002.A1Q(i, -1));
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Uri uri) {
        Uri uri2 = uri;
        C7384Etj.A0Y(uri2, 1);
        Intent intentPutExtra = C60P.A03("android.media.action.IMAGE_CAPTURE").putExtra("output", uri2);
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }
}
