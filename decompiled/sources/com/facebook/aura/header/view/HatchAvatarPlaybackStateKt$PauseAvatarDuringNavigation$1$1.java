package com.facebook.aura.header.view;

import X.AOP;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC04711Bv;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.header.view.HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1", f = "HatchAvatarPlaybackState.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ HatchAvatarPlaybackState $playback;
    public final /* synthetic */ AOP<EnumC04711Bv> $transition;
    public int label;

    /* renamed from: com.facebook.aura.header.view.HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AOP<EnumC04711Bv> $transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AOP<EnumC04711Bv> aop) {
            super(0);
            this.$transition = aop;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r3 = this;
                X.AOP<X.1Bv> r0 = r3.$transition
                boolean r0 = r0.A0F()
                if (r0 != 0) goto L1b
                X.AOP<X.1Bv> r0 = r3.$transition
                X.AOH<S> r0 = r0.A02
                java.lang.Object r2 = r0.A09()
                X.AOP<X.1Bv> r0 = r3.$transition
                androidx.compose.runtime.MutableState r0 = r0.A07
                java.lang.Object r1 = r0.getValue()
                r0 = 0
                if (r2 == r1) goto L1c
            L1b:
                r0 = 1
            L1c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1.AnonymousClass1.invoke():java.lang.Boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1(AOP<EnumC04711Bv> aop, HatchAvatarPlaybackState hatchAvatarPlaybackState, Object obj, HtJ<? super HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1> htJ) {
        super(2, htJ);
        this.$transition = aop;
        this.$playback = hatchAvatarPlaybackState;
        this.$owner = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1(this.$transition, this.$playback, this.$owner, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$transition));
            final HatchAvatarPlaybackState hatchAvatarPlaybackState = this.$playback;
            final Object obj2 = this.$owner;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.header.view.HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj3, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj3), (HtJ<? super Unit>) htJ);
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    hatchAvatarPlaybackState.setPaused$fbandroid_express_aura_java_com_facebook_aura_header_view_view(obj2, z);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
