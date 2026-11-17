package com.facebook.aura.nodes.transport;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C8j2;

/* loaded from: classes3.dex */
public interface NodeConnectionState {

    public final class Connected extends C06G implements NodeConnectionState {
        public final long generation;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Connected) && this.generation == ((Connected) obj).generation);
        }

        public static /* synthetic */ Connected copy$default(Connected connected, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = connected.generation;
            }
            return new Connected(j);
        }

        public final long component1() {
            return this.generation;
        }

        public final Connected copy(long j) {
            return new Connected(j);
        }

        public final long getGeneration() {
            return this.generation;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.generation);
        }

        public Connected(long j) {
            this.generation = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Disconnected implements NodeConnectionState {
        public static final Disconnected INSTANCE = new Disconnected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disconnected);
        }

        public String toString() {
            return C8j2.A00(53);
        }

        public int hashCode() {
            return -1270463766;
        }
    }

    public final class Error extends C06G implements NodeConnectionState {
        public final String message;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return new Error(str);
        }

        public final String component1() {
            return this.message;
        }

        public final Error copy(String str) {
            return new Error(str);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.message);
        }

        public Error(String str) {
            this.message = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Idle implements NodeConnectionState {
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -110562429;
        }
    }
}
