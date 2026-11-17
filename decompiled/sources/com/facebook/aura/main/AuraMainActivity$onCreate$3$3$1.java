package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.content.Intent;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class AuraMainActivity$onCreate$3$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Intent $launchIntent;
    public final /* synthetic */ AuraMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMainActivity$onCreate$3$3$1(Intent intent, AuraMainActivity auraMainActivity) {
        super(1);
        this.$launchIntent = intent;
        this.this$0 = auraMainActivity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) throws NoSuchAlgorithmException {
        Intent intent = this.$launchIntent;
        if (intent != null) {
            this.this$0.handleIntent(intent);
            this.this$0.getIntentViewModel().hasHandledLaunchIntent = true;
        }
        return new C78g() { // from class: com.facebook.aura.main.AuraMainActivity$onCreate$3$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
