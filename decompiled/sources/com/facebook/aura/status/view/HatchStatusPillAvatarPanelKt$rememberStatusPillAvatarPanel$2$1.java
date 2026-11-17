package com.facebook.aura.status.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$2$1", f = "HatchStatusPillAvatarPanel.kt", l = {102, 109, 115}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $animatedProgress;
    public final /* synthetic */ boolean $dragging;
    public final /* synthetic */ boolean $panelExpanded;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ float[] $releasedAt;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$2$1(boolean z, float[] fArr, AT5<Float, AOW> at5, HatchStatusPillMetrics hatchStatusPillMetrics, boolean z2, HtJ<? super HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$2$1> htJ) {
        super(2, htJ);
        this.$dragging = z;
        this.$releasedAt = fArr;
        this.$animatedProgress = at5;
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$panelExpanded = z2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$2$1(this.$dragging, this.$releasedAt, this.$animatedProgress, this.$pillMetrics, this.$panelExpanded, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0i;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$dragging) {
                float f = this.$releasedAt[0];
                if (!Float.isNaN(f)) {
                    AT5<Float, AOW> at5 = this.$animatedProgress;
                    Float f2 = new Float(f);
                    this.label = 1;
                    if (at5.A04(f2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    this.$releasedAt[0] = Float.NaN;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Unit.INSTANCE;
        }
        Hwg.A00(obj);
        this.$releasedAt[0] = Float.NaN;
        Float avatarPanelSettleVelocity = this.$pillMetrics.getAvatarPanelSettleVelocity();
        this.$pillMetrics.setAvatarPanelSettleVelocity(null);
        AT5<Float, AOW> at52 = this.$animatedProgress;
        boolean z = this.$panelExpanded;
        if (avatarPanelSettleVelocity != null) {
            Float f3 = new Float(z ? 1.0f : 0.0f);
            C1003AOr c1003AOr = new C1003AOr(null, 1.0f, 322.0f);
            this.L$0 = null;
            this.label = 2;
            objA0i = AT5.A00(at52, c1003AOr, f3, avatarPanelSettleVelocity, this, null);
        } else {
            Float f4 = new Float(z ? 1.0f : 0.0f);
            ASj aSj = new ASj(C2HU.A01, 350, 0);
            this.L$0 = null;
            this.label = 3;
            objA0i = AnonymousClass002.A0i(at52, aSj, f4, this, null);
        }
        if (objA0i == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
