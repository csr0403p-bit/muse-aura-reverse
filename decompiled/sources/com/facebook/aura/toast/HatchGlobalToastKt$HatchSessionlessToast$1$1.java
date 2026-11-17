package com.facebook.aura.toast;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.toast.HatchGlobalToastKt$HatchSessionlessToast$1$1", f = "HatchGlobalToast.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGlobalToastKt$HatchSessionlessToast$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ View $parentView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGlobalToastKt$HatchSessionlessToast$1$1(View view, HtJ<? super HatchGlobalToastKt$HatchSessionlessToast$1$1> htJ) {
        super(2, htJ);
        this.$parentView = view;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGlobalToastKt$HatchSessionlessToast$1$1(this.$parentView, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            View view = this.$parentView;
            this.label = 1;
            if (HatchGlobalToastKt.collectToasts(view, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchGlobalToastKt$HatchSessionlessToast$1$1(this.$parentView, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
