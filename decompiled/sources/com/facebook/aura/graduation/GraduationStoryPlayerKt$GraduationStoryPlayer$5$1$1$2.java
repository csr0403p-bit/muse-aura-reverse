package com.facebook.aura.graduation;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C06c;
import X.G2j;
import com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$2 extends AbstractC7559F3s implements G2j<C06c, Integer, BFM, Integer, Unit> {
    public final /* synthetic */ AHD<GraduationChapterUiModel> $chapters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$2(AHD<GraduationChapterUiModel> ahd) {
        super(4);
        this.$chapters = ahd;
    }

    public final void invoke(C06c c06c, int i, BFM bfm, int i2) {
        if ((i2 & 48) == 0) {
            i2 |= AnonymousClass004.A0E(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i2 & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, i2)) {
            GraduationStoryPlayerKt.GraduationChapterText((GraduationChapterUiModel) this.$chapters.get(i), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, Integer num, BFM bfm, Integer num2) {
        invoke(c06c, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
