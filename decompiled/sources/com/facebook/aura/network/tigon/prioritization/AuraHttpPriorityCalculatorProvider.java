package com.facebook.aura.network.tigon.prioritization;

import X.C06H;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.requestprioritization.calculatorprovider.HttpPriorityCalculatorProvider;

/* loaded from: classes5.dex */
public final class AuraHttpPriorityCalculatorProvider extends HttpPriorityCalculatorProvider {
    public static final Companion Companion = new Companion();

    public static final native HybridData initHybrid();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final HybridData initHybrid() {
            return AuraHttpPriorityCalculatorProvider.initHybrid();
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("aurahttpprioritization");
    }

    public AuraHttpPriorityCalculatorProvider() {
        this.mHybridData = initHybrid();
    }
}
