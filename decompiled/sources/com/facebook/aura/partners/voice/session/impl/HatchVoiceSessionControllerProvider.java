package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.CH0;
import X.G0U;
import android.content.Context;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.session.intf.VoiceSessionControllerProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceSessionControllerProvider implements VoiceSessionControllerProvider {
    public static final HatchVoiceSessionControllerProvider INSTANCE = new HatchVoiceSessionControllerProvider();

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchVoiceSessionControllerProvider$create$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchRealTimeSessionController $rtController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchRealTimeSessionController hatchRealTimeSessionController) {
            super(0);
            this.$rtController = hatchRealTimeSessionController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$rtController.close();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchVoiceSessionControllerProvider$create$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public final /* synthetic */ HatchRealTimeSessionController $rtController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchRealTimeSessionController hatchRealTimeSessionController) {
            super(1);
            this.$rtController = hatchRealTimeSessionController;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.$rtController.setJoinRequestsVideoMedia(z);
        }
    }

    @Override // com.facebook.aura.partners.voice.session.intf.VoiceSessionControllerProvider
    public VoiceCallManager create(Context context, C3UX c3ux, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass005.A0x(context, c3ux, abstractC3358CGz);
        HatchCallJoinContext hatchCallJoinContext = new HatchCallJoinContext();
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        CH0 ch0 = (CH0) abstractC3358CGz;
        String str = ch0.A01;
        String str2 = CH0.A01(ch0).A04;
        if (str2 == null) {
            str2 = "";
        }
        HatchRealTimeSessionController hatchRealTimeSessionController = new HatchRealTimeSessionController(context, str, str2, companion, hatchCallJoinContext);
        HatchIdentityProvider companion2 = HatchIdentityProvider.Companion.getInstance(abstractC3358CGz);
        String gatewayUrl = C3cG.A0D(abstractC3358CGz).getGatewayUrl();
        String str3 = CH0.A01(ch0).A04;
        if (str3 == null) {
            str3 = "";
        }
        SessionController sessionController = new SessionController(context, c3ux, hatchRealTimeSessionController, companion2, abstractC3358CGz, gatewayUrl, str3, hatchCallJoinContext, new AnonymousClass1(hatchRealTimeSessionController), new AnonymousClass2(hatchRealTimeSessionController));
        hatchRealTimeSessionController.onStartPhase = new HatchVoiceSessionControllerProvider$create$3$1(sessionController);
        hatchRealTimeSessionController.onOrphanedSessionStarted = new HatchVoiceSessionControllerProvider$create$3$2(sessionController);
        hatchRealTimeSessionController.onOrphanedSessionEnded = new HatchVoiceSessionControllerProvider$create$3$3(sessionController);
        sessionController.registerVoiceControlHandler$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl();
        return sessionController;
    }
}
