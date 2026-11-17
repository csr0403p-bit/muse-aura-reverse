package com.facebook.aura.browsertask.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0Hi;
import X.C0Yr;
import X.C1BO;
import X.C1C3;
import X.C1DG;
import X.C7384Etj;
import X.C78g;
import X.C8j4;
import X.G0V;
import X.G0W;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AgentComputerScreenKt {
    public static final Unit AgentComputerViewerPage$lambda$13$0(AgentComputerOtherDevice agentComputerOtherDevice, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 1);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 19, 18), bfm, i)) {
            OtherDeviceBannerKt.OtherDeviceBanner(agentComputerOtherDevice, bRg, bfm, ((i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | AgentComputerOtherDevice.$stable, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerViewerPage$lambda$14$0(AgentComputerTakeoverControls agentComputerTakeoverControls, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, C1BO c1bo, C1BO c1bo2, BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 6);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        boolean z3 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (z2 && C1BO.A0F(c1bo) && C1BO.A0F(c1bo2)) {
                z3 = true;
            }
            agentComputerTakeoverControls.Content(agentComputerScreenScope, z, z3, bRg, bfm, AgentComputerScreenScope.$stable | ((iA0d << 9) & 7168));
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerViewerPage$lambda$15(AgentComputerSurface agentComputerSurface, AgentComputerScreenScope agentComputerScreenScope, boolean z, boolean z2, C1DG c1dg, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 5);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, c1dg.A00) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
            agentComputerSurface.mo306Viewportjt2gSs(agentComputerScreenScope, !z, z2, c1dg.A00, bRg, bfm, AnonymousClass003.A07(iA04 << 9, AgentComputerScreenScope.$stable));
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void AgentComputerScreen(final AgentComputerSurface agentComputerSurface, final boolean z, final Function0<Unit> function0, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        C7384Etj.A0Y(agentComputerSurface, 0);
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(-1750942806);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentComputerSurface, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0w);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final BRg bRg3 = bRg2;
            AuraModeOverriderKt.AuraModeOverrider(AuraThemeMode.DARK, null, B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerScreenKt$$ExternalSyntheticLambda17
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return AgentComputerScreenKt.AgentComputerScreen$lambda$0(z, agentComputerSurface, function0, g0w, bRg3, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, -489852195), bfm, 390, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerScreenKt$$ExternalSyntheticLambda18
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AgentComputerSurface agentComputerSurface2 = agentComputerSurface;
                    boolean z2 = z;
                    Function0 function02 = function0;
                    G0W g0w2 = g0w;
                    BRg bRg4 = bRg2;
                    int i4 = i;
                    AgentComputerScreenKt.AgentComputerScreen(agentComputerSurface2, z2, function02, g0w2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AgentComputerScreenContent(final boolean r34, final com.facebook.aura.browsertask.view.AgentComputerSurface r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r37, X.BRg r38, X.BFM r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerScreenKt.AgentComputerScreenContent(boolean, com.facebook.aura.browsertask.view.AgentComputerSurface, kotlin.jvm.functions.Function0, X.G0W, X.BRg, X.BFM, int, int):void");
    }

    public static final Unit AgentComputerScreenContent$lambda$11$0(C1C3 c1c3, C0Hi c0Hi) {
        if (c1c3 != null) {
            c1c3.hide();
        }
        c0Hi.A6G(false);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$16$0(Function0 function0, C1BO c1bo) {
        C8j4.A1I(c1bo, HatchComponent.CLOSE_BUTTON);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$18$0(Function0 function0, C1BO c1bo) {
        C8j4.A1I(c1bo, HatchComponent.CLOSE_BUTTON);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$19$0(Function0 function0, C1BO c1bo) {
        C8j4.A1I(c1bo, HatchComponent.RETURN_CONTROL_BUTTON);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$20$0(C1BO c1bo, MutableState mutableState) {
        C8j4.A1I(c1bo, HatchComponent.TAKE_CONTROL_BUTTON);
        MutableState.A09(true, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$21$0(C1BO c1bo, MutableState mutableState) {
        C8j4.A1I(c1bo, HatchComponent.STOP_TASK_BUTTON);
        MutableState.A09(true, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$22$0(AgentComputerSurface agentComputerSurface, Function0 function0, C1BO c1bo, MutableState mutableState) {
        C8j4.A1I(c1bo, HatchComponent.CONFIRM_BUTTON);
        MutableState.A09(false, mutableState);
        agentComputerSurface.stopSession();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$24$0(C1BO c1bo, MutableState mutableState) {
        C8j4.A1I(c1bo, HatchComponent.CANCEL_BUTTON);
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AgentComputerViewerPage(final com.facebook.aura.browsertask.view.AgentComputerSurface r40, final boolean r41, final boolean r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function0<kotlin.Unit> r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, final kotlin.jvm.functions.Function0<kotlin.Unit> r46, final boolean r47, final X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r48, X.BRg r49, X.BFM r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerScreenKt.AgentComputerViewerPage(com.facebook.aura.browsertask.view.AgentComputerSurface, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.G0W, X.BRg, X.BFM, int, int):void");
    }

    public static final Map<String, String> browserTaskMetadata(String str) {
        if (str != null) {
            return AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str);
        }
        return null;
    }

    public static final boolean isInProgress(BrowserTaskDisplayStatus browserTaskDisplayStatus) {
        return browserTaskDisplayStatus == null || browserTaskDisplayStatus == BrowserTaskDisplayStatus.QUEUED || browserTaskDisplayStatus == BrowserTaskDisplayStatus.STARTING || browserTaskDisplayStatus == BrowserTaskDisplayStatus.WORKING;
    }

    public static final void logBrowserOverlayClick(HatchComponent hatchComponent, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, hatchComponent, null, browserTaskMetadata(str), null);
    }

    public static final void logStopDialogDismiss(String str) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.CANCEL_BUTTON, null, browserTaskMetadata(str));
    }

    public static final void sharePageUrl(Context context, String str, String str2) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.SHARE_BUTTON, null, str2 != null ? AnonymousClass007.A0c(HatchMetadataKey.BROWSER_TASK_ID, str2) : null, null);
        HatchShare.INSTANCE.shareUrl(context, str, null, null);
    }

    public static /* synthetic */ Unit $r8$lambda$XmX25UBZzRac0fhtqcOSwdKm5cM(AgentComputerSurface agentComputerSurface, Function0 function0) {
        agentComputerSurface.acknowledgeTerminalOutcome();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreen$lambda$0(boolean z, AgentComputerSurface agentComputerSurface, Function0 function0, G0W g0w, BRg bRg, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AgentComputerScreenContent(z, agentComputerSurface, function0, g0w, bRg, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreen$lambda$1(AgentComputerSurface agentComputerSurface, boolean z, Function0 function0, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        AgentComputerScreen(agentComputerSurface, z, function0, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$13$0(Function0 function0, AgentComputerSurface agentComputerSurface, MutableState mutableState) {
        function0.invoke();
        agentComputerSurface.handBackControl();
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final C78g AgentComputerScreenContent$lambda$14$0(Function0 function0, C1BO c1bo, MutableState mutableState, C0Yr c0Yr) {
        if (C1BO.A0F(c1bo) && MutableState.A0A(mutableState)) {
            function0.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.browsertask.view.AgentComputerScreenKt$AgentComputerScreenContent$lambda$14$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final Unit AgentComputerScreenContent$lambda$15$0(AgentComputerSurface agentComputerSurface, Function0 function0) {
        agentComputerSurface.acknowledgeTerminalOutcome();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$17(boolean z, AgentComputerSurface agentComputerSurface, Function0 function0, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        AgentComputerScreenContent(z, agentComputerSurface, function0, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$23$0(C1BO c1bo, MutableState mutableState) {
        logStopDialogDismiss(C1BO.A08(c1bo));
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerScreenContent$lambda$25(boolean z, AgentComputerSurface agentComputerSurface, Function0 function0, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        AgentComputerScreenContent(z, agentComputerSurface, function0, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerViewerPage$lambda$12$0$0(Context context, String str, C1BO c1bo) {
        sharePageUrl(context, str, C1BO.A08(c1bo));
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerViewerPage$lambda$16(AgentComputerSurface agentComputerSurface, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z3, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        AgentComputerViewerPage(agentComputerSurface, z, z2, function0, function02, function03, function04, z3, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
