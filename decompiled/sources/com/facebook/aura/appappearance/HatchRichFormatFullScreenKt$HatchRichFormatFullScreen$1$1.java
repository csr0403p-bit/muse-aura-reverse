package com.facebook.aura.appappearance;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.appappearance.HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1", f = "HatchRichFormatFullScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModelData;
    public final /* synthetic */ Function0<Unit> $onDismissClick;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1(HatchContentViewModelData hatchContentViewModelData, Function0<Unit> function0, HtJ<? super HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1> htJ) {
        super(2, htJ);
        this.$contentViewModelData = hatchContentViewModelData;
        this.$onDismissClick = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1(this.$contentViewModelData, this.$onDismissClick, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$contentViewModelData == null) {
            this.$onDismissClick.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchRichFormatFullScreenKt$HatchRichFormatFullScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
