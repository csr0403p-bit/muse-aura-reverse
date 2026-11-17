package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.G0W;
import com.facebook.aura.tabs.AuraSidePanelTabsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ float $collapseProgress;
    public final /* synthetic */ int $sectionIndex;
    public final /* synthetic */ Integer $sectionTitleRes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$1(Integer num, int i, float f) {
        super(3);
        this.$sectionTitleRes = num;
        this.$sectionIndex = i;
        this.$collapseProgress = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, this.$sectionTitleRes.intValue());
            int i2 = this.$sectionIndex;
            BRg bRgA04 = BRg.A00;
            if (i2 != 0) {
                bRgA04 = C3U4.A04(bRgA04, HatchConversationHistorySidePanelKt.SidePanelMainChatDividerVerticalPadding);
            }
            HatchConversationHistorySidePanelKt.SidePanelSectionTitle(strA01, AuraSidePanelTabsKt.sidePanelSectionCollapse(bRgA04, this.$collapseProgress), null, false, false, null, bfm, 0, 60);
            return;
        }
        bfm.Afo();
    }
}
