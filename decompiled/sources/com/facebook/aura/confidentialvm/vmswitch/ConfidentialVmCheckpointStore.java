package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BzK;
import X.C06H;
import X.C4oT;
import X.C9hr;
import X.CFK;
import X.FGI;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.json.HatchJsonKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmCheckpointStore<T> {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "ConfidentialVmCheckpointStore";
    public final String key;
    public final C4oT prefs;
    public final C9hr<T> serializer;

    public final boolean clear() {
        try {
            BzK bzKA9q = this.prefs.A9q();
            bzKA9q.Aae(this.key);
            return bzKA9q.commit();
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Failed to persist checkpoint ", this.key), e);
            return false;
        }
    }

    public final T read() {
        T t = null;
        String string = this.prefs.getString(this.key, null);
        if (string == null) {
            return null;
        }
        try {
            t = (T) HatchJsonKt.HatchJson.A00(string, this.serializer);
            return t;
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Unreadable checkpoint ", this.key), e);
            return t;
        }
    }

    public final boolean write(T t) {
        try {
            BzK bzKA9q = this.prefs.A9q();
            bzKA9q.AYr(this.key, HatchJsonKt.HatchJson.A02(t, this.serializer));
            return bzKA9q.commit();
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Failed to persist checkpoint ", this.key), e);
            return false;
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmCheckpointStore(String str, String str2, C9hr<T> c9hr) {
        AnonymousClass005.A0x(str, str2, c9hr);
        this.key = str2;
        this.serializer = c9hr;
        this.prefs = AuraUserPrefs.INSTANCE.get(str, AuraUserPrefStore.CONFIDENTIAL_VM_SWITCH);
    }

    private final boolean commit(Function0<Boolean> function0) {
        try {
            return AnonymousClass003.A1Y(function0);
        } catch (Exception e) {
            CFK.A0A(TAG, FGI.A0M("Failed to persist checkpoint ", this.key), e);
            return false;
        }
    }
}
