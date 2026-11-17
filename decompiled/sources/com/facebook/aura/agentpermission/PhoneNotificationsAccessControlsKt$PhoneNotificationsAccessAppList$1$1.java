package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C4Ax;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Set<String> $blockedApps;
    public final /* synthetic */ List<C4Ax> $installedApps;
    public final /* synthetic */ G0V<String, Boolean, Unit> $onToggle;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        List<C4Ax> list = this.$installedApps;
        Set<String> set = this.$blockedApps;
        G0V<String, Boolean, Unit> g0v = this.$onToggle;
        Iterator<C4Ax> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1$1$1(it.next(), set, g0v), 633663387);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppList$1$1(List<C4Ax> list, Set<String> set, G0V<? super String, ? super Boolean, Unit> g0v) {
        super(1);
        this.$installedApps = list;
        this.$blockedApps = set;
        this.$onToggle = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
