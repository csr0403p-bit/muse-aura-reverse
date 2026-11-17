package com.facebook.aura.graduation;

import X.ANR;
import X.ANS;
import X.ANU;
import X.ANi;
import X.ASj;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BUR;
import X.C28s;
import X.C2HU;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes4.dex */
public final class GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$1$1 extends AbstractC7559F3s implements G0U<ANi<Integer>, ANU> {
    public static final GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$1$1 INSTANCE = new GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$1$1();

    public GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final ANU invoke(ANi<Integer> aNi) {
        C7384Etj.A0Y(aNi, 0);
        C28s c28s = C2HU.A01;
        ANU anuA00 = ANR.A00(AbstractC1011APs.A09(new ASj(c28s, 280, 0), AnonymousClass1.INSTANCE).A00(AnonymousClass003.A0P(c28s, 280, 0)), ASj.A00(c28s, 280, 0));
        anuA00.A00 = new ANS(BUR.A00(0), false);
        return anuA00;
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(AnonymousClass001.A0F(num) / 4);
        }

        public final Integer invoke(int i) {
            return Integer.valueOf(i / 4);
        }
    }
}
