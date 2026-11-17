package com.facebook.aura.common.video;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchTransport;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.common.video.HatchTransportHttpDataSource$open$response$1", f = "HatchTransportHttpDataSource.kt", l = {78}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchTransportHttpDataSource$open$response$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponseStream>, Object> {
    public final /* synthetic */ HatchHttpRequest $request;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTransportHttpDataSource$open$response$1(HatchHttpRequest hatchHttpRequest, HtJ<? super HatchTransportHttpDataSource$open$response$1> htJ) {
        super(2, htJ);
        this.$request = hatchHttpRequest;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchTransportHttpDataSource$open$response$1(this.$request, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponseStream> htJ) {
        return new HatchTransportHttpDataSource$open$response$1(this.$request, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpClient hatchHttpClientHttpClient = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.VM_JWT);
            HatchHttpRequest hatchHttpRequest = this.$request;
            this.label = 1;
            obj = hatchHttpClientHttpClient.openResponseStream(hatchHttpRequest, this);
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
