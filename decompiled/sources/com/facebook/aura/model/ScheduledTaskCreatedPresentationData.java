package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ScheduledTaskCreatedPresentationData extends C06G implements HatchPresentationData {
    public final ScheduledTaskCreatedPresentation task;
    public static final Companion Companion = new Companion();
    public static final int $stable = ScheduledTaskCreatedPresentation.$stable;

    public final class Companion {
        public final C9hr<ScheduledTaskCreatedPresentationData> serializer() {
            return ScheduledTaskCreatedPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ScheduledTaskCreatedPresentationData copy(ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation) {
        C7384Etj.A0Y(scheduledTaskCreatedPresentation, 0);
        return new ScheduledTaskCreatedPresentationData(scheduledTaskCreatedPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ScheduledTaskCreatedPresentationData) && C7384Etj.areEqual(this.task, ((ScheduledTaskCreatedPresentationData) obj).task));
    }

    public /* synthetic */ ScheduledTaskCreatedPresentationData(int i, ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ScheduledTaskCreatedPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.task = scheduledTaskCreatedPresentation;
    }

    public static /* synthetic */ ScheduledTaskCreatedPresentationData copy$default(ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData, ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            scheduledTaskCreatedPresentation = scheduledTaskCreatedPresentationData.task;
        }
        C7384Etj.A0Y(scheduledTaskCreatedPresentation, 0);
        return new ScheduledTaskCreatedPresentationData(scheduledTaskCreatedPresentation);
    }

    public final ScheduledTaskCreatedPresentation component1() {
        return this.task;
    }

    public final ScheduledTaskCreatedPresentation getTask() {
        return this.task;
    }

    public int hashCode() {
        return this.task.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ScheduledTaskCreatedPresentationData(ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation) {
        C7384Etj.A0Y(scheduledTaskCreatedPresentation, 0);
        this.task = scheduledTaskCreatedPresentation;
    }
}
