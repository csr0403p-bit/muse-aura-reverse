package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult;
import com.facebook.aura.devices.token.LinkDeviceKeyRegistration;
import com.facebook.aura.devices.token.LinkDeviceKeyTarget;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$Companion$forSession$3", f = "LinkDeviceKeyProvisioning.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceKeyProvisioning$Companion$forSession$3 extends AbstractC07127nr implements G2j<LinkDeviceKeyRegistration, LinkDeviceKeyTarget, LinkDeviceKeyRecord, HtJ<? super LinkDeviceKeyRegisterResult>, Object> {
    public final /* synthetic */ LinkDeviceKeys $deviceKeys;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeyProvisioning$Companion$forSession$3(LinkDeviceKeys linkDeviceKeys, HtJ<? super LinkDeviceKeyProvisioning$Companion$forSession$3> htJ) {
        super(4, htJ);
        this.$deviceKeys = linkDeviceKeys;
    }

    @Override // X.G2j
    public final Object invoke(LinkDeviceKeyRegistration linkDeviceKeyRegistration, LinkDeviceKeyTarget linkDeviceKeyTarget, LinkDeviceKeyRecord linkDeviceKeyRecord, HtJ<? super LinkDeviceKeyRegisterResult> htJ) {
        LinkDeviceKeyProvisioning$Companion$forSession$3 linkDeviceKeyProvisioning$Companion$forSession$3 = new LinkDeviceKeyProvisioning$Companion$forSession$3(this.$deviceKeys, htJ);
        linkDeviceKeyProvisioning$Companion$forSession$3.L$0 = linkDeviceKeyRegistration;
        linkDeviceKeyProvisioning$Companion$forSession$3.L$1 = linkDeviceKeyTarget;
        linkDeviceKeyProvisioning$Companion$forSession$3.L$2 = linkDeviceKeyRecord;
        return linkDeviceKeyProvisioning$Companion$forSession$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        LinkDeviceKeyRegistration linkDeviceKeyRegistration = (LinkDeviceKeyRegistration) this.L$0;
        LinkDeviceKeyTarget linkDeviceKeyTarget = (LinkDeviceKeyTarget) this.L$1;
        LinkDeviceKeyRecord linkDeviceKeyRecord = (LinkDeviceKeyRecord) this.L$2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LinkDeviceKeys linkDeviceKeys = this.$deviceKeys;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = linkDeviceKeys.register(linkDeviceKeyRegistration, linkDeviceKeyTarget, linkDeviceKeyRecord, this);
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
}
