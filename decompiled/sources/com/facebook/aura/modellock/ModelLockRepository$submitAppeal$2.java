package com.facebook.aura.modellock;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.HwV;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.modellock.ModelLockRepository$submitAppeal$2", f = "ModelLockRepository.kt", l = {194}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ModelLockRepository$submitAppeal$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ String $additionalInfo;
    public final /* synthetic */ ModelLockAppealFile $appealFile;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ModelLockRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockRepository$submitAppeal$2(String str, ModelLockAppealFile modelLockAppealFile, ModelLockRepository modelLockRepository, HtJ<? super ModelLockRepository$submitAppeal$2> htJ) {
        super(2, htJ);
        this.$additionalInfo = str;
        this.$appealFile = modelLockAppealFile;
        this.this$0 = modelLockRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ModelLockRepository$submitAppeal$2(this.$additionalInfo, this.$appealFile, this.this$0, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String strA0l = AnonymousClass002.A0l(this.$additionalInfo);
            ModelLockAppealFile modelLockAppealFile = this.$appealFile;
            HwV hwV = new HwV(modelLockAppealFile.owner, modelLockAppealFile.sha256, strA0l);
            ModelLockRepository modelLockRepository = this.this$0;
            SingleFlight singleFlight = modelLockRepository.submitSingleFlight;
            ModelLockRepository$submitAppeal$2$result$1 modelLockRepository$submitAppeal$2$result$1 = new ModelLockRepository$submitAppeal$2$result$1(modelLockRepository, modelLockAppealFile, strA0l, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = singleFlight.invoke(hwV, modelLockRepository$submitAppeal$2$result$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
        if (singleFlightResult instanceof SingleFlightResult.Result) {
            objA0s = ((HsJ) ((SingleFlightResult.Result) singleFlightResult).value).value;
        } else {
            if (!C7384Etj.areEqual(singleFlightResult, SingleFlightResult.Skipped.INSTANCE)) {
                throw C3cG.A0q();
            }
            objA0s = C3cG.A0s(C3cG.A0Q("skipped"));
        }
        return new HsJ(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Unit>> htJ) {
        return ((ModelLockRepository$submitAppeal$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<Unit>>) htJ);
    }
}
