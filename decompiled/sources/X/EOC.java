package X;

import android.content.Context;
import com.facebook.aura.accessv2.AuraAccessLibraryPublisherKt;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public abstract class EOC {
    public static final F08 A00 = new C5242De7(65568);
    public static final InterfaceExecutorServiceC3065Bwn A01;
    public static final Set<EOW> A02;
    public static final AtomicInteger A03;

    static {
        Set<EOW> setA03 = AbstractC5245DeA.A03(3);
        C7384Etj.A0U(setA03);
        A02 = setA03;
        InterfaceExecutorServiceC3065Bwn interfaceExecutorServiceC3065BwnA00 = MoreExecutors.A00(Executors.newSingleThreadExecutor());
        C7384Etj.A0U(interfaceExecutorServiceC3065BwnA00);
        A01 = interfaceExecutorServiceC3065BwnA00;
        A03 = BV4.A13(0);
    }

    public static final EOL A00(Context context, G0V g0v, EP1 ep1, boolean z) {
        Integer num;
        Integer num2;
        Object obj;
        String message;
        String strA0n;
        ENz eNz;
        ENz eNz2;
        EOW next;
        EO0 eo0;
        Integer num3 = z ? C79.A0W : C79.A0c;
        if (z) {
            num = C79.A0Y;
            num2 = C79.A0Z;
        } else {
            num = C79.A02;
            num2 = C79.A03;
        }
        int i = z ? 100348897 : 100338619;
        Iterator<EOW> it = A02.iterator();
        do {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            EOO eooAE5 = next.AE5();
            if (context.getPackageName().equals(eooAE5.A01.A01)) {
                break;
            }
            eo0 = eooAE5.A00;
        } while (!context.getPackageName().equals(eo0 != null ? eo0.A01 : null));
        obj = next;
        EOW eow = (EOW) obj;
        FXAccessException fXAccessException = null;
        if (eow == null) {
            return new EOL(FGI.A0M("No target app config registered for ", context.getPackageName()), null, ENz.A0E);
        }
        EP0 ep0ACR = eow.ACR();
        String str = ep0ACR.accountManagerType;
        if (str == null) {
            return new EOL(AnonymousClass007.A0a("No AccountManager configured for ", ep0ACR), ep0ACR, ENz.A0D);
        }
        C6669EOg c6669EOgA15 = BV7.A15();
        AbstractC5053DRd abstractC5053DRd = (AbstractC5053DRd) BV5.A0Z(65561);
        C7491Exw c7491Exw = AbstractC6665EOa.A01;
        ENr eNr = new ENr(str, c6669EOgA15, AbstractC5053DRd.A00(abstractC5053DRd, c7491Exw).getBoolean(c7491Exw));
        int iIncrementAndGet = A03.incrementAndGet();
        BV7.A15().A01(i, iIncrementAndGet, AuraAccessLibraryPublisherKt.LOG_LOCATION);
        BV7.A15().A01.markerAnnotate(i, iIncrementAndGet, "app_source", ep0ACR.name());
        BV7.A15().A01.markerAnnotate(i, iIncrementAndGet, "credential_source", ep1.name());
        BV7.A15().A02(num3, AuraAccessLibraryPublisherKt.LOG_LOCATION, null, null, ep0ACR, ep1);
        try {
            g0v.invoke(eNr, ep0ACR);
            try {
                BV7.A15().A02(num, AuraAccessLibraryPublisherKt.LOG_LOCATION, null, null, ep0ACR, ep1);
                EOE.A00(null, BV7.A15(), i, iIncrementAndGet);
                return null;
            } catch (Exception e) {
                e = e;
                CFK.A08("AccessLibrary", "Error writing to AccountManager", e);
                if ((!(e instanceof FXAccessException) || (fXAccessException = (FXAccessException) e) == null || (message = fXAccessException.message) == null) && (message = e.getMessage()) == null && (message = C60O.A0n(e)) == null) {
                    message = "Unknown error";
                }
                C6669EOg c6669EOgA152 = BV7.A15();
                if (fXAccessException == null || (eNz2 = fXAccessException.code) == null) {
                    strA0n = C60O.A0n(e);
                    if (strA0n == null) {
                        strA0n = "UNKNOWN";
                    }
                } else {
                    strA0n = eNz2.name();
                }
                c6669EOgA152.A02(num2, AuraAccessLibraryPublisherKt.LOG_LOCATION, strA0n, AnonymousClass006.A10(EOI.A02, message), ep0ACR, ep1);
                if (fXAccessException == null || (eNz = fXAccessException.code) == null) {
                    eNz = ENz.A0F;
                }
                EOL eol = new EOL(message, ep0ACR, eNz);
                EOE.A00(Collections.singletonList(eol), BV7.A15(), i, iIncrementAndGet);
                return eol;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
