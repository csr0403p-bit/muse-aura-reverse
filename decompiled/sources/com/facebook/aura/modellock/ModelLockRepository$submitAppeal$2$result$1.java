package com.facebook.aura.modellock;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.modellock.ModelLockRepository$submitAppeal$2$result$1", f = "ModelLockRepository.kt", l = {194}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ModelLockRepository$submitAppeal$2$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ ModelLockAppealFile $appealFile;
    public final /* synthetic */ String $text;
    public int label;
    public final /* synthetic */ ModelLockRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockRepository$submitAppeal$2$result$1(ModelLockRepository modelLockRepository, ModelLockAppealFile modelLockAppealFile, String str, HtJ<? super ModelLockRepository$submitAppeal$2$result$1> htJ) {
        super(1, htJ);
        this.this$0 = modelLockRepository;
        this.$appealFile = modelLockAppealFile;
        this.$text = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new ModelLockRepository$submitAppeal$2$result$1(this.this$0, this.$appealFile, this.$text, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1444submit0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ModelLockRepository modelLockRepository = this.this$0;
            ModelLockAppealFile modelLockAppealFile = this.$appealFile;
            String str = this.$text;
            this.label = 1;
            objM1444submit0E7RQCE = modelLockRepository.m1444submit0E7RQCE(modelLockAppealFile, str, this);
            if (objM1444submit0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1444submit0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return new HsJ(objM1444submit0E7RQCE);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<Unit>> htJ) {
        return ((ModelLockRepository$submitAppeal$2$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2((HtJ<? super HsJ<Unit>>) htJ);
    }
}
