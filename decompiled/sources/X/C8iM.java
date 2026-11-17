package X;

import androidx.activity.result.ActivityResult;
import libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity;

/* renamed from: X.8iM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iM implements FT4 {
    public final int $t;
    public final Object A00;

    public C8iM(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.FT4
    public final void onActivityResult(Object obj) {
        if (this.$t == 0) {
            C1BO.A0B((C1BO) this.A00).invoke(obj);
            return;
        }
        ActivityResult activityResult = (ActivityResult) obj;
        C7384Etj.A0Y(activityResult, 0);
        ((WebViewAccountsCenterBaseActivity) this.A00).onActivityResult(activityResult);
    }
}
