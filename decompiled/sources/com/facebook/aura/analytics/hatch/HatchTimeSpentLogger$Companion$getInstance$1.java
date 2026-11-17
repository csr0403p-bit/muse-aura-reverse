package com.facebook.aura.analytics.hatch;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTimeSpentLogger$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchTimeSpentLogger> {
    public static final HatchTimeSpentLogger$Companion$getInstance$1 INSTANCE = new HatchTimeSpentLogger$Companion$getInstance$1();

    public HatchTimeSpentLogger$Companion$getInstance$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchTimeSpentLogger invoke() {
        return new HatchTimeSpentLogger();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ HatchTimeSpentLogger invoke() {
        return new HatchTimeSpentLogger();
    }
}
