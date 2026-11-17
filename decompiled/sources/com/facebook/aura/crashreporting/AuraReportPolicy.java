package com.facebook.aura.crashreporting;

import X.C3237C4u;

/* loaded from: classes5.dex */
public final class AuraReportPolicy extends C3237C4u {
    @Override // X.C3237C4u
    public int backgroundJavaSamplingRate() {
        return 1;
    }

    @Override // X.C3237C4u
    public boolean reportBackgroundJava() {
        return true;
    }
}
