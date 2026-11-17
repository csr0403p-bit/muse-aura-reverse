package com.facebook.aura.nodes.core;

import X.AnonymousClass002;
import X.C7384Etj;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public abstract class NodeCommandAvailabilityKt {
    public static final boolean isAvailable(NodeCommandAvailability nodeCommandAvailability, boolean z) {
        C7384Etj.A0Y(nodeCommandAvailability, 0);
        int iOrdinal = nodeCommandAvailability.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return z;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeCommandAvailability.values().length];
            try {
                AnonymousClass002.A13(NodeCommandAvailability.ALWAYS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NodeCommandAvailability.DEFAULT_ASSISTANT_ONLY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NodeCommandAvailability.NON_DEFAULT_ASSISTANT_ONLY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
