package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.F1F;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$handedOff$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;
    public final /* synthetic */ Function0<Boolean> $leaving;
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ F1F $ruledOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFloatingChromeGeometryKt$fadeUnderFloatingOccluder$handedOff$1$1(Function0<Boolean> function0, F1F f1f, HatchFloatingChromeGeometry hatchFloatingChromeGeometry, Object obj) {
        super(0);
        this.$leaving = function0;
        this.$ruledOut = f1f;
        this.$geometry = hatchFloatingChromeGeometry;
        this.$owner = obj;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Function0<Boolean> function0 = this.$leaving;
        boolean z = false;
        if (function0 == null || !AnonymousClass003.A1Y(function0)) {
            this.$ruledOut.element = false;
        } else if (!this.$ruledOut.element) {
            boolean zIsOnlyHeaderAboveFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui = this.$geometry.isOnlyHeaderAboveFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(this.$owner);
            this.$ruledOut.element = !zIsOnlyHeaderAboveFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui;
            if (zIsOnlyHeaderAboveFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
