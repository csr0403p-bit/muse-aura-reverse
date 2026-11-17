package com.facebook.aura.uicontrol;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C60O;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class UiCommandContributors$contributors$2 extends AbstractC7559F3s implements Function0<List<? extends UiCommandContributor>> {
    public static final UiCommandContributors$contributors$2 INSTANCE = new UiCommandContributors$contributors$2();

    public UiCommandContributors$contributors$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends UiCommandContributor> invoke() {
        int[] iArr = {0, 1, 2, 3, 4, 5, 6};
        ArrayList arrayListA11 = C60O.A11(7);
        int i = 0;
        do {
            arrayListA11.add(AnonymousClass801.A0K(iArr[i]));
            i++;
        } while (i < 7);
        return arrayListA11;
    }
}
