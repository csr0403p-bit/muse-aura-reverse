package com.facebook.aura.maps;

import X.AOP;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C6v3;
import X.EnumC04711Bv;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.maps.HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1", f = "HatchFullscreenMapScreen.kt", l = {138}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $artifactId;
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOpenPlaceDetails$delegate;
    public final /* synthetic */ AOP<EnumC04711Bv> $entryTransition;
    public final /* synthetic */ MutableState<Boolean> $hasOpened$delegate;
    public int label;

    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AOP<EnumC04711Bv> $entryTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AOP<EnumC04711Bv> aop) {
            super(0);
            this.$entryTransition = aop;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r3 = this;
                X.AOP<X.1Bv> r0 = r3.$entryTransition
                X.AOH<S> r0 = r0.A02
                java.lang.Object r0 = r0.A09()
                X.1Bv r2 = X.EnumC04711Bv.A04
                if (r0 != r2) goto L17
                X.AOP<X.1Bv> r0 = r3.$entryTransition
                androidx.compose.runtime.MutableState r0 = r0.A07
                java.lang.Object r1 = r0.getValue()
                r0 = 1
                if (r1 == r2) goto L18
            L17:
                r0 = 0
            L18:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1.AnonymousClass1.invoke():java.lang.Boolean");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.maps.HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1$2", f = "HatchFullscreenMapScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.maps.HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1(String str, MutableState<Boolean> mutableState, AOP<EnumC04711Bv> aop, C1BO<? extends G0U<? super String, Unit>> c1bo, HtJ<? super HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1> htJ) {
        super(2, htJ);
        this.$artifactId = str;
        this.$hasOpened$delegate = mutableState;
        this.$entryTransition = aop;
        this.$currentOpenPlaceDetails$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1(this.$artifactId, this.$hasOpened$delegate, this.$entryTransition, this.$currentOpenPlaceDetails$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$artifactId != null && !MutableState.A0A((MutableState) this.$hasOpened$delegate)) {
                C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$entryTransition));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MutableState.A09(true, this.$hasOpened$delegate);
        C1BO.A0B(this.$currentOpenPlaceDetails$delegate).invoke(this.$artifactId);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchFullscreenMapScreenKt$PlaceDetailsOnArrivalEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
