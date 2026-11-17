package com.facebook.aura.devices.token;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.G0U;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LinkDeviceKeys$Companion$forSession$1 extends AbstractC7559F3s implements Function0<LinkDeviceKeys> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeys$Companion$forSession$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<LinkDeviceKeys, Unit> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkDeviceKeys linkDeviceKeys) {
            C7384Etj.A0Y(linkDeviceKeys, 0);
            LinkDeviceKeyRevocationRetrier.Companion.start$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(this.$userSession, linkDeviceKeys);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz) {
            super(1);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceKeys linkDeviceKeys) {
            invoke2(linkDeviceKeys);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeys$Companion$forSession$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinkDeviceKeys invoke() {
        LinkDeviceKeySessionEnvironment linkDeviceKeySessionEnvironment = new LinkDeviceKeySessionEnvironment(this.$userSession);
        C8eO c8eO = new C8eO(null);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        return new LinkDeviceKeys(linkDeviceKeySessionEnvironment, C78W.A05(c8eO, auraDispatchers.io()), auraDispatchers.io(), new AnonymousClass1(this.$userSession));
    }
}
