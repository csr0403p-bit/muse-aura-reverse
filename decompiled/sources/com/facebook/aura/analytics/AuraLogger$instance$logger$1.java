package com.facebook.aura.analytics;

import X.AbstractC3136BzG;
import X.AbstractC7559F3s;
import X.BV4;
import X.C3350CFz;
import android.os.Trace;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraLogger$instance$logger$1 extends AbstractC7559F3s implements Function0<AuraLoggerHolder> {
    public static final AuraLogger$instance$logger$1 INSTANCE = new AuraLogger$instance$logger$1();

    public AuraLogger$instance$logger$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraLoggerHolder invoke() {
        AbstractC3136BzG.A00("AuraLogger");
        try {
            C3350CFz c3350CFz = new C3350CFz(BV4.A0C());
            Trace.endSection();
            return new AuraLoggerHolder(c3350CFz);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
