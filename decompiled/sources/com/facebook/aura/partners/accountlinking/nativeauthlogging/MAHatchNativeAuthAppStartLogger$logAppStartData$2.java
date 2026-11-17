package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$logAppStartData$2", f = "MAHatchNativeAuthAppStartLogger.kt", l = {181}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class MAHatchNativeAuthAppStartLogger$logAppStartData$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends List<? extends NativeAuthAccountJson>, ? extends NativeAuthWaEligibilityFlagsJson>>, Object> {
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAHatchNativeAuthAppStartLogger$logAppStartData$2(Context context, HtJ<? super MAHatchNativeAuthAppStartLogger$logAppStartData$2> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MAHatchNativeAuthAppStartLogger$logAppStartData$2(this.$context, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HxE<? extends List<NativeAuthAccountJson>, NativeAuthWaEligibilityFlagsJson>> htJ) {
        return new MAHatchNativeAuthAppStartLogger$logAppStartData$2(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MAHatchNativeAuthAppStartLogger mAHatchNativeAuthAppStartLogger = MAHatchNativeAuthAppStartLogger.INSTANCE;
            Context context = this.$context;
            this.label = 1;
            obj = mAHatchNativeAuthAppStartLogger.fetchAccounts(context, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return C3cG.A0r(obj, MAHatchNativeAuthAppStartLogger.INSTANCE.fetchWaEligibilityFlags(this.$context));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends List<? extends NativeAuthAccountJson>, ? extends NativeAuthWaEligibilityFlagsJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HxE<? extends List<NativeAuthAccountJson>, NativeAuthWaEligibilityFlagsJson>>) htJ);
    }
}
