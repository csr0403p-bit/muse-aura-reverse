package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchSignedOutHostKt$HatchSignedOutHost$initialKey$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isColdStart;
    public final /* synthetic */ boolean $isInteractive;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraRageShakeManager $rageShakeManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSignedOutHostKt$HatchSignedOutHost$initialKey$1(boolean z, boolean z2, AuraRageShakeManager auraRageShakeManager, BRg bRg, int i, int i2) {
        super(2);
        this.$isColdStart = z;
        this.$isInteractive = z2;
        this.$rageShakeManager = auraRageShakeManager;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSignedOutHostKt.HatchSignedOutHost(this.$isColdStart, this.$isInteractive, this.$rageShakeManager, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
