package com.facebook.aura.navigation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$1$1", f = "ResultEventBus.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ResultEventBusKt$ResultEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ G0V<T, HtJ<? super Unit>, Object> $onResult;
    public final /* synthetic */ ResultEventBus $resultEventBus;
    public final /* synthetic */ String $resultKey;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResultEventBusKt$ResultEffect$1$1(ResultEventBus resultEventBus, String str, G0V<? super T, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super ResultEventBusKt$ResultEffect$1$1> htJ) {
        super(2, htJ);
        this.$resultEventBus = resultEventBus;
        this.$resultKey = str;
        this.$onResult = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ResultEventBusKt$ResultEffect$1$1(this.$resultEventBus, this.$resultKey, this.$onResult, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Object> resultFlow$fbandroid_express_aura_java_com_facebook_aura_navigation_navigation = this.$resultEventBus.getResultFlow$fbandroid_express_aura_java_com_facebook_aura_navigation_navigation(this.$resultKey);
            final G0V<T, HtJ<? super Unit>, Object> g0v = this.$onResult;
            C20Z<? super Object> c20z = new C20Z() { // from class: com.facebook.aura.navigation.ResultEventBusKt$ResultEffect$1$1.1
                @Override // X.C20Z
                public final Object emit(Object obj2, HtJ<? super Unit> htJ) {
                    Object objInvoke = g0v.invoke(obj2, htJ);
                    return objInvoke != EnumC10460Hji.A02 ? Unit.INSTANCE : objInvoke;
                }
            };
            this.label = 1;
            if (resultFlow$fbandroid_express_aura_java_com_facebook_aura_navigation_navigation.collect(c20z, this) == enumC10460Hji) {
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
        return ((ResultEventBusKt$ResultEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
