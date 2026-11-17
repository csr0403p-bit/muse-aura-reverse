package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1", f = "HatchSourcesBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1(Function0<Unit> function0, HtJ<? super HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1> htJ) {
        super(2, htJ);
        this.$onDismiss = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1(this.$onDismiss, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$onDismiss.invoke();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchSourcesBottomSheetKt$HatchSourcesBottomSheet$1$1(this.$onDismiss, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
