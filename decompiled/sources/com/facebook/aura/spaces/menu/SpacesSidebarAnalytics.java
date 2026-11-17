package com.facebook.aura.spaces.menu;

import X.AIW;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C1BO;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class SpacesSidebarAnalytics {
    public static final int $stable = 0;
    public static final SpacesSidebarAnalytics INSTANCE = new SpacesSidebarAnalytics();

    public final void logMoveFromLibrary(ArtifactPlacementRequest artifactPlacementRequest) {
        C7384Etj.A0Y(artifactPlacementRequest, 0);
        logMove(artifactPlacementRequest, HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME);
    }

    public final void logMoveFromSpaceMenu(ArtifactPlacementRequest artifactPlacementRequest) {
        C7384Etj.A0Y(artifactPlacementRequest, 0);
        logMove(artifactPlacementRequest, HatchSurface.NAV_BAR, HatchSubsurface.TAB_SPACE, HatchScreen.NAV_BAR_EXPANDED);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint rememberEntryPoint(java.lang.String r9, boolean r10, boolean r11, X.BFM r12, int r13) {
        /*
            r8 = this;
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
            r6 = -1
            X.CGz r1 = X.AnonymousClass002.A0h(r12)
            boolean r0 = r12.A65(r1)
            java.lang.Object r4 = r12.AaT()
            if (r0 != 0) goto L17
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto L20
        L17:
            com.facebook.aura.spaces.menu.SpaceOpenOrigins$Companion r0 = com.facebook.aura.spaces.menu.SpaceOpenOrigins.Companion
            com.facebook.aura.spaces.menu.SpaceOpenOrigins r4 = r0.getInstance(r1)
            r12.Ai0(r4)
        L20:
            com.facebook.aura.spaces.menu.SpaceOpenOrigins r4 = (com.facebook.aura.spaces.menu.SpaceOpenOrigins) r4
            X.1BN<java.util.Map<java.lang.String, com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint>> r0 = r4.origins
            java.lang.Object r0 = X.C1BO.A07(r12, r0)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r9)
            com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint r0 = (com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint) r0
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[]{r9}
            r1 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 32
            if (r1 <= r2) goto L43
            boolean r1 = r12.A66(r10)
            if (r1 != 0) goto L48
        L43:
            r1 = r13 & 48
            r7 = 0
            if (r1 != r2) goto L49
        L48:
            r7 = 1
        L49:
            r1 = r13 & 896(0x380, float:1.256E-42)
            r1 = r1 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r1 <= r3) goto L57
            boolean r1 = r12.A66(r11)
            if (r1 != 0) goto L5c
        L57:
            r2 = r13 & 384(0x180, float:5.38E-43)
            r1 = 0
            if (r2 != r3) goto L5d
        L5c:
            r1 = 1
        L5d:
            r7 = r7 | r1
            java.lang.Object r1 = r12.AaT()
            if (r7 != 0) goto L68
            java.lang.Object r2 = X.C78N.A00
            if (r1 != r2) goto L70
        L68:
            com.facebook.aura.spaces.menu.SpacesSidebarAnalytics$rememberEntryPoint$taken$2$1 r1 = new com.facebook.aura.spaces.menu.SpacesSidebarAnalytics$rememberEntryPoint$taken$2$1
            r1.<init>(r10, r11)
            r12.Ai0(r1)
        L70:
            androidx.compose.runtime.MutableState r5 = X.AnonymousClass002.A0N(r12, r1, r5)
            if (r0 == 0) goto L7a
            int r6 = r0.ordinal()
        L7a:
            boolean r1 = r12.A63(r6)
            boolean r3 = X.AnonymousClass004.A1S(r12, r5, r4, r1)
            r1 = r13 & 14
            r1 = r1 ^ 6
            r2 = 4
            if (r1 <= r2) goto L8f
            boolean r1 = r12.A65(r9)
            if (r1 != 0) goto L94
        L8f:
            r1 = r13 & 6
            if (r1 == r2) goto L94
            r8 = 0
        L94:
            r3 = r3 | r8
            java.lang.Object r1 = r12.AaT()
            if (r3 != 0) goto L9f
            java.lang.Object r2 = X.C78N.A00
            if (r1 != r2) goto La7
        L9f:
            com.facebook.aura.spaces.menu.SpacesSidebarAnalytics$rememberEntryPoint$1$1 r1 = new com.facebook.aura.spaces.menu.SpacesSidebarAnalytics$rememberEntryPoint$1$1
            r1.<init>(r0, r4, r9, r5)
            r12.Ai0(r1)
        La7:
            X.AnonymousClass001.A15(r12, r1)
            if (r0 != 0) goto Lb2
            java.lang.Object r0 = r5.getValue()
            com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint r0 = (com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint) r0
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.SpacesSidebarAnalytics.rememberEntryPoint(java.lang.String, boolean, boolean, X.BFM, int):com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtifactPlacement.values().length];
            try {
                AnonymousClass002.A13(ArtifactPlacement.SPACES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ArtifactPlacement.LIBRARY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void logMove(ArtifactPlacementRequest artifactPlacementRequest, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
        HatchComponent hatchComponent;
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        int iOrdinal = artifactPlacementRequest.placement.ordinal();
        if (iOrdinal == 1) {
            hatchComponent = HatchComponent.MOVE_TO_SIDEBAR_BUTTON;
        } else {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            hatchComponent = HatchComponent.MOVE_TO_LIBRARY_BUTTON;
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AnonymousClass006.A10(HatchMetadataKey.SPACE_ID.getValue(), artifactPlacementRequest.spaceId), null);
    }

    public final void logCreateSpaceClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.NAV_BAR, HatchSubsurface.NAV_BAR, HatchScreen.NAV_BAR_EXPANDED, HatchComponent.NEW_SPACE_TAB, null, null, null);
    }

    public final void logSidebarSpaceClick(String str, boolean z) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.NAV_BAR;
        HatchSubsurface hatchSubsurface = HatchSubsurface.NAV_BAR;
        HatchScreen hatchScreen = HatchScreen.NAV_BAR_EXPANDED;
        HatchComponent hatchComponent = HatchComponent.TAB_SPACE;
        C0924AIa c0924AIa = new C0924AIa();
        AnonymousClass003.A0s(HatchMetadataKey.IS_RESELECT, c0924AIa, z);
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.SPACE_ID, str, c0924AIa);
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIa), null);
    }

    public static final Map<String, HatchSpaceEntryPoint> rememberEntryPoint$lambda$1(C1BO<? extends Map<String, ? extends HatchSpaceEntryPoint>> c1bo) {
        return (Map) c1bo.getValue();
    }

    public final void recordOpenOrigin(AbstractC3358CGz abstractC3358CGz, String str, HatchSpaceEntryPoint hatchSpaceEntryPoint) {
        AnonymousClass005.A0x(abstractC3358CGz, str, hatchSpaceEntryPoint);
        SpaceOpenOrigins.Companion.getInstance(abstractC3358CGz).record(str, hatchSpaceEntryPoint);
    }
}
