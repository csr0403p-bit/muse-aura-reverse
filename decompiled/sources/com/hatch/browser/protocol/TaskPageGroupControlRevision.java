package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.C06H;
import X.C60O;
import X.HwO;

/* loaded from: classes6.dex */
public final class TaskPageGroupControlRevision {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long value;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TaskPageGroupControlRevision) && this.value == ((TaskPageGroupControlRevision) obj).value);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-VKZWuLQ$default, reason: not valid java name */
    public static /* synthetic */ TaskPageGroupControlRevision m3780copyVKZWuLQ$default(TaskPageGroupControlRevision taskPageGroupControlRevision, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = taskPageGroupControlRevision.value;
        }
        return new TaskPageGroupControlRevision(j);
    }

    /* renamed from: component1-s-VKNKU, reason: not valid java name */
    public final long m3781component1sVKNKU() {
        return this.value;
    }

    /* renamed from: copy-VKZWuLQ, reason: not valid java name */
    public final TaskPageGroupControlRevision m3782copyVKZWuLQ(long j) {
        return new TaskPageGroupControlRevision(j);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m3783getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass002.A0A(this.value);
    }

    /* renamed from: setValue-VKZWuLQ, reason: not valid java name */
    public final void m3784setValueVKZWuLQ(long j) {
        this.value = j;
    }

    public String toString() {
        return C60O.A0r("TaskPageGroupControlRevision(value=", HwO.A00(this.value));
    }

    public TaskPageGroupControlRevision(long j) {
        this.value = j;
    }

    public /* synthetic */ TaskPageGroupControlRevision(long j, C06H c06h) {
        this(j);
    }
}
