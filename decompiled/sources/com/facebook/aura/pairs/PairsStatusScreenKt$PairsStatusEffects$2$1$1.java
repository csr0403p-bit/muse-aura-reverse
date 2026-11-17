package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.pairs.PairsStatusEffect;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsStatusScreenKt$PairsStatusEffects$2$1$1", f = "PairsStatusScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsStatusScreenKt$PairsStatusEffects$2$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<PairsStatusEffect.Leave> $leaveToast$delegate;
    public final /* synthetic */ String $text;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsStatusScreenKt$PairsStatusEffects$2$1$1(String str, MutableState<PairsStatusEffect.Leave> mutableState, HtJ<? super PairsStatusScreenKt$PairsStatusEffects$2$1$1> htJ) {
        super(2, htJ);
        this.$text = str;
        this.$leaveToast$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsStatusScreenKt$PairsStatusEffects$2$1$1(this.$text, this.$leaveToast$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = this.$text;
        if (str != null) {
            ToastApi.INSTANCE.showToast(str);
        }
        this.$leaveToast$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PairsStatusScreenKt$PairsStatusEffects$2$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
