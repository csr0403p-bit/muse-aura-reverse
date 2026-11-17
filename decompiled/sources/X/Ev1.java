package X;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class Ev1 implements InterfaceC3618CYn {
    public final /* synthetic */ C4020Ck2 A00;
    public final /* synthetic */ F2m A01;

    public Ev1(C4020Ck2 c4020Ck2, F2m f2m) {
        this.A01 = f2m;
        this.A00 = c4020Ck2;
    }

    @Override // X.InterfaceC3618CYn
    public final void ATK(IOException iOException) {
        this.A01.onFail(iOException);
    }

    @Override // X.InterfaceC3618CYn
    public final void AVX(C7416EvJ c7416EvJ) throws IOException {
        if (c7416EvJ == null) {
            this.A01.onFail(BV4.A0K("Session Cookie Exchange Network Response is Null"));
            return;
        }
        InputStream inputStream = c7416EvJ.A01;
        F2m f2m = this.A01;
        String strA0U = null;
        try {
            try {
                String string = BV4.A19(BV4.A0o(F0H.A01(inputStream))).getString("session_cookie");
                if (string != null && string.length() != 0) {
                    strA0U = FGI.A0U("fs=", string, "; Domain=.meta.com; Secure; HttpOnly; SameSite=None; Path=/");
                }
            } catch (JSONException e) {
                CFK.A08("FXMetaSessionCookieFetcher", "Invalid Response", e);
            }
            f2m.onSuccess(strA0U);
            inputStream.close();
        } finally {
        }
    }
}
