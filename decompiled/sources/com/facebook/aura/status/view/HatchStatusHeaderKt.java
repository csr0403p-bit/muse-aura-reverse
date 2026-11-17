package com.facebook.aura.status.view;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0924AIa;
import X.C7384Etj;
import X.C98f;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointLogger;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.status.viewmodel.OutOfCreditsCta;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchStatusHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278 A[PHI: r4
  0x0278: PHI (r4v8 com.facebook.aura.status.viewmodel.OutOfCreditsCta) = (r4v7 com.facebook.aura.status.viewmodel.OutOfCreditsCta), (r4v16 com.facebook.aura.status.viewmodel.OutOfCreditsCta) binds: [B:53:0x015c, B:55:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    /* renamed from: HatchStatusHeader-osbwsH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2227HatchStatusHeaderosbwsH8(X.BRg r42, java.lang.String r43, float r44, boolean r45, com.facebook.aura.status.viewmodel.HatchStatusPillUiState r46, com.facebook.aura.status.viewmodel.OutOfCreditsCta r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusHeaderKt.m2227HatchStatusHeaderosbwsH8(X.BRg, java.lang.String, float, boolean, com.facebook.aura.status.viewmodel.HatchStatusPillUiState, com.facebook.aura.status.viewmodel.OutOfCreditsCta, X.BFM, int, int):void");
    }

    public static final Map<String, String> entrypointViewerData(OutOfCreditsCta outOfCreditsCta) {
        C0924AIa c0924AIa = new C0924AIa();
        Boolean bool = outOfCreditsCta.isPaidTier;
        if (bool != null) {
            AnonymousClass003.A0s(HatchMetadataKey.IS_PAID_TIER, c0924AIa, bool.booleanValue());
        }
        String str = outOfCreditsCta.currentTier;
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CURRENT_TIER, str, c0924AIa);
        }
        c0924AIa.put(HatchMetadataKey.CTA_ACTION.getValue(), getCtaAction(outOfCreditsCta.destination).name());
        return AIW.A0K(c0924AIa);
    }

    public static final SubscriptionManagementAction getCtaAction(AuraSubscriptionPage auraSubscriptionPage) {
        if (C7384Etj.areEqual(auraSubscriptionPage, AuraSubscriptionPage.Paywall.INSTANCE) || C7384Etj.areEqual(auraSubscriptionPage, AuraSubscriptionPage.ConfirmName.INSTANCE)) {
            return SubscriptionManagementAction.OPEN_PAYWALL;
        }
        if (C7384Etj.areEqual(auraSubscriptionPage, AuraSubscriptionPage.Usage.INSTANCE)) {
            return SubscriptionManagementAction.CHANGE_PLAN;
        }
        if (auraSubscriptionPage instanceof AuraSubscriptionPage.BuyCredits) {
            return SubscriptionManagementAction.BUY_TOPUP;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void launchOutOfCreditsUpgrade(AuraNavigator auraNavigator, OutOfCreditsCta outOfCreditsCta) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.CREDITS, HatchScreen.BOT_SHEET, HatchComponent.UPGRADE_LINK, null, AnonymousClass006.A10(HatchMetadataKey.CTA_ACTION.getValue(), getCtaAction(outOfCreditsCta.destination).name()), null);
        new HatchNMEEntrypointLogger(null, 1, null).logClick(C98f.A03, entrypointViewerData(outOfCreditsCta));
        auraNavigator.navigate((AuraNavKey) new AuraSubscriptionSheetKey(outOfCreditsCta.destination, SubscriptionPaywallEntryPoint.STATUS, null), false);
    }

    /* renamed from: StatusHeaderAvatarSpacer--orJrPs, reason: not valid java name */
    public static final void m2228StatusHeaderAvatarSpacerorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        float fRememberAvatarSizeDp;
        bfm.AgG(-534482489);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AvatarTakeover avatarTakeover = (AvatarTakeover) bfm.A6v(AvatarTakeoverKt.LocalAvatarTakeover);
            if (avatarTakeover == null || !avatarTakeover.isVisible()) {
                AnonymousClass003.A0l(bfm, -1323837442);
                fRememberAvatarSizeDp = f;
            } else {
                bfm.AgE(-1323906758);
                fRememberAvatarSizeDp = HatchAvatarSizeKt.rememberAvatarSizeDp(HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0), bfm, 0);
                AnonymousClass001.A1D(bfm);
            }
            C01N.A0A(bfm, bRg, fRememberAvatarSizeDp);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchStatusHeaderKt$StatusHeaderAvatarSpacer$1(f, bRg, i, i2);
        }
    }
}
