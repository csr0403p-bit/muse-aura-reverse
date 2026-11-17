package com.facebook.aura.navigation.entries;

import X.AMP;
import X.ANR;
import X.ANU;
import X.ANi;
import X.APu;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes4.dex */
public final class AuraTransitionsKt$bottomUpTransitionMetadata$2 extends AbstractC7559F3s implements G0U<ANi<AMP<?>>, ANU> {
    public static final AuraTransitionsKt$bottomUpTransitionMetadata$2 INSTANCE = new AuraTransitionsKt$bottomUpTransitionMetadata$2();

    public AuraTransitionsKt$bottomUpTransitionMetadata$2() {
        super(1);
    }

    /* renamed from: com.facebook.aura.navigation.entries.AuraTransitionsKt$bottomUpTransitionMetadata$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(AnonymousClass001.A0F(num));
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(i);
        }
    }

    @Override // X.G0U
    public final ANU invoke(ANi<AMP<?>> aNi) {
        return ANR.A00(APu.A00, AbstractC1011APs.A0I(AuraTransitionsKt.bottomSlideSpec, AnonymousClass1.INSTANCE));
    }
}
