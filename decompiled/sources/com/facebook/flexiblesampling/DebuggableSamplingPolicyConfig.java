package com.facebook.flexiblesampling;

import X.CEp;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class DebuggableSamplingPolicyConfig extends BaseSamplingPolicyConfig {
    public static final int NO_PREVIOUS_VALUE = -1;

    public abstract int add(String str, int i);

    public abstract void blacklist(String str);

    public abstract void clear();

    public abstract List<CEp> getEventList();

    public abstract boolean remove(String str);
}
