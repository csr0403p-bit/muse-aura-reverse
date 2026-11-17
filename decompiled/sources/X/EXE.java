package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import com.facebook.aura.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class EXE {
    public final BiometricManager A00;
    public final C2r7 A01;
    public final EXG A02;

    public final int A00(int i) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iCanAuthenticate;
        int i2;
        BiometricPrompt.CryptoObject cryptoObjectA00;
        if (Build.VERSION.SDK_INT >= 30) {
            BiometricManager biometricManager = this.A00;
            if (biometricManager != null) {
                return EXF.A00(biometricManager, i);
            }
        } else {
            if (!AbstractC10508Hnv.A00(i)) {
                return -2;
            }
            if (i == 0) {
                return 12;
            }
            Context context = ((C2qU) this.A01).A00;
            if (context.getSystemService(KeyguardManager.class) == null) {
                return 12;
            }
            if ((32768 & i) != 0) {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
                return (keyguardManager == null || !keyguardManager.isDeviceSecure()) ? 11 : 0;
            }
            if ((i & 255) != 255) {
                try {
                    Method method = BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
                    if (method != null && (cryptoObjectA00 = EX2.A00(EX2.A01())) != null) {
                        try {
                            Object objInvoke = method.invoke(this.A00, cryptoObjectA00);
                            if (objInvoke instanceof Integer) {
                                return AnonymousClass001.A0F(objInvoke);
                            }
                            Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                            Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                BiometricManager biometricManager2 = this.A00;
                if (biometricManager2 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                    iCanAuthenticate = 1;
                } else {
                    iCanAuthenticate = biometricManager2.canAuthenticate();
                }
                String str = Build.MODEL;
                if (str != null) {
                    for (String str2 : context.getResources().getStringArray(R.array._name_removed__res_0x7f030001)) {
                        if (str.equals(str2)) {
                            return iCanAuthenticate;
                        }
                    }
                }
                if (iCanAuthenticate != 0) {
                    return iCanAuthenticate;
                }
                KeyguardManager keyguardManager2 = (KeyguardManager) context.getSystemService(KeyguardManager.class);
                boolean zIsDeviceSecure = keyguardManager2 != null ? keyguardManager2.isDeviceSecure() : false;
                if (this.A02 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                    i2 = 1;
                } else {
                    i2 = 12;
                }
                if (zIsDeviceSecure) {
                    return -1;
                }
                return i2;
            }
            BiometricManager biometricManager3 = this.A00;
            if (biometricManager3 != null) {
                return biometricManager3.canAuthenticate();
            }
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public EXE(C2r7 c2r7) {
        this.A01 = c2r7;
        this.A00 = (BiometricManager) ((C2qU) c2r7).A00.getSystemService(BiometricManager.class);
        this.A02 = Build.VERSION.SDK_INT <= 29 ? new EXG() : null;
    }
}
