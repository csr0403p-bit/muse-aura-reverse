package com.facebook.aura.tabs;

import X.AIW;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0924AIa;
import X.G2l;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.tabs.TabBadgeType;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.TabBadgeViewModel$uiState$1", f = "TabBadgeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class TabBadgeViewModel$uiState$1 extends AbstractC07127nr implements G2l<FixedTab, Set<? extends String>, Set<? extends String>, FixedTab, Set<? extends FixedTab>, HtJ<? super Map<FixedTab, ? extends TabBadgeType>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public /* synthetic */ Object L$4;
    public int label;

    public TabBadgeViewModel$uiState$1(HtJ<? super TabBadgeViewModel$uiState$1> htJ) {
        super(6, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FixedTab fixedTab, Set<String> set, Set<String> set2, FixedTab fixedTab2, Set<? extends FixedTab> set3, HtJ<? super Map<FixedTab, ? extends TabBadgeType>> htJ) {
        TabBadgeViewModel$uiState$1 tabBadgeViewModel$uiState$1 = new TabBadgeViewModel$uiState$1(htJ);
        tabBadgeViewModel$uiState$1.L$0 = fixedTab;
        tabBadgeViewModel$uiState$1.L$1 = set;
        tabBadgeViewModel$uiState$1.L$2 = set2;
        tabBadgeViewModel$uiState$1.L$3 = fixedTab2;
        tabBadgeViewModel$uiState$1.L$4 = set3;
        return tabBadgeViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        Set set = (Set) this.L$1;
        Set set2 = (Set) this.L$2;
        Object obj3 = this.L$3;
        Set set3 = (Set) this.L$4;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C0924AIa c0924AIa = new C0924AIa();
        FixedTab fixedTab = FixedTab.CHAT;
        if (obj2 != fixedTab && (!(set instanceof Collection) || !set.isEmpty())) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!set2.contains(it.next())) {
                    c0924AIa.put(fixedTab, TabBadgeType.NotificationDot.INSTANCE);
                    break;
                }
            }
        }
        if (obj3 != null && obj3 != obj2) {
            c0924AIa.putIfAbsent(obj3, TabBadgeType.Lightup.INSTANCE);
        }
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            c0924AIa.putIfAbsent(it2.next(), TabBadgeType.Wave.INSTANCE);
        }
        return AIW.A0K(c0924AIa);
    }

    @Override // X.G2l
    public /* bridge */ /* synthetic */ Object invoke(FixedTab fixedTab, Set<? extends String> set, Set<? extends String> set2, FixedTab fixedTab2, Set<? extends FixedTab> set3, HtJ<? super Map<FixedTab, ? extends TabBadgeType>> htJ) {
        return invoke2(fixedTab, (Set<String>) set, (Set<String>) set2, fixedTab2, set3, htJ);
    }
}
