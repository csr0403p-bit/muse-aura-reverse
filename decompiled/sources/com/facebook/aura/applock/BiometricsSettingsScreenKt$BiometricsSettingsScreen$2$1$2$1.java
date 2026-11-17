package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.Ey9;
import X.G0U;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AppLockRepository $repository;
    public final /* synthetic */ C1BO<AppLockTimeout> $timeout$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Ey9<AppLockTimeout> entries = AppLockTimeout.getEntries();
        C3UX c3ux = this.$coroutineScope;
        AppLockRepository appLockRepository = this.$repository;
        C1BO<AppLockTimeout> c1bo = this.$timeout$delegate;
        Iterator<AppLockTimeout> it = entries.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1(it.next(), c3ux, appLockRepository, c1bo), 386469794);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1(C3UX c3ux, AppLockRepository appLockRepository, C1BO<? extends AppLockTimeout> c1bo) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$repository = appLockRepository;
        this.$timeout$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
