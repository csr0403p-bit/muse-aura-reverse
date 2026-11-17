package X;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* renamed from: X.CoV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4169CoV implements Runnable {
    public static final String __redex_internal_original_name = "zacr";
    public final /* synthetic */ zact A00;
    public final /* synthetic */ zak A01;

    public RunnableC4169CoV(zact zactVar, zak zakVar) {
        this.A00 = zactVar;
        this.A01 = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact zactVar = this.A00;
        zak zakVar = this.A01;
        ConnectionResult connectionResult = zakVar.A01;
        if (connectionResult.A01 == 0) {
            zav zavVar = zakVar.A02;
            CRy.A03(zavVar);
            connectionResult = zavVar.A02;
            if (connectionResult.A01 == 0) {
                Cv1 cv1 = zactVar.A00;
                IAccountAccessor iAccountAccessorA00 = zavVar.A00();
                Set<Scope> set = zactVar.A06;
                C4172Cob c4172Cob = (C4172Cob) cv1;
                if (iAccountAccessorA00 == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    c4172Cob.Aj9(new ConnectionResult(4));
                } else {
                    c4172Cob.A00 = iAccountAccessorA00;
                    c4172Cob.A01 = set;
                    if (c4172Cob.A02) {
                        c4172Cob.A03.AJV(iAccountAccessorA00, set);
                    }
                }
            } else {
                String strA0w = BV7.A0w(connectionResult);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strA0w), new Exception());
                zactVar.A00.Aj9(connectionResult);
            }
        } else {
            zactVar.A00.Aj9(connectionResult);
        }
        zactVar.A01.A96();
    }
}
