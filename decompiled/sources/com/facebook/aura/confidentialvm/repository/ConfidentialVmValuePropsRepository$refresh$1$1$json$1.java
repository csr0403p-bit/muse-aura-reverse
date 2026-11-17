package com.facebook.aura.confidentialvm.repository;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3UX;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepository$refresh$1$1$json$1", f = "ConfidentialVmValuePropsRepository.kt", l = {301}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmValuePropsRepository$refresh$1$1$json$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmValuePropsJson>, Object> {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    public ConfidentialVmValuePropsRepository$refresh$1$1$json$1(HtJ<? super ConfidentialVmValuePropsRepository$refresh$1$1$json$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmValuePropsRepository$refresh$1$1$json$1(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1596executeBodylessStefiRequestWithtZkwj4A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            ConfidentialVmStefiPath.CvmValueProps cvmValueProps = ConfidentialVmStefiPath.CvmValueProps.INSTANCE;
            RequestType requestType = RequestType.GET;
            C9jH c9jHA0E = AGH.A0E();
            ConfidentialVmValuePropsRepository$refresh$1$1$json$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 confidentialVmValuePropsRepository$refresh$1$1$json$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = ConfidentialVmValuePropsRepository$refresh$1$1$json$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(confidentialVmValuePropsRepository$refresh$1$1$json$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, cvmValueProps, requestType, null, null, c9jHA0E, c9jHA0E, this);
            if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
        }
        if (objM1596executeBodylessStefiRequestWithtZkwj4A instanceof C10571Hud) {
            return null;
        }
        return objM1596executeBodylessStefiRequestWithtZkwj4A;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmValuePropsJson> htJ) {
        return new ConfidentialVmValuePropsRepository$refresh$1$1$json$1(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
