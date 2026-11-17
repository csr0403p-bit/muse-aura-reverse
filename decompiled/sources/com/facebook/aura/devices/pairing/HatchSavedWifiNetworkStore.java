package com.facebook.aura.devices.pairing;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.BzK;
import X.C06H;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.CFK;
import android.util.Base64;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchSavedWifiNetworkStore {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final RecordCipher cipher;
    public final Object lock;
    public final Function0<C4oT> prefs;

    public interface RecordCipher {
        byte[] open(byte[] bArr);

        byte[] seal(byte[] bArr);
    }

    public final Map<String, String> forget(String str) {
        Map<String, String> orNull;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            C4oT c4oTInvoke = this.prefs.invoke();
            orNull = readOrNull(c4oTInvoke);
            if (orNull == null) {
                clear(c4oTInvoke);
                orNull = AGH.A0E();
            } else if (orNull.containsKey(str)) {
                orNull = AGH.A09(str, orNull);
                if (!write(c4oTInvoke, orNull)) {
                    CFK.A06(HatchSavedWifiNetworkStoreKt.TAG, "The remaining saved networks could not be sealed; all were deleted");
                    clear(c4oTInvoke);
                    orNull = AGH.A0E();
                }
            }
        }
        return orNull;
    }

    private final Map<String, String> open(String str) {
        try {
            RecordCipher recordCipher = this.cipher;
            byte[] bArrDecode = Base64.decode(str, 2);
            C7384Etj.A0U(bArrDecode);
            return HatchSavedWifiNetworkStoreKt.decodeNetworks(recordCipher.open(bArrDecode));
        } catch (Exception e) {
            CFK.A0A(HatchSavedWifiNetworkStoreKt.TAG, "The saved networks could not be opened; they read as none", e);
            return null;
        }
    }

    private final Map<String, String> readOrNull(C4oT c4oT) {
        String string;
        if (c4oT.getInt("version", 0) != 1 || (string = c4oT.getString(HatchSavedWifiNetworkStoreKt.KEY_NETWORKS, null)) == null) {
            if (c4oT.getSize() > 0) {
                clear(c4oT);
            }
        } else if (string.length() != 0) {
            return open(string);
        }
        return AGH.A0E();
    }

    private final String seal(Map<String, String> map) {
        try {
            return Base64.encodeToString(this.cipher.seal(HatchSavedWifiNetworkStoreKt.encodeNetworks(map)), 2);
        } catch (Exception e) {
            CFK.A0A(HatchSavedWifiNetworkStoreKt.TAG, "The saved networks could not be sealed; nothing was written", e);
            return null;
        }
    }

    public final Map<String, String> snapshot() {
        Map<String, String> map;
        synchronized (this.lock) {
            map = read(this.prefs.invoke());
        }
        return map;
    }

    public final class Companion {
        public final HatchSavedWifiNetworkStore forUser(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return new HatchSavedWifiNetworkStore(KeystoreSavedWifiCipher.INSTANCE, new HatchSavedWifiNetworkStore$Companion$forUser$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchSavedWifiNetworkStore(RecordCipher recordCipher, Function0<? extends C4oT> function0) {
        AnonymousClass003.A0u(recordCipher, function0);
        this.cipher = recordCipher;
        this.prefs = function0;
        this.lock = C3cG.A0T();
    }

    private final boolean clear(C4oT c4oT) {
        BzK bzKA9q = c4oT.A9q();
        bzKA9q.A08();
        return bzKA9q.commit();
    }

    private final Map<String, String> read(C4oT c4oT) {
        Map<String, String> orNull = readOrNull(c4oT);
        return orNull == null ? AGH.A0E() : orNull;
    }

    private final boolean write(C4oT c4oT, Map<String, String> map) {
        if (map.isEmpty()) {
            return clear(c4oT);
        }
        String strSeal = seal(map);
        if (strSeal == null) {
            return false;
        }
        BzK bzKA9q = c4oT.A9q();
        bzKA9q.A08();
        bzKA9q.AYo("version", 1);
        bzKA9q.AYr(HatchSavedWifiNetworkStoreKt.KEY_NETWORKS, strSeal);
        return bzKA9q.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[PHI: r5
  0x0064: PHI (r5v1 java.util.Map<java.lang.String, java.lang.String>) = (r5v3 java.util.Map<java.lang.String, java.lang.String>), (r5v4 java.util.Map<java.lang.String, java.lang.String>) binds: [B:9:0x0027, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> save(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            X.AnonymousClass003.A0u(r8, r9)
            int r0 = r8.length()
            r6 = 0
            if (r0 == 0) goto L6a
            int r0 = r9.length()
            if (r0 == 0) goto L6a
            java.lang.Object r3 = r7.lock
            monitor-enter(r3)
            kotlin.jvm.functions.Function0<X.4oT> r0 = r7.prefs     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r0.invoke()     // Catch: java.lang.Throwable -> L67
            X.4oT r4 = (X.C4oT) r4     // Catch: java.lang.Throwable -> L67
            java.util.Map r5 = r7.read(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r5.get(r8)     // Catch: java.lang.Throwable -> L67
            boolean r0 = X.C7384Etj.areEqual(r0, r9)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L64
            java.util.Map r0 = X.AGH.A09(r8, r5)     // Catch: java.lang.Throwable -> L67
            java.util.Map r0 = X.AnonymousClass006.A11(r8, r9, r0)     // Catch: java.lang.Throwable -> L67
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L67
            java.util.List r1 = X.AbstractC0878AGe.A0X(r0)     // Catch: java.lang.Throwable -> L67
            r0 = 32
            java.util.List r2 = X.AbstractC0878AGe.A0e(r1, r0)     // Catch: java.lang.Throwable -> L67
            r0 = 10
            int r1 = X.C3cG.A03(r2, r0)     // Catch: java.lang.Throwable -> L67
            r0 = 16
            if (r1 >= r0) goto L4b
            r1 = 16
        L4b:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L67
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L67
        L54:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L5e
            X.C3cJ.A0u(r5, r1)     // Catch: java.lang.Throwable -> L67
            goto L54
        L5e:
            boolean r0 = r7.write(r4, r5)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L65
        L64:
            r6 = r5
        L65:
            monitor-exit(r3)
            return r6
        L67:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchSavedWifiNetworkStore.save(java.lang.String, java.lang.String):java.util.Map");
    }

    public /* synthetic */ HatchSavedWifiNetworkStore(RecordCipher recordCipher, Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? KeystoreSavedWifiCipher.INSTANCE : recordCipher, function0);
    }
}
