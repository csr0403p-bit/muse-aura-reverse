package com.facebook.aura.appupdate;

import X.AGH;
import X.AbstractC2271BQs;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BzK;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HzP;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.appupdate.OfferedUpdate;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.NudgeContent;
import com.facebook.aura.nudge.NudgeExpiry;
import com.facebook.aura.nudge.NudgeOutcome;
import com.facebook.aura.nudge.NudgePolicy;
import com.facebook.aura.nudge.NudgePresentation;
import com.facebook.aura.nudge.NudgeSurface;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AppUpdateNudge implements ConversationNudge {
    public static final String id = "app_update";
    public static volatile OfferedUpdate offeredUpdate = null;
    public static final int priority = 100;
    public static final AppUpdateNudge INSTANCE = new AppUpdateNudge();
    public static final NudgePolicy policy = new NudgePolicy(Integer.MAX_VALUE, 7, new NudgeExpiry(60000, true), false);

    @DebugMetadata(c = "com.facebook.aura.appupdate.AppUpdateNudge", f = "AppUpdateNudge.kt", l = {74}, m = "isEligible", v = 2)
    /* renamed from: com.facebook.aura.appupdate.AppUpdateNudge$isEligible$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppUpdateNudge.this.isEligible(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.appupdate.AppUpdateNudge", f = "AppUpdateNudge.kt", l = {126}, m = "playUpdateBlocker", v = 2)
    /* renamed from: com.facebook.aura.appupdate.AppUpdateNudge$playUpdateBlocker$1, reason: invalid class name and case insensitive filesystem */
    public final class C109441 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C109441(HtJ<? super C109441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppUpdateNudge.this.playUpdateBlocker(this);
        }
    }

    private final boolean isRecentlyUpdated(Context context) {
        return System.currentTimeMillis() - context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime < 604800000;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public Function0<Unit> rememberAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i) {
        Function0<Unit> function0RememberInHouseUpdateAction;
        C7384Etj.A0Y(g0u, 0);
        bfm.AgE(-1638405546);
        if (AuraInstallSourceDetector.INSTANCE.isPlayStoreInstall((Context) bfm.A6v(AndroidCompositionLocals_androidKt.A01))) {
            bfm.AgE(-1731122665);
            function0RememberInHouseUpdateAction = AppUpdateNudgeKt.rememberPlayUpdateAction(g0u, bfm, i & 14);
        } else {
            bfm.AgE(-1731064044);
            function0RememberInHouseUpdateAction = AppUpdateNudgeKt.rememberInHouseUpdateAction(g0u, bfm, i & 14);
        }
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, false);
        return function0RememberInHouseUpdateAction;
    }

    private final String inHouseUpdateBlocker() {
        String dueSoftUpdateVersion = AppUpdateChecker.INSTANCE.getDueSoftUpdateVersion();
        if (dueSoftUpdateVersion == null) {
            return "no_soft_block";
        }
        if (dueSoftUpdateVersion.equals(HatchPrefsStore.INSTANCE.internalPrefs().getString(AppUpdateNudgeKt.IN_HOUSE_DECLINED_VERSION_KEY, null))) {
            return "declined_version";
        }
        offeredUpdate = new OfferedUpdate.InHouse(dueSoftUpdateVersion);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object playUpdateBlocker(X.HtJ<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.appupdate.AppUpdateNudge.C109441
            if (r0 == 0) goto L40
            r5 = r7
            com.facebook.aura.appupdate.AppUpdateNudge$playUpdateBlocker$1 r5 = (com.facebook.aura.appupdate.AppUpdateNudge.C109441) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L8a
            X.Hwg.A00(r4)
        L20:
            com.facebook.aura.appupdate.AuraPlayUpdateStatus r4 = (com.facebook.aura.appupdate.AuraPlayUpdateStatus) r4
            if (r4 != 0) goto L46
            java.lang.String r3 = "play_unavailable"
            return r3
        L27:
            X.Hwg.A00(r4)
            com.facebook.aura.appupdate.AuraPlayInAppUpdater r0 = com.facebook.aura.appupdate.AuraPlayInAppUpdater.INSTANCE
            boolean r0 = r0.shouldForceUpdate()
            if (r0 == 0) goto L35
            java.lang.String r3 = "force_update"
            return r3
        L35:
            com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion r0 = com.facebook.aura.appupdate.AuraPlayUpdateStatus.Companion
            r5.label = r1
            java.lang.Object r4 = r0.read(r5)
            if (r4 != r3) goto L20
            return r3
        L40:
            com.facebook.aura.appupdate.AppUpdateNudge$playUpdateBlocker$1 r5 = new com.facebook.aura.appupdate.AppUpdateNudge$playUpdateBlocker$1
            r5.<init>(r7)
            goto L12
        L46:
            int r2 = r4.availableVersionCode
            boolean r0 = r4.updateAvailable
            if (r0 != 0) goto L4f
            java.lang.String r3 = "no_update"
            return r3
        L4f:
            com.facebook.aura.appupdate.AuraPlayInstallState r1 = r4.installState
            com.facebook.aura.appupdate.AuraPlayInstallState r0 = com.facebook.aura.appupdate.AuraPlayInstallState.NONE
            if (r1 == r0) goto L58
            java.lang.String r3 = "install_in_progress"
            return r3
        L58:
            boolean r0 = r4.flexibleUpdateAllowed
            if (r0 != 0) goto L5f
            java.lang.String r3 = "flexible_not_allowed"
            return r3
        L5f:
            java.lang.Integer r0 = r4.stalenessDays
            if (r0 == 0) goto L87
            int r1 = r0.intValue()
            r0 = 3
            if (r1 < r0) goto L87
            com.facebook.aura.appupdate.AuraPlayUpdateRecovery r1 = com.facebook.aura.appupdate.AuraPlayUpdateRecovery.INSTANCE
            boolean r0 = r1.isBlocked(r2)
            if (r0 == 0) goto L75
            java.lang.String r3 = "declined_version"
            return r3
        L75:
            int r0 = r1.getAttemptedVersion()
            if (r2 != r0) goto L7e
            java.lang.String r3 = "attempted_version"
            return r3
        L7e:
            r3 = 0
            com.facebook.aura.appupdate.OfferedUpdate$Play r0 = new com.facebook.aura.appupdate.OfferedUpdate$Play
            r0.<init>(r2)
            com.facebook.aura.appupdate.AppUpdateNudge.offeredUpdate = r0
            return r3
        L87:
            java.lang.String r3 = "not_stale"
            return r3
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AppUpdateNudge.playUpdateBlocker(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public String getId() {
        return id;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgePolicy getPolicy() {
        return policy;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public int getPriority() {
        return priority;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ Set<NudgeSurface> getSurfaces() {
        return Collections.singleton(NudgeSurface.PHONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    @Override // com.facebook.aura.nudge.ConversationNudge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isEligible(android.content.Context r7, X.AbstractC3358CGz r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.appupdate.AppUpdateNudge.AnonymousClass1
            if (r0 == 0) goto L65
            r5 = r9
            com.facebook.aura.appupdate.AppUpdateNudge$isEligible$1 r5 = (com.facebook.aura.appupdate.AppUpdateNudge.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L6b
            X.Hwg.A00(r4)
        L20:
            if (r4 != 0) goto L49
        L22:
            java.lang.String r2 = "none"
        L24:
            java.lang.String r1 = "AppUpdateNudge"
            java.lang.String r0 = "Eligibility blocker=%s"
            X.CFK.A03(r2, r1, r0)
            if (r4 == 0) goto L2e
            r3 = 0
        L2e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L33:
            X.Hwg.A00(r4)
            r4 = 0
            com.facebook.aura.appupdate.AppUpdateNudge.offeredUpdate = r4
            com.facebook.aura.appupdate.AppUpdateNudgeDebug r0 = com.facebook.aura.appupdate.AppUpdateNudgeDebug.INSTANCE
            boolean r0 = r0.isForcedEligible$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate()
            if (r0 != 0) goto L22
            boolean r0 = r6.isRecentlyUpdated(r7)
            if (r0 == 0) goto L4b
            java.lang.String r4 = "recently_updated"
        L49:
            r2 = r4
            goto L24
        L4b:
            com.facebook.aura.installsource.AuraInstallSourceDetector r0 = com.facebook.aura.installsource.AuraInstallSourceDetector.INSTANCE
            boolean r0 = r0.isPlayStoreInstall(r7)
            if (r0 == 0) goto L60
            r5.L$0 = r4
            r5.L$1 = r4
            r5.label = r3
            java.lang.Object r4 = r6.playUpdateBlocker(r5)
            if (r4 != r1) goto L20
            return r1
        L60:
            java.lang.String r4 = r6.inHouseUpdateBlocker()
            goto L20
        L65:
            com.facebook.aura.appupdate.AppUpdateNudge$isEligible$1 r5 = new com.facebook.aura.appupdate.AppUpdateNudge$isEligible$1
            r5.<init>(r9)
            goto L12
        L6b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AppUpdateNudge.isEligible(android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onDeclined() {
        OfferedUpdate offeredUpdate2 = offeredUpdate;
        if (offeredUpdate2 instanceof OfferedUpdate.Play) {
            AuraPlayUpdateRecovery.INSTANCE.block(((OfferedUpdate.Play) offeredUpdate2).versionCode, false);
            return;
        }
        if (!(offeredUpdate2 instanceof OfferedUpdate.InHouse)) {
            if (offeredUpdate2 != null) {
                throw C3cG.A0q();
            }
        } else {
            BzK bzKA01 = BzK.A01();
            bzKA01.AYr(AppUpdateNudgeKt.IN_HOUSE_DECLINED_VERSION_KEY, ((OfferedUpdate.InHouse) offeredUpdate2).versionName);
            bzKA01.apply();
        }
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onReset() {
        AppUpdateNudgeDebug.INSTANCE.clearForcedEligible$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate();
        BzK bzKA01 = BzK.A01();
        bzKA01.Aae(AppUpdateNudgeKt.IN_HOUSE_DECLINED_VERSION_KEY);
        bzKA01.apply();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onShown() {
        AppUpdateNudgeDebug.INSTANCE.clearForcedEligible$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgeContent content(BFM bfm, int i) {
        bfm.AgE(-1146690673);
        NudgeContent nudgeContent = new NudgeContent(R.drawable.hatch_logo, AbstractC2271BQs.A02(bfm, new Object[]{HatchAppName.value}, R.string._name_removed__res_0x7f12062e), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120628), 2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12062d), 3, false, null, NudgePresentation.CARD, null);
        BBI.A0R((BBI) bfm, false);
        return nudgeContent;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ Map<String, String> logMetadata() {
        return AGH.A0E();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i, i2);
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* synthetic */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i);
    }
}
