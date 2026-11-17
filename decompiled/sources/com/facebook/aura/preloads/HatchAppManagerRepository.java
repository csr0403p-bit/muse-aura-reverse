package com.facebook.aura.preloads;

import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import android.content.Context;

/* loaded from: classes3.dex */
public final class HatchAppManagerRepository {
    public static final HatchAppManagerRepository INSTANCE = new HatchAppManagerRepository();
    public static final C1BN<Boolean> isManagedByAppManager;
    public static final BLG<Boolean> mutableIsManagedByAppManager;

    public final void refreshManagedState(Context context) {
        C7384Etj.A0Y(context, 0);
        BLG<Boolean> blg = mutableIsManagedByAppManager;
        if (blg.getValue() == null) {
            blg.Af8(resolveManagedState(AnonymousClass001.A0I(context)));
        }
    }

    static {
        C9286GCn c9286GCnA13 = C3cG.A13();
        mutableIsManagedByAppManager = c9286GCnA13;
        isManagedByAppManager = C3cG.A11(c9286GCnA13);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean resolveManagedState(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.preloads.HatchAppManagerRepository.resolveManagedState(android.content.Context):java.lang.Boolean");
    }

    public final C1BN<Boolean> isManagedByAppManager() {
        return isManagedByAppManager;
    }
}
