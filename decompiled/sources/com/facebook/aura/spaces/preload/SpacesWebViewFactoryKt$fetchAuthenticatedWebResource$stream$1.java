package com.facebook.aura.spaces.preload;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60O;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1", f = "SpacesWebViewFactory.kt", l = {1538}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpResponseStream>, Object> {
    public final /* synthetic */ HatchHttpRequest $hatchRequest;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1(HatchHttpRequest hatchHttpRequest, HtJ<? super SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1> htJ) {
        super(2, htJ);
        this.$hatchRequest = hatchHttpRequest;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1(this.$hatchRequest, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpResponseStream> htJ) {
        return new SpacesWebViewFactoryKt$fetchAuthenticatedWebResource$stream$1(this.$hatchRequest, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpClient hatchHttpClientA08 = C60O.A08();
            HatchHttpRequest hatchHttpRequest = this.$hatchRequest;
            this.label = 1;
            obj = hatchHttpClientA08.openResponseStream(hatchHttpRequest, this);
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
