package com.facebook.aura.common.prefs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.viewmodel.HatchComposerDraftStore;
import com.facebook.aura.feed.view.FeedTabScreenKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AuraVMPrefStore implements AuraVMPrefStoreKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraVMPrefStore[] $VALUES;
    public static final AuraVMPrefStore APPEARANCE;
    public static final AuraVMPrefStore AUTH;
    public static final AuraVMPrefStore COMPOSER_DRAFT;
    public static final AuraVMPrefStore CONFIDENTIALITY;
    public static final AuraVMPrefStore CVM_CHIP_CLAIM;
    public static final AuraVMPrefStore CVM_PROVISIONING_CHIPS;
    public static final AuraVMPrefStore FEED_INSTRUCTIONS_CARD;
    public static final AuraVMPrefStore GATEWAY_CONNECTION;
    public static final AuraVMPrefStore GRADUATION;
    public static final AuraVMPrefStore INTERNAL_STATUS;
    public static final AuraVMPrefStore NODE_HITL_PERMISSIONS;
    public static final AuraVMPrefStore NOTARY_TOKENS;
    public static final AuraVMPrefStore ONBOARDING;
    public static final AuraVMPrefStore ONBOARDING_STARTUP;
    public static final AuraVMPrefStore ONBOARDING_VARIANT;
    public static final AuraVMPrefStore PAIRS_ENTRY_STATE;
    public static final AuraVMPrefStore PAIRS_MINTED_INVITES;
    public static final AuraVMPrefStore PAIRS_PENDING_LEVELS;
    public static final AuraVMPrefStore PAIRS_PENDING_SHARES;
    public static final AuraVMPrefStore PERMISSION_DEFAULTS;
    public static final AuraVMPrefStore PINNED_ITEMS;
    public static final AuraVMPrefStore PUSH_HISTORY_PREFETCH;
    public final String key;

    static {
        AuraVMPrefStore auraVMPrefStore = new AuraVMPrefStore("APPEARANCE", 0, "hatch_appearance");
        APPEARANCE = auraVMPrefStore;
        AuraVMPrefStore auraVMPrefStore2 = new AuraVMPrefStore("AUTH", 1, "vm_auth");
        AUTH = auraVMPrefStore2;
        AuraVMPrefStore auraVMPrefStore3 = new AuraVMPrefStore("COMPOSER_DRAFT", 2, HatchComposerDraftStore.KEY_ALIAS);
        COMPOSER_DRAFT = auraVMPrefStore3;
        AuraVMPrefStore auraVMPrefStore4 = new AuraVMPrefStore("CONFIDENTIALITY", 3, "vm_confidentiality");
        CONFIDENTIALITY = auraVMPrefStore4;
        AuraVMPrefStore auraVMPrefStore5 = new AuraVMPrefStore("CVM_CHIP_CLAIM", 4, "cvm_chip_claim");
        CVM_CHIP_CLAIM = auraVMPrefStore5;
        AuraVMPrefStore auraVMPrefStore6 = new AuraVMPrefStore("CVM_PROVISIONING_CHIPS", 5, "cvm_provisioning_chips");
        CVM_PROVISIONING_CHIPS = auraVMPrefStore6;
        AuraVMPrefStore auraVMPrefStore7 = new AuraVMPrefStore("FEED_INSTRUCTIONS_CARD", 6, FeedTabScreenKt.FEED_INSTRUCTIONS_CARD_ID);
        FEED_INSTRUCTIONS_CARD = auraVMPrefStore7;
        AuraVMPrefStore auraVMPrefStore8 = new AuraVMPrefStore("GATEWAY_CONNECTION", 7, "gateway_connection");
        GATEWAY_CONNECTION = auraVMPrefStore8;
        AuraVMPrefStore auraVMPrefStore9 = new AuraVMPrefStore("GRADUATION", 8, "graduation");
        GRADUATION = auraVMPrefStore9;
        AuraVMPrefStore auraVMPrefStore10 = new AuraVMPrefStore("INTERNAL_STATUS", 9, "internal_status");
        INTERNAL_STATUS = auraVMPrefStore10;
        AuraVMPrefStore auraVMPrefStore11 = new AuraVMPrefStore("NODE_HITL_PERMISSIONS", 10, "node_hitl_permissions");
        NODE_HITL_PERMISSIONS = auraVMPrefStore11;
        AuraVMPrefStore auraVMPrefStore12 = new AuraVMPrefStore("NOTARY_TOKENS", 11, "vm_notary");
        NOTARY_TOKENS = auraVMPrefStore12;
        AuraVMPrefStore auraVMPrefStore13 = new AuraVMPrefStore("ONBOARDING", 12, "hatch_onboarding_v1");
        ONBOARDING = auraVMPrefStore13;
        AuraVMPrefStore auraVMPrefStore14 = new AuraVMPrefStore("ONBOARDING_STARTUP", 13, "hatch_onboarding_startup");
        ONBOARDING_STARTUP = auraVMPrefStore14;
        AuraVMPrefStore auraVMPrefStore15 = new AuraVMPrefStore("ONBOARDING_VARIANT", 14, "hatch_onboarding_variant_v1");
        ONBOARDING_VARIANT = auraVMPrefStore15;
        AuraVMPrefStore auraVMPrefStore16 = new AuraVMPrefStore("PAIRS_ENTRY_STATE", 15, "pairs_entry_state");
        PAIRS_ENTRY_STATE = auraVMPrefStore16;
        AuraVMPrefStore auraVMPrefStore17 = new AuraVMPrefStore("PAIRS_MINTED_INVITES", 16, "pairs_minted_invites");
        PAIRS_MINTED_INVITES = auraVMPrefStore17;
        AuraVMPrefStore auraVMPrefStore18 = new AuraVMPrefStore("PAIRS_PENDING_LEVELS", 17, "pairs_pending_levels");
        PAIRS_PENDING_LEVELS = auraVMPrefStore18;
        AuraVMPrefStore auraVMPrefStore19 = new AuraVMPrefStore("PAIRS_PENDING_SHARES", 18, "pairs_pending_shares");
        PAIRS_PENDING_SHARES = auraVMPrefStore19;
        AuraVMPrefStore auraVMPrefStore20 = new AuraVMPrefStore("PERMISSION_DEFAULTS", 19, "permission_defaults");
        PERMISSION_DEFAULTS = auraVMPrefStore20;
        AuraVMPrefStore auraVMPrefStore21 = new AuraVMPrefStore("PINNED_ITEMS", 20, "hatch_pinned_items");
        PINNED_ITEMS = auraVMPrefStore21;
        AuraVMPrefStore auraVMPrefStore22 = new AuraVMPrefStore("PUSH_HISTORY_PREFETCH", 21, "push_history_prefetch");
        PUSH_HISTORY_PREFETCH = auraVMPrefStore22;
        AuraVMPrefStore[] auraVMPrefStoreArr = {auraVMPrefStore, auraVMPrefStore2, auraVMPrefStore3, auraVMPrefStore4, auraVMPrefStore5, auraVMPrefStore6, auraVMPrefStore7, auraVMPrefStore8, auraVMPrefStore9, auraVMPrefStore10, auraVMPrefStore11, auraVMPrefStore12, auraVMPrefStore13, auraVMPrefStore14, auraVMPrefStore15, auraVMPrefStore16, auraVMPrefStore17, auraVMPrefStore18, auraVMPrefStore19, auraVMPrefStore20, auraVMPrefStore21, auraVMPrefStore22};
        $VALUES = auraVMPrefStoreArr;
        $ENTRIES = C3cG.A0w(auraVMPrefStoreArr);
    }

    public static Ey9<AuraVMPrefStore> getEntries() {
        return $ENTRIES;
    }

    public static AuraVMPrefStore valueOf(String str) {
        return (AuraVMPrefStore) Enum.valueOf(AuraVMPrefStore.class, str);
    }

    public static AuraVMPrefStore[] values() {
        return (AuraVMPrefStore[]) $VALUES.clone();
    }

    @Override // com.facebook.aura.common.prefs.AuraVMPrefStoreKey
    public String getKey() {
        return this.key;
    }

    public AuraVMPrefStore(String str, int i, String str2) {
        this.key = str2;
    }
}
