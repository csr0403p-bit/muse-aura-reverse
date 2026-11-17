package com.facebook.aura.channels.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ChannelConnectScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.channels.connect.ComposableSingletons$ChannelConnectEntryProviderKt$lambda$-1734296719$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1 extends AbstractC7559F3s implements G0W<ChannelConnectScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1 INSTANCE = new ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1();

    public ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ChannelConnectScreenKey channelConnectScreenKey, BFM bfm, Integer num) {
        invoke(channelConnectScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ChannelConnectScreenKey channelConnectScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(channelConnectScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ChannelConnectEntryProviderKt$lambda$1734296719$1$onDismiss$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        String str = channelConnectScreenKey.channel;
        int iHashCode = str.hashCode();
        if (iHashCode != -1436108013) {
            if (iHashCode != -1360467711) {
                if (iHashCode == 1934780818 && str.equals(NativeLoginAccountResolverKt.WHATSAPP_USER_ID)) {
                    bfm.AgE(-211828135);
                    ChannelConnectOverlayKt.WhatsAppConnectContent(channelConnectScreenKey.utmSource, function0, bfm, 0);
                    AnonymousClass001.A1D(bfm);
                    return;
                }
                AnonymousClass003.A0l(bfm, -211822436);
                function0.invoke();
            }
            if (str.equals("telegram")) {
                bfm.AgE(-211830989);
                ChannelConnectOverlayKt.TelegramConnectContent(channelConnectScreenKey.intent, function0, bfm, 0, 0);
                AnonymousClass001.A1D(bfm);
                return;
            }
            AnonymousClass003.A0l(bfm, -211822436);
            function0.invoke();
        }
        if (str.equals("messenger")) {
            bfm.AgE(-211825068);
            ChannelConnectOverlayKt.MessengerConnectContent(channelConnectScreenKey.intent, function0, bfm, 0, 0);
            AnonymousClass001.A1D(bfm);
            return;
        }
        AnonymousClass003.A0l(bfm, -211822436);
        function0.invoke();
    }
}
