package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public final class ENr implements EOA {
    public final String A00;
    public final Integer A01 = C79.A00;
    public final C6669EOg A02;
    public final boolean A03;

    public static final String A00(EP0 ep0, EP1 ep1) throws FXAccessException {
        String strA0p = C60O.A0p(ep1, ep0.credentialKeys);
        if (strA0p != null) {
            return strA0p;
        }
        throw new FXAccessException(AnonymousClass007.A0a("No credential key configured for ", ep1), ENz.A0D);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.content.Context r15, java.lang.String r16, X.EP0 r17, X.EP1 r18) throws libraries.accessv2.src.model.FXAccessException {
        /*
            r14 = this;
            r12 = r18
            X.AnonymousClass003.A0v(r15, r12)
            android.accounts.AccountManager r6 = android.accounts.AccountManager.get(r15)
            java.lang.String r0 = r14.A00
            android.accounts.Account[] r5 = r6.getAccountsByType(r0)
            X.C7384Etj.A0U(r5)
            r11 = r17
            java.lang.String r4 = A00(r11, r12)
            int r3 = r5.length
            r2 = 0
        L1a:
            if (r2 >= r3) goto L6f
            r1 = r5[r2]
            java.lang.String r8 = r6.getUserData(r1, r4)
            if (r8 == 0) goto L51
            X.ENt r7 = X.ENt.A00     // Catch: java.lang.Exception -> L51
            r9 = 0
            r10 = r9
            r13 = r9
            X.ENw r0 = r7.A01(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L51
            r7 = r16
            if (r16 == 0) goto L39
            java.lang.String r0 = r0.A02
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L51
        L39:
            r6.setUserData(r1, r4, r9)
            java.util.Map<X.EP1, java.lang.String> r0 = r11.credentialKeys
            java.util.Collection r7 = r0.values()
            if (r7 == 0) goto L54
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L54
        L4a:
            boolean r0 = r14.A03
            if (r0 == 0) goto L51
            r6.removeAccountExplicitly(r1)
        L51:
            int r2 = r2 + 1
            goto L1a
        L54:
            java.util.Iterator r7 = r7.iterator()
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4a
            java.lang.String r0 = X.AnonymousClass005.A0j(r7)
            java.lang.String r0 = r6.getUserData(r1, r0)
            if (r0 == 0) goto L58
            int r0 = r0.length()
            if (r0 != 0) goto L51
            goto L58
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENr.A01(android.content.Context, java.lang.String, X.EP0, X.EP1):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EP0;Ljava/util/Set<+LX/EP1;>;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/ENw;>; */
    @Override // X.EOA
    public final ArrayList ABK(Context context, String str, String str2, Set set, EP0 ep0) {
        String userData;
        String strA0n;
        ENz eNz;
        AnonymousClass005.A0x(context, ep0, set);
        C7384Etj.A0Y(str2, 4);
        ArrayList arrayListA0h = C3cG.A0h();
        AccountManager accountManager = AccountManager.get(context);
        String str3 = this.A00;
        Account[] accountsByType = accountManager.getAccountsByType(str3);
        C7384Etj.A0U(accountsByType);
        for (Account account : accountsByType) {
            String userData2 = accountManager.getUserData(account, "sso_settings_v2");
            String userData3 = accountManager.getUserData(account, "persisted_ts");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                EP1 ep1 = (EP1) it.next();
                String strA0p = C60O.A0p(ep1, ep0.credentialKeys);
                if (strA0p != null && (userData = accountManager.getUserData(account, strA0p)) != null) {
                    try {
                        ENt eNt = ENt.A00;
                        ENw eNwA01 = eNt.A01(userData, userData2, userData3, ep0, ep1, new EO4(str3));
                        if (eNt.A02(str, eNwA01)) {
                            if (!C7384Etj.areEqual(account.name, eNwA01.A02)) {
                                String str4 = account.name;
                                StringBuilder sbA0w = C60O.A0w();
                                sbA0w.append("Returned account item ");
                                sbA0w.append(eNwA01);
                                CFK.A06("AccessLibrary", C60P.A1M(" userId does not match stored AM Account Id ", str4, sbA0w));
                            }
                            C6669EOg c6669EOg = this.A02;
                            if (c6669EOg != null) {
                                c6669EOg.A02(C79.A0P, str2, null, null, ep0, ep1);
                            }
                            arrayListA0h.add(eNwA01);
                        }
                    } catch (Exception e) {
                        FXAccessException fXAccessException = e instanceof FXAccessException ? (FXAccessException) e : null;
                        if ((fXAccessException == null || (eNz = fXAccessException.code) == null || (strA0n = eNz.toString()) == null) && (strA0n = C60O.A0n(e)) == null) {
                            strA0n = "parse_exception";
                        }
                        CFK.A06("AccessLibrary", C60P.A1M(". ", e.getMessage(), C3cG.A0f(ep1, "Failed to fetch item for ")));
                        C6669EOg c6669EOg2 = this.A02;
                        if (c6669EOg2 != null) {
                            Integer num = C79.A0T;
                            String message = e.getMessage();
                            c6669EOg2.A02(num, str2, strA0n, message != null ? AnonymousClass006.A10(EOI.A02, message) : null, ep0, ep1);
                        }
                    }
                }
            }
        }
        return arrayListA0h;
    }

    @Override // X.EOA
    public final Integer AJi() {
        return this.A01;
    }

    public ENr(String str, C6669EOg c6669EOg, boolean z) {
        this.A00 = str;
        this.A02 = c6669EOg;
        this.A03 = z;
    }
}
