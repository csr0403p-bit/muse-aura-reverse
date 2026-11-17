package X;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.zzam;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.CSh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3528CSh {
    public final C3554CTr A00;
    public final CSi A01;
    public final CTT A02;
    public final CSj A03;
    public final Executor A04;

    public static final CSC A00(final Bundle bundle, final C3528CSh c3528CSh, String str, String str2, String str3) {
        String str4;
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        C3554CTr c3554CTr = c3528CSh.A00;
        C3554CTr.A01(c3554CTr);
        bundle.putString("gmp_app_id", c3554CTr.A01.A00);
        CSi cSi = c3528CSh.A01;
        bundle.putString("gmsv", Integer.toString(cSi.A04()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", cSi.A05());
        synchronized (cSi) {
            if (cSi.A00 == null) {
                CSi.A02(cSi);
            }
            str4 = cSi.A00;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        CSj cSj = c3528CSh.A03;
        Set<AbstractC3533CSo> set = cSj.A00.A00;
        synchronized (set) {
            setUnmodifiableSet = Collections.unmodifiableSet(set);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String strA0O = cSj.A01;
        if (!zIsEmpty) {
            synchronized (set) {
                setUnmodifiableSet2 = Collections.unmodifiableSet(set);
            }
            strA0O = FGI.A0O(strA0O, CSj.A00(setUnmodifiableSet2), ' ');
        }
        bundle.putString("Firebase-Client", strA0O);
        final CSE cse = new CSE();
        c3528CSh.A04.execute(new Runnable(bundle, cse, c3528CSh) { // from class: X.CS2
            public static final String __redex_internal_original_name = "zzr";
            public final Bundle A00;
            public final CSE A01;
            public final C3528CSh A02;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Bundle bundleA08;
                int i;
                C3528CSh c3528CSh2 = this.A02;
                Bundle bundle2 = this.A00;
                CSE cse2 = this.A01;
                try {
                    CTT ctt = c3528CSh2.A02;
                    if (ctt.A05.A04() >= 12000000) {
                        CS4 cs4A01 = CS4.A01(ctt.A03);
                        synchronized (cs4A01) {
                            i = cs4A01.A00;
                            cs4A01.A00 = i + 1;
                        }
                        CSC cscA00 = CS4.A00(cs4A01, new C3546CTf(bundle2, i, 1));
                        try {
                            CRy.A06("Must not be called on the main application thread");
                            CRy.A01();
                            CRy.A04(cscA00, "Task must not be null");
                            if (!cscA00.A0B()) {
                                CS0 cs0 = new CS0(null);
                                Executor executor = AbstractC3097ByB.A01;
                                cscA00.A06(cs0, executor);
                                cscA00.A0A(cs0, executor);
                                CSA.A00(new CSN(cs0, executor), cscA00);
                                cs0.A00.await();
                            }
                            if (!cscA00.A0C()) {
                                if (!cscA00.A05) {
                                    throw new ExecutionException(cscA00.A07());
                                }
                                throw new CancellationException("Task is already canceled");
                            }
                            bundleA08 = cscA00.A08();
                        } catch (InterruptedException | ExecutionException e) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String strValueOf = String.valueOf(e);
                                BV8.A1P(BV4.A0p(BV5.A04(strValueOf) + 22), "Error making request: ", strValueOf, "FirebaseInstanceId");
                            }
                            if (!(e.getCause() instanceof zzam) || ((zzam) e.getCause()).errorCode != 4) {
                            }
                            cse2.A02(bundleA08);
                        }
                    } else {
                        Bundle bundleA00 = CTT.A00(bundle2, ctt);
                        bundleA08 = bundleA00;
                        if (bundleA00 != null) {
                            boolean zContainsKey = bundleA00.containsKey("google.messenger");
                            bundleA08 = bundleA00;
                            if (zContainsKey) {
                                Bundle bundleA002 = CTT.A00(bundle2, ctt);
                                bundleA08 = bundleA002;
                                if (bundleA002 != null) {
                                    boolean zContainsKey2 = bundleA002.containsKey("google.messenger");
                                    bundleA08 = bundleA002;
                                    if (zContainsKey2) {
                                        bundleA08 = null;
                                    }
                                }
                            }
                        }
                    }
                    cse2.A02(bundleA08);
                } catch (IOException e2) {
                    cse2.A00.A0F(e2);
                }
            }

            {
                this.A02 = c3528CSh;
                this.A00 = bundle;
                this.A01 = cse;
            }
        });
        return cse.A00;
    }

    public C3528CSh(C3554CTr c3554CTr, CSi cSi, CSj cSj, Executor executor) {
        C3554CTr.A01(c3554CTr);
        CTT ctt = new CTT(c3554CTr.A00, cSi);
        this.A00 = c3554CTr;
        this.A01 = cSi;
        this.A02 = ctt;
        this.A04 = executor;
        this.A03 = cSj;
    }
}
