package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C06c;
import X.C10G;
import X.C3U4;
import X.G2j;
import com.facebook.aura.conversation.widget.api.ConversationTopBanner;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchTopBannerKt$lambda$1612865435$1 extends AbstractC7559F3s implements G2j<C06c, ConversationTopBanner, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchTopBannerKt$lambda$1612865435$1 INSTANCE = new ComposableSingletons$HatchTopBannerKt$lambda$1612865435$1();

    public ComposableSingletons$HatchTopBannerKt$lambda$1612865435$1() {
        super(4);
    }

    public final void invoke(C06c c06c, ConversationTopBanner conversationTopBanner, BFM bfm, int i) {
        if ((i & 48) == 0) {
            i |= AnonymousClass002.A06(AnonymousClass004.A1Y(conversationTopBanner, bfm, i) ? 1 : 0);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, i)) {
            bfm.Afo();
            return;
        }
        if (conversationTopBanner == null) {
            bfm.AgE(1075059898);
        } else {
            bfm.AgE(-519509977);
            conversationTopBanner.Render(C3U4.A08(C10G.A02, 16.0f), bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        }
        AnonymousClass002.A19(bfm);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, ConversationTopBanner conversationTopBanner, BFM bfm, Integer num) {
        invoke(c06c, conversationTopBanner, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
