package com.facebook.aura.gateway.store;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.F0C;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.json.HatchJsonKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVmTypeSwitchCheckpointStore {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String KEY_CHECKPOINT = "checkpoint";

    @Deprecated
    public static final String LEGACY_PHASE_LEASE_PENDING = "LEASE_PENDING";

    @Deprecated
    public static final String TAG = "HatchVmTypeSwitchCheckpoint";
    public final C4oT prefs;

    public HatchVmTypeSwitchCheckpointStore(String str) {
        C7384Etj.A0Y(str, 0);
        this.prefs = AuraUserPrefs.INSTANCE.get(str, AuraUserPrefStore.CONFIDENTIAL_VM_SWITCH);
    }

    private final HatchVmTypeSwitchCheckpoint readLegacy(String str) {
        LegacyHatchVmTypeSwitchCheckpoint legacyHatchVmTypeSwitchCheckpoint;
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = LegacyHatchVmTypeSwitchCheckpoint.$childSerializers;
            legacyHatchVmTypeSwitchCheckpoint = (LegacyHatchVmTypeSwitchCheckpoint) c9sU.A00(str, LegacyHatchVmTypeSwitchCheckpoint$$serializer.INSTANCE);
        } catch (Exception unused) {
        }
        if (LEGACY_PHASE_LEASE_PENDING.equals(legacyHatchVmTypeSwitchCheckpoint.phase)) {
            F0C<C9hr<Object>>[] f0cArr2 = HatchVmTypeSwitchCheckpoint.$childSerializers;
            return new HatchVmTypeSwitchCheckpoint(null, legacyHatchVmTypeSwitchCheckpoint.targetVmType, null);
        }
        String strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(legacyHatchVmTypeSwitchCheckpoint.sourceFqdn);
        if (strExtractHatcheryVMId != null) {
            F0C<C9hr<Object>>[] f0cArr3 = HatchVmTypeSwitchCheckpoint.$childSerializers;
            return new HatchVmTypeSwitchCheckpoint(strExtractHatcheryVMId, legacyHatchVmTypeSwitchCheckpoint.targetVmType, null);
        }
        return null;
    }

    public final boolean clear() {
        try {
            BzK bzKA9q = this.prefs.A9q();
            bzKA9q.Aae(KEY_CHECKPOINT);
            return bzKA9q.commit();
        } catch (Exception e) {
            CFK.A0A(TAG, "Failed to persist VM switch checkpoint", e);
            return false;
        }
    }

    public final HatchVmTypeSwitchCheckpoint read() {
        String string = this.prefs.getString(KEY_CHECKPOINT, null);
        if (string == null) {
            return null;
        }
        HatchVmTypeSwitchCheckpoint legacy = readLegacy(string);
        if (legacy != null) {
            return legacy;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = HatchVmTypeSwitchCheckpoint.$childSerializers;
            return (HatchVmTypeSwitchCheckpoint) c9sU.A00(string, HatchVmTypeSwitchCheckpoint$$serializer.INSTANCE);
        } catch (Exception e) {
            CFK.A0A(TAG, "Unreadable VM switch checkpoint", e);
            return null;
        }
    }

    public final boolean write(HatchVmTypeSwitchCheckpoint hatchVmTypeSwitchCheckpoint) {
        C7384Etj.A0Y(hatchVmTypeSwitchCheckpoint, 0);
        try {
            BzK bzKA9q = this.prefs.A9q();
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = HatchVmTypeSwitchCheckpoint.$childSerializers;
            bzKA9q.AYr(KEY_CHECKPOINT, c9sU.A02(hatchVmTypeSwitchCheckpoint, HatchVmTypeSwitchCheckpoint$$serializer.INSTANCE));
            return bzKA9q.commit();
        } catch (Exception e) {
            CFK.A0A(TAG, "Failed to persist VM switch checkpoint", e);
            return false;
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final boolean commit(Function0<Boolean> function0) {
        try {
            return AnonymousClass003.A1Y(function0);
        } catch (Exception e) {
            CFK.A0A(TAG, "Failed to persist VM switch checkpoint", e);
            return false;
        }
    }

    public final boolean isPending() {
        return AnonymousClass002.A1X(read());
    }
}
