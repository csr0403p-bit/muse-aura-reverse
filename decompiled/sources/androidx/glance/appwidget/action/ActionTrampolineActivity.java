package androidx.glance.appwidget.action;

import X.AnonymousClass779;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass779.A01(this, getIntent());
        finish();
    }
}
