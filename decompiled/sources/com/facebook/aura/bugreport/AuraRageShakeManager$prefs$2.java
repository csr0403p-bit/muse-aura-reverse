package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.BV4;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraRageShakeManager$prefs$2 extends AbstractC7559F3s implements Function0<SharedPreferences> {
    public final /* synthetic */ AuraRageShakeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRageShakeManager$prefs$2(AuraRageShakeManager auraRageShakeManager) {
        super(0);
        this.this$0 = auraRageShakeManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return BV4.A07(this.this$0.activity, AuraRageShakeManager.PREFS_NAME);
    }
}
