package com.facebook.aura.file.view;

import X.AOW;
import X.ARY;
import X.AT5;
import X.AWx;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.ZoomState$transform$1", f = "FileViewerZoom.kt", l = {91, AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ZoomState$transform$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $coercedZoom;
    public final /* synthetic */ long $panChange;
    public final /* synthetic */ long $updatedOffset;
    public int label;
    public final /* synthetic */ ZoomState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomState$transform$1(ZoomState zoomState, long j, long j2, float f, HtJ<? super ZoomState$transform$1> htJ) {
        super(2, htJ);
        this.this$0 = zoomState;
        this.$updatedOffset = j;
        this.$panChange = j2;
        this.$coercedZoom = f;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ZoomState$transform$1(this.this$0, this.$updatedOffset, this.$panChange, this.$coercedZoom, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<AWx, ARY> at5 = this.this$0.offsetAnimation;
            AWx aWx = new AWx(AWx.A05(this.$updatedOffset, this.$panChange));
            this.label = 1;
            if (at5.A04(aWx, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        AT5<Float, AOW> at52 = this.this$0.scaleAnimation;
        Float f = new Float(this.$coercedZoom);
        this.label = 2;
        if (at52.A04(f, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ZoomState$transform$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
