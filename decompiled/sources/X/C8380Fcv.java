package X;

import android.hardware.biometrics.BiometricPrompt;
import java.lang.ref.WeakReference;

/* renamed from: X.Fcv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8380Fcv extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ AbstractC8396FdC A00;

    public C8380Fcv(AbstractC8396FdC abstractC8396FdC) {
        this.A00 = abstractC8396FdC;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference<C8379Fct> weakReference = ((C8388Fd3) this.A00).A00;
        if (weakReference.get() != null) {
            weakReference.get();
            if (weakReference.get().A0G) {
                C8379Fct c8379Fct = weakReference.get();
                C8381Fcw c8381Fcw = new C8381Fcw(i, charSequence);
                C2934BpC<C8381Fcw> c2934BpC = c8379Fct.A07;
                if (c2934BpC == null) {
                    c2934BpC = new C2934BpC<>();
                    c8379Fct.A07 = c2934BpC;
                }
                C8379Fct.A03(c2934BpC, c8381Fcw);
            }
        }
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference<C8379Fct> weakReference = ((C8388Fd3) this.A00).A00;
        if (weakReference.get() == null || !weakReference.get().A0G) {
            return;
        }
        C8379Fct c8379Fct = weakReference.get();
        C2934BpC<Boolean> c2934BpC = c8379Fct.A0C;
        if (c2934BpC == null) {
            c2934BpC = new C2934BpC<>();
            c8379Fct.A0C = c2934BpC;
        }
        C8379Fct.A03(c2934BpC, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Lac
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = r6.getCryptoObject()
            r3 = 0
            if (r2 == 0) goto L14
            javax.crypto.Cipher r0 = r2.getCipher()
            if (r0 == 0) goto L80
            X.EX8 r3 = new X.EX8
            r3.<init>(r0)
        L14:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r0 = -1
            if (r2 < r1) goto L21
            if (r6 == 0) goto L21
            int r0 = X.AbstractC8394FdA.A00(r6)
        L21:
            X.Fd6 r4 = new X.Fd6
            r4.<init>(r3, r0)
            X.FdC r0 = r5.A00
            X.Fd3 r0 = (X.C8388Fd3) r0
            java.lang.ref.WeakReference<X.Fct> r3 = r0.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r3.get()
            X.Fct r0 = (X.C8379Fct) r0
            boolean r0 = r0.A0G
            if (r0 == 0) goto L78
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L64
            X.EX8 r2 = r4.A01
            java.lang.Object r0 = r3.get()
            X.Fct r0 = (X.C8379Fct) r0
            X.Fbu r1 = r0.A05
            if (r1 == 0) goto L5e
            X.EX8 r0 = r0.A04
            int r1 = r1.A00
            if (r1 == 0) goto L79
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L5e
        L57:
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L5f
        L5e:
            r0 = -1
        L5f:
            X.Fd6 r4 = new X.Fd6
            r4.<init>(r2, r0)
        L64:
            java.lang.Object r1 = r3.get()
            X.Fct r1 = (X.C8379Fct) r1
            X.BpC<X.Fd6> r0 = r1.A09
            if (r0 != 0) goto L75
            X.BpC r0 = new X.BpC
            r0.<init>()
            r1.A09 = r0
        L75:
            X.C8379Fct.A03(r0, r4)
        L78:
            return
        L79:
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L57
            r1 = 15
            goto L57
        L80:
            java.security.Signature r0 = r2.getSignature()
            if (r0 == 0) goto L8c
            X.EX8 r3 = new X.EX8
            r3.<init>(r0)
            goto L14
        L8c:
            javax.crypto.Mac r0 = r2.getMac()
            if (r0 == 0) goto L99
            X.EX8 r3 = new X.EX8
            r3.<init>(r0)
            goto L14
        L99:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L14
            android.security.identity.IdentityCredential r0 = X.EXD.A01(r2)
            if (r0 == 0) goto L14
            X.EX8 r3 = new X.EX8
            r3.<init>(r0)
            goto L14
        Lac:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8380Fcv.onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt$AuthenticationResult):void");
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
