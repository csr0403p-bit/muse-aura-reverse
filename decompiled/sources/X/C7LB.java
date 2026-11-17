package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.7LB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7LB {
    public final Intent A00;
    public final Bundle A01;

    public final void A00(Context context, Uri uri) {
        Intent intent = this.A00;
        intent.setData(uri);
        context.startActivity(intent, this.A01);
    }

    public C7LB(Intent intent, Bundle bundle) {
        this.A00 = intent;
        this.A01 = bundle;
    }
}
