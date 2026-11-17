package com.facebook.aura.pairs;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BRg;
import X.BS0;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import com.facebook.aura.pairs.intf.ConnectionsAnalytics;
import com.facebook.aura.sharesheet.HatchShareDestination;
import com.facebook.aura.sharesheet.HatchShareLoggingKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PairsAnalytics {
    public static final int $stable = 0;
    public static final PairsAnalytics INSTANCE = new PairsAnalytics();

    public final Map<String, String> activity$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionsActivity connectionsActivity, int i) {
        C7384Etj.A0Y(connectionsActivity, 0);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        String strAnalyticsKind = INSTANCE.analyticsKind(connectionsActivity);
        if (strAnalyticsKind != null) {
            AnonymousClass001.A1C(HatchMetadataKey.ACTIVITY_KIND, strAnalyticsKind, c0924AIaA0u);
        }
        AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIaA0u, i);
        return AIW.A0K(c0924AIaA0u);
    }

    public final Map<String, String> activityKind$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionsActivity connectionsActivity) {
        C7384Etj.A0Y(connectionsActivity, 0);
        String strAnalyticsKind = analyticsKind(connectionsActivity);
        if (strAnalyticsKind != null) {
            return AnonymousClass007.A0c(HatchMetadataKey.ACTIVITY_KIND, strAnalyticsKind);
        }
        return null;
    }

    public final void click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(HatchScreen hatchScreen, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, Map<String, String> map) {
        AnonymousClass003.A0u(hatchScreen, hatchComponent);
        HatchInteractionLogger.INSTANCE.logClick(ConnectionsAnalytics.surface, hatchSubsurface, hatchScreen, hatchComponent, null, map, null);
    }

    public final Map<String, String> collaboratingItem$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionsSharedItemKind connectionsSharedItemKind, int i) {
        C7384Etj.A0Y(connectionsSharedItemKind, 0);
        return AnonymousClass007.A0d(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), C3cG.A0r(HatchMetadataKey.SHARE_CONTENT_TYPE.getValue(), connectionsSharedItemKind.getWire()));
    }

    public final Map<String, String> connectionType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionsSheetSubject connectionsSheetSubject) {
        String str;
        C7384Etj.A0Y(connectionsSheetSubject, 0);
        String value = HatchMetadataKey.CONNECTION_TYPE.getValue();
        if (connectionsSheetSubject instanceof ConnectionsSheetSubject.Person) {
            str = PairsAnalyticsKt.CONNECTION_TYPE_PERSON;
        } else {
            if (!(connectionsSheetSubject instanceof ConnectionsSheetSubject.Group)) {
                throw C3cG.A0q();
            }
            str = PairsAnalyticsKt.CONNECTION_TYPE_GROUP;
        }
        return AnonymousClass006.A10(value, str);
    }

    public final Map<String, String> failureReason$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass007.A0c(HatchMetadataKey.FAILURE_REASON, str);
    }

    public final Map<String, String> group$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionsGroupProvider connectionsGroupProvider, int i) {
        C7384Etj.A0Y(connectionsGroupProvider, 0);
        return C3cH.A0m(HatchMetadataKey.PROVIDER.getValue(), AnonymousClass006.A0x(connectionsGroupProvider), C3cG.A0r(HatchMetadataKey.CONNECTION_TYPE.getValue(), PairsAnalyticsKt.CONNECTION_TYPE_GROUP), C3cG.A0r(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i)));
    }

    public final Map<String, String> historyLinkType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(boolean z, String str) {
        String str2;
        C7384Etj.A0Y(str, 1);
        if (!z) {
            List<String> list = PairsAnalyticsKt.WEB_SCHEMES;
            if ((list instanceof Collection) && list.isEmpty()) {
                return null;
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                C7384Etj.A0Y(strA0j, 1);
                if (AnonymousClass006.A1b(strA0j, str)) {
                    str2 = "web";
                }
            }
            return null;
        }
        str2 = PairsAnalyticsKt.LINK_TYPE_SHARED_ITEM;
        return AnonymousClass007.A0c(HatchMetadataKey.LINK_TYPE, str2);
    }

    public final BRg impression$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionsLogContext connectionsLogContext, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, Map<String, String> map, Integer num, String str) {
        AnonymousClass003.A0u(connectionsLogContext, hatchComponent);
        C7384Etj.A0Y(str, 5);
        BS0 bs0 = BRg.A00;
        HatchOrigin hatchOrigin = ConnectionsAnalytics.origin;
        HatchSurface hatchSurface = ConnectionsAnalytics.surface;
        HatchScreen hatchScreen = connectionsLogContext.screen;
        return HatchImpressionModifierKt.hatchImpression(bs0, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, map, num, 500L, 0.0f, FGI.A0m(connectionsLogContext.presentationKey, ":", hatchScreen.getValue(), ":", hatchSubsurface != null ? hatchSubsurface.getValue() : null, ":", hatchComponent.getValue(), ":", str), null, null);
    }

    public final Map<String, String> inviteDestination$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(HatchShareDestination hatchShareDestination) {
        C7384Etj.A0Y(hatchShareDestination, 0);
        return AnonymousClass007.A0d(HatchMetadataKey.SHARE_CONTENT_TYPE.getValue(), "invite", C3cG.A0r(HatchMetadataKey.SHARE_PLATFORM.getValue(), HatchShareLoggingKt.sharePlatform(hatchShareDestination)));
    }

    public final Map<String, String> level$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsLevel pairsLevel) {
        C7384Etj.A0Y(pairsLevel, 0);
        return AnonymousClass006.A10(HatchMetadataKey.CONNECTION_LEVEL.getValue(), pairsLevel.getWireValue());
    }

    public final Map<String, String> pairingStatus$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsStatusKind pairsStatusKind) {
        C7384Etj.A0Y(pairsStatusKind, 0);
        return AnonymousClass006.A10(HatchMetadataKey.PAIRING_STATUS.getValue(), AnonymousClass006.A0x(pairsStatusKind));
    }

    public final void pullToRefresh$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(HatchScreen hatchScreen) {
        C7384Etj.A0Y(hatchScreen, 0);
        HatchInteractionLogger.INSTANCE.logPullToRefresh(ConnectionsAnalytics.surface, null, hatchScreen, null);
    }

    public final Map<String, String> shareContentType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass007.A0c(HatchMetadataKey.SHARE_CONTENT_TYPE, str);
    }

    public final void toggle$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(boolean z, HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map) {
        AnonymousClass003.A0x(hatchScreen, hatchComponent);
        HatchInteractionLogger.INSTANCE.logToggle(z, ConnectionsAnalytics.surface, null, hatchScreen, hatchComponent, null, map);
    }

    public final void type$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(HatchScreen hatchScreen, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface) {
        AnonymousClass003.A0u(hatchScreen, hatchComponent);
        HatchInteractionLogger.INSTANCE.logType(ConnectionsAnalytics.surface, hatchSubsurface, hatchScreen, hatchComponent, null);
    }

    private final String analyticsKind(ConnectionsActivity connectionsActivity) {
        String wire = connectionsActivity.kind.getWire();
        if (wire != null) {
            return wire;
        }
        ConnectionsSharedItem connectionsSharedItem = connectionsActivity.item;
        if (connectionsSharedItem != null) {
            return FGI.A0M(connectionsSharedItem.kind.getWire(), PairsAnalyticsKt.ITEM_SHARED_SUFFIX);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl$default(PairsAnalytics pairsAnalytics, HatchScreen hatchScreen, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(hatchScreen, hatchComponent, hatchSubsurface, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BRg impression$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl$default(PairsAnalytics pairsAnalytics, ConnectionsLogContext connectionsLogContext, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, Map map, Integer num, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchSubsurface = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            str = "";
        }
        return pairsAnalytics.impression$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsLogContext, hatchComponent, hatchSubsurface, map, num, str);
    }

    private final void logDeepLink(String str) {
        HatchInteractionLogger.INSTANCE.logDeepLink(ConnectionsAnalytics.surface, null, null, AnonymousClass007.A0c(HatchMetadataKey.LINK_TYPE, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void toggle$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl$default(PairsAnalytics pairsAnalytics, boolean z, HatchScreen hatchScreen, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        pairsAnalytics.toggle$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(z, hatchScreen, hatchComponent, map);
    }

    public static /* synthetic */ void type$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl$default(PairsAnalytics pairsAnalytics, HatchScreen hatchScreen, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchSubsurface = null;
        }
        pairsAnalytics.type$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(hatchScreen, hatchComponent, hatchSubsurface);
    }

    public final void logConnectionsLinkRouted() {
        logDeepLink("connections");
    }

    public final void logInviteLinkRouted() {
        logDeepLink("invite");
    }

    public final Map<String, String> person$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(int i) {
        return AnonymousClass007.A0d(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), C3cG.A0r(HatchMetadataKey.CONNECTION_TYPE.getValue(), PairsAnalyticsKt.CONNECTION_TYPE_PERSON));
    }

    public final Map<String, String> position$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(int i) {
        return AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i));
    }

    public final Map<String, String> totalCount$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(int i) {
        return AnonymousClass006.A10(HatchMetadataKey.TOTAL_COUNT.getValue(), String.valueOf(i));
    }
}
