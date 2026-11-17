package com.google.firebase.components;

import X.C3565CUi;
import X.FGI;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public class DependencyCycleException extends DependencyException {
    public final List<C3565CUi<?>> componentsInCycle;

    public DependencyCycleException(List<C3565CUi<?>> list) {
        super(FGI.A0M("Dependency cycle detected: ", Arrays.toString(list.toArray())));
        this.componentsInCycle = list;
    }
}
