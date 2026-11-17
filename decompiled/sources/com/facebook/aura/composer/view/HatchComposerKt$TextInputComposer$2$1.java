package com.facebook.aura.composer.view;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$TextInputComposer$2$1", f = "HatchComposer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $nameHintText;
    public final /* synthetic */ MutableState<Boolean> $showNameHint$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$2$1(String str, MutableState<Boolean> mutableState, HtJ<? super HatchComposerKt$TextInputComposer$2$1> htJ) {
        super(2, htJ);
        this.$nameHintText = str;
        this.$showNameHint$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchComposerKt$TextInputComposer$2$1(this.$nameHintText, this.$showNameHint$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.label
            if (r0 != 0) goto L1d
            X.Hwg.A00(r2)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r2 = r1.$showNameHint$delegate
            java.lang.String r0 = r1.$nameHintText
            if (r0 == 0) goto L14
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            r0 = r0 ^ 1
            androidx.compose.runtime.MutableState.A09(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L1d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.view.HatchComposerKt$TextInputComposer$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchComposerKt$TextInputComposer$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
