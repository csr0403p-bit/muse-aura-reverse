package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C3U4;
import X.G0W;
import com.facebook.aura.explore.repo.IdeaCardSection;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ IdeaCardSection $section;
    public final /* synthetic */ int $sectionIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$2(IdeaCardSection ideaCardSection, int i) {
        super(3);
        this.$section = ideaCardSection;
        this.$sectionIndex = i;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            String str = this.$section.title;
            BS0 bs0 = BRg.A00;
            float f = 0.0f;
            if (this.$sectionIndex == 0) {
                f = 12.0f;
            }
            HatchIdeasTabScreenKt.IdeasListTitle(str, C3U4.A0C(bs0, 16.0f, f, 16.0f, 4.0f), bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
