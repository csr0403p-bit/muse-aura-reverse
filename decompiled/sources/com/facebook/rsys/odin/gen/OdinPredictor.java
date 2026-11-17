package com.facebook.rsys.odin.gen;

import X.F60;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class OdinPredictor {
    public abstract boolean isModelWarm(String str);

    public abstract PredictionResult predict(String str, Map<Integer, Float> map);

    public abstract PredictionResult predictWithTensors(String str, long j, ArrayList<Long> arrayList, long j2, long j3);

    public abstract void warmup(String str);

    public OdinPredictor() {
        throw F60.createAndThrow();
    }
}
