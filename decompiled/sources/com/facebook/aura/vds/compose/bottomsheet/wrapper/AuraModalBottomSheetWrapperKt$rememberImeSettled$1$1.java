package com.facebook.aura.vds.compose.bottomsheet.wrapper;

import X.AXN;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C0Hi;
import X.C1C3;
import X.C1Ny;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1", f = "AuraModalBottomSheetWrapper.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ MutableState<Boolean> $isImeSettled$delegate;
    public final /* synthetic */ C1C3 $keyboardController;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1$1", f = "AuraModalBottomSheetWrapper.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ C1Ny $imeInsets;
        public int label;

        /* renamed from: com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04211 extends AbstractC7559F3s implements Function0<Integer> {
            public final /* synthetic */ AXN $density;
            public final /* synthetic */ C1Ny $imeInsets;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04211(C1Ny c1Ny, AXN axn) {
                super(0);
                this.$imeInsets = c1Ny;
                this.$density = axn;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.$imeInsets.ACy(this.$density));
            }
        }

        @DebugMetadata(c = "com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1$1$2", f = "AuraModalBottomSheetWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Boolean>, Object> {
            public /* synthetic */ int I$0;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.I$0 = AnonymousClass001.A0F(obj);
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                int i = this.I$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(AnonymousClass002.A1M(i));
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A0F(num), htJ);
            }

            public final Object invoke(int i, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass2) create(Integer.valueOf(i), htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1Ny c1Ny, AXN axn, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$imeInsets = c1Ny;
            this.$density = axn;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$imeInsets, this.$density, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new C04211(this.$imeInsets, this.$density));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1(C1C3 c1c3, C0Hi c0Hi, C1Ny c1Ny, AXN axn, MutableState<Boolean> mutableState, HtJ<? super AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1> htJ) {
        super(2, htJ);
        this.$keyboardController = c1c3;
        this.$focusManager = c0Hi;
        this.$imeInsets = c1Ny;
        this.$density = axn;
        this.$isImeSettled$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1(this.$keyboardController, this.$focusManager, this.$imeInsets, this.$density, this.$isImeSettled$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1C3 c1c3 = this.$keyboardController;
            if (c1c3 != null) {
                c1c3.hide();
            }
            this.$focusManager.A6G(false);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imeInsets, this.$density, null);
            this.label = 1;
            if (GAX.A01(this, anonymousClass1, 600L) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$isImeSettled$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
