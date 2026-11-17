package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C0861A6i;
import X.C10571Hud;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C9hr;
import X.C9iG;
import X.C9u8;
import X.F60;
import X.G0V;
import X.HsJ;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.main.api.TimeSpentModules;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.ArtifactsDetailScreenKey;
import com.facebook.aura.navigation.key.AuraActivationSubscriptionScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataChoiceScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferConfirmScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmDataTransferProgressScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmReviewArtifactsScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSetupLoginScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchIntroScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchPlansScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchProgressScreenKey;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import com.facebook.aura.navigation.key.ContentViewerTarget;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import com.facebook.aura.navigation.key.GoalsCompletedScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.navigation.key.MediaGalleryScreenKey;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class LoggingAuraNavigatorKt {

    /* renamed from: com.facebook.aura.main.LoggingAuraNavigatorKt$WarmStartNavigationEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator, int i) {
            super(2);
            this.$navigator = auraNavigator;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            LoggingAuraNavigatorKt.WarmStartNavigationEffect(this.$navigator, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void WarmStartNavigationEffect(AuraNavigator auraNavigator, BFM bfm, int i) {
        C7384Etj.A0Y(auraNavigator, 0);
        bfm.AgG(-568474892);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraNavigator, bfm, i) ? 1 : 0) | i : i;
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(auraNavigator))) {
                z = true;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new LoggingAuraNavigatorKt$WarmStartNavigationEffect$1$1(auraNavigator, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, auraNavigator);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraNavigator, i);
        }
    }

    public static final HatchNavTTRCSpec.Surface toNavTtrcSurface(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        if (auraNavKey instanceof ConversationTabScreenKey) {
            return HatchNavTTRCSpec.Surface.CHAT;
        }
        if (auraNavKey instanceof LibraryScreenKey) {
            return HatchNavTTRCSpec.Surface.LIBRARY;
        }
        if (auraNavKey instanceof HatchGoalsTabScreenKey) {
            return HatchNavTTRCSpec.Surface.GOALS;
        }
        if (auraNavKey instanceof ExploreScreenKey) {
            return HatchNavTTRCSpec.Surface.IDEAS;
        }
        if (auraNavKey instanceof SpaceTabScreenKey) {
            return HatchNavTTRCSpec.Surface.SPACES;
        }
        return null;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegisterPinEntryPoint.values().length];
            try {
                AnonymousClass002.A13(RegisterPinEntryPoint.SVM_TO_CVM_SWITCH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RegisterPinEntryPoint.SVM_TO_CVM_DATA_TRANSFER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(RegisterPinEntryPoint.ONBOARDING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(RegisterPinEntryPoint.ACTIVATION, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(RegisterPinEntryPoint.INTERNAL_SETTINGS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(RegisterPinEntryPoint.SETTINGS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(RegisterPinEntryPoint.CVM_ENROLLMENT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchModule toPinStepModule(RegisterPinEntryPoint registerPinEntryPoint) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (registerPinEntryPoint.ordinal()) {
            case 0:
            case 1:
            case 4:
                return null;
            case 2:
            case 3:
                return HatchModule.HATCH_ONBOARDING;
            case 5:
            case 6:
                return HatchModule.HATCH_CVM_SWITCH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final HatchModule toShellModule(AuraNavKey auraNavKey) {
        RegisterPinEntryPoint registerPinEntryPoint;
        if (!(auraNavKey instanceof ActivationScreenKey)) {
            if (auraNavKey instanceof ConversationTabScreenKey) {
                return HatchModule.HATCH_CHAT;
            }
            if ((auraNavKey instanceof SpaceTabScreenKey) || (auraNavKey instanceof SpacesModalScreenKey)) {
                return HatchModule.HATCH_SPACES;
            }
            if (auraNavKey instanceof FeedScreenKey) {
                return HatchModule.HATCH_FEED;
            }
            if (auraNavKey instanceof ExploreScreenKey) {
                return HatchModule.HATCH_IDEAS;
            }
            if (auraNavKey instanceof LibraryScreenKey) {
                return HatchModule.HATCH_LIBRARY;
            }
            if (auraNavKey instanceof HatchGoalsTabScreenKey) {
                return HatchModule.HATCH_GOALS;
            }
            if (auraNavKey instanceof GoalDetailScreenKey) {
                return HatchModule.HATCH_GOAL_DETAILS;
            }
            if (auraNavKey instanceof GoalsCompletedScreenKey) {
                return HatchModule.HATCH_GOALS_COMPLETED;
            }
            if (auraNavKey instanceof HatchSettingsPushScreenKey) {
                return HatchModule.HATCH_SETTINGS;
            }
            if (auraNavKey instanceof ContentViewerScreenKey) {
                return ((ContentViewerScreenKey) auraNavKey).target instanceof ContentViewerTarget.Artifact ? HatchModule.HATCH_ARTIFACT_VIEWER : HatchModule.HATCH_MEDIA_VIEWER;
            }
            if (auraNavKey instanceof ArtifactsDetailScreenKey) {
                return HatchModule.HATCH_LIBRARY_ARTIFACTS;
            }
            if (auraNavKey instanceof MediaGalleryScreenKey) {
                return HatchModule.HATCH_LIBRARY_MEDIA;
            }
            if ((auraNavKey instanceof ConfidentialVmSwitchIntroScreenKey) || (auraNavKey instanceof ConfidentialVmSwitchPlansScreenKey) || (auraNavKey instanceof ConfidentialVmDataChoiceScreenKey) || (auraNavKey instanceof ConfidentialVmReviewArtifactsScreenKey) || (auraNavKey instanceof ConfidentialVmDataTransferConfirmScreenKey) || (auraNavKey instanceof ConfidentialVmSwitchProgressScreenKey) || (auraNavKey instanceof ConfidentialVmDataTransferProgressScreenKey)) {
                return HatchModule.HATCH_CVM_SWITCH;
            }
            if (auraNavKey instanceof ConfidentialVmRegisterPinScreenKey) {
                registerPinEntryPoint = ((ConfidentialVmRegisterPinScreenKey) auraNavKey).entryPoint;
            } else if (auraNavKey instanceof ConfidentialVmSetupLoginScreenKey) {
                registerPinEntryPoint = ((ConfidentialVmSetupLoginScreenKey) auraNavKey).entryPoint;
            } else if (!(auraNavKey instanceof AuraActivationSubscriptionScreenKey)) {
                return null;
            }
            return toPinStepModule(registerPinEntryPoint);
        }
        return HatchModule.HATCH_ONBOARDING;
    }

    public static final AuraNavigator rememberLoggingAuraNavigator(AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, BFM bfm, int i) {
        AnonymousClass003.A0u(abstractC3358CGz, navBackStack);
        AuraNavigator auraNavigatorRememberAuraNavigator = AuraNavigatorKt.rememberAuraNavigator(navBackStack, bfm, (i >> 3) & 14);
        boolean zA1K = AnonymousClass003.A1K(bfm, abstractC3358CGz, auraNavigatorRememberAuraNavigator);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = new LoggingAuraNavigator(abstractC3358CGz, auraNavigatorRememberAuraNavigator, navBackStack);
            bfm.Ai0(objAaT);
        }
        return (LoggingAuraNavigator) objAaT;
    }

    public static final String screenName(AuraNavKey auraNavKey) {
        Object c10571Hud;
        C0861A6i c0861A6i;
        C9hr c9hrA02;
        try {
            c0861A6i = new C0861A6i(auraNavKey.getClass());
            c9hrA02 = C9u8.A02(c0861A6i);
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        if (c9hrA02 == null) {
            C9iG.A01(c0861A6i);
            throw F60.createAndThrow();
        }
        String strAKP = c9hrA02.getDescriptor().AKP();
        c10571Hud = C7BY.A0R(strAKP, strAKP, '.');
        if (HsJ.A00(c10571Hud) != null) {
            c10571Hud = "UnknownNavKey";
        }
        return (String) c10571Hud;
    }

    public static final HatchModule toHatchModule(AuraNavKey auraNavKey) {
        HatchModule shellModule = toShellModule(auraNavKey);
        return shellModule == null ? TimeSpentModules.INSTANCE.moduleFor(auraNavKey) : shellModule;
    }
}
