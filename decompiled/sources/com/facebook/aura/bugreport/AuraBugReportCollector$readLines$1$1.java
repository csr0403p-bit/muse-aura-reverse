package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BQG;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes.dex */
public final class AuraBugReportCollector$readLines$1$1 extends AbstractC7559F3s implements G0V<Integer, String, LogLine> {
    public final /* synthetic */ int $maxLineLength;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportCollector$readLines$1$1(int i) {
        super(2);
        this.$maxLineLength = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ LogLine invoke(Integer num, String str) {
        return invoke(AnonymousClass001.A0F(num), str);
    }

    public final LogLine invoke(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new LogLine(i, BQG.A17(str, this.$maxLineLength));
    }
}
