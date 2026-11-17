package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ComposerMicVisibilityKt {
    public static final boolean canShowComposerMicButton(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 6);
        if (!z || !z2 || z3 || z4 || z5) {
            return false;
        }
        return !z6 || AnonymousClass003.A1Y(function0);
    }

    /* renamed from: com.facebook.aura.composer.view.ComposerMicVisibilityKt$canShowComposerMicButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    public static /* synthetic */ boolean canShowComposerMicButton$default(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Function0 function0, int i, Object obj) {
        if ((i & 64) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        return canShowComposerMicButton(z, z2, z3, z4, z5, z6, function0);
    }
}
