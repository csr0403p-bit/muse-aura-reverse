package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CJL implements CDr {
    public final CJ6 A00;
    public final Handler A01 = C60O.A02();
    public final C3392CJg A02;
    public final CJO A03;
    public final CJK A04;

    @Override // X.CDr
    public final synchronized void Aa1(InterfaceC3390CIx interfaceC3390CIx) {
        this.A00.A00(interfaceC3390CIx);
    }

    @Override // X.CDr
    public final CSA<Void> A5y(int i) {
        C3392CJg c3392CJg = this.A02;
        CKb cKb = c3392CJg.A00;
        if (cKb == null) {
            return C3392CJg.A00();
        }
        C3392CJg.A02.A03("cancelInstall(%d)", BV5.A1Y(i));
        CSE cse = new CSE();
        cKb.A03(cse, new CJZ(cse, cse, c3392CJg, i));
        return cse.A00;
    }

    @Override // X.CDr
    public final CSA<Void> A8l(List<String> list) {
        C3392CJg c3392CJg = this.A02;
        CKb cKb = c3392CJg.A00;
        if (cKb == null) {
            return C3392CJg.A00();
        }
        C3392CJg.A02.A03("deferredInstall(%s)", list);
        CSE cse = new CSE();
        cKb.A03(cse, new CJX(cse, cse, c3392CJg, list));
        return cse.A00;
    }

    @Override // X.CDr
    public final CSA<Void> A8m(List<String> list) {
        CJO cjo = this.A03;
        synchronized (CJO.class) {
            HashSet hashSetA0x = BV4.A0x(cjo.A00());
            Iterator<String> it = list.iterator();
            boolean zAdd = false;
            while (it.hasNext()) {
                zAdd |= hashSetA0x.add(AnonymousClass005.A0j(it));
            }
            if (zAdd) {
                try {
                    BV4.A07(cjo.A00, "playcore_split_install_internal").edit().putStringSet("modules_to_uninstall_if_emulated", hashSetA0x).apply();
                } catch (Exception unused) {
                }
            }
        }
        C3392CJg c3392CJg = this.A02;
        CKb cKb = c3392CJg.A00;
        if (cKb == null) {
            return C3392CJg.A00();
        }
        C3392CJg.A02.A03("deferredUninstall(%s)", list);
        CSE cse = new CSE();
        cKb.A03(cse, new CJY(cse, cse, c3392CJg, list));
        return cse.A00;
    }

    @Override // X.CDr
    public final Set<String> AGZ() {
        return this.A04.A03();
    }

    @Override // X.CDr
    public final CSA<List<CJN>> AKW() {
        C3392CJg c3392CJg = this.A02;
        CKb cKb = c3392CJg.A00;
        if (cKb == null) {
            return C3392CJg.A00();
        }
        C3392CJg.A02.A03("getSessionStates", BV4.A1W());
        CSE cse = new CSE();
        cKb.A03(cse, new C3391CJa(cse, cse, c3392CJg));
        return cse.A00;
    }

    @Override // X.CDr
    public final boolean Afx(Activity activity, CJN cjn, int i) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        C3381CIn c3381CIn = (C3381CIn) cjn;
        if (c3381CIn.A01 != 8 || (pendingIntent = c3381CIn.A05) == null) {
            return false;
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    @Override // X.CDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.CSA<java.lang.Integer> Ag7(X.CEU r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CJL.Ag7(X.CEU):X.CSA");
    }

    public CJL(C3392CJg c3392CJg, CJO cjo, CJK cjk, CJ6 cj6) {
        this.A02 = c3392CJg;
        this.A00 = cj6;
        this.A04 = cjk;
        this.A03 = cjo;
    }
}
