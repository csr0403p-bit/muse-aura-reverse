package X;

import com.facebook.aura.notifications.push.AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.ChY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3942ChY {
    public final DQZ<String, Integer> A00;
    public final DQZ<String, InterfaceC7409Eus> A01;
    public final AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1 A02;
    public final EtU A03;
    public final boolean A04;
    public final ArrayList<InterfaceC3957Chw> A05;

    public C3942ChY(DQZ dqz, AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1 auraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1, EtU etU, ArrayList arrayList, boolean z) {
        C7384Etj.A0Y(etU, 0);
        this.A03 = etU;
        this.A01 = dqz;
        this.A05 = arrayList;
        this.A04 = z;
        this.A02 = auraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1;
        this.A00 = new DQZ<>(0);
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.ChY) */
    public static final synchronized int A00(C3942ChY c3942ChY, String str) {
        int iIntValue;
        synchronized (c3942ChY) {
            DQZ<String, Integer> dqz = c3942ChY.A00;
            Integer num = dqz.get(str);
            iIntValue = (num != null ? num.intValue() : 0) + 1;
            dqz.put(str, Integer.valueOf(iIntValue));
        }
        return iIntValue;
    }

    public final void A03(String str) throws IOException {
        C7384Etj.A0Y(str, 0);
        IOException iOException = null;
        boolean z = false;
        C4oT c4oT = this.A03.A01;
        String string = c4oT.getString(FGI.A0M(str, ".token"), null);
        if (string != null && !string.equals("<cleared>")) {
            z = true;
        }
        String strA0M = FGI.A0M(str, ".token");
        if (!z) {
            CFK.A0H("PushTokenRefresher", "unregisterToken called for provider: %s with invalid token: %s", str, c4oT.getString(strA0M, null));
            return;
        }
        String string2 = c4oT.getString(strA0M, null);
        if (string2 != null) {
            ArrayList<InterfaceC3957Chw> arrayList = this.A05;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    arrayList.get(i).unregisterToken(str, string2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    } else {
                        CU7.A01(iOException, e);
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        }
        BzK bzKA02 = BzK.A02(c4oT);
        bzKA02.Aae(str);
        bzKA02.AYr(FGI.A0M(str, ".token"), "<cleared>");
        bzKA02.Aae(FGI.A0M(str, ".error"));
        BzK.A06(bzKA02, str);
        CFK.A03(str, "PushTokenRefresher", "Unregistered token from provider=%s");
    }

    public static final void A01(C3942ChY c3942ChY, String str, String str2) throws IOException {
        QuickPerformanceLogger qPLInstance;
        boolean zRegisterToken;
        ArrayList<InterfaceC3957Chw> arrayList = c3942ChY.A05;
        int size = arrayList.size();
        IOException iOException = null;
        for (int i = 0; i < size; i++) {
            try {
                qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                InterfaceC3957Chw interfaceC3957Chw = arrayList.get(i);
                C7384Etj.A0U(interfaceC3957Chw);
                InterfaceC3957Chw interfaceC3957Chw2 = interfaceC3957Chw;
                if (qPLInstance != null) {
                    DBQ.A01(qPLInstance, new EQe(interfaceC3957Chw2, 12));
                }
                zRegisterToken = interfaceC3957Chw2.registerToken(str, str2, null);
                if (qPLInstance != null) {
                    DBQ.A01(qPLInstance, new C3953Chr(interfaceC3957Chw2, zRegisterToken));
                }
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    CU7.A01(iOException, e);
                }
            }
            if (!zRegisterToken) {
                if (qPLInstance != null) {
                    qPLInstance.markerEnd(875314331, (short) 3);
                }
                throw BV4.A0K("unspecified error sending new token");
            }
            continue;
        }
        if (iOException != null) {
            throw iOException;
        }
        EtU etU = c3942ChY.A03;
        AnonymousClass003.A0u(str, str2);
        BzK bzKA02 = BzK.A02(etU.A01);
        bzKA02.AYp(str, etU.A00.now());
        bzKA02.AYr(FGI.A0M(str, ".token"), str2);
        bzKA02.Aae(FGI.A0M(str, ".error"));
        BzK.A06(bzKA02, str);
        CFK.A03(str, "PushTokenRefresher", "Registered token from provider=%s");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.HashSet, java.util.Set<java.lang.String>] */
    public final Set<String> A02() {
        ?? A00 = this.A03.A00();
        DQZ<String, InterfaceC7409Eus> dqz = this.A01;
        int size = dqz.size();
        for (int i = 0; i < size; i++) {
            A00.add(dqz.A05(i));
        }
        return A00;
    }
}
