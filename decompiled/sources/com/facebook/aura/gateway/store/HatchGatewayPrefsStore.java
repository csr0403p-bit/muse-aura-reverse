package com.facebook.aura.gateway.store;

import X.A3q;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass801;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.CFK;
import X.HnJ;
import X.HwV;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.common.restart.HatchAppRestarter;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.VmAuthTokenKt;
import java.io.File;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class HatchGatewayPrefsStore implements InterfaceC7549F2g {
    public static final String AVATAR_DIR = "avatar_cache";
    public static final Companion Companion = new Companion();
    public static final String KEY_AI_IDENTITY_NAME = "lobster_ai_identity_name";
    public static final String KEY_AI_IDENTITY_TAGLINE = "lobster_ai_identity_tagline";
    public static final String KEY_AVAILABLE_VMS = "lobster_available_vms";
    public static final String KEY_CACHED_VM_LIST_JSON = "lobster_cached_vm_list_json";
    public static final String KEY_DISMISSED_BROWSER_TASK_IDS = "lobster_dismissed_browser_task_ids";
    public static final String KEY_MAX_RETRY_COUNT = "max_retry_count";
    public static final String KEY_PENDING_PIN_UPDATE_JSON = "hatch_pending_pin_update_json";
    public static final String KEY_PHONE_CONTACTS_SHARING = "lobster_phone_contacts_sharing";
    public static final String KEY_PHONE_NOTIFICATIONS_ACCESS_BLOCKED_APPS = "lobster_phone_notifications_access_blocked_apps";
    public static final String KEY_PHONE_NOTIFICATIONS_ACCESS_MODE = "lobster_phone_notifications_access_mode";
    public static final String KEY_PIN_STATE_JSON = "hatch_pin_state_json";
    public static final String KEY_REGION_HINT = "region_hint";
    public static final String KEY_RETRY_AFTER_MS = "retry_after_ms";
    public static final String KEY_RUN_IN_BACKGROUND = "lobster_run_in_background_enabled";
    public static final String KEY_STARRED_VM_URL = "lobster_starred_vm_url";
    public static final String KEY_VM_CONFIDENTIALITY = "confidentiality";
    public static final String KEY_VM_SELECTION_MIGRATION_STAMP_MS = "vm_selection_migration_stamp_ms";
    public static final String PREF_CHAT_COLOR_SCHEME = "chat_color_scheme";
    public static final String PREF_CHAT_THEMES_CACHE = "chat_themes_cache";
    public static final String TAG = "HatchGatewayPrefsStore";
    public final BLG<String> _hatcheryVmIdFlow;
    public final BLG<HatchVmConfidentiality> _vmConfidentialityFlow;
    public final C1BN<String> hatcheryVmIdFlow;
    public volatile HwV<String, String, String> inventoryVmIdLookup;
    public String latestMessageId;
    public final AbstractC3358CGz userSession;
    public String viewportMessageId;
    public final C1BN<HatchVmConfidentiality> vmConfidentialityFlow;

    private final String inventoryVmIdFor(String str) {
        String str2;
        String str3 = null;
        if (str != null && str.length() != 0) {
            String cachedVmListJson = getCachedVmListJson();
            HwV<String, String, String> hwV = this.inventoryVmIdLookup;
            if (hwV != null) {
                String str4 = hwV.first;
                String str5 = hwV.second;
                String str6 = hwV.third;
                if (C7384Etj.areEqual(str4, cachedVmListJson) && C7384Etj.areEqual(str5, str)) {
                    return str6;
                }
            }
            VmEntryV2Json vmEntryV2JsonCachedVmFor = VmEntryV2JsonKt.cachedVmFor(cachedVmListJson, str);
            if (vmEntryV2JsonCachedVmFor != null && (str2 = vmEntryV2JsonCachedVmFor.vm_id) != null && str2.length() > 0) {
                str3 = str2;
            }
            this.inventoryVmIdLookup = new HwV<>(cachedVmListJson, str, str3);
        }
        return str3;
    }

    private final void runVmSwitchCleanup(VmSwitchCleanupType vmSwitchCleanupType) {
        int[] iArr = {0, 1, 2};
        int i = 0;
        do {
            AnonymousClass801.A0d(iArr[i], this.userSession, vmSwitchCleanupType);
            i++;
        } while (i < 3);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.latestMessageId = null;
        this.viewportMessageId = null;
        AnonymousClass001.A1E(this._vmConfidentialityFlow, null, HatchVmConfidentiality.UNKNOWN);
        setPinStateJson(null);
        setPendingPinUpdateJson(null);
    }

    public final void clearVMForFullReset(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        updateVM("", context, str, VmSwitchCleanupType.FULL_DATA_RESET, null);
    }

    public final boolean commitGatewayUrl(String str) {
        C7384Etj.A0Y(str, 0);
        String gatewayUrl = getGatewayUrl();
        String pinStateJson = getPinStateJson();
        String pendingPinUpdateJson = getPendingPinUpdateJson();
        boolean zAreEqual = C7384Etj.areEqual(HatcheryVMIdUtilsKt.extractHatcheryVMId(str), HatcheryVMIdUtilsKt.extractHatcheryVMId(gatewayUrl));
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(VmAuthTokenKt.KEY_GATEWAY_URL, str);
        if (!zAreEqual) {
            bzKA9q.Aae(KEY_PIN_STATE_JSON);
            bzKA9q.Aae(KEY_PENDING_PIN_UPDATE_JSON);
        }
        if (bzKA9q.commit()) {
            if (zAreEqual) {
                return true;
            }
            reseedVmFlows();
            return true;
        }
        BzK bzKA9q2 = getPrefs().A9q();
        bzKA9q2.AYr(VmAuthTokenKt.KEY_GATEWAY_URL, gatewayUrl);
        if (pinStateJson != null) {
            bzKA9q2.AYr(KEY_PIN_STATE_JSON, pinStateJson);
        }
        if (pendingPinUpdateJson != null) {
            bzKA9q2.AYr(KEY_PENDING_PIN_UPDATE_JSON, pendingPinUpdateJson);
        }
        bzKA9q2.commit();
        return false;
    }

    public final String gatewayRegionHint(String str) {
        if (str == null) {
            return null;
        }
        return AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.GATEWAY_CONNECTION).getString(KEY_REGION_HINT, null);
    }

    public final void setAvailableVms(List<String> list) {
        C7384Etj.A0Y(list, 0);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_AVAILABLE_VMS, C3cH.A0e(",", list));
        bzKA9q.apply();
    }

    public final void setDismissedBrowserTaskIds(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A09(KEY_DISMISSED_BROWSER_TASK_IDS, set);
        bzKA9q.apply();
    }

    public final void setGatewayUrl(String str) {
        C7384Etj.A0Y(str, 0);
        boolean zAreEqual = C7384Etj.areEqual(HatcheryVMIdUtilsKt.extractHatcheryVMId(str), C3cG.A0a(this));
        if (!zAreEqual) {
            setPinStateJson(null);
            setPendingPinUpdateJson(null);
        }
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(VmAuthTokenKt.KEY_GATEWAY_URL, str);
        bzKA9q.apply();
        if (zAreEqual) {
            return;
        }
        reseedVmFlows();
    }

    public final void setPhoneNotificationsAccessBlockedApps(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A09(KEY_PHONE_NOTIFICATIONS_ACCESS_BLOCKED_APPS, set);
        bzKA9q.apply();
    }

    public final void setPhoneNotificationsAccessMode(PhoneNotificationsAccessMode phoneNotificationsAccessMode) {
        C7384Etj.A0Y(phoneNotificationsAccessMode, 0);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_PHONE_NOTIFICATIONS_ACCESS_MODE, phoneNotificationsAccessMode.name());
        bzKA9q.apply();
    }

    public final void setStarredVmUrl(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_STARRED_VM_URL, str);
        bzKA9q.apply();
    }

    public final void setVM(String str, Context context, String str2, Intent intent) {
        AnonymousClass005.A0x(str, context, str2);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Use clearVMForFullReset to clear the selected VM");
        }
        updateVM(str, context, str2, VmSwitchCleanupType.SAME_ACCOUNT_SWITCH, intent);
    }

    public final void setVmConfidentiality(HatchVmConfidentiality hatchVmConfidentiality) {
        C7384Etj.A0Y(hatchVmConfidentiality, 0);
        setVmConfidentiality(C3cG.A0a(this), hatchVmConfidentiality);
    }

    public static /* synthetic */ void clearIdentity$default(HatchGatewayPrefsStore hatchGatewayPrefsStore, String str, Context context, Intent intent, int i, Object obj) {
        if ((i & 4) != 0) {
            intent = null;
        }
        hatchGatewayPrefsStore.clearIdentity(str, context, intent);
    }

    public static /* synthetic */ void clearVMForFullReset$default(HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "Reset Hatch";
        }
        hatchGatewayPrefsStore.clearVMForFullReset(context, str);
    }

    private final C4oT getPrefs() {
        return HatchPrefsStore.INSTANCE.userPrefs(this.userSession);
    }

    private final void reseedVmFlows() {
        this._vmConfidentialityFlow.Af8(vmConfidentialityFor(C3cG.A0a(this)));
        this._hatcheryVmIdFlow.Af8(C3cG.A0a(this));
    }

    public static /* synthetic */ void setVM$default(HatchGatewayPrefsStore hatchGatewayPrefsStore, String str, Context context, String str2, Intent intent, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "Assistant Selection Changed";
        }
        if ((i & 8) != 0) {
            intent = null;
        }
        hatchGatewayPrefsStore.setVM(str, context, str2, intent);
    }

    public static /* synthetic */ void updateVM$default(HatchGatewayPrefsStore hatchGatewayPrefsStore, String str, Context context, String str2, VmSwitchCleanupType vmSwitchCleanupType, Intent intent, int i, Object obj) {
        if ((i & 16) != 0) {
            intent = null;
        }
        hatchGatewayPrefsStore.updateVM(str, context, str2, vmSwitchCleanupType, intent);
    }

    private final C4oT vmConfidentialityPrefs(String str) {
        return AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.CONFIDENTIALITY);
    }

    public final void clearForInProcessVmSwitch() {
        runVmSwitchCleanup(VmSwitchCleanupType.SAME_ACCOUNT_SWITCH);
        clearLocalData();
    }

    public final C1BN<String> getHatcheryVmIdFlow() {
        return this.hatcheryVmIdFlow;
    }

    public final String getLatestMessageId() {
        return this.latestMessageId;
    }

    public final String getViewportMessageId() {
        return this.viewportMessageId;
    }

    public final C1BN<HatchVmConfidentiality> getVmConfidentialityFlow() {
        return this.vmConfidentialityFlow;
    }

    public final Integer getVmMaxRetryCount() {
        int i = AuraVMPrefs.INSTANCE.get(HatcheryVMIdUtilsKt.extractHatcheryVMId(getGatewayUrl()), AuraVMPrefStore.GATEWAY_CONNECTION).getInt(KEY_MAX_RETRY_COUNT, 0);
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            return null;
        }
        return numValueOf;
    }

    public final Long getVmRetryAfterMs() {
        long j = AuraVMPrefs.INSTANCE.get(HatcheryVMIdUtilsKt.extractHatcheryVMId(getGatewayUrl()), AuraVMPrefStore.GATEWAY_CONNECTION).getLong(KEY_RETRY_AFTER_MS, -1L);
        Long lValueOf = Long.valueOf(j);
        if (j < 0) {
            return null;
        }
        return lValueOf;
    }

    public final boolean isHandshakeProvenCvm(String str) {
        return HatchCvmHandshakeProofs.INSTANCE.isProven(str) || HatchCvmHandshakeProofs.INSTANCE.isProven(inventoryVmIdFor(str));
    }

    public final void recordHandshakeProvenCvm(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        HatchCvmHandshakeProofs.INSTANCE.record(str, inventoryVmIdFor(str));
    }

    public final void setGatewayRegionHint(String str, String str2) {
        if (str != null) {
            C4oT c4oT = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.GATEWAY_CONNECTION);
            if (C7384Etj.areEqual(c4oT.getString(KEY_REGION_HINT, null), str2)) {
                return;
            }
            BzK bzKA9q = c4oT.A9q();
            if (str2 == null) {
                bzKA9q.Aae(KEY_REGION_HINT);
            } else {
                bzKA9q.AYr(KEY_REGION_HINT, str2);
            }
            bzKA9q.apply();
        }
    }

    public final void setLatestMessageId(String str) {
        this.latestMessageId = str;
    }

    public final void setViewportMessageId(String str) {
        this.viewportMessageId = str;
    }

    public final void setVmMaxRetryCount(String str, Integer num) {
        int iIntValue;
        if (str != null) {
            BzK bzKA9q = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.GATEWAY_CONNECTION).A9q();
            if (num == null || (iIntValue = num.intValue()) <= 0) {
                iIntValue = 0;
            }
            bzKA9q.AYo(KEY_MAX_RETRY_COUNT, iIntValue);
            bzKA9q.apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVmRetryAfterMs(java.lang.String r5, java.lang.Long r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L22
            com.facebook.aura.common.prefs.AuraVMPrefs r1 = com.facebook.aura.common.prefs.AuraVMPrefs.INSTANCE
            com.facebook.aura.common.prefs.AuraVMPrefStore r0 = com.facebook.aura.common.prefs.AuraVMPrefStore.GATEWAY_CONNECTION
            X.4oT r0 = r1.get(r5, r0)
            X.BzK r5 = r0.A9q()
            if (r6 == 0) goto L23
            long r3 = r6.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L23
        L1a:
            java.lang.String r0 = "retry_after_ms"
            r5.AYp(r0, r3)
            r5.apply()
        L22:
            return
        L23:
            r3 = -1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.store.HatchGatewayPrefsStore.setVmRetryAfterMs(java.lang.String, java.lang.Long):void");
    }

    public final class Companion {
        public final HatchGatewayPrefsStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGatewayPrefsStore) abstractC3358CGz.A03(HatchGatewayPrefsStore.class, new HatchGatewayPrefsStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchGatewayPrefsStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(vmConfidentialityFor(C3cG.A0a(this)));
        this._vmConfidentialityFlow = c9286GCnA01;
        this.vmConfidentialityFlow = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(C3cG.A0a(this));
        this._hatcheryVmIdFlow = c9286GCnA012;
        this.hatcheryVmIdFlow = C3cG.A11(c9286GCnA012);
    }

    private final void updateVM(String str, Context context, String str2, VmSwitchCleanupType vmSwitchCleanupType, Intent intent) {
        runVmSwitchCleanup(vmSwitchCleanupType);
        setGatewayUrl(str);
        clearIdentity(str2, context, intent);
    }

    public final void clearIdentity(String str, Context context, Intent intent) {
        boolean zA1a = AnonymousClass002.A1a(str, context);
        clearLocalData();
        HatchAppRestarter.INSTANCE.relaunchApp(str, context, intent, zA1a);
    }

    public final void clearLocalData() {
        File[] fileArrListFiles;
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.Aae(KEY_AI_IDENTITY_NAME);
        bzKA9q.Aae(KEY_AI_IDENTITY_TAGLINE);
        bzKA9q.commit();
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null || (fileArrListFiles = C3cG.A0O(context.getFilesDir(), AVATAR_DIR).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }

    public final List<String> getAvailableVms() {
        String string = getPrefs().getString(KEY_AVAILABLE_VMS, "");
        String str = string != null ? string : "";
        return str.length() == 0 ? C0881AGi.A00 : C7BY.A0i(str, new String[]{","}, 0);
    }

    public final String getCachedAiIdentityName() {
        return C4oT.A00(getPrefs(), KEY_AI_IDENTITY_NAME);
    }

    public final String getCachedAiIdentityTagline() {
        return C4oT.A00(getPrefs(), KEY_AI_IDENTITY_TAGLINE);
    }

    public final String getCachedVmListJson() {
        return getPrefs().getString(KEY_CACHED_VM_LIST_JSON, null);
    }

    public final Set<String> getDismissedBrowserTaskIds() {
        C4oT prefs = getPrefs();
        A3q a3q = A3q.A00;
        Set<String> stringSet = prefs.getStringSet(KEY_DISMISSED_BROWSER_TASK_IDS, a3q);
        return stringSet == null ? a3q : stringSet;
    }

    public final String getGatewayUrl() {
        String string = getPrefs().getString(VmAuthTokenKt.KEY_GATEWAY_URL, "");
        return string == null ? "" : string;
    }

    public final String getHatcheryVMId() {
        return C3cG.A0a(this);
    }

    public final String getPendingPinUpdateJson() {
        return C4oT.A00(getPrefs(), KEY_PENDING_PIN_UPDATE_JSON);
    }

    public final boolean getPhoneContactsSharingEnabled() {
        return getPrefs().getBoolean(KEY_PHONE_CONTACTS_SHARING, false);
    }

    public final Set<String> getPhoneNotificationsAccessBlockedApps() {
        C4oT prefs = getPrefs();
        A3q a3q = A3q.A00;
        Set<String> stringSet = prefs.getStringSet(KEY_PHONE_NOTIFICATIONS_ACCESS_BLOCKED_APPS, a3q);
        return stringSet == null ? a3q : stringSet;
    }

    public final PhoneNotificationsAccessMode getPhoneNotificationsAccessMode() {
        String strA00 = C4oT.A00(getPrefs(), KEY_PHONE_NOTIFICATIONS_ACCESS_MODE);
        try {
            return strA00 != null ? PhoneNotificationsAccessMode.valueOf(strA00) : PhoneNotificationsAccessMode.ALL;
        } catch (IllegalArgumentException unused) {
            return PhoneNotificationsAccessMode.ALL;
        }
    }

    public final String getPinStateJson() {
        return C4oT.A00(getPrefs(), KEY_PIN_STATE_JSON);
    }

    public final boolean getRunInBackgroundEnabled() {
        return getPrefs().getBoolean(KEY_RUN_IN_BACKGROUND, false);
    }

    public final HatchlingVmType getSelectedServerVmType() {
        return VmEntryV2JsonKt.cachedVmTypeFor(getCachedVmListJson(), HatcheryVMIdUtilsKt.extractHatcheryVMId(getGatewayUrl()));
    }

    public final String getStarredVmUrl() {
        String string = getPrefs().getString(KEY_STARRED_VM_URL, "");
        return string == null ? "" : string;
    }

    public final String getVmAuthToken() {
        return VmAuthTokenKt.getVmAuthToken(C3cG.A0a(this));
    }

    public final HatchVmConfidentiality getVmConfidentiality() {
        return vmConfidentialityFor(HatcheryVMIdUtilsKt.extractHatcheryVMId(getGatewayUrl()));
    }

    public final long getVmSelectionMigrationStampMs() {
        return getPrefs().getLong(KEY_VM_SELECTION_MIGRATION_STAMP_MS, 0L);
    }

    public final void setCachedAiIdentityName(String str) {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_AI_IDENTITY_NAME, str);
        bzKA9q.apply();
    }

    public final void setCachedAiIdentityTagline(String str) {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYr(KEY_AI_IDENTITY_TAGLINE, str);
        bzKA9q.apply();
    }

    public final void setCachedVmListJson(String str) {
        BzK bzKA9q = getPrefs().A9q();
        if (str == null) {
            bzKA9q.Aae(KEY_CACHED_VM_LIST_JSON);
        } else {
            bzKA9q.AYr(KEY_CACHED_VM_LIST_JSON, str);
        }
        bzKA9q.apply();
    }

    public final void setPendingPinUpdateJson(String str) {
        BzK bzKA9q = getPrefs().A9q();
        if (str == null) {
            bzKA9q.Aae(KEY_PENDING_PIN_UPDATE_JSON);
        } else {
            bzKA9q.AYr(KEY_PENDING_PIN_UPDATE_JSON, str);
        }
        bzKA9q.apply();
    }

    public final void setPhoneContactsSharingEnabled(boolean z) {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A0A(KEY_PHONE_CONTACTS_SHARING, z);
        bzKA9q.apply();
    }

    public final void setPinStateJson(String str) {
        BzK bzKA9q = getPrefs().A9q();
        if (str == null) {
            bzKA9q.Aae(KEY_PIN_STATE_JSON);
        } else {
            bzKA9q.AYr(KEY_PIN_STATE_JSON, str);
        }
        bzKA9q.apply();
    }

    public final void setRunInBackgroundEnabled(boolean z) {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.A0A(KEY_RUN_IN_BACKGROUND, z);
        bzKA9q.apply();
    }

    public final void setVmSelectionMigrationStampMs(long j) {
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.AYp(KEY_VM_SELECTION_MIGRATION_STAMP_MS, j);
        bzKA9q.apply();
    }

    public final HatchVmConfidentiality vmConfidentialityFor(String str) {
        return isHandshakeProvenCvm(str) ? HatchVmConfidentiality.CONFIDENTIAL : HatchGatewayPrefsStoreKt.parseHatchVmConfidentiality(AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.CONFIDENTIALITY).getString(KEY_VM_CONFIDENTIALITY, null));
    }

    public /* synthetic */ HatchGatewayPrefsStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void setVmConfidentiality(String str, HatchVmConfidentiality hatchVmConfidentiality) {
        C7384Etj.A0Y(hatchVmConfidentiality, 1);
        if (hatchVmConfidentiality != HatchVmConfidentiality.CONFIDENTIAL && isHandshakeProvenCvm(str)) {
            CFK.A0H(TAG, "Keeping a handshake-proven CVM over a %s classification", hatchVmConfidentiality.name());
            hatchVmConfidentiality = HatchVmConfidentiality.CONFIDENTIAL;
        }
        BzK bzKA9q = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.CONFIDENTIALITY).A9q();
        if (hatchVmConfidentiality == HatchVmConfidentiality.UNKNOWN) {
            bzKA9q.Aae(KEY_VM_CONFIDENTIALITY);
        } else {
            bzKA9q.AYr(KEY_VM_CONFIDENTIALITY, hatchVmConfidentiality.name());
        }
        bzKA9q.apply();
        if (C7384Etj.areEqual(str, C3cG.A0a(this))) {
            AnonymousClass002.A1I(this._vmConfidentialityFlow, hatchVmConfidentiality);
        }
    }
}
