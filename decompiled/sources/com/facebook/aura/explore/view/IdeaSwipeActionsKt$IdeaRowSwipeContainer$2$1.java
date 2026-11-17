package com.facebook.aura.explore.view;

import X.AOW;
import X.AOc;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass602;
import X.C00r;
import X.C0dx;
import X.C3UX;
import X.C3pU;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1", f = "IdeaSwipeActions.kt", l = {214}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $armedIconScale;
    public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ C00r $measuredRowWidth;
    public int label;

    /* renamed from: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AnchoredDraggableState<IdeaSwipeAnchor> $dragState;
        public final /* synthetic */ C00r $measuredRowWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState, C00r c00r) {
            super(0);
            this.$dragState = anchoredDraggableState;
            this.$measuredRowWidth = c00r;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(IdeaSwipeActionsKt.isArmed(this.$dragState.A08.AFn(), this.$measuredRowWidth.AGd()));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1$2", f = "IdeaSwipeActions.kt", l = {218}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AT5<Float, AOW> $armedIconScale;
        public final /* synthetic */ C0dx $haptics;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0dx c0dx, AT5<Float, AOW> at5, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$haptics = c0dx;
            this.$armedIconScale = at5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$haptics, this.$armedIconScale, htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (z) {
                    this.$haptics.AXr(AuraHaptics.GESTURE_THRESHOLD);
                }
                AT5<Float, AOW> at5 = this.$armedIconScale;
                Float f = new Float(z ? 1.35f : 1.0f);
                AOc<Float> aOc = z ? IdeaSwipeActionsKt.ArmIconSpec : IdeaSwipeActionsKt.DisarmIconSpec;
                this.Z$0 = z;
                this.label = 1;
                if (AnonymousClass002.A0i(at5, aOc, f, this, null) == enumC10460Hji) {
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
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1(AnchoredDraggableState<IdeaSwipeAnchor> anchoredDraggableState, C00r c00r, C0dx c0dx, AT5<Float, AOW> at5, HtJ<? super IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1> htJ) {
        super(2, htJ);
        this.$dragState = anchoredDraggableState;
        this.$measuredRowWidth = c00r;
        this.$haptics = c0dx;
        this.$armedIconScale = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1(this.$dragState, this.$measuredRowWidth, this.$haptics, this.$armedIconScale, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602 = new AnonymousClass602(GDB.A01(C6v3.A01(new AnonymousClass1(this.$dragState, this.$measuredRowWidth))), 0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$haptics, this.$armedIconScale, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, anonymousClass602) == enumC10460Hji) {
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
        return ((IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
