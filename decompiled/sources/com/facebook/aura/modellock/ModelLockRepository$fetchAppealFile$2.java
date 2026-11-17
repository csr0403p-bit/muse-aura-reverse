package com.facebook.aura.modellock;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchHttpResponse;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$2", f = "ModelLockRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ModelLockRepository$fetchAppealFile$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ModelLockAppealFile>>, Object> {
    public final /* synthetic */ ModelLockOwner $owner;
    public final /* synthetic */ HatchHttpResponse $response;
    public int label;
    public final /* synthetic */ ModelLockRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockRepository$fetchAppealFile$2(ModelLockRepository modelLockRepository, HatchHttpResponse hatchHttpResponse, ModelLockOwner modelLockOwner, HtJ<? super ModelLockRepository$fetchAppealFile$2> htJ) {
        super(2, htJ);
        this.this$0 = modelLockRepository;
        this.$response = hatchHttpResponse;
        this.$owner = modelLockOwner;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ModelLockRepository$fetchAppealFile$2(this.this$0, this.$response, this.$owner, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new HsJ(this.this$0.m1443appealFileFromgIAlus(this.$response, this.$owner));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ModelLockAppealFile>> htJ) {
        return ((ModelLockRepository$fetchAppealFile$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ModelLockAppealFile>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ModelLockAppealFile>>) htJ);
    }
}
