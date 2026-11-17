package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import X.G0W;
import X.HxE;
import com.facebook.aura.markdown.render.spacing.BlockSpacingCategory;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$3 extends AbstractC7559F3s implements G0W<Integer, BFM, Integer, Unit> {
    public final /* synthetic */ List<HxE<BlockSpacingCategory, G0V<BFM, Integer, Unit>>> $sections;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$3(List<? extends HxE<? extends BlockSpacingCategory, ? extends G0V<? super BFM, ? super Integer, Unit>>> list) {
        super(3);
        this.$sections = list;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BFM bfm, Integer num2) {
        invoke(AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, BFM bfm, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= AnonymousClass004.A0D(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i2 & 19, 18), bfm, i2)) {
            AnonymousClass001.A1H(bfm, this.$sections.get(i).second, 0);
        } else {
            bfm.Afo();
        }
    }
}
