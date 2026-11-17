package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C1DG;
import X.G0V;
import X.HxE;
import com.facebook.aura.markdown.render.spacing.BlockSpacingCategory;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$2$1 extends AbstractC7559F3s implements G0V<Integer, Integer, C1DG> {
    public final /* synthetic */ List<HxE<BlockSpacingCategory, G0V<BFM, Integer, Unit>>> $sections;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$2$1(List<? extends HxE<? extends BlockSpacingCategory, ? extends G0V<? super BFM, ? super Integer, Unit>>> list) {
        super(2);
        this.$sections = list;
    }

    /* renamed from: invoke-SwL47hQ, reason: not valid java name */
    public final C1DG m647invokeSwL47hQ(int i, int i2) {
        if (this.$sections.get(i).first == BlockSpacingCategory.BUBBLE && this.$sections.get(i2).first == BlockSpacingCategory.PRESENTATION) {
            return new C1DG(4.0f);
        }
        return null;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ C1DG invoke(Integer num, Integer num2) {
        return m647invokeSwL47hQ(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
    }
}
