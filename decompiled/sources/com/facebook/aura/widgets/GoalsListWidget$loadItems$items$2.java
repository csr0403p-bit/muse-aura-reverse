package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.C7BY;
import X.G0U;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class GoalsListWidget$loadItems$items$2 extends AbstractC7559F3s implements G0U<Goal, ListWidgetItemJson> {
    public static final GoalsListWidget$loadItems$items$2 INSTANCE = new GoalsListWidget$loadItems$items$2();

    public GoalsListWidget$loadItems$items$2() {
        super(1);
    }

    @Override // X.G0U
    public final ListWidgetItemJson invoke(Goal goal) {
        String strA0l;
        C7384Etj.A0Y(goal, 0);
        String str = goal.title;
        String str2 = null;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        String str3 = goal.id;
        String str4 = goal.summary;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = goal.emoji;
        if (str5 != null && (strA0l = AnonymousClass002.A0l(str5)) != null && strA0l.length() != 0) {
            str2 = strA0l;
        }
        return new ListWidgetItemJson(str3, str, str4, str2, null, false);
    }
}
