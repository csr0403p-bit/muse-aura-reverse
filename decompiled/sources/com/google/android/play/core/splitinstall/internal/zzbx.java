package com.google.android.play.core.splitinstall.internal;

import X.BV4;
import X.BV7;
import X.BV9;
import X.C60O;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.android.play.core.splitinstall.SplitInstallException;

/* loaded from: classes5.dex */
public final class zzbx extends RuntimeException {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Throwable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception A01() {
        String strA03;
        int iIndexOf;
        int i = 0;
        int i2 = 0;
        Class cls = new Class[]{SplitInstallException.class}[0];
        if (!RuntimeException.class.isAssignableFrom(cls)) {
            if (getCause() instanceof SplitInstallException) {
                return getCause();
            }
            Exception cause = getCause();
            ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", SplitInstallException.class));
            classCastException.initCause(cause);
            throw classCastException;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "getCause";
        objArr[1] = cls;
        do {
            Object obj = objArr[i2];
            if (obj == null) {
                strA03 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            } else {
                try {
                    strA03 = obj.toString();
                } catch (Exception e) {
                    strA03 = BV9.A03(obj, e);
                }
            }
            objArr[i2] = strA03;
            i2++;
        } while (i2 < 2);
        StringBuilder sbA0p = BV4.A0p(118);
        int i3 = 0;
        while (i < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i3)) != -1) {
            sbA0p.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, iIndexOf);
            sbA0p.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sbA0p.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, 86);
        if (i < 2) {
            for (int iA0K = BV7.A0K(" [", sbA0p, objArr, i); iA0K < 2; iA0K = BV7.A0K(", ", sbA0p, objArr, iA0K)) {
            }
            sbA0p.append(']');
        }
        throw C60O.A0i(sbA0p.toString());
    }
}
