package com.facebook.aura.tabs.api;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.api.TabAttentions$observe$flows$1$1", f = "TabAttentions.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class TabAttentions$observe$flows$1$1 extends AbstractC07127nr implements G0V<C20Z<? super Map<AuraTabRootNavKey, ? extends Set<? extends String>>>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public TabAttentions$observe$flows$1$1(HtJ<? super TabAttentions$observe$flows$1$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        TabAttentions$observe$flows$1$1 tabAttentions$observe$flows$1$1 = new TabAttentions$observe$flows$1$1(htJ);
        tabAttentions$observe$flows$1$1.L$0 = obj;
        return tabAttentions$observe$flows$1$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C20Z<? super Map<AuraTabRootNavKey, ? extends Set<? extends String>>> c20z, HtJ<? super Unit> htJ) {
        return invoke2((C20Z<? super Map<AuraTabRootNavKey, ? extends Set<String>>>) c20z, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C9jH c9jHA0E = AGH.A0E();
            this.L$0 = null;
            this.label = 1;
            if (c20z.emit(c9jHA0E, this) == enumC10460Hji) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C20Z<? super Map<AuraTabRootNavKey, ? extends Set<String>>> c20z, HtJ<? super Unit> htJ) {
        TabAttentions$observe$flows$1$1 tabAttentions$observe$flows$1$1 = new TabAttentions$observe$flows$1$1(htJ);
        tabAttentions$observe$flows$1$1.L$0 = c20z;
        return tabAttentions$observe$flows$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
