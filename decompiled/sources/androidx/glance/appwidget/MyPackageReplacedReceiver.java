package androidx.glance.appwidget;

import X.AbstractC9266GBt;
import X.C3cG;
import X.C6I8;
import X.C7zE;
import X.C8i1;
import X.C8iZ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            throw C3cG.A0Q("onReceive context is null");
        }
        if (intent == null) {
            throw C3cG.A0Q("onReceive intent is null");
        }
        if (C7zE.A00(context, new C8i1(3))) {
            return;
        }
        C6I8.A00(this, AbstractC9266GBt.A00, new C8iZ(context, null, 5));
    }
}
