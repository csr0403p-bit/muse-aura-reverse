package com.facebook.aura.header.view;

import X.AHD;
import X.AaC;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.F60;
import X.G0U;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.header.api.HeaderActionIcon;
import com.facebook.aura.header.api.HeaderActionPill;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$3$1$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ List<HeaderActionIcon> $pillIcons;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        AHD<HeaderAction> ahd = this.$headerActions;
        List<HeaderActionIcon> list = this.$pillIcons;
        int i = 0;
        for (Object obj : ahd) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            G0U<HeaderActionPill, Unit> g0u = ((HeaderAction) obj).onPillChanged;
            if (g0u != null) {
                g0u.invoke(new HeaderActionPill(aaC, list, i));
            }
            i = i2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$HeaderIconButtons$3$1$1(AHD<HeaderAction> ahd, List<HeaderActionIcon> list) {
        super(1);
        this.$headerActions = ahd;
        this.$pillIcons = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
