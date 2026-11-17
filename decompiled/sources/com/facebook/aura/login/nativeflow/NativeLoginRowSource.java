package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class NativeLoginRowSource extends C06G {
    public static final int $stable = 8;
    public final boolean isSavedOnDevice;
    public final List<HatchSsoSourceApp> sourceApps;

    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginRowSource(List<? extends HatchSsoSourceApp> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.sourceApps = list;
        this.isSavedOnDevice = z;
    }

    public final NativeLoginRowSource copy(List<? extends HatchSsoSourceApp> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new NativeLoginRowSource(list, z);
    }

    public static /* synthetic */ NativeLoginRowSource copy$default(NativeLoginRowSource nativeLoginRowSource, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nativeLoginRowSource.sourceApps;
        }
        if ((i & 2) != 0) {
            z = nativeLoginRowSource.isSavedOnDevice;
        }
        C7384Etj.A0Y(list, 0);
        return new NativeLoginRowSource(list, z);
    }

    public final List<HatchSsoSourceApp> component1() {
        return this.sourceApps;
    }

    public final boolean component2() {
        return this.isSavedOnDevice;
    }

    public final NativeLoginRlSource getRlSource() {
        if (this.isSavedOnDevice) {
            return NativeLoginRlSource.MUSE;
        }
        if (this.sourceApps.contains(HatchSsoSourceApp.META)) {
            return NativeLoginRlSource.C50;
        }
        return null;
    }

    public final List<HatchSsoSourceApp> getSourceApps() {
        return this.sourceApps;
    }

    public final boolean isSavedOnDevice() {
        return this.isSavedOnDevice;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginRowSource(List list, boolean z, int i, C06H c06h) {
        this(list, AnonymousClass001.A1Q(i, z));
    }
}
