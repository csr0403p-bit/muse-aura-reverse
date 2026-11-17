package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.preloads.HatchPreloadsTosRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1", f = "PreloadsTosRoute.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $showsPreloadsTos$delegate;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1$1", f = "PreloadsTosRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchPreloadsTosRepository hatchPreloadsTosRepository = HatchPreloadsTosRepository.INSTANCE;
            Context context = this.$context;
            C7384Etj.A0X(context);
            return Boolean.valueOf(hatchPreloadsTosRepository.shouldShowExplicitTos(context));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1(MutableState<Boolean> mutableState, Context context, HtJ<? super PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1> htJ) {
        super(2, htJ);
        this.$showsPreloadsTos$delegate = mutableState;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1(this.$showsPreloadsTos$delegate, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$showsPreloadsTos$delegate.getValue() == null) {
                mutableState = this.$showsPreloadsTos$delegate;
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, null);
                this.L$0 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$0;
        Hwg.A00(obj);
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PreloadsTosRouteKt$rememberNativeLoginStartKey$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
