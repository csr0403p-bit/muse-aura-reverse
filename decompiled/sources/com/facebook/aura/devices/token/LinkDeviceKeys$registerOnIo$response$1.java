package com.facebook.aura.devices.token;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys$registerOnIo$response$1", f = "LinkDeviceKeys.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceKeys$registerOnIo$response$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends LinkDeviceKeyRegisterResponseJson>>, Object> {
    public final /* synthetic */ LinkDeviceKeyRegisterRequestJson $request;
    public final /* synthetic */ LinkDeviceKeyTarget $target;
    public int label;
    public final /* synthetic */ LinkDeviceKeys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeys$registerOnIo$response$1(LinkDeviceKeys linkDeviceKeys, LinkDeviceKeyTarget linkDeviceKeyTarget, LinkDeviceKeyRegisterRequestJson linkDeviceKeyRegisterRequestJson, HtJ<? super LinkDeviceKeys$registerOnIo$response$1> htJ) {
        super(1, htJ);
        this.this$0 = linkDeviceKeys;
        this.$target = linkDeviceKeyTarget;
        this.$request = linkDeviceKeyRegisterRequestJson;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkDeviceKeys$registerOnIo$response$1(this.this$0, this.$target, this.$request, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objMo731register0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LinkDeviceKeyEnvironment linkDeviceKeyEnvironment = this.this$0.environment;
            String str = this.$target.gatewayUrl;
            LinkDeviceKeyRegisterRequestJson linkDeviceKeyRegisterRequestJson = this.$request;
            this.label = 1;
            objMo731register0E7RQCE = linkDeviceKeyEnvironment.mo731register0E7RQCE(str, linkDeviceKeyRegisterRequestJson, this);
            if (objMo731register0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objMo731register0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objMo731register0E7RQCE);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<LinkDeviceKeyRegisterResponseJson>> htJ) {
        return ((LinkDeviceKeys$registerOnIo$response$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends LinkDeviceKeyRegisterResponseJson>> htJ) {
        return invoke2((HtJ<? super HsJ<LinkDeviceKeyRegisterResponseJson>>) htJ);
    }
}
