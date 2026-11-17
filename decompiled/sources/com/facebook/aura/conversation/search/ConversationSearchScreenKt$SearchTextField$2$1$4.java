package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $resolvedPlaceholder;
    public final /* synthetic */ C1822Arm $resolvedTextStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$SearchTextField$2$1$4(String str, C1822Arm c1822Arm) {
        super(2);
        this.$resolvedPlaceholder = str;
        this.$resolvedTextStyle = c1822Arm;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraTextInputDefaults.INSTANCE.m2587PlaceholderTextqdpcsU(this.$resolvedPlaceholder, 0, this.$resolvedTextStyle, bfm, 3072, 2);
        } else {
            bfm.Afo();
        }
    }
}
