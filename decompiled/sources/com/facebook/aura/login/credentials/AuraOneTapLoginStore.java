package com.facebook.aura.login.credentials;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BzK;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.G0U;
import X.HxE;
import android.util.Base64;
import com.facebook.aura.login.credentials.AuraRememberedAccountsStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraOneTapLoginStore {
    public static final Companion Companion = new Companion();
    public static final AuraOneTapLoginStore device = new AuraOneTapLoginStore(KeystoreOneTapCipher.INSTANCE, AuraOneTapLoginStore$Companion$device$1.INSTANCE);
    public final AuraRememberedAccountsStore.RecordCipher cipher;
    public final Object lock;
    public HxE<String, ? extends Map<String, AuraOneTapLogin>> opened;
    public final Function0<C4oT> prefs;

    public final class Companion {
        public final AuraOneTapLoginStore getDevice() {
            return AuraOneTapLoginStore.device;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.login.credentials.AuraOneTapLoginStore$remove$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public final /* synthetic */ String $abraUserId;

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return C3cG.A0P(str.equals(this.$abraUserId));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$abraUserId = str;
        }
    }

    /* renamed from: com.facebook.aura.login.credentials.AuraOneTapLoginStore$retainOnly$1, reason: invalid class name and case insensitive filesystem */
    public final class C125041 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public final /* synthetic */ Set<String> $abraUserIds;

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return Boolean.valueOf(this.$abraUserIds.contains(str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125041(Set<String> set) {
            super(1);
            this.$abraUserIds = set;
        }
    }

    private final boolean clear(C4oT c4oT) {
        this.opened = null;
        BzK bzKA9q = c4oT.A9q();
        bzKA9q.A08();
        return bzKA9q.commit();
    }

    public final AuraOneTapLogin get(String str) {
        AuraOneTapLogin auraOneTapLogin;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            auraOneTapLogin = read(this.prefs.invoke()).get(str);
        }
        return auraOneTapLogin;
    }

    public final boolean remove(String str) {
        C7384Etj.A0Y(str, 0);
        return retain(new AnonymousClass1(str));
    }

    public final boolean retainOnly(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        return retain(new C125041(set));
    }

    private final Map<String, AuraOneTapLogin> open(String str) {
        try {
            AuraRememberedAccountsStore.RecordCipher recordCipher = this.cipher;
            byte[] bArrDecode = Base64.decode(str, 2);
            C7384Etj.A0U(bArrDecode);
            return AuraOneTapLoginStoreKt.decodeLogins(recordCipher.open(bArrDecode));
        } catch (Exception e) {
            CFK.A0A(AuraOneTapLoginStoreKt.TAG, "The one-tap logins could not be opened; they read as none", e);
            return null;
        }
    }

    private final Map<String, AuraOneTapLogin> readOrNull(C4oT c4oT) {
        String str = (String) AuraRememberedAccountsStoreKt.readOrNullOnWrongType(new AuraOneTapLoginStore$readOrNull$sealed$1(c4oT));
        if (str == null) {
            if (c4oT.getSize() > 0) {
                clear(c4oT);
            }
        } else if (str.length() != 0) {
            HxE<String, ? extends Map<String, AuraOneTapLogin>> hxE = this.opened;
            if (hxE != null && C3cG.A1O(str, hxE)) {
                return (Map) hxE.second;
            }
            Map<String, AuraOneTapLogin> mapOpen = open(str);
            if (mapOpen == null) {
                return null;
            }
            this.opened = C3cG.A0r(str, mapOpen);
            return mapOpen;
        }
        return AGH.A0E();
    }

    private final boolean retain(G0U<? super String, Boolean> g0u) {
        boolean zClear;
        synchronized (this.lock) {
            C4oT c4oTInvoke = this.prefs.invoke();
            Map<String, AuraOneTapLogin> orNull = readOrNull(c4oTInvoke);
            if (orNull == null) {
                zClear = clear(c4oTInvoke);
            } else {
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                Iterator itA0n = AnonymousClass002.A0n(orNull);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    if (AnonymousClass003.A1X(entryA0l.getKey(), g0u)) {
                        AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                    }
                }
                if (linkedHashMapA0j.size() == orNull.size() || write(c4oTInvoke, linkedHashMapA0j)) {
                    zClear = true;
                } else {
                    CFK.A06(AuraOneTapLoginStoreKt.TAG, "The remaining one-tap logins could not be sealed; all were deleted");
                    zClear = clear(c4oTInvoke);
                }
            }
        }
        return zClear;
    }

    private final String seal(Map<String, AuraOneTapLogin> map) {
        try {
            return Base64.encodeToString(this.cipher.seal(AuraOneTapLoginStoreKt.encodeLogins(map)), 2);
        } catch (Exception e) {
            CFK.A0A(AuraOneTapLoginStoreKt.TAG, "The one-tap logins could not be sealed; nothing was written", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraOneTapLoginStore(AuraRememberedAccountsStore.RecordCipher recordCipher, Function0<? extends C4oT> function0) {
        AnonymousClass003.A0u(recordCipher, function0);
        this.cipher = recordCipher;
        this.prefs = function0;
        this.lock = C3cG.A0T();
    }

    private final Map<String, AuraOneTapLogin> read(C4oT c4oT) {
        Map<String, AuraOneTapLogin> orNull = readOrNull(c4oT);
        return orNull == null ? AGH.A0E() : orNull;
    }

    private final boolean write(C4oT c4oT, Map<String, AuraOneTapLogin> map) {
        if (map.isEmpty()) {
            return clear(c4oT);
        }
        String strSeal = seal(map);
        if (strSeal != null) {
            BzK bzKA9q = c4oT.A9q();
            bzKA9q.A08();
            bzKA9q.AYo("version", 1);
            bzKA9q.AYr(AuraOneTapLoginStoreKt.KEY_LOGINS, strSeal);
            if (bzKA9q.commit()) {
                this.opened = C3cG.A0r(strSeal, map);
                return true;
            }
        }
        return false;
    }

    public final boolean put(String str, AuraOneTapLogin auraOneTapLogin) {
        boolean zWrite;
        boolean zA1b = AnonymousClass004.A1b(str, auraOneTapLogin);
        if (C7BY.A0j(str) || C7BY.A0j(auraOneTapLogin.savedAccountId) || C7BY.A0j(auraOneTapLogin.nonce)) {
            return zA1b;
        }
        synchronized (this.lock) {
            C4oT c4oTInvoke = this.prefs.invoke();
            List listA0e = AbstractC0878AGe.A0e(AbstractC0878AGe.A0X(AnonymousClass006.A11(str, auraOneTapLogin, AGH.A09(str, read(c4oTInvoke))).entrySet()), 5);
            int iA03 = C3cG.A03(listA0e, 10);
            if (iA03 < 16) {
                iA03 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA03);
            Iterator it = listA0e.iterator();
            while (it.hasNext()) {
                C3cJ.A0u(linkedHashMap, it);
            }
            zWrite = write(c4oTInvoke, linkedHashMap);
        }
        return zWrite;
    }

    public /* synthetic */ AuraOneTapLoginStore(AuraRememberedAccountsStore.RecordCipher recordCipher, Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? KeystoreOneTapCipher.INSTANCE : recordCipher, function0);
    }
}
