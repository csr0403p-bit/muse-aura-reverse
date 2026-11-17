package com.facebook.aura.user.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.login.nativeflow.HatchDisclosurePresentation;
import com.facebook.aura.login.nativeflow.HatchReTosKt;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.user.repo.AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1", f = "AuraUserRepository.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ActivationStatusesResponseJson>>, Object> {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    public AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1(HtJ<? super AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1(htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ActivationStatusesResponseJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ActivationStatusesResponseJson>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1596executeBodylessStefiRequestWithtZkwj4A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            List<HatchDisclosurePresentation> list = HatchReTosKt.RETOS_SUPPORTED_PRESENTATIONS;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<HatchDisclosurePresentation> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().getWireValue());
            }
            StefiHatchPath.ActivationStatuses activationStatuses = new StefiHatchPath.ActivationStatuses(arrayListA0i);
            RequestType requestType = RequestType.GET;
            C9jH c9jHA0E = AGH.A0E();
            AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 auraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(auraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, activationStatuses, requestType, null, null, c9jHA0E, c9jHA0E, this);
            if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1596executeBodylessStefiRequestWithtZkwj4A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ActivationStatusesResponseJson>> htJ) {
        return new AuraUserRepository$fetchFromStefi$2$activationStatusesDeferred$1(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
