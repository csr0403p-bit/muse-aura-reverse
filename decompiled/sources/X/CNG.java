package X;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class CNG {
    public final Integer A00;
    public final String A01;
    public final int A02;
    public final ImmutableList<ImmutableList<String>> A03;
    public final Throwable A04;

    public static final Throwable A00(CNG cng) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CNM cnm = new CNM(null);
        cnm.A00 = cng;
        Throwable th = cng.A04;
        if (th != null) {
            A01(th, cnm);
            return th;
        }
        String str = cng.A01;
        if (str != null) {
            CNK cnk = new CNK(cng, str);
            A01(cnk, cnm);
            return cnk;
        }
        CNK cnk2 = new CNK(cng, FGI.A0H("Remote error code ", cng.A02));
        A01(cnk2, cnm);
        return cnk2;
    }

    public CNG(ImmutableList immutableList, Integer num, String str, Throwable th, int i) {
        this.A02 = i;
        this.A04 = th;
        this.A00 = num;
        this.A01 = str;
        this.A03 = immutableList;
    }

    public static final void A01(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, th2);
            }
        }
    }
}
