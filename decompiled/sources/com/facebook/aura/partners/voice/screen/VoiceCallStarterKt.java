package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.BuyCreditsEntrySurface;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.infra.VoiceNuxRepository;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceCallStarterKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallStarterKt$proceedToVoiceCall$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$userSession = abstractC3358CGz;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoiceCallStateHolder.Companion.getInstance(this.$userSession).notifyOutOfCredits();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallStarterKt$proceedToVoiceCall$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Boolean> $isStartWanted;
        public final /* synthetic */ VoiceCallStart $start;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Function0<Boolean> function0, AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart) {
            super(0);
            this.$isStartWanted = function0;
            this.$userSession = abstractC3358CGz;
            this.$threadId = str;
            this.$start = voiceCallStart;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (AnonymousClass003.A1Y(this.$isStartWanted)) {
                VoiceCallStarterKt.startVoiceCall(this.$userSession, this.$threadId, this.$start);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static final void openOutOfCreditsSheet(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, HatchComponent hatchComponent, Map<String, String> map) {
        AnonymousClass005.A10(auraNavigator, abstractC3358CGz, hatchComponent);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.CREDITS, HatchScreen.MAIN_CHAT, hatchComponent, null, map, null);
        auraNavigator.navigate((AuraNavKey) new AuraSubscriptionSheetKey(AuraSubscriptionUsageViewModelKt.subscriptionOutOfCreditsPage(AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz).getCurrentSubscriptionDetails(), BuyCreditsEntrySurface.VOICE_OUT_OF_CREDITS), SubscriptionPaywallEntryPoint.CHAT, null), false);
    }

    public static final void proceedToVoiceCall(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart, Function0<Boolean> function0, Function0<Boolean> function02, Function0<Boolean> function03, Function0<Unit> function04) {
        C7384Etj.A0Y(auraNavigator, 0);
        AnonymousClass005.A16(abstractC3358CGz, voiceCallStart, function0, function02, 1);
        AnonymousClass003.A10(function03, function04);
        if (AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz).isOutOfVoiceCredits()) {
            function04.invoke();
            return;
        }
        VoiceCallStarterKt$proceedToVoiceCall$showNux$1 voiceCallStarterKt$proceedToVoiceCall$showNux$1 = new VoiceCallStarterKt$proceedToVoiceCall$showNux$1(function03, function02, auraNavigator, str, voiceCallStart);
        if (voiceCallStart.entryPoint == VoiceCallEntryPoint.META_APP && VoiceGating.INSTANCE.getRequiresNuxForMetaAppCall()) {
            voiceCallStarterKt$proceedToVoiceCall$showNux$1.invoke();
        } else if (AnonymousClass003.A1Y(function0)) {
            startVoiceCallAfterNux(abstractC3358CGz, str, voiceCallStart);
        } else {
            VoiceNuxRepository.Companion.getInstance(abstractC3358CGz).checkNuxBeforeCall(new AnonymousClass5(function03, abstractC3358CGz, str, voiceCallStart), voiceCallStarterKt$proceedToVoiceCall$showNux$1);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallStarterKt$proceedToVoiceCall$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallStarterKt$proceedToVoiceCall$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallStarterKt$proceedToVoiceCall$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    public static final boolean blockIfOnOtherCall(AbstractC3358CGz abstractC3358CGz, String str) {
        if (!DeviceCallStateTracker.INSTANCE.isInCallNow()) {
            return false;
        }
        C3cG.A0K(abstractC3358CGz).notifyOtherCallBlockedStart(str);
        return true;
    }

    public static /* synthetic */ void openOutOfCreditsSheet$default(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, HatchComponent hatchComponent, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        openOutOfCreditsSheet(auraNavigator, abstractC3358CGz, hatchComponent, map);
    }

    public static /* synthetic */ void proceedToVoiceCall$default(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Object obj) {
        if ((i & 16) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        if ((i & 32) != 0) {
            function02 = AnonymousClass2.INSTANCE;
        }
        if ((i & 64) != 0) {
            function03 = AnonymousClass3.INSTANCE;
        }
        if ((i & 128) != 0) {
            function04 = new AnonymousClass4(abstractC3358CGz);
        }
        proceedToVoiceCall(auraNavigator, abstractC3358CGz, str, voiceCallStart, function0, function02, function03, function04);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<com.facebook.aura.partners.voice.intf.VoiceCallStart, kotlin.Unit> rememberConversationCallStarter(java.lang.String r21, boolean r22, kotlin.jvm.functions.Function0<java.lang.Boolean> r23, kotlin.jvm.functions.Function0<java.lang.Boolean> r24, kotlin.jvm.functions.Function0<java.lang.Boolean> r25, X.BFM r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallStarterKt.rememberConversationCallStarter(java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):X.G0U");
    }

    public static final boolean rememberInternetUnavailable(BFM bfm, int i) {
        return C1BO.A07(bfm, AuraNetworkMonitor.state) instanceof AuraNetworkState.Offline;
    }

    public static final /* synthetic */ VoiceCallStart access$rememberConversationCallStarter$lambda$5(MutableState mutableState) {
        return (VoiceCallStart) mutableState.getValue();
    }

    public static final void startVoiceCall(AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart) {
        AnonymousClass003.A0v(abstractC3358CGz, voiceCallStart);
        if (blockIfOnOtherCall(abstractC3358CGz, str)) {
            return;
        }
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGz);
        if (C3cH.A1P(voiceCallStateHolderA0K) || !AuraNetworkMonitor.INSTANCE.isKnownOffline()) {
            voiceCallStateHolderA0K.requestCallStart(str, voiceCallStart);
        } else {
            voiceCallStateHolderA0K.notifyNoNetworkCallBlocked();
        }
    }

    public static final void startVoiceCallAfterNux(AbstractC3358CGz abstractC3358CGz, String str, VoiceCallStart voiceCallStart) {
        AnonymousClass003.A0v(abstractC3358CGz, voiceCallStart);
        VoiceNuxRepository.Companion.getInstance(abstractC3358CGz).markSeen();
        startVoiceCall(abstractC3358CGz, str, voiceCallStart);
    }
}
