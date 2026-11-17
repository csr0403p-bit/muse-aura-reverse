package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.C1Ny;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWidgetEditingKt$rememberIsEditingWidgetField$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ View $rootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWidgetEditingKt$rememberIsEditingWidgetField$1$1(C1Ny c1Ny, AXN axn, View view) {
        super(0);
        this.$imeInsets = c1Ny;
        this.$density = axn;
        this.$rootView = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            X.1Ny r1 = r2.$imeInsets
            X.AXN r0 = r2.$density
            int r0 = r1.ACy(r0)
            if (r0 <= 0) goto L15
            android.view.View r0 = r2.$rootView
            android.view.View r0 = r0.findFocus()
            boolean r1 = r0 instanceof com.facebook.aura.conversation.view.richcontent.WidgetFieldHost
            r0 = 1
            if (r1 != 0) goto L16
        L15:
            r0 = 0
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchWidgetEditingKt$rememberIsEditingWidgetField$1$1.invoke():java.lang.Boolean");
    }
}
