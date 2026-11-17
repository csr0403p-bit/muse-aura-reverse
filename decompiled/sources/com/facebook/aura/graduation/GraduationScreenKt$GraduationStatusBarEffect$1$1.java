package com.facebook.aura.graduation;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C1971Avc;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: classes3.dex */
public final class GraduationScreenKt$GraduationStatusBarEffect$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ View $view;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        final C1971Avc c1971Avc;
        Activity activity;
        Window window;
        C7384Etj.A0Y(c06787bB, 0);
        Context context = this.$view.getContext();
        final Boolean boolValueOf = null;
        if (!(context instanceof Activity) || (activity = (Activity) context) == null || (window = activity.getWindow()) == null) {
            c1971Avc = null;
        } else {
            c1971Avc = new C1971Avc(window.getDecorView(), window);
            boolValueOf = Boolean.valueOf(c1971Avc.A00.A04());
            c1971Avc.A01(true);
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.graduation.GraduationScreenKt$GraduationStatusBarEffect$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                Boolean bool = boolValueOf;
                if (bool != null) {
                    c1971Avc.A01(bool.booleanValue());
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationScreenKt$GraduationStatusBarEffect$1$1(View view) {
        super(1);
        this.$view = view;
    }
}
