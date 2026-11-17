package com.facebook.aura.appupdate;

import X.AnonymousClass002;
import X.BFM;
import X.C1er;
import X.C3cG;
import X.C78N;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.nudge.NudgeOutcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class AppUpdateNudgeKt {
    public static final String APP_UPDATE_NUDGE_ID = "app_update";
    public static final String FORCED_ELIGIBLE_KEY = "app_update_nudge_forced_eligible";
    public static final String IN_HOUSE_DECLINED_VERSION_KEY = "app_update_nudge_in_house_declined_version";
    public static final int MIN_STALENESS_DAYS = 3;
    public static final int SPACING_DAYS = 7;
    public static final String TAG = "AppUpdateNudge";

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraPlayFlexibleUpdateResult.values().length];
            try {
                AnonymousClass002.A13(AuraPlayFlexibleUpdateResult.ACCEPTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraPlayFlexibleUpdateResult.DECLINED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraPlayFlexibleUpdateResult.FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraPlayFlexibleUpdateResult.NOT_OFFERED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Function0<Unit> rememberInHouseUpdateAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i) {
        Context context = (Context) bfm.A6v(AndroidCompositionLocals_androidKt.A01);
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        boolean zA67 = bfm.A67(context) | bfm.A65(mutableStateA00);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AppUpdateNudgeKt$rememberInHouseUpdateAction$1$1(context, mutableStateA00);
            bfm.Ai0(objAaT);
        }
        return (Function0) objAaT;
    }

    public static final Function0<Unit> rememberPlayUpdateAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i) {
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        boolean zA65 = bfm.A65(mutableStateA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new AppUpdateNudgeKt$rememberPlayUpdateAction$1$1(mutableStateA00);
            bfm.Ai0(objAaT);
        }
        return (Function0) objAaT;
    }

    public static final NudgeOutcome toNudgeOutcome(AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult) {
        int iOrdinal = auraPlayFlexibleUpdateResult.ordinal();
        if (iOrdinal == 0) {
            return NudgeOutcome.COMPLETED;
        }
        if (iOrdinal == 1) {
            return NudgeOutcome.DECLINED;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return NudgeOutcome.FAILED;
        }
        throw C3cG.A0q();
    }
}
