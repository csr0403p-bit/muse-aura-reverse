package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$offerDiscoverablePasskey$mint$1", f = "NativeLoginViewModel.kt", l = {3029}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$offerDiscoverablePasskey$mint$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends String>>, Object> {
    public int label;

    public NativeLoginViewModel$offerDiscoverablePasskey$mint$1(HtJ<? super NativeLoginViewModel$offerDiscoverablePasskey$mint$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginViewModel$offerDiscoverablePasskey$mint$1(htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<String>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1272getIoAF18A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchTempTokenProvider hatchTempTokenProvider = HatchTempTokenProvider.INSTANCE;
            this.label = 1;
            objM1272getIoAF18A = hatchTempTokenProvider.m1272getIoAF18A(this);
            if (objM1272getIoAF18A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1272getIoAF18A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1272getIoAF18A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<String>> htJ) {
        return new NativeLoginViewModel$offerDiscoverablePasskey$mint$1(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
