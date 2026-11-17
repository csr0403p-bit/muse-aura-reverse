package com.facebook.aura.appreview;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1", f = "HatchInAppReviewEffect.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public int label;

    /* renamed from: com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements C20Z {
        public final /* synthetic */ Context $context;

        public AnonymousClass1(Context context) {
            this.$context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.facebook.aura.appreview.HatchInAppReviewTrigger.TriggerSource r10, X.HtJ<? super kotlin.Unit> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1
                if (r0 == 0) goto Lb2
                r6 = r11
                com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1 r6 = (com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto Lb2
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r2 = r6.result
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r8 = 1
                java.lang.String r5 = "HatchInAppReview"
                r4 = 2
                r3 = 0
                if (r0 == 0) goto L48
                if (r0 == r8) goto L7a
                if (r0 != r4) goto Lb9
                java.lang.Object r10 = r6.L$0
                com.facebook.aura.appreview.HatchInAppReviewTrigger$TriggerSource r10 = (com.facebook.aura.appreview.HatchInAppReviewTrigger.TriggerSource) r10
                X.Hwg.A00(r2)
            L2a:
                com.facebook.aura.appreview.HatchInAppReviewOutcome r2 = (com.facebook.aura.appreview.HatchInAppReviewOutcome) r2
                java.lang.String r1 = r10.getAnalyticsValue()
                boolean r0 = r2 instanceof com.facebook.aura.appreview.HatchInAppReviewOutcome.Failure
                if (r0 == 0) goto L3b
                r0 = r2
                com.facebook.aura.appreview.HatchInAppReviewOutcome$Failure r0 = (com.facebook.aura.appreview.HatchInAppReviewOutcome.Failure) r0
                if (r0 == 0) goto L3b
                com.facebook.aura.appreview.HatchInAppReviewOutcome$FailureReason r3 = r0.reason
            L3b:
                java.lang.String r0 = "Google Play in-app review request completed trigger=%s failureReason=%s"
                X.CFK.A02(r1, r3, r5, r0)
                com.facebook.aura.appreview.HatchInAppReviewLogger r0 = com.facebook.aura.appreview.HatchInAppReviewLogger.INSTANCE
                r0.logRequestResult(r2, r10)
            L45:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L48:
                X.Hwg.A00(r2)
                com.facebook.aura.appreview.HatchInAppReviewTrigger r0 = com.facebook.aura.appreview.HatchInAppReviewTrigger.INSTANCE
                boolean r0 = r0.shouldRequestReview$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview(r10)
                if (r0 == 0) goto L45
                X.CjU r2 = X.C4001CjU.A00
                android.content.Context r1 = r9.$context
                r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
                int r0 = r2.A01(r1, r0)
                if (r0 == 0) goto L6d
                com.facebook.aura.appreview.HatchInAppReviewLogger r2 = com.facebook.aura.appreview.HatchInAppReviewLogger.INSTANCE
                com.facebook.aura.appreview.HatchInAppReviewOutcome$FailureReason r1 = com.facebook.aura.appreview.HatchInAppReviewOutcome.FailureReason.PLAY_SERVICES_UNAVAILABLE
            L64:
                com.facebook.aura.appreview.HatchInAppReviewOutcome$Failure r0 = new com.facebook.aura.appreview.HatchInAppReviewOutcome$Failure
                r0.<init>(r1, r3)
                r2.logRequestResult(r0, r10)
                goto L45
            L6d:
                r6.L$0 = r10
                r6.label = r8
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r7) goto L81
                return r7
            L7a:
                java.lang.Object r10 = r6.L$0
                com.facebook.aura.appreview.HatchInAppReviewTrigger$TriggerSource r10 = (com.facebook.aura.appreview.HatchInAppReviewTrigger.TriggerSource) r10
                X.Hwg.A00(r2)
            L81:
                android.content.Context r0 = r9.$context
                android.app.Activity r2 = com.facebook.aura.utils.ContextUtilsKt.findActivity(r0)
                if (r2 == 0) goto Lad
                boolean r0 = r2.isFinishing()
                if (r0 != 0) goto Lad
                boolean r0 = r2.isDestroyed()
                if (r0 != 0) goto Lad
                java.lang.String r1 = "Requesting Google Play in-app review for trigger=%s"
                java.lang.String r0 = r10.getAnalyticsValue()
                X.CFK.A03(r0, r5, r1)
                com.facebook.aura.appreview.HatchInAppReviewManager r0 = com.facebook.aura.appreview.HatchInAppReviewManager.INSTANCE
                r6.L$0 = r10
                r6.L$1 = r3
                r6.label = r4
                java.lang.Object r2 = r0.requestReview(r2, r10, r6)
                if (r2 != r7) goto L2a
                return r7
            Lad:
                com.facebook.aura.appreview.HatchInAppReviewLogger r2 = com.facebook.aura.appreview.HatchInAppReviewLogger.INSTANCE
                com.facebook.aura.appreview.HatchInAppReviewOutcome$FailureReason r1 = com.facebook.aura.appreview.HatchInAppReviewOutcome.FailureReason.ACTIVITY_GONE
                goto L64
            Lb2:
                com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1 r6 = new com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1$1$emit$1
                r6.<init>(r9, r11)
                goto L12
            Lb9:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appreview.HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1.AnonymousClass1.emit(com.facebook.aura.appreview.HatchInAppReviewTrigger$TriggerSource, X.HtJ):java.lang.Object");
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((HatchInAppReviewTrigger.TriggerSource) obj, (HtJ<? super Unit>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1(Context context, HtJ<? super HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1(this.$context, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchInAppReviewEffectKt$HatchInAppReviewEffect$1$1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchInAppReviewTrigger.TriggerSource> c22i = HatchInAppReviewTrigger.requests;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context);
            this.label = 1;
            if (c22i.collect(anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }
}
