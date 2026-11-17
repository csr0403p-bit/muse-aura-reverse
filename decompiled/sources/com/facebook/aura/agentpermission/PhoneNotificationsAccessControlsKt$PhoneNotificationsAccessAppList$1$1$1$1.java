package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C4Ax;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ C4Ax $app;
    public final /* synthetic */ Set<String> $blockedApps;
    public final /* synthetic */ G0V<String, Boolean, Unit> $onToggle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1$1$1(C4Ax c4Ax, Set<String> set, G0V<? super String, ? super Boolean, Unit> g0v) {
        super(3);
        this.$app = c4Ax;
        this.$blockedApps = set;
        this.$onToggle = g0v;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        C4Ax c4Ax = this.$app;
        boolean z = !this.$blockedApps.contains(c4Ax.A01);
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$app, bfm.A65(this.$onToggle));
        G0V<String, Boolean, Unit> g0v = this.$onToggle;
        C4Ax c4Ax2 = this.$app;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1$1$1$1$1(g0v, c4Ax2);
            bfm.Ai0(objAaT);
        }
        PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessAppRow(c4Ax, z, (G0U) objAaT, bfm, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
