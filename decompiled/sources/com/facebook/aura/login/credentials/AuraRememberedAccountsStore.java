package com.facebook.aura.login.credentials;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BzK;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.C9jH;
import X.CFK;
import X.FGI;
import X.G0U;
import X.HxE;
import android.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraRememberedAccountsStore {
    public static final Companion Companion = new Companion();
    public static final AuraRememberedAccountsStore device = new AuraRememberedAccountsStore(KeystoreRecordCipher.INSTANCE, AuraRememberedAccountsStore$Companion$device$1.INSTANCE, AuraRememberedAccountsStore$Companion$device$2.INSTANCE);
    public final RecordCipher cipher;
    public final Object lock;
    public Map<String, AuraRememberedAccount> openedBySealedValue;
    public HxE<String, ? extends List<RecordSlot>> openedOrder;
    public final Function0<C4oT> prefs;
    public boolean retiredStoreDeleted;
    public final Function0<File> retiredStoreFile;
    public Map<String, String> slotByAbraUserId;

    /* renamed from: com.facebook.aura.login.credentials.AuraRememberedAccountsStore$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<File> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ File invoke() {
            return null;
        }
    }

    public final class Companion {
        public final AuraRememberedAccountsStore getDevice() {
            return AuraRememberedAccountsStore.device;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public interface RecordCipher {
        byte[] open(byte[] bArr);

        byte[] seal(byte[] bArr);
    }

    /* renamed from: com.facebook.aura.login.credentials.AuraRememberedAccountsStore$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C125051 extends AbstractC7559F3s implements G0U<AuraRememberedAccount, Unit> {
        public static final C125051 INSTANCE = new C125051();

        public C125051() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AuraRememberedAccount auraRememberedAccount) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AuraRememberedAccount auraRememberedAccount) {
        }
    }

    private final boolean writeAccounts(C4oT c4oT, List<AuraRememberedAccount> list) {
        String strSealOrder;
        List listA0a = AbstractC0878AGe.A0a(list, 5);
        Set<Map.Entry<String, AuraRememberedAccount>> setEntrySet = this.openedBySealedValue.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<String, AuraRememberedAccount>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMap.put(entryA0l.getValue(), entryA0l.getKey());
        }
        ArrayList<SealedRecord> arrayListA0m = AnonymousClass002.A0m(listA0a);
        Iterator it2 = listA0a.iterator();
        while (true) {
            if (it2.hasNext()) {
                AuraRememberedAccount auraRememberedAccount = (AuraRememberedAccount) it2.next();
                String strA0k = this.slotByAbraUserId.get(auraRememberedAccount.abraUserId);
                if (strA0k == null) {
                    strA0k = AnonymousClass002.A0k();
                }
                String strSealRecord = (String) linkedHashMap.get(auraRememberedAccount);
                if (strSealRecord == null && (strSealRecord = sealRecord(auraRememberedAccount)) == null) {
                    break;
                }
                arrayListA0m.add(new SealedRecord(strA0k, strSealRecord, auraRememberedAccount));
            } else {
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0m);
                for (SealedRecord sealedRecord : arrayListA0m) {
                    arrayListA0m2.add(new RecordSlot(sealedRecord.slot, sealedRecord.account.abraUserId));
                }
                HxE<String, ? extends List<RecordSlot>> hxE = this.openedOrder;
                if ((hxE == null || !C7384Etj.areEqual(hxE.second, arrayListA0m2) || (strSealOrder = hxE.first) == null) && (strSealOrder = sealOrder(arrayListA0m2)) == null) {
                    return false;
                }
                BzK bzKA9q = c4oT.A9q();
                bzKA9q.A08();
                bzKA9q.AYo("version", 3);
                bzKA9q.AYr(AuraRememberedAccountsStoreKt.KEY_ORDER, strSealOrder);
                for (SealedRecord sealedRecord2 : arrayListA0m) {
                    bzKA9q.AYr(FGI.A0M(AuraRememberedAccountsStoreKt.KEY_RECORD_PREFIX, sealedRecord2.slot), sealedRecord2.sealed);
                }
                if (bzKA9q.commit()) {
                    remember(arrayListA0m, C3cG.A0r(strSealOrder, arrayListA0m2));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean remove(String str, G0U<? super AuraRememberedAccount, Unit> g0u) {
        AuraRememberedAccount next;
        boolean zA1a = AnonymousClass002.A1a(str, g0u);
        synchronized (this.lock) {
            C4oT c4oTOpenPrefs = openPrefs();
            List<AuraRememberedAccount> accounts = readAccounts(c4oTOpenPrefs);
            Iterator<AuraRememberedAccount> it = accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.abraUserId)) {
                    break;
                }
            }
            AuraRememberedAccount auraRememberedAccount = next;
            if (auraRememberedAccount == null) {
                return zA1a;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (AuraRememberedAccount auraRememberedAccount2 : accounts) {
                if (!str.equals(auraRememberedAccount2.abraUserId)) {
                    arrayListA0h.add(auraRememberedAccount2);
                }
            }
            boolean zWriteAccounts = writeAccounts(c4oTOpenPrefs, arrayListA0h);
            if (!zWriteAccounts) {
                return false;
            }
            g0u.invoke(auraRememberedAccount);
            return zA1a;
        }
    }

    public final boolean updateLinkedAccounts(String str, List<AuraRememberedLinkedAccount> list, int i) {
        AuraRememberedAccount next;
        AuraRememberedAccount auraRememberedAccountNormalized;
        boolean zA1a = AnonymousClass002.A1a(str, list);
        synchronized (this.lock) {
            C4oT c4oTOpenPrefs = openPrefs();
            List<AuraRememberedAccount> accounts = readAccounts(c4oTOpenPrefs);
            Iterator<AuraRememberedAccount> it = accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.abraUserId)) {
                    break;
                }
            }
            AuraRememberedAccount auraRememberedAccount = next;
            if (auraRememberedAccount == null || (auraRememberedAccountNormalized = AuraRememberedAccountsStoreKt.normalized(auraRememberedAccount.copy(auraRememberedAccount.abraUserId, auraRememberedAccount.metaAccountId, auraRememberedAccount.contactPoint, auraRememberedAccount.name, auraRememberedAccount.username, auraRememberedAccount.profilePictureUrl, list, i, auraRememberedAccount.savedAccountId))) == null) {
                return false;
            }
            if (!auraRememberedAccountNormalized.equals(auraRememberedAccount)) {
                ArrayList arrayListA0i = AnonymousClass003.A0i(accounts);
                for (AuraRememberedAccount auraRememberedAccount2 : accounts) {
                    if (str.equals(auraRememberedAccount2.abraUserId)) {
                        auraRememberedAccount2 = auraRememberedAccountNormalized;
                    }
                    arrayListA0i.add(auraRememberedAccount2);
                }
                zA1a = writeAccounts(c4oTOpenPrefs, arrayListA0i);
            }
            return zA1a;
        }
    }

    public final boolean updateProfile(String str, String str2, String str3, String str4) {
        AuraRememberedAccount next;
        C7384Etj.A0Y(str, 0);
        AuraRememberedAccount auraRememberedAccountNormalized = AuraRememberedAccountsStoreKt.normalized(new AuraRememberedAccount(str, null, null, str2, str3, str4, C0881AGi.A00, 0, null));
        if (auraRememberedAccountNormalized == null) {
            return false;
        }
        synchronized (this.lock) {
            C4oT c4oTOpenPrefs = openPrefs();
            List<AuraRememberedAccount> accounts = readAccounts(c4oTOpenPrefs);
            Iterator<AuraRememberedAccount> it = accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.abraUserId)) {
                    break;
                }
            }
            AuraRememberedAccount auraRememberedAccount = next;
            if (auraRememberedAccount == null) {
                return false;
            }
            AuraRememberedAccount auraRememberedAccountMergedOnto = AuraRememberedAccountsStoreKt.mergedOnto(auraRememberedAccountNormalized, auraRememberedAccount);
            if (auraRememberedAccountMergedOnto.equals(auraRememberedAccount)) {
                return true;
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(accounts);
            for (AuraRememberedAccount auraRememberedAccount2 : accounts) {
                if (str.equals(auraRememberedAccount2.abraUserId)) {
                    auraRememberedAccount2 = auraRememberedAccountMergedOnto;
                }
                arrayListA0i.add(auraRememberedAccount2);
            }
            return writeAccounts(c4oTOpenPrefs, arrayListA0i);
        }
    }

    public final boolean upsert(AuraRememberedAccount auraRememberedAccount) {
        AuraRememberedAccount next;
        boolean zWriteAccounts;
        String str;
        C7384Etj.A0Y(auraRememberedAccount, 0);
        AuraRememberedAccount auraRememberedAccountNormalized = AuraRememberedAccountsStoreKt.normalized(auraRememberedAccount);
        if (auraRememberedAccountNormalized == null) {
            return false;
        }
        synchronized (this.lock) {
            C4oT c4oTOpenPrefs = openPrefs();
            List<AuraRememberedAccount> accounts = readAccounts(c4oTOpenPrefs);
            Iterator<AuraRememberedAccount> it = accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.abraUserId, auraRememberedAccountNormalized.abraUserId)) {
                    break;
                }
            }
            AuraRememberedAccount auraRememberedAccountMergedOnto = AuraRememberedAccountsStoreKt.mergedOnto(auraRememberedAccountNormalized, next);
            ArrayList arrayListA0h = C3cG.A0h();
            for (AuraRememberedAccount auraRememberedAccount2 : accounts) {
                AuraRememberedAccount auraRememberedAccount3 = auraRememberedAccount2;
                if (!C7384Etj.areEqual(auraRememberedAccount3.abraUserId, auraRememberedAccountMergedOnto.abraUserId) && ((str = auraRememberedAccountMergedOnto.metaAccountId) == null || !str.equals(auraRememberedAccount3.metaAccountId))) {
                    arrayListA0h.add(auraRememberedAccount2);
                }
            }
            zWriteAccounts = writeAccounts(c4oTOpenPrefs, AbstractC0878AGe.A0P(arrayListA0h, Collections.singletonList(auraRememberedAccountMergedOnto)));
        }
        return zWriteAccounts;
    }

    private final boolean deleteRetiredStore() {
        File fileInvoke = this.retiredStoreFile.invoke();
        if (fileInvoke == null || !fileInvoke.exists() || fileInvoke.delete()) {
            return true;
        }
        CFK.A06(AuraRememberedAccountsStoreKt.TAG, "The retired remembered-accounts file could not be deleted");
        return false;
    }

    private final List<RecordSlot> openOrder(String str) {
        try {
            RecordCipher recordCipher = this.cipher;
            byte[] bArrDecode = Base64.decode(str, 2);
            C7384Etj.A0U(bArrDecode);
            return AuraRememberedAccountsStoreKt.decodeOrder(recordCipher.open(bArrDecode));
        } catch (Exception e) {
            CFK.A0A(AuraRememberedAccountsStoreKt.TAG, "The remembered-accounts order could not be opened; it reads as empty", e);
            return null;
        }
    }

    private final C4oT openPrefs() {
        if (!this.retiredStoreDeleted) {
            this.retiredStoreDeleted = deleteRetiredStore();
        }
        return this.prefs.invoke();
    }

    private final AuraRememberedAccount openRecord(String str) {
        try {
            RecordCipher recordCipher = this.cipher;
            byte[] bArrDecode = Base64.decode(str, 2);
            C7384Etj.A0U(bArrDecode);
            return AuraRememberedAccountsStoreKt.decodeRecord(recordCipher.open(bArrDecode));
        } catch (Exception e) {
            CFK.A0A(AuraRememberedAccountsStoreKt.TAG, "A remembered account could not be opened; it reads as absent", e);
            return null;
        }
    }

    private final void remember(List<SealedRecord> list, HxE<String, ? extends List<RecordSlot>> hxE) {
        int iA03 = C3cG.A03(list, 10);
        if (iA03 < 16) {
            iA03 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA03);
        for (SealedRecord sealedRecord : list) {
            linkedHashMap.put(sealedRecord.sealed, sealedRecord.account);
        }
        this.openedBySealedValue = linkedHashMap;
        int iA032 = C3cG.A03(list, 10);
        if (iA032 < 16) {
            iA032 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA032);
        for (SealedRecord sealedRecord2 : list) {
            linkedHashMap2.put(sealedRecord2.account.abraUserId, sealedRecord2.slot);
        }
        this.slotByAbraUserId = linkedHashMap2;
        this.openedOrder = hxE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean remove$default(AuraRememberedAccountsStore auraRememberedAccountsStore, String str, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C125051.INSTANCE;
        }
        return auraRememberedAccountsStore.remove(str, g0u);
    }

    private final String sealOrder(List<RecordSlot> list) {
        try {
            return Base64.encodeToString(this.cipher.seal(AuraRememberedAccountsStoreKt.encodeOrder(list)), 2);
        } catch (Exception e) {
            CFK.A0A(AuraRememberedAccountsStoreKt.TAG, "The remembered-accounts order could not be sealed; nothing was written", e);
            return null;
        }
    }

    private final String sealRecord(AuraRememberedAccount auraRememberedAccount) {
        try {
            return Base64.encodeToString(this.cipher.seal(AuraRememberedAccountsStoreKt.encodeRecord(auraRememberedAccount)), 2);
        } catch (Exception e) {
            CFK.A0A(AuraRememberedAccountsStoreKt.TAG, "A remembered account could not be sealed; nothing was written", e);
            return null;
        }
    }

    public final List<AuraRememberedAccount> getAll() {
        List<AuraRememberedAccount> accounts;
        synchronized (this.lock) {
            accounts = readAccounts(openPrefs());
        }
        return accounts;
    }

    public final boolean updateSavedAccountId(String str, String str2) {
        AuraRememberedAccount next;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        AuraRememberedAccount auraRememberedAccountNormalized = AuraRememberedAccountsStoreKt.normalized(new AuraRememberedAccount(str, null, null, null, null, null, C0881AGi.A00, 0, str2));
        if (auraRememberedAccountNormalized == null) {
            return false;
        }
        synchronized (this.lock) {
            C4oT c4oTOpenPrefs = openPrefs();
            List<AuraRememberedAccount> accounts = readAccounts(c4oTOpenPrefs);
            Iterator<AuraRememberedAccount> it = accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.abraUserId)) {
                    break;
                }
            }
            AuraRememberedAccount auraRememberedAccount = next;
            if (auraRememberedAccount == null) {
                return false;
            }
            AuraRememberedAccount auraRememberedAccountMergedOnto = AuraRememberedAccountsStoreKt.mergedOnto(auraRememberedAccountNormalized, auraRememberedAccount);
            if (!auraRememberedAccountMergedOnto.equals(auraRememberedAccount)) {
                ArrayList arrayListA0i = AnonymousClass003.A0i(accounts);
                for (AuraRememberedAccount auraRememberedAccount2 : accounts) {
                    if (str.equals(auraRememberedAccount2.abraUserId)) {
                        auraRememberedAccount2 = auraRememberedAccountMergedOnto;
                    }
                    arrayListA0i.add(auraRememberedAccount2);
                }
                zA1a = writeAccounts(c4oTOpenPrefs, arrayListA0i);
            }
            return zA1a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraRememberedAccountsStore(RecordCipher recordCipher, Function0<? extends File> function0, Function0<? extends C4oT> function02) {
        AnonymousClass005.A0x(recordCipher, function0, function02);
        this.cipher = recordCipher;
        this.retiredStoreFile = function0;
        this.prefs = function02;
        this.lock = C3cG.A0T();
        C9jH c9jHA0E = AGH.A0E();
        this.openedBySealedValue = c9jHA0E;
        this.slotByAbraUserId = c9jHA0E;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[LOOP:1: B:37:0x0097->B:39:0x009d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.login.credentials.AuraRememberedAccount> readAccounts(X.C4oT r11) {
        /*
            r10 = this;
            java.lang.String r6 = com.facebook.aura.login.credentials.AuraRememberedAccountsStoreKt.readSealedOrder(r11)
            r0 = 0
            if (r6 != 0) goto L1d
            int r1 = r11.getSize()
            if (r1 <= 0) goto L17
            X.BzK r1 = r11.A9q()
            r1.A08()
            r1.commit()
        L17:
            X.AGi r2 = X.C0881AGi.A00
            r10.remember(r2, r0)
        L1c:
            return r2
        L1d:
            int r1 = r6.length()
            if (r1 != 0) goto L6f
            X.AGi r1 = X.C0881AGi.A00
        L25:
            if (r1 != 0) goto L84
            X.AGi r2 = X.C0881AGi.A00
        L29:
            java.util.ArrayList r8 = X.C3cG.A0h()
            java.util.Iterator r9 = r2.iterator()
        L31:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r7 = r9.next()
            com.facebook.aura.login.credentials.RecordSlot r7 = (com.facebook.aura.login.credentials.RecordSlot) r7
            com.facebook.aura.login.credentials.AuraRememberedAccountsStore$readAccounts$records$1$sealed$1 r2 = new com.facebook.aura.login.credentials.AuraRememberedAccountsStore$readAccounts$records$1$sealed$1
            r2.<init>(r11, r7)
            java.lang.Object r5 = com.facebook.aura.login.credentials.AuraRememberedAccountsStoreKt.readOrNullOnWrongType(r2)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L31
            java.util.Map<java.lang.String, com.facebook.aura.login.credentials.AuraRememberedAccount> r2 = r10.openedBySealedValue
            java.lang.Object r4 = r2.get(r5)
            com.facebook.aura.login.credentials.AuraRememberedAccount r4 = (com.facebook.aura.login.credentials.AuraRememberedAccount) r4
            if (r4 != 0) goto L5a
            com.facebook.aura.login.credentials.AuraRememberedAccount r4 = r10.openRecord(r5)
            if (r4 == 0) goto L31
        L5a:
            java.lang.String r3 = r4.abraUserId
            java.lang.String r2 = r7.abraUserId
            boolean r2 = X.C7384Etj.areEqual(r3, r2)
            if (r2 == 0) goto L31
            java.lang.String r3 = r7.slot
            com.facebook.aura.login.credentials.SealedRecord r2 = new com.facebook.aura.login.credentials.SealedRecord
            r2.<init>(r3, r5, r4)
            r8.add(r2)
            goto L31
        L6f:
            X.HxE<java.lang.String, ? extends java.util.List<com.facebook.aura.login.credentials.RecordSlot>> r2 = r10.openedOrder
            if (r2 == 0) goto L7f
            boolean r1 = X.C3cG.A1O(r6, r2)
            if (r1 == 0) goto L7f
            B r1 = r2.second
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L84
        L7f:
            java.util.List r1 = r10.openOrder(r6)
            goto L25
        L84:
            r2 = r1
            goto L29
        L86:
            if (r1 == 0) goto L8c
            X.HxE r0 = X.C3cG.A0r(r6, r1)
        L8c:
            r10.remember(r8, r0)
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r8)
            java.util.Iterator r1 = r8.iterator()
        L97:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            com.facebook.aura.login.credentials.SealedRecord r0 = (com.facebook.aura.login.credentials.SealedRecord) r0
            com.facebook.aura.login.credentials.AuraRememberedAccount r0 = r0.account
            r2.add(r0)
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.credentials.AuraRememberedAccountsStore.readAccounts(X.4oT):java.util.List");
    }

    public /* synthetic */ AuraRememberedAccountsStore(RecordCipher recordCipher, Function0 function0, Function0 function02, int i, C06H c06h) {
        this((i & 1) != 0 ? KeystoreRecordCipher.INSTANCE : recordCipher, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function0, function02);
    }
}
