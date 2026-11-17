package com.facebook.aura.inappnotification.api;

import X.A3q;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.Ey9;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class InAppNotification {
    public static final InAppNotification INSTANCE = new InAppNotification();
    public static final C3Em<NotificationArgs> _notifications;
    public static final C22I<NotificationArgs> notifications;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Duration {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Duration[] $VALUES;
        public static final Duration CUSTOMIZED;
        public static final Duration LONG;
        public static final Duration SHORT;

        static {
            Duration duration = new Duration("SHORT", 0);
            SHORT = duration;
            Duration duration2 = new Duration("LONG", 1);
            LONG = duration2;
            Duration duration3 = new Duration("CUSTOMIZED", 2);
            CUSTOMIZED = duration3;
            Duration[] durationArr = {duration, duration2, duration3};
            $VALUES = durationArr;
            $ENTRIES = C3cG.A0w(durationArr);
        }

        public static Ey9<Duration> getEntries() {
            return $ENTRIES;
        }

        public static Duration valueOf(String str) {
            return (Duration) Enum.valueOf(Duration.class, str);
        }

        public static Duration[] values() {
            return (Duration[]) $VALUES.clone();
        }

        public Duration(String str, int i) {
        }
    }

    public interface Icon {

        public final class Resource extends C06G implements Icon {
            public final int resId;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Resource) && this.resId == ((Resource) obj).resId);
            }

            public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = resource.resId;
                }
                return new Resource(i);
            }

            public final int component1() {
                return this.resId;
            }

            public final Resource copy(int i) {
                return new Resource(i);
            }

            public final int getResId() {
                return this.resId;
            }

            public int hashCode() {
                return this.resId;
            }

            public Resource(int i) {
                this.resId = i;
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Url extends C06G implements Icon {
            public final String url;

            public Url(String str) {
                C7384Etj.A0Y(str, 0);
                this.url = str;
            }

            public final Url copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Url(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Url) && C7384Etj.areEqual(this.url, ((Url) obj).url));
            }

            public static /* synthetic */ Url copy$default(Url url, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = url.url;
                }
                C7384Etj.A0Y(str, 0);
                return new Url(str);
            }

            public final String component1() {
                return this.url;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final class NotificationArgs extends C06G {
        public final Long customizedDurationMillis;
        public final Duration duration;
        public final Icon icon;
        public final G0U<AuraNavigator, Unit> onClick;
        public final String subtitle;
        public final Set<AuraNavKey> suppressionKeys;
        public final String title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof NotificationArgs) {
                    NotificationArgs notificationArgs = (NotificationArgs) obj;
                    if (!C7384Etj.areEqual(this.title, notificationArgs.title) || !C7384Etj.areEqual(this.subtitle, notificationArgs.subtitle) || !C7384Etj.areEqual(this.icon, notificationArgs.icon) || this.duration != notificationArgs.duration || !C7384Etj.areEqual(this.customizedDurationMillis, notificationArgs.customizedDurationMillis) || !C7384Etj.areEqual(this.suppressionKeys, notificationArgs.suppressionKeys) || !C7384Etj.areEqual(this.onClick, notificationArgs.onClick)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NotificationArgs copy$default(NotificationArgs notificationArgs, String str, String str2, Icon icon, Duration duration, Long l, Set set, G0U g0u, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notificationArgs.title;
            }
            if ((i & 2) != 0) {
                str2 = notificationArgs.subtitle;
            }
            if ((i & 4) != 0) {
                icon = notificationArgs.icon;
            }
            if ((i & 8) != 0) {
                duration = notificationArgs.duration;
            }
            if ((i & 16) != 0) {
                l = notificationArgs.customizedDurationMillis;
            }
            if ((i & 32) != 0) {
                set = notificationArgs.suppressionKeys;
            }
            if ((i & 64) != 0) {
                g0u = notificationArgs.onClick;
            }
            return notificationArgs.copy(str, str2, icon, duration, l, set, g0u);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final Icon component3() {
            return this.icon;
        }

        public final Duration component4() {
            return this.duration;
        }

        public final Long component5() {
            return this.customizedDurationMillis;
        }

        public final Set<AuraNavKey> component6() {
            return this.suppressionKeys;
        }

        public final G0U<AuraNavigator, Unit> component7() {
            return this.onClick;
        }

        public final Long getCustomizedDurationMillis() {
            return this.customizedDurationMillis;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final G0U<AuraNavigator, Unit> getOnClick() {
            return this.onClick;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Set<AuraNavKey> getSuppressionKeys() {
            return this.suppressionKeys;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.suppressionKeys, (AnonymousClass005.A0F(this.duration, (((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0D(this.icon)) * 31) + AnonymousClass006.A0D(this.customizedDurationMillis)) * 31) + C06G.A04(this.onClick);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationArgs(String str, String str2, Icon icon, Duration duration, Long l, Set<? extends AuraNavKey> set, G0U<? super AuraNavigator, Unit> g0u) {
            AnonymousClass003.A0w(str, duration);
            C7384Etj.A0Y(set, 5);
            this.title = str;
            this.subtitle = str2;
            this.icon = icon;
            this.duration = duration;
            this.customizedDurationMillis = l;
            this.suppressionKeys = set;
            this.onClick = g0u;
        }

        public final NotificationArgs copy(String str, String str2, Icon icon, Duration duration, Long l, Set<? extends AuraNavKey> set, G0U<? super AuraNavigator, Unit> g0u) {
            AnonymousClass003.A0w(str, duration);
            C7384Etj.A0Y(set, 5);
            return new NotificationArgs(str, str2, icon, duration, l, set, g0u);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ NotificationArgs(String str, String str2, Icon icon, Duration duration, Long l, Set set, G0U g0u, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? Duration.SHORT : duration, (i & 16) != 0 ? null : l, (i & 32) != 0 ? A3q.A00 : set, (i & 64) != 0 ? null : g0u);
        }
    }

    public final void show(NotificationArgs notificationArgs) {
        C7384Etj.A0Y(notificationArgs, 0);
        _notifications.AhV(notificationArgs);
    }

    static {
        C9290GCr c9290GCr = new C9290GCr(C79.A01, 0, 10);
        _notifications = c9290GCr;
        notifications = c9290GCr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(InAppNotification inAppNotification, String str, String str2, String str3, Integer num, Duration duration, Long l, Set set, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            duration = Duration.SHORT;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            set = A3q.A00;
        }
        if ((i & 128) != 0) {
            g0u = null;
        }
        inAppNotification.show(str, str2, str3, num, duration, l, set, g0u);
    }

    public final C22I<NotificationArgs> getNotifications() {
        return notifications;
    }

    public final void show(String str, String str2, String str3, Integer num, Duration duration, Long l, Set<? extends AuraNavKey> set, G0U<? super AuraNavigator, Unit> g0u) {
        Icon icon;
        Icon resource;
        AnonymousClass002.A1C(str, 0, duration);
        C7384Etj.A0Y(set, 6);
        if (str3 != null) {
            resource = new Icon.Url(str3);
        } else if (num != null) {
            resource = new Icon.Resource(num.intValue());
        } else {
            icon = null;
            _notifications.AhV(new NotificationArgs(str, str2, icon, duration, l, set, g0u));
        }
        icon = resource;
        _notifications.AhV(new NotificationArgs(str, str2, icon, duration, l, set, g0u));
    }
}
