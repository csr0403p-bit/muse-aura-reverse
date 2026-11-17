package com.facebook.aura.permissions.defaults;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.permissions.defaults.PermissionDefaultsJarvisPath;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository$update$2", f = "PermissionSettingsRepository.kt", l = {250}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PermissionSettingsRepository$update$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends PermissionSettings>>, Object> {
    public final /* synthetic */ PermissionDefaultMode $connectorDefault;
    public final /* synthetic */ PermissionDefaultMode $networkDefault;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public final /* synthetic */ PermissionSettingsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionSettingsRepository$update$2(PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, PermissionSettingsRepository permissionSettingsRepository, HtJ<? super PermissionSettingsRepository$update$2> htJ) {
        super(2, htJ);
        this.$connectorDefault = permissionDefaultMode;
        this.$networkDefault = permissionDefaultMode2;
        this.this$0 = permissionSettingsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PermissionSettingsRepository$update$2(this.$connectorDefault, this.$networkDefault, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        Object objA0j;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PermissionDefaultMode permissionDefaultMode = this.$connectorDefault;
            if (permissionDefaultMode == null && this.$networkDefault == null) {
                objA0s = C3cG.A0s(C60O.A0i("permission settings update requires a field"));
                return C3cG.A0t(objA0s);
            }
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            PermissionDefaultsJarvisPath.PermissionsSettings permissionsSettings = PermissionDefaultsJarvisPath.PermissionsSettings.INSTANCE;
            String wireValue = permissionDefaultMode != null ? permissionDefaultMode.getWireValue() : null;
            PermissionDefaultMode permissionDefaultMode2 = this.$networkDefault;
            String wireValue2 = permissionDefaultMode2 != null ? permissionDefaultMode2.getWireValue() : null;
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            PermissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 permissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = PermissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
            PermissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 permissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = PermissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.I$3 = 1;
            this.I$4 = 0;
            this.I$5 = 0;
            this.I$6 = 0;
            this.label = 1;
            Object objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(permissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, permissionSettingsRepository$update$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, permissionsSettings, new SetPermissionSettingsRequestJson(wireValue, wireValue2, "settings_permission_defaults_update"), RequestType.PATCH, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
            objA0j = objM1599executeJarvisRequestWithFof5HsY;
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objA0j = AnonymousClass002.A0j(obj);
        }
        PermissionSettingsRepository permissionSettingsRepository = this.this$0;
        boolean z = !(objA0j instanceof C10571Hud);
        objA0s = objA0j;
        if (z) {
            PermissionSettings domain = ((PermissionSettingsResponseJson) objA0j).toDomain();
            permissionSettingsRepository.getCache().write(domain);
            objA0s = domain;
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<PermissionSettings>> htJ) {
        return ((PermissionSettingsRepository$update$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends PermissionSettings>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<PermissionSettings>>) htJ);
    }
}
