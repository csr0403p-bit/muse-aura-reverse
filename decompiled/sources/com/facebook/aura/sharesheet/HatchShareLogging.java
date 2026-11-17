package com.facebook.aura.sharesheet;

import X.AGH;
import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C0924AIa;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.HxE;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.activation.model.HatchInviteLogging;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.ShareType;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShareLogging {
    public static final int $stable = 0;
    public static final HatchShareLogging INSTANCE = new HatchShareLogging();

    /* renamed from: com.facebook.aura.sharesheet.HatchShareLogging$AvatarSwipeLogging$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchShareLogContext $context;
        public final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PagerState pagerState, HatchShareLogContext hatchShareLogContext, int i) {
            super(2);
            this.$pagerState = pagerState;
            this.$context = hatchShareLogContext;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShareLogging.this.AvatarSwipeLogging(this.$pagerState, this.$context, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public final Map<String, String> impressionMetadata$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(HatchShareLogContext hatchShareLogContext) {
        C7384Etj.A0Y(hatchShareLogContext, 0);
        Map<String, String> mapBaseMetadata = baseMetadata(hatchShareLogContext);
        if (mapBaseMetadata.isEmpty()) {
            return null;
        }
        return mapBaseMetadata;
    }

    public final void logAvatarSwipe(int i, HatchShareLogContext hatchShareLogContext) {
        C7384Etj.A0Y(hatchShareLogContext, 1);
        HatchInteractionLogger.INSTANCE.logSwipe(HatchSurface.SHARE_SHEET, null, HatchScreen.SHARE_SHEET, HatchComponent.SHARE_AVATAR_CAROUSEL, AGH.A02(baseMetadata(hatchShareLogContext), AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i))));
    }

    public final void logStoryEligibility(boolean z, HatchShareLogContext hatchShareLogContext) {
        C7384Etj.A0Y(hatchShareLogContext, 1);
        HatchAppEventLogger.INSTANCE.logEvent("share_story_eligibility_check", HatchSurface.SHARE_SHEET.getValue(), null, HatchInviteLogging.EVENT_TYPE_STATUS_CHECK, HatchComponent.SHARE_DESTINATION.getValue(), AGH.A02(baseMetadata(hatchShareLogContext), AnonymousClass007.A0d("result", z ? "eligible" : "ineligible", new HxE(HatchMetadataKey.SHARE_PLATFORM.getValue(), HatchShareLoggingKt.sharePlatform(HatchShareDestination.INSTAGRAM_STORIES)))), null);
    }

    public final HatchShareDismissLogging rememberShareSheetDismissLogging(HatchShareLogContext hatchShareLogContext, BFM bfm, int i) {
        C7384Etj.A0Y(hatchShareLogContext, 0);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new HatchShareDismissLogging();
            bfm.Ai0(objAaT);
        }
        HatchShareDismissLogging hatchShareDismissLogging = (HatchShareDismissLogging) objAaT;
        MutableState mutableStateA00 = C1er.A00(bfm, hatchShareLogContext);
        Unit unit = Unit.INSTANCE;
        boolean zA1N = AnonymousClass003.A1N(bfm, hatchShareDismissLogging, mutableStateA00);
        Object objAaT2 = bfm.AaT();
        if (zA1N || objAaT2 == obj) {
            objAaT2 = new HatchShareLogging$rememberShareSheetDismissLogging$1$1(hatchShareDismissLogging, mutableStateA00);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, unit);
        return hatchShareDismissLogging;
    }

    private final Map<String, String> baseMetadata(HatchShareLogContext hatchShareLogContext) {
        String analyticsValue;
        String str;
        String str2;
        C0924AIa c0924AIa = new C0924AIa();
        if (!hatchShareLogContext.isAvatarDance) {
            ShareType shareType = hatchShareLogContext.shareType;
            if (shareType != null && (analyticsValue = shareType.getAnalyticsValue()) != null) {
            }
            str = hatchShareLogContext.messageId;
            if (str != null && str.length() > 0) {
                AnonymousClass001.A1C(HatchMetadataKey.MESSAGE_ID, str, c0924AIa);
            }
            str2 = hatchShareLogContext.threadId;
            if (str2 != null && str2.length() > 0) {
                AnonymousClass001.A1C(HatchMetadataKey.THREAD_ID, str2, c0924AIa);
            }
            return AIW.A0K(c0924AIa);
        }
        analyticsValue = HatchShareLoggingKt.AVATAR_DANCE_CONTENT_TYPE;
        AnonymousClass001.A1C(HatchMetadataKey.SHARE_CONTENT_TYPE, analyticsValue, c0924AIa);
        str = hatchShareLogContext.messageId;
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.MESSAGE_ID, str, c0924AIa);
        }
        str2 = hatchShareLogContext.threadId;
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.THREAD_ID, str2, c0924AIa);
        }
        return AIW.A0K(c0924AIa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDismiss(HatchShareLogContext hatchShareLogContext) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHARE_SHEET;
        HatchScreen hatchScreen = HatchScreen.SHARE_SHEET;
        HatchComponent hatchComponent = HatchComponent.SHARE_SHEET;
        Map<String, String> mapBaseMetadata = baseMetadata(hatchShareLogContext);
        if (mapBaseMetadata.isEmpty()) {
            mapBaseMetadata = null;
        }
        hatchInteractionLogger.logDismiss(hatchSurface, null, hatchScreen, hatchComponent, null, mapBaseMetadata);
    }

    private final Map<String, String> recipientMetadata(HatchShareRecipient hatchShareRecipient, Integer num, HatchShareLogContext hatchShareLogContext) {
        String lowerCase;
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.putAll(INSTANCE.baseMetadata(hatchShareLogContext));
        c0924AIa.put(HatchMetadataKey.SHARE_PLATFORM.getValue(), HatchShareLoggingKt.sharePlatform(hatchShareRecipient.appTarget));
        c0924AIa.put(HatchMetadataKey.DIRECT_SHARE.getValue(), "true");
        String value = HatchMetadataKey.SHARE_RECIPIENT_TYPE.getValue();
        String foaContactTypeOrNull = HatchShareLoggingKt.getFoaContactTypeOrNull(hatchShareRecipient);
        if (foaContactTypeOrNull != null) {
            Locale locale = Locale.ROOT;
            C7384Etj.A0V(locale);
            lowerCase = foaContactTypeOrNull.toLowerCase(locale);
        } else {
            lowerCase = "unknown";
        }
        c0924AIa.put(value, lowerCase);
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIa, num.intValue());
        }
        return AIW.A0K(c0924AIa);
    }

    public final void AvatarSwipeLogging(PagerState pagerState, HatchShareLogContext hatchShareLogContext, BFM bfm, int i) {
        AnonymousClass003.A0u(pagerState, hatchShareLogContext);
        bfm.AgG(1723711612);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, pagerState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, hatchShareLogContext);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            MutableState mutableStateA00 = C1er.A00(bfm, hatchShareLogContext);
            boolean zA65 = bfm.A65(mutableStateA00) | AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchShareLogging$AvatarSwipeLogging$1$1(pagerState, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, pagerState);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pagerState, hatchShareLogContext, i);
        }
    }

    public final void logDestination(HatchShareDestination hatchShareDestination, HatchShareLogContext hatchShareLogContext) {
        AnonymousClass003.A0u(hatchShareDestination, hatchShareLogContext);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHARE_SHEET, HatchSubsurface.DESTINATION_BAR, HatchScreen.SHARE_SHEET, HatchComponent.SHARE_DESTINATION, null, AGH.A02(baseMetadata(hatchShareLogContext), AnonymousClass006.A10(HatchMetadataKey.SHARE_PLATFORM.getValue(), HatchShareLoggingKt.sharePlatform(hatchShareDestination))), null);
    }

    public final void logInviteLearnMore(HatchShareLogContext hatchShareLogContext) {
        HatchInteractionLogger hatchInteractionLoggerA0b = AnonymousClass006.A0b(hatchShareLogContext);
        HatchSurface hatchSurface = HatchSurface.SHARE_SHEET;
        HatchScreen hatchScreen = HatchScreen.SHARE_SHEET;
        HatchComponent hatchComponent = HatchComponent.SHARE_INVITE_LEARN_MORE;
        Map<String, String> mapBaseMetadata = baseMetadata(hatchShareLogContext);
        if (mapBaseMetadata.isEmpty()) {
            mapBaseMetadata = null;
        }
        hatchInteractionLoggerA0b.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, mapBaseMetadata, null);
    }

    public final void logRecipientSend(HatchShareRecipient hatchShareRecipient, Integer num, HatchShareLogContext hatchShareLogContext) {
        AnonymousClass003.A0v(hatchShareRecipient, hatchShareLogContext);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHARE_SHEET, HatchSubsurface.RECIPIENT_LIST, HatchScreen.SHARE_SHEET, HatchComponent.SHARE_RECIPIENT_ROW, null, recipientMetadata(hatchShareRecipient, num, hatchShareLogContext), null);
    }

    public final void logRecipientUndo(HatchShareRecipient hatchShareRecipient, Integer num, HatchShareLogContext hatchShareLogContext) {
        AnonymousClass003.A0v(hatchShareRecipient, hatchShareLogContext);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHARE_SHEET, HatchSubsurface.RECIPIENT_LIST, HatchScreen.SHARE_SHEET, HatchComponent.SHARE_RECIPIENT_UNDO, null, recipientMetadata(hatchShareRecipient, num, hatchShareLogContext), null);
    }
}
