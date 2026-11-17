package com.facebook.aura.subscription.view;

import X.ART;
import X.ASR;
import X.AST;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageMetersKt$UsageProgressBar$1$1 extends AbstractC7559F3s implements G0U<AST, ASR> {
    public final /* synthetic */ float $clampedProgress;
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ long $trackColor;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt$UsageProgressBar$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
        public final /* synthetic */ float $clampedProgress;
        public final /* synthetic */ long $cornerRadius;
        public final /* synthetic */ long $fillColor;
        public final /* synthetic */ long $trackColor;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AT3 at3) {
            C7384Etj.A0Y(at3, 0);
            long j = this.$trackColor;
            long j2 = this.$cornerRadius;
            long jA00 = ART.A00(at3.AKb(), 0L);
            C16a c16a = C16a.A00;
            at3.A9j(null, c16a, 1.0f, 3, j, 0L, jA00, j2);
            float f = this.$clampedProgress;
            if (f > 0.0f) {
                long j3 = this.$fillColor;
                long jAKb = at3.AKb();
                at3.A9j(null, c16a, 1.0f, 3, j3, 0L, AnonymousClass005.A0M(AnonymousClass001.A00(jAKb) * f, AnonymousClass001.A01(jAKb, 4294967295L)), this.$cornerRadius);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, float f, long j3) {
            super(1);
            this.$trackColor = j;
            this.$cornerRadius = j2;
            this.$clampedProgress = f;
            this.$fillColor = j3;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
            invoke2(at3);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final ASR invoke(AST ast) {
        C7384Etj.A0Y(ast, 0);
        return ast.A00(new AnonymousClass1(this.$trackColor, AnonymousClass003.A0N(Float.floatToRawIntBits(3.0f * ast.AEm())), this.$clampedProgress, this.$fillColor));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageMetersKt$UsageProgressBar$1$1(long j, float f, long j2) {
        super(1);
        this.$trackColor = j;
        this.$clampedProgress = f;
        this.$fillColor = j2;
    }
}
