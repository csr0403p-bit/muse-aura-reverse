package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class GoalsListWidget$loadItems$items$3 extends AbstractC7559F3s implements G0U<ListWidgetItemJson, String> {
    public static final GoalsListWidget$loadItems$items$3 INSTANCE = new GoalsListWidget$loadItems$items$3();

    public GoalsListWidget$loadItems$items$3() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ String invoke(ListWidgetItemJson listWidgetItemJson) {
        ListWidgetItemJson listWidgetItemJson2 = listWidgetItemJson;
        C7384Etj.A0Y(listWidgetItemJson2, 0);
        return listWidgetItemJson2.id;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final String invoke2(ListWidgetItemJson listWidgetItemJson) {
        C7384Etj.A0Y(listWidgetItemJson, 0);
        return listWidgetItemJson.id;
    }
}
