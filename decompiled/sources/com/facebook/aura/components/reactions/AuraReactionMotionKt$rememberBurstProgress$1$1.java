package com.facebook.aura.components.reactions;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.components.reactions.AuraReactionMotionKt$rememberBurstProgress$1$1", f = "AuraReactionMotion.kt", l = {145, 146, 148}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraReactionMotionKt$rememberBurstProgress$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $active;
    public final /* synthetic */ int $durationMs;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ MutableState<Boolean> $wasActive$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraReactionMotionKt$rememberBurstProgress$1$1(boolean z, AT5<Float, AOW> at5, int i, MutableState<Boolean> mutableState, HtJ<? super AuraReactionMotionKt$rememberBurstProgress$1$1> htJ) {
        super(2, htJ);
        this.$active = z;
        this.$progress = at5;
        this.$durationMs = i;
        this.$wasActive$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraReactionMotionKt$rememberBurstProgress$1$1(this.$active, this.$progress, this.$durationMs, this.$wasActive$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA04;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$active || MutableState.A0A((MutableState) this.$wasActive$delegate)) {
                if (!this.$active) {
                    AT5<Float, AOW> at5 = this.$progress;
                    Float fA0l = AnonymousClass001.A0l();
                    this.label = 3;
                    objA04 = at5.A04(fA0l, this);
                }
                MutableState.A09(this.$active, this.$wasActive$delegate);
                return Unit.INSTANCE;
            }
            AT5<Float, AOW> at52 = this.$progress;
            Float fA0l2 = AnonymousClass001.A0l();
            this.label = 1;
            if (at52.A04(fA0l2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            AT5<Float, AOW> at53 = this.$progress;
            Float fA0m = AnonymousClass001.A0m();
            ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, this.$durationMs);
            this.label = 2;
            objA04 = AnonymousClass002.A0i(at53, aSjA0J, fA0m, this, null);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                MutableState.A09(this.$active, this.$wasActive$delegate);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            AT5<Float, AOW> at532 = this.$progress;
            Float fA0m2 = AnonymousClass001.A0m();
            ASj aSjA0J2 = AnonymousClass002.A0J(C2HU.A02, this.$durationMs);
            this.label = 2;
            objA04 = AnonymousClass002.A0i(at532, aSjA0J2, fA0m2, this, null);
        }
        if (objA04 == enumC10460Hji) {
            return enumC10460Hji;
        }
        MutableState.A09(this.$active, this.$wasActive$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraReactionMotionKt$rememberBurstProgress$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
