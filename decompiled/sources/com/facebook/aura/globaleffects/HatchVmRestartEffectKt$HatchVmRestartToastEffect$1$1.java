package com.facebook.aura.globaleffects;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.globaleffects.HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1", f = "HatchVmRestartEffect.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $message;
    public final /* synthetic */ HatchVmRestartRequest $request;
    public int label;

    /* renamed from: com.facebook.aura.globaleffects.HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1(HatchVmRestartRequest hatchVmRestartRequest, String str, HtJ<? super HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1> htJ) {
        super(2, htJ);
        this.$request = hatchVmRestartRequest;
        this.$message = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1(this.$request, this.$message, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            this.label = 1;
            if (AvW.A01(anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (this.$request.consumeRestartedMarker()) {
            ToastApi.INSTANCE.showToast(this.$message);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchVmRestartEffectKt$HatchVmRestartToastEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
