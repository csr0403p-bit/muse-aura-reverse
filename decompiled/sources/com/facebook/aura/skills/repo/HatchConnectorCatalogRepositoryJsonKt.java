package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import com.facebook.aura.skills.model.ConsentBulletIcon;

/* loaded from: classes3.dex */
public abstract class HatchConnectorCatalogRepositoryJsonKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final ConsentBulletIcon toConsentBulletIcon(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        switch (strA0u.hashCode()) {
            case -1884274053:
                if (strA0u.equals("storage")) {
                    return ConsentBulletIcon.STORAGE;
                }
                break;
            case -579210163:
                if (strA0u.equals(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR)) {
                    return ConsentBulletIcon.CONNECTOR;
                }
                break;
            case 557191019:
                if (strA0u.equals("caution")) {
                    return ConsentBulletIcon.CAUTION;
                }
                break;
            case 1124446108:
                if (strA0u.equals("warning")) {
                    return ConsentBulletIcon.WARNING;
                }
                break;
            case 1434631203:
                if (strA0u.equals("settings")) {
                    return ConsentBulletIcon.SETTINGS;
                }
                break;
            case 1620755364:
                if (strA0u.equals("data_types")) {
                    return ConsentBulletIcon.DATA_TYPES;
                }
                break;
            case 1625786548:
                if (strA0u.equals("smart_glasses")) {
                    return ConsentBulletIcon.SMART_GLASSES;
                }
                break;
        }
        return ConsentBulletIcon.INFO;
    }
}
