package X;

import android.credentials.PrepareGetCredentialResponse;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Ct9 {
    public PrepareGetCredentialResponse A00;
    public C4349Ctr A01;
    public Function0<Boolean> A02;
    public Function0<Boolean> A03;
    public G0U<? super String, Boolean> A04;

    public static final /* synthetic */ boolean A00(Ct9 ct9) {
        PrepareGetCredentialResponse prepareGetCredentialResponse = ct9.A00;
        C7384Etj.A0X(prepareGetCredentialResponse);
        return prepareGetCredentialResponse.hasAuthenticationResults();
    }

    public static final /* synthetic */ boolean A01(Ct9 ct9) {
        PrepareGetCredentialResponse prepareGetCredentialResponse = ct9.A00;
        C7384Etj.A0X(prepareGetCredentialResponse);
        return prepareGetCredentialResponse.hasRemoteResults();
    }

    public static final /* synthetic */ boolean A02(Ct9 ct9, String str) {
        PrepareGetCredentialResponse prepareGetCredentialResponse = ct9.A00;
        C7384Etj.A0X(prepareGetCredentialResponse);
        return prepareGetCredentialResponse.hasCredentialResults(str);
    }

    public final void A03(PrepareGetCredentialResponse prepareGetCredentialResponse) {
        this.A00 = prepareGetCredentialResponse;
        this.A04 = new EZ8(this, 0);
        this.A02 = new EZ6(this, 0);
        this.A03 = new EZ6(this, 1);
    }
}
