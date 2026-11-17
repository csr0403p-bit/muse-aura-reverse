package com.facebook.aura.feed.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedUnitRowKt$FeedVideoMedia$1$1", f = "FeedUnitRow.kt", l = {966}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoMedia$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    public final /* synthetic */ boolean $isStopped;
    public final /* synthetic */ AT5<Float, AOW> $posterAlpha;
    public final /* synthetic */ MutableState<Boolean> $retainPlayer$delegate;
    public final /* synthetic */ boolean $showVideo;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedVideoMedia$1$1(AT5<Float, AOW> at5, boolean z, boolean z2, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, HtJ<? super FeedUnitRowKt$FeedVideoMedia$1$1> htJ) {
        super(2, htJ);
        this.$posterAlpha = at5;
        this.$showVideo = z;
        this.$isStopped = z2;
        this.$retainPlayer$delegate = mutableState;
        this.$hasRendered$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedUnitRowKt$FeedVideoMedia$1$1(this.$posterAlpha, this.$showVideo, this.$isStopped, this.$retainPlayer$delegate, this.$hasRendered$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$posterAlpha;
            Float f = new Float(AnonymousClass003.A02(this.$showVideo ? 1 : 0));
            ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, 200);
            this.label = 1;
            if (AnonymousClass002.A0i(at5, aSjA0J, f, this, null) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!this.$showVideo && this.$isStopped) {
            MutableState.A09(false, this.$retainPlayer$delegate);
            MutableState.A09(false, this.$hasRendered$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedUnitRowKt$FeedVideoMedia$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
