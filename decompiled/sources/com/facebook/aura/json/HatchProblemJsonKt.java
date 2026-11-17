package com.facebook.aura.json;

import X.C7BY;

/* loaded from: classes2.dex */
public abstract class HatchProblemJsonKt {
    public static final HatchProblemJson hatchProblemOf(String str) {
        if (str != null && !C7BY.A0j(str)) {
            try {
                return (HatchProblemJson) HatchJsonKt.HatchJson.A00(str, HatchProblemJson$$serializer.INSTANCE);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
