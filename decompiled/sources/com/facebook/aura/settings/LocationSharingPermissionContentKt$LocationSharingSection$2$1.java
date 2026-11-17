package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C3UX;
import X.C7384Etj;
import X.Ey9;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class LocationSharingPermissionContentKt$LocationSharingSection$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $requestForegroundLocation;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<LocationSharingMode> $selectedMode$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Ey9<LocationSharingMode> entries = LocationSharingMode.getEntries();
        Context context = this.$context;
        G0U<PermissionDestination, Unit> g0u = this.$requestForegroundLocation;
        C3UX c3ux = this.$scope;
        MutableState<LocationSharingMode> mutableState = this.$selectedMode$delegate;
        Iterator<LocationSharingMode> it = entries.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1(it.next(), context, g0u, c3ux, mutableState), -187530313);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocationSharingPermissionContentKt$LocationSharingSection$2$1(Context context, G0U<? super PermissionDestination, Unit> g0u, C3UX c3ux, MutableState<LocationSharingMode> mutableState) {
        super(1);
        this.$context = context;
        this.$requestForegroundLocation = g0u;
        this.$scope = c3ux;
        this.$selectedMode$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
