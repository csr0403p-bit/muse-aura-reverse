package com.facebook.aura.common.prefs;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass007;
import X.BLG;
import X.BzK;
import X.C1BN;
import X.C3Pi;
import X.C4oT;
import X.C5322DgG;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.Ey9;
import X.F0C;
import X.F3w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchDeveloperPrefs {
    public static final String FEED_ENABLED_KEY = "feed_enabled";
    public static final String FLIPPER_BLOCKING_COLD_START_KEY = "flipper_blocking_cold_start";
    public static final String INFINITE_FEED_PAGINATION_ENABLED_KEY = "infinite_feed_pagination_enabled";
    public static final HatchDeveloperPrefs INSTANCE = new HatchDeveloperPrefs();
    public static final String SKIP_INFINITE_FEED_RECEIPTS_KEY = "skip_infinite_feed_receipts";
    public static final String SNP_DEBUG_TRANSPARENCY_POLICY_KEY = "snp_debug_transparency_policy";
    public static final String TAB_ORDER_KEY = "tab_order";
    public static volatile boolean cachedIsFeedEnabled;
    public static volatile boolean cachedIsFlipperColdStartBlocking;
    public static volatile boolean cachedIsInfiniteFeedPaginationEnabled;
    public static volatile boolean cachedSkipInfiniteFeedReceipts;
    public static volatile boolean cachedUseSnpDebugTransparencyPolicy;
    public static final BLG<List<String>> mutableTabOrder;
    public static final BLG<WhatsAppConnectionPreview> mutableWhatsAppConnectionPreview;
    public static final F0C prefs$delegate;
    public static final C1BN<List<String>> tabOrder;
    public static final C1BN<WhatsAppConnectionPreview> whatsAppConnectionPreview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class WhatsAppConnectionPreview {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ WhatsAppConnectionPreview[] $VALUES;
        public static final WhatsAppConnectionPreview CONNECTED;
        public static final WhatsAppConnectionPreview DISCONNECTED;
        public static final WhatsAppConnectionPreview NEEDS_ATTENTION;
        public static final WhatsAppConnectionPreview OFF;

        static {
            WhatsAppConnectionPreview whatsAppConnectionPreview = new WhatsAppConnectionPreview("OFF", 0);
            OFF = whatsAppConnectionPreview;
            WhatsAppConnectionPreview whatsAppConnectionPreview2 = new WhatsAppConnectionPreview("CONNECTED", 1);
            CONNECTED = whatsAppConnectionPreview2;
            WhatsAppConnectionPreview whatsAppConnectionPreview3 = new WhatsAppConnectionPreview("NEEDS_ATTENTION", 2);
            NEEDS_ATTENTION = whatsAppConnectionPreview3;
            WhatsAppConnectionPreview whatsAppConnectionPreview4 = new WhatsAppConnectionPreview("DISCONNECTED", 3);
            DISCONNECTED = whatsAppConnectionPreview4;
            WhatsAppConnectionPreview[] whatsAppConnectionPreviewArr = {whatsAppConnectionPreview, whatsAppConnectionPreview2, whatsAppConnectionPreview3, whatsAppConnectionPreview4};
            $VALUES = whatsAppConnectionPreviewArr;
            $ENTRIES = new F3w(whatsAppConnectionPreviewArr);
        }

        public static Ey9<WhatsAppConnectionPreview> getEntries() {
            return $ENTRIES;
        }

        public static WhatsAppConnectionPreview valueOf(String str) {
            return (WhatsAppConnectionPreview) Enum.valueOf(WhatsAppConnectionPreview.class, str);
        }

        public static WhatsAppConnectionPreview[] values() {
            return (WhatsAppConnectionPreview[]) $VALUES.clone();
        }

        public WhatsAppConnectionPreview(String str, int i) {
        }
    }

    public final void setTabOrder(List<String> list) {
        C7384Etj.A0Y(list, 0);
        C9286GCn.A00(null, list, (C9286GCn) mutableTabOrder);
        BzK bzKA0P = AnonymousClass007.A0P();
        bzKA0P.AYr(TAB_ORDER_KEY, AbstractC0878AGe.A0L(",", "", "", list, null));
        bzKA0P.apply();
    }

    public final void setWhatsAppConnectionPreview(WhatsAppConnectionPreview whatsAppConnectionPreview2) {
        C7384Etj.A0Y(whatsAppConnectionPreview2, 0);
    }

    static {
        C5322DgG c5322DgGA03 = AbstractC5321DgF.A03(HatchDeveloperPrefs$prefs$2.INSTANCE);
        prefs$delegate = c5322DgGA03;
        cachedIsFlipperColdStartBlocking = ((C4oT) c5322DgGA03.getValue()).getBoolean(FLIPPER_BLOCKING_COLD_START_KEY, false);
        F0C f0c = prefs$delegate;
        cachedSkipInfiniteFeedReceipts = ((C4oT) f0c.getValue()).getBoolean(SKIP_INFINITE_FEED_RECEIPTS_KEY, false);
        cachedUseSnpDebugTransparencyPolicy = ((C4oT) f0c.getValue()).getBoolean(SNP_DEBUG_TRANSPARENCY_POLICY_KEY, false);
        cachedIsFeedEnabled = ((C4oT) f0c.getValue()).getBoolean(FEED_ENABLED_KEY, false);
        cachedIsInfiniteFeedPaginationEnabled = ((C4oT) f0c.getValue()).getBoolean(INFINITE_FEED_PAGINATION_ENABLED_KEY, false);
        C9286GCn c9286GCn = new C9286GCn(WhatsAppConnectionPreview.OFF);
        mutableWhatsAppConnectionPreview = c9286GCn;
        whatsAppConnectionPreview = new C3Pi(null, c9286GCn);
        String string = ((C4oT) f0c.getValue()).getString(TAB_ORDER_KEY, "");
        C7384Etj.A0U(string);
        List listA0g = C7BY.A0g(string, new char[]{','});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0g) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        C9286GCn c9286GCn2 = new C9286GCn(arrayList);
        mutableTabOrder = c9286GCn2;
        tabOrder = new C3Pi(null, c9286GCn2);
    }

    private final C4oT getPrefs() {
        return (C4oT) prefs$delegate.getValue();
    }

    public final boolean getSkipInfiniteFeedReceipts() {
        return cachedSkipInfiniteFeedReceipts;
    }

    public final C1BN<List<String>> getTabOrder() {
        return tabOrder;
    }

    public final boolean getUseSnpDebugTransparencyPolicy() {
        return false;
    }

    public final C1BN<WhatsAppConnectionPreview> getWhatsAppConnectionPreview() {
        return whatsAppConnectionPreview;
    }

    public final boolean isFeedEnabled() {
        return cachedIsFeedEnabled;
    }

    public final boolean isFlipperColdStartBlocking() {
        return cachedIsFlipperColdStartBlocking;
    }

    public final boolean isInfiniteFeedPaginationEnabled() {
        return cachedIsInfiniteFeedPaginationEnabled;
    }

    public final void setFeedEnabled(boolean z) {
        cachedIsFeedEnabled = z;
        BzK bzKA0P = AnonymousClass007.A0P();
        bzKA0P.A0A(FEED_ENABLED_KEY, z);
        bzKA0P.commit();
    }

    public final void setFlipperColdStartBlocking(boolean z) {
        cachedIsFlipperColdStartBlocking = z;
        BzK bzKA0P = AnonymousClass007.A0P();
        bzKA0P.A0A(FLIPPER_BLOCKING_COLD_START_KEY, z);
        bzKA0P.commit();
    }

    public final void setInfiniteFeedPaginationEnabled(boolean z) {
        cachedIsInfiniteFeedPaginationEnabled = z;
        BzK bzKA0P = AnonymousClass007.A0P();
        bzKA0P.A0A(INFINITE_FEED_PAGINATION_ENABLED_KEY, z);
        bzKA0P.commit();
    }

    public final void setSkipInfiniteFeedReceipts(boolean z) {
        cachedSkipInfiniteFeedReceipts = z;
        BzK bzKA0P = AnonymousClass007.A0P();
        bzKA0P.A0A(SKIP_INFINITE_FEED_RECEIPTS_KEY, z);
        bzKA0P.commit();
    }

    public final void setUseSnpDebugTransparencyPolicy(boolean z) {
        cachedUseSnpDebugTransparencyPolicy = z;
        BzK bzKA0P = AnonymousClass007.A0P();
        bzKA0P.A0A(SNP_DEBUG_TRANSPARENCY_POLICY_KEY, z);
        bzKA0P.commit();
    }
}
