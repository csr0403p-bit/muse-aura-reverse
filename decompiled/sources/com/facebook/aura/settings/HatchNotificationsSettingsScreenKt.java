package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1515AkP;
import X.C1DG;
import X.C3U4;
import X.C78N;
import X.C7OU;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchNotificationsSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Boolean> $hasNotifyPermission$delegate;
        public final /* synthetic */ boolean $isApi33Plus;
        public final /* synthetic */ C7OU<String, Boolean> $notifyPermissionLauncher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C7OU<String, Boolean> c7ou, Context context, boolean z, MutableState<Boolean> mutableState) {
            super(4);
            this.$notifyPermissionLauncher = c7ou;
            this.$context = context;
            this.$isApi33Plus = z;
            this.$hasNotifyPermission$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1956invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1956invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = AnonymousClass006.A0M(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgA0M, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh));
            C7OU<String, Boolean> c7ou = this.$notifyPermissionLauncher;
            Context context = this.$context;
            boolean z = this.$isApi33Plus;
            MutableState<Boolean> mutableState = this.$hasNotifyPermission$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            boolean zA1M = AnonymousClass003.A1M(bfm, c7ou, context);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$1$1$1$1(z, c7ou, context, mutableState);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            C01N.A08(bfm, bs0, 12.0f);
            HatchSettingsDescriptionKt.HatchSettingsDescription(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f3b), null, bfm, 0, 2);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNotificationsSettingsScreenKt.HatchNotificationsSettingsScreen(this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchNotificationsSettingsScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.BRg r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchNotificationsSettingsScreenKt.HatchNotificationsSettingsScreen(kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void logDeniedDialogCancelTapped() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.NOTIFICATIONS, HatchScreen.NOTIFICATIONS, HatchComponent.CANCEL_BUTTON, null, null, null);
    }

    public static final void logDeniedDialogDismissed() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.NOTIFICATIONS, HatchScreen.NOTIFICATIONS, HatchComponent.CANCEL_BUTTON, null, null);
    }

    public static final void logNotificationSettingsOpened() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.NOTIFICATIONS, HatchScreen.NOTIFICATIONS, HatchComponent.NOTIFICATION_PERMISSION, null, AnonymousClass006.A10(HatchMetadataKey.ACTION.getValue(), "opened_settings"), null);
    }
}
