package com.facebook.aura.conversation.view;

import X.AGH;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchCitationAnalytics;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class HatchMessageSelectionMoreOptionsMenuKt {
    public static final int MESSAGE_SELECTION_BAD_RESPONSE = 1;
    public static final int MESSAGE_SELECTION_COPY = 4;
    public static final int MESSAGE_SELECTION_DOWNLOAD = 10;
    public static final int MESSAGE_SELECTION_GOOD_RESPONSE = 0;
    public static final int MESSAGE_SELECTION_PARISCOPE = 2;
    public static final int MESSAGE_SELECTION_REPLY = 3;
    public static final int MESSAGE_SELECTION_SELECT = 5;
    public static final int MESSAGE_SELECTION_SHARE = 6;
    public static final int MESSAGE_SELECTION_UNSEND = 8;
    public static final int MESSAGE_SELECTION_UNSEND_DIVIDER = 9;
    public static final int MESSAGE_SELECTION_VIEW_SOURCES = 7;

    public static final void logCopyPariscopeLinkClick(Map<String, String> map) {
        logSelectionMenuClick(HatchComponent.MESSAGE_BUBBLE, HatchSubsurface.MESSAGE_LIST, map, AnonymousClass006.A10(HatchMetadataKey.ACTION.getValue(), "copy_pariscope_link"));
    }

    public static final void logSelectionMenuClick(HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, Map<String, String> map, Map<String, String> map2) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, hatchSubsurface, HatchScreen.MAIN_CHAT, hatchComponent, null, AGH.A02(map, map2), null);
    }

    public static /* synthetic */ void logSelectionMenuClick$default(HatchComponent hatchComponent, HatchSubsurface hatchSubsurface, Map map, Map map2, int i, Object obj) {
        if ((i & 8) != 0) {
            map2 = AGH.A0E();
        }
        logSelectionMenuClick(hatchComponent, hatchSubsurface, map, map2);
    }

    public static final void logSelectionMenuDismiss(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, HatchSubsurface.RESPONSE_TOOLBAR, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.THREE_DOTS_MENU, null, map);
    }

    public static final void logViewSourcesClick(HatchMessageUiModel hatchMessageUiModel, Map<String, String> map) {
        Map<String, String> mapA0E;
        HatchComponent hatchComponent = HatchComponent.VIEW_SOURCES_BUTTON;
        HatchSubsurface hatchSubsurface = HatchSubsurface.RESPONSE_TOOLBAR;
        HatchCitationAnalytics hatchCitationAnalytics = hatchMessageUiModel.citationAnalytics;
        if (hatchCitationAnalytics == null || (mapA0E = hatchCitationAnalytics.sourcesMetadata()) == null) {
            mapA0E = AGH.A0E();
        }
        logSelectionMenuClick(hatchComponent, hatchSubsurface, map, mapA0E);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153 A[PHI: r46
  0x0153: PHI (r46v3 boolean) = (r46v0 boolean), (r46v4 boolean) binds: [B:94:0x0151, B:92:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b A[PHI: r46
  0x015b: PHI (r46v2 boolean) = (r46v0 boolean), (r46v3 boolean) binds: [B:94:0x0151, B:96:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: HatchMessageSelectionMoreOptionsMenu-YzniZNo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m657HatchMessageSelectionMoreOptionsMenuYzniZNo(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r104, boolean r105, kotlin.jvm.functions.Function0<kotlin.Unit> r106, X.BRg r107, kotlin.jvm.functions.Function0<kotlin.Unit> r108, kotlin.jvm.functions.Function0<kotlin.Unit> r109, kotlin.jvm.functions.Function0<kotlin.Unit> r110, kotlin.jvm.functions.Function0<kotlin.Unit> r111, kotlin.jvm.functions.Function0<kotlin.Unit> r112, kotlin.jvm.functions.Function0<kotlin.Unit> r113, kotlin.jvm.functions.Function0<kotlin.Unit> r114, X.AHD<com.facebook.aura.vds.compose.contextmenu.AuraContextMenuVerticalBand> r115, X.C1DG r116, X.G0U<? super X.BLU, kotlin.Unit> r117, X.BFM r118, int r119, int r120, int r121) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageSelectionMoreOptionsMenuKt.m657HatchMessageSelectionMoreOptionsMenuYzniZNo(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, boolean, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.AHD, X.1DG, X.G0U, X.BFM, int, int, int):void");
    }
}
