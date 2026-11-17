package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.B3D;
import X.BAs;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C6837Eap;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1", f = "NativeLoginIntroLogo.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C6837Eap>, Object> {
    public final /* synthetic */ B3D $compositionResult;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1(B3D b3d, HtJ<? super NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1> htJ) {
        super(2, htJ);
        this.$compositionResult = b3d;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1 nativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1 = new NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1(this.$compositionResult, htJ);
        nativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1.L$0 = obj;
        return nativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                B3D b3d = this.$compositionResult;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = C3cG.A0W(((BAs) b3d).A04, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            objA0s = (C6837Eap) obj;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            return null;
        }
        return objA0s;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super C6837Eap> htJ) {
        return ((NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1$loaded$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
