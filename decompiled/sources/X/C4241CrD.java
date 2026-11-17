package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: X.CrD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4241CrD extends AbstractC4178Com {
    public static final AbstractC4203Cpp A01;
    public static final C4378CuY A02;
    public static final C4240CrC A03;
    public final String A00;

    static {
        C4378CuY c4378CuY = new C4378CuY();
        A02 = c4378CuY;
        C4266Cro c4266Cro = new C4266Cro();
        A01 = c4266Cro;
        A03 = new C4240CrC(c4266Cro, c4378CuY, "Auth.Api.Identity.SignIn.API");
    }

    public C4241CrD(Context context, C4356Cu0 c4356Cu0) {
        super(context, c4356Cu0, A03, C4276Cs4.A02);
        byte[] bArr = new byte[16];
        AbstractC4383Cuj.A00.nextBytes(bArr);
        this.A00 = BV6.A0q(bArr);
    }

    public final SignInCredential A05(Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.A06);
        }
        Status status = (Status) A00(intent, Status.CREATOR, AuraDeeplinkRouteMapper.STATUS_ROUTE);
        if (status == null) {
            throw new ApiException(Status.A04);
        }
        if (status.A00 > 0) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) A00(intent, SignInCredential.CREATOR, "sign_in_credential");
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.A06);
    }

    public static SafeParcelable A00(Intent intent, Parcelable.Creator creator, String str) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        CRy.A03(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }
}
