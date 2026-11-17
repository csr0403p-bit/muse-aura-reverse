package X;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CF9 implements CDr {
    public final CMX<String> A00;
    public final CDr A01;
    public final AtomicInteger A02;

    @Override // X.CDr
    public final CSA<Void> A8l(List<String> list) {
        String strA01 = A01(list);
        A02("deferredInstall: %s", strA01);
        CSA<Void> csaA8l = this.A01.A8l(list);
        C7384Etj.A0U(csaA8l);
        csaA8l.A05(new C7561F4a(this, strA01, 0));
        return csaA8l;
    }

    @Override // X.CDr
    public final CSA<List<CJN>> AKW() {
        A02("getSessionStates", new Object[0]);
        CSA<List<CJN>> csaAKW = this.A01.AKW();
        C7384Etj.A0U(csaAKW);
        csaAKW.A05(new F4W(this, 0));
        return csaAKW;
    }

    public CF9(Context context) {
        CFE cj9;
        Context applicationContext = context.getApplicationContext();
        synchronized (CFC.class) {
            cj9 = CFC.A00;
            if (cj9 == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                cj9 = new CJ9(new CFB(applicationContext2 != null ? applicationContext2 : applicationContext));
                CFC.A00 = cj9;
            }
        }
        CDr cDr = (CDr) ((CJ9) cj9).A00.AjF();
        C7384Etj.A0U(cDr);
        this.A01 = cDr;
        this.A00 = new CMX<>(30);
        this.A02 = new AtomicInteger();
        try {
            cDr.Aa1(new CFA(this));
        } catch (RuntimeException e) {
            this.A00.A00(e.toString());
        }
    }

    public final void A02(String str, Object... objArr) {
        try {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            CMX<String> cmx = this.A00;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(jCurrentTimeMillis);
            cmx.A00(C60P.A1M(": ", str2, sbA0w));
        } catch (IllegalFormatException unused) {
            this.A00.A00("caught exception when enqueueing");
        }
    }

    @Override // X.CDr
    public final CSA<Integer> Ag7(CEU ceu) {
        int andIncrement = this.A02.getAndIncrement();
        A02("startInstall internal_id: %d modules:{%s}", Integer.valueOf(andIncrement), A01(ceu.A00));
        CSA<Integer> csaAg7 = this.A01.Ag7(ceu);
        if (csaAg7 == null) {
            throw BV4.A0c("returnTask is null");
        }
        csaAg7.A05(new F4X(this, andIncrement, 1));
        return csaAg7;
    }

    public static final String A00(CSA<?> csa) {
        String string;
        if (csa.A0C()) {
            return "task was successful";
        }
        Exception excA07 = csa.A07();
        return (excA07 == null || (string = excA07.toString()) == null) ? "Task was not successful but there was no exception?" : string;
    }

    public static final String A01(List<String> list) {
        StringBuilder sbA0w = C60O.A0w();
        Iterator<String> it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            sbA0w.append(str);
            sbA0w.append(strA0j);
            str = ",";
        }
        return sbA0w.toString();
    }

    @Override // X.CDr
    public final CSA<Void> A5y(int i) {
        A02("cancelInstall: %d", Integer.valueOf(i));
        CSA<Void> csaA5y = this.A01.A5y(i);
        C7384Etj.A0U(csaA5y);
        csaA5y.A05(new F4X(this, i, 0));
        return csaA5y;
    }

    @Override // X.CDr
    public final CSA<Void> A8m(List<String> list) {
        String strA01 = A01(list);
        A02("deferredUninstall: %s", strA01);
        CSA<Void> csaA8m = this.A01.A8m(list);
        C7384Etj.A0U(csaA8m);
        csaA8m.A05(new C7561F4a(this, strA01, 1));
        return csaA8m;
    }

    @Override // X.CDr
    public final Set<String> AGZ() {
        A02("getInstalledModules", BV4.A1W());
        Set<String> setAGZ = this.A01.AGZ();
        C7384Etj.A0U(setAGZ);
        StringBuilder sbA0w = C60O.A0w();
        Iterator<String> it = setAGZ.iterator();
        while (it.hasNext()) {
            sbA0w.append(AnonymousClass005.A0j(it));
            sbA0w.append(",");
        }
        A02("getInstalledModules result: %s", sbA0w.toString());
        return setAGZ;
    }

    @Override // X.CDr
    public final void Aa1(InterfaceC3390CIx interfaceC3390CIx) {
        A02("registerListener %s", interfaceC3390CIx.toString());
        this.A01.Aa1(interfaceC3390CIx);
    }

    @Override // X.CDr
    public final boolean Afx(Activity activity, CJN cjn, int i) {
        AnonymousClass003.A0u(cjn, activity);
        return this.A01.Afx(activity, cjn, i);
    }
}
