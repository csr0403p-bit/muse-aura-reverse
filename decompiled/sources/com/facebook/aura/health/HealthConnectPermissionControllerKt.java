package com.facebook.aura.health;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1er;
import X.C31u;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.InterfaceC7359EnW;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.health.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HealthConnectPermissionControllerKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HealthConnectPermissionControllerKt.class, "healthConnectConnectorEnabled", "getHealthConnectConnectorEnabled()Z", 1);
    public static final C31u healthConnectConnectorEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.health_connect_connector_enabled);

    /* renamed from: com.facebook.aura.health.HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onRefreshed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onRefreshed = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HealthConnectPermissionControllerKt.HealthConnectGrantRefreshEffect(this.$onRefreshed, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HealthConnectGrantRefreshEffect(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-171159825);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Unit unit = Unit.INSTANCE;
            boolean zA1O = AnonymousClass003.A1O(bfm, c3ux, mutableStateA00, bfm.A67(contextA0H));
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == obj) {
                objAaT2 = new HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$1$1(contextA0H, c3ux, mutableStateA00);
                bfm.Ai0(objAaT2);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT2, 6, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    public static final boolean getHealthConnectConnectorEnabled() {
        return AnonymousClass001.A1X(C31u.A00(healthConnectConnectorEnabled$delegate, $$delegatedProperties));
    }
}
