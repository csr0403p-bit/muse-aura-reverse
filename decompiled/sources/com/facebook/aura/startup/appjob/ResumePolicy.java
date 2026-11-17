package com.facebook.aura.startup.appjob;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;

/* loaded from: classes3.dex */
public interface ResumePolicy {

    public final class EveryResume implements ResumePolicy {
        public static final EveryResume INSTANCE = new EveryResume();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EveryResume);
        }

        public String toString() {
            return "EveryResume";
        }

        public int hashCode() {
            return 1381406634;
        }
    }

    public final class OncePerProcess implements ResumePolicy {
        public static final OncePerProcess INSTANCE = new OncePerProcess();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OncePerProcess);
        }

        public String toString() {
            return "OncePerProcess";
        }

        public int hashCode() {
            return 1907437617;
        }
    }

    public final class Periodic extends C06G implements ResumePolicy {
        public final long intervalMinutes;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Periodic) && this.intervalMinutes == ((Periodic) obj).intervalMinutes);
        }

        public /* synthetic */ Periodic(long j, int i, C06H c06h) {
            this((i & 1) != 0 ? 15L : j);
        }

        public static /* synthetic */ Periodic copy$default(Periodic periodic, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = periodic.intervalMinutes;
            }
            return new Periodic(j);
        }

        public final long component1() {
            return this.intervalMinutes;
        }

        public final Periodic copy(long j) {
            return new Periodic(j);
        }

        public final long getIntervalMinutes() {
            return this.intervalMinutes;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.intervalMinutes);
        }

        public String toString() {
            return super.toString();
        }

        public Periodic(long j) {
            this.intervalMinutes = j;
        }

        public Periodic() {
            this(15L);
        }
    }
}
