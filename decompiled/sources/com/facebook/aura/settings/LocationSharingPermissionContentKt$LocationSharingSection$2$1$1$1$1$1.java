package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.gateway.store.LocationSharingModesKt;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ LocationSharingMode $mode;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $requestForegroundLocation;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<LocationSharingMode> $selectedMode$delegate;

    @DebugMetadata(c = "com.facebook.aura.settings.LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1$1", f = "LocationSharingPermissionContent.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<LocationSharingMode> $selectedMode$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, MutableState<LocationSharingMode> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$selectedMode$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$selectedMode$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Context context = this.$context;
                this.label = 1;
                if (LocationSharingPermissionContentKt.requestBackgroundLocation(context, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            PermissionChangeNotifier.INSTANCE.notifyChanged();
            this.$selectedMode$delegate.Af8(LocationSharingModesKt.deriveLocationMode(this.$context));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1(LocationSharingMode locationSharingMode, Context context, G0U<? super PermissionDestination, Unit> g0u, C3UX c3ux, MutableState<LocationSharingMode> mutableState) {
        super(1);
        this.$mode = locationSharingMode;
        this.$context = context;
        this.$requestForegroundLocation = g0u;
        this.$scope = c3ux;
        this.$selectedMode$delegate = mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (com.facebook.aura.gateway.store.LocationSharingModesKt.hasForegroundLocationPermission(r10.$context) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(boolean r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L36
            com.facebook.aura.analytics.hatch.HatchInteractionLogger r2 = com.facebook.aura.analytics.hatch.HatchInteractionLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchSurface r3 = com.facebook.aura.analytics.hatch.HatchSurface.SETTINGS
            com.facebook.aura.analytics.hatch.HatchSubsurface r4 = com.facebook.aura.analytics.hatch.HatchSubsurface.LOCATION_PERMISSION
            com.facebook.aura.analytics.hatch.HatchScreen r5 = com.facebook.aura.analytics.hatch.HatchScreen.LOCATION_PERMISSION
            com.facebook.aura.analytics.hatch.HatchComponent r6 = com.facebook.aura.analytics.hatch.HatchComponent.LOCATION_OPTION
            com.facebook.aura.gateway.store.LocationSharingMode r0 = r10.$mode
            java.lang.String r1 = X.AnonymousClass006.A0x(r0)
            java.lang.String r0 = "location_mode"
            java.util.Map r8 = X.AnonymousClass006.A10(r0, r1)
            r7 = 0
            r9 = r7
            r2.logClick(r3, r4, r5, r6, r7, r8, r9)
            com.facebook.aura.gateway.store.LocationSharingMode r1 = r10.$mode
            com.facebook.aura.gateway.store.LocationSharingMode r0 = com.facebook.aura.gateway.store.LocationSharingMode.NEVER
            if (r1 == r0) goto L2f
            com.facebook.aura.gateway.store.LocationSharingMode r0 = com.facebook.aura.gateway.store.LocationSharingMode.WHEN_CHATTING
            if (r1 != r0) goto L37
            android.content.Context r0 = r10.$context
            boolean r0 = com.facebook.aura.gateway.store.LocationSharingModesKt.hasForegroundLocationPermission(r0)
            if (r0 == 0) goto L5a
        L2f:
            com.facebook.aura.utils.HatchPermissionUtils r1 = com.facebook.aura.utils.HatchPermissionUtils.INSTANCE
            android.content.Context r0 = r10.$context
            r1.openAppSettings(r0)
        L36:
            return
        L37:
            com.facebook.aura.gateway.store.LocationSharingMode r0 = com.facebook.aura.gateway.store.LocationSharingMode.ALWAYS
            if (r1 != r0) goto L36
            android.content.Context r0 = r10.$context
            boolean r0 = com.facebook.aura.gateway.store.LocationSharingModesKt.hasForegroundLocationPermission(r0)
            if (r0 == 0) goto L5a
            android.content.Context r0 = r10.$context
            boolean r0 = com.facebook.aura.gateway.store.LocationSharingModesKt.hasBackgroundLocationPermission(r0)
            if (r0 != 0) goto L36
            X.3UX r3 = r10.$scope
            android.content.Context r2 = r10.$context
            androidx.compose.runtime.MutableState<com.facebook.aura.gateway.store.LocationSharingMode> r1 = r10.$selectedMode$delegate
            com.facebook.aura.settings.LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1$1 r0 = new com.facebook.aura.settings.LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1$1
            r0.<init>(r2, r1, r7)
            X.AnonymousClass001.A1J(r0, r3)
            return
        L5a:
            X.G0U<com.facebook.aura.navigation.key.PermissionDestination, kotlin.Unit> r1 = r10.$requestForegroundLocation
            com.facebook.aura.navigation.key.PermissionDestination r0 = com.facebook.aura.navigation.key.PermissionDestination.LOCATION
            r1.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1.invoke(boolean):void");
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
