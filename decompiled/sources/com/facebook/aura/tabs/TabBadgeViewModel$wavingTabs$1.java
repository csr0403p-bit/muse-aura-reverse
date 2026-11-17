package com.facebook.aura.tabs;

import X.A3q;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BGK;
import X.G2j;
import X.HtJ;
import X.Hwg;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.tabs.TabBadgeViewModel$wavingTabs$1", f = "TabBadgeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class TabBadgeViewModel$wavingTabs$1 extends AbstractC07127nr implements G2j<FixedTab, Map<FixedTab, ? extends Set<? extends String>>, Map<FixedTab, ? extends Set<? extends String>>, HtJ<? super Set<? extends FixedTab>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    public TabBadgeViewModel$wavingTabs$1(HtJ<? super TabBadgeViewModel$wavingTabs$1> htJ) {
        super(4, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FixedTab fixedTab, Map<FixedTab, ? extends Set<String>> map, Map<FixedTab, ? extends Set<String>> map2, HtJ<? super Set<? extends FixedTab>> htJ) {
        TabBadgeViewModel$wavingTabs$1 tabBadgeViewModel$wavingTabs$1 = new TabBadgeViewModel$wavingTabs$1(htJ);
        tabBadgeViewModel$wavingTabs$1.L$0 = fixedTab;
        tabBadgeViewModel$wavingTabs$1.L$1 = map;
        tabBadgeViewModel$wavingTabs$1.L$2 = map2;
        return tabBadgeViewModel$wavingTabs$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        Map map = (Map) this.L$1;
        Map map2 = (Map) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            Object key = entry.getKey();
            Set set = (Set) entry.getValue();
            if (key != obj2) {
                Iterable iterable = (Iterable) map2.get(key);
                if (iterable == null) {
                    iterable = A3q.A00;
                }
                if (!BGK.A03(iterable, set).isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap.keySet();
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(FixedTab fixedTab, Map<FixedTab, ? extends Set<? extends String>> map, Map<FixedTab, ? extends Set<? extends String>> map2, HtJ<? super Set<? extends FixedTab>> htJ) {
        return invoke2(fixedTab, (Map<FixedTab, ? extends Set<String>>) map, (Map<FixedTab, ? extends Set<String>>) map2, htJ);
    }
}
