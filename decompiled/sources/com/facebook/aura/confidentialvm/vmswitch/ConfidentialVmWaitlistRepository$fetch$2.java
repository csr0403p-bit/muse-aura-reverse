package com.facebook.aura.confidentialvm.vmswitch;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository$fetch$2", f = "ConfidentialVmWaitlistRepository.kt", l = {137}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmWaitlistRepository$fetch$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ConfidentialVmWaitlistJson>>, Object> {
    public final /* synthetic */ StefiHatchPath $endpoint;
    public final /* synthetic */ RequestType $requestType;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmWaitlistRepository$fetch$2(StefiHatchPath stefiHatchPath, RequestType requestType, HtJ<? super ConfidentialVmWaitlistRepository$fetch$2> htJ) {
        super(2, htJ);
        this.$endpoint = stefiHatchPath;
        this.$requestType = requestType;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmWaitlistRepository$fetch$2(this.$endpoint, this.$requestType, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ConfidentialVmWaitlistJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ConfidentialVmWaitlistJson>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1596executeBodylessStefiRequestWithtZkwj4A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            StefiHatchPath stefiHatchPath = this.$endpoint;
            RequestType requestType = this.$requestType;
            C9jH c9jHA0E = AGH.A0E();
            ConfidentialVmWaitlistRepository$fetch$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 confidentialVmWaitlistRepository$fetch$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = ConfidentialVmWaitlistRepository$fetch$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(confidentialVmWaitlistRepository$fetch$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, stefiHatchPath, requestType, null, null, c9jHA0E, c9jHA0E, this);
            if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM1596executeBodylessStefiRequestWithtZkwj4A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ConfidentialVmWaitlistJson>> htJ) {
        return ((ConfidentialVmWaitlistRepository$fetch$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
