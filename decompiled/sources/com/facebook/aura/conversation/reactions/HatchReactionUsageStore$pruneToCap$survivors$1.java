package com.facebook.aura.conversation.reactions;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchReactionUsageStore$pruneToCap$survivors$1 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends Integer>, Boolean> {
    public final /* synthetic */ String $alwaysKeep;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Map.Entry<String, Integer> entry) {
        C7384Etj.A0Y(entry, 0);
        return C3cG.A0P(C7384Etj.areEqual(entry.getKey(), this.$alwaysKeep));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchReactionUsageStore$pruneToCap$survivors$1(String str) {
        super(1);
        this.$alwaysKeep = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends Integer> entry) {
        return invoke2((Map.Entry<String, Integer>) entry);
    }
}
