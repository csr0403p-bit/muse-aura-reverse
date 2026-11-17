package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.C06G;
import X.C10G;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedUnitBody$1$1$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ FeedUnit $unit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedUnitBody$1$1$1$2(FeedUnit feedUnit) {
        super(2);
        this.$unit = feedUnit;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            String bodyMarkdown = this.$unit.getBodyMarkdown();
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            long jA0D = C06G.A0D(bfm);
            AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(bodyMarkdown, FeedUnitRowKt.unitInsets(C10G.A02), c1822ArmA0Z, false, null, this.$unit.getId(), new B6A(jA0D), null, null, false, false, null, bfm, 0, 0, 3992);
            return;
        }
        bfm.Afo();
    }
}
