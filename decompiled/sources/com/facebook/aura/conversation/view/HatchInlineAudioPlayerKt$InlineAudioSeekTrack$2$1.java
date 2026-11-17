package com.facebook.aura.conversation.view;

import X.AT3;
import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineAudioPlayerKt$InlineAudioSeekTrack$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ Function0<Float> $drawProgress;
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ long $trackColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fAh4 = at3.Ah4(4.0f);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fAh4 / 2.0f);
        long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L);
        long jAKb = at3.AKb();
        float fA01 = (AnonymousClass001.A01(jAKb, 4294967295L) - fAh4) / 2.0f;
        long j2 = this.$trackColor;
        long jA0L = AnonymousClass005.A0L(0.0f, fA01);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(AnonymousClass001.A00(jAKb));
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fAh4) & 4294967295L;
        C16a c16a = C16a.A00;
        at3.A9j(null, c16a, 1.0f, 3, j2, jA0L, (jFloatToRawIntBits2 << 32) | jFloatToRawIntBits3, j);
        if (AnonymousClass001.A00(at3.AKb()) * ATD.A03(AnonymousClass003.A04(this.$drawProgress), 0.0f, 1.0f) > 0.0f) {
            at3.A9j(null, c16a, 1.0f, 3, this.$fillColor, jA0L, (Float.floatToRawIntBits(r1) << 32) | jFloatToRawIntBits3, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineAudioPlayerKt$InlineAudioSeekTrack$2$1(long j, Function0<Float> function0, long j2) {
        super(1);
        this.$trackColor = j;
        this.$drawProgress = function0;
        this.$fillColor = j2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
