package com.facebook.aura.health;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10586Hws;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.Hrc;
import X.HtJ;
import X.Hwg;
import X.InterfaceC9037FxJ;
import android.content.Context;
import android.content.pm.PackageManager;
import com.meta.health.healthconnect.HealthConnectPlugin;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.health.HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1", f = "HealthConnectPermissionUtils.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ Context $context;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1(Context context, HtJ<? super HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1(this.$context, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HealthConnectPermissionUtils$refreshGrantedState$minimallyGranted$1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
        Set<String> setA0C;
        boolean zA0E;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!HealthConnectPermissionUtils.INSTANCE.isAvailable(this.$context)) {
                zA0E = false;
                return Boolean.valueOf(zA0E);
            }
            InterfaceC9037FxJ interfaceC9037FxJA01 = C10586Hws.A01(this.$context);
            setA0C = HealthConnectPlugin.A0C(interfaceC9037FxJA01);
            HealthConnectPermissionUtils.grantableSpecialPermissions = setA0C;
            this.L$0 = null;
            this.L$1 = setA0C;
            this.label = 1;
            obj = ((Hrc) interfaceC9037FxJA01).AG0(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            setA0C = (Set) this.L$1;
            Hwg.A00(obj);
        }
        zA0E = HealthConnectPlugin.A0E((Set) obj, setA0C);
        return Boolean.valueOf(zA0E);
    }
}
