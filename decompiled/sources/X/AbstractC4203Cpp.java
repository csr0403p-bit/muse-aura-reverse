package X;

import X.InterfaceC4191CpP;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.Cpp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4203Cpp<T extends InterfaceC4191CpP, O> extends AbstractC4377CuX<T, O> {
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Landroid/os/Looper;LX/Cod;TO;LX/Cng;LX/Cnh;)TT; */
    @Deprecated
    public final InterfaceC4191CpP A00(Context context, Looper looper, InterfaceC4139Cng interfaceC4139Cng, InterfaceC4140Cnh interfaceC4140Cnh, C4173Cod c4173Cod, Object obj) {
        if (this instanceof C4134Cnb) {
            return new C4133Cna(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4144Cnn) {
            throw null;
        }
        if (this instanceof C4146Cnq) {
            Integer num = c4173Cod.A00;
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
            if (num != null) {
                bundleA0N.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
            }
            bundleA0N.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundleA0N.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundleA0N.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundleA0N.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundleA0N.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundleA0N.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundleA0N.putString("com.google.android.gms.signin.internal.logSessionId", null);
            bundleA0N.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
            return new C4145Cnp(context, bundleA0N, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4263Crl) {
            return new C4205Cpt(context, looper, (GoogleSignInOptions) obj, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4262Crk) {
            return new C4258Crf(context, looper, (C4260Crh) obj, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4143Cnm) {
            return new C4196CpV(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4266Cro) {
            return new C4259Crg(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4253CrQ) {
            AnonymousClass005.A0x(context, looper, c4173Cod);
            AnonymousClass003.A0y(interfaceC4139Cng, interfaceC4140Cnh);
            return new C4257Cre(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 352);
        }
        if (this instanceof C4132CnY) {
            return new C4113Cmw(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 308);
        }
        if (this instanceof C4131CnX) {
            return new C4129CnV(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, (C3784CeS) obj);
        }
        if (this instanceof C4264Crm) {
            return new C4174Coe(context, looper, (C4007Cje) obj, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod);
        }
        if (this instanceof C4130CnW) {
            return new C4121CnK(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 126);
        }
        throw C8j3.A18("buildClient must be implemented");
    }
}
