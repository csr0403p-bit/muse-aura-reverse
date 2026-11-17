package com.facebook.aura.status.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$8$5$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $avatarScope;
    public final /* synthetic */ AT5<Float, AOW> $avatarSizePx;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ C1003AOr<Float> $milestoneSpring;
    public final /* synthetic */ float $restingAvatarSizePx;

    @DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$6$8$5$6$1$1", f = "HatchStatusPill.kt", l = {511}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.view.HatchStatusPillKt$HatchStatusPill$6$8$5$6$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AT5<Float, AOW> $avatarSizePx;
        public final /* synthetic */ C1003AOr<Float> $milestoneSpring;
        public final /* synthetic */ float $restingAvatarSizePx;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AT5<Float, AOW> at5, float f, C1003AOr<Float> c1003AOr, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$avatarSizePx = at5;
            this.$restingAvatarSizePx = f;
            this.$milestoneSpring = c1003AOr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$avatarSizePx, this.$restingAvatarSizePx, this.$milestoneSpring, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = this.$avatarSizePx;
                Float f = new Float(this.$restingAvatarSizePx * 2.5f);
                C1003AOr<Float> c1003AOr = this.$milestoneSpring;
                this.label = 1;
                if (AnonymousClass002.A0i(at5, c1003AOr, f, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$8$5$6$1(boolean z, C3UX c3ux, AT5<Float, AOW> at5, float f, C1003AOr<Float> c1003AOr) {
        super(0);
        this.$isExpanded = z;
        this.$avatarScope = c3ux;
        this.$avatarSizePx = at5;
        this.$restingAvatarSizePx = f;
        this.$milestoneSpring = c1003AOr;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isExpanded) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass1(this.$avatarSizePx, this.$restingAvatarSizePx, this.$milestoneSpring, null), this.$avatarScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
