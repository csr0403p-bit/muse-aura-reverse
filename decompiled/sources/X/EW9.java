package X;

import com.facebookpay.modularpttgeneration.ModularGeneratePttHelper$PttWrappedException;

/* loaded from: classes5.dex */
public final class EW9 implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$5";
    public final /* synthetic */ EWI A00;
    public final /* synthetic */ EWe A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ Throwable A03;

    public EW9(EWI ewi, EWe eWe, Object obj, Throwable th) {
        this.A00 = ewi;
        this.A02 = obj;
        this.A03 = th;
        this.A01 = eWe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EWI ewi = this.A00;
        Object obj = this.A02;
        Throwable modularGeneratePttHelper$PttWrappedException = this.A03;
        String str = (String) obj;
        EW4 ew4 = ewi.A00;
        EW1 ew1 = ew4.A02.A07;
        ew1.A04.remove(ewi.A01);
        if (str != null) {
            ew4.A01.onPttSigned(str);
            return;
        }
        EWH ewh = ew4.A01;
        if (modularGeneratePttHelper$PttWrappedException == null) {
            modularGeneratePttHelper$PttWrappedException = new ModularGeneratePttHelper$PttWrappedException("An unknown error was thrown during the authorization process");
        }
        ewh.onPttError(modularGeneratePttHelper$PttWrappedException, null, null);
    }
}
