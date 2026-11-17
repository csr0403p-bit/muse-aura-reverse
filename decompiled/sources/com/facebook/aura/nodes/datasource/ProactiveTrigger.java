package com.facebook.aura.nodes.datasource;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public interface ProactiveTrigger {

    public final class BroadcastReceiver extends C06G implements ProactiveTrigger {
        public final List<String> actions;

        public BroadcastReceiver(List<String> list) {
            C7384Etj.A0Y(list, 0);
            this.actions = list;
        }

        public final BroadcastReceiver copy(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return new BroadcastReceiver(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BroadcastReceiver) && C7384Etj.areEqual(this.actions, ((BroadcastReceiver) obj).actions));
        }

        public static /* synthetic */ BroadcastReceiver copy$default(BroadcastReceiver broadcastReceiver, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = broadcastReceiver.actions;
            }
            C7384Etj.A0Y(list, 0);
            return new BroadcastReceiver(list);
        }

        public final List<String> component1() {
            return this.actions;
        }

        public final List<String> getActions() {
            return this.actions;
        }

        public int hashCode() {
            return this.actions.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CallerDriven extends C06G implements ProactiveTrigger {
        public final String description;

        public CallerDriven(String str) {
            C7384Etj.A0Y(str, 0);
            this.description = str;
        }

        public final CallerDriven copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new CallerDriven(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CallerDriven) && C7384Etj.areEqual(this.description, ((CallerDriven) obj).description));
        }

        public static /* synthetic */ CallerDriven copy$default(CallerDriven callerDriven, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callerDriven.description;
            }
            C7384Etj.A0Y(str, 0);
            return new CallerDriven(str);
        }

        public final String component1() {
            return this.description;
        }

        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ContentObserver extends C06G implements ProactiveTrigger {
        public static final Companion Companion = new Companion();
        public static final long DEFAULT_DEBOUNCE_MS = 2000;
        public final long debounceMs;
        public final boolean notifyForDescendants;
        public final Uri uri;

        public ContentObserver(Uri uri, boolean z, long j) {
            C7384Etj.A0Y(uri, 0);
            this.uri = uri;
            this.notifyForDescendants = z;
            this.debounceMs = j;
        }

        public final ContentObserver copy(Uri uri, boolean z, long j) {
            C7384Etj.A0Y(uri, 0);
            return new ContentObserver(uri, z, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ContentObserver) {
                    ContentObserver contentObserver = (ContentObserver) obj;
                    if (!C7384Etj.areEqual(this.uri, contentObserver.uri) || this.notifyForDescendants != contentObserver.notifyForDescendants || this.debounceMs != contentObserver.debounceMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ContentObserver copy$default(ContentObserver contentObserver, Uri uri, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = contentObserver.uri;
            }
            if ((i & 2) != 0) {
                z = contentObserver.notifyForDescendants;
            }
            if ((i & 4) != 0) {
                j = contentObserver.debounceMs;
            }
            return contentObserver.copy(uri, z, j);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final boolean component2() {
            return this.notifyForDescendants;
        }

        public final long component3() {
            return this.debounceMs;
        }

        public final long getDebounceMs() {
            return this.debounceMs;
        }

        public final boolean getNotifyForDescendants() {
            return this.notifyForDescendants;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.debounceMs, C0KA.A01(AnonymousClass005.A0E(this.uri), this.notifyForDescendants));
        }

        public final class Companion {
            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ContentObserver(Uri uri, boolean z, long j, int i, C06H c06h) {
            this(uri, (i & 2) != 0 ? true : z, (i & 4) != 0 ? 2000L : j);
        }
    }

    public final class None implements ProactiveTrigger {
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return -1761894907;
        }
    }

    public final class NotificationListener implements ProactiveTrigger {
        public static final NotificationListener INSTANCE = new NotificationListener();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationListener);
        }

        public String toString() {
            return "NotificationListener";
        }

        public int hashCode() {
            return -2138158196;
        }
    }

    public final class Periodic extends C06G implements ProactiveTrigger {
        public final long intervalMs;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Periodic) && this.intervalMs == ((Periodic) obj).intervalMs);
        }

        public static /* synthetic */ Periodic copy$default(Periodic periodic, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = periodic.intervalMs;
            }
            return new Periodic(j);
        }

        public final long component1() {
            return this.intervalMs;
        }

        public final Periodic copy(long j) {
            return new Periodic(j);
        }

        public final long getIntervalMs() {
            return this.intervalMs;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.intervalMs);
        }

        public Periodic(long j) {
            this.intervalMs = j;
        }

        public String toString() {
            return super.toString();
        }
    }
}
