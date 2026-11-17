package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class HatchCvmChipSelectionRepository$resolveClaim$draw$1 extends AbstractC7559F3s implements G0V<Integer, Set<? extends String>, List<? extends String>> {
    public final /* synthetic */ HatchChipAllowlist $allowlist;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCvmChipSelectionRepository$resolveClaim$draw$1(HatchChipAllowlist hatchChipAllowlist) {
        super(2);
        this.$allowlist = hatchChipAllowlist;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ List<? extends String> invoke(Integer num, Set<? extends String> set) {
        return invoke(AnonymousClass001.A0F(num), (Set<String>) set);
    }

    public final List<String> invoke(int i, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        return this.$allowlist.draw(i, set);
    }
}
