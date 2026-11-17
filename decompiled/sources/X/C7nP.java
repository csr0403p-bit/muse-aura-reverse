package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.content.SecureContextHelper;
import java.util.ArrayList;
import java.util.Set;

@Deprecated
/* renamed from: X.7nP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7nP implements SecureContextHelper {
    public C77m A00;
    public final String A05 = (String) C5246DeB.A00(16387);
    public final F2k<C7nN> A02 = new F0f(32777);
    public final F2k A04 = new F0f(32782);
    public final Set A08 = AbstractC5245DeA.A03(5);
    public final Set A06 = AbstractC5245DeA.A03(6);
    public final Set A09 = AbstractC5245DeA.A03(4);
    public final Set<C7oD> A07 = AbstractC5245DeA.A03(7);
    public final F2k<C7oD> A03 = new C5242De7(32780);
    public final F2k A01 = new F0f(65536);

    @Override // com.facebook.content.SecureContextHelper
    public final void startFacebookActivity(Intent intent, Context context) {
        C77m c77n = this.A00;
        if (c77n == null) {
            Set<C7oD> set = this.A07;
            ArrayList arrayListA11 = C60O.A11(set.size() + 1);
            arrayListA11.addAll(set);
            arrayListA11.add(this.A03.AMN());
            C7nM c7nM = new C7nM(this, new C7nQ(this, new C7nR(new C7nS(this), new C77o(arrayListA11))));
            this.A00 = c7nM;
            c77n = new C77n(c7nM);
            this.A00 = c77n;
        }
        c77n.A05(context, intent);
    }
}
