package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.token.LinkDeviceApp;
import com.facebook.aura.devices.token.LinkDeviceTokenMintResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceTokens$mintResult$1", f = "LinkEncryptedSetupCoordinator.kt", l = {318}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator$mintDeviceTokens$mintResult$1 extends AbstractC07127nr implements G0U<HtJ<? super LinkDeviceTokenMintResult>, Object> {
    public final /* synthetic */ String $sdkToken;
    public final /* synthetic */ LinkEncryptedSetupSnapshot $snapshot;
    public int label;
    public final /* synthetic */ LinkEncryptedSetupCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkEncryptedSetupCoordinator$mintDeviceTokens$mintResult$1(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, String str, HtJ<? super LinkEncryptedSetupCoordinator$mintDeviceTokens$mintResult$1> htJ) {
        super(1, htJ);
        this.this$0 = linkEncryptedSetupCoordinator;
        this.$snapshot = linkEncryptedSetupSnapshot;
        this.$sdkToken = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkEncryptedSetupCoordinator$mintDeviceTokens$mintResult$1(this.this$0, this.$snapshot, this.$sdkToken, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            G2j<String, LinkDeviceApp, String, HtJ<? super LinkDeviceTokenMintResult>, Object> g2j = this.this$0.deviceTokenMinter;
            LinkEncryptedSetup linkEncryptedSetup = this.$snapshot.setup;
            String str = linkEncryptedSetup.deviceInfo.nodeId;
            LinkDeviceApp linkDeviceApp = linkEncryptedSetup.session.isCommunity ? LinkDeviceApp.MUSE_GADGET__DANGEROUSLY_HAS_FULL_CHAT_ACCESS : LinkDeviceApp.MUSE_HOME_LINK__NO_CHAT_ACCESS;
            String str2 = this.$sdkToken;
            this.label = 1;
            obj = g2j.invoke(str, linkDeviceApp, str2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super LinkDeviceTokenMintResult> htJ) {
        return ((LinkEncryptedSetupCoordinator$mintDeviceTokens$mintResult$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
