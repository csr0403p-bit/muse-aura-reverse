package com.facebook.aura.graduation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00s;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$2$1", f = "GraduationStoryPlayer.kt", l = {133}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class GraduationStoryPlayerKt$GraduationStoryPlayer$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00s $durationMs$delegate;
    public final /* synthetic */ HatchVideoPlayer $player;
    public final /* synthetic */ C00s $positionMs$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationStoryPlayerKt$GraduationStoryPlayer$2$1(HatchVideoPlayer hatchVideoPlayer, C00s c00s, C00s c00s2, HtJ<? super GraduationStoryPlayerKt$GraduationStoryPlayer$2$1> htJ) {
        super(2, htJ);
        this.$player = hatchVideoPlayer;
        this.$positionMs$delegate = c00s;
        this.$durationMs$delegate = c00s2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new GraduationStoryPlayerKt$GraduationStoryPlayer$2$1(this.$player, this.$positionMs$delegate, this.$durationMs$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        do {
            C00s c00s = this.$positionMs$delegate;
            long currentPosition = this.$player.getCurrentPosition();
            if (currentPosition < 0) {
                currentPosition = 0;
            }
            c00s.Adh(currentPosition);
            C00s c00s2 = this.$durationMs$delegate;
            long duration = this.$player.getDuration();
            if (duration < 0) {
                duration = 0;
            }
            c00s2.Adh(duration);
            this.label = 1;
        } while (C7Bq.A01(50L, this) != enumC10460Hji);
        return enumC10460Hji;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((GraduationStoryPlayerKt$GraduationStoryPlayer$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
