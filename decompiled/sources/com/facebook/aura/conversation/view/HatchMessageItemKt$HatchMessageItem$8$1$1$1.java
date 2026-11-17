package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.G0U;
import X.G0V;
import X.HxE;
import com.facebook.aura.markdown.render.spacing.BlockSpacingCategory;
import com.facebook.aura.markdown.render.spacing.BlockSpacingKt;
import com.facebook.aura.markdown.render.spacing.BlockSpacingSpec;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$1$1 extends AbstractC7559F3s implements G0U<Integer, BlockSpacingSpec> {
    public final /* synthetic */ List<HxE<BlockSpacingCategory, G0V<BFM, Integer, Unit>>> $sections;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$1$1(List<? extends HxE<? extends BlockSpacingCategory, ? extends G0V<? super BFM, ? super Integer, Unit>>> list) {
        super(1);
        this.$sections = list;
    }

    public final BlockSpacingSpec invoke(int i) {
        return BlockSpacingKt.messageSpacingFor(this.$sections.get(i).first);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ BlockSpacingSpec invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
