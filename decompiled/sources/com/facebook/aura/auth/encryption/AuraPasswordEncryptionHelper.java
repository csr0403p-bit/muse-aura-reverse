package com.facebook.aura.auth.encryption;

import X.AbstractC5321DgF;
import X.BV4;
import X.C4034Cka;
import X.C7384Etj;
import X.C79;
import X.CFK;
import X.CGk;
import X.Ck7;
import X.EnumC7395EuY;
import X.F0C;
import android.util.Base64;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import libraries.passwordencryption.model.PasswordEncryptionException;

/* loaded from: classes5.dex */
public final class AuraPasswordEncryptionHelper {
    public static final String GRAPH_TIER = "ar-genai";
    public static final AuraPasswordEncryptionHelper INSTANCE = new AuraPasswordEncryptionHelper();
    public static final F0C controller$delegate = AbstractC5321DgF.A03(AuraPasswordEncryptionHelper$controller$2.INSTANCE);

    public final String getEncryptedPassword(String str) {
        C4034Cka c4034CkaA00;
        String str2;
        C4034Cka c4034Cka;
        String str3;
        int i;
        C7384Etj.A0Y(str, 0);
        try {
            Ck7 ck7 = (Ck7) C7384Etj.A0G(controller$delegate);
            AtomicBoolean atomicBoolean = Ck7.A05;
            if (str.isEmpty()) {
                c4034Cka = new C4034Cka(str, new PasswordEncryptionException(new Exception("Empty password passed in"), EnumC7395EuY.A03));
            } else {
                String str4 = String.format(Locale.US, "%d", Long.valueOf(BV4.A04(Calendar.getInstance().getTimeInMillis())));
                CGk cGkA00 = ck7.A01.A00();
                if (cGkA00 == null || (str3 = cGkA00.A03) == null || (i = cGkA00.A00) < 0 || str3.length() == 0) {
                    c4034CkaA00 = Ck7.A00(str, str4, ck7);
                } else {
                    try {
                        c4034CkaA00 = new C4034Cka(Base64.encodeToString(Ck7.A04.encrypt(i, str3, str, str4), 2), null);
                    } catch (Exception unused) {
                        c4034CkaA00 = Ck7.A00(str, str4, ck7);
                    }
                }
                CGk cGkA002 = ck7.A01.A00();
                if (cGkA002 == null || cGkA002.A02 != C79.A01) {
                    int i2 = 2;
                    PasswordEncryptionException passwordEncryptionException = c4034CkaA00.A01;
                    if (passwordEncryptionException != null) {
                        EnumC7395EuY enumC7395EuY = passwordEncryptionException.exceptionType;
                        if (enumC7395EuY == EnumC7395EuY.A02) {
                            i2 = 1;
                        } else if (enumC7395EuY == EnumC7395EuY.A03) {
                            i2 = 0;
                        }
                    }
                    if (ck7.A03 || passwordEncryptionException == null || passwordEncryptionException.exceptionType != EnumC7395EuY.A03) {
                        switch (ck7.A02.intValue()) {
                            case 1:
                                str2 = "#PWD_FB4A";
                                break;
                            case 2:
                                str2 = "#PWD_TALK";
                                break;
                            case 3:
                                str2 = "#PWD_INSTAGRAM";
                                break;
                            case 4:
                                str2 = "#PWD_WORKPLACE";
                                break;
                            case 5:
                                str2 = "#PWD_MSGR";
                                break;
                            default:
                                str2 = "#PWD_ENC";
                                break;
                        }
                    } else {
                        str2 = "#PWD_TRANSIENT";
                    }
                    c4034Cka = new C4034Cka(String.format(Locale.US, "%s:%s:%s:%s", str2, Integer.valueOf(i2), str4, c4034CkaA00.A00), passwordEncryptionException);
                } else {
                    c4034Cka = new C4034Cka(String.format(Locale.US, "%s:%s:%s:%s", "#PWD_TRANSIENT", 0, str4, str), c4034CkaA00.A01);
                }
            }
            return c4034Cka.A00;
        } catch (Throwable th) {
            CFK.A08(AuraPasswordEncryptionHelperKt.TAG, "password encryption failed", th);
            return null;
        }
    }

    private final Ck7 getController() {
        return (Ck7) C7384Etj.A0G(controller$delegate);
    }

    public final void prefetchKey() {
        try {
            ((Ck7) C7384Etj.A0G(controller$delegate)).A01();
        } catch (Throwable th) {
            CFK.A0A(AuraPasswordEncryptionHelperKt.TAG, "password encryption key prefetch failed", th);
        }
    }
}
