package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraMainActivity$rageShakeManager$2 extends AbstractC7559F3s implements Function0<AuraRageShakeManager> {
    public final /* synthetic */ AuraMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMainActivity$rageShakeManager$2(AuraMainActivity auraMainActivity) {
        super(0);
        this.this$0 = auraMainActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraRageShakeManager invoke() {
        return new AuraRageShakeManager(this.this$0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AuraRageShakeManager invoke() {
        return new AuraRageShakeManager(this.this$0);
    }
}
