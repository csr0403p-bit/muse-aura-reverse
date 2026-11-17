package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C10G;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDocumentCardKt$ArtifactXmdsOrFallbackIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDocumentCardKt$ArtifactXmdsOrFallbackIcon$1(long j, float f) {
        super(2);
        this.$iconTint = j;
        this.$size = f;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchDocumentCardKt.m1158ArtifactFallbackIcon3JVO9M(this.$iconTint, C10G.A07(BRg.A00, this.$size), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
    }
}
