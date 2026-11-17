package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometry$hasFloatingOccluder$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchFloatingChromeGeometry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometry$hasFloatingOccluder$2(HatchFloatingChromeGeometry hatchFloatingChromeGeometry) {
        super(0);
        this.this$0 = hatchFloatingChromeGeometry;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1X(this.this$0.getFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui()));
    }
}
