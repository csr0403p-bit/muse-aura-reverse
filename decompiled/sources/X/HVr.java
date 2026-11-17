package X;

import com.facebook.aura.iap.HatchSubscriptionPurchase;

/* loaded from: classes6.dex */
public abstract class HVr {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final HVq A00(String str) {
        C7384Etj.A0Y(str, 0);
        switch (str.hashCode()) {
            case -2096930415:
                if (str.equals("FAN_FUNDING")) {
                    return HVq.A08;
                }
                break;
            case -1986316859:
                if (str.equals("WA_PAID_CHANNEL")) {
                    return HVq.A0K;
                }
                break;
            case -1851679434:
                if (str.equals("META_AI_CREDIT")) {
                    return HVq.A0F;
                }
                break;
            case -1788268115:
                if (str.equals("BUSINESS_AI_AGENT")) {
                    return HVq.A05;
                }
                break;
            case -1462255621:
                if (str.equals("CREATOR_STOREFRONT")) {
                    return HVq.A06;
                }
                break;
            case -1122126989:
                if (str.equals("AVATAR_CONTENT")) {
                    return HVq.A04;
                }
                break;
            case -1018391978:
                if (str.equals(HatchSubscriptionPurchase.SUBSCRIPTION_PRODUCT_TYPE)) {
                    return HVq.A0I;
                }
                break;
            case -904339168:
                if (str.equals("GAME_TIPPING")) {
                    return HVq.A09;
                }
                break;
            case -477688068:
                if (str.equals("MV_PAID_TOKEN")) {
                    return HVq.A0H;
                }
                break;
            case -465335796:
                if (str.equals("INSTAGRAM_FAN_SUBS")) {
                    return HVq.A0C;
                }
                break;
            case -160309842:
                if (str.equals("HORIZON_PURCHASES")) {
                    return HVq.A0A;
                }
                break;
            case -79900897:
                if (str.equals("INSTAGRAM_USERPAY_BADGES")) {
                    return HVq.A0D;
                }
                break;
            case -34615887:
                if (str.equals("DCP_DEMO")) {
                    return HVq.A07;
                }
                break;
            case 2378231:
                if (str.equals("MV4B")) {
                    return HVq.A0G;
                }
                break;
            case 380330613:
                if (str.equals("ASTERIA_SUBSCRIPTION")) {
                    return HVq.A03;
                }
                break;
            case 392641187:
                if (str.equals("INSTANT_GAMES")) {
                    return HVq.A0E;
                }
                break;
            case 732239517:
                if (str.equals("WA_BUSINESS_SUBS")) {
                    return HVq.A0J;
                }
                break;
            case 872770798:
                if (str.equals("AFS_SUBSCRIPTION")) {
                    return HVq.A01;
                }
                break;
            case 1711011950:
                if (str.equals("INSTAGRAM_CONTENT_APPRECIATION")) {
                    return HVq.A0B;
                }
                break;
        }
        return HVq.A02;
    }

    public static void A01(AbstractC6676EOt abstractC6676EOt, String str) {
        abstractC6676EOt.A00(A00(str), "product_type");
    }
}
