package com.facebook.aura.conversation.viewmodel;

import X.AbstractC0878AGe;
import X.AbstractC0903AHf;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BzK;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.C7bS;
import X.CFK;
import X.DCl;
import X.FGI;
import X.HsJ;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchComposerDraftStore {
    public static final int $stable = 8;
    public static final String DATA_KEY_KEY = "composer_draft_key";
    public static final int DATA_KEY_SIZE_BYTES = 32;
    public static final String DICTATED_PREFIX = "composer_draft_dictated:";
    public static final int GCM_IV_LENGTH_BYTES = 12;
    public static final int GCM_TAG_LENGTH_BITS = 128;
    public static final String KEYSTORE = "AndroidKeyStore";
    public static final String KEY_ALIAS = "hatch_composer_draft";
    public static final int KEY_SIZE_BITS = 256;
    public static final String LEGACY_DICTATED_KEY = "primary_composer_draft_dictated";
    public static final String LEGACY_TEXT_KEY = "primary_composer_draft_text";
    public static final int MAX_SIDE_CHAT_DRAFTS = 20;
    public static final String SAVED_AT_PREFIX = "composer_draft_saved_at:";
    public static final String TAG = "HatchComposerDraftStore";
    public static final String TEXT_PREFIX = "composer_draft_text:";
    public static final String TRANSFORMATION = "AES/GCM/NoPadding";
    public static volatile boolean isAliasDeletionPending;
    public final C4oT prefs;
    public final String vmId;
    public static final Companion Companion = new Companion();
    public static final SecureRandom random = new SecureRandom();
    public static final ConcurrentHashMap<String, SecretKey> dataKeys = C60O.A1C();
    public static final AtomicInteger keyGeneration = new AtomicInteger();

    public final class Companion {
        public final HatchComposerDraftStore forCurrentVm(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            String strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, abstractC3358CGz);
            int i = HatchComposerDraftStore.$stable;
            C4oT c4oT = AuraVMPrefs.INSTANCE.get(strA0a, AuraVMPrefStore.COMPOSER_DRAFT);
            if (strA0a == null) {
                strA0a = "";
            }
            return new HatchComposerDraftStore(c4oT, strA0a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void deletePendingAlias() {
            Object objA0s;
            if (HatchComposerDraftStore.isAliasDeletionPending) {
                HatchComposerDraftStore.isAliasDeletionPending = false;
                HatchComposerDraftStore.dataKeys.clear();
                try {
                    keyStore().deleteEntry(HatchComposerDraftStore.KEY_ALIAS);
                    objA0s = Unit.INSTANCE;
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    CFK.A0A(HatchComposerDraftStore.TAG, "Could not delete the composer draft key", thA00);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyStore keyStore() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        }

        public final void forgetDataKeys$fbandroid_express_aura_java_com_facebook_aura_conversation_viewmodel_viewmodel() {
            HatchComposerDraftStore.keyGeneration.incrementAndGet();
            HatchComposerDraftStore.dataKeys.clear();
            HatchComposerDraftStore.isAliasDeletionPending = true;
            AuraExecutors.INSTANCE.getIoExecutor().execute(new Runnable() { // from class: com.facebook.aura.conversation.viewmodel.HatchComposerDraftStore$Companion$forgetDataKeys$1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (HatchComposerDraftStore.dataKeys) {
                        HatchComposerDraftStore.Companion.deletePendingAlias();
                    }
                }
            });
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String open(SecretKey secretKey, String str, String str2) {
        Object objA0s;
        try {
            byte[] bArrDecode = Base64.decode(str2, 2);
            C7384Etj.A0U(bArrDecode);
            objA0s = new String(decrypt(secretKey, bArrDecode, aad(str)), DCl.A05);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = "";
        }
        return (String) objA0s;
    }

    public final String cachedText(String str) {
        C7384Etj.A0Y(str, 0);
        if (!str.equals("primary_session_id") || !this.prefs.contains(LEGACY_TEXT_KEY)) {
            String string = this.prefs.getString(FGI.A0M(TEXT_PREFIX, str), null);
            if (string == null) {
                return "";
            }
            SecretKey secretKeyCachedDataKey = cachedDataKey();
            if (secretKeyCachedDataKey != null) {
                return open(secretKeyCachedDataKey, str, string);
            }
        }
        return null;
    }

    public final void clear(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = this.prefs.A9q();
        removeDraft(bzKA9q, str);
        finish(bzKA9q, z);
    }

    public final boolean isDictated(String str) {
        C7384Etj.A0Y(str, 0);
        return this.prefs.getBoolean(FGI.A0M(DICTATED_PREFIX, str), false);
    }

    public final String text(String str) {
        String strMigrateLegacyDraft;
        C7384Etj.A0Y(str, 0);
        if (str.equals("primary_session_id") && (strMigrateLegacyDraft = migrateLegacyDraft()) != null) {
            return strMigrateLegacyDraft;
        }
        String string = this.prefs.getString(FGI.A0M(TEXT_PREFIX, str), null);
        if (string == null) {
            return "";
        }
        SecretKey secretKeyStoredDataKey = storedDataKey();
        if (secretKeyStoredDataKey == null) {
            return null;
        }
        return open(secretKeyStoredDataKey, str, string);
    }

    private final byte[] aad(String str) {
        return C3cG.A1S(FGI.A0U(this.vmId, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str));
    }

    private final SecretKey cachedDataKey() {
        String string = this.prefs.getString(DATA_KEY_KEY, null);
        if (string != null) {
            return dataKeys.get(string);
        }
        return null;
    }

    private final SecretKey createDataKey() throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        AtomicInteger atomicInteger = keyGeneration;
        int i = atomicInteger.get();
        byte[] bArr = new byte[32];
        random.nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, keystoreKey());
        byte[] iv = cipher.getIV();
        C7384Etj.A0U(iv);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        C7384Etj.A0U(bArrDoFinal);
        String strEncodeToString = Base64.encodeToString(AbstractC0903AHf.A07(iv, bArrDoFinal), 2);
        if (atomicInteger.get() != i) {
            return null;
        }
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.AYr(DATA_KEY_KEY, strEncodeToString);
        bzKA9q.A0B(0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ConfidentialVmPinVerifierCrypto.AES);
        dataKeys.put(strEncodeToString, secretKeySpec);
        return secretKeySpec;
    }

    private final SecretKey dataKey() {
        SecretKey secretKeyStoredDataKey;
        Object objA0s;
        synchronized (dataKeys) {
            secretKeyStoredDataKey = storedDataKey();
            if (secretKeyStoredDataKey == null) {
                try {
                    objA0s = (this.prefs.contains(DATA_KEY_KEY) && hasKeystoreKey()) ? null : createDataKey();
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    CFK.A0A(TAG, "Keystore unusable; composer drafts are not saved", thA00);
                }
                secretKeyStoredDataKey = (SecretKey) (objA0s instanceof C10571Hud ? null : objA0s);
            }
        }
        return secretKeyStoredDataKey;
    }

    private final byte[] decrypt(SecretKey secretKey, byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKey, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr, 12, bArr.length - 12);
        C7384Etj.A0U(bArrDoFinal);
        return bArrDoFinal;
    }

    private final String dictatedKey(String str) {
        return FGI.A0M(DICTATED_PREFIX, str);
    }

    private final void finish(C7bS c7bS, boolean z) {
        if (z) {
            ((BzK) c7bS).A0B(0);
        } else {
            c7bS.apply();
        }
    }

    private final boolean hasKeystoreKey() {
        return Companion.keyStore().containsAlias(KEY_ALIAS);
    }

    private final SecretKey keystoreKey() throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        Key key = Companion.keyStore().getKey(KEY_ALIAS, null);
        if ((key instanceof SecretKey) && (secretKey = (SecretKey) key) != null) {
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES, "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(KEY_ALIAS, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        C7384Etj.A0U(secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    private final String migrateLegacyDraft() {
        Object objA0s;
        String string = this.prefs.getString(LEGACY_TEXT_KEY, null);
        if (string == null) {
            return null;
        }
        try {
            objA0s = Boolean.valueOf(this.prefs.getBoolean(LEGACY_DICTATED_KEY, false));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = false;
        }
        boolean zA1X = AnonymousClass001.A1X(objA0s);
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.Aae(LEGACY_TEXT_KEY);
        bzKA9q.Aae(LEGACY_DICTATED_KEY);
        SecretKey secretKeyDataKey = dataKey();
        if (secretKeyDataKey != null) {
            bzKA9q.AYr(FGI.A0M(TEXT_PREFIX, "primary_session_id"), seal(secretKeyDataKey, "primary_session_id", string));
            bzKA9q.A0A(FGI.A0M(DICTATED_PREFIX, "primary_session_id"), zA1X);
        }
        bzKA9q.A0B(0);
        return string;
    }

    private final C7bS removeDraft(C7bS c7bS, String str) {
        c7bS.Aae(FGI.A0M(TEXT_PREFIX, str));
        c7bS.Aae(FGI.A0M(DICTATED_PREFIX, str));
        c7bS.Aae(FGI.A0M(SAVED_AT_PREFIX, str));
        return c7bS;
    }

    private final SecretKey requireKeystoreKey() throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        SecretKey secretKey;
        Key key = Companion.keyStore().getKey(KEY_ALIAS, null);
        if (!(key instanceof SecretKey) || (secretKey = (SecretKey) key) == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        return secretKey;
    }

    private final String savedAtKey(String str) {
        return FGI.A0M(SAVED_AT_PREFIX, str);
    }

    private final String seal(SecretKey secretKey, String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = new byte[12];
        random.nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey, new GCMParameterSpec(128, bArr));
        cipher.updateAAD(aad(str));
        byte[] bArrDoFinal = cipher.doFinal(C3cG.A1S(str2));
        C7384Etj.A0U(bArrDoFinal);
        String strEncodeToString = Base64.encodeToString(AbstractC0903AHf.A07(bArr, bArrDoFinal), 2);
        C7384Etj.A0U(strEncodeToString);
        return strEncodeToString;
    }

    private final SecretKey storedDataKey() {
        Object objA0s;
        ConcurrentHashMap<String, SecretKey> concurrentHashMap = dataKeys;
        synchronized (concurrentHashMap) {
            Companion.deletePendingAlias();
            SecretKeySpec secretKeySpec = null;
            String string = this.prefs.getString(DATA_KEY_KEY, null);
            if (string != null) {
                SecretKey secretKey = concurrentHashMap.get(string);
                if (secretKey != null) {
                    return secretKey;
                }
                AtomicInteger atomicInteger = keyGeneration;
                int i = atomicInteger.get();
                try {
                    SecretKey secretKeyRequireKeystoreKey = requireKeystoreKey();
                    byte[] bArrDecode = Base64.decode(string, 2);
                    C7384Etj.A0U(bArrDecode);
                    objA0s = new SecretKeySpec(decrypt(secretKeyRequireKeystoreKey, bArrDecode, null), ConfidentialVmPinVerifierCrypto.AES);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    CFK.A0A(TAG, "Could not unwrap the composer draft key", thA00);
                    if (thA00 instanceof AEADBadTagException) {
                        BzK bzKA9q = this.prefs.A9q();
                        bzKA9q.Aae(DATA_KEY_KEY);
                        bzKA9q.A0B(0);
                    }
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                SecretKeySpec secretKeySpec2 = (SecretKeySpec) objA0s;
                if (secretKeySpec2 != null) {
                    if (atomicInteger.get() != i) {
                        secretKeySpec2 = null;
                    }
                    if (secretKeySpec2 != null) {
                        concurrentHashMap.put(string, secretKeySpec2);
                        secretKeySpec = secretKeySpec2;
                    }
                }
            }
            return secretKeySpec;
        }
    }

    private final String textKey(String str) {
        return FGI.A0M(TEXT_PREFIX, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.AbstractMap, java.util.HashMap] */
    public final void prewarmIfDraftStored() {
        if (!this.prefs.contains(LEGACY_TEXT_KEY)) {
            Set<String> setKeySet = this.prefs.ACL().keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                return;
            }
            for (String str : setKeySet) {
                C7384Etj.A0X(str);
                if (str.startsWith(TEXT_PREFIX)) {
                }
            }
            return;
        }
        storedDataKey();
    }

    public final void prewarm() {
        dataKey();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.AbstractMap, java.util.HashMap] */
    public final void save(String str, String str2, boolean z, boolean z2) {
        AnonymousClass003.A0u(str, str2);
        SecretKey secretKeyCachedDataKey = cachedDataKey();
        if (secretKeyCachedDataKey == null) {
            clear(str, z2);
            return;
        }
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.AYr(FGI.A0M(TEXT_PREFIX, str), seal(secretKeyCachedDataKey, str, str2));
        bzKA9q.A0A(FGI.A0M(DICTATED_PREFIX, str), z);
        if (!str.equals("primary_session_id")) {
            bzKA9q.AYp(FGI.A0M(SAVED_AT_PREFIX, str), System.currentTimeMillis());
            ?? ACL = this.prefs.ACL();
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0i = C3cG.A0i(ACL);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                String strA0t = C60O.A0t(entryA0l);
                C7384Etj.A0X(strA0t);
                if (strA0t.startsWith(SAVED_AT_PREFIX) && !strA0t.equals(FGI.A0M(SAVED_AT_PREFIX, str))) {
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            Iterator it = AbstractC0878AGe.A0Z(AbstractC0878AGe.A0c(linkedHashMapA0j.entrySet(), new Comparator() { // from class: com.facebook.aura.conversation.viewmodel.HatchComposerDraftStore$save$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Number number;
                    Object value = ((Map.Entry) t2).getValue();
                    long jLongValue = 0;
                    Long lValueOf = Long.valueOf(C60P.A01(value instanceof Long ? (Number) value : null));
                    Object value2 = ((Map.Entry) t).getValue();
                    if ((value2 instanceof Long) && (number = (Number) value2) != null) {
                        jLongValue = number.longValue();
                    }
                    return lValueOf.compareTo(Long.valueOf(jLongValue));
                }
            }), 19).iterator();
            while (it.hasNext()) {
                Object key = C3cH.A0l(it).getKey();
                C7384Etj.A0U(key);
                removeDraft(bzKA9q, C7BY.A0K(SAVED_AT_PREFIX, (String) key));
            }
        }
        finish(bzKA9q, z2);
    }

    public /* synthetic */ HatchComposerDraftStore(C4oT c4oT, String str, C06H c06h) {
        this(c4oT, str);
    }

    public HatchComposerDraftStore(C4oT c4oT, String str) {
        this.prefs = c4oT;
        this.vmId = str;
    }
}
