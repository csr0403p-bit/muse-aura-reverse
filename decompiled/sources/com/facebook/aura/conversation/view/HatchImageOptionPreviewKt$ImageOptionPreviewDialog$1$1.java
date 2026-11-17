package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1", f = "HatchImageOptionPreview.kt", l = {235, 242}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<ImageOptionPreviewExit, Unit>> $currentOnClosed$delegate;
    public final /* synthetic */ MutableState<ImageOptionPreviewExit> $exit$delegate;
    public final /* synthetic */ boolean $hasTarget;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1(boolean z, AT5<Float, AOW> at5, MutableState<ImageOptionPreviewExit> mutableState, C1BO<? extends G0U<? super ImageOptionPreviewExit, Unit>> c1bo, HtJ<? super HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1> htJ) {
        super(2, htJ);
        this.$hasTarget = z;
        this.$progress = at5;
        this.$exit$delegate = mutableState;
        this.$currentOnClosed$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1(this.$hasTarget, this.$progress, this.$exit$delegate, this.$currentOnClosed$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            value = this.$exit$delegate.getValue();
            boolean z = this.$hasTarget;
            if (value == null) {
                if (z) {
                    AT5<Float, AOW> at5 = this.$progress;
                    Float fA0m = AnonymousClass001.A0m();
                    C1003AOr c1003AOr = new C1003AOr(null, 0.6f, 400.0f);
                    this.L$0 = null;
                    this.label = 1;
                    if (AnonymousClass002.A0i(at5, c1003AOr, fA0m, this, null) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else if (z) {
                AT5<Float, AOW> at52 = this.$progress;
                Float fA0l = AnonymousClass001.A0l();
                C1003AOr c1003AOr2 = new C1003AOr(null, 0.9f, 400.0f);
                this.L$0 = value;
                this.label = 2;
                if (AnonymousClass002.A0i(at52, c1003AOr2, fA0l, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                C1BO.A0B(this.$currentOnClosed$delegate).invoke(value);
            } else {
                C1BO.A0B(this.$currentOnClosed$delegate).invoke(value);
            }
        } else if (i == 1) {
            Hwg.A00(obj);
        } else {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            value = this.L$0;
            Hwg.A00(obj);
            C1BO.A0B(this.$currentOnClosed$delegate).invoke(value);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchImageOptionPreviewKt$ImageOptionPreviewDialog$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
