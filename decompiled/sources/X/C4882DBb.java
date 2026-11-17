package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DBb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4882DBb implements DBA {
    public final /* synthetic */ Function0<Unit> A00;

    public C4882DBb(Function0<Unit> function0) {
        this.A00 = function0;
    }

    @Override // X.DBA
    public final void uninstall() {
        this.A00.invoke();
    }

    @Override // X.DBA
    public final void onActivityResumed(Activity activity) {
    }
}
